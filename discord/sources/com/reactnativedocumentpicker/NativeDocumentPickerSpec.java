package com.reactnativedocumentpicker;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeDocumentPickerSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNDocumentPicker";

    public NativeDocumentPickerSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap isKnownType(String str, String str2);

    @a
    @ReactMethod
    public abstract void keepLocalCopy(ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void pick(ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void pickDirectory(ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void releaseLongTermAccess(ReadableArray readableArray, Promise promise);

    @a
    @ReactMethod
    public abstract void releaseSecureAccess(ReadableArray readableArray, Promise promise);

    @a
    @ReactMethod
    public abstract void saveDocument(ReadableMap readableMap, Promise promise);

    @a
    @ReactMethod
    public abstract void writeDocuments(ReadableMap readableMap, Promise promise);
}
