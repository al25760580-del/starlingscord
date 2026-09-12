package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends vp.j {
    public List E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18279v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public n0 f18280w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m0 f18281x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e0 f18282y;

    public static f0 h() {
        f0 f0Var = new f0();
        f0Var.f18280w = n0.f18381w;
        f0Var.f18281x = m0.f18369w;
        f0Var.f18282y = e0.H;
        f0Var.E = Collections.EMPTY_LIST;
        return f0Var;
    }

    @Override // vp.i
    public final vp.a c() {
        g0 g0VarG = g();
        if (g0VarG.b()) {
            return g0VarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        f0 f0VarH = h();
        f0VarH.j(g());
        return f0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        g0 g0Var = null;
        try {
            try {
                g0.H.getClass();
                j(new g0(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                g0 g0Var2 = (g0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    g0Var = g0Var2;
                    if (g0Var != null) {
                        j(g0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (g0Var != null) {
                j(g0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((g0) nVar);
        return this;
    }

    public final g0 g() {
        g0 g0Var = new g0(this);
        int i7 = this.f18279v;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        g0Var.f18295v = this.f18280w;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        g0Var.f18296w = this.f18281x;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        g0Var.f18297x = this.f18282y;
        if ((i7 & 8) == 8) {
            this.E = Collections.unmodifiableList(this.E);
            this.f18279v &= -9;
        }
        g0Var.f18298y = this.E;
        g0Var.f18294i = i10;
        return g0Var;
    }

    public final void j(g0 g0Var) {
        e0 e0Var;
        m0 m0Var;
        n0 n0Var;
        if (g0Var == g0.G) {
            return;
        }
        if ((g0Var.f18294i & 1) == 1) {
            n0 n0Var2 = g0Var.f18295v;
            if ((this.f18279v & 1) != 1 || (n0Var = this.f18280w) == n0.f18381w) {
                this.f18280w = n0Var2;
            } else {
                o oVar = new o(3);
                oVar.f18389v = vp.r.f21917e;
                oVar.m(n0Var);
                oVar.m(n0Var2);
                this.f18280w = oVar.h();
            }
            this.f18279v |= 1;
        }
        if ((g0Var.f18294i & 2) == 2) {
            m0 m0Var2 = g0Var.f18296w;
            if ((this.f18279v & 2) != 2 || (m0Var = this.f18281x) == m0.f18369w) {
                this.f18281x = m0Var2;
            } else {
                o oVar2 = new o(1);
                oVar2.f18389v = Collections.EMPTY_LIST;
                oVar2.l(m0Var);
                oVar2.l(m0Var2);
                this.f18281x = oVar2.g();
            }
            this.f18279v |= 2;
        }
        if ((g0Var.f18294i & 4) == 4) {
            e0 e0Var2 = g0Var.f18297x;
            if ((this.f18279v & 4) != 4 || (e0Var = this.f18282y) == e0.H) {
                this.f18282y = e0Var2;
            } else {
                d0 d0VarH = d0.h();
                d0VarH.j(e0Var);
                d0VarH.j(e0Var2);
                this.f18282y = d0VarH.g();
            }
            this.f18279v |= 4;
        }
        if (!g0Var.f18298y.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = g0Var.f18298y;
                this.f18279v &= -9;
            } else {
                if ((this.f18279v & 8) != 8) {
                    this.E = new ArrayList(this.E);
                    this.f18279v |= 8;
                }
                this.E.addAll(g0Var.f18298y);
            }
        }
        f(g0Var);
        this.f21889d = this.f21889d.b(g0Var.f18293e);
    }
}
