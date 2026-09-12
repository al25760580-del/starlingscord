package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.h4;
import io.sentry.w5;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements io.sentry.d1, t0, ILogger, io.sentry.logger.b, io.sentry.metrics.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u f12421d = new u();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final u f12422e = new u();

    @Override // io.sentry.d1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.d1
    public void b() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.logger.b
    public io.sentry.logger.a c(w5 w5Var, h4 h4Var) {
        l lVar = new l(w5Var, h4Var, 0);
        f0.f12181w.c(lVar);
        return lVar;
    }

    @Override // io.sentry.ILogger
    public void e(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr) {
        if (objArr.length == 0) {
            g(sentryLevel, str, th2);
        } else {
            g(sentryLevel, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public void g(SentryLevel sentryLevel, String str, Throwable th2) {
        Log.wtf("Sentry", str, th2);
    }

    @Override // io.sentry.ILogger
    public void q(SentryLevel sentryLevel, String str, Object... objArr) {
        if (objArr.length == 0) {
            Log.println(7, "Sentry", str);
        } else {
            Log.println(7, "Sentry", String.format(str, objArr));
        }
    }

    @Override // io.sentry.ILogger
    public boolean s(SentryLevel sentryLevel) {
        return true;
    }

    @Override // io.sentry.metrics.b
    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public io.sentry.metrics.a mo1246c(w5 w5Var, h4 h4Var) {
        n nVar = new n(w5Var, h4Var, 1);
        f0.f12181w.c(nVar);
        return nVar;
    }
}
