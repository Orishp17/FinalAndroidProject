package com.example.androidproject.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0014B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\b2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/androidproject/adapters/NpmRegistryPostsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/androidproject/adapters/NpmRegistryPostsAdapter$NpmRegistryViewHolder;", "root", "Lcom/example/androidproject/models/npm/NpmRegistryRoot;", "openLink", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "(Lcom/example/androidproject/models/npm/NpmRegistryRoot;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "NpmRegistryViewHolder", "app_debug"})
public final class NpmRegistryPostsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.androidproject.adapters.NpmRegistryPostsAdapter.NpmRegistryViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private com.example.androidproject.models.npm.NpmRegistryRoot root;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<android.content.Intent, kotlin.Unit> openLink = null;
    
    public NpmRegistryPostsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.npm.NpmRegistryRoot root, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super android.content.Intent, kotlin.Unit> openLink) {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.npm.NpmRegistryRoot root) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.androidproject.adapters.NpmRegistryPostsAdapter.NpmRegistryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.adapters.NpmRegistryPostsAdapter.NpmRegistryViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/androidproject/adapters/NpmRegistryPostsAdapter$NpmRegistryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/androidproject/databinding/NpmRegistryPostItemBinding;", "(Lcom/example/androidproject/adapters/NpmRegistryPostsAdapter;Lcom/example/androidproject/databinding/NpmRegistryPostItemBinding;)V", "bind", "", "post", "Lcom/example/androidproject/models/npm/Object;", "app_debug"})
    public final class NpmRegistryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.androidproject.databinding.NpmRegistryPostItemBinding binding = null;
        
        public NpmRegistryViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.androidproject.databinding.NpmRegistryPostItemBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n", "ClickableViewAccessibility"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.androidproject.models.npm.Object post) {
        }
    }
}