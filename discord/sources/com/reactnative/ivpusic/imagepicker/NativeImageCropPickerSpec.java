package com.reactnative.ivpusic.imagepicker;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeImageCropPickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNCImageCropPicker";

    public NativeImageCropPickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void clean(Promise promise);

    @a
    @ReactMethod
    public abstract void cleanSingle(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void openCamera(ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void openCropper(ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void openPicker(ReadableMap readableMap, Promise promise);
}
