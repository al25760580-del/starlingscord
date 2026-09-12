package com.discord.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/discord/lifecycle/AppEntryActivityRegistry;", "", "<init>", "()V", "mainActivityRef", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "shareActivityRef", "initialized", "", "init", "", "application", "Landroid/app/Application;", "registerMainActivity", "activity", "unregisterMainActivity", "registerShareActivity", "unregisterShareActivity", "getActivityForAppEntry", "appEntryKey", "", "lifecycle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppEntryActivityRegistry {

    @NotNull
    public static final AppEntryActivityRegistry INSTANCE = new AppEntryActivityRegistry();
    private static volatile boolean initialized;
    private static WeakReference<Activity> mainActivityRef;
    private static WeakReference<Activity> shareActivityRef;

    private AppEntryActivityRegistry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void registerMainActivity(Activity activity) {
        mainActivityRef = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void registerShareActivity(Activity activity) {
        shareActivityRef = new WeakReference<>(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void unregisterMainActivity(Activity activity) {
        try {
            WeakReference<Activity> weakReference = mainActivityRef;
            if ((weakReference != null ? weakReference.get() : null) == activity) {
                mainActivityRef = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void unregisterShareActivity(Activity activity) {
        try {
            WeakReference<Activity> weakReference = shareActivityRef;
            if ((weakReference != null ? weakReference.get() : null) == activity) {
                shareActivityRef = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized Activity getActivityForAppEntry(@NotNull String appEntryKey) {
        Activity activity;
        WeakReference<Activity> weakReference;
        try {
            Intrinsics.checkNotNullParameter(appEntryKey, "appEntryKey");
            activity = null;
            if (Intrinsics.areEqual(appEntryKey, "main")) {
                WeakReference<Activity> weakReference2 = mainActivityRef;
                if (weakReference2 != null) {
                    activity = weakReference2.get();
                }
            } else if (Intrinsics.areEqual(appEntryKey, "share") && (weakReference = shareActivityRef) != null) {
                activity = weakReference.get();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return activity;
    }

    public final void init(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        if (initialized) {
            return;
        }
        initialized = true;
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.discord.lifecycle.AppEntryActivityRegistry.init.1
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String name = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (x.h(name, ".MainActivity", false)) {
                    AppEntryActivityRegistry.INSTANCE.registerMainActivity(activity);
                    return;
                }
                String name2 = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (x.h(name2, ".ShareActivity", false)) {
                    AppEntryActivityRegistry.INSTANCE.registerShareActivity(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                String name = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                if (x.h(name, ".MainActivity", false)) {
                    AppEntryActivityRegistry.INSTANCE.unregisterMainActivity(activity);
                    return;
                }
                String name2 = activity.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                if (x.h(name2, ".ShareActivity", false)) {
                    AppEntryActivityRegistry.INSTANCE.unregisterShareActivity(activity);
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(outState, "outState");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "activity");
            }
        });
    }
}
