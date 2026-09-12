package pp;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends vp.i implements vp.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18329e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18330i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18331v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k0 f18332w;

    public static j0 g() {
        j0 j0Var = new j0();
        j0Var.f18330i = -1;
        j0Var.f18332w = k0.PACKAGE;
        return j0Var;
    }

    @Override // vp.i
    public final vp.a c() {
        l0 l0VarF = f();
        if (l0VarF.b()) {
            return l0VarF;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        j0 j0VarG = g();
        j0VarG.h(f());
        return j0VarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        l0 l0Var = null;
        try {
            try {
                l0.F.getClass();
                h(new l0(eVar));
                return this;
            } catch (vp.q e10) {
                l0 l0Var2 = (l0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    l0Var = l0Var2;
                    if (l0Var != null) {
                        h(l0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (l0Var != null) {
                h(l0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        h((l0) nVar);
        return this;
    }

    public final l0 f() {
        l0 l0Var = new l0(this);
        int i7 = this.f18329e;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        l0Var.f18360i = this.f18330i;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        l0Var.f18361v = this.f18331v;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        l0Var.f18362w = this.f18332w;
        l0Var.f18359e = i10;
        return l0Var;
    }

    public final void h(l0 l0Var) {
        if (l0Var == l0.E) {
            return;
        }
        int i7 = l0Var.f18359e;
        if ((i7 & 1) == 1) {
            int i10 = l0Var.f18360i;
            this.f18329e = 1 | this.f18329e;
            this.f18330i = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = l0Var.f18361v;
            this.f18329e = 2 | this.f18329e;
            this.f18331v = i11;
        }
        if ((i7 & 4) == 4) {
            k0 k0Var = l0Var.f18362w;
            k0Var.getClass();
            this.f18329e = 4 | this.f18329e;
            this.f18332w = k0Var;
        }
        this.f21889d = this.f21889d.b(l0Var.f18358d);
    }
}
