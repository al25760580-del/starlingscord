package pp;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends vp.i implements vp.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18390e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p0 f18391i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s0 f18392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18393w;

    public static o0 g() {
        o0 o0Var = new o0();
        o0Var.f18391i = p0.INV;
        o0Var.f18392v = s0.Q;
        return o0Var;
    }

    @Override // vp.i
    public final vp.a c() {
        q0 q0VarF = f();
        if (q0VarF.b()) {
            return q0VarF;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        o0 o0VarG = g();
        o0VarG.h(f());
        return o0VarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        q0 q0Var = null;
        try {
            try {
                q0.F.getClass();
                h(new q0(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                q0 q0Var2 = (q0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    q0Var = q0Var2;
                    if (q0Var != null) {
                        h(q0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (q0Var != null) {
                h(q0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        h((q0) nVar);
        return this;
    }

    public final q0 f() {
        q0 q0Var = new q0(this);
        int i7 = this.f18390e;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        q0Var.f18413i = this.f18391i;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        q0Var.f18414v = this.f18392v;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        q0Var.f18415w = this.f18393w;
        q0Var.f18412e = i10;
        return q0Var;
    }

    public final void h(q0 q0Var) {
        s0 s0Var;
        if (q0Var == q0.E) {
            return;
        }
        if ((q0Var.f18412e & 1) == 1) {
            p0 p0Var = q0Var.f18413i;
            p0Var.getClass();
            this.f18390e = 1 | this.f18390e;
            this.f18391i = p0Var;
        }
        if ((q0Var.f18412e & 2) == 2) {
            s0 s0Var2 = q0Var.f18414v;
            if ((this.f18390e & 2) != 2 || (s0Var = this.f18392v) == s0.Q) {
                this.f18392v = s0Var2;
            } else {
                r0 r0VarQ = s0.q(s0Var);
                r0VarQ.j(s0Var2);
                this.f18392v = r0VarQ.g();
            }
            this.f18390e |= 2;
        }
        if ((q0Var.f18412e & 4) == 4) {
            int i7 = q0Var.f18415w;
            this.f18390e = 4 | this.f18390e;
            this.f18393w = i7;
        }
        this.f21889d = this.f21889d.b(q0Var.f18411d);
    }
}
