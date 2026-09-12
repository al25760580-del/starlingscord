package com.discord.codegen;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeIntentsModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeIntentsModule";

    public NativeIntentsModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean canOpenUrlScheme(String str);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean canSendMail();

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean canSendSMS();

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean sendMail(String str, String str2, ReadableArray readableArray);

    @a
    @ReactMethod(isBlockingSynchronousMethod = true)
    public abstract boolean sendSMS(String str, ReadableArray readableArray);
}
