package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeReanimatedModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "ReanimatedModule";

    public NativeReanimatedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean installTurboModule();
}
