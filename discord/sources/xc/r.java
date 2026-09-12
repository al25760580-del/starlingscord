package xc;

import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f22859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f22861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f22862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f22863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f22864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f22865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f22866h;

    public r(o oVar, long[] jArr, int[] iArr, int i7, long[] jArr2, int[] iArr2, long j) {
        je.b.g(iArr.length == jArr2.length);
        je.b.g(jArr.length == jArr2.length);
        je.b.g(iArr2.length == jArr2.length);
        this.f22859a = oVar;
        this.f22861c = jArr;
        this.f22862d = iArr;
        this.f22863e = i7;
        this.f22864f = jArr2;
        this.f22865g = iArr2;
        this.f22866h = j;
        this.f22860b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j) {
        long[] jArr = this.f22864f;
        for (int iB = e0.b(jArr, j, true); iB < jArr.length; iB++) {
            if ((this.f22865g[iB] & 1) != 0) {
                return iB;
            }
        }
        return -1;
    }
}
