package com.example.androidproject.adapters

import android.annotation.SuppressLint
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.androidproject.R
import com.example.androidproject.databinding.LibraryPostItemBinding
import com.example.androidproject.models.LibraryPost
import com.example.androidproject.models.OtherUser
import com.example.androidproject.ui.utils.LibraryDataPopulated

interface LibraryPostListener {
    fun onLike(post: LibraryPost)
    fun onShowMore(post: LibraryPost, owner: OtherUser)
    fun onEdit(post: LibraryPost)
    fun onDelete(post: LibraryPost)
}

class LibraryPostsAdapter(
    private var feedData: LibraryDataPopulated,
    listener: LibraryPostListener,
) : RecyclerView.Adapter<LibraryPostsAdapter.LibraryPostsViewHolder>(),
    LibraryPostListener by listener {

    var userFavorites = HashSet(feedData.currentUser.favoritePosts)
    var usersById = feedData.allUsers.associateBy { it.id }


    @SuppressLint("NotifyDataSetChanged")
    fun setData(libraryData: LibraryDataPopulated) {
        this.feedData = libraryData
        usersById = libraryData.allUsers.associateBy { it.id }
        userFavorites = HashSet(libraryData.currentUser.favoritePosts)
        notifyDataSetChanged()
    }

    inner class LibraryPostsViewHolder(private val binding: LibraryPostItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        @SuppressLint("SetTextI18n")
        fun bind(post: LibraryPost) {
            val isLiked = userFavorites.contains(post.id) // O(1)
            Log.d("BIND Post", feedData.allUsers.size.toString())
            val owner = usersById[post.owner] ?: return
            val isOwnedByCurrentUser = feedData.currentUser.id == owner.id
            binding.tvOwnerName.text = "by ${owner.fullName}"
            binding.tvPostVersion.text = "Version: ${post.version}"
            binding.tvPostTitle.text = post.title
            binding.tvPostLinks.text = "Links: ${post.links.joinToString(",")}"
            binding.tvPostTags.text = "Tags: ${post.tags.joinToString(",")}"
            binding.tvPostContent.text = post.content
            binding.ivFavorite.setImageResource(
                if (isLiked) {
                    R.drawable.start_filled
                } else {
                    R.drawable.star_border
                }
            )
            binding.ivEdit.visibility = if (isOwnedByCurrentUser) {
                binding.ivEdit.setOnClickListener {
                    onEdit(post)
                }
                View.VISIBLE
            } else {
                View.GONE
            }
            binding.ivDelete.visibility = if (isOwnedByCurrentUser) {
                binding.ivDelete.setOnClickListener {
                    onDelete(post)
                }
                View.VISIBLE
            } else {
                View.GONE
            }

            binding.ivFavorite.setOnClickListener {
                onLike(post)
            }

            binding.btnShowMore.setOnClickListener {
                onShowMore(post, owner)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LibraryPostsViewHolder {
        return LibraryPostsViewHolder(
            LibraryPostItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return feedData.allPosts.size // Assume its not null if reached here.
    }

    override fun onBindViewHolder(holder: LibraryPostsViewHolder, position: Int) {
        val post = feedData.allPosts[position]
        holder.bind(post)
    }
}