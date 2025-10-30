package com.example.androidproject.viewmodels

import android.net.Uri
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import com.example.androidproject.database.common.CurrentUserRepository
import com.example.androidproject.database.common.LibraryPostRepository
import com.example.androidproject.database.common.UserRepository
import com.example.androidproject.dto.EditProfileData
import com.example.androidproject.helpers.LoadingState
import com.example.androidproject.models.LibraryPost
import com.example.androidproject.models.OtherUser
import com.example.androidproject.ui.utils.FavoritePostsDataMediator
import com.example.androidproject.ui.utils.LibraryData
import com.example.androidproject.ui.utils.MyPostsDataMediator
import com.example.androidproject.ui.utils.PostsLibraryDataMediator
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val currentUserRepository: CurrentUserRepository,
    private val libraryRepository: LibraryPostRepository,
    private val usersRepository: UserRepository,
) : ViewModel() {

    private var _exceptions = MutableLiveData<Exception>()
    private var _loadingState = MutableLiveData<LoadingState>(LoadingState.Loaded)

    val exceptions: LiveData<Exception> get() = _exceptions
    val loadingState: LiveData<LoadingState> get() = _loadingState

    // Data sources
    val currentUser = currentUserRepository.currentUser
    private val allPosts = libraryRepository.listenAllPosts()
    private val allUsers = usersRepository.listenAllUsers()


    // Library data Mediator
    private val _libraryData by PostsLibraryDataMediator(
        allPosts.get(),
        allUsers.get(),
        currentUser
    )
    val libraryData: LiveData<LibraryData> get() = _libraryData

    // Favorites Data
    private val _favoritesData by FavoritePostsDataMediator(
        allPosts.get(),
        allUsers.get(),
        currentUser
    )
    val favoritesData: LiveData<LibraryData> get() = _favoritesData


    // Current user post's Data
    private val _myPostsData by MyPostsDataMediator(
        allPosts.get(),
        allUsers.get(),
        currentUser
    )
    val myPostsData: LiveData<LibraryData> get() = _myPostsData


    init {
        currentUserRepository.startListening()
    }

    override fun onCleared() {
        super.onCleared()
        currentUserRepository.stopListening()
        allPosts.stopListening()
        allUsers.stopListening()
    }




    fun createPost(
        post: LibraryPost,
        imageUri: Uri? = null,
        positiveCallback: () -> Unit,
        negativeCallback: () -> Unit,
    ) {
        _loadingState.postValue(LoadingState.Loading)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                libraryRepository.createPost(post, imageUri)
                withContext(Dispatchers.Main) {
                    positiveCallback()
                }
            } catch (e: Exception) {
                _exceptions.postValue(e)
                withContext(Dispatchers.Main) {
                    negativeCallback()
                }
            } finally {
                _loadingState.postValue(LoadingState.Loaded)
            }
        }
    }

    fun toggleLike(post: LibraryPost) {
        val cUser = currentUser.value ?: return
        if (cUser.favoritePosts.contains(post.id))
            cUser.favoritePosts.remove(post.id)
        else
            cUser.favoritePosts.add(post.id)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                currentUserRepository.updateUser(cUser)
            } catch (e: Exception) {
                _exceptions.postValue(e)
            }
        }
    }

    fun updateUser(
        profileData: EditProfileData,
        image: Uri? = null,
        updateComplete: (() -> Unit)? = null,
    ) {
        val currentUser = currentUser.value ?: return
        var changed = image != null
        profileData.newName?.let {
            currentUser.fullName = it
            changed = true
        }
        profileData.newYearsExperience?.let {
            currentUser.yearsOfExperience = it
            changed = true
        }
        _loadingState.postValue(LoadingState.Loading)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                Log.d("updateUser", "New data: $profileData")
                if (changed) { // only if something really changed..
                    currentUserRepository.updateUser(currentUser, image)
                    Log.d("updateUser", "data has changed, and updated")
                } else
                    Log.d("updateUser", "data has not changed")
                withContext(Dispatchers.Main) {
                    updateComplete?.invoke()
                }
            } catch (e: Exception) {
                _exceptions.postValue(e)
            } finally {
                _loadingState.postValue(LoadingState.Loaded)
            }
        }
    }

    fun updatePost(
        post: LibraryPost,
        imageUri: Uri? = null,
        positiveCallback: () -> Unit,
        negativeCallback: () -> Unit,
    ) {
        _loadingState.postValue(LoadingState.Loading)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                libraryRepository.updatePost(post, imageUri)
                withContext(Dispatchers.Main) {
                    positiveCallback()
                }
            } catch (e: Exception) {
                _exceptions.postValue(e)
                withContext(Dispatchers.Main) {
                    negativeCallback()
                }
            } finally {
                _loadingState.postValue(LoadingState.Loaded)
            }
        }
    }

    fun deletePost(post: LibraryPost) {
        _loadingState.postValue(LoadingState.Loading)
        viewModelScope.launch(Dispatchers.IO) {
            try {
                libraryRepository.deletePost(post)
            } catch (e: Exception) {
                _exceptions.postValue(e)
            } finally {
                _loadingState.postValue(LoadingState.Loaded)
            }
        }
    }

    fun signOut() {
        currentUserRepository.signOut()
    }


}