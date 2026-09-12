package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAudioPlayerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeAudioPlayerModule";

    public NativeAudioPlayerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void handleVoiceMessageDeleted(String str);

    @a
    @ReactMethod
    public abstract void maybePlayCurrentPlayer();

    @a
    @ReactMethod
    public abstract void pauseCurrentPlayer(boolean z5);
}
