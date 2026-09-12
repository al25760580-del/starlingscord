package com.discord.codegen;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import kk.b;
import xa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class NativeFileModuleSpec extends ReactContextBaseJavaModule implements TurboModule {
    public static final String NAME = "NativeFileModule";

    public NativeFileModuleSpec(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @a
    @ReactMethod
    public abstract void clearFolder(String str, String str2, Promise promise);

    @a
    @ReactMethod
    public abstract void fileExists(String str, Promise promise);

    @Override // com.facebook.react.bridge.BaseJavaModule
    @a
    public final Map<String, Object> getConstants() {
        Map<String, Object> typedExportedConstants = getTypedExportedConstants();
        if (ReactBuildConfig.DEBUG || ReactBuildConfig.IS_INTERNAL_BUILD) {
            HashSet hashSet = new HashSet(Arrays.asList("CacheDirPath", "DocumentsDirPath"));
            HashSet hashSet2 = new HashSet();
            HashSet hashSet3 = new HashSet(typedExportedConstants.keySet());
            if (!b.t(hashSet3, hashSet, hashSet2)) {
                throw new IllegalStateException(String.format("Native Module Flow doesn't declare constants: %s", hashSet3));
            }
            if (!b.u(typedExportedConstants, hashSet)) {
                throw new IllegalStateException(String.format("Native Module doesn't fill in constants: %s", hashSet));
            }
        }
        return typedExportedConstants;
    }

    @a
    @ReactMethod
    public abstract void getFileHash(String str, String str2, double d6, Promise promise);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @a
    @ReactMethod
    public abstract void getSize(String str, Promise promise);

    public abstract Map<String, Object> getTypedExportedConstants();

    @a
    @ReactMethod
    public abstract void moveFile(String str, String str2, String str3, Promise promise);

    @a
    @ReactMethod
    public abstract void readAsset(String str, String str2, Promise promise);

    @a
    @ReactMethod
    public abstract void readFile(String str, String str2, Promise promise);

    @a
    @ReactMethod
    public abstract void removeFile(String str, String str2, Promise promise);

    @a
    @ReactMethod
    public abstract void saveFileToGallery(String str, String str2, String str3, Promise promise);

    @a
    @ReactMethod
    public abstract void writeFile(String str, String str2, String str3, String str4, Promise promise);
}
