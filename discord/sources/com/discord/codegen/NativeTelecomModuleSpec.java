package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeTelecomModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeTelecomModule";

    public NativeTelecomModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void cancelIncomingCall(String str, Promise promise);

    @a
    @ReactMethod
    public abstract void endCall(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void isAvailable(Promise promise);

    @a
    @ReactMethod
    public abstract void registerIncomingCall(String str, Promise promise);

    @a
    @ReactMethod
    public abstract void removeListeners(double d6);

    @a
    @ReactMethod
    public abstract void reportIncomingCall(String str, String str2, ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void setCallActive(String str, boolean z5);

    @a
    @ReactMethod
    public abstract void setIncomingCallActive(String str, boolean z5);

    @a
    @ReactMethod
    public abstract void setMicMuted(String str, boolean z5);

    @a
    @ReactMethod
    public abstract void setScreenShareState(String str, boolean z5, boolean z6);

    @a
    @ReactMethod
    public abstract void startCall(String str, ReadableMap readableMap, Promise promise);
}
