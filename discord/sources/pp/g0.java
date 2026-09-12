package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends vp.k {
    public static final g0 G;
    public static final a H = new a(12);
    public byte E;
    public int F;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18293e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18294i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n0 f18295v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public m0 f18296w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e0 f18297x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f18298y;

    static {
        g0 g0Var = new g0();
        G = g0Var;
        g0Var.f18295v = n0.f18381w;
        g0Var.f18296w = m0.f18369w;
        g0Var.f18297x = e0.H;
        g0Var.f18298y = Collections.EMPTY_LIST;
    }

    public g0(f0 f0Var) {
        super(f0Var);
        this.E = (byte) -1;
        this.F = -1;
        this.f18293e = f0Var.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return G;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f18294i & 2) == 2 && !this.f18296w.b()) {
            this.E = (byte) 0;
            return false;
        }
        if ((this.f18294i & 4) == 4 && !this.f18297x.b()) {
            this.E = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f18298y.size(); i7++) {
            if (!((k) this.f18298y.get(i7)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.E = (byte) 1;
            return true;
        }
        this.E = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.F;
        if (i7 != -1) {
            return i7;
        }
        int iF = (this.f18294i & 1) == 1 ? v1.f(1, this.f18295v) : 0;
        if ((this.f18294i & 2) == 2) {
            iF += v1.f(2, this.f18296w);
        }
        if ((this.f18294i & 4) == 4) {
            iF += v1.f(3, this.f18297x);
        }
        for (int i10 = 0; i10 < this.f18298y.size(); i10++) {
            iF += v1.f(4, (vp.a) this.f18298y.get(i10));
        }
        int size = this.f18293e.size() + j() + iF;
        this.F = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return f0.h();
    }

    @Override // vp.a
    public final vp.i e() {
        f0 f0VarH = f0.h();
        f0VarH.j(this);
        return f0VarH;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18294i & 1) == 1) {
            v1Var.t(1, this.f18295v);
        }
        if ((this.f18294i & 2) == 2) {
            v1Var.t(2, this.f18296w);
        }
        if ((this.f18294i & 4) == 4) {
            v1Var.t(3, this.f18297x);
        }
        for (int i7 = 0; i7 < this.f18298y.size(); i7++) {
            v1Var.t(4, (vp.a) this.f18298y.get(i7));
        }
        cVar.W(androidx.recyclerview.widget.h0.DEFAULT_DRAG_ANIMATION_DURATION, v1Var);
        v1Var.w(this.f18293e);
    }

    public g0() {
        this.E = (byte) -1;
        this.F = -1;
        this.f18293e = vp.d.f21871d;
    }

    public g0(vp.e eVar, vp.g gVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.f18295v = n0.f18381w;
        this.f18296w = m0.f18369w;
        this.f18297x = e0.H;
        this.f18298y = Collections.EMPTY_LIST;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        char c8 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        d0 d0VarH = null;
                        o oVar = null;
                        o oVar2 = null;
                        if (iN == 10) {
                            if ((this.f18294i & 1) == 1) {
                                n0 n0Var = this.f18295v;
                                n0Var.getClass();
                                oVar = new o(3);
                                oVar.f18389v = vp.r.f21917e;
                                oVar.m(n0Var);
                            }
                            n0 n0Var2 = (n0) eVar.g(n0.f18382x, gVar);
                            this.f18295v = n0Var2;
                            if (oVar != null) {
                                oVar.m(n0Var2);
                                this.f18295v = oVar.h();
                            }
                            this.f18294i |= 1;
                        } else if (iN == 18) {
                            if ((this.f18294i & 2) == 2) {
                                m0 m0Var = this.f18296w;
                                m0Var.getClass();
                                oVar2 = new o(1);
                                oVar2.f18389v = Collections.EMPTY_LIST;
                                oVar2.l(m0Var);
                            }
                            m0 m0Var2 = (m0) eVar.g(m0.f18370x, gVar);
                            this.f18296w = m0Var2;
                            if (oVar2 != null) {
                                oVar2.l(m0Var2);
                                this.f18296w = oVar2.g();
                            }
                            this.f18294i |= 2;
                        } else if (iN == 26) {
                            if ((this.f18294i & 4) == 4) {
                                e0 e0Var = this.f18297x;
                                e0Var.getClass();
                                d0VarH = d0.h();
                                d0VarH.j(e0Var);
                            }
                            e0 e0Var2 = (e0) eVar.g(e0.I, gVar);
                            this.f18297x = e0Var2;
                            if (d0VarH != null) {
                                d0VarH.j(e0Var2);
                                this.f18297x = d0VarH.g();
                            }
                            this.f18294i |= 4;
                        } else if (iN != 34) {
                            if (!n(eVar, v1VarM, gVar, iN)) {
                            }
                        } else {
                            int i7 = (c8 == true ? 1 : 0) & '\b';
                            c8 = c8;
                            if (i7 != 8) {
                                this.f18298y = new ArrayList();
                                c8 = '\b';
                            }
                            this.f18298y.add(eVar.g(k.f18333i0, gVar));
                        }
                    }
                    z5 = true;
                } catch (vp.q e10) {
                    e10.f21916d = this;
                    throw e10;
                } catch (IOException e11) {
                    vp.q qVar = new vp.q(e11.getMessage());
                    qVar.f21916d = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                if (((c8 == true ? 1 : 0) & '\b') == 8) {
                    this.f18298y = Collections.unmodifiableList(this.f18298y);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18293e = cVar.g();
                }
                m();
                throw th2;
            }
        }
        if (((c8 == true ? 1 : 0) & '\b') == 8) {
            this.f18298y = Collections.unmodifiableList(this.f18298y);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18293e = cVar.g();
        }
        m();
    }
}
