package com.example.androidproject.database.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0096A\u00a2\u0006\u0002\u0010\u000eJ\u0016\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0096A\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00130\u0012J\"\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0096A\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/androidproject/database/common/LibraryPostRepository;", "Lcom/example/androidproject/database/common/PostRepo;", "localDb", "Lcom/example/androidproject/database/local/LibraryPostDao;", "remoteDb", "Lcom/example/androidproject/database/remote/LibraryPostRemoteAccess;", "localDbOpsScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/example/androidproject/database/local/LibraryPostDao;Lcom/example/androidproject/database/remote/LibraryPostRemoteAccess;Lkotlinx/coroutines/CoroutineScope;)V", "createPost", "Lcom/example/androidproject/models/LibraryPost;", "post", "imageUri", "Landroid/net/Uri;", "(Lcom/example/androidproject/models/LibraryPost;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deletePost", "(Lcom/example/androidproject/models/LibraryPost;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listenAllPosts", "Lcom/example/androidproject/helpers/DocumentListener;", "", "updatePost", "Companion", "app_debug"})
public final class LibraryPostRepository implements com.example.androidproject.database.common.PostRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.local.LibraryPostDao localDb = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.remote.LibraryPostRemoteAccess remoteDb = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope localDbOpsScope = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LIBRARY_POST_LAST_UPDATE_KEY = "library_posts_last_update";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.androidproject.database.common.LibraryPostRepository.Companion Companion = null;
    
    public LibraryPostRepository(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.LibraryPostDao localDb, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.remote.LibraryPostRemoteAccess remoteDb, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope localDbOpsScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.helpers.DocumentListener<java.util.List<com.example.androidproject.models.LibraryPost>> listenAllPosts() {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object createPost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deletePost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updatePost(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.LibraryPost> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/androidproject/database/common/LibraryPostRepository$Companion;", "", "()V", "LIBRARY_POST_LAST_UPDATE_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}