package io.sentry.android.core;

import android.os.SystemClock;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements io.sentry.android.core.internal.util.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12388a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f12389b;

    public q(t tVar) {
        this.f12389b = tVar;
    }

    @Override // io.sentry.android.core.internal.util.n
    public final void b(long j, long j5, long j7, long j10, boolean z5, boolean z6, float f2) {
        Date dateY = io.sentry.config.a.y();
        System.nanoTime();
        long time = dateY.getTime() * 1000000;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + (j5 - System.nanoTime());
        t tVar = this.f12389b;
        long j11 = jElapsedRealtimeNanos - tVar.f12408a;
        if (j11 < 0) {
            return;
        }
        if (z6) {
            tVar.j.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j11), Long.valueOf(j7), time));
        } else if (z5) {
            tVar.f12416i.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j11), Long.valueOf(j7), time));
        }
        if (f2 != this.f12388a) {
            this.f12388a = f2;
            tVar.f12415h.addLast(new io.sentry.profilemeasurements.b(Long.valueOf(j11), Float.valueOf(f2), time));
        }
    }
}
