package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.imagepipeline.image.EncodedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f4989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f4990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f4991c = new f0(this, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f4992d = new f0(this, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EncodedImage f4993e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4994f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4995g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4996h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4997i = 0;

    public h0(Executor executor, g0 g0Var) {
        this.f4989a = executor;
        this.f4990b = g0Var;
    }

    public static boolean d(EncodedImage encodedImage, int i7) {
        return c.d(i7) || c.k(i7, 4) || EncodedImage.isValid(encodedImage);
    }

    public final void a(long j) {
        f0 f0Var = this.f4992d;
        if (j <= 0) {
            f0Var.run();
            return;
        }
        if (mo.c0.f15939b == null) {
            mo.c0.f15939b = Executors.newSingleThreadScheduledExecutor();
        }
        mo.c0.f15939b.schedule(f0Var, j, TimeUnit.MILLISECONDS);
    }

    public final void b() {
        boolean z5;
        long jMax;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                z5 = true;
                if (this.f4995g == 4) {
                    jMax = Math.max(this.f4997i + ((long) 100), jUptimeMillis);
                    this.f4996h = jUptimeMillis;
                    this.f4995g = 2;
                } else {
                    this.f4995g = 1;
                    jMax = 0;
                    z5 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z5) {
            a(jMax - jUptimeMillis);
        }
    }

    public final void c() {
        boolean z5;
        long j;
        long jUptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            try {
                if (d(this.f4993e, this.f4994f)) {
                    int iB = f0.e.b(this.f4995g);
                    if (iB != 0) {
                        if (iB == 2) {
                            this.f4995g = 4;
                        }
                        j = 0;
                        z5 = false;
                    } else {
                        long jMax = Math.max(this.f4997i + ((long) 100), jUptimeMillis);
                        this.f4996h = jUptimeMillis;
                        this.f4995g = 2;
                        z5 = true;
                        j = jMax;
                    }
                    if (z5) {
                        a(j - jUptimeMillis);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean e(EncodedImage encodedImage, int i7) {
        EncodedImage encodedImage2;
        if (!d(encodedImage, i7)) {
            return false;
        }
        synchronized (this) {
            encodedImage2 = this.f4993e;
            this.f4993e = EncodedImage.cloneOrNull(encodedImage);
            this.f4994f = i7;
        }
        EncodedImage.closeSafely(encodedImage2);
        return true;
    }
}
