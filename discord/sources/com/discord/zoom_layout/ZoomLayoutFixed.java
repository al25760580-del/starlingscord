package com.discord.zoom_layout;

import am.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import com.discord.channel_spine.a;
import com.discord.react_gesture_handler.GetDiscordGestureHandlerEnabledRootViewKt;
import com.discord.zoom_layout.utils.ReactNativeScreensUtilsKt;
import com.facebook.react.uimanager.MeasureSpecAssertions;
import com.otaliastudios.zoom.ZoomEngine;
import com.otaliastudios.zoom.ZoomLayout;
import dl.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001b\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001cH\u0017¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/discord/zoom_layout/ZoomLayoutFixed;", "Lcom/otaliastudios/zoom/ZoomLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function1;", "", "onUpdate", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "", "gestureEnabled", "setGestureEnabled", "(Z)V", "Landroid/view/View;", "child", "", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onGlobalLayout", "()V", "onDetachedFromWindow", "Landroid/view/MotionEvent;", "ev", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/ScaleGestureDetector;", "pinchDetector", "Landroid/view/ScaleGestureDetector;", "Z", "Landroid/view/View$OnLayoutChangeListener;", "layoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "zoom_layout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class ZoomLayoutFixed extends ZoomLayout {
    private boolean gestureEnabled;

    @NotNull
    private final View.OnLayoutChangeListener layoutChangeListener;

    @NotNull
    private final ScaleGestureDetector pinchDetector;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomLayoutFixed(@NotNull Context context, @NotNull final Function1<? super ZoomLayoutFixed, Unit> onUpdate) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onUpdate, "onUpdate");
        this.pinchDetector = new ScaleGestureDetector(context, new ScaleGestureDetector.SimpleOnScaleGestureListener());
        this.gestureEnabled = true;
        this.layoutChangeListener = new a(3, this);
        setOverScrollHorizontal(false);
        setOverScrollVertical(false);
        setOverPinchable(false);
        getEngine().b(new d() { // from class: com.discord.zoom_layout.ZoomLayoutFixed.1
            @Override // dl.d
            public void onIdle(ZoomEngine engine) {
                Intrinsics.checkNotNullParameter(engine, "engine");
            }

            @Override // dl.d
            public void onUpdate(ZoomEngine engine, Matrix matrix) {
                Intrinsics.checkNotNullParameter(engine, "engine");
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                onUpdate.invoke(this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void layoutChangeListener$lambda$0(ZoomLayoutFixed zoomLayoutFixed, View view, int i7, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        zoomLayoutFixed.getEngine().g(view.getWidth(), view.getHeight(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMeasure$lambda$1(ZoomLayoutFixed zoomLayoutFixed) {
        zoomLayoutFixed.getViewTreeObserver().dispatchOnGlobalLayout();
    }

    @Override // com.otaliastudios.zoom.ZoomLayout, android.view.ViewGroup
    public void addView(@NotNull View child, int index, @NotNull ViewGroup.LayoutParams params) {
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(params, "params");
        ReactNativeScreensUtilsKt.maybeApplyReactNativeScreensFix(this);
        super.addView(child, index, params);
    }

    @Override // com.otaliastudios.zoom.ZoomLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.removeOnLayoutChangeListener(this.layoutChangeListener);
        }
    }

    @Override // com.otaliastudios.zoom.ZoomLayout, android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        super.onGlobalLayout();
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.addOnLayoutChangeListener(this.layoutChangeListener);
        }
    }

    @Override // com.otaliastudios.zoom.ZoomLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        MeasureSpecAssertions.assertExplicitMeasureSpec(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
        post(new c(13, this));
    }

    @Override // com.otaliastudios.zoom.ZoomLayout, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        ViewGroup discordGestureHandlerEnabledRootView;
        Intrinsics.checkNotNullParameter(ev, "ev");
        if (!this.gestureEnabled) {
            return true;
        }
        if (ev.getPointerCount() > 1 && this.pinchDetector.onTouchEvent(ev) && (discordGestureHandlerEnabledRootView = GetDiscordGestureHandlerEnabledRootViewKt.getDiscordGestureHandlerEnabledRootView(this)) != null) {
            discordGestureHandlerEnabledRootView.requestDisallowInterceptTouchEvent(true);
        }
        return super.onTouchEvent(ev);
    }

    public final void setGestureEnabled(boolean gestureEnabled) {
        this.gestureEnabled = gestureEnabled;
    }
}
