package com.discord.bundle_updater;

import a1.k;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.lifecycle.r0;
import com.discord.bundle_updater.react.events.BundleDownloadedEvent;
import com.discord.bundle_updater.react.events.OtaCheckAttemptEvent;
import com.discord.main.MainActivity;
import com.discord.misc.utilities.activity.ActivityExtensionsKt;
import com.discord.reactevents.ReactEvents;
import com.discord.theme.ThemeManagerKt;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.uimanager.ViewProps;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0017\u0010\bJ\u000f\u0010\u0018\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001c\u0010\u0015J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001e\u0010\u0015J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u000fH\u0007¢\u0006\u0004\b!\u0010\u001bJ\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/discord/bundle_updater/BundleUpdaterManager;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "showSpinnerView", "()V", "removeSpinnerView", "Lkotlin/Function1;", "Landroid/view/ViewGroup;", "callback", "runOnActivity", "(Lkotlin/jvm/functions/Function1;)V", "", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getInitialBundleDownloaded", "(Lcom/facebook/react/bridge/Promise;)V", "getInitialOtaUpdateChecked", "checkForUpdateAndReload", "reload", "type", "addListener", "(Ljava/lang/String;)V", "getOtaRootPath", "getManifestInfo", "getOtaStatus", "getBuildOverrideCookieContents", "cookieHeader", "setBuildOverrideCookieHeader", "", "count", "removeListeners", "(I)V", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/discord/reactevents/ReactEvents;", "reactEvents", "Lcom/discord/reactevents/ReactEvents;", "progressLayout", "Landroid/view/ViewGroup;", "Companion", "bundle_updater_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nBundleUpdaterManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BundleUpdaterManager.kt\ncom/discord/bundle_updater/BundleUpdaterManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CastUtils.kt\ncom/discord/misc/utilities/kotlin/CastUtilsKt\n*L\n1#1,165:1\n1#2:166\n8#3:167\n*S KotlinDebug\n*F\n+ 1 BundleUpdaterManager.kt\ncom/discord/bundle_updater/BundleUpdaterManager\n*L\n155#1:167\n*E\n"})
public final class BundleUpdaterManager extends ReactContextBaseJavaModule {

    @NotNull
    private static final String BUNDLE_DOWNLOADED = "BundleDownloaded";

