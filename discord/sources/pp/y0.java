package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends vp.n {
    public static final a E = new a(21);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final y0 f18496y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18498e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f18499i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18500v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f18501w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18502x;

    static {
        y0 y0Var = new y0();
        f18496y = y0Var;
        y0Var.f18499i = Collections.EMPTY_LIST;
        y0Var.f18500v = -1;
    }

    public y0() {
        this.f18501w = (byte) -1;
        this.f18502x = -1;
        this.f18497d = vp.d.f21871d;
    }

    public static g i(y0 y0Var) {
        g gVarH = g.h();
        gVarH.k(y0Var);
        return gVarH;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18501w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f18499i.size(); i7++) {
            if (!((s0) this.f18499i.get(i7)).b()) {
                this.f18501w = (byte) 0;
                return false;
            }
        }
        this.f18501w = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18502x;
        if (i7 != -1) {
            return i7;
        }
        int iD = 0;
        for (int i10 = 0; i10 < this.f18499i.size(); i10++) {
            iD += v1.f(1, (vp.a) this.f18499i.get(i10));
        }
        if ((this.f18498e & 1) == 1) {
            iD += v1.d(2, this.f18500v);
        }
        int size = this.f18497d.size() + iD;
        this.f18502x = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return g.h();
    }

    @Override // vp.a
    public final vp.i e() {
        return i(this);
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f18499i.size(); i7++) {
            v1Var.t(1, (vp.a) this.f18499i.get(i7));
        }
        if ((this.f18498e & 1) == 1) {
            v1Var.r(2, this.f18500v);
        }
        v1Var.w(this.f18497d);
    }

    public final g j() {
        return i(this);
    }

    public y0(g gVar) {
        this.f18501w = (byte) -1;
        this.f18502x = -1;
        this.f18497d = gVar.f21889d;
    }

    public y0(vp.e eVar, vp.g gVar) {
        this.f18501w = (byte) -1;
        this.f18502x = -1;
        this.f18499i = Collections.EMPTY_LIST;
        this.f18500v = -1;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        boolean z6 = false;
        while (!z5) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 10) {
                                if (!z6) {
                                    this.f18499i = new ArrayList();
                                    z6 = true;
                                }
                                this.f18499i.add(eVar.g(s0.R, gVar));
                            } else if (iN != 16) {
                                if (!eVar.q(iN, v1VarM)) {
                                }
                            } else {
                                this.f18498e |= 1;
                                this.f18500v = eVar.k();
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
                if (z6) {
                    this.f18499i = Collections.unmodifiableList(this.f18499i);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18497d = cVar.g();
                }
                throw th2;
            }
        }
        if (z6) {
            this.f18499i = Collections.unmodifiableList(this.f18499i);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18497d = cVar.g();
        }
    }
}
