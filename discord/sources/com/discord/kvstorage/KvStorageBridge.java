package com.discord.kvstorage;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.turbomodule.core.CallInvokerHolderImpl;

/* JADX INFO: loaded from: classes.dex */
public class KvStorageBridge {
    public static final KvStorageBridge instance = new KvStorageBridge();

    private native void activateNative(long j, CallInvokerHolderImpl callInvokerHolderImpl, String str);

    private native void deactivateNative();

    public void activate(ReactContext reactContext) {
        JavaScriptContextHolder javaScriptContextHolder = reactContext.getJavaScriptContextHolder();
        activateNative(javaScriptContextHolder.getContext(), (CallInvokerHolderImpl) reactContext.getCatalystInstance().getJSCallInvokerHolder(), reactContext.getFilesDir().getAbsolutePath());
    }

    public void deactivate() {
        deactivateNative();
    }
}
