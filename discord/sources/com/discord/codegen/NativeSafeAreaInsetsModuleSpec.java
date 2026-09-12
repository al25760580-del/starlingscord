package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeSafeAreaInsetsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeSafeAreaInsetsModule";

    public NativeSafeAreaInsetsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract double getImeInsets(boolean z5, String str);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap getStableSafeAreaInsets(String str);

    @a
    @ReactMethod
    public abstract void setNavigationBarContrastEnforced(boolean z5);

    @a
    @ReactMethod
    public abstract void setNavigationBarVisible(boolean z5);

    @a
    @ReactMethod
    public abstract void setStatusBarVisible(boolean z5);
}
