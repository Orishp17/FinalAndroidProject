package com.example.androidproject.ui;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\rH\u0004R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R \u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000bX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0016"}, d2 = {"Lcom/example/androidproject/ui/ImagePickerFragment;", "Landroidx/fragment/app/Fragment;", "()V", "mGetImage", "Landroidx/activity/result/ActivityResultLauncher;", "", "getMGetImage", "()Landroidx/activity/result/ActivityResultLauncher;", "mPermissionLauncher", "getMPermissionLauncher", "onImagePicked", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "getOnImagePicked", "()Lkotlin/jvm/functions/Function1;", "selectedImage", "getSelectedImage", "()Landroid/net/Uri;", "setSelectedImage", "(Landroid/net/Uri;)V", "openGallery", "app_debug"})
public abstract class ImagePickerFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable()
    private android.net.Uri selectedImage;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> mGetImage = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> mPermissionLauncher = null;
    
    public ImagePickerFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlin.jvm.functions.Function1<android.net.Uri, kotlin.Unit> getOnImagePicked();
    
    @org.jetbrains.annotations.Nullable()
    protected final android.net.Uri getSelectedImage() {
        return null;
    }
    
    protected final void setSelectedImage(@org.jetbrains.annotations.Nullable()
    android.net.Uri p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.activity.result.ActivityResultLauncher<java.lang.String> getMGetImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.activity.result.ActivityResultLauncher<java.lang.String> getMPermissionLauncher() {
        return null;
    }
    
    protected final void openGallery() {
    }
}