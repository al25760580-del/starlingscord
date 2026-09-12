package com.reactnativecommunity.clipboard;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeClipboardModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCClipboard";

    public NativeClipboardModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public abstract void getImage(Promise promise);

    @a
    @ReactMethod
    public abstract void getImageJPG(Promise promise);

    @a
    @ReactMethod
    public abstract void getImagePNG(Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCClipboard";
    }

    @a
    @ReactMethod
    public abstract void getString(Promise promise);

    @a
    @ReactMethod
    public abstract void getStrings(Promise promise);

    @a
    @ReactMethod
    public abstract void hasImage(Promise promise);

    @a
    @ReactMethod
    public abstract void hasNumber(Promise promise);

    @a
    @ReactMethod
    public abstract void hasString(Promise promise);

    @a
    @ReactMethod
    public abstract void hasURL(Promise promise);

    @a
    @ReactMethod
    public abstract void hasWebURL(Promise promise);

    @a
    @ReactMethod
    public abstract void removeListener();

    @a
    @ReactMethod
    public abstract void removeListeners(double d6);

    @a
    @ReactMethod
    public abstract void setImage(String str, Promise promise);

    @a
    @ReactMethod
    public abstract void setListener();

    @a
    @ReactMethod
    public abstract void setString(String str);

    @a
    @ReactMethod
    public abstract void setStrings(ReadableArray readableArray);
}
