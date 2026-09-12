package com.discord.chat.presentation.message.view;

import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AttachmentUploadOverlayView f4205b;

    public /* synthetic */ h(AttachmentUploadOverlayView attachmentUploadOverlayView, int i7) {
        this.f4204a = i7;
        this.f4205b = attachmentUploadOverlayView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4204a) {
            case 0:
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeInAnim$lambda$11$lambda$6$lambda$5(this.f4205b, valueAnimator);
                break;
            case 1:
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeInAnim$lambda$11$lambda$8$lambda$7(this.f4205b, valueAnimator);
                break;
            case 2:
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeInAnim$lambda$11$lambda$10$lambda$9(this.f4205b, valueAnimator);
                break;
            case 3:
                AttachmentUploadOverlayView.setUploadCompleteBackgroundVisible$lambda$4$lambda$3(this.f4205b, valueAnimator);
                break;
            case 4:
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeOutAnim$lambda$17$lambda$13$lambda$12(this.f4205b, valueAnimator);
                break;
            default:
                AttachmentUploadOverlayView.uploadCompleteCheckmarkFadeOutAnim$lambda$17$lambda$15$lambda$14(this.f4205b, valueAnimator);
                break;
        }
    }
}
