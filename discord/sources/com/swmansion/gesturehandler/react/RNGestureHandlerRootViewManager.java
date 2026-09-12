package com.swmansion.gesturehandler.react;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNGestureHandlerRootViewManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerRootViewManagerInterface;
import java.util.Map;
import jm.m;
import jm.n;
import jm.o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = RNGestureHandlerRootViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\"B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001c0\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Ljm/n;", "Lcom/facebook/react/viewmanagers/RNGestureHandlerRootViewManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Ljm/n;", "view", "", "onDropViewInstance", "(Ljm/n;)V", "", "value", "setModuleId", "(Ljm/n;I)V", "", AppStateModule.APP_STATE_ACTIVE, "setUnstable_forceActive", "(Ljm/n;Z)V", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "jm/o", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerRootViewManager extends ViewGroupManager<n> implements RNGestureHandlerRootViewManagerInterface<n> {

    @NotNull
    public static final o Companion = new o();

    @NotNull
    public static final String REACT_CLASS = "RNGestureHandlerRootView";

    @NotNull
    private final ViewManagerDelegate<n> mDelegate;

    public RNGestureHandlerRootViewManager() {
        super(null, 1, null);
        this.mDelegate = new RNGestureHandlerRootViewManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<n> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Map<String, String>> getExportedCustomDirectEventTypeConstants() {
        return w0.h(new Pair("onGestureHandlerEvent", w0.h(new Pair("registrationName", "onGestureHandlerEvent"))), new Pair("onGestureHandlerStateChange", w0.h(new Pair("registrationName", "onGestureHandlerStateChange"))));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public n createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        n nVar = new n(reactContext);
        nVar.f13969d = -1;
        return nVar;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(@NotNull n view) {
        Intrinsics.checkNotNullParameter(view, "view");
        m mVar = view.f13972v;
        if (mVar != null) {
            mVar.b();
        }
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerRootViewManagerInterface
    public void setModuleId(@NotNull n view, int value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setModuleId(value);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerRootViewManagerInterface
    @ReactProp(name = "unstable_forceActive")
    public void setUnstable_forceActive(@NotNull n view, boolean active) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setUnstableForceActive(active);
    }
}
