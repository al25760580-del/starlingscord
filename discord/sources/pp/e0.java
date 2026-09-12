package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends vp.k {
    public static final e0 H;
    public static final a I = new a(11);
    public f1 E;
    public byte F;
    public int G;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18259e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18260i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f18261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f18262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f18263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y0 f18264y;

    static {
        e0 e0Var = new e0();
        H = e0Var;
        List list = Collections.EMPTY_LIST;
        e0Var.f18261v = list;
        e0Var.f18262w = list;
        e0Var.f18263x = list;
        e0Var.f18264y = y0.f18496y;
        e0Var.E = f1.f18283w;
    }

    public e0(d0 d0Var) {
        super(d0Var);
        this.F = (byte) -1;
        this.G = -1;
        this.f18259e = d0Var.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return H;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.F;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f18261v.size(); i7++) {
            if (!((a0) this.f18261v.get(i7)).b()) {
                this.F = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f18262w.size(); i10++) {
            if (!((i0) this.f18262w.get(i10)).b()) {
                this.F = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < this.f18263x.size(); i11++) {
            if (!((u0) this.f18263x.get(i11)).b()) {
                this.F = (byte) 0;
                return false;
            }
        }
        if ((this.f18260i & 1) == 1 && !this.f18264y.b()) {
            this.F = (byte) 0;
            return false;
        }
        if (i()) {
            this.F = (byte) 1;
            return true;
        }
        this.F = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.G;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f18261v.size(); i10++) {
            iF += v1.f(3, (vp.a) this.f18261v.get(i10));
        }
        for (int i11 = 0; i11 < this.f18262w.size(); i11++) {
            iF += v1.f(4, (vp.a) this.f18262w.get(i11));
        }
        for (int i12 = 0; i12 < this.f18263x.size(); i12++) {
            iF += v1.f(5, (vp.a) this.f18263x.get(i12));
        }
        if ((this.f18260i & 1) == 1) {
            iF += v1.f(30, this.f18264y);
        }
        if ((this.f18260i & 2) == 2) {
            iF += v1.f(32, this.E);
        }
        int size = this.f18259e.size() + j() + iF;
        this.G = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return d0.h();
    }

    @Override // vp.a
    public final vp.i e() {
        d0 d0VarH = d0.h();
        d0VarH.j(this);
        return d0VarH;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        for (int i7 = 0; i7 < this.f18261v.size(); i7++) {
            v1Var.t(3, (vp.a) this.f18261v.get(i7));
        }
        for (int i10 = 0; i10 < this.f18262w.size(); i10++) {
            v1Var.t(4, (vp.a) this.f18262w.get(i10));
        }
        for (int i11 = 0; i11 < this.f18263x.size(); i11++) {
            v1Var.t(5, (vp.a) this.f18263x.get(i11));
        }
        if ((this.f18260i & 1) == 1) {
            v1Var.t(30, this.f18264y);
        }
        if ((this.f18260i & 2) == 2) {
            v1Var.t(32, this.E);
        }
        cVar.W(androidx.recyclerview.widget.h0.DEFAULT_DRAG_ANIMATION_DURATION, v1Var);
        v1Var.w(this.f18259e);
    }

    public e0() {
        this.F = (byte) -1;
        this.G = -1;
        this.f18259e = vp.d.f21871d;
    }

    public e0(vp.e eVar, vp.g gVar) {
        this.F = (byte) -1;
        this.G = -1;
        List list = Collections.EMPTY_LIST;
        this.f18261v = list;
        this.f18262w = list;
        this.f18263x = list;
        this.f18264y = y0.f18496y;
        this.E = f1.f18283w;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        int i7 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 26) {
                            int i10 = (i7 == true ? 1 : 0) & 1;
                            i7 = i7;
                            if (i10 != 1) {
                                this.f18261v = new ArrayList();
                                i7 = (i7 == true ? 1 : 0) | 1;
                            }
                            this.f18261v.add(eVar.g(a0.T, gVar));
                        } else if (iN == 34) {
                            int i11 = (i7 == true ? 1 : 0) & 2;
                            i7 = i7;
                            if (i11 != 2) {
                                this.f18262w = new ArrayList();
                                i7 = (i7 == true ? 1 : 0) | 2;
                            }
                            this.f18262w.add(eVar.g(i0.T, gVar));
                        } else if (iN != 42) {
                            o oVar = null;
                            g gVarI = null;
                            if (iN == 242) {
                                if ((this.f18260i & 1) == 1) {
                                    y0 y0Var = this.f18264y;
                                    y0Var.getClass();
                                    gVarI = y0.i(y0Var);
                                }
                                y0 y0Var2 = (y0) eVar.g(y0.E, gVar);
                                this.f18264y = y0Var2;
                                if (gVarI != null) {
                                    gVarI.k(y0Var2);
                                    this.f18264y = gVarI.g();
                                }
                                this.f18260i |= 1;
                            } else if (iN != 258) {
                                if (!n(eVar, v1VarM, gVar, iN)) {
                                }
                            } else {
                                if ((this.f18260i & 2) == 2) {
                                    f1 f1Var = this.E;
                                    f1Var.getClass();
                                    oVar = new o(2);
                                    oVar.f18389v = Collections.EMPTY_LIST;
                                    oVar.n(f1Var);
                                }
                                f1 f1Var2 = (f1) eVar.g(f1.f18284x, gVar);
                                this.E = f1Var2;
                                if (oVar != null) {
                                    oVar.n(f1Var2);
                                    this.E = oVar.j();
                                }
                                this.f18260i |= 2;
                            }
                        } else {
                            int i12 = (i7 == true ? 1 : 0) & 4;
                            i7 = i7;
                            if (i12 != 4) {
                                this.f18263x = new ArrayList();
                                i7 = (i7 == true ? 1 : 0) | 4;
                            }
                            this.f18263x.add(eVar.g(u0.N, gVar));
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
                if (((i7 == true ? 1 : 0) & 1) == 1) {
                    this.f18261v = Collections.unmodifiableList(this.f18261v);
                }
                if (((i7 == true ? 1 : 0) & 2) == 2) {
                    this.f18262w = Collections.unmodifiableList(this.f18262w);
                }
                if (((i7 == true ? 1 : 0) & 4) == 4) {
                    this.f18263x = Collections.unmodifiableList(this.f18263x);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18259e = cVar.g();
                }
                m();
                throw th2;
            }
        }
        if (((i7 == true ? 1 : 0) & 1) == 1) {
            this.f18261v = Collections.unmodifiableList(this.f18261v);
        }
        if (((i7 == true ? 1 : 0) & 2) == 2) {
            this.f18262w = Collections.unmodifiableList(this.f18262w);
        }
        if (((i7 == true ? 1 : 0) & 4) == 4) {
            this.f18263x = Collections.unmodifiableList(this.f18263x);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18259e = cVar.g();
        }
        m();
    }
}
