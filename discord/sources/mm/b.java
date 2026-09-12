package mm;

import android.view.MotionEvent;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactCompoundViewGroup;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.uimanager.ThemedReactContext;
import com.swmansion.rnscreens.o;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ViewGroup implements ReactCompoundViewGroup, ReactPointerEventsView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f15887d;

    public b(ThemedReactContext context, float f2) {
        Intrinsics.checkNotNullParameter(context, "context");
        o pointerEventsProxy = new o(2);
        pointerEventsProxy.f7219e = null;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pointerEventsProxy, "pointerEventsProxy");
        super(context);
        this.f15887d = pointerEventsProxy;
        pointerEventsProxy.f7219e = new o(this);
        setFocusable(false);
        setBackgroundColor(-16777216);
        setAlpha(f2);
    }

    public final boolean getBlockGestures$react_native_screens_release() {
        return !(Math.abs(getAlpha() - 0.0f) <= 1.0E-4f);
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    @NotNull
    public PointerEvents getPointerEvents() {
        return this.f15887d.getPointerEvents();
    }

    @Override // com.facebook.react.uimanager.ReactCompoundViewGroup
    public final boolean interceptsTouchEvent(float f2, float f7) {
        return getBlockGestures$react_native_screens_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15887d.f7219e = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (getBlockGestures$react_native_screens_release()) {
            callOnClick();
        }
        return getBlockGestures$react_native_screens_release();
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public final int reactTagForTouch(float f2, float f7) {
        throw new IllegalStateException("[RNScreens] DimmingView should never be asked for the view tag!");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
    }
}
