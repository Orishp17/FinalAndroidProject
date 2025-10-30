package com.example.androidproject.database.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000bH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/androidproject/database/local/CurrentUserDao;", "", "deleteCurrentUser", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "", "user", "Lcom/example/androidproject/models/User;", "(Lcom/example/androidproject/models/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listenCurrentUser", "Landroidx/lifecycle/LiveData;", "app_debug"})
@androidx.room.Dao()
public abstract interface CurrentUserDao {
    
    @androidx.room.Query(value = "SELECT * from current_user LIMIT 1")
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.example.androidproject.models.User> listenCurrentUser();
    
    @androidx.room.Query(value = "DELETE from current_user")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}