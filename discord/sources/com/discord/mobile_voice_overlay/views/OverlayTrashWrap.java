package com.discord.mobile_voice_overlay.views;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayAssets;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayData;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.databinding.TrashWrapBinding;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.discord.react_asset_fetcher.ReactAsset;
import com.discord.react_asset_fetcher.ReactAssetUtilsKt;
import com.discord.theme.ThemeManagerKt;
import com.discord.theme.utils.ColorUtilsKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ0\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\nH\u0014J\u0010\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020\u0018J\u0006\u0010#\u001a\u00020\u0018J\u0016\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020\u0018H\u0002J\b\u0010.\u001a\u00020\rH\u0016J\u0010\u0010/\u001a\u00020\u00182\u0006\u00100\u001a\u000201H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayTrashWrap;", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "attributeSetId", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "windowLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "binding", "Lcom/discord/mobile_voice_overlay/databinding/TrashWrapBinding;", "showAnimator", "Landroid/animation/Animator;", "hideAnimator", "trashZoneRect", "Landroid/graphics/Rect;", "locationOnScreen", "", "onLayout", "", "changed", "", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "setAssets", "assets", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayAssets;", "show", "hide", "previousBubbleOverTrashZone", "Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "processMotionEvent", "bubble", "motionEvent", "Landroid/view/MotionEvent;", "handleViewDraggedIntoTrashZone", "view", "Landroid/view/View;", "handleViewDraggedOutOfTrashZone", "getInitialLayoutParams", "setData", "data", "Lcom/discord/mobile_voice_overlay/MobileVoiceOverlayData;", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayTrashWrap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayTrashWrap.kt\ncom/discord/mobile_voice_overlay/views/OverlayTrashWrap\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,179:1\n39#2:180\n85#2,18:181\n29#2:199\n85#2,18:200\n85#2,18:218\n29#2:236\n85#2,18:237\n85#2,18:255\n29#2:273\n85#2,18:274\n*S KotlinDebug\n*F\n+ 1 OverlayTrashWrap.kt\ncom/discord/mobile_voice_overlay/views/OverlayTrashWrap\n*L\n64#1:180\n64#1:181,18\n76#1:199\n76#1:200,18\n64#1:218,18\n76#1:236\n76#1:237,18\n64#1:255,18\n76#1:273\n76#1:274,18\n*E\n"})
public final class OverlayTrashWrap extends OverlayView {

    @NotNull
    private final TrashWrapBinding binding;

    @NotNull
    private final Animator hideAnimator;

    @NotNull
    private final int[] locationOnScreen;
    private OverlayBubbleWrap previousBubbleOverTrashZone;

    @NotNull
    private final Animator showAnimator;

    @NotNull
    private final Rect trashZoneRect;

