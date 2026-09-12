package com.discord.libdiscore;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.c0;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u001e\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\f0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/libdiscore/LibDiscorePackage;", "Lcom/facebook/react/ReactPackage;", "libdiscoreModuleProvider", "Lcom/discord/libdiscore/LibdiscoreModuleProvider;", "<init>", "(Lcom/discord/libdiscore/LibdiscoreModuleProvider;)V", "createNativeModules", "", "Lcom/facebook/react/bridge/NativeModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "createViewManagers", "Lcom/facebook/react/uimanager/ViewManager;", "discordapp_libdiscore-mobile_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LibDiscorePackage implements ReactPackage {

    @NotNull
    private final LibdiscoreModuleProvider libdiscoreModuleProvider;

    public LibDiscorePackage(@NotNull LibdiscoreModuleProvider libdiscoreModuleProvider) {
        Intrinsics.checkNotNullParameter(libdiscoreModuleProvider, "libdiscoreModuleProvider");
        this.libdiscoreModuleProvider = libdiscoreModuleProvider;
    }

    @Override // com.facebook.react.ReactPackage
    @NotNull
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return c0.c(new LibDiscoreReactNativeModule(reactContext, this.libdiscoreModuleProvider));
    }

    @Override // com.facebook.react.ReactPackage
    @NotNull
    public List<ViewManager<?, ?>> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return n0.f14659d;
    }
}
