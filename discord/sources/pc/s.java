package pc;

import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f17923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f17924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f17926d;

    public s(long j, long[] jArr, long[] jArr2) {
        je.b.g(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z5 = length > 0;
        this.f17926d = z5;
        if (!z5 || jArr2[0] <= 0) {
            this.f17923a = jArr;
            this.f17924b = jArr2;
        } else {
            int i7 = length + 1;
            long[] jArr3 = new long[i7];
            this.f17923a = jArr3;
            long[] jArr4 = new long[i7];
            this.f17924b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f17925c = j;
    }

    @Override // pc.u
    public final boolean c() {
        return this.f17926d;
    }

    @Override // pc.u
    public final t h(long j) {
        if (!this.f17926d) {
            v vVar = v.f17929c;
            return new t(vVar, vVar);
        }
        long[] jArr = this.f17924b;
        int iE = e0.e(jArr, j, true);
        long j5 = jArr[iE];
        long[] jArr2 = this.f17923a;
        v vVar2 = new v(j5, jArr2[iE]);
        if (j5 == j || iE == jArr.length - 1) {
            return new t(vVar2, vVar2);
        }
        int i7 = iE + 1;
        return new t(vVar2, new v(jArr[i7], jArr2[i7]));
    }

    @Override // pc.u
    public final long i() {
        return this.f17925c;
    }
}
