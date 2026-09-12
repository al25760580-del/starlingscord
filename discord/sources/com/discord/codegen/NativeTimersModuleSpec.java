package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeTimersModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeTimersModule";

    public NativeTimersModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void clearInterval(double d6);

    @a
    @ReactMethod
    public abstract void clearTimeout(double d6);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void removeListeners(double d6);

    @a
    @ReactMethod
    public abstract void setInterval(double d6, double d7);

    @a
    @ReactMethod
    public abstract void setTimeout(double d6, double d7);
}
