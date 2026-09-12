package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicLong f13228i = new AtomicLong(System.nanoTime());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13230e;

    public i() {
        long jA = a();
        long jA2 = (a() << 1) | 1;
        this.f13230e = jA2;
        this.f13229d = jA2 + jA;
    }

    public static long a() {
        AtomicLong atomicLong;
        long j;
        long j5;
        do {
            atomicLong = f13228i;
            j = atomicLong.get();
            long j7 = (j >> 12) ^ j;
            long j10 = j7 ^ (j7 << 25);
            j5 = (j10 ^ (j10 >> 27)) * 2685821657736338717L;
        } while (!atomicLong.compareAndSet(j, j5));
        return j5;
    }

    public final void b(byte[] bArr) {
        for (int i7 = 0; i7 < bArr.length; i7++) {
            long j = (this.f13229d * 6364136223846793005L) + this.f13230e;
            this.f13229d = j;
            bArr[i7] = (byte) ((((j >>> 22) ^ j) >>> ((int) ((j >>> 61) + 22))) >>> 24);
        }
    }

    public final double c() {
        long j = this.f13229d * 6364136223846793005L;
        long j5 = this.f13230e;
        long j7 = j + j5;
        long j10 = (((j7 >>> 22) ^ j7) >>> ((int) ((j7 >>> 61) + 22))) & 4294967295L;
        long j11 = (j7 * 6364136223846793005L) + j5;
        this.f13229d = j11;
        return (((j10 >>> 6) << 27) + (((((j11 >>> 22) ^ j11) >>> ((int) ((j11 >>> 61) + 22))) & 4294967295L) >>> 5)) / 9.007199254740992E15d;
    }
}
