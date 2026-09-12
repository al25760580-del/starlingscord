package md;

import gc.q1;

/* JADX INFO: loaded from: classes3.dex */
public final class y implements q, p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q f15732d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15733e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p f15734i;

    public y(q qVar, long j) {
        this.f15732d = qVar;
        this.f15733e = j;
    }

    @Override // md.q0
    public final boolean C() {
        return this.f15732d.C();
    }

    @Override // md.q
    public final long I() {
        long jI = this.f15732d.I();
        if (jI == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jI + this.f15733e;
    }

    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) {
        o0[] o0VarArr2 = new o0[o0VarArr.length];
        int i7 = 0;
        while (true) {
            o0 o0Var = null;
            if (i7 >= o0VarArr.length) {
                break;
            }
            z zVar = (z) o0VarArr[i7];
            if (zVar != null) {
                o0Var = zVar.f15740d;
            }
            o0VarArr2[i7] = o0Var;
            i7++;
        }
        q qVar = this.f15732d;
        long j5 = this.f15733e;
        long jP = qVar.P(pVarArr, zArr, o0VarArr2, zArr2, j - j5);
        for (int i10 = 0; i10 < o0VarArr.length; i10++) {
            o0 o0Var2 = o0VarArr2[i10];
            if (o0Var2 == null) {
                o0VarArr[i10] = null;
            } else {
                o0 o0Var3 = o0VarArr[i10];
                if (o0Var3 == null || ((z) o0Var3).f15740d != o0Var2) {
                    o0VarArr[i10] = new z(o0Var2, j5);
                }
            }
        }
        return jP + j5;
    }

    @Override // md.q
    public final y0 Q() {
        return this.f15732d.Q();
    }

    @Override // md.q0
    public final long S() {
        long jS = this.f15732d.S();
        if (jS == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jS + this.f15733e;
    }

    @Override // md.q0
    public final void W(long j) {
        this.f15732d.W(j - this.f15733e);
    }

    @Override // md.q
    public final long a(long j, q1 q1Var) {
        long j5 = this.f15733e;
        return this.f15732d.a(j - j5, q1Var) + j5;
    }

    @Override // md.p0
    public final void c(q0 q0Var) {
        p pVar = this.f15734i;
        pVar.getClass();
        pVar.c(this);
    }

    @Override // md.p
    public final void d(q qVar) {
        p pVar = this.f15734i;
        pVar.getClass();
        pVar.d(this);
    }

    @Override // md.q0
    public final long k() {
        long jK = this.f15732d.k();
        if (jK == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jK + this.f15733e;
    }

    @Override // md.q
    public final void l(p pVar, long j) {
        this.f15734i = pVar;
        this.f15732d.l(this, j - this.f15733e);
    }

    @Override // md.q
    public final void r() {
        this.f15732d.r();
    }

    @Override // md.q
    public final long v(long j) {
        long j5 = this.f15733e;
        return this.f15732d.v(j - j5) + j5;
    }

    @Override // md.q
    public final void w(long j) {
        this.f15732d.w(j - this.f15733e);
    }

    @Override // md.q0
    public final boolean z(long j) {
        return this.f15732d.z(j - this.f15733e);
    }
}
