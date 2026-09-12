package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends vp.k {
    public static final x0 J;
    public static final a K = new a(20);
    public List E;
    public List F;
    public int G;
    public byte H;
    public int I;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18483e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18484i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public w0 f18488y;

    static {
        x0 x0Var = new x0();
        J = x0Var;
        x0Var.f18485v = 0;
        x0Var.f18486w = 0;
        x0Var.f18487x = false;
        x0Var.f18488y = w0.INV;
        List list = Collections.EMPTY_LIST;
        x0Var.E = list;
        x0Var.F = list;
    }

    public x0(v0 v0Var) {
        super(v0Var);
        this.G = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f18483e = v0Var.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return J;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.H;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f18484i;
        if ((i7 & 1) != 1) {
            this.H = (byte) 0;
            return false;
        }
        if ((i7 & 2) != 2) {
            this.H = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            if (!((s0) this.E.get(i10)).b()) {
                this.H = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.H = (byte) 1;
            return true;
        }
        this.H = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.I;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18484i & 1) == 1 ? v1.d(1, this.f18485v) : 0;
        if ((this.f18484i & 2) == 2) {
            iD += v1.d(2, this.f18486w);
        }
        if ((this.f18484i & 4) == 4) {
            iD += v1.j(3) + 1;
        }
        if ((this.f18484i & 8) == 8) {
            iD += v1.c(4, this.f18488y.f18477d);
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            iD += v1.f(5, (vp.a) this.E.get(i10));
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            iE += v1.e(((Integer) this.F.get(i11)).intValue());
        }
        int iE2 = iD + iE;
        if (!this.F.isEmpty()) {
            iE2 = iE2 + 1 + v1.e(iE);
        }
        this.G = iE;
        int size = this.f18483e.size() + j() + iE2;
        this.I = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return v0.h();
    }

    @Override // vp.a
    public final vp.i e() {
        v0 v0VarH = v0.h();
        v0VarH.j(this);
        return v0VarH;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18484i & 1) == 1) {
            v1Var.r(1, this.f18485v);
        }
        if ((this.f18484i & 2) == 2) {
            v1Var.r(2, this.f18486w);
        }
        if ((this.f18484i & 4) == 4) {
            boolean z5 = this.f18487x;
            v1Var.C(3, 0);
            v1Var.v(z5 ? 1 : 0);
        }
        if ((this.f18484i & 8) == 8) {
            v1Var.q(4, this.f18488y.f18477d);
        }
        for (int i7 = 0; i7 < this.E.size(); i7++) {
            v1Var.t(5, (vp.a) this.E.get(i7));
        }
        if (this.F.size() > 0) {
            v1Var.A(50);
            v1Var.A(this.G);
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            v1Var.s(((Integer) this.F.get(i10)).intValue());
        }
        cVar.W(1000, v1Var);
        v1Var.w(this.f18483e);
    }

    public x0() {
        this.G = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f18483e = vp.d.f21871d;
    }

    public x0(vp.e eVar, vp.g gVar) {
        w0 w0Var;
        this.G = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f18485v = 0;
        this.f18486w = 0;
        this.f18487x = false;
        w0 w0Var2 = w0.INV;
        this.f18488y = w0Var2;
        List list = Collections.EMPTY_LIST;
        this.E = list;
        this.F = list;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        int i7 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f18484i |= 1;
                            this.f18485v = eVar.k();
                        } else if (iN == 16) {
                            this.f18484i |= 2;
                            this.f18486w = eVar.k();
                        } else if (iN == 24) {
                            this.f18484i |= 4;
                            this.f18487x = eVar.l() != 0;
                        } else if (iN == 32) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                w0Var = w0.IN;
                            } else if (iK != 1) {
                                w0Var = iK != 2 ? null : w0Var2;
                            } else {
                                w0Var = w0.OUT;
                            }
                            if (w0Var == null) {
                                v1VarM.A(iN);
                                v1VarM.A(iK);
                            } else {
                                this.f18484i |= 8;
                                this.f18488y = w0Var;
                            }
                        } else if (iN == 42) {
                            if ((i7 & 16) != 16) {
                                this.E = new ArrayList();
                                i7 |= 16;
                            }
                            this.E.add(eVar.g(s0.R, gVar));
                        } else if (iN == 48) {
                            if ((i7 & 32) != 32) {
                                this.F = new ArrayList();
                                i7 |= 32;
                            }
                            this.F.add(Integer.valueOf(eVar.k()));
                        } else if (iN != 50) {
                            if (!n(eVar, v1VarM, gVar, iN)) {
                            }
                        } else {
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 32) != 32 && eVar.b() > 0) {
                                this.F = new ArrayList();
                                i7 |= 32;
                            }
                            while (eVar.b() > 0) {
                                this.F.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    if ((i7 & 16) == 16) {
                        this.E = Collections.unmodifiableList(this.E);
                    }
                    if ((i7 & 32) == 32) {
                        this.F = Collections.unmodifiableList(this.F);
                    }
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18483e = cVar.g();
                    }
                    m();
                    throw th2;
                }
            } catch (vp.q e10) {
                e10.f21916d = this;
                throw e10;
            } catch (IOException e11) {
                vp.q qVar = new vp.q(e11.getMessage());
                qVar.f21916d = this;
                throw qVar;
            }
        }
        if ((i7 & 16) == 16) {
            this.E = Collections.unmodifiableList(this.E);
        }
        if ((i7 & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18483e = cVar.g();
        }
        m();
    }
}
