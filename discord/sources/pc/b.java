package pc;

import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f17872d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f17873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f17874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f17875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f17876h;

    public b(long j, long j5, long j7, long j10, long j11, long j12) {
        this.f17869a = j;
        this.f17870b = j5;
        this.f17873e = j7;
        this.f17874f = j10;
        this.f17875g = j11;
        this.f17871c = j12;
        this.f17876h = a(j5, 0L, j7, j10, j11, j12);
    }

    public static long a(long j, long j5, long j7, long j10, long j11, long j12) {
        if (j10 + 1 >= j11 || j5 + 1 >= j7) {
            return j10;
        }
        long j13 = (long) ((j - j5) * ((j11 - j10) / (j7 - j5)));
        return e0.j(((j13 + j10) - j12) - (j13 / 20), j10, j11 - 1);
    }
}
