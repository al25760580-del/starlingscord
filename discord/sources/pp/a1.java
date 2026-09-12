package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends vp.k {
    public static final a1 I;
    public static final a J = new a(22);
    public s0 E;
    public int F;
    public byte G;
    public int H;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18205e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18206i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18207v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18208w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s0 f18209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18210y;

    static {
        a1 a1Var = new a1();
        I = a1Var;
        a1Var.f18207v = 0;
        a1Var.f18208w = 0;
        s0 s0Var = s0.Q;
        a1Var.f18209x = s0Var;
        a1Var.f18210y = 0;
        a1Var.E = s0Var;
        a1Var.F = 0;
    }

    public a1(z0 z0Var) {
        super(z0Var);
        this.G = (byte) -1;
        this.H = -1;
        this.f18205e = z0Var.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return I;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.G;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f18206i;
        if ((i7 & 2) != 2) {
            this.G = (byte) 0;
            return false;
        }
        if ((i7 & 4) == 4 && !this.f18209x.b()) {
            this.G = (byte) 0;
            return false;
        }
        if ((this.f18206i & 16) == 16 && !this.E.b()) {
            this.G = (byte) 0;
            return false;
        }
        if (i()) {
            this.G = (byte) 1;
            return true;
        }
        this.G = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.H;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18206i & 1) == 1 ? v1.d(1, this.f18207v) : 0;
        if ((this.f18206i & 2) == 2) {
            iD += v1.d(2, this.f18208w);
        }
        if ((this.f18206i & 4) == 4) {
            iD += v1.f(3, this.f18209x);
        }
        if ((this.f18206i & 16) == 16) {
            iD += v1.f(4, this.E);
        }
        if ((this.f18206i & 8) == 8) {
            iD += v1.d(5, this.f18210y);
        }
        if ((this.f18206i & 32) == 32) {
            iD += v1.d(6, this.F);
        }
        int size = this.f18205e.size() + j() + iD;
        this.H = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        z0 z0Var = new z0();
        s0 s0Var = s0.Q;
        z0Var.f18510y = s0Var;
        z0Var.F = s0Var;
        return z0Var;
    }

    @Override // vp.a
    public final vp.i e() {
        z0 z0Var = new z0();
        s0 s0Var = s0.Q;
        z0Var.f18510y = s0Var;
        z0Var.F = s0Var;
        z0Var.h(this);
        return z0Var;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18206i & 1) == 1) {
            v1Var.r(1, this.f18207v);
        }
        if ((this.f18206i & 2) == 2) {
            v1Var.r(2, this.f18208w);
        }
        if ((this.f18206i & 4) == 4) {
            v1Var.t(3, this.f18209x);
        }
        if ((this.f18206i & 16) == 16) {
            v1Var.t(4, this.E);
        }
        if ((this.f18206i & 8) == 8) {
            v1Var.r(5, this.f18210y);
        }
        if ((this.f18206i & 32) == 32) {
            v1Var.r(6, this.F);
        }
        cVar.W(androidx.recyclerview.widget.h0.DEFAULT_DRAG_ANIMATION_DURATION, v1Var);
        v1Var.w(this.f18205e);
    }

    public a1() {
        this.G = (byte) -1;
        this.H = -1;
        this.f18205e = vp.d.f21871d;
    }

    public a1(vp.e eVar, vp.g gVar) {
        this.G = (byte) -1;
        this.H = -1;
        boolean z5 = false;
        this.f18207v = 0;
        this.f18208w = 0;
        s0 s0Var = s0.Q;
        this.f18209x = s0Var;
        this.f18210y = 0;
        this.E = s0Var;
        this.F = 0;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f18206i |= 1;
                            this.f18207v = eVar.k();
                        } else if (iN != 16) {
                            r0 r0VarQ = null;
                            if (iN == 26) {
                                if ((this.f18206i & 4) == 4) {
                                    s0 s0Var2 = this.f18209x;
                                    s0Var2.getClass();
                                    r0VarQ = s0.q(s0Var2);
                                }
                                s0 s0Var3 = (s0) eVar.g(s0.R, gVar);
                                this.f18209x = s0Var3;
                                if (r0VarQ != null) {
                                    r0VarQ.j(s0Var3);
                                    this.f18209x = r0VarQ.g();
                                }
                                this.f18206i |= 4;
                            } else if (iN == 34) {
                                if ((this.f18206i & 16) == 16) {
                                    s0 s0Var4 = this.E;
                                    s0Var4.getClass();
                                    r0VarQ = s0.q(s0Var4);
                                }
                                s0 s0Var5 = (s0) eVar.g(s0.R, gVar);
                                this.E = s0Var5;
                                if (r0VarQ != null) {
                                    r0VarQ.j(s0Var5);
                                    this.E = r0VarQ.g();
                                }
                                this.f18206i |= 16;
                            } else if (iN == 40) {
                                this.f18206i |= 8;
                                this.f18210y = eVar.k();
                            } else if (iN != 48) {
                                if (!n(eVar, v1VarM, gVar, iN)) {
                                }
                            } else {
                                this.f18206i |= 32;
                                this.F = eVar.k();
                            }
                        } else {
                            this.f18206i |= 2;
                            this.f18208w = eVar.k();
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18205e = cVar.g();
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
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18205e = cVar.g();
        }
        m();
    }
}
