package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeJankStatsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeJankStatsModule";

    public NativeJankStatsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap requestReport();

    @a
    @ReactMethod
    public abstract void setJankHeuristicMultiplier(double d6);

    @a
    @ReactMethod
    public abstract void startTracking();

    @a
    @ReactMethod
    public abstract void stopTracking();
}
