package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.w5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class NetworkBreadcrumbsIntegration implements l1, Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f12103e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.util.a f12104i = new io.sentry.util.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile a1 f12105v;

    public NetworkBreadcrumbsIntegration(Context context, k0 k0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f12102d = applicationContext != null ? applicationContext : context;
        this.f12103e = k0Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.f12104i.a();
        try {
            a1 a1Var = this.f12105v;
            this.f12105v = null;
            rVarA.close();
            if (a1Var != null) {
                io.sentry.r rVarA2 = io.sentry.android.core.internal.util.c.K.a();
                try {
                    io.sentry.android.core.internal.util.c.L.remove(a1Var);
                    rVarA2.close();
                } catch (Throwable th2) {
                    try {
                        rVarA2.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                rVarA.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        ILogger logger = w5Var.getLogger();
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        logger.q(sentryLevel, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            this.f12103e.getClass();
            io.sentry.r rVarA = this.f12104i.a();
            try {
                this.f12105v = new a1(this.f12103e, w5Var.getDateProvider());
                if (io.sentry.android.core.internal.util.c.g(this.f12102d, w5Var.getLogger(), this.f12103e, this.f12105v)) {
                    w5Var.getLogger().q(sentryLevel, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                    c9.a.c("NetworkBreadcrumbs");
                } else {
                    w5Var.getLogger().q(sentryLevel, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                }
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
    }
}
