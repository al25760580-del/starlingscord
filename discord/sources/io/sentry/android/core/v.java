package io.sentry.android.core;

import android.content.Context;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.c4;
import io.sentry.e6;
import io.sentry.g3;
import io.sentry.h3;
import io.sentry.w5;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements io.sentry.g1 {
    public final io.sentry.android.core.internal.util.o G;
    public volatile h3 H;
    public long J;
    public long K;
    public Date L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ILogger f12429e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f12430i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f12431v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f12432w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final io.sentry.a1 f12433x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final k0 f12434y;
    public boolean E = false;
    public final AtomicBoolean F = new AtomicBoolean(false);
    public volatile t I = null;
    public final io.sentry.util.a M = new io.sentry.util.a();

    public v(Context context, k0 k0Var, io.sentry.android.core.internal.util.o oVar, ILogger iLogger, String str, boolean z5, int i7, io.sentry.a1 a1Var) {
        Context applicationContext = context.getApplicationContext();
        this.f12428d = applicationContext != null ? applicationContext : context;
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "ILogger is required");
        this.f12429e = iLogger;
        this.G = oVar;
        com.facebook.imagepipeline.nativecode.c.H(k0Var, "The BuildInfoProvider is required.");
        this.f12434y = k0Var;
        this.f12430i = str;
        this.f12431v = z5;
        this.f12432w = i7;
        com.facebook.imagepipeline.nativecode.c.H(a1Var, "The ISentryExecutorService is required.");
        this.f12433x = a1Var;
        this.L = io.sentry.config.a.y();
    }

    public final g3 a(String str, String str2, String str3, boolean z5, List list, w5 w5Var) {
        this.f12434y.getClass();
        int i7 = Build.VERSION.SDK_INT;
        if (this.I != null) {
            io.sentry.r rVarA = this.M.a();
            try {
                h3 h3Var = this.H;
                if (h3Var == null || !h3Var.f12703d.equals(str2)) {
                    this.f12429e.q(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
                    rVarA.close();
                    return null;
                }
                this.H = null;
                rVarA.close();
                this.f12429e.q(SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                r rVarA2 = this.I.a(list, false);
                this.F.set(false);
                if (rVarA2 != null) {
                    long j = rVarA2.f12392e - this.J;
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(h3Var);
                    long j5 = rVarA2.f12392e;
                    long j7 = this.J;
                    long j10 = rVarA2.f12393i;
                    long j11 = this.K;
                    if (h3Var.f12707w == null) {
                        h3Var.f12707w = Long.valueOf(j5 - j7);
                        h3Var.f12706v = Long.valueOf(h3Var.f12706v.longValue() - j7);
                        h3Var.f12709y = Long.valueOf(j10 - j11);
                        h3Var.f12708x = Long.valueOf(h3Var.f12708x.longValue() - j11);
                    }
                    Long l6 = w5Var instanceof SentryAndroidOptions ? p0.c(this.f12428d, (SentryAndroidOptions) w5Var).f12366h : null;
                    String string = l6 != null ? Long.toString(l6.longValue()) : "0";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    File file = (File) rVarA2.f12394v;
                    Date date = this.L;
                    String string2 = Long.toString(j);
                    this.f12434y.getClass();
                    String str4 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                    io.sentry.g0 g0Var = new io.sentry.g0(3);
                    this.f12434y.getClass();
                    String str5 = Build.MANUFACTURER;
                    this.f12434y.getClass();
                    String str6 = Build.MODEL;
                    this.f12434y.getClass();
                    return new g3(file, date, arrayList, str, str2, str3, string2, i7, str4, g0Var, str5, str6, Build.VERSION.RELEASE, this.f12434y.a(), string, w5Var.getProguardUuid(), w5Var.getRelease(), w5Var.getEnvironment(), (rVarA2.f12391d || z5) ? "timeout" : "normal", (Map) rVarA2.f12395w);
                }
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
        return null;
    }

    @Override // io.sentry.g1
    public final void close() {
        v vVar;
        h3 h3Var = this.H;
        if (h3Var != null) {
            vVar = this;
            vVar.a(h3Var.f12705i, h3Var.f12703d, h3Var.f12704e, true, null, c4.f().l());
        } else {
            vVar = this;
        }
        vVar.F.set(false);
        if (vVar.I != null) {
            t tVar = vVar.I;
            io.sentry.r rVarA = tVar.f12420o.a();
            try {
                Future future = tVar.f12411d;
                if (future != null) {
                    future.cancel(true);
                    tVar.f12411d = null;
                }
                if (tVar.f12419n) {
                    tVar.a(null, true);
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
    }

    @Override // io.sentry.g1
    public final void d(io.sentry.f1 f1Var) {
        if (this.F.get() && this.H == null) {
            io.sentry.r rVarA = this.M.a();
            try {
                if (this.F.get() && this.H == null) {
                    this.H = new h3(f1Var, Long.valueOf(this.J), Long.valueOf(this.K));
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

    @Override // io.sentry.g1
    public final g3 f(e6 e6Var, List list, w5 w5Var) {
        return a(e6Var.f12646e, e6Var.f12642a.toString(), e6Var.f12643b.f12746c.f12782d.toString(), false, list, w5Var);
    }

    @Override // io.sentry.g1
    public final boolean isRunning() {
        return this.F.get();
    }

    @Override // io.sentry.g1
    public final void start() {
        s sVarC;
        this.f12434y.getClass();
        if (this.F.getAndSet(true)) {
            return;
        }
        if (!this.E) {
            this.E = true;
            if (this.f12431v) {
                String str = this.f12430i;
                if (str == null) {
                    this.f12429e.q(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
                } else {
                    int i7 = this.f12432w;
                    if (i7 <= 0) {
                        this.f12429e.q(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i7));
                    } else {
                        this.I = new t(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.f12432w, this.G, this.f12433x, this.f12429e);
                    }
                }
            } else {
                this.f12429e.q(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
            }
        }
        if (this.I != null && (sVarC = this.I.c()) != null) {
            this.J = sVarC.f12401a;
            this.K = sVarC.f12402b;
            this.L = sVarC.f12403c;
            this.f12429e.q(SentryLevel.DEBUG, "Profiler started.", new Object[0]);
            return;
        }
        if (this.I != null && this.I.f12419n) {
            this.f12429e.q(SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
            return;
        }
        io.sentry.r rVarA = this.M.a();
        try {
            this.H = null;
            rVarA.close();
            this.F.set(false);
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
}
