package com.discord.main;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.discord.bundle_updater.BundleUpdater;
import com.discord.external_pip.ExternalPipModule;
import com.discord.foreground_service.ForegroundServiceManager;
import com.discord.notifications.client.NotificationClient;
import com.discord.react_activities.ReactActivity;
import com.facebook.react.bridge.ReactContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\f\u0010\n\u001a\u00060\u000bR\u00020\u0001H\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0017J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0017J\b\u0010\u0012\u001a\u00020\u0007H\u0014J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0003¨\u0006\u0015"}, d2 = {"Lcom/discord/main/MainActivity;", "Lcom/discord/react_activities/ReactActivity;", "<init>", "()V", "getNameOfComponent", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "getActivityDelegate", "Lcom/discord/react_activities/ReactActivity$ActivityDelegate;", "onUserLeaveHint", "onPictureInPictureModeChanged", "isInPictureInPictureMode", "", "newConfig", "Landroid/content/res/Configuration;", "onStop", "currentReactContext", "Lcom/facebook/react/bridge/ReactContext;", "main_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainActivity extends ReactActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f4409e = 0;

    @SuppressLint({"VisibleForTests"})
    private final ReactContext currentReactContext() {
        return getReactActivityDelegate().getCurrentReactContext();
    }

    @Override // com.discord.react_activities.ReactActivity
    @NotNull
    public ReactActivity.ActivityDelegate getActivityDelegate() {
        return new ReactActivity.ActivityDelegate() { // from class: com.discord.main.MainActivity.getActivityDelegate.1
            {
                super(MainActivity.this, MainActivity.this);
            }

            private final void parseIntent(Intent intent) {
                NotificationClient companion = NotificationClient.INSTANCE.getInstance();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                companion.handleIntent(context, intent);
                ForegroundServiceManager foregroundServiceManager = ForegroundServiceManager.INSTANCE;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                foregroundServiceManager.handleIntent(context2, intent);
                BundleUpdater bundleUpdaterInstance = BundleUpdater.INSTANCE.instance();
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                bundleUpdaterInstance.handleIntent(context3, intent);
            }

            @Override // com.facebook.react.ReactActivityDelegate
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                Intent intent = MainActivity.this.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
                parseIntent(intent);
            }

            @Override // com.facebook.react.ReactActivityDelegate
            public boolean onNewIntent(Intent intent) {
                if (intent != null) {
                    MainActivity mainActivity = MainActivity.this;
                    parseIntent(intent);
                    mainActivity.setIntent(intent);
                }
                return super.onNewIntent(intent);
            }
        };
    }

    @Override // com.discord.react_activities.ReactActivity
    @NotNull
    public String getNameOfComponent() {
        return BuildConfig.MAIN_COMPONENT;
    }

    @Override // com.discord.react_activities.ReactActivity, com.facebook.react.ReactActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, x0.h, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Intent intent;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null || (intent = getIntent()) == null) {
            return;
        }
        intent.setData(null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, @NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
        ExternalPipModule.INSTANCE.onPipModeChanged(currentReactContext(), isInPictureInPictureMode);
    }

    @Override // i.h, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        ExternalPipModule.INSTANCE.onActivityStop(currentReactContext());
    }

    @Override // com.facebook.react.ReactActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        ExternalPipModule.INSTANCE.onUserLeaveHint(currentReactContext());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @d
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode);
        ExternalPipModule.INSTANCE.onPipModeChanged(currentReactContext(), isInPictureInPictureMode);
    }
}
