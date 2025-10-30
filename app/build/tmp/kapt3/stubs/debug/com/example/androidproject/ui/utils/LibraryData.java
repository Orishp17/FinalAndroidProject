package com.example.androidproject.ui.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B5\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ6\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lcom/example/androidproject/ui/utils/LibraryData;", "", "allPosts", "", "Lcom/example/androidproject/models/LibraryPost;", "allUsers", "Lcom/example/androidproject/models/OtherUser;", "currentUser", "Lcom/example/androidproject/models/User;", "(Ljava/util/List;Ljava/util/List;Lcom/example/androidproject/models/User;)V", "getAllPosts", "()Ljava/util/List;", "setAllPosts", "(Ljava/util/List;)V", "getAllUsers", "getCurrentUser", "()Lcom/example/androidproject/models/User;", "copy", "isAllAvailable", "", "toPopulated", "Lcom/example/androidproject/ui/utils/LibraryDataPopulated;", "app_debug"})
public class LibraryData {
    @org.jetbrains.annotations.Nullable()
    private java.util.List<com.example.androidproject.models.LibraryPost> allPosts;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.example.androidproject.models.OtherUser> allUsers = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.androidproject.models.User currentUser = null;
    
    public LibraryData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.androidproject.models.LibraryPost> allPosts, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.androidproject.models.OtherUser> allUsers, @org.jetbrains.annotations.Nullable()
    com.example.androidproject.models.User currentUser) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.androidproject.models.LibraryPost> getAllPosts() {
        return null;
    }
    
    public final void setAllPosts(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.androidproject.models.LibraryPost> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.example.androidproject.models.OtherUser> getAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.androidproject.models.User getCurrentUser() {
        return null;
    }
    
    public final boolean isAllAvailable() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public com.example.androidproject.ui.utils.LibraryDataPopulated toPopulated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.ui.utils.LibraryData copy(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.androidproject.models.LibraryPost> allPosts, @org.jetbrains.annotations.Nullable()
    java.util.List<com.example.androidproject.models.OtherUser> allUsers, @org.jetbrains.annotations.Nullable()
    com.example.androidproject.models.User currentUser) {
        return null;
    }
    
    public LibraryData() {
        super();
    }
}