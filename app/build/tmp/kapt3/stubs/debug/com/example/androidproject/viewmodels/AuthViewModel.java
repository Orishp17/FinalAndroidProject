package com.example.androidproject.viewmodels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u001aR\u0018\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/androidproject/viewmodels/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/androidproject/database/common/CurrentUserRepository;", "(Lcom/example/androidproject/database/common/CurrentUserRepository;)V", "_exceptions", "Landroidx/lifecycle/MutableLiveData;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "_loadingState", "Lcom/example/androidproject/helpers/LoadingState;", "currentUser", "Landroidx/lifecycle/LiveData;", "Lcom/example/androidproject/models/User;", "getCurrentUser", "()Landroidx/lifecycle/LiveData;", "exceptions", "getExceptions", "loadingState", "getLoadingState", "onCleared", "", "signIn", "form", "Lcom/example/androidproject/dto/UserLoginForm;", "signUp", "Lcom/example/androidproject/dto/UserRegistrationForm;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.database.common.CurrentUserRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Exception> _exceptions;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.example.androidproject.helpers.LoadingState> _loadingState;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.androidproject.models.User> currentUser = null;
    
    @javax.inject.Inject()
    public AuthViewModel(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.database.common.CurrentUserRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.androidproject.models.User> getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Exception> getExceptions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.androidproject.helpers.LoadingState> getLoadingState() {
        return null;
    }
    
    public final void signIn(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.dto.UserLoginForm form) {
    }
    
    public final void signUp(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.dto.UserRegistrationForm form) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}