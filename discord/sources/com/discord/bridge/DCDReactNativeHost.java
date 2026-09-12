package com.discord.bridge;

import android.app.Application;
import android.content.Context;
import com.discord.BuildConfig;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.libdiscore.LibdiscoreModuleProvider;
import com.facebook.react.ReactPackage;
import com.facebook.react.defaults.DefaultReactNativeHost;
import com.facebook.react.runtime.ReactSurfaceImpl;
import com.facebook.react.runtime.ReactSurfaceView;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0011\u001a\u00020\u000fH\u0014J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/discord/bridge/DCDReactNativeHost;", "Lcom/facebook/react/defaults/DefaultReactNativeHost;", "application", "Landroid/app/Application;", "libdiscoreModuleProvider", "Lcom/discord/libdiscore/LibdiscoreModuleProvider;", "<init>", "(Landroid/app/Application;Lcom/discord/libdiscore/LibdiscoreModuleProvider;)V", "getUseDeveloperSupport", "", "getPackages", "Ljava/util/ArrayList;", "Lcom/facebook/react/ReactPackage;", "Lkotlin/collections/ArrayList;", "getJSMainModuleName", "", "getJSBundleFile", "getBundleAssetName", "isNewArchEnabled", "()Z", "isHermesEnabled", "createReactSurfaceView", "Lcom/facebook/react/runtime/ReactSurfaceView;", "context", "Landroid/content/Context;", "surfaceImpl", "Lcom/facebook/react/runtime/ReactSurfaceImpl;", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DCDReactNativeHost extends DefaultReactNativeHost {

    @NotNull
    private final LibdiscoreModuleProvider libdiscoreModuleProvider;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDReactNativeHost(@NotNull Application application, @NotNull LibdiscoreModuleProvider libdiscoreModuleProvider) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(libdiscoreModuleProvider, "libdiscoreModuleProvider");
        this.libdiscoreModuleProvider = libdiscoreModuleProvider;
    }

    @Override // com.facebook.react.ReactNativeHost
    @NotNull
    public ReactSurfaceView createReactSurfaceView(@NotNull Context context, @NotNull ReactSurfaceImpl surfaceImpl) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(surfaceImpl, "surfaceImpl");
        return new com.discord.react_rootview.ReactSurfaceView(context, surfaceImpl);
    }

    @Override // com.facebook.react.ReactNativeHost
    @NotNull
    public String getBundleAssetName() {
        return BundleUpdater.ANDROID_JS_BUNDLE_ASSET_NAME;
    }

    @Override // com.facebook.react.ReactNativeHost
    public String getJSBundleFile() {
        File location;
        BundleUpdater.OtaBundle bundle = BundleUpdater.INSTANCE.instance().getBundle();
        if (bundle == null || (location = bundle.getLocation()) == null) {
            return null;
        }
        return location.getAbsolutePath();
    }

    @Override // com.facebook.react.ReactNativeHost
    @NotNull
    public String getJSMainModuleName() {
        return BuildConfig.MAIN_MODULE;
    }

    @Override // com.facebook.react.ReactNativeHost
    public boolean getUseDeveloperSupport() {
        return false;
    }

    @Override // com.facebook.react.defaults.DefaultReactNativeHost
    public boolean isHermesEnabled() {
        return true;
    }

    @Override // com.facebook.react.defaults.DefaultReactNativeHost
    public boolean isNewArchEnabled() {
        return true;
    }

    @Override // com.facebook.react.ReactNativeHost
    @NotNull
    public ArrayList<ReactPackage> getPackages() {
        return new DCDPackageList(this, this.libdiscoreModuleProvider).getPackages();
    }
}
