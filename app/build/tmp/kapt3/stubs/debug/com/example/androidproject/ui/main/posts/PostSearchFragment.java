package com.example.androidproject.ui.main.posts;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001dH\u0016J\b\u0010!\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010\'\u001a\u00020\u001d2\u0006\u0010(\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006)"}, d2 = {"Lcom/example/androidproject/ui/main/posts/PostSearchFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/androidproject/adapters/LibraryPostListener;", "()V", "_binding", "Lcom/example/androidproject/databinding/FragmentPostSearchBinding;", "binding", "getBinding", "()Lcom/example/androidproject/databinding/FragmentPostSearchBinding;", "mainViewModel", "Lcom/example/androidproject/viewmodels/MainViewModel;", "getMainViewModel", "()Lcom/example/androidproject/viewmodels/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/example/androidproject/viewmodels/PostSearchViewModel;", "getViewModel", "()Lcom/example/androidproject/viewmodels/PostSearchViewModel;", "viewModel$delegate", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDelete", "", "post", "Lcom/example/androidproject/models/LibraryPost;", "onDestroy", "onDestroyView", "onEdit", "onLike", "onShowMore", "owner", "Lcom/example/androidproject/models/OtherUser;", "onViewCreated", "view", "app_debug"})
public final class PostSearchFragment extends androidx.fragment.app.Fragment implements com.example.androidproject.adapters.LibraryPostListener {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mainViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.androidproject.databinding.FragmentPostSearchBinding _binding;
    
    public PostSearchFragment() {
        super();
    }
    
    private final com.example.androidproject.viewmodels.MainViewModel getMainViewModel() {
        return null;
    }
    
    private final com.example.androidproject.viewmodels.PostSearchViewModel getViewModel() {
        return null;
    }
    
    private final com.example.androidproject.databinding.FragmentPostSearchBinding getBinding() {
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
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}