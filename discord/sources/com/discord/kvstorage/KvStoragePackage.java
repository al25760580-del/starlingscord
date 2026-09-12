package com.discord.kvstorage;

import androidx.annotation.NonNull;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class KvStoragePackage implements ReactPackage {
    @Override // com.facebook.react.ReactPackage
    @NonNull
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new KvStorageModule(reactApplicationContext));
    }

    @Override // com.facebook.react.ReactPackage
    @NonNull
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        return Collections.EMPTY_LIST;
    }
}
