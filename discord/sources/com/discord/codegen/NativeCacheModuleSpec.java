package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeCacheModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeCacheModule";

    public NativeCacheModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void clear();

    @a
    @ReactMethod
    public abstract void getItem(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void refresh(ReadableArray readableArray, Promise promise);

    @a
    @ReactMethod
    public abstract void removeItem(String str);

    @a
    @ReactMethod
    public abstract void setItem(String str, String str2);
}
