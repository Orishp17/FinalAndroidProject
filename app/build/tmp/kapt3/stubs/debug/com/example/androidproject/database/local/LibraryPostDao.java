package com.example.androidproject.database.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\tH\'J \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\'\u00a8\u0006\r"}, d2 = {"Lcom/example/androidproject/database/local/LibraryPostDao;", "", "insert", "", "post", "Lcom/example/androidproject/models/LibraryPost;", "posts", "", "listenAllPosts", "Landroidx/lifecycle/LiveData;", "listenMyPosts", "uid", "", "app_debug"})
@androidx.room.Dao()
public abstract interface LibraryPostDao {
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.androidproject.models.LibraryPost> posts);
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post);
    
    @androidx.room.Query(value = "SELECT * from posts order by updatedAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.androidproject.models.LibraryPost>> listenAllPosts();
    
    @androidx.room.Query(value = "SELECT * from posts where owner = :uid order by updatedAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.androidproject.models.LibraryPost>> listenMyPosts(@org.jetbrains.annotations.Nullable()
    java.lang.String uid);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}