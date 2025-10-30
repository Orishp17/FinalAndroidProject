package com.example.androidproject.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/example/androidproject/di/UsersModule;", "", "()V", "provideCurrentUserDao", "Lcom/example/androidproject/database/local/CurrentUserDao;", "database", "Lcom/example/androidproject/database/local/AppDatabase;", "provideCurrentUserRepository", "Lcom/example/androidproject/database/common/CurrentUserRepository;", "currentUserDao", "remoteDb", "Lcom/example/androidproject/database/remote/UserRemoteAccess;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "provideOtherUserDao", "Lcom/example/androidproject/database/local/OtherUserDao;", "provideUserRemoteAccess", "sp", "Landroid/content/SharedPreferences;", "provideUserRepository", "Lcom/example/androidproject/database/common/UserRepository;", "otherUserDao", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class UsersModule {
    
    public UsersModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.database.local.CurrentUserDao provideCurrentUserDao(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.AppDatabase database) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.database.local.OtherUserDao provideOtherUserDao(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.AppDatabase database) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.database.remote.UserRemoteAccess provideUserRemoteAccess(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sp) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.database.common.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.OtherUserDao otherUserDao, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.remote.UserRemoteAccess remoteDb, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.database.common.CurrentUserRepository provideCurrentUserRepository(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.CurrentUserDao currentUserDao, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.remote.UserRemoteAccess remoteDb, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope coroutineScope) {
        return null;
    }
}