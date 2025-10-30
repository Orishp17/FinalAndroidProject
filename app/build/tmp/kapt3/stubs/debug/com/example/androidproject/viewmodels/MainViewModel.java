package com.example.androidproject.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ6\u00103\u001a\u0002042\u0006\u00105\u001a\u00020!2\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\f\u00108\u001a\b\u0012\u0004\u0012\u000204092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020409J\u000e\u0010;\u001a\u0002042\u0006\u00105\u001a\u00020!J\b\u0010<\u001a\u000204H\u0014J\u0006\u0010=\u001a\u000204J\u000e\u0010>\u001a\u0002042\u0006\u00105\u001a\u00020!J6\u0010?\u001a\u0002042\u0006\u00105\u001a\u00020!2\n\b\u0002\u00106\u001a\u0004\u0018\u0001072\f\u00108\u001a\b\u0012\u0004\u0012\u000204092\f\u0010:\u001a\b\u0012\u0004\u0012\u00020409J,\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020B2\n\b\u0002\u0010C\u001a\u0004\u0018\u0001072\u0010\b\u0002\u0010D\u001a\n\u0012\u0004\u0012\u000204\u0018\u000109R\u0018\u0010\t\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u0011R\u001c\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010 0\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010)\u001a\f\u0012\b\u0012\u00060\u000bj\u0002`\f0%8F\u00a2\u0006\u0006\u001a\u0004\b*\u0010(R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0%8F\u00a2\u0006\u0006\u001a\u0004\b,\u0010(R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0%8F\u00a2\u0006\u0006\u001a\u0004\b.\u0010(R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00190%8F\u00a2\u0006\u0006\u001a\u0004\b0\u0010(R\u0017\u00101\u001a\b\u0012\u0004\u0012\u00020\u000f0%8F\u00a2\u0006\u0006\u001a\u0004\b2\u0010(R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006E"}, d2 = {"Lcom/example/androidproject/viewmodels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "currentUserRepository", "Lcom/example/androidproject/database/common/CurrentUserRepository;", "libraryRepository", "Lcom/example/androidproject/database/common/LibraryPostRepository;", "usersRepository", "Lcom/example/androidproject/database/common/UserRepository;", "(Lcom/example/androidproject/database/common/CurrentUserRepository;Lcom/example/androidproject/database/common/LibraryPostRepository;Lcom/example/androidproject/database/common/UserRepository;)V", "_exceptions", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_favoritesData", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/androidproject/ui/utils/LibraryData;", "get_favoritesData", "()Landroidx/lifecycle/MediatorLiveData;", "_favoritesData$delegate", "Lcom/example/androidproject/ui/utils/FavoritePostsDataMediator;", "_libraryData", "get_libraryData", "_libraryData$delegate", "Lcom/example/androidproject/ui/utils/PostsLibraryDataMediator;", "_loadingState", "Lcom/example/androidproject/helpers/LoadingState;", "_myPostsData", "get_myPostsData", "_myPostsData$delegate", "Lcom/example/androidproject/ui/utils/MyPostsDataMediator;", "allPosts", "Lcom/example/androidproject/helpers/DocumentListener;", "", "Lcom/example/androidproject/models/LibraryPost;", "allUsers", "Lcom/example/androidproject/models/OtherUser;", "currentUser", "Landroidx/lifecycle/LiveData;", "Lcom/example/androidproject/models/User;", "getCurrentUser", "()Landroidx/lifecycle/LiveData;", "exceptions", "getExceptions", "favoritesData", "getFavoritesData", "libraryData", "getLibraryData", "loadingState", "getLoadingState", "myPostsData", "getMyPostsData", "createPost", "", "post", "imageUri", "Landroid/net/Uri;", "positiveCallback", "Lkotlin/Function0;", "negativeCallback", "deletePost", "onCleared", "signOut", "toggleLike", "updatePost", "updateUser", "profileData", "Lcom/example/androidproject/dto/EditProfileData;", "image", "updateComplete", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.common.CurrentUserRepository currentUserRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.common.LibraryPostRepository libraryRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.common.UserRepository usersRepository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Exception> _exceptions;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.androidproject.helpers.LoadingState> _loadingState;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.androidproject.models.User> currentUser = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.helpers.DocumentListener<java.util.List<com.example.androidproject.models.LibraryPost>> allPosts = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.helpers.DocumentListener<java.util.List<com.example.androidproject.models.OtherUser>> allUsers = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.ui.utils.PostsLibraryDataMediator _libraryData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.ui.utils.FavoritePostsDataMediator _favoritesData$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.ui.utils.MyPostsDataMediator _myPostsData$delegate = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.common.CurrentUserRepository currentUserRepository, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.common.LibraryPostRepository libraryRepository, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.common.UserRepository usersRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Exception> getExceptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.androidproject.helpers.LoadingState> getLoadingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.androidproject.models.User> getCurrentUser() {
        return null;
    }
    
    private final androidx.lifecycle.MediatorLiveData<com.example.androidproject.ui.utils.LibraryData> get_libraryData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.androidproject.ui.utils.LibraryData> getLibraryData() {
        return null;
    }
    
    private final androidx.lifecycle.MediatorLiveData<com.example.androidproject.ui.utils.LibraryData> get_favoritesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.androidproject.ui.utils.LibraryData> getFavoritesData() {
        return null;
    }
    
    private final androidx.lifecycle.MediatorLiveData<com.example.androidproject.ui.utils.LibraryData> get_myPostsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.androidproject.ui.utils.LibraryData> getMyPostsData() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void createPost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> positiveCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> negativeCallback) {
    }
    
    public final void toggleLike(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post) {
    }
    
    public final void updateUser(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.dto.EditProfileData profileData, @org.jetbrains.annotations.Nullable()
    android.net.Uri image, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> updateComplete) {
    }
    
    public final void updatePost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> positiveCallback, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> negativeCallback) {
    }
    
    public final void deletePost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post) {
    }
    
    public final void signOut() {
    }
}