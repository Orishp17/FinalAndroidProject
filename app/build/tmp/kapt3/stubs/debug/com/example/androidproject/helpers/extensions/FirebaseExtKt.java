package com.example.androidproject.helpers.extensions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000P\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a$\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u0002H\u0003H\u0086@\u00a2\u0006\u0002\u0010\u0007\u001a\u0012\u0010\b\u001a\u00020\t*\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000b\u001a\u001e\u0010\f\u001a\u0002H\u0003\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\nH\u0086H\u00a2\u0006\u0002\u0010\u000b\u001a2\u0010\r\u001a\u00020\u000e\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\n2\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0086\b\u00f8\u0001\u0000\u001a@\u0010\u0012\u001a\u00020\u000e\"\n\b\u0000\u0010\u0003\u0018\u0001*\u00020\u0004*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001a\b\u0004\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u0016\u0012\u0004\u0012\u00020\u00110\u0010H\u0086\b\u00f8\u0001\u0000\u001a\u001a\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0002\u0010\u001b\u001a$\u0010\u001c\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0004*\u00020\n2\u0006\u0010\u001d\u001a\u0002H\u0003H\u0086@\u00a2\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001f"}, d2 = {"LAST_UPDATE_KEY", "", "create", "T", "Lcom/example/androidproject/models/BaseDocument;", "Lcom/google/firebase/firestore/CollectionReference;", "doc", "(Lcom/google/firebase/firestore/CollectionReference;Lcom/example/androidproject/models/BaseDocument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAsync", "Ljava/lang/Void;", "Lcom/google/firebase/firestore/DocumentReference;", "(Lcom/google/firebase/firestore/DocumentReference;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAsync", "listen", "Lcom/google/firebase/firestore/ListenerRegistration;", "callback", "Lkotlin/Function1;", "", "listenAll", "Lcom/google/firebase/firestore/Query;", "lastUpdateDate", "", "", "putAsync", "Lcom/google/firebase/storage/StorageReference;", "uri", "Landroid/net/Uri;", "(Lcom/google/firebase/storage/StorageReference;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setAsync", "value", "(Lcom/google/firebase/firestore/DocumentReference;Lcom/example/androidproject/models/BaseDocument;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class FirebaseExtKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String LAST_UPDATE_KEY = "updatedAt";
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends com.example.androidproject.models.BaseDocument>java.lang.Object create(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.CollectionReference $this$create, @org.jetbrains.annotations.NotNull()
    T doc, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object putAsync(@org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.StorageReference $this$putAsync, @org.jetbrains.annotations.NotNull()
    android.net.Uri uri, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final <T extends com.example.androidproject.models.BaseDocument>java.lang.Object setAsync(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.DocumentReference $this$setAsync, @org.jetbrains.annotations.NotNull()
    T value, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.Object deleteAsync(@org.jetbrains.annotations.NotNull()
    com.google.firebase.firestore.DocumentReference $this$deleteAsync, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Void> $completion) {
        return null;
    }
}