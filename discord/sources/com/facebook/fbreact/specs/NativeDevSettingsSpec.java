package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "DevSettings";

    public NativeDevSettingsSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void addMenuItem(String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "DevSettings";
    }

    @a
    @ReactMethod
    public void onFastRefresh() {
    }

    @a
    @ReactMethod
    public void openDebugger() {
    }

    @a
    @ReactMethod
    public abstract void reload();

    @a
    @ReactMethod
    public void reloadWithReason(String str) {
    }

    @a
    @ReactMethod
    public abstract void removeListeners(double d6);

    @a
    @ReactMethod
    public abstract void setHotLoadingEnabled(boolean z5);

    @a
    @ReactMethod
    public abstract void setIsShakeToShowDevMenuEnabled(boolean z5);

    @a
    @ReactMethod
    public abstract void setProfilingEnabled(boolean z5);

    @a
    @ReactMethod
    public abstract void toggleElementInspector();
}
