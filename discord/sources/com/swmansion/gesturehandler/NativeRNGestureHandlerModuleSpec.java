package com.swmansion.gesturehandler;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeRNGestureHandlerModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNGestureHandlerModule";

    public NativeRNGestureHandlerModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void attachGestureHandler(double d6, double d7, double d8);

    @a
    @ReactMethod
    public abstract void configureRelations(double d6, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void createGestureHandler(String str, double d6, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void dropGestureHandler(double d6);

    @a
    @ReactMethod
    public abstract void flushOperations();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNGestureHandlerModule";
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean installUIRuntimeBindings();

    @a
    @ReactMethod
    public abstract void setGestureHandlerConfig(double d6, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void updateGestureHandlerConfig(double d6, ReadableMap readableMap);
}
