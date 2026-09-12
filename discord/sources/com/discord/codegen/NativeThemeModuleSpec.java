package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeThemeModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeThemeModule";

    public NativeThemeModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void setVisualRefreshEnabled(boolean z5);

    @a
    @ReactMethod
    public abstract void updateSaturation(double d6);

    @a
    @ReactMethod
    public abstract void updateTheme(String str);
}
