package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeAnimatedModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeAnimatedModule";

    public NativeAnimatedModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void addAnimatedEventToView(double d6, String str, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void addListener(String str);

    @a
    @ReactMethod
    public void connectAnimatedNodeToShadowNodeFamily(double d6, ReadableMap readableMap) {
    }

    @a
    @ReactMethod
    public abstract void connectAnimatedNodeToView(double d6, double d7);

    @a
    @ReactMethod
    public abstract void connectAnimatedNodes(double d6, double d7);

    @a
    @ReactMethod
    public abstract void createAnimatedNode(double d6, ReadableMap readableMap);

    @a
    @ReactMethod
    public abstract void disconnectAnimatedNodeFromView(double d6, double d7);

    @a
    @ReactMethod
    public abstract void disconnectAnimatedNodes(double d6, double d7);

    @a
    @ReactMethod
    public abstract void dropAnimatedNode(double d6);

    @a
    @ReactMethod
    public abstract void extractAnimatedNodeOffset(double d6);

    @a
    @ReactMethod
    public abstract void finishOperationBatch();

    @a
    @ReactMethod
    public abstract void flattenAnimatedNodeOffset(double d6);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "NativeAnimatedModule";
    }

    @a
    @ReactMethod
    public abstract void getValue(double d6, Callback callback);

    @a
    @ReactMethod
    public void queueAndExecuteBatchedOperations(ReadableArray readableArray) {
    }

    @a
    @ReactMethod
    public abstract void removeAnimatedEventFromView(double d6, String str, double d7);

    @a
    @ReactMethod
    public abstract void removeListeners(double d6);

    @a
    @ReactMethod
    public abstract void restoreDefaultValues(double d6);

    @a
    @ReactMethod
    public abstract void setAnimatedNodeOffset(double d6, double d7);

    @a
    @ReactMethod
    public abstract void setAnimatedNodeValue(double d6, double d7);

    @a
    @ReactMethod
    public abstract void startAnimatingNode(double d6, double d7, ReadableMap readableMap, Callback callback);

    @a
    @ReactMethod
    public abstract void startListeningToAnimatedNodeValue(double d6);

    @a
    @ReactMethod
    public abstract void startOperationBatch();

    @a
    @ReactMethod
    public abstract void stopAnimation(double d6);

    @a
    @ReactMethod
    public abstract void stopListeningToAnimatedNodeValue(double d6);

    @a
    @ReactMethod
    public void updateAnimatedNodeConfig(double d6, ReadableMap readableMap) {
    }
}
