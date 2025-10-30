package com.example.androidproject.ui.main.posts

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import kotlin.String
import kotlin.jvm.JvmStatic

public data class CreatePostFragmentArgs(
  public val existingPost: String? = null,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("existingPost", this.existingPost)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("existingPost", this.existingPost)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): CreatePostFragmentArgs {
      bundle.setClassLoader(CreatePostFragmentArgs::class.java.classLoader)
      val __existingPost : String?
      if (bundle.containsKey("existingPost")) {
        __existingPost = bundle.getString("existingPost")
      } else {
        __existingPost = null
      }
      return CreatePostFragmentArgs(__existingPost)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CreatePostFragmentArgs {
      val __existingPost : String?
      if (savedStateHandle.contains("existingPost")) {
        __existingPost = savedStateHandle["existingPost"]
      } else {
        __existingPost = null
      }
      return CreatePostFragmentArgs(__existingPost)
    }
  }
}
