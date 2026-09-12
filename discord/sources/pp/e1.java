package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends vp.n {
    public static final e1 H;
    public static final a I = new a(23);
    public d1 E;
    public byte F;
    public int G;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18266e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18267i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18268v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c1 f18269w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18270x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18271y;

    static {
        e1 e1Var = new e1();
        H = e1Var;
        e1Var.f18267i = 0;
        e1Var.f18268v = 0;
        e1Var.f18269w = c1.ERROR;
        e1Var.f18270x = 0;
        e1Var.f18271y = 0;
        e1Var.E = d1.LANGUAGE_VERSION;
    }

    public e1() {
        this.F = (byte) -1;
        this.G = -1;
        this.f18265d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        if (this.F == 1) {
            return true;
        }
        this.F = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.G;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18266e & 1) == 1 ? v1.d(1, this.f18267i) : 0;
        if ((this.f18266e & 2) == 2) {
            iD += v1.d(2, this.f18268v);
        }
        if ((this.f18266e & 4) == 4) {
            iD += v1.c(3, this.f18269w.f18235d);
        }
        if ((this.f18266e & 8) == 8) {
            iD += v1.d(4, this.f18270x);
        }
        if ((this.f18266e & 16) == 16) {
            iD += v1.d(5, this.f18271y);
        }
        if ((this.f18266e & 32) == 32) {
            iD += v1.c(6, this.E.f18251d);
        }
        int size = this.f18265d.size() + iD;
        this.G = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return b1.g();
    }

    @Override // vp.a
    public final vp.i e() {
        b1 b1VarG = b1.g();
        b1VarG.h(this);
        return b1VarG;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18266e & 1) == 1) {
            v1Var.r(1, this.f18267i);
        }
        if ((this.f18266e & 2) == 2) {
            v1Var.r(2, this.f18268v);
        }
        if ((this.f18266e & 4) == 4) {
            v1Var.q(3, this.f18269w.f18235d);
        }
        if ((this.f18266e & 8) == 8) {
            v1Var.r(4, this.f18270x);
        }
        if ((this.f18266e & 16) == 16) {
            v1Var.r(5, this.f18271y);
        }
        if ((this.f18266e & 32) == 32) {
            v1Var.q(6, this.E.f18251d);
        }
        v1Var.w(this.f18265d);
    }

    public e1(b1 b1Var) {
        this.F = (byte) -1;
        this.G = -1;
        this.f18265d = b1Var.f21889d;
    }

    public e1(vp.e eVar) {
        this.F = (byte) -1;
        this.G = -1;
        boolean z5 = false;
        this.f18267i = 0;
        this.f18268v = 0;
        c1 c1Var = c1.ERROR;
        this.f18269w = c1Var;
        this.f18270x = 0;
        this.f18271y = 0;
        d1 d1Var = d1.LANGUAGE_VERSION;
        this.E = d1Var;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f18266e |= 1;
                            this.f18267i = eVar.k();
                        } else if (iN != 16) {
                            d1 d1Var2 = null;
                            c1 c1Var2 = null;
                            if (iN == 24) {
                                int iK = eVar.k();
                                if (iK == 0) {
                                    c1Var2 = c1.WARNING;
                                } else if (iK == 1) {
                                    c1Var2 = c1Var;
                                } else if (iK == 2) {
                                    c1Var2 = c1.HIDDEN;
                                }
                                if (c1Var2 == null) {
                                    v1VarM.A(iN);
                                    v1VarM.A(iK);
                                } else {
                                    this.f18266e |= 4;
                                    this.f18269w = c1Var2;
                                }
                            } else if (iN == 32) {
                                this.f18266e |= 8;
                                this.f18270x = eVar.k();
                            } else if (iN == 40) {
                                this.f18266e |= 16;
                                this.f18271y = eVar.k();
                            } else if (iN != 48) {
                                if (!eVar.q(iN, v1VarM)) {
                                }
                            } else {
                                int iK2 = eVar.k();
                                if (iK2 == 0) {
                                    d1Var2 = d1Var;
                                } else if (iK2 == 1) {
                                    d1Var2 = d1.COMPILER_VERSION;
                                } else if (iK2 == 2) {
                                    d1Var2 = d1.API_VERSION;
                                }
                                if (d1Var2 == null) {
                                    v1VarM.A(iN);
                                    v1VarM.A(iK2);
                                } else {
                                    this.f18266e |= 32;
                                    this.E = d1Var2;
                                }
                            }
                        } else {
                            this.f18266e |= 2;
                            this.f18268v = eVar.k();
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18265d = cVar.g();
                    }
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
            this.f18265d = cVar.g();
        }
    }
}
