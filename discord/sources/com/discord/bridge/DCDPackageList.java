package com.discord.bridge;

import ar.u;
import com.discord.ads.AdsModule;
import com.discord.age_assurance.DigitalCredentialModule;
import com.discord.age_assurance.PlayAgeSignalsModule;
import com.discord.age_assurance.PlayIntegrityModule;
import com.discord.analytics.InstallReferrerModule;
import com.discord.analytics.touch.TouchEventAnalyticsModule;
import com.discord.animated_png.react.APNGPackage;
import com.discord.app_database.AppDatabaseModule;
import com.discord.app_icon.AppIconModule;
import com.discord.appreview.AppRatingRequestModule;
import com.discord.audio.AudioManagerModule;
import com.discord.audio.AudioRouteEmitterModule;
import com.discord.authentication.AuthenticationPackage;
import com.discord.avatar.react.AvatarPackage;
import com.discord.billing.BillingManagerModule;
import com.discord.blur.BlurViewPackage;
import com.discord.browser_manager.BrowserManagerModule;
import com.discord.bug_reporter.ScreenshotHelperModule;
import com.discord.bundle_updater.BundleUpdaterManager;
import com.discord.cache.CacheModule;
import com.discord.chat.ChatPackage;
import com.discord.chat.input.ChatInputViewManager;
import com.discord.chat.presentation.message.view.voicemessages.AudioPlayerModule;
import com.discord.client_info.react.ClientInfoPackage;
import com.discord.clip.ClipViewManager;
import com.discord.codegen.NativeAdsModuleSpec;
import com.discord.codegen.NativeAppDatabaseModuleSpec;
import com.discord.codegen.NativeAppIconModuleSpec;
import com.discord.codegen.NativeAppLifecycleModuleSpec;
import com.discord.codegen.NativeAppRatingRequestModuleSpec;
import com.discord.codegen.NativeAudioManagerModuleSpec;
import com.discord.codegen.NativeAudioPlayerModuleSpec;
import com.discord.codegen.NativeAudioRouteEmitterModuleSpec;
import com.discord.codegen.NativeBrowserManagerModuleSpec;
import com.discord.codegen.NativeCacheModuleSpec;
import com.discord.codegen.NativeCommandClipboardModuleSpec;
import com.discord.codegen.NativeCompressionModuleSpec;
import com.discord.codegen.NativeDateFormatUtilsModuleSpec;
import com.discord.codegen.NativeDigitalCredentialModuleSpec;
import com.discord.codegen.NativeFileModuleSpec;
import com.discord.codegen.NativeI18nModuleSpec;
import com.discord.codegen.NativeJSWatchdogModuleSpec;
import com.discord.codegen.NativeJankSessionModuleSpec;
import com.discord.codegen.NativeJankStatsModuleSpec;
import com.discord.codegen.NativeKeyCommandsModuleSpec;
import com.discord.codegen.NativeKeyboardModuleSpec;
import com.discord.codegen.NativeMediaEngineModuleSpec;
import com.discord.codegen.NativeMetricMonitorModuleSpec;
import com.discord.codegen.NativeMobileVoiceOverlayModuleSpec;
import com.discord.codegen.NativeNotifSettingsModuleSpec;
import com.discord.codegen.NativeOnDemandResourceModuleSpec;
import com.discord.codegen.NativePlayAgeSignalsModuleSpec;
import com.discord.codegen.NativePlayIntegrityModuleSpec;
import com.discord.codegen.NativePushNotificationMonitorModuleSpec;
import com.discord.codegen.NativeReactAssetModuleSpec;
import com.discord.codegen.NativeSecurityKeyManagerModuleSpec;
import com.discord.codegen.NativeShareManagerModuleSpec;
import com.discord.codegen.NativeSystraceModuleSpec;
import com.discord.codegen.NativeTTIManagerModuleSpec;
import com.discord.codegen.NativeTTIModuleSpec;
import com.discord.codegen.NativeTelecomModuleSpec;
import com.discord.codegen.NativeTelemetryRingModuleSpec;
import com.discord.codegen.NativeThemeModuleSpec;
import com.discord.codegen.NativeTimersModuleSpec;
import com.discord.codegen.NativeTimezoneHermesFixModuleSpec;
import com.discord.codegen.NativeTouchEventAnalyticsModuleSpec;
import com.discord.command_clipboard.CommandClipboardModule;
import com.discord.compression.CompressionModule;
import com.discord.contact_sync.ContactSyncManagerModule;
import com.discord.core.LocalImageThumbnailViewManager;
import com.discord.crash_reporting.CrashReportingModule;
import com.discord.crash_reporting.TelemetryRingModule;
import com.discord.deep_link.DeepLinkManagerModule;
import com.discord.device.DevicePackage;
import com.discord.emoji_picker.react.EmojiPickerPackage;
import com.discord.external_pip.ExternalPipModule;
import com.discord.fast_connect.FastConnectPackage;
import com.discord.fastest_list.react.FastestListPackage;
import com.discord.file_manager.FileModule;
import com.discord.foreground_service.ForegroundServiceModule;
import com.discord.hosts.HostsModule;
import com.discord.image.dominant_color.ImageManagerModule;
import com.discord.image.fresco.FrescoModuleDiscord;
import com.discord.intents.IntentsPackage;
import com.discord.jank_stats.JankSessionModule;
import com.discord.jank_stats.JankStatsModule;
import com.discord.js_watchdog.JSWatchdogModule;
import com.discord.key_commands.KeyCommandsModule;
import com.discord.key_commands.KeyCommandsViewManager;
import com.discord.keyboard.KeyboardModule;
import com.discord.libdiscore.LibDiscorePackage;
import com.discord.libdiscore.LibdiscoreModuleProvider;
import com.discord.lifecycle.AppLifecycleModule;
import com.discord.media.MediaFetcherModule;
import com.discord.media.MediaManagerModule;
import com.discord.media.PhotoLibraryHelperModule;
import com.discord.media.engine.MediaEngineModule;
import com.discord.media.engine.video.VideoStreamViewManager;
import com.discord.media_player.MediaPlayerManagerModule;
import com.discord.metric_monitor.MetricMonitorModule;
import com.discord.minimize_app.MinimizeAppModule;
import com.discord.mobile_voice_overlay.MobileVoiceOverlayModule;
import com.discord.notifications.react.NotifSettingsModule;
import com.discord.notifications.react.NotificationManager;
import com.discord.notifications.react.PushNotificationCategoryModule;
import com.discord.notifications.react.PushNotificationModule;
import com.discord.on_demand_resource.OnDemandResourceModule;
import com.discord.permissions.NativePermissionManagerModule;
import com.discord.phone_verification.SmsAutofillManagerModule;
import com.discord.portals.PortalsPackage;
import com.discord.push_notification_monitor.PushNotificationMonitorModule;
import com.discord.qr.scanner.QRScannerViewManager;
import com.discord.react.FontPackage;
import com.discord.react.utilities.DateFormatUtilsModule;
import com.discord.react_asset_fetcher.ReactAssetModule;
import com.discord.react_gesture_handler.DiscordGestureHandlerPackage;
import com.discord.react_strings.I18nModule;
import com.discord.resource_usage.DeviceResourceUsageManagerModule;
import com.discord.safearea.SafeAreaPackage;
import com.discord.samsung.SamsungModule;
import com.discord.security_key.SecurityKeyManagerModule;
import com.discord.share.ShareManagerModule;
import com.discord.shortcuts.ShortcutManagerModule;
import com.discord.sounds.SoundManagerModule;
import com.discord.sticker.react.StickerPackage;
import com.discord.sticker_picker.react.StickerPickerPackage;
import com.discord.systrace.SystraceModule;
import com.discord.telecom.TelecomModule;
import com.discord.theme.ThemeModule;
import com.discord.thumbhash.ThumbhashPackage;
import com.discord.time_zone_fix.TimezoneHermesFixModule;
import com.discord.timers.TimersModule;
import com.discord.tti_manager.TTIManagerModule;
import com.discord.tti_manager.TTIModule;
import com.discord.tti_measurement_view.TTIMeasurementViewPackage;
import com.discord.user_search_worker.UserSearchWorkerManagerModule;
import com.discord.view.ReactScrollViewManagerOverride;
import com.discord.view.ReactViewManagerOverride;
import com.discord.view.ScreenStackViewManagerOverride;
import com.discord.view.ScreenViewManagerOverride;
import com.discord.wakelock.WakelockPackage;
import com.discord.zoom_layout.ZoomLayoutPackage;
import com.facebook.react.PackageList;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/discord/bridge/DCDPackageList;", "Lcom/facebook/react/PackageList;", "host", "Lcom/facebook/react/ReactNativeHost;", "libdiscoreModuleProvider", "Lcom/discord/libdiscore/LibdiscoreModuleProvider;", "<init>", "(Lcom/facebook/react/ReactNativeHost;Lcom/discord/libdiscore/LibdiscoreModuleProvider;)V", "getPackages", "Ljava/util/ArrayList;", "Lcom/facebook/react/ReactPackage;", "Lkotlin/collections/ArrayList;", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DCDPackageList extends PackageList {

    @NotNull
    private final LibdiscoreModuleProvider libdiscoreModuleProvider;

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, BillingManagerModule> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1, BillingManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BillingManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new BillingManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$10, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass10 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, ImageManagerModule> {
        public static final AnonymousClass10 INSTANCE = new AnonymousClass10();

        public AnonymousClass10() {
            super(1, ImageManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ImageManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new ImageManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$11, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass11 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, InstallReferrerModule> {
        public static final AnonymousClass11 INSTANCE = new AnonymousClass11();

        public AnonymousClass11() {
            super(1, InstallReferrerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final InstallReferrerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new InstallReferrerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$12, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass12 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, MediaFetcherModule> {
        public static final AnonymousClass12 INSTANCE = new AnonymousClass12();

        public AnonymousClass12() {
            super(1, MediaFetcherModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MediaFetcherModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new MediaFetcherModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$13, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass13 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, MediaManagerModule> {
        public static final AnonymousClass13 INSTANCE = new AnonymousClass13();

        public AnonymousClass13() {
            super(1, MediaManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MediaManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new MediaManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$14, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass14 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, MediaPlayerManagerModule> {
        public static final AnonymousClass14 INSTANCE = new AnonymousClass14();

        public AnonymousClass14() {
            super(1, MediaPlayerManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MediaPlayerManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new MediaPlayerManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$15, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass15 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, MinimizeAppModule> {
        public static final AnonymousClass15 INSTANCE = new AnonymousClass15();

        public AnonymousClass15() {
            super(1, MinimizeAppModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MinimizeAppModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new MinimizeAppModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$16, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass16 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, NativePermissionManagerModule> {
        public static final AnonymousClass16 INSTANCE = new AnonymousClass16();

        public AnonymousClass16() {
            super(1, NativePermissionManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NativePermissionManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new NativePermissionManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$17, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass17 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, NotificationManager> {
        public static final AnonymousClass17 INSTANCE = new AnonymousClass17();

        public AnonymousClass17() {
            super(1, NotificationManager.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NotificationManager invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new NotificationManager(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$18, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass18 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, PhotoLibraryHelperModule> {
        public static final AnonymousClass18 INSTANCE = new AnonymousClass18();

        public AnonymousClass18() {
            super(1, PhotoLibraryHelperModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PhotoLibraryHelperModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new PhotoLibraryHelperModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$19, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass19 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, PushNotificationCategoryModule> {
        public static final AnonymousClass19 INSTANCE = new AnonymousClass19();

        public AnonymousClass19() {
            super(1, PushNotificationCategoryModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PushNotificationCategoryModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new PushNotificationCategoryModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, BundleUpdaterManager> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1, BundleUpdaterManager.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BundleUpdaterManager invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new BundleUpdaterManager(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$20, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass20 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, PushNotificationModule> {
        public static final AnonymousClass20 INSTANCE = new AnonymousClass20();

        public AnonymousClass20() {
            super(1, PushNotificationModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PushNotificationModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new PushNotificationModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$21, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass21 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, ShortcutManagerModule> {
        public static final AnonymousClass21 INSTANCE = new AnonymousClass21();

        public AnonymousClass21() {
            super(1, ShortcutManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ShortcutManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new ShortcutManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$22, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass22 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, SmsAutofillManagerModule> {
        public static final AnonymousClass22 INSTANCE = new AnonymousClass22();

        public AnonymousClass22() {
            super(1, SmsAutofillManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SmsAutofillManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new SmsAutofillManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$23, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass23 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, ScreenshotHelperModule> {
        public static final AnonymousClass23 INSTANCE = new AnonymousClass23();

        public AnonymousClass23() {
            super(1, ScreenshotHelperModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ScreenshotHelperModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new ScreenshotHelperModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$24, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass24 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, SamsungModule> {
        public static final AnonymousClass24 INSTANCE = new AnonymousClass24();

        public AnonymousClass24() {
            super(1, SamsungModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SamsungModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new SamsungModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$25, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass25 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, SoundManagerModule> {
        public static final AnonymousClass25 INSTANCE = new AnonymousClass25();

        public AnonymousClass25() {
            super(1, SoundManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SoundManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new SoundManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$26, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass26 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, UserSearchWorkerManagerModule> {
        public static final AnonymousClass26 INSTANCE = new AnonymousClass26();

        public AnonymousClass26() {
            super(1, UserSearchWorkerManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final UserSearchWorkerManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new UserSearchWorkerManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, ContactSyncManagerModule> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(1, ContactSyncManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ContactSyncManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new ContactSyncManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$38, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass38 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, AdsModule> {
        public static final AnonymousClass38 INSTANCE = new AnonymousClass38();

        public AnonymousClass38() {
            super(1, AdsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AdsModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new AdsModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$39, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass39 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, AppDatabaseModule> {
        public static final AnonymousClass39 INSTANCE = new AnonymousClass39();

        public AnonymousClass39() {
            super(1, AppDatabaseModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AppDatabaseModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new AppDatabaseModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$4, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, CrashReportingModule> {
        public static final AnonymousClass4 INSTANCE = new AnonymousClass4();

        public AnonymousClass4() {
            super(1, CrashReportingModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CrashReportingModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new CrashReportingModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$40, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass40 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, AppIconModule> {
        public static final AnonymousClass40 INSTANCE = new AnonymousClass40();

        public AnonymousClass40() {
            super(1, AppIconModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AppIconModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new AppIconModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$41, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass41 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, AppLifecycleModule> {
        public static final AnonymousClass41 INSTANCE = new AnonymousClass41();

        public AnonymousClass41() {
            super(1, AppLifecycleModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AppLifecycleModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new AppLifecycleModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$42, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass42 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, AppRatingRequestModule> {
        public static final AnonymousClass42 INSTANCE = new AnonymousClass42();

        public AnonymousClass42() {
            super(1, AppRatingRequestModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AppRatingRequestModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new AppRatingRequestModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$43, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass43 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, NativeModule> {
        public AnonymousClass43(Object obj) {
            super(1, obj, AudioManagerModule.Companion.class, "create", "create(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/NativeModule;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NativeModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return ((AudioManagerModule.Companion) this.receiver).create(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$44, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass44 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, AudioPlayerModule> {
        public static final AnonymousClass44 INSTANCE = new AnonymousClass44();

        public AnonymousClass44() {
            super(1, AudioPlayerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AudioPlayerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new AudioPlayerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$45, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass45 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, AudioRouteEmitterModule> {
        public static final AnonymousClass45 INSTANCE = new AnonymousClass45();

        public AnonymousClass45() {
            super(1, AudioRouteEmitterModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AudioRouteEmitterModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new AudioRouteEmitterModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$46, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass46 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, BrowserManagerModule> {
        public static final AnonymousClass46 INSTANCE = new AnonymousClass46();

        public AnonymousClass46() {
            super(1, BrowserManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BrowserManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new BrowserManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$47, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass47 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, CacheModule> {
        public static final AnonymousClass47 INSTANCE = new AnonymousClass47();

        public AnonymousClass47() {
            super(1, CacheModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CacheModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new CacheModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$48, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass48 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, CommandClipboardModule> {
        public static final AnonymousClass48 INSTANCE = new AnonymousClass48();

        public AnonymousClass48() {
            super(1, CommandClipboardModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CommandClipboardModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new CommandClipboardModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$49, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass49 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, CompressionModule> {
        public static final AnonymousClass49 INSTANCE = new AnonymousClass49();

        public AnonymousClass49() {
            super(1, CompressionModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CompressionModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new CompressionModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$5, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, DeviceResourceUsageManagerModule> {
        public static final AnonymousClass5 INSTANCE = new AnonymousClass5();

        public AnonymousClass5() {
            super(1, DeviceResourceUsageManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DeviceResourceUsageManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new DeviceResourceUsageManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$50, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass50 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, PlayAgeSignalsModule> {
        public static final AnonymousClass50 INSTANCE = new AnonymousClass50();

        public AnonymousClass50() {
            super(1, PlayAgeSignalsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PlayAgeSignalsModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new PlayAgeSignalsModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$51, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass51 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, PlayIntegrityModule> {
        public static final AnonymousClass51 INSTANCE = new AnonymousClass51();

        public AnonymousClass51() {
            super(1, PlayIntegrityModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PlayIntegrityModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new PlayIntegrityModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$52, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass52 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, DateFormatUtilsModule> {
        public static final AnonymousClass52 INSTANCE = new AnonymousClass52();

        public AnonymousClass52() {
            super(1, DateFormatUtilsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DateFormatUtilsModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new DateFormatUtilsModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$53, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass53 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, DigitalCredentialModule> {
        public static final AnonymousClass53 INSTANCE = new AnonymousClass53();

        public AnonymousClass53() {
            super(1, DigitalCredentialModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DigitalCredentialModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new DigitalCredentialModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$54, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass54 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, FileModule> {
        public static final AnonymousClass54 INSTANCE = new AnonymousClass54();

        public AnonymousClass54() {
            super(1, FileModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FileModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new FileModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$55, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass55 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, I18nModule> {
        public static final AnonymousClass55 INSTANCE = new AnonymousClass55();

        public AnonymousClass55() {
            super(1, I18nModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final I18nModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new I18nModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$56, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass56 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, JankSessionModule> {
        public static final AnonymousClass56 INSTANCE = new AnonymousClass56();

        public AnonymousClass56() {
            super(1, JankSessionModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final JankSessionModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new JankSessionModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$57, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass57 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, JankStatsModule> {
        public static final AnonymousClass57 INSTANCE = new AnonymousClass57();

        public AnonymousClass57() {
            super(1, JankStatsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final JankStatsModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new JankStatsModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$58, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass58 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, JSWatchdogModule> {
        public static final AnonymousClass58 INSTANCE = new AnonymousClass58();

        public AnonymousClass58() {
            super(1, JSWatchdogModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final JSWatchdogModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new JSWatchdogModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$59, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass59 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, KeyCommandsModule> {
        public static final AnonymousClass59 INSTANCE = new AnonymousClass59();

        public AnonymousClass59() {
            super(1, KeyCommandsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final KeyCommandsModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new KeyCommandsModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$6, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, DeepLinkManagerModule> {
        public static final AnonymousClass6 INSTANCE = new AnonymousClass6();

        public AnonymousClass6() {
            super(1, DeepLinkManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final DeepLinkManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new DeepLinkManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$60, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass60 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, KeyboardModule> {
        public static final AnonymousClass60 INSTANCE = new AnonymousClass60();

        public AnonymousClass60() {
            super(1, KeyboardModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final KeyboardModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new KeyboardModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$61, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass61 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, MetricMonitorModule> {
        public static final AnonymousClass61 INSTANCE = new AnonymousClass61();

        public AnonymousClass61() {
            super(1, MetricMonitorModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MetricMonitorModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new MetricMonitorModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$62, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass62 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, MobileVoiceOverlayModule> {
        public static final AnonymousClass62 INSTANCE = new AnonymousClass62();

        public AnonymousClass62() {
            super(1, MobileVoiceOverlayModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MobileVoiceOverlayModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new MobileVoiceOverlayModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$63, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass63 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, OnDemandResourceModule> {
        public static final AnonymousClass63 INSTANCE = new AnonymousClass63();

        public AnonymousClass63() {
            super(1, OnDemandResourceModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final OnDemandResourceModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new OnDemandResourceModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$64, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass64 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, NotifSettingsModule> {
        public static final AnonymousClass64 INSTANCE = new AnonymousClass64();

        public AnonymousClass64() {
            super(1, NotifSettingsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final NotifSettingsModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new NotifSettingsModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$65, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass65 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, PushNotificationMonitorModule> {
        public static final AnonymousClass65 INSTANCE = new AnonymousClass65();

        public AnonymousClass65() {
            super(1, PushNotificationMonitorModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PushNotificationMonitorModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new PushNotificationMonitorModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$66, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass66 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, ReactAssetModule> {
        public static final AnonymousClass66 INSTANCE = new AnonymousClass66();

        public AnonymousClass66() {
            super(1, ReactAssetModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ReactAssetModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new ReactAssetModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$67, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass67 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, SecurityKeyManagerModule> {
        public static final AnonymousClass67 INSTANCE = new AnonymousClass67();

        public AnonymousClass67() {
            super(1, SecurityKeyManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SecurityKeyManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new SecurityKeyManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$68, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass68 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, ShareManagerModule> {
        public static final AnonymousClass68 INSTANCE = new AnonymousClass68();

        public AnonymousClass68() {
            super(1, ShareManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ShareManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new ShareManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$69, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass69 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, SystraceModule> {
        public static final AnonymousClass69 INSTANCE = new AnonymousClass69();

        public AnonymousClass69() {
            super(1, SystraceModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final SystraceModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new SystraceModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$7, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass7 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, ForegroundServiceModule> {
        public static final AnonymousClass7 INSTANCE = new AnonymousClass7();

        public AnonymousClass7() {
            super(1, ForegroundServiceModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ForegroundServiceModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new ForegroundServiceModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$70, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass70 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, ThemeModule> {
        public static final AnonymousClass70 INSTANCE = new AnonymousClass70();

        public AnonymousClass70() {
            super(1, ThemeModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ThemeModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new ThemeModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$71, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass71 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, TimersModule> {
        public static final AnonymousClass71 INSTANCE = new AnonymousClass71();

        public AnonymousClass71() {
            super(1, TimersModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TimersModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new TimersModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$72, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass72 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, TTIManagerModule> {
        public static final AnonymousClass72 INSTANCE = new AnonymousClass72();

        public AnonymousClass72() {
            super(1, TTIManagerModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TTIManagerModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new TTIManagerModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$73, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass73 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, TTIModule> {
        public static final AnonymousClass73 INSTANCE = new AnonymousClass73();

        public AnonymousClass73() {
            super(1, TTIModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TTIModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new TTIModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$74, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass74 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, TelemetryRingModule> {
        public static final AnonymousClass74 INSTANCE = new AnonymousClass74();

        public AnonymousClass74() {
            super(1, TelemetryRingModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TelemetryRingModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new TelemetryRingModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$75, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass75 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, MediaEngineModule> {
        public static final AnonymousClass75 INSTANCE = new AnonymousClass75();

        public AnonymousClass75() {
            super(1, MediaEngineModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final MediaEngineModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new MediaEngineModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$76, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass76 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, TelecomModule> {
        public static final AnonymousClass76 INSTANCE = new AnonymousClass76();

        public AnonymousClass76() {
            super(1, TelecomModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TelecomModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new TelecomModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$77, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass77 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, TouchEventAnalyticsModule> {
        public static final AnonymousClass77 INSTANCE = new AnonymousClass77();

        public AnonymousClass77() {
            super(1, TouchEventAnalyticsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TouchEventAnalyticsModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new TouchEventAnalyticsModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$78, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass78 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, TimezoneHermesFixModule> {
        public static final AnonymousClass78 INSTANCE = new AnonymousClass78();

        public AnonymousClass78() {
            super(1, TimezoneHermesFixModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final TimezoneHermesFixModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new TimezoneHermesFixModule(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$8, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass8 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, FrescoModuleDiscord> {
        public static final AnonymousClass8 INSTANCE = new AnonymousClass8();

        public AnonymousClass8() {
            super(1, FrescoModuleDiscord.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final FrescoModuleDiscord invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new FrescoModuleDiscord(p3);
        }
    }

    /* JADX INFO: renamed from: com.discord.bridge.DCDPackageList$getPackages$9, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass9 extends FunctionReferenceImpl implements Function1<ReactApplicationContext, HostsModule> {
        public static final AnonymousClass9 INSTANCE = new AnonymousClass9();

        public AnonymousClass9() {
            super(1, HostsModule.class, "<init>", "<init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final HostsModule invoke(ReactApplicationContext p3) {
            Intrinsics.checkNotNullParameter(p3, "p0");
            return new HostsModule(p3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DCDPackageList(@NotNull ReactNativeHost host, @NotNull LibdiscoreModuleProvider libdiscoreModuleProvider) {
        super(host);
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(libdiscoreModuleProvider, "libdiscoreModuleProvider");
        this.libdiscoreModuleProvider = libdiscoreModuleProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactContextBaseJavaModule getPackages$lambda$0(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new ExternalPipModule(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$1(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new VideoStreamViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final ViewManager getPackages$lambda$10(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ReactScrollViewManagerOverride(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$2(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ChatInputViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$3(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ClipViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$4(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new KeyCommandsViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$5(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new LocalImageThumbnailViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$6(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new QRScannerViewManager();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$7(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ScreenStackViewManagerOverride();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$8(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ScreenViewManagerOverride();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewManager getPackages$lambda$9(ReactApplicationContext it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new ReactViewManagerOverride();
    }

    @Override // com.facebook.react.PackageList
    @NotNull
    public ArrayList<ReactPackage> getPackages() {
        ArrayList<ReactPackage> packages = super.getPackages();
        packages.add(new LibDiscorePackage(this.libdiscoreModuleProvider));
        DCDModuleProvider dCDModuleProvider = DCDModuleProvider.INSTANCE;
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass1.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass2.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass3.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass4.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass5.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass6.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass7.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass8.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass9.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass10.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass11.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass12.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass13.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass14.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass15.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass16.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass17.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass18.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass19.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass20.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass21.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass22.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass23.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass24.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass25.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(AnonymousClass26.INSTANCE));
        packages.add(dCDModuleProvider.getLegacyPackageForModule(new u(9)));
        packages.add(DCDModuleProvider.getLegacyPackageForModuleWithViewManager$default(dCDModuleProvider, null, new u(12), 1, null));
        packages.add(dCDModuleProvider.getViewManagers(new u(13), new u(14), new u(15), new u(16), new u(17), new u(18), new u(19), new u(10), new u(11)));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeAdsModuleSpec.NAME, AnonymousClass38.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeAppDatabaseModuleSpec.NAME, AnonymousClass39.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeAppIconModuleSpec.NAME, AnonymousClass40.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeAppLifecycleModuleSpec.NAME, AnonymousClass41.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeAppRatingRequestModuleSpec.NAME, AnonymousClass42.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeAudioManagerModuleSpec.NAME, new AnonymousClass43(AudioManagerModule.INSTANCE)));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeAudioPlayerModuleSpec.NAME, AnonymousClass44.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeAudioRouteEmitterModuleSpec.NAME, AnonymousClass45.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeBrowserManagerModuleSpec.NAME, AnonymousClass46.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeCacheModuleSpec.NAME, AnonymousClass47.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeCommandClipboardModuleSpec.NAME, AnonymousClass48.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeCompressionModuleSpec.NAME, AnonymousClass49.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativePlayAgeSignalsModuleSpec.NAME, AnonymousClass50.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativePlayIntegrityModuleSpec.NAME, AnonymousClass51.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeDateFormatUtilsModuleSpec.NAME, AnonymousClass52.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeDigitalCredentialModuleSpec.NAME, AnonymousClass53.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeFileModuleSpec.NAME, AnonymousClass54.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeI18nModuleSpec.NAME, AnonymousClass55.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeJankSessionModuleSpec.NAME, AnonymousClass56.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeJankStatsModuleSpec.NAME, AnonymousClass57.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeJSWatchdogModuleSpec.NAME, AnonymousClass58.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeKeyCommandsModuleSpec.NAME, AnonymousClass59.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeKeyboardModuleSpec.NAME, AnonymousClass60.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeMetricMonitorModuleSpec.NAME, AnonymousClass61.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeMobileVoiceOverlayModuleSpec.NAME, AnonymousClass62.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeOnDemandResourceModuleSpec.NAME, AnonymousClass63.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeNotifSettingsModuleSpec.NAME, AnonymousClass64.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativePushNotificationMonitorModuleSpec.NAME, AnonymousClass65.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeReactAssetModuleSpec.NAME, AnonymousClass66.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeSecurityKeyManagerModuleSpec.NAME, AnonymousClass67.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeShareManagerModuleSpec.NAME, AnonymousClass68.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeSystraceModuleSpec.NAME, AnonymousClass69.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeThemeModuleSpec.NAME, AnonymousClass70.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeTimersModuleSpec.NAME, AnonymousClass71.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeTTIManagerModuleSpec.NAME, AnonymousClass72.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeTTIModuleSpec.NAME, AnonymousClass73.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeTelemetryRingModuleSpec.NAME, AnonymousClass74.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeMediaEngineModuleSpec.NAME, AnonymousClass75.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeTelecomModuleSpec.NAME, AnonymousClass76.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeTouchEventAnalyticsModuleSpec.NAME, AnonymousClass77.INSTANCE));
        packages.add(dCDModuleProvider.getTurboPackageForModule(NativeTimezoneHermesFixModuleSpec.NAME, AnonymousClass78.INSTANCE));
        Intrinsics.checkNotNull(packages);
        dCDModuleProvider.addTurboPackages(packages, new AuthenticationPackage(), new APNGPackage(), new AvatarPackage(), new BlurViewPackage(), new ClientInfoPackage(), new ChatPackage(), new DevicePackage(), new DiscordGestureHandlerPackage(), new EmojiPickerPackage(), new FastConnectPackage(), new FastestListPackage(), new FontPackage(), new IntentsPackage(), new PortalsPackage(), new SafeAreaPackage(), new StickerPackage(), new StickerPickerPackage(), new ThumbhashPackage(), new TTIMeasurementViewPackage(), new WakelockPackage(), new ZoomLayoutPackage());
        return packages;
    }
}
