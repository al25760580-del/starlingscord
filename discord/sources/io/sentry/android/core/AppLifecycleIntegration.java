package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.w5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLifecycleIntegration implements l1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final io.sentry.util.a f12092d = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile x0 f12093e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SentryAndroidOptions f12094i;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.f12092d.a();
        try {
            x0 x0Var = this.f12093e;
            this.f12093e = null;
            rVarA.close();
            if (x0Var != null) {
                f0.f12181w.i(x0Var);
                SentryAndroidOptions sentryAndroidOptions = this.f12094i;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "AppLifecycleIntegration removed.", new Object[0]);
                }
            }
            f0.f12181w.l();
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
        this.f12094i = sentryAndroidOptions;
        ILogger logger = sentryAndroidOptions.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.q(sentryLevel, "enableSessionTracking enabled: %s", Boolean.valueOf(this.f12094i.isEnableAutoSessionTracking()));
        this.f12094i.getLogger().q(sentryLevel, "enableAppLifecycleBreadcrumbs enabled: %s", Boolean.valueOf(this.f12094i.isEnableAppLifecycleBreadcrumbs()));
        if (this.f12094i.isEnableAutoSessionTracking() || this.f12094i.isEnableAppLifecycleBreadcrumbs()) {
            io.sentry.r rVarA = this.f12092d.a();
            try {
                if (this.f12093e != null) {
                    rVarA.close();
                    return;
                }
                this.f12093e = new x0(this.f12094i.getSessionTrackingIntervalMillis(), this.f12094i.isEnableAutoSessionTracking(), this.f12094i.isEnableAppLifecycleBreadcrumbs());
                f0.f12181w.c(this.f12093e);
                rVarA.close();
                w5Var.getLogger().q(sentryLevel, "AppLifecycleIntegration installed.", new Object[0]);
                c9.a.c("AppLifecycle");
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }
}
