package com.discord.mobile_voice_overlay.views;

import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.discord.mobile_voice_overlay.R;
import com.discord.mobile_voice_overlay.utils.WindowUtils;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0015\n\u0002\b\u0013\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u000f2\b\u0010!\u001a\u0004\u0018\u00010 H\u0015¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020)H\u0016¢\u0006\u0004\b/\u0010+J\u0017\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020)H\u0016¢\u0006\u0004\b1\u0010.J'\u00105\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\b\b\u0002\u00104\u001a\u00020\f¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020\u000f2\b\b\u0002\u0010>\u001a\u00020\u0012H\u0016¢\u0006\u0004\b?\u0010\u0015J#\u0010C\u001a\u00020\u000f*\u00020@2\u0006\u0010A\u001a\u00020)2\u0006\u0010B\u001a\u00020)H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u000f2\u0006\u0010E\u001a\u000207H\u0002¢\u0006\u0004\bF\u0010GJ\u001f\u0010J\u001a\u0002072\u0006\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\tH\u0002¢\u0006\u0004\bJ\u0010KJ(\u0010O\u001a\u00020\t2\u0006\u0010L\u001a\u00020\t2\u0006\u0010M\u001a\u00020\t2\u0006\u0010N\u001a\u00020\tH\u0082\b¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000fH\u0002¢\u0006\u0004\bQ\u0010\u0011R\"\u0010R\u001a\u00020\u00168\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010\u0018\"\u0004\bU\u0010VR.\u0010X\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u000f0W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0017\u0010^\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR+\u0010g\u001a\u00020\u00122\u0006\u0010d\u001a\u00020\u00128V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010\u0015R0\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000f\u0018\u00010W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010Y\u001a\u0004\bk\u0010[\"\u0004\bl\u0010]R\u0014\u0010n\u001a\u00020m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010cR\u0016\u0010q\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010cR \u0010r\u001a\u00020@8\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\br\u0010s\u0012\u0004\bv\u0010\u0011\u001a\u0004\bt\u0010uR \u0010w\u001a\u00020@8\u0004X\u0084\u0004¢\u0006\u0012\n\u0004\bw\u0010s\u0012\u0004\by\u0010\u0011\u001a\u0004\bx\u0010uR\u0016\u0010z\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010|\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010{R\u0011\u0010H\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0011\u0010I\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u007f\u0010~¨\u0006\u0080\u0001"}, d2 = {"Lcom/discord/mobile_voice_overlay/views/OverlayBubbleWrap;", "Lcom/discord/mobile_voice_overlay/views/OverlayView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "attributeSetId", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/graphics/Rect;", "getAllowedAreaBounds", "(Landroid/content/Context;)Landroid/graphics/Rect;", "", "updateViewLayout", "()V", "", "isTouchable", "setBubbleTouchable", "(Z)V", "Landroid/view/WindowManager$LayoutParams;", "getInitialLayoutParams", "()Landroid/view/WindowManager$LayoutParams;", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "onLayout", "(ZIIII)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Landroid/view/MotionEvent;", "motionEvent", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onInterceptTouchEvent", "", "getX", "()F", "x", "setX", "(F)V", "getY", "y", "setY", "dockX", "dockY", "screenBounds", "animateToCoordinate", "(IILandroid/graphics/Rect;)V", "Landroid/graphics/Point;", "moveToAnchorPoint", "()Landroid/graphics/Point;", "Landroid/view/View;", "targetView", "anchorOn", "(Landroid/view/View;)V", "animate", "anchorOff", "Landroidx/dynamicanimation/animation/SpringAnimation;", "fromPosition", "toPosition", "animateTo", "(Landroidx/dynamicanimation/animation/SpringAnimation;FF)V", "newAnchorPoint", "setAnchorAt", "(Landroid/graphics/Point;)V", "centerX", "centerY", "setAnchorAround", "(II)Landroid/graphics/Point;", "minValue", "desiredValue", "maxValue", "boundAllowedArea", "(III)I", "computeScreenOffset", "windowLayoutParams", "Landroid/view/WindowManager$LayoutParams;", "getWindowLayoutParams", "setWindowLayoutParams", "(Landroid/view/WindowManager$LayoutParams;)V", "Lkotlin/Function1;", "touchDispatchSideEffectHandler", "Lkotlin/jvm/functions/Function1;", "getTouchDispatchSideEffectHandler$mobile_voice_overlay_release", "()Lkotlin/jvm/functions/Function1;", "setTouchDispatchSideEffectHandler$mobile_voice_overlay_release", "(Lkotlin/jvm/functions/Function1;)V", "insetMargins", "Landroid/graphics/Rect;", "getInsetMargins", "()Landroid/graphics/Rect;", "moveThresholdPx", "I", "<set-?>", "isMoving$delegate", "Lkotlin/properties/ReadWriteProperty;", "isMoving", "()Z", "setMoving", "onMovingStateChanged", "getOnMovingStateChanged", "setOnMovingStateChanged", "", "screenOffset", "[I", "deltaX", "deltaY", "springAnimationX", "Landroidx/dynamicanimation/animation/SpringAnimation;", "getSpringAnimationX", "()Landroidx/dynamicanimation/animation/SpringAnimation;", "getSpringAnimationX$annotations", "springAnimationY", "getSpringAnimationY", "getSpringAnimationY$annotations", "actualPosition", "Landroid/graphics/Point;", "anchorPosition", "getCenterX", "()I", "getCenterY", "mobile_voice_overlay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nOverlayBubbleWrap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OverlayBubbleWrap.kt\ncom/discord/mobile_voice_overlay/views/OverlayBubbleWrap\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,299:1\n291#1:311\n291#1:312\n33#2,3:300\n67#3,4:303\n37#3,2:307\n55#3:309\n72#3:310\n*S KotlinDebug\n*F\n+ 1 OverlayBubbleWrap.kt\ncom/discord/mobile_voice_overlay/views/OverlayBubbleWrap\n*L\n217#1:311\n224#1:312\n84#1:300,3\n125#1:303,4\n125#1:307,2\n125#1:309\n125#1:310\n*E\n"})
public abstract class OverlayBubbleWrap extends OverlayView {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {com.discord.chat.presentation.list.a.p(OverlayBubbleWrap.class, "isMoving", "isMoving()Z", 0)};

