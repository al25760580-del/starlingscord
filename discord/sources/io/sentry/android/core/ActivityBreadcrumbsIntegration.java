package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.v3;
import io.sentry.w5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class ActivityBreadcrumbsIntegration implements l1, Closeable, Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Application f12067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v3 f12068e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f12069i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final io.sentry.util.a f12070v = new io.sentry.util.a();

    public ActivityBreadcrumbsIntegration(Application application) {
        com.facebook.imagepipeline.nativecode.c.H(application, "Application is required");
        this.f12067d = application;
    }

    public final void c(Activity activity, String str) {
        if (this.f12068e == null) {
            return;
        }
        Breadcrumb breadcrumb = new Breadcrumb();
        breadcrumb.f12008w = "navigation";
        breadcrumb.c(str, "state");
        breadcrumb.c(activity.getClass().getSimpleName(), "screen");
        breadcrumb.f12010y = "ui.lifecycle";
        breadcrumb.F = SentryLevel.INFO;
        Hint hint = new Hint();
        hint.d(activity, "android:activity");
        this.f12068e.g(breadcrumb, hint);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12069i) {
            this.f12067d.unregisterActivityLifecycleCallbacks(this);
            v3 v3Var = this.f12068e;
            if (v3Var != null) {
                v3Var.l().getLogger().q(SentryLevel.DEBUG, "ActivityBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        io.sentry.r rVarA = this.f12070v.a();
        try {
            c(activity, "created");
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        io.sentry.r rVarA = this.f12070v.a();
        try {
            c(activity, "destroyed");
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        io.sentry.r rVarA = this.f12070v.a();
        try {
            c(activity, "paused");
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        io.sentry.r rVarA = this.f12070v.a();
        try {
            c(activity, "resumed");
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        io.sentry.r rVarA = this.f12070v.a();
        try {
            c(activity, "saveInstanceState");
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        io.sentry.r rVarA = this.f12070v.a();
        try {
            c(activity, "started");
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        io.sentry.r rVarA = this.f12070v.a();
        try {
            c(activity, "stopped");
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12068e = v3.f13245a;
        this.f12069i = sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs();
        ILogger logger = w5Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.q(sentryLevel, "ActivityBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f12069i));
        if (this.f12069i) {
            this.f12067d.registerActivityLifecycleCallbacks(this);
            w5Var.getLogger().q(sentryLevel, "ActivityBreadcrumbIntegration installed.", new Object[0]);
            c9.a.c("ActivityBreadcrumbs");
        }
    }
}
