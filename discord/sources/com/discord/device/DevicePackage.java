package com.discord.device;

import com.discord.codegen.NativeDeviceAccessibilityModuleSpec;
import com.discord.codegen.NativeDeviceLocaleModuleSpec;
import com.discord.codegen.NativeDeviceModuleSpec;
import com.discord.codegen.NativeDeviceSettingsModuleSpec;
import com.discord.codegen.NativeDeviceThermalStateModuleSpec;
import com.discord.codegen.NativeMetaQuestModuleSpec;
import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000e0\r2\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lcom/discord/device/DevicePackage;", "Lcom/facebook/react/BaseReactPackage;", "<init>", "()V", "getModule", "Lcom/facebook/react/bridge/NativeModule;", StackTraceHelper.NAME_KEY, "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "createViewManagers", "", "Lcom/facebook/react/uimanager/ViewManager;", "device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DevicePackage extends BaseReactPackage {
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    @NotNull
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return n0.f14659d;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        switch (name.hashCode()) {
            case -2084303303:
                if (name.equals(NativeDeviceModuleSpec.NAME)) {
                    return new DeviceModule(reactContext);
                }
                return null;
            case -1818315972:
                if (name.equals(NativeDeviceSettingsModuleSpec.NAME)) {
                    return new DeviceSettingsModule(reactContext);
                }
                return null;
            case -140406925:
                if (name.equals(NativeDeviceLocaleModuleSpec.NAME)) {
                    return new DeviceLocaleModule(reactContext);
                }
                return null;
            case 63901357:
                if (name.equals(NativeDeviceAccessibilityModuleSpec.NAME)) {
                    return new DeviceAccessibilityModule(reactContext);
                }
                return null;
            case 655732082:
                if (name.equals(NativeMetaQuestModuleSpec.NAME)) {
                    return new MetaQuestModule(reactContext);
                }
                return null;
            case 1229995667:
                if (name.equals(NativeDeviceThermalStateModuleSpec.NAME)) {
                    return new DeviceThermalStateModule(reactContext);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(d0.g(NativeDeviceAccessibilityModuleSpec.NAME, NativeDeviceLocaleModuleSpec.NAME, NativeDeviceModuleSpec.NAME, NativeDeviceSettingsModuleSpec.NAME, NativeDeviceThermalStateModuleSpec.NAME, NativeMetaQuestModuleSpec.NAME), false, 2, (Object) null);
    }
}
