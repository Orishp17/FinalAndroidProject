package com.example.androidproject.database.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0011H\u0002J\u0016\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0017H\u0096A\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u001cH\u0096A\u00a2\u0006\u0002\u0010\u001dJ\u0006\u0010\u001e\u001a\u00020\u001aJ\u0006\u0010\u001f\u001a\u00020\u001aJ\"\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#H\u0096A\u00a2\u0006\u0002\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lcom/example/androidproject/database/common/CurrentUserRepository;", "Lcom/example/androidproject/database/common/AuthRepo;", "localDb", "Lcom/example/androidproject/database/local/CurrentUserDao;", "remoteDb", "Lcom/example/androidproject/database/remote/UserRemoteAccess;", "localDbOpsScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lcom/example/androidproject/database/local/CurrentUserDao;Lcom/example/androidproject/database/remote/UserRemoteAccess;Lkotlinx/coroutines/CoroutineScope;)V", "authListener", "Lcom/google/firebase/auth/FirebaseAuth$AuthStateListener;", "currentUser", "Landroidx/lifecycle/LiveData;", "Lcom/example/androidproject/models/User;", "getCurrentUser", "()Landroidx/lifecycle/LiveData;", "currentUserDocumentListener", "Lcom/example/androidproject/helpers/DocumentListener;", "currentUserMediator", "Landroidx/lifecycle/MediatorLiveData;", "listenCurrentUser", "signIn", "form", "Lcom/example/androidproject/dto/UserLoginForm;", "(Lcom/example/androidproject/dto/UserLoginForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signOut", "", "signUp", "Lcom/example/androidproject/dto/UserRegistrationForm;", "(Lcom/example/androidproject/dto/UserRegistrationForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startListening", "stopListening", "updateUser", "user", "imageUri", "Landroid/net/Uri;", "(Lcom/example/androidproject/models/User;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CurrentUserRepository implements com.example.androidproject.database.common.AuthRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.local.CurrentUserDao localDb = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.remote.UserRemoteAccess remoteDb = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.CoroutineScope localDbOpsScope = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.androidproject.helpers.DocumentListener<com.example.androidproject.models.User> currentUserDocumentListener;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MediatorLiveData<com.example.androidproject.models.User> currentUserMediator = null;
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.auth.FirebaseAuth.AuthStateListener authListener;
    
    public CurrentUserRepository(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.local.CurrentUserDao localDb, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.remote.UserRemoteAccess remoteDb, @org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineScope localDbOpsScope) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.androidproject.models.User> getCurrentUser() {
        return null;
    }
    
    public final void startListening() {
    }
    
    public final void stopListening() {
    }
    
    public final void signOut() {
    }
    
    private final com.example.androidproject.helpers.DocumentListener<com.example.androidproject.models.User> listenCurrentUser() {
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
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.dto.UserRegistrationForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.User> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {})
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.User user, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.User> $completion) {
        return null;
    }
}