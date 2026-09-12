package pp;

/* JADX INFO: loaded from: classes3.dex */
public final class b1 extends vp.i implements vp.u {
    public d1 E;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18217e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18218i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18219v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c1 f18220w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18221x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18222y;

    public static b1 g() {
        b1 b1Var = new b1();
        b1Var.f18220w = c1.ERROR;
        b1Var.E = d1.LANGUAGE_VERSION;
        return b1Var;
    }

    @Override // vp.i
    public final vp.a c() {
        e1 e1VarF = f();
        e1VarF.b();
        return e1VarF;
    }

    public final Object clone() {
        b1 b1VarG = g();
        b1VarG.h(f());
        return b1VarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        e1 e1Var = null;
        try {
            try {
                e1.I.getClass();
                h(new e1(eVar));
                return this;
            } catch (vp.q e10) {
                e1 e1Var2 = (e1) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    e1Var = e1Var2;
                    if (e1Var != null) {
                        h(e1Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (e1Var != null) {
                h(e1Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        h((e1) nVar);
        return this;
    }

    public final e1 f() {
        e1 e1Var = new e1(this);
        int i7 = this.f18217e;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        e1Var.f18267i = this.f18218i;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        e1Var.f18268v = this.f18219v;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        e1Var.f18269w = this.f18220w;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        e1Var.f18270x = this.f18221x;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        e1Var.f18271y = this.f18222y;
        if ((i7 & 32) == 32) {
            i10 |= 32;
        }
        e1Var.E = this.E;
        e1Var.f18266e = i10;
        return e1Var;
    }

    public final void h(e1 e1Var) {
        if (e1Var == e1.H) {
            return;
        }
        int i7 = e1Var.f18266e;
        if ((i7 & 1) == 1) {
            int i10 = e1Var.f18267i;
            this.f18217e = 1 | this.f18217e;
            this.f18218i = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = e1Var.f18268v;
            this.f18217e = 2 | this.f18217e;
            this.f18219v = i11;
        }
        if ((i7 & 4) == 4) {
            c1 c1Var = e1Var.f18269w;
            c1Var.getClass();
            this.f18217e = 4 | this.f18217e;
            this.f18220w = c1Var;
        }
        int i12 = e1Var.f18266e;
        if ((i12 & 8) == 8) {
            int i13 = e1Var.f18270x;
            this.f18217e = 8 | this.f18217e;
            this.f18221x = i13;
        }
        if ((i12 & 16) == 16) {
            int i14 = e1Var.f18271y;
            this.f18217e = 16 | this.f18217e;
            this.f18222y = i14;
        }
        if ((i12 & 32) == 32) {
            d1 d1Var = e1Var.E;
            d1Var.getClass();
            this.f18217e = 32 | this.f18217e;
            this.E = d1Var;
        }
        this.f21889d = this.f21889d.b(e1Var.f18265d);
    }
}
