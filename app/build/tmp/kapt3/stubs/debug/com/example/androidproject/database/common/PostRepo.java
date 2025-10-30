package com.example.androidproject.database.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\u0016\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/example/androidproject/database/common/PostRepo;", "", "createPost", "Lcom/example/androidproject/models/LibraryPost;", "post", "imageUri", "Landroid/net/Uri;", "(Lcom/example/androidproject/models/LibraryPost;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePost", "(Lcom/example/androidproject/models/LibraryPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePost", "app_debug"})
public abstract interface PostRepo {
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createPost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion);
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updatePost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion);
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deletePost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}