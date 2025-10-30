package com.example.androidproject.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0001*B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u00020\u001a2\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0018H\u0016J\u0011\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0096\u0001J\u0011\u0010$\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0096\u0001J\u0011\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#H\u0096\u0001J\u0019\u0010&\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\'\u001a\u00020\u0012H\u0096\u0001J\u0010\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006+"}, d2 = {"Lcom/example/androidproject/adapters/LibraryPostsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/androidproject/adapters/LibraryPostsAdapter$LibraryPostsViewHolder;", "Lcom/example/androidproject/adapters/LibraryPostListener;", "feedData", "Lcom/example/androidproject/ui/utils/LibraryDataPopulated;", "listener", "(Lcom/example/androidproject/ui/utils/LibraryDataPopulated;Lcom/example/androidproject/adapters/LibraryPostListener;)V", "userFavorites", "Ljava/util/HashSet;", "", "kotlin.jvm.PlatformType", "getUserFavorites", "()Ljava/util/HashSet;", "setUserFavorites", "(Ljava/util/HashSet;)V", "usersById", "", "Lcom/example/androidproject/models/OtherUser;", "getUsersById", "()Ljava/util/Map;", "setUsersById", "(Ljava/util/Map;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onDelete", "post", "Lcom/example/androidproject/models/LibraryPost;", "onEdit", "onLike", "onShowMore", "owner", "setData", "libraryData", "LibraryPostsViewHolder", "app_debug"})
public final class LibraryPostsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.androidproject.adapters.LibraryPostsAdapter.LibraryPostsViewHolder> implements com.example.androidproject.adapters.LibraryPostListener {
    @org.jetbrains.annotations.NotNull()
    private com.example.androidproject.ui.utils.LibraryDataPopulated feedData;
    @org.jetbrains.annotations.NotNull()
    private java.util.HashSet<java.lang.String> userFavorites;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.String, com.example.androidproject.models.OtherUser> usersById;
    
    public LibraryPostsAdapter(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.ui.utils.LibraryDataPopulated feedData, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.adapters.LibraryPostListener listener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashSet<java.lang.String> getUserFavorites() {
        return null;
    }
    
    public final void setUserFavorites(@org.jetbrains.annotations.NotNull()
    java.util.HashSet<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, com.example.androidproject.models.OtherUser> getUsersById() {
        return null;
    }
    
    public final void setUsersById(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, com.example.androidproject.models.OtherUser> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.ui.utils.LibraryDataPopulated libraryData) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.androidproject.adapters.LibraryPostsAdapter.LibraryPostsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.adapters.LibraryPostsAdapter.LibraryPostsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public void onDelete(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post) {
    }
    
    @java.lang.Override()
    public void onEdit(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.LibraryPost post) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/androidproject/adapters/LibraryPostsAdapter$LibraryPostsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/androidproject/databinding/LibraryPostItemBinding;", "(Lcom/example/androidproject/adapters/LibraryPostsAdapter;Lcom/example/androidproject/databinding/LibraryPostItemBinding;)V", "bind", "", "post", "Lcom/example/androidproject/models/LibraryPost;", "app_debug"})
    public final class LibraryPostsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.androidproject.databinding.LibraryPostItemBinding binding = null;
        
        public LibraryPostsViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.androidproject.databinding.LibraryPostItemBinding binding) {
            super(null);
        }
        
        @android.annotation.SuppressLint(value = {"SetTextI18n"})
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.androidproject.models.LibraryPost post) {
        }
    }
}