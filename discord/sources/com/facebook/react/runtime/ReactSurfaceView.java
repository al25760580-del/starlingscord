package com.facebook.react.runtime;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.m0;
import androidx.core.view.u0;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.JSKeyDispatcher;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.WindowUtilKt;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mo.c0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 A2\u00020\u0001:\u0001AB\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0014J0\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0013H\u0014J\u0010\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\u0011H\u0016J\u001a\u0010#\u001a\u00020\u001a2\b\u0010$\u001a\u0004\u0018\u00010%2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020'H\u0014J\u0018\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020'2\u0006\u00101\u001a\u00020\u0011H\u0014J\u0010\u00102\u001a\u00020\u001a2\u0006\u0010/\u001a\u000203H\u0014J\u001c\u00104\u001a\u00020\u001a2\b\u00105\u001a\u0004\u0018\u00010%2\b\u00106\u001a\u0004\u0018\u00010%H\u0016J\"\u00107\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00132\b\u0010:\u001a\u0004\u0018\u00010;H\u0014J\b\u0010<\u001a\u00020\u0011H\u0016J\b\u0010=\u001a\u00020\u0011H\u0016J\n\u0010>\u001a\u0004\u0018\u00010?H\u0016J\b\u0010@\u001a\u00020\u0011H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006B"}, d2 = {"Lcom/facebook/react/runtime/ReactSurfaceView;", "Lcom/facebook/react/ReactRootView;", "context", "Landroid/content/Context;", "surface", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "<init>", "(Landroid/content/Context;Lcom/facebook/react/runtime/ReactSurfaceImpl;)V", "getSurface$ReactAndroid_release", "()Lcom/facebook/react/runtime/ReactSurfaceImpl;", "jsTouchDispatcher", "Lcom/facebook/react/uimanager/JSTouchDispatcher;", "jsPointerDispatcher", "Lcom/facebook/react/uimanager/JSPointerDispatcher;", "jsKeyDispatcher", "Lcom/facebook/react/uimanager/JSKeyDispatcher;", "wasMeasured", "", "widthMeasureSpec", "", "heightMeasureSpec", "viewportOffset", "Landroid/graphics/Point;", "getViewportOffset", "()Landroid/graphics/Point;", "onMeasure", "", "onLayout", "changed", ViewProps.LEFT, ViewProps.TOP, ViewProps.RIGHT, ViewProps.BOTTOM, "requestDisallowInterceptTouchEvent", "disallowIntercept", "onChildStartedNativeGesture", "childView", "Landroid/view/View;", "ev", "Landroid/view/MotionEvent;", "onChildEndedNativeGesture", "handleException", "t", "", "getJSModuleName", "", "dispatchJSTouchEvent", "event", "dispatchJSPointerEvent", "isCapture", "dispatchJSKeyEvent", "Landroid/view/KeyEvent;", "requestChildFocus", "child", "focused", "onFocusChanged", "gainFocus", "direction", "previouslyFocusedRect", "Landroid/graphics/Rect;", "hasActiveReactContext", "hasActiveReactInstance", "getCurrentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "isViewAttachedToReactInstance", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactSurfaceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactSurfaceView.kt\ncom/facebook/react/runtime/ReactSurfaceView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,262:1\n1#2:263\n*E\n"})
public class ReactSurfaceView extends ReactRootView {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "ReactSurfaceView";
    private int heightMeasureSpec;
    private JSKeyDispatcher jsKeyDispatcher;
    private JSPointerDispatcher jsPointerDispatcher;

    @NotNull
    private final JSTouchDispatcher jsTouchDispatcher;

