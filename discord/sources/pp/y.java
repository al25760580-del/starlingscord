package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends vp.n {
    public static final y I;
    public static final a J = new a(9);
    public List E;
    public List F;
    public byte G;
    public int H;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18490e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18491i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18492v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x f18493w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s0 f18494x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18495y;

    static {
        y yVar = new y();
        I = yVar;
        yVar.f18491i = 0;
        yVar.f18492v = 0;
        yVar.f18493w = x.TRUE;
        yVar.f18494x = s0.Q;
        yVar.f18495y = 0;
        List list = Collections.EMPTY_LIST;
        yVar.E = list;
        yVar.F = list;
    }

    public y() {
        this.G = (byte) -1;
        this.H = -1;
        this.f18489d = vp.d.f21871d;
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
        if ((this.f18490e & 8) == 8 && !this.f18494x.b()) {
            this.G = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.E.size(); i7++) {
            if (!((y) this.E.get(i7)).b()) {
                this.G = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            if (!((y) this.F.get(i10)).b()) {
                this.G = (byte) 0;
                return false;
            }
        }
        this.G = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.H;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18490e & 1) == 1 ? v1.d(1, this.f18491i) : 0;
        if ((this.f18490e & 2) == 2) {
            iD += v1.d(2, this.f18492v);
        }
        if ((this.f18490e & 4) == 4) {
            iD += v1.c(3, this.f18493w.f18482d);
        }
        if ((this.f18490e & 8) == 8) {
            iD += v1.f(4, this.f18494x);
        }
        if ((this.f18490e & 16) == 16) {
            iD += v1.d(5, this.f18495y);
        }
        for (int i10 = 0; i10 < this.E.size(); i10++) {
            iD += v1.f(6, (vp.a) this.E.get(i10));
        }
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            iD += v1.f(7, (vp.a) this.F.get(i11));
        }
        int size = this.f18489d.size() + iD;
        this.H = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return w.g();
    }

    @Override // vp.a
    public final vp.i e() {
        w wVarG = w.g();
        wVarG.h(this);
        return wVarG;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18490e & 1) == 1) {
            v1Var.r(1, this.f18491i);
        }
        if ((this.f18490e & 2) == 2) {
            v1Var.r(2, this.f18492v);
        }
        if ((this.f18490e & 4) == 4) {
            v1Var.q(3, this.f18493w.f18482d);
        }
        if ((this.f18490e & 8) == 8) {
            v1Var.t(4, this.f18494x);
        }
        if ((this.f18490e & 16) == 16) {
            v1Var.r(5, this.f18495y);
        }
        for (int i7 = 0; i7 < this.E.size(); i7++) {
            v1Var.t(6, (vp.a) this.E.get(i7));
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            v1Var.t(7, (vp.a) this.F.get(i10));
        }
        v1Var.w(this.f18489d);
    }

    public y(w wVar) {
        this.G = (byte) -1;
        this.H = -1;
        this.f18489d = wVar.f21889d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y(vp.e eVar, vp.g gVar) {
        x xVar;
        this.G = (byte) -1;
        this.H = -1;
        boolean z5 = false;
        this.f18491i = 0;
        this.f18492v = 0;
        x xVar2 = x.TRUE;
        this.f18493w = xVar2;
        this.f18494x = s0.Q;
        this.f18495y = 0;
        List list = Collections.EMPTY_LIST;
        this.E = list;
        this.F = list;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        int i7 = 0;
        while (!z5) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f18490e |= 1;
                                this.f18491i = eVar.k();
                            } else if (iN != 16) {
                                Object objQ = null;
                                if (iN == 24) {
                                    int iK = eVar.k();
                                    if (iK != 0) {
                                        if (iK == 1) {
                                            objQ = x.FALSE;
                                        } else if (iK == 2) {
                                            objQ = x.NULL;
                                        }
                                        xVar = objQ;
                                    } else {
                                        xVar = xVar2;
                                    }
                                    if (xVar == 0) {
                                        v1VarM.A(iN);
                                        v1VarM.A(iK);
                                    } else {
                                        this.f18490e |= 4;
                                        this.f18493w = xVar;
                                    }
                                } else if (iN == 34) {
                                    if ((this.f18490e & 8) == 8) {
                                        s0 s0Var = this.f18494x;
                                        s0Var.getClass();
                                        objQ = s0.q(s0Var);
                                    }
                                    r0 r0Var = objQ;
                                    s0 s0Var2 = (s0) eVar.g(s0.R, gVar);
                                    this.f18494x = s0Var2;
                                    if (r0Var != 0) {
                                        r0Var.j(s0Var2);
                                        this.f18494x = r0Var.g();
                                    }
                                    this.f18490e |= 8;
                                } else if (iN != 40) {
                                    a aVar = J;
                                    if (iN == 50) {
                                        if ((i7 & 32) != 32) {
                                            this.E = new ArrayList();
                                            i7 |= 32;
                                        }
                                        this.E.add(eVar.g(aVar, gVar));
                                    } else if (iN != 58) {
                                        if (!eVar.q(iN, v1VarM)) {
                                        }
                                    } else {
                                        if ((i7 & 64) != 64) {
                                            this.F = new ArrayList();
                                            i7 |= 64;
                                        }
                                        this.F.add(eVar.g(aVar, gVar));
                                    }
                                } else {
                                    this.f18490e |= 16;
                                    this.f18495y = eVar.k();
                                }
                            } else {
                                this.f18490e |= 2;
                                this.f18492v = eVar.k();
                            }
                        }
                        z5 = true;
                    } catch (IOException e10) {
                        vp.q qVar = new vp.q(e10.getMessage());
                        qVar.f21916d = this;
                        throw qVar;
                    }
                } catch (vp.q e11) {
                    e11.f21916d = this;
                    throw e11;
                }
            } catch (Throwable th2) {
                if ((i7 & 32) == 32) {
                    this.E = Collections.unmodifiableList(this.E);
                }
                if ((i7 & 64) == 64) {
                    this.F = Collections.unmodifiableList(this.F);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18489d = cVar.g();
                }
                throw th2;
            }
        }
        if ((i7 & 32) == 32) {
            this.E = Collections.unmodifiableList(this.E);
        }
        if ((i7 & 64) == 64) {
            this.F = Collections.unmodifiableList(this.F);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18489d = cVar.g();
        }
    }
}
