package wc;

import android.util.Pair;
import je.e0;
import pc.t;
import pc.v;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f22093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f22094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f22095c;

    public c(long j, long[] jArr, long[] jArr2) {
        this.f22093a = jArr;
        this.f22094b = jArr2;
        this.f22095c = j == -9223372036854775807L ? e0.I(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair d(long j, long[] jArr, long[] jArr2) {
        int iE = e0.e(jArr, j, true);
        long j5 = jArr[iE];
        long j7 = jArr2[iE];
        int i7 = iE + 1;
        if (i7 == jArr.length) {
            return Pair.create(Long.valueOf(j5), Long.valueOf(j7));
        }
        long j10 = jArr[i7];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j10 == j5 ? 0.0d : (j - j5) / (j10 - j5)) * (jArr2[i7] - j7))) + j7));
    }

    @Override // wc.f
    public final long a() {
        return -1L;
    }

    @Override // wc.f
    public final long b(long j) {
        return e0.I(((Long) d(j, this.f22093a, this.f22094b).second).longValue());
    }

    @Override // pc.u
    public final boolean c() {
        return true;
    }

    @Override // pc.u
    public final t h(long j) {
        Pair pairD = d(e0.U(e0.j(j, 0L, this.f22095c)), this.f22094b, this.f22093a);
        v vVar = new v(e0.I(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new t(vVar, vVar);
    }

    @Override // pc.u
    public final long i() {
        return this.f22095c;
    }
}
