package com.reactnativekeyboardcontroller;

import am.g;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.KeyboardGestureAreaManagerDelegate;
import com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wl.d;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001c\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0017¢\u0006\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010#\u001a\u001e\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n \"*\u0004\u0018\u00010\u00000\u00000!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardGestureAreaViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerInterface;", "Lcom/facebook/react/views/view/ReactViewGroup;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "Lam/g;", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lam/g;", "view", "", "value", "", "setOffset", "(Lcom/facebook/react/views/view/ReactViewGroup;D)V", "setInterpolator", "(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;)V", "", "setShowOnSwipeUp", "(Lcom/facebook/react/views/view/ReactViewGroup;Z)V", "setEnableSwipeToDismiss", "setTextInputNativeID", "Lwl/d;", "manager", "Lwl/d;", "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;", "kotlin.jvm.PlatformType", "mDelegate", "Lcom/facebook/react/viewmanagers/KeyboardGestureAreaManagerDelegate;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardGestureAreaViewManager extends ReactViewManager implements KeyboardGestureAreaManagerInterface<ReactViewGroup> {

    @NotNull
    private final d manager = new d();

    @NotNull
    private final KeyboardGestureAreaManagerDelegate<ReactViewGroup, KeyboardGestureAreaViewManager> mDelegate = new KeyboardGestureAreaManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ReactViewGroup> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KeyboardGestureArea";
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "textInputNativeID")
    public void setTextInputNativeID(@NotNull ReactViewGroup view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "enableSwipeToDismiss")
    public void setEnableSwipeToDismiss(ReactViewGroup view, boolean value) {
        d dVar = this.manager;
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.reactnativekeyboardcontroller.views.KeyboardGestureAreaReactViewGroup");
        g view2 = (g) view;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setScrollKeyboardOffScreenWhenVisible(value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "interpolator")
    public void setInterpolator(@NotNull ReactViewGroup view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        d dVar = this.manager;
        g view2 = (g) view;
        if (value == null) {
            value = "linear";
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        Intrinsics.checkNotNullParameter(value, "interpolator");
        view2.setInterpolator(value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "offset")
    public void setOffset(@NotNull ReactViewGroup view, double value) {
        Intrinsics.checkNotNullParameter(view, "view");
        g view2 = (g) view;
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setOffset(value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardGestureAreaManagerInterface
    @ReactProp(name = "showOnSwipeUp")
    public void setShowOnSwipeUp(@NotNull ReactViewGroup view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        g view2 = (g) view;
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setScrollKeyboardOnScreenWhenNotVisible(value);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public g createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(context, "reactContext");
        return new g(context);
    }
}
