package com.discord.codegen;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeShareManagerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeShareManagerModule";

    public NativeShareManagerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void cancelPendingShare();

    @a
    @ReactMethod
    public abstract void close();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void launchApp();

    @a
    @ReactMethod
    public abstract void removeListeners(double d6);

    @a
    @ReactMethod
    public abstract void setAuthenticationToken(String str, String str2);

    @a
    @ReactMethod
    public abstract void setSelectedChannel(String str, String str2);

    @a
    @ReactMethod
    public abstract void share(String str, String str2, String str3, String str4, ReadableMap readableMap, Callback callback, Promise promise);

    @a
    @ReactMethod
    public abstract void sharedAttachments(String str, ReadableArray readableArray, Promise promise);
}
