package cm;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.JSPointerDispatcher;
import com.facebook.react.uimanager.JSTouchDispatcher;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import java.lang.reflect.InvocationTargetException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ReactViewGroup implements RootView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThemedReactContext f3740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSTouchDispatcher f3741e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f3742i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public EventDispatcher f3743v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public StateWrapper f3744w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f3745x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f3740d = reactContext;
        this.f3741e = new JSTouchDispatcher(this);
        if (ReactFeatureFlags.dispatchPointerEvents) {
            this.f3742i = new io.sentry.internal.debugmeta.c(this);
        }
    }

    public final void c(int i7, int i10) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putDouble("screenWidth", sl.c.c(i7));
        writableNativeMap.putDouble("screenHeight", sl.c.c(i10));
        StateWrapper stateWrapper = this.f3744w;
        if (stateWrapper != null) {
            stateWrapper.updateState(writableNativeMap);
        }
    }

    public final EventDispatcher getEventDispatcher$react_native_keyboard_controller_release() {
        return this.f3743v;
    }

    public final StateWrapper getStateWrapper$react_native_keyboard_controller_release() {
        return this.f3744w;
    }

    @Override // com.facebook.react.uimanager.RootView
    public final void handleException(Throwable t5) {
        Intrinsics.checkNotNullParameter(t5, "t");
        this.f3740d.getReactApplicationContext().handleException(new RuntimeException(t5));
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Point pointA = sl.a.a(this.f3740d);
        c(pointA.x, pointA.y);
        this.f3745x = true;
    }

    @Override // com.facebook.react.uimanager.RootView
    public final void onChildEndedNativeGesture(View childView, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(childView, "childView");
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher = this.f3743v;
        if (eventDispatcher != null) {
            this.f3741e.onChildEndedNativeGesture(ev, eventDispatcher);
        }
        io.sentry.internal.debugmeta.c cVar = this.f3742i;
        if (cVar != null) {
            ((JSPointerDispatcher) cVar.f12759e).onChildEndedNativeGesture();
        }
    }

    @Override // com.facebook.react.uimanager.RootView
    public final void onChildStartedNativeGesture(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        onChildStartedNativeGesture(null, ev);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c(0, 0);
        this.f3745x = false;
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public final boolean onHoverEvent(MotionEvent event) throws IllegalAccessException, InvocationTargetException {
        io.sentry.internal.debugmeta.c cVar;
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.f3743v;
        if (eventDispatcher != null && (cVar = this.f3742i) != null) {
            cVar.z0(event, eventDispatcher, false);
        }
        return super.onHoverEvent(event);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptHoverEvent(MotionEvent event) throws IllegalAccessException, InvocationTargetException {
        io.sentry.internal.debugmeta.c cVar;
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.f3743v;
        if (eventDispatcher != null && (cVar = this.f3742i) != null) {
            cVar.z0(event, eventDispatcher, true);
        }
        return super.onInterceptHoverEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent event) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.f3743v;
        if (eventDispatcher != null) {
            try {
                this.f3741e.handleTouchEvent(event, eventDispatcher);
                io.sentry.internal.debugmeta.c cVar = this.f3742i;
                if (cVar != null) {
                    cVar.z0(event, eventDispatcher, true);
                    Unit unit = Unit.f14616a;
                }
            } catch (RuntimeException unused) {
                int i7 = d.f3746a;
                Intrinsics.checkNotNullParameter("Can not handle touch event", "message");
                Unit unit2 = Unit.f14616a;
            }
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        c(i7, i10);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public final boolean onTouchEvent(MotionEvent event) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(event, "event");
        EventDispatcher eventDispatcher = this.f3743v;
        if (eventDispatcher != null) {
            try {
                this.f3741e.handleTouchEvent(event, eventDispatcher);
                io.sentry.internal.debugmeta.c cVar = this.f3742i;
                if (cVar != null) {
                    cVar.z0(event, eventDispatcher, false);
                    Unit unit = Unit.f14616a;
                }
            } catch (RuntimeException unused) {
                int i7 = d.f3746a;
                Intrinsics.checkNotNullParameter("Can not handle touch event", "message");
                Unit unit2 = Unit.f14616a;
            }
        }
        super.onTouchEvent(event);
        return true;
    }

    public final void setAttached$react_native_keyboard_controller_release(boolean z5) {
        this.f3745x = z5;
    }

    public final void setEventDispatcher$react_native_keyboard_controller_release(EventDispatcher eventDispatcher) {
        this.f3743v = eventDispatcher;
    }

    public final void setStateWrapper$react_native_keyboard_controller_release(StateWrapper stateWrapper) {
        this.f3744w = stateWrapper;
    }

    @Override // com.facebook.react.uimanager.RootView
    public final void onChildStartedNativeGesture(View view, MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        EventDispatcher eventDispatcher = this.f3743v;
        if (eventDispatcher != null) {
            this.f3741e.onChildStartedNativeGesture(ev, eventDispatcher);
            io.sentry.internal.debugmeta.c cVar = this.f3742i;
            if (cVar != null) {
                Intrinsics.checkNotNullParameter(ev, "ev");
                Intrinsics.checkNotNullParameter(eventDispatcher, "eventDispatcher");
                ((JSPointerDispatcher) cVar.f12759e).onChildStartedNativeGesture(view, ev, eventDispatcher);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z5) {
    }
}
