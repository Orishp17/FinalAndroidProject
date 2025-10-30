package com.example.androidproject.ui.main

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.androidproject.R
import kotlin.Int
import kotlin.String

public class FavoritesFragmentDirections private constructor() {
  private data class ActionFavoritesFragmentToPostFragment(
    public val post: String,
    public val owner: String,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_favoritesFragment_to_postFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("post", this.post)
        result.putString("owner", this.owner)
        return result
      }
  }

  private data class ActionFavoritesFragmentToCreatePostFragment(
    public val existingPost: String? = null,
  ) : NavDirections {
    public override val actionId: Int = R.id.action_favoritesFragment_to_createPostFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("existingPost", this.existingPost)
        return result
      }
  }

  public companion object {
    public fun actionFavoritesFragmentToPostFragment(post: String, owner: String): NavDirections =
        ActionFavoritesFragmentToPostFragment(post, owner)

    public fun actionFavoritesFragmentToCreatePostFragment(existingPost: String? = null):
        NavDirections = ActionFavoritesFragmentToCreatePostFragment(existingPost)
  }
}
