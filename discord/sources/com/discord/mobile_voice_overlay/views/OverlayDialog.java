package com.discord.mobile_voice_overlay.views;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u000eJ\b\u0010\u0014\u001a\u00020\u0015H&J\u0012\u0010\u0016\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayDialog;", "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onDialogClosed", "Lkotlin/Function1;", "", "getOnDialogClosed", "()Lkotlin/jvm/functions/Function1;", "setOnDialogClosed", "(Lkotlin/jvm/functions/Function1;)V", "closeDialog", "getClosingAnimator", "Landroid/animation/Animator;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "_", "", "isMoving", "()Z", "setMoving", "(Z)V", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayDialog.kt\ncom/discord/mobile_voice_overlay/views/OverlayDialog\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,86:1\n29#2:87\n85#2,18:88\n*S KotlinDebug\n*F\n+ 1 OverlayDialog.kt\ncom/discord/mobile_voice_overlay/views/OverlayDialog\n*L\n49#1:87\n49#1:88,18\n*E\n"})
public abstract class OverlayDialog extends OverlayBubbleWrap {

    @NotNull
    private Function1<? super OverlayDialog, Unit> onDialogClosed;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayDialog(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onDialogClosed = new com.discord.emoji.a(15);
        setOnClickListener(new e(1, this));
        WindowManager.LayoutParams windowLayoutParams = getWindowLayoutParams();
        windowLayoutParams.width = -1;
        windowLayoutParams.height = -1;
        windowLayoutParams.x = 0;
        windowLayoutParams.y = 0;
        WindowUtils.INSTANCE.addFlag(windowLayoutParams, 2);
        windowLayoutParams.dimAmount = 0.5f;
        setStateListAnimator(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDialogClosed$lambda$0(OverlayDialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    public final void closeDialog() {
        if (!isAttachedToWindow()) {
            this.onDialogClosed.invoke(this);
            return;
        }
        final Animator closingAnimator = getClosingAnimator();
        closingAnimator.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayDialog$closeDialog$lambda$4$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.getOnDialogClosed().invoke(this.this$0);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        closingAnimator.start();
        addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayDialog.closeDialog.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View v6) {
                Intrinsics.checkNotNullParameter(v6, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v6) {
                Intrinsics.checkNotNullParameter(v6, "v");
                closingAnimator.end();
            }
        });
    }

    @NotNull
    public abstract Animator getClosingAnimator();

    @NotNull
    public final Function1<OverlayDialog, Unit> getOnDialogClosed() {
        return this.onDialogClosed;
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayBubbleWrap
    public boolean isMoving() {
        return false;
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayBubbleWrap, android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        getWindowLayoutParams().x = 0;
        getWindowLayoutParams().y = 0;
        updateViewLayout();
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayBubbleWrap
    public void setMoving(boolean z5) {
    }

    public final void setOnDialogClosed(@NotNull Function1<? super OverlayDialog, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onDialogClosed = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayDialog(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onDialogClosed = new com.discord.emoji.a(15);
        setOnClickListener(new e(1, this));
        WindowManager.LayoutParams windowLayoutParams = getWindowLayoutParams();
        windowLayoutParams.width = -1;
        windowLayoutParams.height = -1;
        windowLayoutParams.x = 0;
        windowLayoutParams.y = 0;
        WindowUtils.INSTANCE.addFlag(windowLayoutParams, 2);
        windowLayoutParams.dimAmount = 0.5f;
        setStateListAnimator(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayDialog(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        this.onDialogClosed = new com.discord.emoji.a(15);
        setOnClickListener(new e(1, this));
        WindowManager.LayoutParams windowLayoutParams = getWindowLayoutParams();
        windowLayoutParams.width = -1;
        windowLayoutParams.height = -1;
        windowLayoutParams.x = 0;
        windowLayoutParams.y = 0;
        WindowUtils.INSTANCE.addFlag(windowLayoutParams, 2);
        windowLayoutParams.dimAmount = 0.5f;
        setStateListAnimator(null);
    }
}
