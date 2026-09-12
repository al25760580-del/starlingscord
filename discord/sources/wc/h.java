package wc;

import je.e0;
import pc.t;
import pc.v;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f22121e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f22122f;

    public h(long j, int i7, long j5, long j7, long[] jArr) {
        this.f22117a = j;
        this.f22118b = i7;
        this.f22119c = j5;
        this.f22122f = jArr;
        this.f22120d = j7;
        this.f22121e = j7 != -1 ? j + j7 : -1L;
    }

    @Override // wc.f
    public final long a() {
        return this.f22121e;
    }

    @Override // wc.f
    public final long b(long j) {
        long j5 = j - this.f22117a;
        if (!c() || j5 <= this.f22118b) {
            return 0L;
        }
        long[] jArr = this.f22122f;
        je.b.l(jArr);
        double d6 = (j5 * 256.0d) / this.f22120d;
        int iE = e0.e(jArr, (long) d6, true);
        long j7 = this.f22119c;
        long j10 = (((long) iE) * j7) / 100;
        long j11 = jArr[iE];
        int i7 = iE + 1;
        long j12 = (j7 * ((long) i7)) / 100;
        long j13 = iE == 99 ? 256L : jArr[i7];
        return Math.round((j11 == j13 ? 0.0d : (d6 - j11) / (j13 - j11)) * (j12 - j10)) + j10;
    }

    @Override // pc.u
    public final boolean c() {
        return this.f22122f != null;
    }

    @Override // pc.u
    public final t h(long j) {
        double d6;
        double d7;
        boolean zC = c();
        int i7 = this.f22118b;
        long j5 = this.f22117a;
        if (!zC) {
            v vVar = new v(0L, j5 + ((long) i7));
            return new t(vVar, vVar);
        }
        long j7 = e0.j(j, 0L, this.f22119c);
        double d8 = (j7 * 100.0d) / this.f22119c;
        double d9 = 0.0d;
        if (d8 <= 0.0d) {
            d6 = 256.0d;
        } else if (d8 >= 100.0d) {
            d6 = 256.0d;
            d9 = 256.0d;
        } else {
            int i10 = (int) d8;
            long[] jArr = this.f22122f;
            je.b.l(jArr);
            double d10 = jArr[i10];
            if (i10 == 99) {
                d6 = 256.0d;
                d7 = 256.0d;
            } else {
                d6 = 256.0d;
                d7 = jArr[i10 + 1];
            }
            d9 = ((d7 - d10) * (d8 - ((double) i10))) + d10;
        }
        long j10 = this.f22120d;
        v vVar2 = new v(j7, j5 + e0.j(Math.round((d9 / d6) * j10), i7, j10 - 1));
        return new t(vVar2, vVar2);
    }

    @Override // pc.u
    public final long i() {
        return this.f22119c;
    }
}
