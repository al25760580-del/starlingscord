package com.swmansion.rnscreens.gamma.stack.screen;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackScreenManagerDelegate;
import com.facebook.react.viewmanagers.RNSStackScreenManagerInterface;
import gn.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;
import tm.d;
import tm.f;
import tm.j;
import um.a;
import um.b;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = StackScreenViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\"B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/swmansion/rnscreens/gamma/stack/screen/StackScreenViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Ltm/f;", "Lcom/facebook/react/viewmanagers/RNSStackScreenManagerInterface;", "<init>", "()V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "reactContext", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Ltm/f;", "view", "", "addEventEmitters", "(Lcom/facebook/react/uimanager/ThemedReactContext;Ltm/f;)V", "", "", "getExportedCustomDirectEventTypeConstants", "()Ljava/util/Map;", "value", "setActivityMode", "(Ltm/f;Ljava/lang/String;)V", "setScreenKey", "", "setPreventNativeDismiss", "(Ltm/f;Z)V", "delegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "tm/j", "react-native-screens_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StackScreenViewManager extends ViewGroupManager<f> implements RNSStackScreenManagerInterface<f> {

    @NotNull
    public static final j Companion = new j();

    @NotNull
    public static final String REACT_CLASS = "RNSStackScreen";

    @NotNull
    private final ViewManagerDelegate<f> delegate;

    public StackScreenViewManager() {
        super(null, 1, null);
        this.delegate = new RNSStackScreenManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<f> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return w0.h(h.G(a.E), h.G(a.F), h.G(a.f21185i), h.G(a.f21186v), h.G(b.f21188v), h.G(a.f21187w));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(@NotNull ThemedReactContext reactContext, @NotNull f view) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        Intrinsics.checkNotNullParameter(view, "view");
        super.addEventEmitters(reactContext, view);
        if (view.getId() == -1) {
            throw new IllegalStateException("[RNScreens] StackScreen must have its tag set when registering event emitters");
        }
        ThemedReactContext reactContext2 = view.f20839d;
        int id2 = view.getId();
        Intrinsics.checkNotNullParameter(reactContext2, "reactContext");
        view.setEventEmitter$react_native_screens_release(new tm.h(reactContext2, id2));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public f createViewInstance(@NotNull ThemedReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new f(reactContext);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackScreenManagerInterface
    public void setActivityMode(@NotNull f view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (Intrinsics.areEqual(value, "attached")) {
            view.setActivityMode(d.f20835e);
        } else {
            if (!Intrinsics.areEqual(value, "detached")) {
                throw new JSApplicationIllegalArgumentException(g.e("[RNScreens] Invalid activity mode: ", value, "."));
            }
            view.setActivityMode(d.f20834d);
        }
    }

    @Override // com.facebook.react.viewmanagers.RNSStackScreenManagerInterface
    public void setPreventNativeDismiss(@NotNull f view, boolean value) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPreventNativeDismissEnabled$react_native_screens_release(value);
    }

    @Override // com.facebook.react.viewmanagers.RNSStackScreenManagerInterface
    public void setScreenKey(@NotNull f view, String value) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (value == null) {
            throw new IllegalArgumentException("[RNScreens] screenKey must not be null.");
        }
        view.setScreenKey(value);
    }
}
