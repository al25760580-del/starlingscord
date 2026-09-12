package com.discord.mobile_voice_overlay;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.r0;
import co.s;
import com.discord.chat.presentation.message.t;
import com.discord.misc.utilities.threading.ThreadUtilsKt;
import com.discord.mobile_voice_overlay.utils.OverlayViewProvider;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.discord.mobile_voice_overlay.views.OverlayBubbleWrap;
import com.discord.mobile_voice_overlay.views.OverlayDialog;
import com.discord.mobile_voice_overlay.views.OverlayMenuBubbleDialog;
import com.discord.mobile_voice_overlay.views.OverlayTrashWrap;
import com.discord.mobile_voice_overlay.views.OverlayVoiceBubble;
import com.discord.mobile_voice_overlay.views.OverlayVoiceSelectorBubbleDialog;
import com.discord.primitives.ChannelId;
import com.discord.react.headless_tasks.api.HeadlessTasks;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.bridge.ReactApplicationContext;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u0018J\r\u0010\u0019\u001a\u00020\u0006H\u0001¢\u0006\u0002\b\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0015\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\b\u0010!\u001a\u00020\u0006H\u0002J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay;", "", "context", "Lcom/facebook/react/bridge/ReactApplicationContext;", "emitOnLayoutTrashed", "Lkotlin/Function0;", "", "emitOnChannelQueryUpdate", "Lkotlin/Function1;", "", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "voiceBubbleProvider", "Lcom/discord/mobile_voice_overlay/utils/OverlayViewProvider;", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceBubble;", "trashWrapProvider", "Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;", "menuDialogProvider", "Lcom/discord/mobile_voice_overlay/views/OverlayMenuBubbleDialog;", "selectorDialogProvider", "Lcom/discord/mobile_voice_overlay/views/OverlayVoiceSelectorBubbleDialog;", "showOverlay", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "showOverlay$mobile_voice_overlay_release", "hideOverlay", "hideOverlay$mobile_voice_overlay_release", "isOverlayShowing", "", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "setData$mobile_voice_overlay_release", "onTrashVoiceBubble", "floatBubbleToHorizontalEdge", "bubble", "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "closeMenuDialog", "Companion", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMobileVoiceOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobileVoiceOverlay.kt\ncom/discord/mobile_voice_overlay/MobileVoiceOverlay\n+ 2 ThreadUtils.kt\ncom/discord/misc/utilities/threading/ThreadUtilsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,215:1\n17#2,5:216\n17#2,5:221\n17#2,5:226\n339#3,28:231\n29#4:259\n85#4,18:260\n*S KotlinDebug\n*F\n+ 1 MobileVoiceOverlay.kt\ncom/discord/mobile_voice_overlay/MobileVoiceOverlay\n*L\n133#1:216,5\n147#1:221,5\n158#1:226,5\n44#1:231,28\n171#1:259\n171#1:260,18\n*E\n"})
public final class MobileVoiceOverlay {

    @NotNull
    private static final String ANCHOR_TAG = "Active Voice Bubble";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ReactApplicationContext context;

    @NotNull
    private final Function1<String, Unit> emitOnChannelQueryUpdate;

    @NotNull
    private final Function0<Unit> emitOnLayoutTrashed;

    @NotNull
    private final OverlayViewProvider<OverlayMenuBubbleDialog> menuDialogProvider;

    @NotNull
    private final OverlayViewProvider<OverlayVoiceSelectorBubbleDialog> selectorDialogProvider;

    @NotNull
    private final OverlayViewProvider<OverlayTrashWrap> trashWrapProvider;

