package com.discord;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import androidx.lifecycle.r0;
import ar.s;
import com.discord.app_database.AppDatabase;
import com.discord.bridge.DCDReactNativeHost;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.cache.Cache;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerManager;
import com.discord.client_info.ClientInfo;
import com.discord.crash_reporting.CrashReporting;
import com.discord.crash_reporting.PerformanceTracing;
import com.discord.crash_reporting.TelemetryRing;
import com.discord.deep_link.DeepLinks;
import com.discord.image.fresco.FrescoModuleDiscord;
import com.discord.image.fresco.config.FrescoMemoryCacheExperimentSettingsExtensionsKt;
import com.discord.jank_stats.JankSessionRecorder;
import com.discord.libdiscore.LibdiscoreInitModule;
import com.discord.libdiscore.LibdiscoreModuleClass;
import com.discord.libdiscore.LibdiscoreModuleProvider;
import com.discord.lifecycle.ActivityResumedTracker;
import com.discord.lifecycle.AppEntryActivityRegistry;
import com.discord.lifecycle.AppLifecycle;
import com.discord.lifecycle.ForegroundServiceStartGuard;
import com.discord.media_player.CacheDataSourceFactory;
import com.discord.media_player.HttpEngineFactoryResolver;
import com.discord.native_experiments.ChatMosaicSharedPoolExperimentBootstrap;
import com.discord.native_experiments.NativeExperiments;
import com.discord.networking.ReactNetworking;
import com.discord.play_delivery.PlayAssetDelivery;
import com.discord.react.FontManager;
import com.discord.react_activities.ReactActivitySharedData;
import com.discord.react_fork_overrides.ReactForkOverrides;
import com.discord.sticker.sticker_types.RLottieUtils;
import com.discord.theme.ThemeManager;
import com.discord.tti_manager.TTIMetrics;
import com.discord.tti_manager.TTIModule;
import com.discord.tti_manager.react.ReactMarkerListener;
import com.discord.utils.SoLoaderUtils;
import com.facebook.hermes.reactexecutor.HermesExecutor;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.defaults.DefaultReactHost;
import com.facebook.react.defaults.DefaultSoLoader;
import com.facebook.react.internal.featureflags.ReactNativeFeatureFlags;
import com.facebook.react.internal.featureflags.ReactNativeNewArchitectureFeatureFlagsDefaults;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.runtime.hermes.HermesInstance;
import com.facebook.react.uimanager.UIManagerConstantsCache;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001'B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u000f\u001a\u00020\u0010*\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\bH\u0002J\b\u0010&\u001a\u00020\bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lcom/discord/MainApplication;", "Landroid/app/Application;", "Lcom/facebook/react/ReactApplication;", "<init>", "()V", "soloaderLoaded", "Ljava/util/concurrent/CountDownLatch;", "attachBaseContext", "", "base", "Landroid/content/Context;", "onCreate", "fontScaledAppResources", "Landroid/content/res/Resources;", "getResources", "isReusableFor", "", "targetFontScale", "", "initialize", "reactNativeInitializationTask", "Ljava/util/concurrent/FutureTask;", "Lcom/discord/MainApplication$ReactNativeInitialization;", "kotlin.jvm.PlatformType", "libdiscoreModuleProvider", "Lcom/discord/libdiscore/LibdiscoreModuleProvider;", "getLibdiscoreModuleProvider", "()Lcom/discord/libdiscore/LibdiscoreModuleProvider;", "reactNativeHost", "Lcom/facebook/react/ReactNativeHost;", "getReactNativeHost", "()Lcom/facebook/react/ReactNativeHost;", "reactHost", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "reactHost$delegate", "Lkotlin/Lazy;", "performInitialization", "ReactNativeInitialization", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMainApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainApplication.kt\ncom/discord/MainApplication\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,355:1\n1#2:356\n*E\n"})
public final class MainApplication extends Application implements ReactApplication {
    private volatile Resources fontScaledAppResources;

    @NotNull
    private final LibdiscoreModuleProvider libdiscoreModuleProvider;

