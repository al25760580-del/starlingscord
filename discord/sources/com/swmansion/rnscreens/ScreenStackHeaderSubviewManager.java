package com.swmansion.rnscreens;

import android.util.Log;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.StateWrapper;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001%B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J-\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\r\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0014¢\u0006\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/k0;", "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderSubviewManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/rnscreens/k0;", "view", "type", "", "setType", "(Lcom/swmansion/rnscreens/k0;Ljava/lang/String;)V", "", "hidesSharedBackground", "setHidesSharedBackground", "(Lcom/swmansion/rnscreens/k0;Z)V", "value", "setSynchronousShadowStateUpdatesEnabled", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "props", "Lcom/facebook/react/uimanager/StateWrapper;", "stateWrapper", "", "updateState", "(Lcom/swmansion/rnscreens/k0;Lcom/facebook/react/uimanager/ReactStylesDiffMap;Lcom/facebook/react/uimanager/StateWrapper;)Ljava/lang/Object;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "com/swmansion/rnscreens/l0", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<k0> implements RNSScreenStackHeaderSubviewManagerInterface<k0> {

    @NotNull
    public static final l0 Companion = new l0();

    @NotNull
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";

    @NotNull
    private final ViewManagerDelegate<k0> delegate;

    public ScreenStackHeaderSubviewManager() {
        super(null, 1, null);
        this.delegate = new RNSScreenStackHeaderSubviewManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<k0> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface
    public void setSynchronousShadowStateUpdatesEnabled(k0 view, boolean value) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public k0 createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        k0 k0Var = new k0(context);
        k0Var.F = j0.f7205d;
        return k0Var;
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface
    @ReactProp(name = "hidesSharedBackground")
    public void setHidesSharedBackground(@NotNull k0 view, boolean hidesSharedBackground) {
        Intrinsics.checkNotNullParameter(view, "view");
        Log.w("[RNScreens]", "hidesSharedBackground prop is not available on Android");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface
    @ReactProp(name = "type")
    public void setType(@NotNull k0 view, String type) {
        j0 j0Var;
        Intrinsics.checkNotNullParameter(view, "view");
        if (type != null) {
            switch (type.hashCode()) {
                case -1364013995:
                    if (type.equals("center")) {
                        j0Var = j0.f7206e;
                        view.setType(j0Var);
                        return;
                    }
                    break;
                case 3015911:
                    if (type.equals("back")) {
                        j0Var = j0.f7208v;
                        view.setType(j0Var);
                        return;
                    }
                    break;
                case 3317767:
                    if (type.equals(ViewProps.LEFT)) {
                        j0Var = j0.f7205d;
                        view.setType(j0Var);
                        return;
                    }
                    break;
                case 108511772:
                    if (type.equals(ViewProps.RIGHT)) {
                        j0Var = j0.f7207i;
                        view.setType(j0Var);
                        return;
                    }
                    break;
                case 1778179403:
                    if (type.equals("searchBar")) {
                        j0Var = j0.f7209w;
                        view.setType(j0Var);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException(a3.e.l("Unknown type ", type));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(@NotNull k0 view, ReactStylesDiffMap props, StateWrapper stateWrapper) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setStateWrapper(stateWrapper);
        return super.updateState(view, props, stateWrapper);
    }
}
