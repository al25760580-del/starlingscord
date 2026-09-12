package je;

import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f13768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f13769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ThreadLocal f13770d = new ThreadLocal();

    public b0(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            if (!d()) {
                long jLongValue = this.f13767a;
                if (jLongValue == 9223372036854775806L) {
                    Long l6 = (Long) this.f13770d.get();
                    l6.getClass();
                    jLongValue = l6.longValue();
                }
                this.f13768b = jLongValue - j;
                notifyAll();
            }
            this.f13769c = j;
            return j + this.f13768b;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j5 = this.f13769c;
            if (j5 != -9223372036854775807L) {
                long j7 = (j5 * 90000) / 1000000;
                long j10 = (4294967296L + j7) / 8589934592L;
                long j11 = ((j10 - 1) * 8589934592L) + j;
                long j12 = (j10 * 8589934592L) + j;
                j = Math.abs(j11 - j7) < Math.abs(j12 - j7) ? j11 : j12;
            }
            return a((j * 1000000) / 90000);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized long c() {
        long j;
        j = this.f13767a;
        if (j == LongCompanionObject.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized boolean d() {
        return this.f13768b != -9223372036854775807L;
    }

    public final synchronized void e(long j) {
        this.f13767a = j;
        this.f13768b = j == LongCompanionObject.MAX_VALUE ? 0L : -9223372036854775807L;
        this.f13769c = -9223372036854775807L;
    }

    public final synchronized void f(long j, boolean z5) {
        try {
            b.k(this.f13767a == 9223372036854775806L);
            if (d()) {
                return;
            }
            if (z5) {
                this.f13770d.set(Long.valueOf(j));
            } else {
                while (!d()) {
                    wait();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
