package com.facebook.react.modules.appstate;

import a3.e;
import android.app.ActivityManager;
import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o8.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@ReactModule(name = "AppState")
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0001\u0018\u0000 $2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001$B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0014\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u000bH\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010\u001e\u001a\u00020\u0010H\u0002J\u0012\u0010\u001f\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/appstate/AppStateModule;", "Lcom/facebook/fbreact/specs/NativeAppStateSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/WindowFocusChangeListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "appState", "", "isAppForegroundedByMemoryState", "", "getTypedExportedConstants", "", "", "getCurrentAppState", "", "success", "Lcom/facebook/react/bridge/Callback;", "error", "onHostResume", "onHostPause", "onHostDestroy", "onWindowFocusChange", "hasFocus", "createAppStateEventMap", "Lcom/facebook/react/bridge/WritableMap;", "sendEvent", "eventName", "data", "sendAppStateChangeEvent", "addListener", "removeListeners", "count", "", "invalidate", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppStateModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStateModule.kt\ncom/facebook/react/modules/appstate/AppStateModule\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,116:1\n1#2:117\n*E\n"})
public final class AppStateModule extends NativeAppStateSpec implements LifecycleEventListener, WindowFocusChangeListener {

    @NotNull
    public static final String APP_STATE_ACTIVE = "active";

    @NotNull
    public static final String APP_STATE_BACKGROUND = "background";

    @NotNull
    private static final String INITIAL_STATE = "initialAppState";

    @NotNull
    public static final String NAME = "AppState";

    @NotNull
    private String appState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppStateModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        reactContext.addLifecycleEventListener(this);
        reactContext.addWindowFocusChangeListener(this);
        boolean zIsAppForegroundedByMemoryState = isAppForegroundedByMemoryState();
        a.v("AppStateModule", "initial isAppForegroundedByMemoryState = " + zIsAppForegroundedByMemoryState + ", reactContext.lifecycleState = " + reactContext.getLifecycleState());
        LifecycleState lifecycleState = reactContext.getLifecycleState();
        LifecycleState lifecycleState2 = LifecycleState.RESUMED;
        String str = APP_STATE_ACTIVE;
        if (lifecycleState != lifecycleState2 && ((reactContext.getLifecycleState() != LifecycleState.BEFORE_CREATE || !zIsAppForegroundedByMemoryState) && !zIsAppForegroundedByMemoryState)) {
            str = APP_STATE_BACKGROUND;
        }
        this.appState = str;
    }

    private final WritableMap createAppStateEventMap() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("app_state", this.appState);
        return writableMapCreateMap;
    }

    private final boolean isAppForegroundedByMemoryState() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo.importance == 100;
    }

    private final void sendAppStateChangeEvent() {
        sendEvent("appStateDidChange", createAppStateEventMap());
    }

    private final void sendEvent(String eventName, Object data) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null && reactApplicationContext.hasActiveReactInstance()) {
            reactApplicationContext.emitDeviceEvent(eventName, data);
        }
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void addListener(String eventName) {
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void getCurrentAppState(@NotNull Callback success, Callback error) {
        Intrinsics.checkNotNullParameter(success, "success");
        success.invoke(createAppStateEventMap());
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        return e.v(INITIAL_STATE, this.appState);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.appState = APP_STATE_BACKGROUND;
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.appState = APP_STATE_ACTIVE;
        sendAppStateChangeEvent();
    }

    @Override // com.facebook.react.bridge.WindowFocusChangeListener
    public void onWindowFocusChange(boolean hasFocus) {
        sendEvent("appStateFocusChange", Boolean.valueOf(hasFocus));
    }

    @Override // com.facebook.fbreact.specs.NativeAppStateSpec
    public void removeListeners(double count) {
    }
}