    @NotNull
    private WindowManager.LayoutParams windowLayoutParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayTrashWrap(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        WindowUtils windowUtils = WindowUtils.INSTANCE;
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = windowUtils.createWindowLayoutParams();
        layoutParamsCreateWindowLayoutParams.width = -1;
        layoutParamsCreateWindowLayoutParams.gravity = 81;
        windowUtils.addFlag(layoutParamsCreateWindowLayoutParams, 16);
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        TrashWrapBinding trashWrapBindingInflate = TrashWrapBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(trashWrapBindingInflate, "inflate(...)");
        this.binding = trashWrapBindingInflate;
        setBackgroundResource(R.drawable.trash_bg);
        setVisibility(4);
        trashWrapBindingInflate.trashWrapTargetContainer.setActivated(false);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_in);
        animatorLoadAnimator.setTarget(this);
        Unit unit = Unit.f14616a;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_in_bottom);
        animatorLoadAnimator2.setTarget(trashWrapBindingInflate.trashWrapTargetZone);
        animatorSet.playTogether(animatorLoadAnimator, animatorLoadAnimator2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayTrashWrap$showAnimator$lambda$4$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.this$0.setVisibility(0);
            }
        });
        this.showAnimator = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_out);
        animatorLoadAnimator3.setTarget(this);
        Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_out_bottom);
        animatorLoadAnimator4.setTarget(trashWrapBindingInflate.trashWrapTargetZone);
        animatorSet2.playTogether(animatorLoadAnimator3, animatorLoadAnimator4);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayTrashWrap$hideAnimator$lambda$8$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.setVisibility(4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.hideAnimator = animatorSet2;
        this.trashZoneRect = new Rect();
        this.locationOnScreen = new int[]{0, 0};
    }

    private final void handleViewDraggedIntoTrashZone(View view) {
        this.binding.trashWrapTargetContainer.setActivated(true);
        float fMax = (Math.max(Math.max(view.getWidth(), view.getHeight()), this.binding.trashWrapTargetContainer.getWidth()) / this.binding.trashWrapTargetContainer.getWidth()) + 0.5f;
        ScaleAnimation scaleAnimation = new ScaleAnimation(this.binding.trashWrapTargetContainer.getScaleX(), fMax, this.binding.trashWrapTargetContainer.getScaleY(), fMax, this.binding.trashWrapTargetContainer.getPivotX(), this.binding.trashWrapTargetContainer.getPivotY());
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillAfter(true);
        this.binding.trashWrapTargetContainer.startAnimation(scaleAnimation);
    }

    private final void handleViewDraggedOutOfTrashZone() {
        this.binding.trashWrapTargetContainer.setActivated(false);
        setActivated(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(this.binding.trashWrapTargetContainer.getScaleX(), 1.0f, this.binding.trashWrapTargetContainer.getScaleY(), 1.0f);
        scaleAnimation.setDuration(200L);
        scaleAnimation.setInterpolator(getContext(), android.R.interpolator.anticipate);
        scaleAnimation.setFillAfter(true);
        this.binding.trashWrapTargetContainer.startAnimation(scaleAnimation);
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    @NotNull
    /* JADX INFO: renamed from: getInitialLayoutParams, reason: from getter */
    public WindowManager.LayoutParams getWindowLayoutParams() {
        return this.windowLayoutParams;
    }

    public final void hide() {
        this.hideAnimator.start();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            this.binding.trashWrapTargetZone.getLocationOnScreen(this.locationOnScreen);
            int[] iArr = this.locationOnScreen;
            int i7 = iArr[0];
            int i10 = iArr[1];
            this.trashZoneRect.set(i7, i10, this.binding.trashWrapTargetZone.getWidth() + i7, this.binding.trashWrapTargetZone.getHeight() + i10);
        }
    }

    public final boolean processMotionEvent(@NotNull OverlayBubbleWrap bubble, @NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(bubble, "bubble");
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        if (!this.trashZoneRect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
            bubble = null;
        }
        boolean zIsActivated = this.binding.trashWrapTargetContainer.isActivated();
        if (bubble != null && !zIsActivated) {
            handleViewDraggedIntoTrashZone(bubble);
        } else if (bubble == null && zIsActivated) {
            handleViewDraggedOutOfTrashZone();
        }
        if (!Intrinsics.areEqual(bubble, this.previousBubbleOverTrashZone)) {
            if (bubble != null) {
                SimpleDraweeView trashWrapIcon = this.binding.trashWrapIcon;
                Intrinsics.checkNotNullExpressionValue(trashWrapIcon, "trashWrapIcon");
                bubble.anchorOn(trashWrapIcon);
            }
            performHapticFeedback(6);
            OverlayBubbleWrap overlayBubbleWrap = this.previousBubbleOverTrashZone;
            if (overlayBubbleWrap != null) {
                OverlayBubbleWrap.anchorOff$default(overlayBubbleWrap, false, 1, null);
            }
            this.previousBubbleOverTrashZone = bubble;
        }
        return bubble != null && motionEvent.getAction() == 1;
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setAssets(@NotNull MobileVoiceOverlayAssets assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        super.setAssets(assets);
        SimpleDraweeView trashWrapIcon = this.binding.trashWrapIcon;
        Intrinsics.checkNotNullExpressionValue(trashWrapIcon, "trashWrapIcon");
        ReactAssetUtilsKt.setReactAsset(trashWrapIcon, ReactAsset.XSmallIcon);
        SimpleDraweeView trashWrapIcon2 = this.binding.trashWrapIcon;
        Intrinsics.checkNotNullExpressionValue(trashWrapIcon2, "trashWrapIcon");
        ColorUtilsKt.setTintColor(trashWrapIcon2, Integer.valueOf(ThemeManagerKt.getTheme().getInteractiveTextDefault()));
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    public void setData(@NotNull MobileVoiceOverlayData data) {
        Intrinsics.checkNotNullParameter(data, "data");
    }

    public final void show() {
        this.showAnimator.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayTrashWrap(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        WindowUtils windowUtils = WindowUtils.INSTANCE;
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = windowUtils.createWindowLayoutParams();
        layoutParamsCreateWindowLayoutParams.width = -1;
        layoutParamsCreateWindowLayoutParams.gravity = 81;
        windowUtils.addFlag(layoutParamsCreateWindowLayoutParams, 16);
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        TrashWrapBinding trashWrapBindingInflate = TrashWrapBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(trashWrapBindingInflate, "inflate(...)");
        this.binding = trashWrapBindingInflate;
        setBackgroundResource(R.drawable.trash_bg);
        setVisibility(4);
        trashWrapBindingInflate.trashWrapTargetContainer.setActivated(false);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_in);
        animatorLoadAnimator.setTarget(this);
        Unit unit = Unit.f14616a;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_in_bottom);
        animatorLoadAnimator2.setTarget(trashWrapBindingInflate.trashWrapTargetZone);
        animatorSet.playTogether(animatorLoadAnimator, animatorLoadAnimator2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayTrashWrap$showAnimator$lambda$4$$inlined$doOnStart$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.this$0.setVisibility(0);
            }
        });
        this.showAnimator = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_out);
        animatorLoadAnimator3.setTarget(this);
        Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_out_bottom);
        animatorLoadAnimator4.setTarget(trashWrapBindingInflate.trashWrapTargetZone);
        animatorSet2.playTogether(animatorLoadAnimator3, animatorLoadAnimator4);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayTrashWrap$hideAnimator$lambda$8$$inlined$doOnEnd$2
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.setVisibility(4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.hideAnimator = animatorSet2;
        this.trashZoneRect = new Rect();
        this.locationOnScreen = new int[]{0, 0};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayTrashWrap(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        WindowUtils windowUtils = WindowUtils.INSTANCE;
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = windowUtils.createWindowLayoutParams();
        layoutParamsCreateWindowLayoutParams.width = -1;
        layoutParamsCreateWindowLayoutParams.gravity = 81;
        windowUtils.addFlag(layoutParamsCreateWindowLayoutParams, 16);
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        TrashWrapBinding trashWrapBindingInflate = TrashWrapBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(trashWrapBindingInflate, "inflate(...)");
        this.binding = trashWrapBindingInflate;
        setBackgroundResource(R.drawable.trash_bg);
        setVisibility(4);
        trashWrapBindingInflate.trashWrapTargetContainer.setActivated(false);
        AnimatorSet animatorSet = new AnimatorSet();
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_in);
        animatorLoadAnimator.setTarget(this);
        Unit unit = Unit.f14616a;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_in_bottom);
        animatorLoadAnimator2.setTarget(trashWrapBindingInflate.trashWrapTargetZone);
        animatorSet.playTogether(animatorLoadAnimator, animatorLoadAnimator2);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayTrashWrap$showAnimator$lambda$4$$inlined$doOnStart$3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                this.this$0.setVisibility(0);
            }
        });
        this.showAnimator = animatorSet;
        AnimatorSet animatorSet2 = new AnimatorSet();
        Animator animatorLoadAnimator3 = AnimatorInflater.loadAnimator(getContext(), R.animator.fade_out);
        animatorLoadAnimator3.setTarget(this);
        Animator animatorLoadAnimator4 = AnimatorInflater.loadAnimator(getContext(), R.animator.slide_out_bottom);
        animatorLoadAnimator4.setTarget(trashWrapBindingInflate.trashWrapTargetZone);
        animatorSet2.playTogether(animatorLoadAnimator3, animatorLoadAnimator4);
        animatorSet2.addListener(new Animator.AnimatorListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayTrashWrap$hideAnimator$lambda$8$$inlined$doOnEnd$3
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.setVisibility(4);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }
        });
        this.hideAnimator = animatorSet2;
        this.trashZoneRect = new Rect();
        this.locationOnScreen = new int[]{0, 0};
    }
}
