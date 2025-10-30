package com.example.androidproject.ui.dialogs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0017H\u0016J\u001a\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016JJ\u0010%\u001a\u00020\u00172B\u0010\u0010\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0011R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0082.\u00a2\u0006\u0002\n\u0000RJ\u0010\u0010\u001a>\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\f0\u0012\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00170\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0019\u001a\u0010\u0012\f\u0012\n \r*\u0004\u0018\u00010\f0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/androidproject/ui/dialogs/LibraryPostExtrasDialog;", "Landroidx/fragment/app/DialogFragment;", "existingPost", "Lcom/example/androidproject/models/LibraryPost;", "(Lcom/example/androidproject/models/LibraryPost;)V", "_binding", "Lcom/example/androidproject/databinding/LibraryPostExtrasBinding;", "binding", "getBinding", "()Lcom/example/androidproject/databinding/LibraryPostExtrasBinding;", "linkSet", "Ljava/util/HashSet;", "", "kotlin.jvm.PlatformType", "linksListAdapter", "Landroid/widget/ArrayAdapter;", "onExtras", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "links", "tags", "", "tagListAdapter", "tagSet", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "setOnExtras", "app_debug"})
public final class LibraryPostExtrasDialog extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.Nullable()
    private final com.example.androidproject.models.LibraryPost existingPost = null;
    private kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, kotlin.Unit> onExtras;
    @org.jetbrains.annotations.Nullable()
    private com.example.androidproject.databinding.LibraryPostExtrasBinding _binding;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashSet<java.lang.String> linkSet = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.HashSet<java.lang.String> tagSet = null;
    private android.widget.ArrayAdapter<java.lang.String> tagListAdapter;
    private android.widget.ArrayAdapter<java.lang.String> linksListAdapter;
    
    public LibraryPostExtrasDialog(@org.jetbrains.annotations.Nullable()
    com.example.androidproject.models.LibraryPost existingPost) {
        super();
    }
    
    private final com.example.androidproject.databinding.LibraryPostExtrasBinding getBinding() {
        return null;
    }
    
    public final void setOnExtras(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.util.List<java.lang.String>, ? super java.util.List<java.lang.String>, kotlin.Unit> onExtras) {
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
    
    public LibraryPostExtrasDialog() {
        super();
    }
}