    @NotNull
    private final ReactSurfaceImpl surface;
    private boolean wasMeasured;
    private int widthMeasureSpec;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/runtime/ReactSurfaceView$Companion;", "", "<init>", "()V", "TAG", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactSurfaceView(Context context, @NotNull ReactSurfaceImpl surface) {
        super(context);
        Intrinsics.checkNotNullParameter(surface, "surface");
        this.surface = surface;
        this.jsTouchDispatcher = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.jsPointerDispatcher = new JSPointerDispatcher(this);
        }
        if (ReactNativeFeatureFlags.enableKeyEvents()) {
            this.jsKeyDispatcher = new JSKeyDispatcher();
        }
    }

    private final Point getViewportOffset() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        if (!WindowUtilKt.isEdgeToEdgeFeatureFlagOn()) {
            WeakHashMap weakHashMap = u0.f1729a;
            WindowInsetsCompat windowInsetsCompatA = m0.a(this);
            if (windowInsetsCompatA != null) {
                Insets insetsF = windowInsetsCompatA.f1605a.f(129);
                Intrinsics.checkNotNullExpressionValue(insetsF, "getInsets(...)");
                iArr[0] = iArr[0] - insetsF.f1556a;
                iArr[1] = iArr[1] - insetsF.f1557b;
            }
        }
        return new Point(iArr[0], iArr[1]);
    }

    @Override // com.facebook.react.ReactRootView
    public void dispatchJSKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.jsKeyDispatcher == null) {
            if (ReactNativeFeatureFlags.enableKeyEvents()) {
                o8.a.v(TAG, "Unable to dispatch key events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            o8.a.v(TAG, "Unable to dispatch key events to JS as the React instance has not been attached");
            return;
        }
        JSKeyDispatcher jSKeyDispatcher = this.jsKeyDispatcher;
        if (jSKeyDispatcher != null) {
            jSKeyDispatcher.handleKeyEvent(event, eventDispatcher$ReactAndroid_release, this.surface.getSurfaceID());
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void dispatchJSPointerEvent(@NotNull MotionEvent event, boolean isCapture) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.jsPointerDispatcher == null) {
            if (ReactFeatureFlags.dispatchPointerEvents) {
                o8.a.v(TAG, "Unable to dispatch pointer events to JS before the dispatcher is available");
                return;
            }
            return;
        }
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            o8.a.v(TAG, "Unable to dispatch pointer events to JS as the React instance has not been attached");
            return;
        }
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.handleMotionEvent(event, eventDispatcher$ReactAndroid_release, isCapture);
        }
    }

    @Override // com.facebook.react.ReactRootView
    public void dispatchJSTouchEvent(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            o8.a.v(TAG, "Unable to dispatch touch events to JS as the React instance has not been attached");
            return;
        }
        JSTouchDispatcher jSTouchDispatcher = this.jsTouchDispatcher;
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        jSTouchDispatcher.handleTouchEvent(event, eventDispatcher$ReactAndroid_release, reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null);
    }

    @Override // com.facebook.react.ReactRootView
    public ReactContext getCurrentReactContext() {
        ReactHostImpl reactHost$ReactAndroid_release;
        if (!this.surface.isAttached$ReactAndroid_release() || (reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release()) == null) {
            return null;
        }
        return reactHost$ReactAndroid_release.getCurrentReactContext();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.ReactRoot
    @NotNull
    public String getJSModuleName() {
        return this.surface.getModuleName();
    }

    @NotNull
    /* JADX INFO: renamed from: getSurface$ReactAndroid_release, reason: from getter */
    public final ReactSurfaceImpl getSurface() {
        return this.surface;
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void handleException(@NotNull Throwable t5) {
        Intrinsics.checkNotNullParameter(t5, "t");
        String string = Objects.toString(t5.getMessage(), "");
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        IllegalViewOperationException illegalViewOperationException = new IllegalViewOperationException(string, this, t5);
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        if (reactHost$ReactAndroid_release == null) {
            throw illegalViewOperationException;
        }
        reactHost$ReactAndroid_release.handleHostException$ReactAndroid_release(illegalViewOperationException);
    }

    @Override // com.facebook.react.ReactRootView
    public boolean hasActiveReactContext() {
        if (!this.surface.isAttached$ReactAndroid_release()) {
            return false;
        }
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        return (reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null) != null;
    }

    @Override // com.facebook.react.ReactRootView
    public boolean hasActiveReactInstance() {
        ReactHostImpl reactHost$ReactAndroid_release;
        return this.surface.isAttached$ReactAndroid_release() && (reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release()) != null && reactHost$ReactAndroid_release.isInstanceInitialized$ReactAndroid_release();
    }

    @Override // com.facebook.react.ReactRootView
    public boolean isViewAttachedToReactInstance() {
        return this.surface.isAttached$ReactAndroid_release();
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void onChildEndedNativeGesture(@NotNull View childView, @NotNull MotionEvent ev) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            return;
        }
        this.jsTouchDispatcher.onChildEndedNativeGesture(ev, eventDispatcher$ReactAndroid_release);
        JSPointerDispatcher jSPointerDispatcher = this.jsPointerDispatcher;
        if (jSPointerDispatcher != null) {
            jSPointerDispatcher.onChildEndedNativeGesture();
        }
    }

    @Override // com.facebook.react.ReactRootView, com.facebook.react.uimanager.RootView
    public void onChildStartedNativeGesture(View childView, @NotNull MotionEvent ev) {
        JSPointerDispatcher jSPointerDispatcher;
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher$ReactAndroid_release = this.surface.getEventDispatcher$ReactAndroid_release();
        if (eventDispatcher$ReactAndroid_release == null) {
            return;
        }
        JSTouchDispatcher jSTouchDispatcher = this.jsTouchDispatcher;
        ReactHostImpl reactHost$ReactAndroid_release = this.surface.getReactHost$ReactAndroid_release();
        jSTouchDispatcher.onChildStartedNativeGesture(ev, eventDispatcher$ReactAndroid_release, reactHost$ReactAndroid_release != null ? reactHost$ReactAndroid_release.getCurrentReactContext() : null);
        if (childView == null || (jSPointerDispatcher = this.jsPointerDispatcher) == null) {
            return;
        }
        jSPointerDispatcher.onChildStartedNativeGesture(childView, ev, eventDispatcher$ReactAndroid_release);
    }

    @Override // com.facebook.react.ReactRootView, android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        JSKeyDispatcher jSKeyDispatcher;
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        if (ReactNativeFeatureFlags.enableKeyEvents()) {
            if (!gainFocus) {
                JSKeyDispatcher jSKeyDispatcher2 = this.jsKeyDispatcher;
                if (jSKeyDispatcher2 != null) {
                    jSKeyDispatcher2.clearFocus();
                    return;
                }
                return;
            }
            View focusedChild = getFocusedChild();
            Integer numValueOf = focusedChild != null ? Integer.valueOf(focusedChild.getId()) : null;
            if (numValueOf == null || (jSKeyDispatcher = this.jsKeyDispatcher) == null) {
                return;
            }
            jSKeyDispatcher.setFocusedView(numValueOf.intValue());
        }
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        if (this.wasMeasured && changed) {
            Point viewportOffset = getViewportOffset();
            this.surface.updateLayoutSpecs$ReactAndroid_release(this.widthMeasureSpec, this.heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        }
    }

    @Override // com.facebook.react.ReactRootView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter("ReactSurfaceView.onMeasure", "sectionName");
        c0.d("ReactSurfaceView.onMeasure");
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                iMax = Math.max(iMax, childAt.getPaddingRight() + childAt.getPaddingLeft() + childAt.getMeasuredWidth() + childAt.getLeft());
            }
            size = iMax;
        } else {
            size = View.MeasureSpec.getSize(widthMeasureSpec);
        }
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int childCount2 = getChildCount();
            int iMax2 = 0;
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt2 = getChildAt(i10);
                iMax2 = Math.max(iMax2, childAt2.getPaddingBottom() + childAt2.getPaddingTop() + childAt2.getMeasuredHeight() + childAt2.getTop());
            }
            size2 = iMax2;
        } else {
            size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        }
        setMeasuredDimension(size, size2);
        this.wasMeasured = true;
        this.widthMeasureSpec = widthMeasureSpec;
        this.heightMeasureSpec = heightMeasureSpec;
        Point viewportOffset = getViewportOffset();
        this.surface.updateLayoutSpecs$ReactAndroid_release(widthMeasureSpec, heightMeasureSpec, viewportOffset.x, viewportOffset.y);
        Trace.endSection();
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View child, View focused) {
        JSKeyDispatcher jSKeyDispatcher;
        super.requestChildFocus(child, focused);
        if (ReactNativeFeatureFlags.enableKeyEvents()) {
            Integer numValueOf = focused != null ? Integer.valueOf(focused.getId()) : null;
            if (numValueOf == null || (jSKeyDispatcher = this.jsKeyDispatcher) == null) {
                return;
            }
            jSKeyDispatcher.setFocusedView(numValueOf.intValue());
        }
    }

    @Override // com.facebook.react.ReactRootView, android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(disallowIntercept);
        }
    }
}
