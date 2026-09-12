package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeTTIModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeTTIModule";

    public NativeTTIModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void getAndroidArtProfileTelemetry(Promise promise);

    @a
    @ReactMethod
    public abstract void getJavaBaselineProfileCompilationStatus(Promise promise);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getLaunchScenario();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract Double getMainActivityCreationTime();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean getWasBroadcastReceiverStartedBefore();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean getWasServiceStartedBefore();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean wasInitializeCompleteWhenActivityOpened();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean wasLaunchedViaShortcut();

    @a
    @ReactMethod
    public abstract void yieldConfig(Promise promise);
}