    @NotNull
    private static final String OTA_UPDATE_CHECKED = "OtaUpdateChecked";
    private ViewGroup progressLayout;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final ReactEvents reactEvents;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BundleUpdaterManager(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.reactEvents = new ReactEvents(new Pair(BUNDLE_DOWNLOADED, Reflection.getOrCreateKotlinClass(BundleDownloadedEvent.class)), new Pair(OTA_UPDATE_CHECKED, Reflection.getOrCreateKotlinClass(OtaCheckAttemptEvent.class)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$1(BundleUpdaterManager bundleUpdaterManager, boolean z5) {
        bundleUpdaterManager.reactEvents.emitModuleEvent(bundleUpdaterManager.reactContext, new BundleDownloadedEvent(z5));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addListener$lambda$2(BundleUpdaterManager bundleUpdaterManager, List metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        bundleUpdaterManager.reactEvents.emitModuleEvent(bundleUpdaterManager.reactContext, new OtaCheckAttemptEvent(metrics));
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit checkForUpdateAndReload$lambda$0(BundleUpdaterManager bundleUpdaterManager) {
        bundleUpdaterManager.removeSpinnerView();
        bundleUpdaterManager.reload();
        return Unit.f14616a;
    }

    private final void removeSpinnerView() {
        runOnActivity(new c(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeSpinnerView$lambda$7(BundleUpdaterManager bundleUpdaterManager, ViewGroup runOnActivity) {
        Intrinsics.checkNotNullParameter(runOnActivity, "$this$runOnActivity");
        ViewGroup viewGroup = bundleUpdaterManager.progressLayout;
        if (viewGroup != null) {
            runOnActivity.removeView(viewGroup);
        }
        bundleUpdaterManager.progressLayout = null;
        return Unit.f14616a;
    }

    private final void runOnActivity(Function1<? super ViewGroup, Unit> callback) {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity != null) {
            currentActivity.runOnUiThread(new k(9, currentActivity, callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runOnActivity$lambda$9$lambda$8(Activity activity, Function1 function1) {
        View rootView = ActivityExtensionsKt.getRootView(activity);
        if (rootView != null) {
            if (!(rootView instanceof ViewGroup)) {
                rootView = null;
            }
            ViewGroup viewGroup = (ViewGroup) rootView;
            if (viewGroup != null) {
                function1.invoke(viewGroup);
            }
        }
    }

    private final void showSpinnerView() {
        ProgressBar progressBar = new ProgressBar(this.reactContext);
        progressBar.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        progressBar.setIndeterminate(true);
        FrameLayout frameLayout = new FrameLayout(this.reactContext);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(progressBar);
        frameLayout.setBackgroundColor(ThemeManagerKt.getTheme().getInteractiveBackgroundSelected());
        frameLayout.setClickable(true);
        this.progressLayout = frameLayout;
        runOnActivity(new c(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSpinnerView$lambda$5(BundleUpdaterManager bundleUpdaterManager, ViewGroup runOnActivity) {
        Intrinsics.checkNotNullParameter(runOnActivity, "$this$runOnActivity");
        runOnActivity.addView(bundleUpdaterManager.progressLayout);
        return Unit.f14616a;
    }

    @ReactMethod
    public final void addListener(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.areEqual(type, BUNDLE_DOWNLOADED)) {
            BundleUpdater.INSTANCE.instance().setOnBundleDownloadedListener(new c(this, 1));
        } else if (Intrinsics.areEqual(type, OTA_UPDATE_CHECKED)) {
            BundleUpdater.INSTANCE.instance().setOnOtaUpdateCheckedListener(new c(this, 2));
        }
    }

    @ReactMethod
    public final void checkForUpdateAndReload() {
        showSpinnerView();
        BundleUpdater.Companion companion = BundleUpdater.INSTANCE;
        BundleUpdater.checkForUpdate$default(companion.instance(), 0, new r0(5, this), 1, null);
        ReactApplicationContext reactApplicationContext = this.reactContext;
        int i7 = MainActivity.f4409e;
        Intrinsics.checkNotNullExpressionValue(MainActivity.class, "forName(...)");
        companion.addClearBuildOverrideShortcut(reactApplicationContext, MainActivity.class);
    }

    @ReactMethod
    public final void getBuildOverrideCookieContents(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        BuildOverrideCookieContents buildOverrideCookie = CookieValidator.INSTANCE.parseBuildOverrideCookie(BundleUpdater.INSTANCE.instance().getBuildOverrideCookie());
        promise.resolve(buildOverrideCookie != null ? buildOverrideCookie.toNativeMap() : null);
    }

    @ReactMethod
    public final void getInitialBundleDownloaded(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(new BundleDownloadedEvent(BundleUpdater.INSTANCE.instance().getIsVersionRequired()).getData());
    }

    @ReactMethod
    public final void getInitialOtaUpdateChecked(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(new OtaCheckAttemptEvent(BundleUpdater.INSTANCE.instance().getOtaMetrics()).getData());
    }

    @ReactMethod
    public final void getManifestInfo(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        BundleUpdater.ManifestInfo manifestInfo = BundleUpdater.INSTANCE.instance().manifestInfo();
        promise.resolve(manifestInfo != null ? manifestInfo.toNativeMap() : null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "BundleUpdaterManager";
    }

    @ReactMethod
    public final void getOtaRootPath(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(BundleUpdater.INSTANCE.instance().getOtasRootDirectory().getAbsolutePath());
    }

    @ReactMethod
    public final void getOtaStatus(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        promise.resolve(ViewProps.NONE);
    }

    @ReactMethod
    public final void reload() {
        ProcessPhoenix.a(this.reactContext);
    }

    @ReactMethod
    public final void removeListeners(int count) {
    }

    @ReactMethod
    public final void setBuildOverrideCookieHeader(@NotNull String cookieHeader) {
        Intrinsics.checkNotNullParameter(cookieHeader, "cookieHeader");
        BundleUpdater.INSTANCE.instance().setBuildOverrideCookieHeader(cookieHeader);
    }
}
