package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "Networking";

    public NativeNetworkingAndroidSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void abortRequest(double d6);

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void clearCookies(Callback callback);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Networking";
    }

    @a
    @ReactMethod
    public abstract void removeListeners(double d6);

    @a
    @ReactMethod
    public abstract void sendRequest(String str, String str2, double d6, ReadableArray readableArray, ReadableMap readableMap, String str3, boolean z5, double d7, boolean z6);
}
