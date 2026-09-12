package io.sentry.android.core;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.v3;
import io.sentry.w5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppComponentsBreadcrumbsIntegration implements l1, Closeable, ComponentCallbacks2 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Hint f12087w = new Hint();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public v3 f12089e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SentryAndroidOptions f12090i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f12091v = new io.sentry.android.core.internal.util.g(LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE, 0);

    public AppComponentsBreadcrumbsIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12088d = applicationContext != null ? applicationContext : context;
    }

    public final void c(Runnable runnable) {
        SentryAndroidOptions sentryAndroidOptions = this.f12090i;
        if (sentryAndroidOptions != null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(runnable);
            } catch (Throwable th2) {
                this.f12090i.getLogger().e(SentryLevel.ERROR, th2, "Failed to submit app components breadcrumb task", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.f12088d.unregisterComponentCallbacks(this);
        } catch (Throwable th2) {
            SentryAndroidOptions sentryAndroidOptions = this.f12090i;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().e(SentryLevel.DEBUG, th2, "It was not possible to unregisterComponentCallbacks", new Object[0]);
            }
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.f12090i;
        if (sentryAndroidOptions2 != null) {
            sentryAndroidOptions2.getLogger().q(SentryLevel.DEBUG, "AppComponentsBreadcrumbsIntegration removed.", new Object[0]);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        c(new app.rive.core.a(this, System.currentTimeMillis(), configuration, 2));
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        if (i7 >= 40 && !this.f12091v.a()) {
            c(new ke.u(this, System.currentTimeMillis(), i7, 2));
        }
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        this.f12089e = v3.f13245a;
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12090i = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.q(sentryLevel, "AppComponentsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f12090i.isEnableAppComponentBreadcrumbs()));
        if (this.f12090i.isEnableAppComponentBreadcrumbs()) {
            try {
                this.f12088d.registerComponentCallbacks(this);
                w5Var.getLogger().q(sentryLevel, "AppComponentsBreadcrumbsIntegration installed.", new Object[0]);
                c9.a.c("AppComponentsBreadcrumbs");
            } catch (Throwable th2) {
                this.f12090i.setEnableAppComponentBreadcrumbs(false);
                w5Var.getLogger().e(SentryLevel.INFO, th2, "ComponentCallbacks2 is not available.", new Object[0]);
            }
        }
    }
}
