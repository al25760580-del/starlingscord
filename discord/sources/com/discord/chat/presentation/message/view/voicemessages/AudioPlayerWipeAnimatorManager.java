package com.discord.chat.presentation.message.view.voicemessages;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import androidx.core.view.a1;
import com.discord.chat.databinding.AudioPlayerViewBinding;
import com.discord.misc.utilities.drawable.GetDrawableCompatKt;
import com.discord.misc.utilities.view.ViewClippingUtilsKt;
import com.discord.theme.R;
import com.discord.theme.ThemeManager;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.span.SimpleDraweeSpanTextView;
import com.facebook.drawee.view.SimpleDraweeView;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 12\u00020\u0001:\u00011B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010 \u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010#\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010&\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00182\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0016\u0010+\u001a\u00020,2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u001eJ \u0010.\u001a\u00020*2\u0006\u0010(\u001a\u00020\u001e2\u0006\u0010/\u001a\u0002002\u0006\u0010-\u001a\u00020\u001eH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0017\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR#\u0010\u001f\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b \u0010\u001bR#\u0010\"\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b#\u0010\u001bR#\u0010%\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b&\u0010\u001bR\u000e\u0010(\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager;", "", "context", "Landroid/content/Context;", "binding", "Lcom/discord/chat/databinding/AudioPlayerViewBinding;", "<init>", "(Landroid/content/Context;Lcom/discord/chat/databinding/AudioPlayerViewBinding;)V", "brand500", "", "argbEvaluator", "Landroid/animation/ArgbEvaluator;", "buttonContainerDefaultDrawable", "Landroid/graphics/drawable/Drawable;", "getButtonContainerDefaultDrawable", "()Landroid/graphics/drawable/Drawable;", "buttonContainerDefaultDrawable$delegate", "Lkotlin/Lazy;", "buttonContainerActiveDrawable", "Landroid/graphics/drawable/ColorDrawable;", "getButtonContainerActiveDrawable", "()Landroid/graphics/drawable/ColorDrawable;", "buttonContainerActiveDrawable$delegate", "scaleAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "getScaleAnimator", "()Landroid/animation/ValueAnimator;", "scaleAnimator$delegate", "shouldPlay", "", "textColorAnimator", "getTextColorAnimator", "textColorAnimator$delegate", "buttonIconColorAnimator", "getButtonIconColorAnimator", "buttonIconColorAnimator$delegate", "progressColorAnimator", "getProgressColorAnimator", "progressColorAnimator$delegate", "animateToPlay", "animatorSet", "Landroid/animation/AnimatorSet;", "startAnimator", "", "shouldAnimate", "getAnimatorSet", "currentPlayTime", "", "Companion", "chat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAudioPlayerWipeAnimatorManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioPlayerWipeAnimatorManager.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt\n+ 4 ColorDrawable.kt\nandroidx/core/graphics/drawable/ColorDrawableKt\n*L\n1#1,184:1\n1#2:185\n85#3,18:186\n27#4:204\n*S KotlinDebug\n*F\n+ 1 AudioPlayerWipeAnimatorManager.kt\ncom/discord/chat/presentation/message/view/voicemessages/AudioPlayerWipeAnimatorManager\n*L\n177#1:186,18\n38#1:204\n*E\n"})
public final class AudioPlayerWipeAnimatorManager {
    private static final long WASH_ANIMATION_MS = 200;
    private boolean animateToPlay;
    private AnimatorSet animatorSet;

    @NotNull
    private final ArgbEvaluator argbEvaluator;
    private final int brand500;

