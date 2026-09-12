package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeTimezoneHermesFixModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeTimezoneHermesFixModule";

    public NativeTimezoneHermesFixModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public final void emitOnTimezoneChange(ReadableMap readableMap) {
        this.mEventEmitterCallback.invoke("onTimezoneChange", readableMap);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getCurrentTimeZone();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableArray getSupportedTimeZones();
}
