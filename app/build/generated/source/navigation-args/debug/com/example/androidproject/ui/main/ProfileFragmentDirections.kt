package com.example.androidproject.ui.main

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.androidproject.R
import kotlin.Int
import kotlin.String

public class ProfileFragmentDirections private constructor() {
  private data class ActionProfileFragmentToPostFragment(
    public val post: String,
    public val owner: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_profileFragment_to_postFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("post", this.post)
        result.putString("owner", this.owner)
        return result
      }
  }

  private data class ActionProfileFragmentToCreatePostFragment(
    public val existingPost: String? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_profileFragment_to_createPostFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("existingPost", this.existingPost)
        return result
      }
  }

  public companion object {
    public fun actionProfileFragmentToPostFragment(post: String, owner: String): NavDirections =
        ActionProfileFragmentToPostFragment(post, owner)

    public fun actionProfileFragmentToCreatePostFragment(existingPost: String? = null):
        NavDirections = ActionProfileFragmentToCreatePostFragment(existingPost)
  }
}
