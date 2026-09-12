package wc;

import je.e0;
import pc.t;
import pc.v;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f22113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f22114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f22116d;

    public g(long[] jArr, long[] jArr2, long j, long j5) {
        this.f22113a = jArr;
        this.f22114b = jArr2;
        this.f22115c = j;
        this.f22116d = j5;
    }

    @Override // wc.f
    public final long a() {
        return this.f22116d;
    }

    @Override // wc.f
    public final long b(long j) {
        return this.f22113a[e0.e(this.f22114b, j, true)];
    }

    @Override // pc.u
    public final boolean c() {
        return true;
    }

    @Override // pc.u
    public final t h(long j) {
        long[] jArr = this.f22113a;
        int iE = e0.e(jArr, j, true);
        long j5 = jArr[iE];
        long[] jArr2 = this.f22114b;
        v vVar = new v(j5, jArr2[iE]);
        if (j5 >= j || iE == jArr.length - 1) {
            return new t(vVar, vVar);
        }
        int i7 = iE + 1;
        return new t(vVar, new v(jArr[i7], jArr2[i7]));
    }

    @Override // pc.u
    public final long i() {
        return this.f22115c;
    }
}
