package com.example.androidproject.helpers.extensions;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0003\u0018\u00010\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00020\u0001\u001a4\u0010\u0004\u001a\u00020\u0005\"\b\b\u0000\u0010\u0003*\u00020\u0006*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00012\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0000\u0012\u0002H\u00030\n\u001a2\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0003*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0010\u0010\t\u001a\f\u0012\b\b\u0000\u0012\u0004\u0018\u0001H\u00030\n\u00a8\u0006\f"}, d2 = {"nullIfEmpty", "Landroidx/lifecycle/LiveData;", "", "T", "observeNotNull", "", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "observeOnlyNull", "app_debug"})
public final class LiveDataExtKt {
    
    public static final <T extends java.lang.Object>void observeNotNull(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeNotNull, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super T> observer) {
    }
    
    public static final <T extends java.lang.Object>void observeOnlyNull(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeOnlyNull, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<? super T> observer) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final <T extends java.lang.Object>androidx.lifecycle.LiveData<java.util.List<T>> nullIfEmpty(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<T>> $this$nullIfEmpty) {
        return null;
    }
}