package com.mkuczera.haptic;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeHapticFeedbackSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNHapticFeedback";

    public NativeHapticFeedbackSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @xa.a
    @ReactMethod
    public abstract void getSystemHapticStatus(Promise promise);

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isSupported();

    @xa.a
    @ReactMethod
    public abstract void playAHAP(String str, Promise promise);

    @xa.a
    @ReactMethod
    public abstract void stop();

    @xa.a
    @ReactMethod
    public abstract void trigger(String str, ReadableMap readableMap);

    @xa.a
    @ReactMethod
    public abstract void triggerPattern(ReadableArray readableArray, ReadableMap readableMap);
}
