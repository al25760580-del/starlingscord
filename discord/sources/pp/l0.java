package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends vp.n {
    public static final l0 E;
    public static final a F = new a(15);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18359e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18360i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18361v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public k0 f18362w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte f18363x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18364y;

    static {
        l0 l0Var = new l0();
        E = l0Var;
        l0Var.f18360i = -1;
        l0Var.f18361v = 0;
        l0Var.f18362w = k0.PACKAGE;
    }

    public l0() {
        this.f18363x = (byte) -1;
        this.f18364y = -1;
        this.f18358d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18363x;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f18359e & 2) == 2) {
            this.f18363x = (byte) 1;
            return true;
        }
        this.f18363x = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18364y;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18359e & 1) == 1 ? v1.d(1, this.f18360i) : 0;
        if ((this.f18359e & 2) == 2) {
            iD += v1.d(2, this.f18361v);
        }
        if ((this.f18359e & 4) == 4) {
            iD += v1.c(3, this.f18362w.f18350d);
        }
        int size = this.f18358d.size() + iD;
        this.f18364y = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return j0.g();
    }

    @Override // vp.a
    public final vp.i e() {
        j0 j0VarG = j0.g();
        j0VarG.h(this);
        return j0VarG;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18359e & 1) == 1) {
            v1Var.r(1, this.f18360i);
        }
        if ((this.f18359e & 2) == 2) {
            v1Var.r(2, this.f18361v);
        }
        if ((this.f18359e & 4) == 4) {
            v1Var.q(3, this.f18362w.f18350d);
        }
        v1Var.w(this.f18358d);
    }

    public l0(j0 j0Var) {
        this.f18363x = (byte) -1;
        this.f18364y = -1;
        this.f18358d = j0Var.f21889d;
    }

    public l0(vp.e eVar) {
        k0 k0Var;
        this.f18363x = (byte) -1;
        this.f18364y = -1;
        this.f18360i = -1;
        boolean z5 = false;
        this.f18361v = 0;
        k0 k0Var2 = k0.PACKAGE;
        this.f18362w = k0Var2;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f18359e |= 1;
                            this.f18360i = eVar.k();
                        } else if (iN == 16) {
                            this.f18359e |= 2;
                            this.f18361v = eVar.k();
                        } else if (iN != 24) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            int iK = eVar.k();
                            if (iK == 0) {
                                k0Var = k0.CLASS;
                            } else if (iK != 1) {
                                k0Var = iK != 2 ? null : k0.LOCAL;
                            } else {
                                k0Var = k0Var2;
                            }
                            if (k0Var == null) {
                                v1VarM.A(iN);
                                v1VarM.A(iK);
                            } else {
                                this.f18359e |= 4;
                                this.f18362w = k0Var;
                            }
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
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18358d = cVar.g();
                }
                throw th2;
            }
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18358d = cVar.g();
        }
    }
}
