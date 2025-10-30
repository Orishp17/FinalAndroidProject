package com.example.androidproject.ui.dialogs

import android.app.AlertDialog
import android.content.Context
import com.example.androidproject.models.LibraryPost

class DeletePostDialog {

    companion object {

        fun showDeleteDialog(
            context: Context,
            post: LibraryPost,
            onDeleteCallback: () -> Unit,
        ) {
            AlertDialog.Builder(context)
                .setTitle("Libraries")
                .setMessage("Are you sure you want to delete ${post.title}")
                .setPositiveButton("Yes, Delete") { _, _ ->
                    onDeleteCallback.invoke()
                }
                .setNegativeButton("Cancel", null)
                .show()
        }
    }
}