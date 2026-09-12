package io.sentry.android.core;

import android.content.Context;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.w5;
import java.io.Closeable;

/* JADX INFO: loaded from: classes3.dex */
public final class AnrIntegration implements l1, Closeable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static a f12078w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final io.sentry.util.a f12079x = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12081e = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.util.a f12082i = new io.sentry.util.a();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public w5 f12083v;

    public AnrIntegration(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f12080d = applicationContext != null ? applicationContext : context;
    }

    public final void c(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.r rVarA = f12079x.a();
        try {
            if (f12078w == null) {
                ILogger logger = sentryAndroidOptions.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                logger.q(sentryLevel, "ANR timeout in milliseconds: %d", Long.valueOf(sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                a aVar = new a(sentryAndroidOptions.getAnrTimeoutIntervalMillis(), sentryAndroidOptions.isAnrReportInDebug(), new x(0, this, sentryAndroidOptions), sentryAndroidOptions.getLogger(), this.f12080d);
                f12078w = aVar;
                aVar.start();
                sentryAndroidOptions.getLogger().q(sentryLevel, "AnrIntegration installed.", new Object[0]);
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.f12082i.a();
        try {
            this.f12081e = true;
            rVarA.close();
            io.sentry.r rVarA2 = f12079x.a();
            try {
                a aVar = f12078w;
                if (aVar != null) {
                    aVar.interrupt();
                    f12078w = null;
                    w5 w5Var = this.f12083v;
                    if (w5Var != null) {
                        w5Var.getLogger().q(SentryLevel.DEBUG, "AnrIntegration removed.", new Object[0]);
                    }
                }
                rVarA2.close();
            } catch (Throwable th2) {
                try {
                    rVarA2.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
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
        this.f12083v = w5Var;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) w5Var;
        sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isAnrEnabled()));
        if (sentryAndroidOptions.isAnrEnabled()) {
            c9.a.c("Anr");
            try {
                sentryAndroidOptions.getExecutorService().submit(new com.mkuczera.haptic.a(15, this, sentryAndroidOptions));
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().g(SentryLevel.DEBUG, "Failed to start AnrIntegration on executor thread.", th2);
            }
        }
    }
}
