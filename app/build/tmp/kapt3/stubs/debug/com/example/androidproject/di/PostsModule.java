package com.example.androidproject.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/androidproject/di/PostsModule;", "", "()V", "provideLibraryPostRemoteAccess", "Lcom/example/androidproject/database/remote/LibraryPostRemoteAccess;", "sp", "Landroid/content/SharedPreferences;", "provideLibraryPostRepository", "Lcom/example/androidproject/database/common/LibraryPostRepository;", "libraryPostsDao", "Lcom/example/androidproject/database/local/LibraryPostDao;", "remoteDb", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "providePostsDao", "database", "Lcom/example/androidproject/database/local/AppDatabase;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class PostsModule {
    
    public PostsModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.database.local.LibraryPostDao providePostsDao(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.AppDatabase database) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.database.remote.LibraryPostRemoteAccess provideLibraryPostRemoteAccess(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sp) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.database.common.LibraryPostRepository provideLibraryPostRepository(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.LibraryPostDao libraryPostsDao, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.remote.LibraryPostRemoteAccess remoteDb, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        return null;
    }
}