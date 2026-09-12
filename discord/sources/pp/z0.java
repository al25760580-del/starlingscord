package pp;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends vp.j {
    public int E;
    public s0 F;
    public int G;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18507v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18509x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s0 f18510y;

    @Override // vp.i
    public final vp.a c() {
        a1 a1VarG = g();
        if (a1VarG.b()) {
            return a1VarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        z0 z0Var = new z0();
        s0 s0Var = s0.Q;
        z0Var.f18510y = s0Var;
        z0Var.F = s0Var;
        z0Var.h(g());
        return z0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        a1 a1Var = null;
        try {
            try {
                a1.J.getClass();
                h(new a1(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                a1 a1Var2 = (a1) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    a1Var = a1Var2;
                    if (a1Var != null) {
                        h(a1Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (a1Var != null) {
                h(a1Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        h((a1) nVar);
        return this;
    }

    public final a1 g() {
        a1 a1Var = new a1(this);
        int i7 = this.f18507v;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        a1Var.f18207v = this.f18508w;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        a1Var.f18208w = this.f18509x;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        a1Var.f18209x = this.f18510y;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        a1Var.f18210y = this.E;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        a1Var.E = this.F;
        if ((i7 & 32) == 32) {
            i10 |= 32;
        }
        a1Var.F = this.G;
        a1Var.f18206i = i10;
        return a1Var;
    }

    public final void h(a1 a1Var) {
        s0 s0Var;
        s0 s0Var2;
        if (a1Var == a1.I) {
            return;
        }
        int i7 = a1Var.f18206i;
        if ((i7 & 1) == 1) {
            int i10 = a1Var.f18207v;
            this.f18507v = 1 | this.f18507v;
            this.f18508w = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = a1Var.f18208w;
            this.f18507v = 2 | this.f18507v;
            this.f18509x = i11;
        }
        if ((i7 & 4) == 4) {
            s0 s0Var3 = a1Var.f18209x;
            if ((this.f18507v & 4) != 4 || (s0Var2 = this.f18510y) == s0.Q) {
                this.f18510y = s0Var3;
            } else {
                r0 r0VarQ = s0.q(s0Var2);
                r0VarQ.j(s0Var3);
                this.f18510y = r0VarQ.g();
            }
            this.f18507v |= 4;
        }
        int i12 = a1Var.f18206i;
        if ((i12 & 8) == 8) {
            int i13 = a1Var.f18210y;
            this.f18507v = 8 | this.f18507v;
            this.E = i13;
        }
        if ((i12 & 16) == 16) {
            s0 s0Var4 = a1Var.E;
            if ((this.f18507v & 16) != 16 || (s0Var = this.F) == s0.Q) {
                this.F = s0Var4;
            } else {
                r0 r0VarQ2 = s0.q(s0Var);
                r0VarQ2.j(s0Var4);
                this.F = r0VarQ2.g();
            }
            this.f18507v |= 16;
        }
        if ((a1Var.f18206i & 32) == 32) {
            int i14 = a1Var.F;
            this.f18507v = 32 | this.f18507v;
            this.G = i14;
        }
        f(a1Var);
        this.f21889d = this.f21889d.b(a1Var.f18205e);
    }
}
