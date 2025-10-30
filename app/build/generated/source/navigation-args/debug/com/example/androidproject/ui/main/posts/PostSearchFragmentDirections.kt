package com.example.androidproject.ui.main.posts

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.androidproject.R
import kotlin.Int
import kotlin.String

public class PostSearchFragmentDirections private constructor() {
  private data class ActionPostSearchFragmentToCreatePostFragment(
    public val existingPost: String? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_postSearchFragment_to_createPostFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("existingPost", this.existingPost)
        return result
      }
  }

  private data class ActionPostSearchFragmentToPostFragment(
    public val post: String,
    public val owner: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_postSearchFragment_to_postFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("post", this.post)
        result.putString("owner", this.owner)
        return result
      }
  }

  public companion object {
    public fun actionPostSearchFragmentToCreatePostFragment(existingPost: String? = null):
        NavDirections = ActionPostSearchFragmentToCreatePostFragment(existingPost)

    public fun actionPostSearchFragmentToPostFragment(post: String, owner: String): NavDirections =
        ActionPostSearchFragmentToPostFragment(post, owner)
  }
}
