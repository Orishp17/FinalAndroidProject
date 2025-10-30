package com.example.androidproject.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/example/androidproject/adapters/LibraryPostListener;", "", "onDelete", "", "post", "Lcom/example/androidproject/models/LibraryPost;", "onEdit", "onLike", "onShowMore", "owner", "Lcom/example/androidproject/models/OtherUser;", "app_debug"})
public abstract interface LibraryPostListener {
    
    public abstract void onLike(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post);
    
    public abstract void onShowMore(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.OtherUser owner);
    
    public abstract void onEdit(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post);
    
    public abstract void onDelete(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post);
}