    @NotNull
    private Point actualPosition;
    private Point anchorPosition;
    private int deltaX;
    private int deltaY;

    @NotNull
    private final Rect insetMargins;

    /* JADX INFO: renamed from: isMoving$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty isMoving;
    private final int moveThresholdPx;
    private Function1<? super Boolean, Unit> onMovingStateChanged;

    @NotNull
    private final int[] screenOffset;

    @NotNull
    private final SpringAnimation springAnimationX;

    @NotNull
    private final SpringAnimation springAnimationY;

    @NotNull
    private Function1<? super MotionEvent, Unit> touchDispatchSideEffectHandler;

    @NotNull
    private WindowManager.LayoutParams windowLayoutParams;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayBubbleWrap(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
        layoutParamsCreateWindowLayoutParams.gravity = 51;
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        this.touchDispatchSideEffectHandler = new com.discord.emoji.a(14);
        this.insetMargins = new Rect();
        this.moveThresholdPx = getResources().getDimensionPixelOffset(R.dimen.movement_threshold_dp);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), R.drawable.bubble_state_selector));
        final Boolean bool = Boolean.FALSE;
        this.isMoving = new io.c(bool) { // from class: com.discord.mobile_voice_overlay.views.OverlayBubbleWrap$special$$inlined$observable$1
            @Override // io.c
            public void afterChange(KProperty property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                Boolean bool2 = newValue;
                boolean zBooleanValue = bool2.booleanValue();
                if (oldValue.booleanValue() == zBooleanValue) {
                    return;
                }
                Function1<Boolean, Unit> onMovingStateChanged = this.getOnMovingStateChanged();
                if (onMovingStateChanged != null) {
                    onMovingStateChanged.invoke(bool2);
                }
                if (zBooleanValue) {
                    this.performHapticFeedback(1);
                    this.getSpringAnimationX().b();
                    this.getSpringAnimationY().b();
                }
                this.setPressed(zBooleanValue);
            }
        };
        this.screenOffset = new int[2];
        SpringAnimation springAnimation = new SpringAnimation(this, SpringAnimation.f1996u);
        springAnimation.f1999a = 50.0f;
        springAnimation.f2009m.b(200.0f);
        springAnimation.f2009m.a(0.75f);
        this.springAnimationX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, SpringAnimation.f1997v);
        springAnimation2.f1999a = 50.0f;
        springAnimation2.f2009m.a(0.75f);
        springAnimation2.f2009m.b(200.0f);
        this.springAnimationY = springAnimation2;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        this.actualPosition = new Point(layoutParams.x, layoutParams.y);
    }

    public static /* synthetic */ void anchorOff$default(OverlayBubbleWrap overlayBubbleWrap, boolean z5, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: anchorOff");
        }
        if ((i7 & 1) != 0) {
            z5 = false;
        }
        overlayBubbleWrap.anchorOff(z5);
    }

    private final void animateTo(SpringAnimation springAnimation, float f2, float f7) {
        springAnimation.b();
        springAnimation.f2000b = f2;
        springAnimation.f2001c = true;
        springAnimation.a(f7);
    }

    public static /* synthetic */ void animateToCoordinate$default(OverlayBubbleWrap overlayBubbleWrap, int i7, int i10, Rect rect, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateToCoordinate");
        }
        if ((i11 & 4) != 0) {
            Context context = overlayBubbleWrap.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rect = overlayBubbleWrap.getAllowedAreaBounds(context);
        }
        overlayBubbleWrap.animateToCoordinate(i7, i10, rect);
    }

    private final int boundAllowedArea(int minValue, int desiredValue, int maxValue) {
        return Math.min(Math.max(minValue, desiredValue), maxValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void computeScreenOffset() {
        getLocationOnScreen(this.screenOffset);
        int[] iArr = this.screenOffset;
        int i7 = iArr[0];
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        iArr[0] = i7 - layoutParams.x;
        iArr[1] = iArr[1] - layoutParams.y;
    }

    public static /* synthetic */ void getSpringAnimationX$annotations() {
    }

    public static /* synthetic */ void getSpringAnimationY$annotations() {
    }

    private final Point setAnchorAround(int centerX, int centerY) {
        Point point = new Point(centerX - (getWidth() / 2), centerY - (getHeight() / 2));
        setAnchorAt(point);
        return point;
    }

    private final void setAnchorAt(Point newAnchorPoint) {
        this.actualPosition.x = (int) getX();
        this.actualPosition.y = (int) getY();
        this.anchorPosition = newAnchorPoint;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit touchDispatchSideEffectHandler$lambda$1(MotionEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f14616a;
    }

    public void anchorOff(boolean animate) {
        this.anchorPosition = null;
        this.springAnimationX.b();
        this.springAnimationY.b();
        if (animate) {
            Point point = this.actualPosition;
            animateToCoordinate$default(this, point.x, point.y, null, 4, null);
            return;
        }
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        Point point2 = this.actualPosition;
        layoutParams.x = point2.x;
        layoutParams.y = point2.y;
        updateViewLayout();
    }

    public void anchorOn(@NotNull View targetView) {
        Intrinsics.checkNotNullParameter(targetView, "targetView");
        int[] centerPointOnScreen = WindowUtils.INSTANCE.getCenterPointOnScreen(targetView, new int[2]);
        int i7 = centerPointOnScreen[0];
        int[] iArr = this.screenOffset;
        Point anchorAround = setAnchorAround(i7 - iArr[0], centerPointOnScreen[1] - iArr[1]);
        animateToCoordinate$default(this, anchorAround.x, anchorAround.y, null, 4, null);
    }

    public final void animateToCoordinate(int dockX, int dockY, @NotNull Rect screenBounds) {
        Intrinsics.checkNotNullParameter(screenBounds, "screenBounds");
        animateTo(this.springAnimationX, this.windowLayoutParams.x, Math.min(Math.max(screenBounds.left, dockX), screenBounds.right - getWidth()));
        animateTo(this.springAnimationY, this.windowLayoutParams.y, Math.min(Math.max(screenBounds.top - this.screenOffset[1], dockY), screenBounds.bottom - getHeight()));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        int action = motionEvent.getAction();
        if (action == 0) {
            this.deltaX = ((int) motionEvent.getRawX()) - this.windowLayoutParams.x;
            this.deltaY = ((int) motionEvent.getRawY()) - this.windowLayoutParams.y;
        } else if (action != 1) {
            if (action == 2) {
                if (isMoving()) {
                    this.actualPosition.x = ((int) motionEvent.getRawX()) - this.deltaX;
                    this.actualPosition.y = ((int) motionEvent.getRawY()) - this.deltaY;
                    if (isAttachedToWindow() && this.anchorPosition == null) {
                        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
                        Point point = this.actualPosition;
                        layoutParams.x = point.x;
                        layoutParams.y = point.y;
                        updateViewLayout();
                    }
                } else if (Math.abs((this.deltaX + this.windowLayoutParams.x) - ((int) motionEvent.getRawX())) > this.moveThresholdPx) {
                    setMoving(true);
                }
            }
        } else if (isMoving()) {
            setMoving(false);
        }
        this.touchDispatchSideEffectHandler.invoke(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    @NotNull
    public final Rect getAllowedAreaBounds(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Rect screenSize = WindowUtils.INSTANCE.getScreenSize(context);
        int i7 = screenSize.left;
        Rect rect = this.insetMargins;
        screenSize.left = i7 + rect.left;
        screenSize.right -= rect.right;
        screenSize.top += rect.top;
        screenSize.bottom -= rect.bottom;
        return screenSize;
    }

    public final int getCenterX() {
        return (getWidth() / 2) + this.windowLayoutParams.x;
    }

    public final int getCenterY() {
        return (getHeight() / 2) + this.windowLayoutParams.y;
    }

    @Override // com.discord.mobile_voice_overlay.views.OverlayView
    @NotNull
    /* JADX INFO: renamed from: getInitialLayoutParams, reason: from getter */
    public WindowManager.LayoutParams getWindowLayoutParams() {
        return this.windowLayoutParams;
    }

    @NotNull
    public final Rect getInsetMargins() {
        return this.insetMargins;
    }

    public final Function1<Boolean, Unit> getOnMovingStateChanged() {
        return this.onMovingStateChanged;
    }

    @NotNull
    public final SpringAnimation getSpringAnimationX() {
        return this.springAnimationX;
    }

    @NotNull
    public final SpringAnimation getSpringAnimationY() {
        return this.springAnimationY;
    }

    @NotNull
    public final Function1<MotionEvent, Unit> getTouchDispatchSideEffectHandler$mobile_voice_overlay_release() {
        return this.touchDispatchSideEffectHandler;
    }

    @NotNull
    public final WindowManager.LayoutParams getWindowLayoutParams() {
        return this.windowLayoutParams;
    }

    @Override // android.view.View
    public float getX() {
        return this.windowLayoutParams.x;
    }

    @Override // android.view.View
    public float getY() {
        return this.windowLayoutParams.y;
    }

    public boolean isMoving() {
        return ((Boolean) this.isMoving.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final Point moveToAnchorPoint() {
        Point point = this.anchorPosition;
        if (point == null) {
            return null;
        }
        Point point2 = this.actualPosition;
        point2.x = point.x;
        point2.y = point.y;
        return point;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        updateViewLayout();
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.discord.mobile_voice_overlay.views.OverlayBubbleWrap$onConfigurationChanged$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    this.this$0.computeScreenOffset();
                }
            });
        } else {
            computeScreenOffset();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "motionEvent");
        return motionEvent.getAction() == 2 ? isMoving() : super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (changed) {
            computeScreenOffset();
        }
    }

    public final void setBubbleTouchable(boolean isTouchable) {
        WindowUtils.INSTANCE.setFlagTouchable(this.windowLayoutParams, isTouchable);
        updateViewLayout();
    }

    public void setMoving(boolean z5) {
        this.isMoving.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z5));
    }

    public final void setOnMovingStateChanged(Function1<? super Boolean, Unit> function1) {
        this.onMovingStateChanged = function1;
    }

    public final void setTouchDispatchSideEffectHandler$mobile_voice_overlay_release(@NotNull Function1<? super MotionEvent, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.touchDispatchSideEffectHandler = function1;
    }

    public final void setWindowLayoutParams(@NotNull WindowManager.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "<set-?>");
        this.windowLayoutParams = layoutParams;
    }

    @Override // android.view.View
    public void setX(float x5) {
        this.windowLayoutParams.x = (int) x5;
        updateViewLayout();
    }

    @Override // android.view.View
    public void setY(float y5) {
        this.windowLayoutParams.y = (int) y5;
        updateViewLayout();
    }

    public final void updateViewLayout() {
        if (isAttachedToWindow() && getManagedByWindow()) {
            Object systemService = getContext().getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((WindowManager) systemService).updateViewLayout(this, this.windowLayoutParams);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayBubbleWrap(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
        layoutParamsCreateWindowLayoutParams.gravity = 51;
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        this.touchDispatchSideEffectHandler = new com.discord.emoji.a(14);
        this.insetMargins = new Rect();
        this.moveThresholdPx = getResources().getDimensionPixelOffset(R.dimen.movement_threshold_dp);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), R.drawable.bubble_state_selector));
        final Boolean bool = Boolean.FALSE;
        this.isMoving = new io.c(bool) { // from class: com.discord.mobile_voice_overlay.views.OverlayBubbleWrap$special$$inlined$observable$2
            @Override // io.c
            public void afterChange(KProperty property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                Boolean bool2 = newValue;
                boolean zBooleanValue = bool2.booleanValue();
                if (oldValue.booleanValue() == zBooleanValue) {
                    return;
                }
                Function1<Boolean, Unit> onMovingStateChanged = this.getOnMovingStateChanged();
                if (onMovingStateChanged != null) {
                    onMovingStateChanged.invoke(bool2);
                }
                if (zBooleanValue) {
                    this.performHapticFeedback(1);
                    this.getSpringAnimationX().b();
                    this.getSpringAnimationY().b();
                }
                this.setPressed(zBooleanValue);
            }
        };
        this.screenOffset = new int[2];
        SpringAnimation springAnimation = new SpringAnimation(this, SpringAnimation.f1996u);
        springAnimation.f1999a = 50.0f;
        springAnimation.f2009m.b(200.0f);
        springAnimation.f2009m.a(0.75f);
        this.springAnimationX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, SpringAnimation.f1997v);
        springAnimation2.f1999a = 50.0f;
        springAnimation2.f2009m.a(0.75f);
        springAnimation2.f2009m.b(200.0f);
        this.springAnimationY = springAnimation2;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        this.actualPosition = new Point(layoutParams.x, layoutParams.y);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverlayBubbleWrap(@NotNull Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Intrinsics.checkNotNullParameter(context, "context");
        WindowManager.LayoutParams layoutParamsCreateWindowLayoutParams = WindowUtils.INSTANCE.createWindowLayoutParams();
        layoutParamsCreateWindowLayoutParams.gravity = 51;
        this.windowLayoutParams = layoutParamsCreateWindowLayoutParams;
        this.touchDispatchSideEffectHandler = new com.discord.emoji.a(14);
        this.insetMargins = new Rect();
        this.moveThresholdPx = getResources().getDimensionPixelOffset(R.dimen.movement_threshold_dp);
        setStateListAnimator(AnimatorInflater.loadStateListAnimator(getContext(), R.drawable.bubble_state_selector));
        final Boolean bool = Boolean.FALSE;
        this.isMoving = new io.c(bool) { // from class: com.discord.mobile_voice_overlay.views.OverlayBubbleWrap$special$$inlined$observable$3
            @Override // io.c
            public void afterChange(KProperty property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                Boolean bool2 = newValue;
                boolean zBooleanValue = bool2.booleanValue();
                if (oldValue.booleanValue() == zBooleanValue) {
                    return;
                }
                Function1<Boolean, Unit> onMovingStateChanged = this.getOnMovingStateChanged();
                if (onMovingStateChanged != null) {
                    onMovingStateChanged.invoke(bool2);
                }
                if (zBooleanValue) {
                    this.performHapticFeedback(1);
                    this.getSpringAnimationX().b();
                    this.getSpringAnimationY().b();
                }
                this.setPressed(zBooleanValue);
            }
        };
        this.screenOffset = new int[2];
        SpringAnimation springAnimation = new SpringAnimation(this, SpringAnimation.f1996u);
        springAnimation.f1999a = 50.0f;
        springAnimation.f2009m.b(200.0f);
        springAnimation.f2009m.a(0.75f);
        this.springAnimationX = springAnimation;
        SpringAnimation springAnimation2 = new SpringAnimation(this, SpringAnimation.f1997v);
        springAnimation2.f1999a = 50.0f;
        springAnimation2.f2009m.a(0.75f);
        springAnimation2.f2009m.b(200.0f);
        this.springAnimationY = springAnimation2;
        WindowManager.LayoutParams layoutParams = this.windowLayoutParams;
        this.actualPosition = new Point(layoutParams.x, layoutParams.y);
    }
}
