package pc;

import java.util.Arrays;
import je.e0;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f17887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f17888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f17889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f17890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17891f;

    public g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f17887b = iArr;
        this.f17888c = jArr;
        this.f17889d = jArr2;
        this.f17890e = jArr3;
        int length = iArr.length;
        this.f17886a = length;
        if (length > 0) {
            this.f17891f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f17891f = 0L;
        }
    }

    @Override // pc.u
    public final boolean c() {
        return true;
    }

    @Override // pc.u
    public final t h(long j) {
        long[] jArr = this.f17890e;
        int iE = e0.e(jArr, j, true);
        long j5 = jArr[iE];
        long[] jArr2 = this.f17888c;
        v vVar = new v(j5, jArr2[iE]);
        if (j5 >= j || iE == this.f17886a - 1) {
            return new t(vVar, vVar);
        }
        int i7 = iE + 1;
        return new t(vVar, new v(jArr[i7], jArr2[i7]));
    }

    @Override // pc.u
    public final long i() {
        return this.f17891f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f17886a + ", sizes=" + Arrays.toString(this.f17887b) + ", offsets=" + Arrays.toString(this.f17888c) + ", timeUs=" + Arrays.toString(this.f17890e) + ", durationsUs=" + Arrays.toString(this.f17889d) + ")";
    }
}
