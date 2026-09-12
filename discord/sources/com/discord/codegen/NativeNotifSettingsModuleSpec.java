package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeNotifSettingsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeNotifSettingsModule";

    public NativeNotifSettingsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableArray getAndroidNotifChannelStates();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void registerAndroidNotifGroupsAndChannels(ReadableArray readableArray, ReadableArray readableArray2);

    @a
    @ReactMethod
    public abstract void registerAndroidNotifTypeMappings(ReadableArray readableArray);
}
