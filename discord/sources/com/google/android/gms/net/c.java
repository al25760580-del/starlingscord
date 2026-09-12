package com.google.android.gms.net;

import af.h;
import af.k;
import android.content.Context;
import android.os.SystemClock;
import ga.l;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements AutoCloseable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6222i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f6223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final float f6224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6225x = 13;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6220d = System.currentTimeMillis();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f6221e = SystemClock.uptimeMillis();

    public c(Context context, int i7, float f2) {
        this.f6222i = i7;
        this.f6223v = context;
        this.f6224w = f2;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        Context context = this.f6223v;
        if (b.f6216c == null) {
            synchronized (b.f6217d) {
                try {
                    if (b.f6216c == null) {
                        b.f6216c = new b(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        b bVar = b.f6216c;
        int i7 = this.f6225x;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f6221e;
        if (ThreadLocalRandom.current().nextFloat() < this.f6224w) {
            int i10 = (int) jUptimeMillis;
            long j = this.f6220d;
            int i11 = this.f6222i;
            synchronized (bVar) {
                AtomicLong atomicLong = bVar.f6219b;
                if (atomicLong.get() != -1 && SystemClock.uptimeMillis() - atomicLong.get() <= 1800000) {
                    return;
                }
                bVar.f6218a.c(new k(0, Arrays.asList(new h(i11, i7, -1, j, jCurrentTimeMillis, null, null, 368, i10)))).o(new l(5, bVar));
            }
        }
    }
}
