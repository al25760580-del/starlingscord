package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.a3;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements io.sentry.u0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ILogger f12207g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12201a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f12202b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f12203c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12204d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f12205e = 1.0E9d / 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f12206f = new File("/proc/self/stat");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12208h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Pattern f12209i = Pattern.compile("[\n\t\r ]");

    public h(ILogger iLogger) {
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "Logger is required.");
        this.f12207g = iLogger;
    }

    @Override // io.sentry.u0
    public final void a(a3 a3Var) {
        if (this.f12208h) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.f12201a;
            this.f12201a = jElapsedRealtimeNanos;
            long jB = b();
            long j5 = jB - this.f12202b;
            this.f12202b = jB;
            a3Var.f12042a = Double.valueOf(((j5 / j) / this.f12204d) * 100.0d);
        }
    }

    public final long b() {
        String strY;
        ILogger iLogger = this.f12207g;
        try {
            strY = a.a.y(this.f12206f);
        } catch (IOException e10) {
            this.f12208h = false;
            iLogger.g(SentryLevel.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e10);
            strY = null;
        }
        if (strY != null) {
            String[] strArrSplit = this.f12209i.split(strY.trim());
            try {
                return (long) ((Long.parseLong(strArrSplit[13]) + Long.parseLong(strArrSplit[14]) + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f12205e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e11) {
                iLogger.g(SentryLevel.ERROR, "Error parsing /proc/self/stat file.", e11);
            }
        }
        return 0L;
    }

    @Override // io.sentry.u0
    public final void c() {
        this.f12208h = true;
        this.f12203c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f12204d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f12205e = 1.0E9d / this.f12203c;
        this.f12202b = b();
    }
}
