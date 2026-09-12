package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.m6;
import io.sentry.v3;
import io.sentry.w5;
import java.io.Closeable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class UserInteractionIntegration implements l1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Application f12130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v3 f12131e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SentryAndroidOptions f12132i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f12133v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f12134w;

    public UserInteractionIntegration(Application application, io.sentry.util.f fVar) {
        com.facebook.imagepipeline.nativecode.c.H(application, "Application is required");
        this.f12130d = application;
        this.f12133v = io.sentry.util.f.a(this.f12132i, "androidx.core.view.GestureDetectorCompat");
        this.f12134w = io.sentry.util.f.a(this.f12132i, "androidx.lifecycle.Lifecycle");
    }

    public final void c(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f12132i;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "Window was null in startTracking", new Object[0]);
                return;
            }
            return;
        }
        if (this.f12131e == null || this.f12132i == null) {
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback == null) {
            callback = new io.sentry.android.core.internal.gestures.b();
        }
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            return;
        }
        window.setCallback(new io.sentry.android.core.internal.gestures.g(callback, activity, new io.sentry.android.core.internal.gestures.f(activity, this.f12131e, this.f12132i), this.f12132i));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f12130d.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.f12132i;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "UserInteractionIntegration removed.", new Object[0]);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Window window = activity.getWindow();
        if (window == null) {
            SentryAndroidOptions sentryAndroidOptions = this.f12132i;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "Window was null in stopTracking", new Object[0]);
                return;
            }
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof io.sentry.android.core.internal.gestures.g) {
            io.sentry.android.core.internal.gestures.g gVar = (io.sentry.android.core.internal.gestures.g) callback;
            gVar.f12242i.d(m6.CANCELLED);
            Window.Callback callback2 = gVar.f12241e;
            if (callback2 instanceof io.sentry.android.core.internal.gestures.b) {
                window.setCallback(null);
            } else {
                window.setCallback(callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        c(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12132i = sentryAndroidOptions;
        this.f12131e = v3.f13245a;
        boolean z5 = sentryAndroidOptions.isEnableUserInteractionBreadcrumbs() || this.f12132i.isEnableUserInteractionTracing();
        ILogger logger = this.f12132i.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.q(sentryLevel, "UserInteractionIntegration enabled: %s", Boolean.valueOf(z5));
        if (z5) {
            if (!this.f12133v) {
                w5Var.getLogger().q(SentryLevel.INFO, "androidx.core is not available, UserInteractionIntegration won't be installed", new Object[0]);
                return;
            }
            this.f12130d.registerActivityLifecycleCallbacks(this);
            this.f12132i.getLogger().q(sentryLevel, "UserInteractionIntegration installed.", new Object[0]);
            c9.a.c("UserInteraction");
            if (this.f12134w) {
                WeakReference weakReference = (WeakReference) m0.f12349e.f12350d;
                Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                if ((activity instanceof LifecycleOwner) && ((LifecycleOwner) activity).getLifecycle().b() == Lifecycle.State.f2299w) {
                    c(activity);
                }
            }
        }
    }
}
