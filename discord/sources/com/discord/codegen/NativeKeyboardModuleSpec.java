package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeKeyboardModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeKeyboardModule";

    public NativeKeyboardModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void clearCurrentFocusAndDismissKeyboard();

    @a
    @ReactMethod
    public abstract void dismissGlobalKeyboard();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void onKeyboardChanged(boolean z5);
}
