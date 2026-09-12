package com.reactnativekeyboardcontroller;

import am.i;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.viewmanagers.KeyboardToolbarGroupViewManagerDelegate;
import com.facebook.react.viewmanagers.KeyboardToolbarGroupViewManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wl.e;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\u00000\u00000\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/reactnativekeyboardcontroller/KeyboardToolbarGroupViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lam/i;", "Lcom/facebook/react/viewmanagers/KeyboardToolbarGroupViewManagerInterface;", "<init>", "()V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lam/i;", "Lwl/e;", "manager", "Lwl/e;", "Lcom/facebook/react/viewmanagers/KeyboardToolbarGroupViewManagerDelegate;", "kotlin.jvm.PlatformType", "mDelegate", "Lcom/facebook/react/viewmanagers/KeyboardToolbarGroupViewManagerDelegate;", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class KeyboardToolbarGroupViewManager extends ViewGroupManager<i> implements KeyboardToolbarGroupViewManagerInterface<i> {

    @NotNull
    private final KeyboardToolbarGroupViewManagerDelegate<i, KeyboardToolbarGroupViewManager> mDelegate;

    @NotNull
    private final e manager;

    public KeyboardToolbarGroupViewManager() {
        super(null, 1, null);
        this.manager = new e();
        this.mDelegate = new KeyboardToolbarGroupViewManagerDelegate<>(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public ViewManagerDelegate<i> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "KeyboardToolbarGroupView";
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public i createViewInstance(@NotNull ThemedReactContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.manager.getClass();
        Intrinsics.checkNotNullParameter(context, "reactContext");
        Intrinsics.checkNotNullParameter(context, "reactContext");
        return new i(context);
    }
}
