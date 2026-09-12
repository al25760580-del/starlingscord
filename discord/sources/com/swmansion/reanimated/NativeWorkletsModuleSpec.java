package com.swmansion.reanimated;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeWorkletsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "WorkletsModule";

    public NativeWorkletsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean installTurboModule(String str);
}
