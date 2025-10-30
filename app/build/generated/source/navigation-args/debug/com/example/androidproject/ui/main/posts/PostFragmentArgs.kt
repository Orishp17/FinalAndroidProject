package com.example.androidproject.ui.main.posts

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.String
import kotlin.jvm.JvmStatic

public data class PostFragmentArgs(
  public val post: String,
  public val owner: String,
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putString("post", this.post)
    result.putString("owner", this.owner)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("post", this.post)
    result.set("owner", this.owner)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): PostFragmentArgs {
      bundle.setClassLoader(PostFragmentArgs::class.java.classLoader)
      val __post : String?
      if (bundle.containsKey("post")) {
        __post = bundle.getString("post")
        if (__post == null) {
          throw IllegalArgumentException("Argument \"post\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"post\" is missing and does not have an android:defaultValue")
      }
      val __owner : String?
      if (bundle.containsKey("owner")) {
        __owner = bundle.getString("owner")
        if (__owner == null) {
          throw IllegalArgumentException("Argument \"owner\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"owner\" is missing and does not have an android:defaultValue")
      }
      return PostFragmentArgs(__post, __owner)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): PostFragmentArgs {
      val __post : String?
      if (savedStateHandle.contains("post")) {
        __post = savedStateHandle["post"]
        if (__post == null) {
          throw IllegalArgumentException("Argument \"post\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"post\" is missing and does not have an android:defaultValue")
      }
      val __owner : String?
      if (savedStateHandle.contains("owner")) {
        __owner = savedStateHandle["owner"]
        if (__owner == null) {
          throw IllegalArgumentException("Argument \"owner\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"owner\" is missing and does not have an android:defaultValue")
      }
      return PostFragmentArgs(__post, __owner)
    }
  }
}
