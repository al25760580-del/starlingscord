package com.discord.chat.presentation.message.view.voicemessages;

import android.animation.ValueAnimator;
import com.discord.chat.databinding.AudioPlayerViewBinding;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioPlayerViewBinding f4282b;

    public /* synthetic */ g(AudioPlayerViewBinding audioPlayerViewBinding, int i7) {
        this.f4281a = i7;
        this.f4282b = audioPlayerViewBinding;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4281a) {
            case 0:
                AudioPlayerWipeAnimatorManager.progressColorAnimator_delegate$lambda$17$lambda$16$lambda$15(this.f4282b, valueAnimator);
                break;
            case 1:
                AudioPlayerWipeAnimatorManager.buttonIconColorAnimator_delegate$lambda$13$lambda$12$lambda$11(this.f4282b, valueAnimator);
                break;
            default:
                AudioPlayerWipeAnimatorManager.textColorAnimator_delegate$lambda$9$lambda$8$lambda$7(this.f4282b, valueAnimator);
                break;
        }
    }
}
