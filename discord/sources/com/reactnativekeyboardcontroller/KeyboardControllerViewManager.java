package com.reactnativekeyboardcontroller;

import am.e;
import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.core.view.e1;
import com.discord.tti_measurement_view.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.KeyboardControllerViewManagerDelegate;
import com.facebook.react.viewmanagers.KeyboardControllerViewManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import e4.i;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sl.b;
import we.k;
import wl.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0005J\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0012J)\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u000eJ\u001b\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\"H\u0014¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R0\u0010,\u001a\u001e\u0012\f\u0012\n +*\u0004\u0018\u00010\u00030\u0003\u0012\f\u0012\n +*\u0004\u0018\u00010\u00000\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardControllerViewManager;", "Lcom/facebook/react/views/view/ReactViewManager;", "Lcom/facebook/react/viewmanagers/KeyboardControllerViewManagerInterface;", "Lcom/facebook/react/views/view/ReactViewGroup;", "<init>", "()V", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/facebook/react/views/view/ReactViewGroup;", "", "invalidate", "view", "onAfterUpdateTransaction", "(Lcom/facebook/react/views/view/ReactViewGroup;)V", "", "value", "setStatusBarTranslucent", "(Lcom/facebook/react/views/view/ReactViewGroup;Z)V", "setNavigationBarTranslucent", "setPreserveEdgeToEdge", "setEnabled", "root", "", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "(Lcom/facebook/react/views/view/ReactViewGroup;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "synchronizeFocusedInputLayout", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getName", "()Ljava/lang/String;", "Lwl/c;", "manager", "Lwl/c;", "Lcom/facebook/react/viewmanagers/KeyboardControllerViewManagerDelegate;", "kotlin.jvm.PlatformType", "mDelegate", "Lcom/facebook/react/viewmanagers/KeyboardControllerViewManagerDelegate;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardControllerViewManager extends ReactViewManager implements KeyboardControllerViewManagerInterface<ReactViewGroup> {

    @NotNull
    private final c manager = new c();

    @NotNull
    private final KeyboardControllerViewManagerDelegate<ReactViewGroup, KeyboardControllerViewManager> mDelegate = new KeyboardControllerViewManagerDelegate<>(this);

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<ReactViewGroup> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        this.manager.getClass();
        return MapBuilder.of(rl.c.E.f19453d, MapBuilder.of("registrationName", "onKeyboardMove"), rl.c.F.f19453d, MapBuilder.of("registrationName", "onKeyboardMoveStart"), rl.c.G.f19453d, MapBuilder.of("registrationName", "onKeyboardMoveEnd"), rl.c.H.f19453d, MapBuilder.of("registrationName", "onKeyboardMoveInteractive"), "topFocusedInputLayoutChanged", MapBuilder.of("registrationName", "onFocusedInputLayoutChanged"), "topFocusedInputTextChanged", MapBuilder.of("registrationName", "onFocusedInputTextChanged"), "topFocusedInputSelectionChanged", MapBuilder.of("registrationName", "onFocusedInputSelectionChanged"));
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KeyboardControllerView";
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        ViewTreeObserver viewTreeObserver;
        super.invalidate();
        c cVar = this.manager;
        i iVar = cVar.f22343a;
        if (iVar != null) {
            ViewGroup viewGroup = (ViewGroup) iVar.f7983w;
            if (viewGroup != null && (viewTreeObserver = viewGroup.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener((a) iVar.f7982v);
            }
            iVar.f7983w = null;
            iVar.f7982v = null;
            i.f7978x = -1;
        }
        cVar.f22343a = null;
        cVar.f22344b = null;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public ReactViewGroup createViewInstance(@NotNull ThemedReactContext context) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        Intrinsics.checkNotNullParameter(context, "context");
        c cVar = this.manager;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(context, "reactContext");
        i iVar = cVar.f22343a;
        if (iVar == null || cVar.f22344b != context) {
            if (iVar != null) {
                ViewGroup viewGroup = (ViewGroup) iVar.f7983w;
                if (viewGroup != null && (viewTreeObserver2 = viewGroup.getViewTreeObserver()) != null) {
                    viewTreeObserver2.removeOnGlobalLayoutListener((a) iVar.f7982v);
                }
                iVar.f7983w = null;
                iVar.f7982v = null;
                i.f7978x = -1;
            }
            i iVar2 = new i(context);
            cVar.f22343a = iVar2;
            if (context != null && i.f7978x != context.hashCode()) {
                i.f7978x = context.hashCode();
                ViewGroup viewGroupB = sl.c.b(context);
                iVar2.f7983w = viewGroupB;
                iVar2.F(viewGroupB);
                iVar2.f7982v = new a(iVar2, viewGroupB, 2);
                if (viewGroupB != null && (viewTreeObserver = viewGroupB.getViewTreeObserver()) != null) {
                    viewTreeObserver.addOnGlobalLayoutListener((a) iVar2.f7982v);
                }
            }
            cVar.f22344b = context;
        }
        return new e(context);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull ReactViewGroup view) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        e view2 = (e) view;
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        ThemedReactContext themedReactContext = view2.f644d;
        Activity currentActivity = themedReactContext.getCurrentActivity();
        if (currentActivity != null) {
            e1.k(currentActivity.getWindow(), false);
        }
        Activity currentActivity2 = themedReactContext.getCurrentActivity();
        if (currentActivity2 == null || (window = currentActivity2.getWindow()) == null) {
            return;
        }
        window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull ReactViewGroup root, @NotNull String commandId, ReadableArray args) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(commandId, "commandId");
        if (Intrinsics.areEqual(commandId, "synchronizeFocusedInputLayout")) {
            synchronizeFocusedInputLayout(root);
        } else {
            super.receiveCommand(root, commandId, args);
        }
    }

    @Override // com.facebook.react.viewmanagers.KeyboardControllerViewManagerInterface
    @ReactProp(name = ViewProps.ENABLED)
    public void setEnabled(@NotNull ReactViewGroup view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        e view2 = (e) view;
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setActive(value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardControllerViewManagerInterface
    @ReactProp(name = "navigationBarTranslucent")
    public void setNavigationBarTranslucent(@NotNull ReactViewGroup view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        e view2 = (e) view;
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setNavigationBarTranslucent(value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardControllerViewManagerInterface
    @ReactProp(name = "preserveEdgeToEdge")
    public void setPreserveEdgeToEdge(@NotNull ReactViewGroup view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        e view2 = (e) view;
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setPreserveEdgeToEdge(value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardControllerViewManagerInterface
    @ReactProp(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(@NotNull ReactViewGroup view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        e view2 = (e) view;
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setStatusBarTranslucent(value);
    }

    @Override // com.facebook.react.viewmanagers.KeyboardControllerViewManagerInterface
    public void synchronizeFocusedInputLayout(@NotNull ReactViewGroup view) {
        Intrinsics.checkNotNullParameter(view, "view");
        e view2 = (e) view;
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(view2, "view");
        vl.e callback$react_native_keyboard_controller_release = view2.getCallback$react_native_keyboard_controller_release();
        if (callback$react_native_keyboard_controller_release != null) {
            k kVar = callback$react_native_keyboard_controller_release.N;
        }
        b.b(view2.getReactContext(), "KeyboardController::layoutDidSynchronize", Arguments.createMap());
    }
}
