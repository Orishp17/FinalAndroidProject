package com.example.androidproject.database.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0082@\u00a2\u0006\u0002\u0010\u000bJ(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00140\u0011J\u001a\u0010\u0015\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00140\u0011J\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001b\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ \u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096@\u00a2\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u001fH\u0082@\u00a2\u0006\u0002\u0010$R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006&"}, d2 = {"Lcom/example/androidproject/database/remote/UserRemoteAccess;", "Lcom/example/androidproject/database/common/AuthRepo;", "sp", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "getSp", "()Landroid/content/SharedPreferences;", "createUserHelper", "Lcom/google/firebase/auth/AuthResult;", "form", "Lcom/example/androidproject/dto/UserRegistrationForm;", "(Lcom/example/androidproject/dto/UserRegistrationForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "listenAllUsers", "Lcom/google/firebase/firestore/ListenerRegistration;", "lastUpdateKey", "", "callback", "Lkotlin/Function1;", "", "Lcom/example/androidproject/models/OtherUser;", "", "listenToCurrentUser", "Lcom/example/androidproject/models/User;", "signIn", "Lcom/example/androidproject/dto/UserLoginForm;", "(Lcom/example/androidproject/dto/UserLoginForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInHelper", "signUp", "updateUser", "user", "imageUri", "Landroid/net/Uri;", "(Lcom/example/androidproject/models/User;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadImage", "pathRef", "uri", "(Ljava/lang/String;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class UserRemoteAccess implements com.example.androidproject.database.common.AuthRepo {
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences sp = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String USER_COLLECTION = "users";
    @org.jetbrains.annotations.NotNull()
    public static final com.example.androidproject.database.remote.UserRemoteAccess.Companion Companion = null;
    
    public UserRemoteAccess(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sp) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getSp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.ListenerRegistration listenAllUsers(@org.jetbrains.annotations.NotNull()
    java.lang.String lastUpdateKey, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.example.androidproject.models.OtherUser>, kotlin.Unit> callback) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {com.example.androidproject.database.exceptions.InvalidStateException.class})
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.firestore.ListenerRegistration listenToCurrentUser(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.androidproject.models.User, kotlin.Unit> callback) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.User user, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.dto.UserRegistrationForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.dto.UserLoginForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.User> $completion) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.lang.Object signInHelper(com.example.androidproject.dto.UserLoginForm form, kotlin.coroutines.Continuation<? super com.google.firebase.auth.AuthResult> $completion) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.lang.Object createUserHelper(com.example.androidproject.dto.UserRegistrationForm form, kotlin.coroutines.Continuation<? super com.google.firebase.auth.AuthResult> $completion) {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    private final java.lang.Object uploadImage(java.lang.String pathRef, android.net.Uri uri, kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/androidproject/database/remote/UserRemoteAccess$Companion;", "", "()V", "USER_COLLECTION", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}