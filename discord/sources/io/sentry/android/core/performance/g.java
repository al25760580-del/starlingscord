package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.b5;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements Comparable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f12383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f12384e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12385i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f12386v;

    public final long a() {
        long j = this.f12386v;
        if (j != 0) {
            return j - this.f12385i;
        }
        return 0L;
    }

    public final b5 b() {
        if (c()) {
            return new b5(this.f12384e * 1000000);
        }
        return null;
    }

    public final boolean c() {
        return this.f12385i != 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f12384e, ((g) obj).f12384e);
    }

    public final void d(long j) {
        this.f12385i = j;
        this.f12384e = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f12385i);
    }
}