    /* JADX INFO: renamed from: reactHost$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy reactHost;

    @NotNull
    private final ReactNativeHost reactNativeHost;

    @NotNull
    private final FutureTask<ReactNativeInitialization> reactNativeInitializationTask;

    @NotNull
    private CountDownLatch soloaderLoaded = new CountDownLatch(1);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/MainApplication$ReactNativeInitialization;", "", "libdiscoreModule", "Lcom/discord/libdiscore/LibdiscoreModuleClass$LibdiscoreModule;", "nativeExperiments", "Lcom/discord/native_experiments/NativeExperiments;", "<init>", "(Lcom/discord/libdiscore/LibdiscoreModuleClass$LibdiscoreModule;Lcom/discord/native_experiments/NativeExperiments;)V", "getLibdiscoreModule", "()Lcom/discord/libdiscore/LibdiscoreModuleClass$LibdiscoreModule;", "getNativeExperiments", "()Lcom/discord/native_experiments/NativeExperiments;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReactNativeInitialization {

        @NotNull
        private final LibdiscoreModuleClass.LibdiscoreModule libdiscoreModule;

        @NotNull
        private final NativeExperiments nativeExperiments;

        public ReactNativeInitialization(@NotNull LibdiscoreModuleClass.LibdiscoreModule libdiscoreModule, @NotNull NativeExperiments nativeExperiments) {
            Intrinsics.checkNotNullParameter(libdiscoreModule, "libdiscoreModule");
            Intrinsics.checkNotNullParameter(nativeExperiments, "nativeExperiments");
            this.libdiscoreModule = libdiscoreModule;
            this.nativeExperiments = nativeExperiments;
        }

        public static /* synthetic */ ReactNativeInitialization copy$default(ReactNativeInitialization reactNativeInitialization, LibdiscoreModuleClass.LibdiscoreModule libdiscoreModule, NativeExperiments nativeExperiments, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                libdiscoreModule = reactNativeInitialization.libdiscoreModule;
            }
            if ((i7 & 2) != 0) {
                nativeExperiments = reactNativeInitialization.nativeExperiments;
            }
            return reactNativeInitialization.copy(libdiscoreModule, nativeExperiments);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final LibdiscoreModuleClass.LibdiscoreModule getLibdiscoreModule() {
            return this.libdiscoreModule;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final NativeExperiments getNativeExperiments() {
            return this.nativeExperiments;
        }

        @NotNull
        public final ReactNativeInitialization copy(@NotNull LibdiscoreModuleClass.LibdiscoreModule libdiscoreModule, @NotNull NativeExperiments nativeExperiments) {
            Intrinsics.checkNotNullParameter(libdiscoreModule, "libdiscoreModule");
            Intrinsics.checkNotNullParameter(nativeExperiments, "nativeExperiments");
            return new ReactNativeInitialization(libdiscoreModule, nativeExperiments);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReactNativeInitialization)) {
                return false;
            }
            ReactNativeInitialization reactNativeInitialization = (ReactNativeInitialization) other;
            return Intrinsics.areEqual(this.libdiscoreModule, reactNativeInitialization.libdiscoreModule) && Intrinsics.areEqual(this.nativeExperiments, reactNativeInitialization.nativeExperiments);
        }

        @NotNull
        public final LibdiscoreModuleClass.LibdiscoreModule getLibdiscoreModule() {
            return this.libdiscoreModule;
        }

        @NotNull
        public final NativeExperiments getNativeExperiments() {
            return this.nativeExperiments;
        }

        public int hashCode() {
            return this.nativeExperiments.hashCode() + (this.libdiscoreModule.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "ReactNativeInitialization(libdiscoreModule=" + this.libdiscoreModule + ", nativeExperiments=" + this.nativeExperiments + ")";
        }
    }

    public MainApplication() {
        TTIModule.INSTANCE.markApplicationStarted();
        this.reactNativeInitializationTask = new FutureTask<>(new a(this, 0));
        app.rive.runtime.kotlin.core.a aVar = new app.rive.runtime.kotlin.core.a(6, this);
        this.libdiscoreModuleProvider = aVar;
        this.reactNativeHost = new DCDReactNativeHost(this, aVar);
        this.reactHost = l.b(new b(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit attachBaseContext$lambda$0(Context context, MainApplication mainApplication) {
        SoLoaderUtils.INSTANCE.init(context);
        mainApplication.soloaderLoaded.countDown();
        return Unit.f14616a;
    }

    private final void initialize() throws Throwable {
        ActivityResumedTracker.INSTANCE.init(this);
        AppEntryActivityRegistry.INSTANCE.init(this);
        if (Build.VERSION.SDK_INT < 28) {
            performInitialization();
        } else {
            q.B("ReactNativeInitThread", 10, new b(this, 0), 7);
        }
        AppLifecycle.INSTANCE.init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$4(MainApplication mainApplication) throws Throwable {
        mainApplication.performInitialization();
        return Unit.f14616a;
    }

    private final boolean isReusableFor(Resources resources, Resources resources2, float f2) {
        return resources.getAssets() == resources2.getAssets() && resources.getConfiguration().fontScale == f2 && (resources2.getConfiguration().diff(resources.getConfiguration()) & (-1073741825)) == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LibdiscoreModuleClass.LibdiscoreModule libdiscoreModuleProvider$lambda$6(MainApplication mainApplication) {
        return mainApplication.reactNativeInitializationTask.get().getLibdiscoreModule();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(MainApplication mainApplication) {
        DeepLinks.INSTANCE.init(mainApplication);
        return Unit.f14616a;
    }

    private final void performInitialization() throws Throwable {
        ForegroundServiceStartGuard.INSTANCE.init(this);
        q.B("ReactNativeLoader", 10, new b(this, 2), 7);
        TTIMetrics tTIMetrics = TTIMetrics.INSTANCE;
        TTIMetrics.record$default(tTIMetrics, "Start MainApplication.initialize()", 0L, null, false, 14, null);
        try {
            ReactMarkerListener.INSTANCE.start();
            Cache.INSTANCE.quickInitCache(this);
            TTIMetrics.record$default(tTIMetrics, "quickInitCache()", 0L, null, false, 14, null);
            BundleUpdater.Companion companion = BundleUpdater.INSTANCE;
            companion.init(this);
            TTIMetrics.record$default(tTIMetrics, "BundlerUpdater.init()", 0L, null, false, 14, null);
            try {
                ClientInfo.INSTANCE.init(this, BuildConfig.VERSION_NAME_RNA, BuildConfig.VERSION_CODE, BuildConfig.FLAVOR, "release", companion.instance().getManifestETag(), companion.instance().getOtaVersion());
                try {
                    TTIMetrics.record$default(tTIMetrics, "ClientInfo.init()", 0L, null, false, 14, null);
                    TelemetryRing.init$default(TelemetryRing.INSTANCE, this, null, 2, null);
                    JankSessionRecorder.INSTANCE.init(this);
                    TTIMetrics.record$default(tTIMetrics, "JankSessionRecorder.init()", 0L, null, false, 14, null);
                    CacheDataSourceFactory.INSTANCE.init(this);
                    TTIMetrics.record$default(tTIMetrics, "CacheDataSourceFactory.init()", 0L, null, false, 14, null);
                    AppDatabase.INSTANCE.initializeAppDatabase(this);
                    TTIMetrics.record$default(tTIMetrics, "initializeAppDatabase()", 0L, null, false, 14, null);
                    I18nUtil.INSTANCE.getInstance().allowRTL(this, false);
                    TTIMetrics.record$default(tTIMetrics, "I18nUtil.allowRtl()", 0L, null, false, 14, null);
                    FutureTask futureTask = new FutureTask(new a(this, 1));
                    q.B("CrashReportingInitThread", 0, new r0(2, futureTask), 23);
                    q.B("PreInitReactHost", 0, new b(this, 3), 23);
                    PerformanceTracing.INSTANCE.get().start();
                    ReactNetworking.INSTANCE.patchReactNetworking();
                    RLottieUtils.INSTANCE.init();
                    ThemeManager.INSTANCE.init(this);
                    ReactForkOverrides.INSTANCE.init();
                    HttpEngineFactoryResolver.INSTANCE.init(this);
                    TTIMetrics.record$default(tTIMetrics, "HttpEngineFactoryResolver.init()", 0L, null, false, 14, null);
                    AudioPlayerManager.INSTANCE.init(this);
                    TTIMetrics.record$default(tTIMetrics, "AudioPlayerManager.init()", 0L, null, false, 14, null);
                    PlayAssetDelivery.INSTANCE.initialize(this);
                    NativeExperiments nativeExperiments = this.reactNativeInitializationTask.get().getNativeExperiments();
                    CrashReporting.CrashReportingReady crashReportingReady = (CrashReporting.CrashReportingReady) futureTask.get();
                    CrashReporting crashReporting = CrashReporting.INSTANCE;
                    Intrinsics.checkNotNull(crashReportingReady);
                    crashReporting.setTag(crashReportingReady, "experiment_mounting_mode", String.valueOf(nativeExperiments.getMountingModeExperiment()));
                    crashReporting.setTag(crashReportingReady, "experiment_fresco_cache_treatment", String.valueOf(nativeExperiments.getFrescoCacheExperimentSettings().getTreatmentId()));
                    crashReporting.setTag(crashReportingReady, "experiment_fresco_cache_reduction_percent", String.valueOf(nativeExperiments.getFrescoCacheExperimentSettings().getReductionPercent()));
                    crashReporting.setTag(crashReportingReady, "experiment_fresco_disable_low_priority_memory_cache", String.valueOf(nativeExperiments.getFrescoCacheExperimentSettings().getDisableLowPriorityMemoryCache()));
                    ReactActivitySharedData.INSTANCE.getPrepareEverythingForActivity().countDown();
                    TTIModule.INSTANCE.markApplicationInitializeComplete();
                    TTIMetrics.record$default(tTIMetrics, "Finish MainApplication.initialize()", 0L, null, false, 14, null);
                } catch (Throwable th2) {
                    th = th2;
                    ReactActivitySharedData.INSTANCE.getPrepareEverythingForActivity().countDown();
                    TTIModule.INSTANCE.markApplicationInitializeComplete();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CrashReporting.CrashReportingReady performInitialization$lambda$10(MainApplication mainApplication) {
        String releaseName;
        BundleUpdater.OtaBundle bundle = BundleUpdater.INSTANCE.instance().getBundle();
        if (bundle == null || (releaseName = bundle.getReleaseName()) == null) {
            releaseName = "discord_android@344.13.0-0+344013";
        }
        CrashReporting.CrashReportingReady crashReportingReadyInit = CrashReporting.INSTANCE.init(mainApplication, releaseName, mainApplication.libdiscoreModuleProvider);
        TTIMetrics.record$default(TTIMetrics.INSTANCE, "CrashReporting.init()", 0L, null, false, 14, null);
        ForegroundServiceStartGuard.INSTANCE.setLogger(new s(3));
        return crashReportingReadyInit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performInitialization$lambda$10$lambda$9(String message, Map data) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, message, data, "fgs_guard", null, false, 24, null);
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performInitialization$lambda$11(FutureTask futureTask) {
        futureTask.run();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performInitialization$lambda$12(MainApplication mainApplication) {
        mainApplication.getReactHost();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performInitialization$lambda$8(MainApplication mainApplication) {
        mainApplication.reactNativeInitializationTask.run();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactHost reactHost_delegate$lambda$7(MainApplication mainApplication) {
        mainApplication.reactNativeInitializationTask.run();
        NativeExperiments nativeExperiments = mainApplication.reactNativeInitializationTask.get().getNativeExperiments();
        Context applicationContext = mainApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return DefaultReactHost.getDefaultReactHost(applicationContext, mainApplication.getReactNativeHost(), new HermesInstance(false, nativeExperiments.getHermesOccupancyTargetExperimentSettings().getUseOccupancyTarget75()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactNativeInitialization reactNativeInitializationTask$lambda$5(MainApplication mainApplication) throws InterruptedException {
        mainApplication.soloaderLoaded.await();
        LibdiscoreModuleClass.LibdiscoreModule libdiscoreModuleInit = LibdiscoreInitModule.INSTANCE.init(mainApplication);
        final NativeExperiments nativeExperiments = new NativeExperiments(libdiscoreModuleInit);
        nativeExperiments.prewarmAppStartExperiments();
        ReactNativeFeatureFlags.override(new ReactNativeNewArchitectureFeatureFlagsDefaults() { // from class: com.discord.MainApplication$reactNativeInitializationTask$1$1
            @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
            public boolean enableAccumulatedUpdatesInRawPropsAndroid() {
                return nativeExperiments.getMountingModeExperiment() >= 2;
            }

            @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
            public boolean enableFixForParentTagDuringReparenting() {
                return nativeExperiments.getRnFlagReparenting() <= 0;
            }

            @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
            public boolean enablePropsUpdateReconciliationAndroid() {
                return nativeExperiments.getMountingModeExperiment() >= 2;
            }

            @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
            public boolean fixFindShadowNodeByTagRaceCondition() {
                return true;
            }

            @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
            public boolean usePullModelOnAndroid() {
                return nativeExperiments.getMountingModeExperiment() == 3;
            }

            @Override // com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsDefaults, com.facebook.react.internal.featureflags.ReactNativeFeatureFlagsProvider
            public boolean useSilenceErrorSMMViewNotFound() {
                return nativeExperiments.getMountingModeExperiment() == 1;
            }
        });
        FrescoMemoryCacheExperimentSettingsExtensionsKt.configureFresco(nativeExperiments.getFrescoCacheExperimentSettings());
        ChatMosaicSharedPoolExperimentBootstrap.INSTANCE.configure(nativeExperiments.getChatMosaicSharedPoolExperimentSettings());
        FrescoModuleDiscord.INSTANCE.startFrescoInitializationAsync(mainApplication);
        DefaultSoLoader.maybeLoadSoLibrary();
        UIManagerConstantsCache.getInstance().init(mainApplication);
        y9.a aVar = HermesExecutor.f4790a;
        y9.a.b();
        return new ReactNativeInitialization(libdiscoreModuleInit, nativeExperiments);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context base) {
        Intrinsics.checkNotNullParameter(base, "base");
        super.attachBaseContext(base);
        q.B("helperReactNativeLoader", 10, new c6.a(1, base, this), 7);
    }

    @NotNull
    public final LibdiscoreModuleProvider getLibdiscoreModuleProvider() {
        return this.libdiscoreModuleProvider;
    }

    @Override // com.facebook.react.ReactApplication
    @NotNull
    public ReactHost getReactHost() {
        return (ReactHost) this.reactHost.getValue();
    }

    @Override // com.facebook.react.ReactApplication
    @NotNull
    public ReactNativeHost getReactNativeHost() {
        return this.reactNativeHost;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        Resources resources = super.getResources();
        if (resources == null) {
            Resources resources2 = super.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            return resources2;
        }
        float scaledFontSize = FontManager.INSTANCE.getScaledFontSize(this);
        Configuration configuration = resources.getConfiguration();
        Resources resources3 = this.fontScaledAppResources;
        if (resources3 != null && isReusableFor(resources3, resources, scaledFontSize)) {
            return resources3;
        }
        Configuration configuration2 = new Configuration(configuration);
        configuration2.fontScale = scaledFontSize;
        Resources resources4 = new Resources(resources.getAssets(), resources.getDisplayMetrics(), configuration2);
        this.fontScaledAppResources = resources4;
        return resources4;
    }

    @Override // android.app.Application
    public void onCreate() throws Throwable {
        super.onCreate();
        TTIModule.INSTANCE.initialize(this);
        initialize();
        q.B(null, 0, new b(this, 4), 31);
    }
}
