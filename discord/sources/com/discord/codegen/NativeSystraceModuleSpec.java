package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeSystraceModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeSystraceModule";

    public NativeSystraceModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double beginAsyncEvent(String str);

    @a
    @ReactMethod
    public abstract void beginEvent(String str);

    @a
    @ReactMethod
    public abstract void counterEvent(String str, double d6);

    @a
    @ReactMethod
    public abstract void endAsyncEvent(String str, double d6);

    @a
    @ReactMethod
    public abstract void endEvent();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isEnabled();
}
