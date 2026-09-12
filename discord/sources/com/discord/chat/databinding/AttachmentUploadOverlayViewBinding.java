package com.discord.chat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.discord.chat.R;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import sa.a;

/* JADX INFO: loaded from: classes.dex */
public final class AttachmentUploadOverlayViewBinding implements ViewBinding {

    @NonNull
    private final View rootView;

    @NonNull
    public final SimpleDraweeView uploadCancel;

    @NonNull
    public final SimpleDraweeView uploadComplete;

    @NonNull
    public final MaterialCardView uploadCompleteBackground;

    @NonNull
    public final ConstraintLayout uploadCompleteLayout;

    @NonNull
    public final CircularProgressIndicator uploadProgress;

    @NonNull
    public final View uploadProgressBackground;

    @NonNull
    public final ConstraintLayout uploadProgressLayout;

    private AttachmentUploadOverlayViewBinding(@NonNull View view, @NonNull SimpleDraweeView simpleDraweeView, @NonNull SimpleDraweeView simpleDraweeView2, @NonNull MaterialCardView materialCardView, @NonNull ConstraintLayout constraintLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull View view2, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = view;
        this.uploadCancel = simpleDraweeView;
        this.uploadComplete = simpleDraweeView2;
        this.uploadCompleteBackground = materialCardView;
        this.uploadCompleteLayout = constraintLayout;
        this.uploadProgress = circularProgressIndicator;
        this.uploadProgressBackground = view2;
        this.uploadProgressLayout = constraintLayout2;
    }

    @NonNull
    public static AttachmentUploadOverlayViewBinding bind(@NonNull View view) {
        View viewK;
        int i7 = R.id.upload_cancel;
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) a.k(i7, view);
        if (simpleDraweeView != null) {
            i7 = R.id.upload_complete;
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) a.k(i7, view);
            if (simpleDraweeView2 != null) {
                i7 = R.id.upload_complete_background;
                MaterialCardView materialCardView = (MaterialCardView) a.k(i7, view);
                if (materialCardView != null) {
                    i7 = R.id.upload_complete_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) a.k(i7, view);
                    if (constraintLayout != null) {
                        i7 = R.id.upload_progress;
                        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) a.k(i7, view);
                        if (circularProgressIndicator != null && (viewK = a.k((i7 = R.id.upload_progress_background), view)) != null) {
                            i7 = R.id.upload_progress_layout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) a.k(i7, view);
                            if (constraintLayout2 != null) {
                                return new AttachmentUploadOverlayViewBinding(view, simpleDraweeView, simpleDraweeView2, materialCardView, constraintLayout, circularProgressIndicator, viewK, constraintLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i7)));
    }

    @NonNull
    public static AttachmentUploadOverlayViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.attachment_upload_overlay_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
