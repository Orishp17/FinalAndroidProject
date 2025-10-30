package com.example.androidproject.database.common;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\bH\u00a6@\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00a6@\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/androidproject/database/common/AuthRepo;", "", "signIn", "Lcom/example/androidproject/models/User;", "form", "Lcom/example/androidproject/dto/UserLoginForm;", "(Lcom/example/androidproject/dto/UserLoginForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/example/androidproject/dto/UserRegistrationForm;", "(Lcom/example/androidproject/dto/UserRegistrationForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUser", "user", "imageUri", "Landroid/net/Uri;", "(Lcom/example/androidproject/models/User;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthRepo {
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signIn(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.dto.UserLoginForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.User> $completion);
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signUp(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.dto.UserRegistrationForm form, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.User> $completion);
    
    @kotlin.jvm.Throws(exceptionClasses = {})
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateUser(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.User user, @org.jetbrains.annotations.Nullable()
    android.net.Uri imageUri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.androidproject.models.User> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}