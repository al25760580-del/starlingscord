package cm;

import android.view.View;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends ReactViewGroup {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EventDispatcher f3737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WindowManager f3738e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f3739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ThemedReactContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        EventDispatcher eventDispatcherForReactTag = UIManagerHelper.getEventDispatcherForReactTag(reactContext, getId());
        this.f3737d = eventDispatcherForReactTag;
        Object systemService = reactContext.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f3738e = (WindowManager) systemService;
        c cVar = new c(reactContext);
        this.f3739i = cVar;
        cVar.setEventDispatcher$react_native_keyboard_controller_release(eventDispatcherForReactTag);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void addChildrenForAccessibility(ArrayList outChildren) {
        Intrinsics.checkNotNullParameter(outChildren, "outChildren");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        UiThreadUtil.assertOnUiThread();
        this.f3739i.addView(view, i7);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return false;
    }

    @Override // android.view.ViewGroup
    public final View getChildAt(int i7) {
        return this.f3739i.getChildAt(i7);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f3739i.getChildCount();
    }

    public final StateWrapper getStateWrapper() {
        return this.f3739i.getStateWrapper$react_native_keyboard_controller_release();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f3739i;
        if (cVar.f3745x) {
            this.f3738e.removeView(cVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view != null) {
            this.f3739i.removeView(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i7) {
        UiThreadUtil.assertOnUiThread();
        c cVar = this.f3739i;
        cVar.removeView(cVar.getChildAt(i7));
    }

    public final void setStateWrapper(StateWrapper stateWrapper) {
        this.f3739i.setStateWrapper$react_native_keyboard_controller_release(stateWrapper);
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z5, int i7, int i10, int i11, int i12) {
    }
}
