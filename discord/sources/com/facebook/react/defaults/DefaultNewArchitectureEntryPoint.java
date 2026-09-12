package com.facebook.react.defaults;

import com.facebook.react.common.ReleaseLevel;
import com.facebook.react.common.annotations.VisibleForTesting;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Experimental_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007J\u001c\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007J&\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u0007J\u0015\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\b\u0013J,\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020$0#2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\u0014\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u001a\u0010\u0017R\u000e\u0010\u001b\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001e\u0010\u0017R\u000e\u0010\u001f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u0003\u001a\u0004\b!\u0010\u0017¨\u0006%"}, d2 = {"Lcom/facebook/react/defaults/DefaultNewArchitectureEntryPoint;", "", "<init>", "()V", "releaseLevel", "Lcom/facebook/react/common/ReleaseLevel;", "getReleaseLevel", "()Lcom/facebook/react/common/ReleaseLevel;", "setReleaseLevel", "(Lcom/facebook/react/common/ReleaseLevel;)V", "load", "", "turboModulesEnabled", "", "fabricEnabled", "bridgelessEnabled", "loadWithFeatureFlags", "featureFlags", "Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsProvider;", "loadWithFeatureFlags$ReactAndroid_release", "privateFabricEnabled", "getFabricEnabled$annotations", "getFabricEnabled", "()Z", "privateTurboModulesEnabled", "getTurboModulesEnabled$annotations", "getTurboModulesEnabled", "privateConcurrentReactEnabled", "concurrentReactEnabled", "getConcurrentReactEnabled$annotations", "getConcurrentReactEnabled", "privateBridgelessEnabled", "getBridgelessEnabled$annotations", "getBridgelessEnabled", "isConfigurationValid", "Lkotlin/Pair;", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultNewArchitectureEntryPoint {
    private static boolean privateBridgelessEnabled;
    private static boolean privateConcurrentReactEnabled;
    private static boolean privateFabricEnabled;
    private static boolean privateTurboModulesEnabled;

    @NotNull
    public static final DefaultNewArchitectureEntryPoint INSTANCE = new DefaultNewArchitectureEntryPoint();

    @NotNull
    private static ReleaseLevel releaseLevel = ReleaseLevel.STABLE;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReleaseLevel.values().length];
            try {
                iArr[ReleaseLevel.EXPERIMENTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReleaseLevel.CANARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReleaseLevel.STABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DefaultNewArchitectureEntryPoint() {
    }

    public static final boolean getBridgelessEnabled() {
        return privateBridgelessEnabled;
    }

    public static /* synthetic */ void getBridgelessEnabled$annotations() {
    }

    public static final boolean getConcurrentReactEnabled() {
        return privateConcurrentReactEnabled;
    }

    public static /* synthetic */ void getConcurrentReactEnabled$annotations() {
    }

    public static final boolean getFabricEnabled() {
        return privateFabricEnabled;
    }

    public static /* synthetic */ void getFabricEnabled$annotations() {
    }

    public static final boolean getTurboModulesEnabled() {
        return privateTurboModulesEnabled;
    }

    public static /* synthetic */ void getTurboModulesEnabled$annotations() {
    }

    public static final void load() {
        load(true, true, true);
    }

    public static /* synthetic */ void load$default(boolean z5, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = true;
        }
        load(z5);
    }

    public static final void loadWithFeatureFlags$ReactAndroid_release(@NotNull ReactNativeFeatureFlagsProvider featureFlags) {
        Intrinsics.checkNotNullParameter(featureFlags, "featureFlags");
        ReactNativeFeatureFlags.override(featureFlags);
        privateFabricEnabled = featureFlags.enableFabricRenderer();
        privateTurboModulesEnabled = featureFlags.useTurboModules();
        privateConcurrentReactEnabled = featureFlags.enableFabricRenderer();
        boolean zEnableBridgelessArchitecture = featureFlags.enableBridgelessArchitecture();
        privateBridgelessEnabled = zEnableBridgelessArchitecture;
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(privateTurboModulesEnabled, privateFabricEnabled, zEnableBridgelessArchitecture);
        boolean zBooleanValue = ((Boolean) pairIsConfigurationValid.f14612d).booleanValue();
        String str = (String) pairIsConfigurationValid.f14613e;
        if (!zBooleanValue) {
            throw new IllegalStateException(str.toString());
        }
        DefaultSoLoader.maybeLoadSoLibrary();
    }

    @NotNull
    public final ReleaseLevel getReleaseLevel() {
        return releaseLevel;
    }

    @VisibleForTesting
    @NotNull
    public final Pair<Boolean, String> isConfigurationValid(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        if (turboModulesEnabled && fabricEnabled && bridgelessEnabled) {
            return new Pair<>(Boolean.TRUE, "");
        }
        Boolean bool = Boolean.FALSE;
        StringBuilder sb2 = new StringBuilder("You cannot load React Native with the New Architecture disabled. Please use DefaultNewArchitectureEntryPoint.load() instead of DefaultNewArchitectureEntryPoint.load(turboModulesEnabled=");
        sb2.append(turboModulesEnabled);
        sb2.append(", fabricEnabled=");
        sb2.append(fabricEnabled);
        sb2.append(", bridgelessEnabled=");
        return new Pair<>(bool, com.discord.chat.presentation.list.a.m(sb2, bridgelessEnabled, ")"));
    }

    public final void setReleaseLevel(@NotNull ReleaseLevel releaseLevel2) {
        Intrinsics.checkNotNullParameter(releaseLevel2, "<set-?>");
        releaseLevel = releaseLevel2;
    }

    @d
    public static final void load(boolean turboModulesEnabled) {
        load(turboModulesEnabled, true, true);
    }

    public static /* synthetic */ void load$default(boolean z5, boolean z6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = true;
        }
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        load(z5, z6);
    }

    @d
    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled) {
        load(turboModulesEnabled, fabricEnabled, true);
    }

    public static /* synthetic */ void load$default(boolean z5, boolean z6, boolean z7, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            z5 = true;
        }
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        if ((i7 & 4) != 0) {
            z7 = true;
        }
        load(z5, z6, z7);
    }

    @d
    public static final void load(boolean turboModulesEnabled, boolean fabricEnabled, boolean bridgelessEnabled) {
        Pair<Boolean, String> pairIsConfigurationValid = INSTANCE.isConfigurationValid(turboModulesEnabled, fabricEnabled, bridgelessEnabled);
        boolean zBooleanValue = ((Boolean) pairIsConfigurationValid.f14612d).booleanValue();
        String str = (String) pairIsConfigurationValid.f14613e;
        if (zBooleanValue) {
            int i7 = WhenMappings.$EnumSwitchMapping$0[releaseLevel.ordinal()];
            if (i7 == 1) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Experimental_Android());
            } else if (i7 == 2) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Canary_Android());
            } else if (i7 == 3) {
                ReactNativeFeatureFlags.override(new ReactNativeFeatureFlagsOverrides_RNOSS_Stable_Android());
            } else {
                throw new n();
            }
            privateFabricEnabled = fabricEnabled;
            privateTurboModulesEnabled = turboModulesEnabled;
            privateConcurrentReactEnabled = fabricEnabled;
            privateBridgelessEnabled = bridgelessEnabled;
            DefaultSoLoader.maybeLoadSoLibrary();
            return;
        }
        throw new IllegalStateException(str.toString());
    }
}
