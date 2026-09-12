package io.sentry.react;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;

/* JADX INFO: loaded from: classes3.dex */
public abstract class NativeRNSentrySpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "RNSentry";

    public NativeRNSentrySpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @xa.a
    @ReactMethod
    public abstract void addBreadcrumb(ReadableMap readableMap);

    @xa.a
    @ReactMethod
    public abstract void addListener(String str);

    @xa.a
    @ReactMethod
    public abstract void captureEnvelope(String str, ReadableMap readableMap, Promise promise);

    @xa.a
    @ReactMethod
    public abstract void captureReplay(boolean z5, Promise promise);

    @xa.a
    @ReactMethod
    public abstract void captureScreenshot(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void clearBreadcrumbs();

    @xa.a
    @ReactMethod
    public abstract void closeNativeSdk(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void crash();

    @xa.a
    @ReactMethod
    public abstract void crashedLastRun(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void disableNativeFramesTracking();

    @xa.a
    @ReactMethod
    public abstract void enableNativeFramesTracking();

    @xa.a
    @ReactMethod
    public abstract void encodeToBase64(ReadableArray readableArray, Promise promise);

    @xa.a
    @ReactMethod
    public abstract void fetchModules(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void fetchNativeAppStart(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void fetchNativeDeviceContexts(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void fetchNativeFrames(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void fetchNativeLogAttributes(Promise promise);

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String fetchNativePackageName();

    @xa.a
    @ReactMethod
    public abstract void fetchNativeRelease(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void fetchNativeSdkInfo(Promise promise);

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap fetchNativeStackFramesBy(ReadableArray readableArray);

    @xa.a
    @ReactMethod
    public abstract void fetchViewHierarchy(Promise promise);

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract String getCurrentReplayId();

    @xa.a
    @ReactMethod
    public abstract void getDataFromUri(String str, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSentry";
    }

    @xa.a
    @ReactMethod
    public abstract void getNewScreenTimeToDisplay(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void initNativeReactNavigationNewFrameTracking(Promise promise);

    @xa.a
    @ReactMethod
    public abstract void initNativeSdk(ReadableMap readableMap, Promise promise);

    @xa.a
    @ReactMethod
    public abstract void popTimeToDisplayFor(String str, Promise promise);

    @xa.a
    @ReactMethod
    public abstract void removeListeners(double d6);

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean setActiveSpanId(String str);

    @xa.a
    @ReactMethod
    public abstract void setContext(String str, ReadableMap readableMap);

    @xa.a
    @ReactMethod
    public abstract void setExtra(String str, String str2);

    @xa.a
    @ReactMethod
    public abstract void setTag(String str, String str2);

    @xa.a
    @ReactMethod
    public abstract void setUser(ReadableMap readableMap, ReadableMap readableMap2);

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap startProfiling(boolean z5);

    @xa.a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract WritableMap stopProfiling();
}
