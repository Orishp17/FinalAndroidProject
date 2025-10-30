package com.example.androidproject.ui.main

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.androidproject.R
import kotlin.Int
import kotlin.String

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToPostFragment(
    public val post: String,
    public val owner: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_postFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("post", this.post)
        result.putString("owner", this.owner)
        return result
      }
  }

  private data class ActionHomeFragmentToCreatePostFragment(
    public val existingPost: String? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_homeFragment_to_createPostFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("existingPost", this.existingPost)
        return result
      }
  }

  public companion object {
    public fun actionHomeFragmentToPostFragment(post: String, owner: String): NavDirections =
        ActionHomeFragmentToPostFragment(post, owner)

    public fun actionHomeFragmentToCreatePostFragment(existingPost: String? = null): NavDirections =
        ActionHomeFragmentToCreatePostFragment(existingPost)

    public fun actionHomeFragmentToNpmRegistryFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_npmRegistryFragment)

    public fun actionHomeFragmentToPostSearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_postSearchFragment)
  }
}
