package com.google.android.gms.internal.play_billing;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1 f6049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f6052d;

    public m(z1 z1Var) {
        if (z1Var == null) {
            throw new NullPointerException("ticker");
        }
        this.f6049a = z1Var;
    }

    public final void a() {
        if (this.f6050b) {
            throw new IllegalStateException("This stopwatch is already running.");
        }
        this.f6050b = true;
        this.f6052d = this.f6049a.d();
    }

    public final String toString() {
        String str;
        long jD = this.f6050b ? (this.f6049a.d() - this.f6052d) + this.f6051c : this.f6051c;
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(jD, timeUnit2) <= 0) {
            timeUnit = TimeUnit.HOURS;
            if (timeUnit.convert(jD, timeUnit2) <= 0) {
                timeUnit = TimeUnit.MINUTES;
                if (timeUnit.convert(jD, timeUnit2) <= 0) {
                    timeUnit = TimeUnit.SECONDS;
                    if (timeUnit.convert(jD, timeUnit2) <= 0) {
                        timeUnit = TimeUnit.MILLISECONDS;
                        if (timeUnit.convert(jD, timeUnit2) <= 0) {
                            timeUnit = TimeUnit.MICROSECONDS;
                            if (timeUnit.convert(jD, timeUnit2) <= 0) {
                                timeUnit = timeUnit2;
                            }
                        }
                    }
                }
            }
        }
        String str2 = String.format(Locale.ROOT, "%.4g", Double.valueOf(jD / timeUnit2.convert(1L, timeUnit)));
        switch (l.f6038a[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return kk.b.k(str2, " ", str);
    }
}
