package com.example.androidproject.ui.dialogs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/androidproject/ui/dialogs/EditProfileDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "currentUser", "Lcom/example/androidproject/models/User;", "dismissCallback", "Lkotlin/Function0;", "", "completeCallback", "Lkotlin/Function1;", "Lcom/example/androidproject/dto/EditProfileData;", "openGalleryCallback", "Landroid/widget/ImageView;", "(Lcom/example/androidproject/models/User;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "_binding", "Lcom/example/androidproject/databinding/EditProfileSettingsLayoutBinding;", "binding", "getBinding", "()Lcom/example/androidproject/databinding/EditProfileSettingsLayoutBinding;", "getCurrentUser", "()Lcom/example/androidproject/models/User;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "app_debug"})
public final class EditProfileDialogFragment extends androidx.fragment.app.DialogFragment {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.models.User currentUser = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function0<kotlin.Unit> dismissCallback;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.example.androidproject.dto.EditProfileData, kotlin.Unit> completeCallback;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super android.widget.ImageView, kotlin.Unit> openGalleryCallback;
    @org.jetbrains.annotations.Nullable()
    private com.example.androidproject.databinding.EditProfileSettingsLayoutBinding _binding;
    
    public EditProfileDialogFragment(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.models.User currentUser, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function0<kotlin.Unit> dismissCallback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.example.androidproject.dto.EditProfileData, kotlin.Unit> completeCallback, @org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super android.widget.ImageView, kotlin.Unit> openGalleryCallback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.models.User getCurrentUser() {
        return null;
    }
    
    private final com.example.androidproject.databinding.EditProfileSettingsLayoutBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.NotNull()
    android.content.DialogInterface dialog) {
    }
}