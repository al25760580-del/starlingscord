package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends vp.i implements vp.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18387e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18388i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f18389v;

    public /* synthetic */ o(int i7) {
        this.f18387e = i7;
    }

    @Override // vp.i
    public final vp.a c() {
        switch (this.f18387e) {
            case 0:
                p pVarF = f();
                if (pVarF.b()) {
                    return pVarF;
                }
                throw new androidx.datastore.preferences.protobuf.d1();
            case 1:
                m0 m0VarG = g();
                if (m0VarG.b()) {
                    return m0VarG;
                }
                throw new androidx.datastore.preferences.protobuf.d1();
            case 2:
                f1 f1VarJ = j();
                f1VarJ.b();
                return f1VarJ;
            default:
                n0 n0VarH = h();
                n0VarH.b();
                return n0VarH;
        }
    }

    public final Object clone() {
        switch (this.f18387e) {
            case 0:
                o oVar = new o(0);
                oVar.f18389v = Collections.EMPTY_LIST;
                oVar.k(f());
                return oVar;
            case 1:
                o oVar2 = new o(1);
                oVar2.f18389v = Collections.EMPTY_LIST;
                oVar2.l(g());
                return oVar2;
            case 2:
                o oVar3 = new o(2);
                oVar3.f18389v = Collections.EMPTY_LIST;
                oVar3.n(j());
                return oVar3;
            default:
                o oVar4 = new o(3);
                oVar4.f18389v = vp.r.f21917e;
                oVar4.m(h());
                return oVar4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    /* JADX WARN: Code duplicated, block: B:44:0x005e  */
    /* JADX WARN: Code duplicated, block: B:58:0x007d  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        switch (this.f18387e) {
            case 0:
                p pVar = null;
                try {
                    try {
                        p.f18395x.getClass();
                        k(new p(eVar, gVar));
                        return this;
                    } catch (Throwable th2) {
                        th = th2;
                        if (pVar != null) {
                            k(pVar);
                        }
                        throw th;
                    }
                } catch (vp.q e10) {
                    p pVar2 = (p) e10.f21916d;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        pVar = pVar2;
                        if (pVar != null) {
                            k(pVar);
                        }
                        throw th;
                    }
                }
            case 1:
                m0 m0Var = null;
                try {
                    try {
                        m0.f18370x.getClass();
                        l(new m0(eVar, gVar));
                        return this;
                    } catch (Throwable th4) {
                        th = th4;
                        if (m0Var != null) {
                            l(m0Var);
                        }
                        throw th;
                    }
                } catch (vp.q e11) {
                    m0 m0Var2 = (m0) e11.f21916d;
                    try {
                        throw e11;
                    } catch (Throwable th5) {
                        th = th5;
                        m0Var = m0Var2;
                        if (m0Var != null) {
                            l(m0Var);
                        }
                        throw th;
                    }
                }
            case 2:
                f1 f1Var = null;
                try {
                    try {
                        f1.f18284x.getClass();
                        n(new f1(eVar, gVar));
                        return this;
                    } catch (Throwable th6) {
                        th = th6;
                        if (f1Var != null) {
                            n(f1Var);
                        }
                        throw th;
                    }
                } catch (vp.q e12) {
                    f1 f1Var2 = (f1) e12.f21916d;
                    try {
                        throw e12;
                    } catch (Throwable th7) {
                        th = th7;
                        f1Var = f1Var2;
                        if (f1Var != null) {
                            n(f1Var);
                        }
                        throw th;
                    }
                }
            default:
                n0 n0Var = null;
                try {
                    try {
                        n0.f18382x.getClass();
                        m(new n0(eVar));
                        return this;
                    } catch (Throwable th8) {
                        th = th8;
                        if (n0Var != null) {
                            m(n0Var);
                        }
                        throw th;
                    }
                } catch (vp.q e13) {
                    n0 n0Var2 = (n0) e13.f21916d;
                    try {
                        throw e13;
                    } catch (Throwable th9) {
                        th = th9;
                        n0Var = n0Var2;
                        if (n0Var != null) {
                            m(n0Var);
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        switch (this.f18387e) {
            case 0:
                k((p) nVar);
                break;
            case 1:
                l((m0) nVar);
                break;
            case 2:
                n((f1) nVar);
                break;
            default:
                m((n0) nVar);
                break;
        }
        return this;
    }

    public p f() {
        p pVar = new p(this);
        if ((this.f18388i & 1) == 1) {
            this.f18389v = Collections.unmodifiableList(this.f18389v);
            this.f18388i &= -2;
        }
        pVar.f18397e = this.f18389v;
        return pVar;
    }

    public m0 g() {
        m0 m0Var = new m0(this);
        if ((this.f18388i & 1) == 1) {
            this.f18389v = Collections.unmodifiableList(this.f18389v);
            this.f18388i &= -2;
        }
        m0Var.f18372e = this.f18389v;
        return m0Var;
    }

    public n0 h() {
        n0 n0Var = new n0(this);
        if ((this.f18388i & 1) == 1) {
            this.f18389v = ((vp.s) this.f18389v).f();
            this.f18388i &= -2;
        }
        n0Var.f18384e = (vp.s) this.f18389v;
        return n0Var;
    }

    public f1 j() {
        f1 f1Var = new f1(this);
        if ((this.f18388i & 1) == 1) {
            this.f18389v = Collections.unmodifiableList(this.f18389v);
            this.f18388i &= -2;
        }
        f1Var.f18286e = this.f18389v;
        return f1Var;
    }

    public void k(p pVar) {
        if (pVar == p.f18394w) {
            return;
        }
        if (!pVar.f18397e.isEmpty()) {
            if (this.f18389v.isEmpty()) {
                this.f18389v = pVar.f18397e;
                this.f18388i &= -2;
            } else {
                if ((this.f18388i & 1) != 1) {
                    this.f18389v = new ArrayList(this.f18389v);
                    this.f18388i |= 1;
                }
                this.f18389v.addAll(pVar.f18397e);
            }
        }
        this.f21889d = this.f21889d.b(pVar.f18396d);
    }

    public void l(m0 m0Var) {
        if (m0Var == m0.f18369w) {
            return;
        }
        if (!m0Var.f18372e.isEmpty()) {
            if (this.f18389v.isEmpty()) {
                this.f18389v = m0Var.f18372e;
                this.f18388i &= -2;
            } else {
                if ((this.f18388i & 1) != 1) {
                    this.f18389v = new ArrayList(this.f18389v);
                    this.f18388i |= 1;
                }
                this.f18389v.addAll(m0Var.f18372e);
            }
        }
        this.f21889d = this.f21889d.b(m0Var.f18371d);
    }

    public void m(n0 n0Var) {
        if (n0Var == n0.f18381w) {
            return;
        }
        if (!n0Var.f18384e.isEmpty()) {
            if (((vp.s) this.f18389v).isEmpty()) {
                this.f18389v = n0Var.f18384e;
                this.f18388i &= -2;
            } else {
                if ((this.f18388i & 1) != 1) {
                    this.f18389v = new vp.r((vp.s) this.f18389v);
                    this.f18388i |= 1;
                }
                ((vp.s) this.f18389v).addAll(n0Var.f18384e);
            }
        }
        this.f21889d = this.f21889d.b(n0Var.f18383d);
    }

    public void n(f1 f1Var) {
        if (f1Var == f1.f18283w) {
            return;
        }
        if (!f1Var.f18286e.isEmpty()) {
            if (this.f18389v.isEmpty()) {
                this.f18389v = f1Var.f18286e;
                this.f18388i &= -2;
            } else {
                if ((this.f18388i & 1) != 1) {
                    this.f18389v = new ArrayList(this.f18389v);
                    this.f18388i |= 1;
                }
                this.f18389v.addAll(f1Var.f18286e);
            }
        }
        this.f21889d = this.f21889d.b(f1Var.f18285d);
    }
}
