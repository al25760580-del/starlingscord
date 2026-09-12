package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends vp.j {
    public y0 E;
    public f1 F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18243v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f18244w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f18245x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f18246y;

    public static d0 h() {
        d0 d0Var = new d0();
        List list = Collections.EMPTY_LIST;
        d0Var.f18244w = list;
        d0Var.f18245x = list;
        d0Var.f18246y = list;
        d0Var.E = y0.f18496y;
        d0Var.F = f1.f18283w;
        return d0Var;
    }

    @Override // vp.i
    public final vp.a c() {
        e0 e0VarG = g();
        if (e0VarG.b()) {
            return e0VarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        d0 d0VarH = h();
        d0VarH.j(g());
        return d0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        e0 e0Var = null;
        try {
            try {
                e0.I.getClass();
                j(new e0(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                e0 e0Var2 = (e0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    e0Var = e0Var2;
                    if (e0Var != null) {
                        j(e0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (e0Var != null) {
                j(e0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((e0) nVar);
        return this;
    }

    public final e0 g() {
        e0 e0Var = new e0(this);
        int i7 = this.f18243v;
        if ((i7 & 1) == 1) {
            this.f18244w = Collections.unmodifiableList(this.f18244w);
            this.f18243v &= -2;
        }
        e0Var.f18261v = this.f18244w;
        if ((this.f18243v & 2) == 2) {
            this.f18245x = Collections.unmodifiableList(this.f18245x);
            this.f18243v &= -3;
        }
        e0Var.f18262w = this.f18245x;
        if ((this.f18243v & 4) == 4) {
            this.f18246y = Collections.unmodifiableList(this.f18246y);
            this.f18243v &= -5;
        }
        e0Var.f18263x = this.f18246y;
        int i10 = (i7 & 8) != 8 ? 0 : 1;
        e0Var.f18264y = this.E;
        if ((i7 & 16) == 16) {
            i10 |= 2;
        }
        e0Var.E = this.F;
        e0Var.f18260i = i10;
        return e0Var;
    }

    public final void j(e0 e0Var) {
        f1 f1Var;
        y0 y0Var;
        if (e0Var == e0.H) {
            return;
        }
        if (!e0Var.f18261v.isEmpty()) {
            if (this.f18244w.isEmpty()) {
                this.f18244w = e0Var.f18261v;
                this.f18243v &= -2;
            } else {
                if ((this.f18243v & 1) != 1) {
                    this.f18244w = new ArrayList(this.f18244w);
                    this.f18243v |= 1;
                }
                this.f18244w.addAll(e0Var.f18261v);
            }
        }
        if (!e0Var.f18262w.isEmpty()) {
            if (this.f18245x.isEmpty()) {
                this.f18245x = e0Var.f18262w;
                this.f18243v &= -3;
            } else {
                if ((this.f18243v & 2) != 2) {
                    this.f18245x = new ArrayList(this.f18245x);
                    this.f18243v |= 2;
                }
                this.f18245x.addAll(e0Var.f18262w);
            }
        }
        if (!e0Var.f18263x.isEmpty()) {
            if (this.f18246y.isEmpty()) {
                this.f18246y = e0Var.f18263x;
                this.f18243v &= -5;
            } else {
                if ((this.f18243v & 4) != 4) {
                    this.f18246y = new ArrayList(this.f18246y);
                    this.f18243v |= 4;
                }
                this.f18246y.addAll(e0Var.f18263x);
            }
        }
        if ((e0Var.f18260i & 1) == 1) {
            y0 y0Var2 = e0Var.f18264y;
            if ((this.f18243v & 8) != 8 || (y0Var = this.E) == y0.f18496y) {
                this.E = y0Var2;
            } else {
                g gVarI = y0.i(y0Var);
                gVarI.k(y0Var2);
                this.E = gVarI.g();
            }
            this.f18243v |= 8;
        }
        if ((e0Var.f18260i & 2) == 2) {
            f1 f1Var2 = e0Var.E;
            if ((this.f18243v & 16) != 16 || (f1Var = this.F) == f1.f18283w) {
                this.F = f1Var2;
            } else {
                o oVar = new o(2);
                oVar.f18389v = Collections.EMPTY_LIST;
                oVar.n(f1Var);
                oVar.n(f1Var2);
                this.F = oVar.j();
            }
            this.f18243v |= 16;
        }
        f(e0Var);
        this.f21889d = this.f21889d.b(e0Var.f18259e);
    }
}
