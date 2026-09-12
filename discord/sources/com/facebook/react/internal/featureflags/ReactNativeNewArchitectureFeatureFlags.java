package com.facebook.react.internal.featureflags;

import android.annotation.SuppressLint;
import com.facebook.react.common.build.ReactBuildConfig;
import io.sentry.config.a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0005H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeNewArchitectureFeatureFlags;", "", "<init>", "()V", "enableBridgelessArchitecture", "", "enableFabricRenderer", "useFabricInterop", "useTurboModuleInterop", "useTurboModules", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"UseReactNativeNewArchitectureFeatureFlagDetector"})
public final class ReactNativeNewArchitectureFeatureFlags {

    @NotNull
    public static final ReactNativeNewArchitectureFeatureFlags INSTANCE = new ReactNativeNewArchitectureFeatureFlags();

    private ReactNativeNewArchitectureFeatureFlags() {
    }

    public static final boolean enableBridgelessArchitecture() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.enableBridgelessArchitecture();
        }
        a.e(ReactNativeFeatureFlags.enableBridgelessArchitecture(), "ReactNativeFeatureFlags.enableBridgelessArchitecture() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean enableFabricRenderer() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.enableFabricRenderer();
        }
        a.e(ReactNativeFeatureFlags.enableFabricRenderer(), "ReactNativeFeatureFlags.enableFabricRenderer() should be set to TRUE when Strict Mode is enabled");
        return true;
    }

    public static final boolean useFabricInterop() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useFabricInterop();
        }
        a.e(!ReactNativeFeatureFlags.useFabricInterop(), "ReactNativeFeatureFlags.useFabricInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean useTurboModuleInterop() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useTurboModuleInterop();
        }
        a.e(!ReactNativeFeatureFlags.useTurboModuleInterop(), "ReactNativeFeatureFlags.useTurboModuleInterop() should be set to FALSE when Strict Mode is enabled");
        return false;
    }

    public static final boolean useTurboModules() {
        if (!ReactBuildConfig.UNSTABLE_ENABLE_MINIFY_LEGACY_ARCHITECTURE) {
            return ReactNativeFeatureFlags.useTurboModules();
        }
        a.e(ReactNativeFeatureFlags.useTurboModules(), "ReactNativeFeatureFlags.useTurboModules() should be set to TRUE when Strict Mode is enabled");
        return true;
    }
}