    @NotNull
    private final OverlayViewProvider<OverlayVoiceBubble> voiceBubbleProvider;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/mobile_voice_overlay/MobileVoiceOverlay$Companion;", "", "<init>", "()V", "ANCHOR_TAG", "", "startHeadlessTask", "", "context", "Landroid/content/Context;", "taskName", "taskParams", "Landroid/os/Bundle;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void startHeadlessTask$default(Companion companion, Context context, String str, Bundle bundle, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                bundle = Bundle.EMPTY;
            }
            companion.startHeadlessTask(context, str, bundle);
        }

        public final void startHeadlessTask(@NotNull Context context, @NotNull String taskName, @NotNull Bundle taskParams) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(taskName, "taskName");
            Intrinsics.checkNotNullParameter(taskParams, "taskParams");
            HeadlessTasks.Companion.startHeadlessTask$default(HeadlessTasks.INSTANCE, context, taskName, 0L, false, taskParams, false, 12, null);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MobileVoiceOverlay(@NotNull ReactApplicationContext context, @NotNull Function0<Unit> emitOnLayoutTrashed, @NotNull Function1<? super String, Unit> emitOnChannelQueryUpdate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(emitOnLayoutTrashed, "emitOnLayoutTrashed");
        Intrinsics.checkNotNullParameter(emitOnChannelQueryUpdate, "emitOnChannelQueryUpdate");
        this.context = context;
        this.emitOnLayoutTrashed = emitOnLayoutTrashed;
        this.emitOnChannelQueryUpdate = emitOnChannelQueryUpdate;
        this.voiceBubbleProvider = new OverlayViewProvider<>(new a(this, 1));
        this.trashWrapProvider = new OverlayViewProvider<>(new a(this, 2));
        this.menuDialogProvider = new OverlayViewProvider<>(new a(this, 3));
        this.selectorDialogProvider = new OverlayViewProvider<>(new a(this, 4));
    }

    private final void closeMenuDialog() {
        this.menuDialogProvider.removeViewFromOverlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void floatBubbleToHorizontalEdge(OverlayBubbleWrap bubble) {
        if (bubble.getCenterX() > WindowUtils.INSTANCE.getScreenSize(this.context).centerX()) {
            OverlayBubbleWrap.animateToCoordinate$default(bubble, Integer.MAX_VALUE, (int) bubble.getY(), null, 4, null);
        } else {
            OverlayBubbleWrap.animateToCoordinate$default(bubble, Integer.MIN_VALUE, (int) bubble.getY(), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isOverlayShowing() {
        return this.trashWrapProvider.isInOverlay() && this.voiceBubbleProvider.isInOverlay();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverlayMenuBubbleDialog menuDialogProvider$lambda$14(MobileVoiceOverlay mobileVoiceOverlay, OverlayViewProvider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OverlayMenuBubbleDialog overlayMenuBubbleDialog = new OverlayMenuBubbleDialog(mobileVoiceOverlay.context);
        overlayMenuBubbleDialog.getInsetMargins().top = overlayMenuBubbleDialog.getResources().getDimensionPixelOffset(R.dimen.vertical_safe_margin);
        overlayMenuBubbleDialog.setOnDialogClosed(new a(mobileVoiceOverlay, 5));
        overlayMenuBubbleDialog.setOnShowSelectorDialog(new r0(23, mobileVoiceOverlay));
        return overlayMenuBubbleDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit menuDialogProvider$lambda$14$lambda$13$lambda$11(MobileVoiceOverlay mobileVoiceOverlay, OverlayDialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mobileVoiceOverlay.closeMenuDialog();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit menuDialogProvider$lambda$14$lambda$13$lambda$12(MobileVoiceOverlay mobileVoiceOverlay) {
        mobileVoiceOverlay.selectorDialogProvider.showViewOnOverlay();
        return Unit.f14616a;
    }

    private final void onTrashVoiceBubble() {
        this.voiceBubbleProvider.withView(new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTrashVoiceBubble$lambda$26(final MobileVoiceOverlay mobileVoiceOverlay, OverlayVoiceBubble voiceBubble) {
        Intrinsics.checkNotNullParameter(voiceBubble, "voiceBubble");
        voiceBubble.moveToAnchorPoint();
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(voiceBubble.getContext(), R.animator.fade_out);
        animatorLoadAnimator.setTarget(voiceBubble);
        Intrinsics.checkNotNull(animatorLoadAnimator);
        animatorLoadAnimator.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$onTrashVoiceBubble$lambda$26$lambda$25$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                if (ThreadUtilsKt.isOnMainThread()) {
                    this.this$0.emitOnLayoutTrashed.invoke();
                    return;
                }
                Handler uiHandler = ThreadUtilsKt.getUiHandler();
                final MobileVoiceOverlay mobileVoiceOverlay2 = this.this$0;
                uiHandler.post(new Runnable() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$onTrashVoiceBubble$lambda$26$lambda$25$lambda$24$$inlined$postOrRunOnMainThread$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        mobileVoiceOverlay2.emitOnLayoutTrashed.invoke();
                    }
                });
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        animatorLoadAnimator.start();
        OverlayBubbleWrap.animateToCoordinate$default(voiceBubble, (int) voiceBubble.getX(), (voiceBubble.getHeight() / 2) + ((int) voiceBubble.getY()), null, 4, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverlayVoiceSelectorBubbleDialog selectorDialogProvider$lambda$19(MobileVoiceOverlay mobileVoiceOverlay, OverlayViewProvider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        OverlayVoiceSelectorBubbleDialog overlayVoiceSelectorBubbleDialog = new OverlayVoiceSelectorBubbleDialog(mobileVoiceOverlay.context);
        overlayVoiceSelectorBubbleDialog.setOnDialogClosed(new s(15, provider));
        overlayVoiceSelectorBubbleDialog.setOnTextChanged(new a(mobileVoiceOverlay, 6));
        overlayVoiceSelectorBubbleDialog.setOnChannelSelected(new s(16, overlayVoiceSelectorBubbleDialog));
        return overlayVoiceSelectorBubbleDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectorDialogProvider$lambda$19$lambda$18$lambda$15(OverlayViewProvider overlayViewProvider, OverlayDialog it) {
        Intrinsics.checkNotNullParameter(it, "it");
        overlayViewProvider.removeViewFromOverlay();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectorDialogProvider$lambda$19$lambda$18$lambda$16(MobileVoiceOverlay mobileVoiceOverlay, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        mobileVoiceOverlay.emitOnChannelQueryUpdate.invoke(text);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectorDialogProvider$lambda$19$lambda$18$lambda$17(OverlayVoiceSelectorBubbleDialog overlayVoiceSelectorBubbleDialog, ChannelId channelId) {
        Companion companion = INSTANCE;
        Context context = overlayVoiceSelectorBubbleDialog.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        companion.startHeadlessTask(context, "SelectVoiceChannel", zs.a.f(new Pair("channelId", String.valueOf(channelId.m1139unboximpl())), new Pair("connectToVoice", Boolean.TRUE)));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverlayTrashWrap trashWrapProvider$lambda$10(MobileVoiceOverlay mobileVoiceOverlay, OverlayViewProvider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new OverlayTrashWrap(mobileVoiceOverlay.context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OverlayVoiceBubble voiceBubbleProvider$lambda$9(final MobileVoiceOverlay mobileVoiceOverlay, OverlayViewProvider it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int dimensionPixelOffset = mobileVoiceOverlay.context.getResources().getDimensionPixelOffset(R.dimen.overlay_safe_margin);
        final OverlayVoiceBubble overlayVoiceBubble = new OverlayVoiceBubble(mobileVoiceOverlay.context);
        int i7 = -dimensionPixelOffset;
        overlayVoiceBubble.getInsetMargins().set(i7, dimensionPixelOffset, i7, dimensionPixelOffset);
        overlayVoiceBubble.setOnClickListener(new t(15, overlayVoiceBubble, mobileVoiceOverlay));
        final int i10 = 0;
        overlayVoiceBubble.setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(new Function1(mobileVoiceOverlay) { // from class: com.discord.mobile_voice_overlay.c

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MobileVoiceOverlay f4504e;

            {
                this.f4504e = mobileVoiceOverlay;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i10) {
                    case 0:
                        return MobileVoiceOverlay.voiceBubbleProvider$lambda$9$lambda$6(this.f4504e, overlayVoiceBubble, (MotionEvent) obj);
                    default:
                        return MobileVoiceOverlay.voiceBubbleProvider$lambda$9$lambda$8(this.f4504e, overlayVoiceBubble, ((Boolean) obj).booleanValue());
                }
            }
        });
        final int i11 = 1;
        overlayVoiceBubble.setOnMovingStateChanged(new Function1(mobileVoiceOverlay) { // from class: com.discord.mobile_voice_overlay.c

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MobileVoiceOverlay f4504e;

            {
                this.f4504e = mobileVoiceOverlay;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i11) {
                    case 0:
                        return MobileVoiceOverlay.voiceBubbleProvider$lambda$9$lambda$6(this.f4504e, overlayVoiceBubble, (MotionEvent) obj);
                    default:
                        return MobileVoiceOverlay.voiceBubbleProvider$lambda$9$lambda$8(this.f4504e, overlayVoiceBubble, ((Boolean) obj).booleanValue());
                }
            }
        });
        return overlayVoiceBubble;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void voiceBubbleProvider$lambda$9$lambda$4(OverlayVoiceBubble overlayVoiceBubble, MobileVoiceOverlay mobileVoiceOverlay, View view) {
        SimpleDraweeView imageView$mobile_voice_overlay_release = overlayVoiceBubble.getImageView$mobile_voice_overlay_release();
        Intrinsics.checkNotNull(imageView$mobile_voice_overlay_release, "null cannot be cast to non-null type android.view.View");
        ViewGroup.LayoutParams layoutParams = imageView$mobile_voice_overlay_release.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i7 = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = imageView$mobile_voice_overlay_release.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i10 = marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = imageView$mobile_voice_overlay_release.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i11 = marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0;
        ViewGroup.LayoutParams layoutParams4 = imageView$mobile_voice_overlay_release.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        mobileVoiceOverlay.menuDialogProvider.withView(new b7.a(23, overlayVoiceBubble, new Rect(i7, i10, i11, marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0)));
        overlayVoiceBubble.setBubbleTouchable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceBubbleProvider$lambda$9$lambda$4$lambda$3(final OverlayVoiceBubble overlayVoiceBubble, Rect rect, OverlayMenuBubbleDialog menuDialog) {
        Intrinsics.checkNotNullParameter(menuDialog, "menuDialog");
        ViewGroup.LayoutParams layoutParams = menuDialog.getLinkedAnchorView().getLayoutParams();
        layoutParams.width = (overlayVoiceBubble.getWidth() - rect.left) - rect.right;
        layoutParams.height = overlayVoiceBubble.getHeight();
        menuDialog.getLinkedAnchorView().requestLayout();
        menuDialog.getLinkedAnchorView().setTag(ANCHOR_TAG);
        menuDialog.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$1$1$2
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(final View v6) {
                Intrinsics.checkNotNullParameter(v6, "v");
                final OverlayVoiceBubble overlayVoiceBubble2 = overlayVoiceBubble;
                if (!v6.isLaidOut() || v6.isLayoutRequested()) {
                    v6.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$voiceBubbleProvider$1$1$1$2$onViewAttachedToWindow$$inlined$doOnLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view.removeOnLayoutChangeListener(this);
                            View viewFindViewWithTag = v6.findViewWithTag("Active Voice Bubble");
                            Intrinsics.checkNotNullExpressionValue(viewFindViewWithTag, "findViewWithTag(...)");
                            overlayVoiceBubble2.anchorOn(viewFindViewWithTag);
                        }
                    });
                    return;
                }
                View viewFindViewWithTag = v6.findViewWithTag("Active Voice Bubble");
                Intrinsics.checkNotNullExpressionValue(viewFindViewWithTag, "findViewWithTag(...)");
                overlayVoiceBubble2.anchorOn(viewFindViewWithTag);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View v6) {
                Intrinsics.checkNotNullParameter(v6, "v");
                if (overlayVoiceBubble.isAttachedToWindow()) {
                    overlayVoiceBubble.setBubbleTouchable(true);
                    overlayVoiceBubble.anchorOff(true);
                }
            }
        });
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceBubbleProvider$lambda$9$lambda$6(MobileVoiceOverlay mobileVoiceOverlay, OverlayVoiceBubble overlayVoiceBubble, MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        mobileVoiceOverlay.trashWrapProvider.withView(new com.discord.age_assurance.a(overlayVoiceBubble, event, mobileVoiceOverlay, 8));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceBubbleProvider$lambda$9$lambda$6$lambda$5(OverlayVoiceBubble overlayVoiceBubble, MotionEvent motionEvent, MobileVoiceOverlay mobileVoiceOverlay, OverlayTrashWrap trashWrap) {
        Intrinsics.checkNotNullParameter(trashWrap, "trashWrap");
        if (trashWrap.processMotionEvent(overlayVoiceBubble, motionEvent)) {
            mobileVoiceOverlay.onTrashVoiceBubble();
        }
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceBubbleProvider$lambda$9$lambda$8(final MobileVoiceOverlay mobileVoiceOverlay, final OverlayVoiceBubble overlayVoiceBubble, final boolean z5) {
        mobileVoiceOverlay.trashWrapProvider.withView(new Function1(mobileVoiceOverlay) { // from class: com.discord.mobile_voice_overlay.b

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ MobileVoiceOverlay f4501e;

            {
                this.f4501e = mobileVoiceOverlay;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MobileVoiceOverlay.voiceBubbleProvider$lambda$9$lambda$8$lambda$7(z5, this.f4501e, overlayVoiceBubble, (OverlayTrashWrap) obj);
            }
        });
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit voiceBubbleProvider$lambda$9$lambda$8$lambda$7(boolean z5, MobileVoiceOverlay mobileVoiceOverlay, OverlayVoiceBubble overlayVoiceBubble, OverlayTrashWrap trashWrap) {
        Intrinsics.checkNotNullParameter(trashWrap, "trashWrap");
        if (z5) {
            trashWrap.show();
        } else {
            trashWrap.hide();
            mobileVoiceOverlay.floatBubbleToHorizontalEdge(overlayVoiceBubble);
        }
        return Unit.f14616a;
    }

    public final void hideOverlay$mobile_voice_overlay_release() {
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.selectorDialogProvider.removeViewFromOverlay();
        this.menuDialogProvider.removeViewFromOverlay();
        this.voiceBubbleProvider.removeViewFromOverlay();
        this.trashWrapProvider.removeViewFromOverlay();
    }

    public final void setData$mobile_voice_overlay_release(@NotNull MobileVoiceOverlayData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.voiceBubbleProvider.setData(data);
        this.menuDialogProvider.setData(data);
        this.selectorDialogProvider.setData(data);
        this.trashWrapProvider.setData(data);
    }

    public final void showOverlay$mobile_voice_overlay_release(@NotNull MobileVoiceOverlayAssets assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        if (!ThreadUtilsKt.isOnMainThread()) {
            throw new IllegalStateException(com.discord.chat.presentation.list.a.i("Expected to be on android main thread. Current: ", Thread.currentThread()).toString());
        }
        this.selectorDialogProvider.setAssets(assets);
        this.menuDialogProvider.setAssets(assets);
        this.voiceBubbleProvider.setAssets(assets);
        this.trashWrapProvider.setAssets(assets);
        if (isOverlayShowing()) {
            return;
        }
        this.voiceBubbleProvider.withView(new Function1<OverlayVoiceBubble, Unit>() { // from class: com.discord.mobile_voice_overlay.MobileVoiceOverlay$showOverlay$1$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((OverlayVoiceBubble) obj);
                return Unit.f14616a;
            }

            public final void invoke(OverlayVoiceBubble it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.floatBubbleToHorizontalEdge(it);
            }
        });
    }
}
