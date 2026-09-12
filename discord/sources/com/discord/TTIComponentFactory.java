package com.discord;

import a3.e;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.app.Application;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.discord.logging.Log;
import com.discord.react_activities.ReactActivitySharedData;
import com.discord.tti_manager.TTIModule;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0015"}, d2 = {"Lcom/discord/TTIComponentFactory;", "Landroid/app/AppComponentFactory;", "<init>", "()V", "awaitApplicationInitialization", "", "instantiateActivity", "Landroid/app/Activity;", "cl", "Ljava/lang/ClassLoader;", "className", "", "intent", "Landroid/content/Intent;", "instantiateService", "Landroid/app/Service;", "instantiateReceiver", "Landroid/content/BroadcastReceiver;", "instantiateApplication", "Landroid/app/Application;", "Companion", "app_googleRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"NewApi"})
public final class TTIComponentFactory extends AppComponentFactory {
    private static final long INITIALIZATION_TIMEOUT_SECONDS = 30;

    @NotNull
    public static final String LOG_TAG = "TTIFactory";
    private static volatile boolean isMainApplicationProcess = true;

    private final void awaitApplicationInitialization() {
        if (!isMainApplicationProcess) {
            Log.i$default(Log.INSTANCE, LOG_TAG, "Skipping initialization wait: process is not running MainApplication", (Throwable) null, 4, (Object) null);
        } else {
            if (ReactActivitySharedData.INSTANCE.getPrepareEverythingForActivity().await(INITIALIZATION_TIMEOUT_SECONDS, TimeUnit.SECONDS)) {
                return;
            }
            Log.e$default(Log.INSTANCE, LOG_TAG, "Timeout waiting for application initialization after 30s - proceeding anyway", (Throwable) null, 4, (Object) null);
        }
    }

    @NotNull
    public Activity instantiateActivity(@NotNull ClassLoader cl2, @NotNull String className, Intent intent) {
        Intrinsics.checkNotNullParameter(cl2, "cl");
        Intrinsics.checkNotNullParameter(className, "className");
        if (x.h(className, ".MainActivity", false)) {
            TTIModule.INSTANCE.markMainActivityCreation();
        } else {
            TTIModule.INSTANCE.markActivityBeforeMain(className);
        }
        awaitApplicationInitialization();
        Activity activityInstantiateActivity = super.instantiateActivity(cl2, className, intent);
        Intrinsics.checkNotNullExpressionValue(activityInstantiateActivity, "instantiateActivity(...)");
        return activityInstantiateActivity;
    }

    @NotNull
    public Application instantiateApplication(@NotNull ClassLoader cl2, @NotNull String className) {
        Intrinsics.checkNotNullParameter(cl2, "cl");
        Intrinsics.checkNotNullParameter(className, "className");
        Log.i$default(Log.INSTANCE, LOG_TAG, e.l("Application: ", className), (Throwable) null, 4, (Object) null);
        isMainApplicationProcess = Intrinsics.areEqual(className, MainApplication.class.getName());
        Application applicationInstantiateApplication = super.instantiateApplication(cl2, className);
        Intrinsics.checkNotNullExpressionValue(applicationInstantiateApplication, "instantiateApplication(...)");
        return applicationInstantiateApplication;
    }

    @NotNull
    public BroadcastReceiver instantiateReceiver(@NotNull ClassLoader cl2, @NotNull String className, Intent intent) {
        Intrinsics.checkNotNullParameter(cl2, "cl");
        Intrinsics.checkNotNullParameter(className, "className");
        Log.i$default(Log.INSTANCE, LOG_TAG, "Receiver: " + className + ", intent=" + intent, (Throwable) null, 4, (Object) null);
        TTIModule.INSTANCE.markBroadcastReceiverInstantiation();
        awaitApplicationInitialization();
        BroadcastReceiver broadcastReceiverInstantiateReceiver = super.instantiateReceiver(cl2, className, intent);
        Intrinsics.checkNotNullExpressionValue(broadcastReceiverInstantiateReceiver, "instantiateReceiver(...)");
        return broadcastReceiverInstantiateReceiver;
    }

    @NotNull
    public Service instantiateService(@NotNull ClassLoader cl2, @NotNull String className, Intent intent) {
        Intrinsics.checkNotNullParameter(cl2, "cl");
        Intrinsics.checkNotNullParameter(className, "className");
        Log.i$default(Log.INSTANCE, LOG_TAG, "Service: " + className + ", intent=" + intent, (Throwable) null, 4, (Object) null);
        TTIModule.INSTANCE.markServiceInstantiation();
        awaitApplicationInitialization();
        Service serviceInstantiateService = super.instantiateService(cl2, className, intent);
        Intrinsics.checkNotNullExpressionValue(serviceInstantiateService, "instantiateService(...)");
        return serviceInstantiateService;
    }
}
