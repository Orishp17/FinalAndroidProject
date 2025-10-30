package com.example.androidproject.ui.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001BA\u0012\u0014\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006\u00a2\u0006\u0002\u0010\rJ%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H\u0096\u0002R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/example/androidproject/ui/utils/FavoritePostsDataMediator;", "Lkotlin/properties/ReadOnlyProperty;", "", "Landroidx/lifecycle/MediatorLiveData;", "Lcom/example/androidproject/ui/utils/LibraryData;", "allPosts", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/androidproject/models/LibraryPost;", "allUsers", "Lcom/example/androidproject/models/OtherUser;", "currentUser", "Lcom/example/androidproject/models/User;", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;Landroidx/lifecycle/LiveData;)V", "_libraryData", "libraryData", "getLibraryData", "()Landroidx/lifecycle/MediatorLiveData;", "libraryData$delegate", "Lkotlin/Lazy;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "app_debug"})
public final class FavoritePostsDataMediator implements kotlin.properties.ReadOnlyProperty<java.lang.Object, androidx.lifecycle.MediatorLiveData<com.example.androidproject.ui.utils.LibraryData>> {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.androidproject.models.LibraryPost>> allPosts = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.androidproject.models.OtherUser>> allUsers = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.androidproject.models.User> currentUser = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.ui.utils.LibraryData _libraryData = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy libraryData$delegate = null;
    
    public FavoritePostsDataMediator(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.androidproject.models.LibraryPost>> allPosts, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.androidproject.models.OtherUser>> allUsers, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.androidproject.models.User> currentUser) {
        super();
    }
    
    private final androidx.lifecycle.MediatorLiveData<com.example.androidproject.ui.utils.LibraryData> getLibraryData() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.MediatorLiveData<com.example.androidproject.ui.utils.LibraryData> getValue(@org.jetbrains.annotations.Nullable()
    java.lang.Object thisRef, @org.jetbrains.annotations.NotNull()
    kotlin.reflect.KProperty<?> property) {
        return null;
    }
}