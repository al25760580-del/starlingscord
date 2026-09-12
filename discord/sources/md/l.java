package md;

import gc.q1;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements q, p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f15652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15653e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final he.q f15654i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f15655v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public q f15656w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public p f15657x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f15658y = -9223372036854775807L;

    public l(s sVar, he.q qVar, long j) {
        this.f15652d = sVar;
        this.f15654i = qVar;
        this.f15653e = j;
    }

    @Override // md.q0
    public final boolean C() {
        q qVar = this.f15656w;
        return qVar != null && qVar.C();
    }

    @Override // md.q
    public final long I() {
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        return qVar.I();
    }

    @Override // md.q
    public final long P(fe.p[] pVarArr, boolean[] zArr, o0[] o0VarArr, boolean[] zArr2, long j) {
        long j5;
        long j7 = this.f15658y;
        if (j7 == -9223372036854775807L || j != this.f15653e) {
            j5 = j;
        } else {
            this.f15658y = -9223372036854775807L;
            j5 = j7;
        }
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        return qVar.P(pVarArr, zArr, o0VarArr, zArr2, j5);
    }

    @Override // md.q
    public final y0 Q() {
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        return qVar.Q();
    }

    @Override // md.q0
    public final long S() {
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        return qVar.S();
    }

    @Override // md.q0
    public final void W(long j) {
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        qVar.W(j);
    }

    @Override // md.q
    public final long a(long j, q1 q1Var) {
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        return qVar.a(j, q1Var);
    }

    @Override // md.p0
    public final void c(q0 q0Var) {
        p pVar = this.f15657x;
        int i7 = je.e0.f13788a;
        pVar.c(this);
    }

    @Override // md.p
    public final void d(q qVar) {
        p pVar = this.f15657x;
        int i7 = je.e0.f13788a;
        pVar.d(this);
    }

    @Override // md.q0
    public final long k() {
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        return qVar.k();
    }

    @Override // md.q
    public final void l(p pVar, long j) {
        this.f15657x = pVar;
        q qVar = this.f15656w;
        if (qVar != null) {
            long j5 = this.f15658y;
            if (j5 == -9223372036854775807L) {
                j5 = this.f15653e;
            }
            qVar.l(this, j5);
        }
    }

    @Override // md.q
    public final void r() {
        q qVar = this.f15656w;
        if (qVar != null) {
            qVar.r();
            return;
        }
        a aVar = this.f15655v;
        if (aVar != null) {
            aVar.k();
        }
    }

    @Override // md.q
    public final long v(long j) {
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        return qVar.v(j);
    }

    @Override // md.q
    public final void w(long j) {
        q qVar = this.f15656w;
        int i7 = je.e0.f13788a;
        qVar.w(j);
    }

    @Override // md.q0
    public final boolean z(long j) {
        q qVar = this.f15656w;
        return qVar != null && qVar.z(j);
    }
}
