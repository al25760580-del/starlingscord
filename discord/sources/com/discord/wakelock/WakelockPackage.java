package com.discord.wakelock;

import com.discord.codegen.NativeProximitySensorManagerModuleSpec;
import com.discord.codegen.NativeScreenWakeLockModuleSpec;
import com.discord.react.utilities.ReactModuleInfoProviderExtensionsKt;
import com.facebook.react.BaseReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.module.model.ReactModuleInfoProvider;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/discord/wakelock/WakelockPackage;", "Lcom/facebook/react/BaseReactPackage;", "<init>", "()V", "getModule", "Lcom/facebook/react/bridge/NativeModule;", StackTraceHelper.NAME_KEY, "", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "getReactModuleInfoProvider", "Lcom/facebook/react/module/model/ReactModuleInfoProvider;", "wakelock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WakelockPackage extends BaseReactPackage {
    @Override // com.facebook.react.BaseReactPackage, com.facebook.react.ReactPackage
    public NativeModule getModule(@NotNull String name, @NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Intrinsics.areEqual(name, NativeScreenWakeLockModuleSpec.NAME)) {
            return new ScreenWakeLockModule(reactContext);
        }
        if (Intrinsics.areEqual(name, NativeProximitySensorManagerModuleSpec.NAME)) {
            return new ProximitySensorManagerModule(reactContext);
        }
        return null;
    }

    @Override // com.facebook.react.BaseReactPackage
    @NotNull
    public ReactModuleInfoProvider getReactModuleInfoProvider() {
        return ReactModuleInfoProviderExtensionsKt.createReactModuleInfoProvider$default(d0.g(NativeScreenWakeLockModuleSpec.NAME, NativeProximitySensorManagerModuleSpec.NAME), false, 2, (Object) null);
    }
}
