package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeTTIManagerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeTTIManagerModule";

    public NativeTTIManagerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void getAllNativeTimestamps(Promise promise);

    @a
    @ReactMethod
    public abstract void getAppFirstVisibleTimestamp(Promise promise);

    @a
    @ReactMethod
    public abstract void getAppStartType(Promise promise);

    @a
    @ReactMethod
    public abstract void getAppStartedTimestamp(Promise promise);

    @a
    @ReactMethod
    public abstract void getJSBundleTimestamps(Promise promise);

    @a
    @ReactMethod
    public abstract void getLaunchScenario(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void logToDevice(String str);

    @a
    @ReactMethod
    public abstract void logToDeviceEnabled(Promise promise);

    @a
    @ReactMethod
    public abstract void reportFullyDrawn();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean runningTTIAutomation();

    @a
    @ReactMethod
    public abstract void trackTTILogged();
}
