package com.example.androidproject.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.serialization.Serializable


@Entity(tableName = "current_user")
@Serializable
open class User(
    @PrimaryKey override var id : String = "",
    var email: String = "",
    var fullName: String  = "",
    var image: String = "",
    var yearsOfExperience: Int = 0,
    override var updatedAt: Long = System.currentTimeMillis(),
    // collections
    var posts: MutableList<String> = mutableListOf(),
    var favoritePosts: MutableList<String> = mutableListOf(),
    var ratedPosts: MutableList<String> = mutableListOf()
) : BaseDocument() {
    companion object {
        const val DEFAULT_IMAGE = "https://cdn-icons-png.flaticon.com/128/5148/5148324.png"
    }
}