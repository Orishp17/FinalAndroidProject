package com.example.androidproject.ui.main;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0012H\u0002J$\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010 \u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0012H\u0016J\u0010\u0010$\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010%\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010&\u001a\u00020\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(H\u0016J\u001a\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u0019H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006-"}, d2 = {"Lcom/example/androidproject/ui/main/ProfileFragment;", "Lcom/example/androidproject/ui/ImagePickerFragment;", "Lcom/example/androidproject/adapters/LibraryPostListener;", "()V", "_binding", "Lcom/example/androidproject/databinding/FragmentProfileBinding;", "binding", "getBinding", "()Lcom/example/androidproject/databinding/FragmentProfileBinding;", "mainViewModel", "Lcom/example/androidproject/viewmodels/MainViewModel;", "getMainViewModel", "()Lcom/example/androidproject/viewmodels/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "onImagePicked", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "getOnImagePicked", "()Lkotlin/jvm/functions/Function1;", "setOnImagePicked", "(Lkotlin/jvm/functions/Function1;)V", "observeCurrentUser", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDelete", "post", "Lcom/example/androidproject/models/LibraryPost;", "onDestroy", "onEdit", "onLike", "onShowMore", "owner", "Lcom/example/androidproject/models/OtherUser;", "onViewCreated", "view", "showEditProfileDialog", "v", "app_debug"})
public final class ProfileFragment extends com.example.androidproject.ui.ImagePickerFragment implements com.example.androidproject.adapters.LibraryPostListener {
    @org.jetbrains.annotations.NotNull()
    private kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> onImagePicked;
    @org.jetbrains.annotations.Nullable()
    private com.example.androidproject.databinding.FragmentProfileBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainViewModel$delegate = null;
    
    public ProfileFragment() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> getOnImagePicked() {
        return null;
    }
    
    public void setOnImagePicked(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.net.Uri, kotlin.Unit> p0) {
    }
    
    private final com.example.androidproject.databinding.FragmentProfileBinding getBinding() {
        return null;
    }
    
    private final com.example.androidproject.viewmodels.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onLike(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post) {
    }
    
    @java.lang.Override()
    public void onShowMore(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.OtherUser owner) {
    }
    
    @java.lang.Override()
    public void onEdit(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post) {
    }
    
    @java.lang.Override()
    public void onDelete(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post) {
    }
    
    private final void observeCurrentUser() {
    }
    
    private final void showEditProfileDialog(android.view.View v) {
    }
}