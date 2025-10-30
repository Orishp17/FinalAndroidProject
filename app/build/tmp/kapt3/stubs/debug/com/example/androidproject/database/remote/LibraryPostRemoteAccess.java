package com.example.androidproject.database.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0002\u0010\fJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0013\u0012\u0004\u0012\u00020\u00140\u0012J \u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@\u00a2\u0006\u0002\u0010\nJ\u001e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\tH\u0082@\u00a2\u0006\u0002\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/androidproject/database/remote/LibraryPostRemoteAccess;", "Lcom/example/androidproject/database/common/PostRepo;", "sp", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "createPost", "Lcom/example/androidproject/models/LibraryPost;", "post", "imageUri", "Landroid/net/Uri;", "(Lcom/example/androidproject/models/LibraryPost;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePost", "(Lcom/example/androidproject/models/LibraryPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listenAllPosts", "Lcom/google/firebase/firestore/ListenerRegistration;", "lastUpdateKey", "", "callback", "Lkotlin/Function1;", "", "", "updatePost", "uploadImage", "pathRef", "uri", "(Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class LibraryPostRemoteAccess implements com.example.androidproject.database.common.PostRepo {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sp = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POSTS_COLLECTION = "library_posts";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.androidproject.database.remote.LibraryPostRemoteAccess.Companion Companion = null;
    
    public LibraryPostRemoteAccess(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sp) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createPost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deletePost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updatePost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.ListenerRegistration listenAllPosts(@org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdateKey, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.androidproject.models.LibraryPost>, kotlin.Unit> callback) {
        return null;
    }
    
    private final java.lang.Object uploadImage(java.lang.String pathRef, android.net.Uri uri, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/androidproject/database/remote/LibraryPostRemoteAccess$Companion;", "", "()V", "POSTS_COLLECTION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}