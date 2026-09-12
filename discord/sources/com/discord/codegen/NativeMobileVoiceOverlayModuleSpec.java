package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeMobileVoiceOverlayModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeMobileVoiceOverlayModule";

    public NativeMobileVoiceOverlayModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public final void emitOnChannelQueryUpdate(String str) {
        this.mEventEmitterCallback.invoke("onChannelQueryUpdate", str);
    }

    public final void emitOnLayoutTrashed() {
        this.mEventEmitterCallback.invoke("onLayoutTrashed");
    }

    @a
    @ReactMethod
    public abstract void enableOverlay(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void hideOverlay();

    @a
    @ReactMethod
    public abstract void setData(ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void showOverlay(ReadableMap readableMap);
}
