package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends vp.n {
    public static final q0 E;
    public static final a F = new a(18);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18412e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p0 f18413i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public s0 f18414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public byte f18416x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18417y;

    static {
        q0 q0Var = new q0();
        E = q0Var;
        q0Var.f18413i = p0.INV;
        q0Var.f18414v = s0.Q;
        q0Var.f18415w = 0;
    }

    public q0() {
        this.f18416x = (byte) -1;
        this.f18417y = -1;
        this.f18411d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18416x;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f18412e & 2) != 2 || this.f18414v.b()) {
            this.f18416x = (byte) 1;
            return true;
        }
        this.f18416x = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18417y;
        if (i7 != -1) {
            return i7;
        }
        int iC = (this.f18412e & 1) == 1 ? v1.c(1, this.f18413i.f18405d) : 0;
        if ((this.f18412e & 2) == 2) {
            iC += v1.f(2, this.f18414v);
        }
        if ((this.f18412e & 4) == 4) {
            iC += v1.d(3, this.f18415w);
        }
        int size = this.f18411d.size() + iC;
        this.f18417y = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return o0.g();
    }

    @Override // vp.a
    public final vp.i e() {
        o0 o0VarG = o0.g();
        o0VarG.h(this);
        return o0VarG;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18412e & 1) == 1) {
            v1Var.q(1, this.f18413i.f18405d);
        }
        if ((this.f18412e & 2) == 2) {
            v1Var.t(2, this.f18414v);
        }
        if ((this.f18412e & 4) == 4) {
            v1Var.r(3, this.f18415w);
        }
        v1Var.w(this.f18411d);
    }

    public q0(o0 o0Var) {
        this.f18416x = (byte) -1;
        this.f18417y = -1;
        this.f18411d = o0Var.f21889d;
    }

    public q0(vp.e eVar, vp.g gVar) {
        this.f18416x = (byte) -1;
        this.f18417y = -1;
        p0 p0Var = p0.INV;
        this.f18413i = p0Var;
        this.f18414v = s0.Q;
        boolean z5 = false;
        this.f18415w = 0;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        r0 r0VarQ = null;
                        p0 p0Var2 = null;
                        if (iN == 8) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                p0Var2 = p0.IN;
                            } else if (iK == 1) {
                                p0Var2 = p0.OUT;
                            } else if (iK == 2) {
                                p0Var2 = p0Var;
                            } else if (iK == 3) {
                                p0Var2 = p0.STAR;
                            }
                            if (p0Var2 == null) {
                                v1VarM.A(iN);
                                v1VarM.A(iK);
                            } else {
                                this.f18412e |= 1;
                                this.f18413i = p0Var2;
                            }
                        } else if (iN == 18) {
                            if ((this.f18412e & 2) == 2) {
                                s0 s0Var = this.f18414v;
                                s0Var.getClass();
                                r0VarQ = s0.q(s0Var);
                            }
                            s0 s0Var2 = (s0) eVar.g(s0.R, gVar);
                            this.f18414v = s0Var2;
                            if (r0VarQ != null) {
                                r0VarQ.j(s0Var2);
                                this.f18414v = r0VarQ.g();
                            }
                            this.f18412e |= 2;
                        } else if (iN != 24) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            this.f18412e |= 4;
                            this.f18415w = eVar.k();
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18411d = cVar.g();
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
            this.f18411d = cVar.g();
        }
    }
}
