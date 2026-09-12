package ad;

import je.e0;
import pc.t;
import pc.u;
import pc.v;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f353e;

    public g(e eVar, int i7, long j, long j5) {
        this.f349a = eVar;
        this.f350b = i7;
        this.f351c = j;
        long j7 = (j5 - j) / ((long) eVar.f344i);
        this.f352d = j7;
        this.f353e = e0.P(j7 * ((long) i7), 1000000L, eVar.f343e);
    }

    @Override // pc.u
    public final boolean c() {
        return true;
    }

    @Override // pc.u
    public final t h(long j) {
        e eVar = this.f349a;
        long j5 = ((long) eVar.f343e) * j;
        int i7 = this.f350b;
        long j7 = this.f352d - 1;
        long j10 = e0.j(j5 / (((long) i7) * 1000000), 0L, j7);
        int i10 = eVar.f344i;
        long j11 = this.f351c;
        long jP = e0.P(j10 * ((long) i7), 1000000L, eVar.f343e);
        v vVar = new v(jP, (((long) i10) * j10) + j11);
        if (jP >= j || j10 == j7) {
            return new t(vVar, vVar);
        }
        long j12 = j10 + 1;
        return new t(vVar, new v(e0.P(j12 * ((long) i7), 1000000L, eVar.f343e), (((long) i10) * j12) + j11));
    }

    @Override // pc.u
    public final long i() {
        return this.f353e;
    }
}
