package com.example.androidproject.database.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b0\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/androidproject/database/common/UserRepository;", "", "localDb", "Lcom/example/androidproject/database/local/OtherUserDao;", "remoteDb", "Lcom/example/androidproject/database/remote/UserRemoteAccess;", "localDbOpsScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/example/androidproject/database/local/OtherUserDao;Lcom/example/androidproject/database/remote/UserRemoteAccess;Lkotlinx/coroutines/CoroutineScope;)V", "listenAllUsers", "Lcom/example/androidproject/helpers/DocumentListener;", "", "Lcom/example/androidproject/models/OtherUser;", "Companion", "app_debug"})
public final class UserRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.local.OtherUserDao localDb = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.remote.UserRemoteAccess remoteDb = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope localDbOpsScope = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USERS_LAST_UPDATE_KEY = "users_last_update";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.androidproject.database.common.UserRepository.Companion Companion = null;
    
    public UserRepository(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.OtherUserDao localDb, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.remote.UserRemoteAccess remoteDb, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope localDbOpsScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.helpers.DocumentListener<java.util.List<com.example.androidproject.models.OtherUser>> listenAllUsers() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/androidproject/database/common/UserRepository$Companion;", "", "()V", "USERS_LAST_UPDATE_KEY", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}