    /* JADX INFO: renamed from: buttonContainerActiveDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy buttonContainerActiveDrawable;

    /* JADX INFO: renamed from: buttonContainerDefaultDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy buttonContainerDefaultDrawable;

    /* JADX INFO: renamed from: buttonIconColorAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy buttonIconColorAnimator;

    /* JADX INFO: renamed from: progressColorAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy progressColorAnimator;

    /* JADX INFO: renamed from: scaleAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy scaleAnimator;

    /* JADX INFO: renamed from: textColorAnimator$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy textColorAnimator;

    public AudioPlayerWipeAnimatorManager(@NotNull Context context, @NotNull final AudioPlayerViewBinding binding) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.brand500 = context.getColor(R.color.brand_500);
        this.argbEvaluator = new ArgbEvaluator();
        this.buttonContainerDefaultDrawable = l.b(new f(context, 1));
        this.buttonContainerActiveDrawable = l.b(new com.discord.chat.presentation.list.f(21));
        this.scaleAnimator = l.b(new c6.a(10, binding, this));
        final int i7 = 0;
        this.textColorAnimator = l.b(new Function0() { // from class: com.discord.chat.presentation.message.view.voicemessages.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i7) {
                    case 0:
                        return AudioPlayerWipeAnimatorManager.textColorAnimator_delegate$lambda$9(binding);
                    case 1:
                        return AudioPlayerWipeAnimatorManager.buttonIconColorAnimator_delegate$lambda$13(binding);
                    default:
                        return AudioPlayerWipeAnimatorManager.progressColorAnimator_delegate$lambda$17(binding);
                }
            }
        });
        final int i10 = 1;
        this.buttonIconColorAnimator = l.b(new Function0() { // from class: com.discord.chat.presentation.message.view.voicemessages.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        return AudioPlayerWipeAnimatorManager.textColorAnimator_delegate$lambda$9(binding);
                    case 1:
                        return AudioPlayerWipeAnimatorManager.buttonIconColorAnimator_delegate$lambda$13(binding);
                    default:
                        return AudioPlayerWipeAnimatorManager.progressColorAnimator_delegate$lambda$17(binding);
                }
            }
        });
        final int i11 = 2;
        this.progressColorAnimator = l.b(new Function0() { // from class: com.discord.chat.presentation.message.view.voicemessages.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        return AudioPlayerWipeAnimatorManager.textColorAnimator_delegate$lambda$9(binding);
                    case 1:
                        return AudioPlayerWipeAnimatorManager.buttonIconColorAnimator_delegate$lambda$13(binding);
                    default:
                        return AudioPlayerWipeAnimatorManager.progressColorAnimator_delegate$lambda$17(binding);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ColorDrawable buttonContainerActiveDrawable_delegate$lambda$2() {
        ColorDrawable colorDrawable = new ColorDrawable(-1);
        colorDrawable.setAlpha(0);
        return colorDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Drawable buttonContainerDefaultDrawable_delegate$lambda$0(Context context) {
        return GetDrawableCompatKt.getDrawableCompat(context, ThemeManager.INSTANCE.isThemeLight() ? com.discord.chat.R.drawable.drawable_audio_play_button_gradient_light : com.discord.chat.R.drawable.drawable_audio_play_button_gradient_dark);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator buttonIconColorAnimator_delegate$lambda$13(AudioPlayerViewBinding audioPlayerViewBinding) {
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, -16777216);
        valueAnimatorOfArgb.addUpdateListener(new g(audioPlayerViewBinding, 1));
        return valueAnimatorOfArgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buttonIconColorAnimator_delegate$lambda$13$lambda$12$lambda$11(AudioPlayerViewBinding audioPlayerViewBinding, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SimpleDraweeView button = audioPlayerViewBinding.button;
        Intrinsics.checkNotNullExpressionValue(button, "button");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ColorUtilsKt.setTintColor(button, (Integer) animatedValue);
    }

    private final AnimatorSet getAnimatorSet(boolean animateToPlay, long currentPlayTime, boolean shouldAnimate) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(getScaleAnimator(animateToPlay), getTextColorAnimator(animateToPlay), getButtonIconColorAnimator(animateToPlay), getProgressColorAnimator(animateToPlay));
        animatorSet.setDuration(shouldAnimate ? WASH_ANIMATION_MS : 0L);
        if (Build.VERSION.SDK_INT >= 26) {
            animatorSet.setCurrentPlayTime(currentPlayTime);
        }
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.chat.presentation.message.view.voicemessages.AudioPlayerWipeAnimatorManager$getAnimatorSet$lambda$22$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.animatorSet = null;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        return animatorSet;
    }

    private final ColorDrawable getButtonContainerActiveDrawable() {
        return (ColorDrawable) this.buttonContainerActiveDrawable.getValue();
    }

    private final Drawable getButtonContainerDefaultDrawable() {
        return (Drawable) this.buttonContainerDefaultDrawable.getValue();
    }

    private final ValueAnimator getButtonIconColorAnimator() {
        return (ValueAnimator) this.buttonIconColorAnimator.getValue();
    }

    private final ValueAnimator getProgressColorAnimator() {
        return (ValueAnimator) this.progressColorAnimator.getValue();
    }

    private final ValueAnimator getScaleAnimator() {
        return (ValueAnimator) this.scaleAnimator.getValue();
    }

    private final ValueAnimator getTextColorAnimator() {
        return (ValueAnimator) this.textColorAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator progressColorAnimator_delegate$lambda$17(AudioPlayerViewBinding audioPlayerViewBinding) {
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(-1, ThemeManagerKt.getTheme().getInteractiveTextActive());
        valueAnimatorOfArgb.addUpdateListener(new g(audioPlayerViewBinding, 0));
        return valueAnimatorOfArgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void progressColorAnimator_delegate$lambda$17$lambda$16$lambda$15(AudioPlayerViewBinding audioPlayerViewBinding, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AudioWaveView audioWaveView = audioPlayerViewBinding.wave;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        audioWaveView.setAudioProgressPaintColor(((Integer) animatedValue).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator scaleAnimator_delegate$lambda$5(AudioPlayerViewBinding audioPlayerViewBinding, AudioPlayerWipeAnimatorManager audioPlayerWipeAnimatorManager) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new a1(1, audioPlayerViewBinding, audioPlayerWipeAnimatorManager));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scaleAnimator_delegate$lambda$5$lambda$4$lambda$3(AudioPlayerViewBinding audioPlayerViewBinding, AudioPlayerWipeAnimatorManager audioPlayerWipeAnimatorManager, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        float f2 = 1;
        float width = (((audioPlayerViewBinding.playerContainer.getWidth() <= 0 || audioPlayerViewBinding.wipe.getWidth() <= 0) ? 0.0f : (audioPlayerViewBinding.playerContainer.getWidth() / audioPlayerViewBinding.wipe.getWidth()) * 2) * fFloatValue) + f2;
        audioPlayerViewBinding.wipe.setScaleX(width);
        audioPlayerViewBinding.wipe.setScaleY(width);
        Drawable buttonContainerDefaultDrawable = audioPlayerWipeAnimatorManager.getButtonContainerDefaultDrawable();
        if (buttonContainerDefaultDrawable != null) {
            buttonContainerDefaultDrawable.setAlpha((int) ((f2 - fFloatValue) * 255));
        }
        audioPlayerWipeAnimatorManager.getButtonContainerActiveDrawable().setAlpha((int) (fFloatValue * 255));
        audioPlayerViewBinding.buttonContainer.setBackground(new LayerDrawable(new Drawable[]{audioPlayerWipeAnimatorManager.getButtonContainerDefaultDrawable(), audioPlayerWipeAnimatorManager.getButtonContainerActiveDrawable()}));
        View buttonContainer = audioPlayerViewBinding.buttonContainer;
        Intrinsics.checkNotNullExpressionValue(buttonContainer, "buttonContainer");
        ViewClippingUtilsKt.clipToCircle(buttonContainer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValueAnimator textColorAnimator_delegate$lambda$9(AudioPlayerViewBinding audioPlayerViewBinding) {
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(ThemeManagerKt.getTheme().getInteractiveTextDefault(), -1);
        valueAnimatorOfArgb.addUpdateListener(new g(audioPlayerViewBinding, 2));
        return valueAnimatorOfArgb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void textColorAnimator_delegate$lambda$9$lambda$8$lambda$7(AudioPlayerViewBinding audioPlayerViewBinding, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SimpleDraweeSpanTextView simpleDraweeSpanTextView = audioPlayerViewBinding.text;
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        simpleDraweeSpanTextView.setTextColor(((Integer) animatedValue).intValue());
    }

    public final void startAnimator(boolean animateToPlay, boolean shouldAnimate) {
        AnimatorSet animatorSet;
        long jLongValue = 0;
        if (shouldAnimate) {
            boolean z5 = this.animateToPlay;
            if (z5 == animateToPlay) {
                return;
            }
            if (z5 != animateToPlay && (animatorSet = this.animatorSet) != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    long duration = animatorSet != null ? animatorSet.getDuration() : 0L;
                    AnimatorSet animatorSet2 = this.animatorSet;
                    Long lValueOf = Long.valueOf(duration - (animatorSet2 != null ? animatorSet2.getCurrentPlayTime() : 0L));
                    long jLongValue2 = lValueOf.longValue();
                    if (0 > jLongValue2 || jLongValue2 >= 201) {
                        lValueOf = null;
                    }
                    if (lValueOf != null) {
                        jLongValue = lValueOf.longValue();
                    }
                }
                AnimatorSet animatorSet3 = this.animatorSet;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
            }
        }
        this.animateToPlay = animateToPlay;
        AnimatorSet animatorSet4 = getAnimatorSet(animateToPlay, jLongValue, shouldAnimate);
        animatorSet4.start();
        this.animatorSet = animatorSet4;
    }

    private final ValueAnimator getButtonIconColorAnimator(boolean shouldPlay) {
        ValueAnimator buttonIconColorAnimator = getButtonIconColorAnimator();
        if (shouldPlay) {
            buttonIconColorAnimator.setIntValues(-1, this.brand500);
        } else {
            buttonIconColorAnimator.setIntValues(this.brand500, -1);
        }
        buttonIconColorAnimator.setEvaluator(this.argbEvaluator);
        return buttonIconColorAnimator;
    }

    private final ValueAnimator getProgressColorAnimator(boolean shouldPlay) {
        ValueAnimator progressColorAnimator = getProgressColorAnimator();
        if (shouldPlay) {
            progressColorAnimator.setIntValues(ThemeManagerKt.getTheme().getInteractiveTextActive(), -1);
        } else {
            progressColorAnimator.setIntValues(-1, ThemeManagerKt.getTheme().getInteractiveTextActive());
        }
        progressColorAnimator.setEvaluator(this.argbEvaluator);
        return progressColorAnimator;
    }

    private final ValueAnimator getScaleAnimator(boolean shouldPlay) {
        ValueAnimator scaleAnimator = getScaleAnimator();
        if (shouldPlay) {
            scaleAnimator.setFloatValues(0.0f, 1.0f);
            return scaleAnimator;
        }
        scaleAnimator.setFloatValues(1.0f, 0.0f);
        return scaleAnimator;
    }

    private final ValueAnimator getTextColorAnimator(boolean shouldPlay) {
        ValueAnimator textColorAnimator = getTextColorAnimator();
        if (shouldPlay) {
            textColorAnimator.setIntValues(ThemeManagerKt.getTheme().getInteractiveTextDefault(), -1);
        } else {
            textColorAnimator.setIntValues(-1, ThemeManagerKt.getTheme().getInteractiveTextDefault());
        }
        textColorAnimator.setEvaluator(this.argbEvaluator);
        return textColorAnimator;
    }
}
