package com.discord.chat.presentation.message.view;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayViewManager;", "", "<init>", "()V", "attachmentUploadOverlayView", "Lcom/discord/chat/presentation/message/view/AttachmentUploadOverlayView;", "configureAttachmentOverlay", "", "rootView", "Landroid/view/View;", "containerView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "radiusPx", "", "uploadItemProps", "Lcom/discord/chat/presentation/message/view/UploadItemProps;", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AttachmentUploadOverlayViewManager {
    private AttachmentUploadOverlayView attachmentUploadOverlayView;

    public final void configureAttachmentOverlay(@NotNull View rootView, @NotNull ConstraintLayout containerView, int radiusPx, UploadItemProps uploadItemProps) {
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        if (uploadItemProps == null) {
            rootView.setAlpha(1.0f);
            AttachmentUploadOverlayView attachmentUploadOverlayView = this.attachmentUploadOverlayView;
            if (attachmentUploadOverlayView != null) {
                attachmentUploadOverlayView.setProgress(null);
            }
            AttachmentUploadOverlayView attachmentUploadOverlayView2 = this.attachmentUploadOverlayView;
            if (attachmentUploadOverlayView2 != null) {
                attachmentUploadOverlayView2.setUploadCancel(null);
                return;
            }
            return;
        }
        if (this.attachmentUploadOverlayView == null) {
            this.attachmentUploadOverlayView = AttachmentUploadOverlayView.INSTANCE.createAndAttachUploadOverlayView(containerView, radiusPx);
        }
        AttachmentUploadOverlayView attachmentUploadOverlayView3 = this.attachmentUploadOverlayView;
        if (attachmentUploadOverlayView3 != null) {
            rootView.setAlpha(uploadItemProps.getUploadOpacity());
            attachmentUploadOverlayView3.setProgress(uploadItemProps);
            attachmentUploadOverlayView3.setUploadCancel(uploadItemProps);
        }
    }
}
