package com.discord.react_activities;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.core.view.e1;
import bc.e;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.crash_reporting.CrashReporting;
import com.discord.device.utils.IsMetaQuestKt;
import com.discord.jank_stats.FrameMetricsAggregator;
import com.discord.jank_stats.JankStatsAggregator;
import com.discord.js_watchdog.JSWatchdogManager;
import com.discord.logging.Log;
import com.discord.main.MainActivity;
import com.discord.scale.FontScaleUtilsKt;
import com.discord.share.ShareActivity;
import com.discord.theme.ThemeManager;
import com.discord.tti_manager.TTIModule;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.PermissionListener;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0004J\f\u0010\t\u001a\u00060\nR\u00020\u0000H\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\f\u0010\u0015\u001a\u00060\nR\u00020\u0000H&J\b\u0010\u0016\u001a\u00020\bH&J\b\u0010\u0017\u001a\u00020\fH\u0014J\b\u0010\u0018\u001a\u00020\fH\u0014J\b\u0010\u0019\u001a\u00020\fH\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/discord/react_activities/ReactActivity;", "Lcom/facebook/react/ReactActivity;", "<init>", "()V", "patchedResources", "Landroid/content/res/Resources;", "getResources", "getMainComponentName", "", "createReactActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "getActivityDelegate", "getNameOfComponent", "onResume", "onPause", "onDestroy", "ActivityDelegate", "Registry", "react_activity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactActivity extends com.facebook.react.ReactActivity {

    /* JADX INFO: renamed from: Registry, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Class<?> mainActivity;

    @NotNull
    private static final Class<?> shareActivity;
    private Resources patchedResources;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0096\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0014J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J/\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "Lcom/discord/react_activities/ReactActivity;", "<init>", "(Lcom/discord/react_activities/ReactActivity;Lcom/discord/react_activities/ReactActivity;)V", "isFabricEnabled", "", "createRootView", "Lcom/facebook/react/ReactRootView;", "requestPermissions", "", "permissions", "", "", "requestCode", "", "listener", "Lcom/facebook/react/modules/core/PermissionListener;", "([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V", "react_activity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public class ActivityDelegate extends ReactActivityDelegate {

        @NotNull
        private final ReactActivity activity;
        final /* synthetic */ ReactActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivityDelegate(@NotNull ReactActivity reactActivity, ReactActivity activity) throws ExecutionException, InterruptedException {
            super((com.facebook.react.ReactActivity) activity, reactActivity.getNameOfComponent());
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.this$0 = reactActivity;
            this.activity = activity;
            CrashReporting crashReporting = CrashReporting.INSTANCE;
            if (Intrinsics.areEqual(crashReporting.isCrashedLastRun(), Boolean.TRUE)) {
                CrashReporting.addBreadcrumb$default(crashReporting, "Checking for blocking OTA update", null, null, null, false, 30, null);
                Future futureCheckForUpdate$default = BundleUpdater.checkForUpdate$default(BundleUpdater.INSTANCE.instance(), 0, null, 2, null);
                if (futureCheckForUpdate$default != null) {
                    futureCheckForUpdate$default.get();
                }
            }
        }

        @Override // com.facebook.react.ReactActivityDelegate
        public ReactRootView createRootView() {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return new com.discord.react_rootview.ReactRootView(context);
        }

        @Override // com.facebook.react.ReactActivityDelegate
        /* JADX INFO: renamed from: isFabricEnabled */
        public boolean getFabricEnabled() {
            return true;
        }

        @Override // com.facebook.react.ReactActivityDelegate
        public void requestPermissions(@NotNull String[] permissions, int requestCode, PermissionListener listener) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.activity.runOnUiThread(new e(requestCode, 2, this, permissions, listener));
        }
    }

    /* JADX INFO: renamed from: com.discord.react_activities.ReactActivity$Registry, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/discord/react_activities/ReactActivity$Registry;", "", "<init>", "()V", "mainActivity", "Ljava/lang/Class;", "getMainActivity", "()Ljava/lang/Class;", "shareActivity", "getShareActivity", "react_activity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Class<?> getMainActivity() {
            return ReactActivity.mainActivity;
        }

        @NotNull
        public final Class<?> getShareActivity() {
            return ReactActivity.shareActivity;
        }

        private Companion() {
        }
    }

    static {
        Intrinsics.checkNotNullExpressionValue(MainActivity.class, "forName(...)");
        mainActivity = MainActivity.class;
        Intrinsics.checkNotNullExpressionValue(ShareActivity.class, "forName(...)");
        shareActivity = ShareActivity.class;
    }

    @Override // i.h, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        if (Build.VERSION.SDK_INT < 28) {
            String name = getClass().getName();
            Intrinsics.checkNotNull(name);
            if (x.h(name, ".MainActivity", false)) {
                TTIModule.INSTANCE.markMainActivityCreation();
            } else {
                TTIModule.INSTANCE.markActivityBeforeMain(name);
            }
        }
        if (!ReactActivitySharedData.INSTANCE.getPrepareEverythingForActivity().await(30L, TimeUnit.SECONDS)) {
            Log.e$default(Log.INSTANCE, "ReactActivity", "Timeout waiting for application initialization - proceeding anyway", (Throwable) null, 4, (Object) null);
        }
        super.attachBaseContext(FontScaleUtilsKt.getFontScaledContext(newBase));
    }

    @NotNull
    public abstract ActivityDelegate getActivityDelegate();

    @Override // com.facebook.react.ReactActivity
    @NotNull
    public final String getMainComponentName() {
        return getNameOfComponent();
    }

    @NotNull
    public abstract String getNameOfComponent();

    @Override // i.h, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    @NotNull
    public Resources getResources() {
        Resources resources = this.patchedResources;
        if (resources != null) {
            return resources;
        }
        Resources resources2 = super.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        return resources2;
    }

    @Override // com.facebook.react.ReactActivity, i.h, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        if (IsMetaQuestKt.isMetaQuest()) {
            this.patchedResources = newConfig.orientation != getResources().getConfiguration().orientation ? createConfigurationContext(newConfig).getResources() : null;
        }
        super.onConfigurationChanged(newConfig);
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        Intent intent = new Intent("onConfigurationChanged");
        intent.putExtra("newConfig", newConfig);
        sendBroadcast(intent);
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, x0.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(null);
        String name = getClass().getName();
        Intrinsics.checkNotNull(name);
        if (x.h(name, ".MainActivity", false)) {
            TTIModule.INSTANCE.setMainActivityIntent(getIntent());
        }
        BundleUpdater.INSTANCE.checkForOta();
        e1.a(getWindow());
        JankStatsAggregator jankStatsAggregator = JankStatsAggregator.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        jankStatsAggregator.initialize(window);
        FrameMetricsAggregator frameMetricsAggregator = FrameMetricsAggregator.INSTANCE;
        Window window2 = getWindow();
        Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
        frameMetricsAggregator.initialize(window2);
        JSWatchdogManager.INSTANCE.initialize(this);
        ThemeManager themeManager = ThemeManager.INSTANCE;
        themeManager.updateSystemUi(this);
        themeManager.updateWindowBackground(this, true);
    }

    @Override // com.facebook.react.ReactActivity, i.h, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        String name = getClass().getName();
        Intrinsics.checkNotNull(name);
        if (!x.h(name, ".MainActivity", false) || isChangingConfigurations()) {
            return;
        }
        TTIModule.INSTANCE.clearMainActivityCreation();
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        JankStatsAggregator.INSTANCE.disableTracking();
        FrameMetricsAggregator.INSTANCE.disableTracking();
        JSWatchdogManager.INSTANCE.disable();
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        JankStatsAggregator.INSTANCE.enableTracking();
        FrameMetricsAggregator frameMetricsAggregator = FrameMetricsAggregator.INSTANCE;
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        frameMetricsAggregator.bindTo(window);
        frameMetricsAggregator.enableTracking();
        JSWatchdogManager.INSTANCE.enable();
    }

    @Override // com.facebook.react.ReactActivity
    @NotNull
    public final ActivityDelegate createReactActivityDelegate() {
        return getActivityDelegate();
    }
}
