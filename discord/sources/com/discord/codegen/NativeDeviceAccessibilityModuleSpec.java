package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeDeviceAccessibilityModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeDeviceAccessibilityModule";

    public NativeDeviceAccessibilityModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void disableFocusLock();

    public final void emitOnAccessibilityServiceEnabledChanged(boolean z5) {
        this.mEventEmitterCallback.invoke("onAccessibilityServiceEnabledChanged", Boolean.valueOf(z5));
    }

    @a
    @ReactMethod
    public abstract void enableFocusLock(ReadableArray readableArray, boolean z5);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void handleSetPrefersReducedMotion(String str);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean isAccessibilityServiceEnabled();

    @a
    @ReactMethod
    public abstract void markCurrentFocus();

    @a
    @ReactMethod
    public abstract void restorePreviousFocus();
}
