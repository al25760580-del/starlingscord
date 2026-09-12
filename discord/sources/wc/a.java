package wc;

import pc.t;
import pc.u;
import pc.v;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f22087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22088c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22089d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22090e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f22091f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f22092g;

    public a(long j, long j5, int i7, int i10, boolean z5) {
        this.f22086a = j;
        this.f22087b = j5;
        this.f22088c = i10 == -1 ? 1 : i10;
        this.f22090e = i7;
        this.f22092g = z5;
        if (j == -1) {
            this.f22089d = -1L;
            this.f22091f = -9223372036854775807L;
        } else {
            long j7 = j - j5;
            this.f22089d = j7;
            this.f22091f = (Math.max(0L, j7) * 8000000) / ((long) i7);
        }
    }

    @Override // wc.f
    public final long a() {
        return -1L;
    }

    @Override // wc.f
    public final long b(long j) {
        return (Math.max(0L, j - this.f22087b) * 8000000) / ((long) this.f22090e);
    }

    @Override // pc.u
    public final boolean c() {
        return this.f22089d != -1 || this.f22092g;
    }

    @Override // pc.u
    public final t h(long j) {
        long j5 = this.f22089d;
        long j7 = this.f22087b;
        if (j5 == -1 && !this.f22092g) {
            v vVar = new v(0L, j7);
            return new t(vVar, vVar);
        }
        int i7 = this.f22090e;
        long j10 = this.f22088c;
        long jMin = (((((long) i7) * j) / 8000000) / j10) * j10;
        if (j5 != -1) {
            jMin = Math.min(jMin, j5 - j10);
        }
        long jMax = Math.max(jMin, 0L) + j7;
        long jMax2 = (Math.max(0L, jMax - j7) * 8000000) / ((long) i7);
        v vVar2 = new v(jMax2, jMax);
        if (j5 != -1 && jMax2 < j) {
            long j11 = jMax + j10;
            if (j11 < this.f22086a) {
                return new t(vVar2, new v((Math.max(0L, j11 - j7) * 8000000) / ((long) i7), j11));
            }
        }
        return new t(vVar2, vVar2);
    }

    @Override // pc.u
    public final long i() {
        return this.f22091f;
    }
}
