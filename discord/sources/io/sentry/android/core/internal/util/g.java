package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12295a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12298d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicInteger f12297c = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicLong f12299e = new AtomicLong(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f12296b = d.f12289d;

    public g(long j, int i7) {
        this.f12295a = j;
        this.f12298d = i7 <= 0 ? 1 : i7;
    }

    public final boolean a() {
        this.f12296b.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        AtomicLong atomicLong = this.f12299e;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = this.f12297c;
        if (j == 0 || atomicLong.get() + this.f12295a <= jUptimeMillis) {
            atomicInteger.set(0);
            atomicLong.set(jUptimeMillis);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.f12298d) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }
}
