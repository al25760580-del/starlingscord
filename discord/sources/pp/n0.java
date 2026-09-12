package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends vp.n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final n0 f18381w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f18382x = new a(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public vp.s f18384e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f18385i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18386v;

    static {
        n0 n0Var = new n0();
        f18381w = n0Var;
        n0Var.f18384e = vp.r.f21917e;
    }

    public n0() {
        this.f18385i = (byte) -1;
        this.f18386v = -1;
        this.f18383d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        if (this.f18385i == 1) {
            return true;
        }
        this.f18385i = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18386v;
        if (i7 != -1) {
            return i7;
        }
        int size = 0;
        for (int i10 = 0; i10 < this.f18384e.size(); i10++) {
            vp.d dVarO = this.f18384e.O(i10);
            size += dVarO.size() + v1.h(dVarO.size());
        }
        int size2 = this.f18383d.size() + this.f18384e.size() + size;
        this.f18386v = size2;
        return size2;
    }

    @Override // vp.a
    public final vp.i d() {
        o oVar = new o(3);
        oVar.f18389v = vp.r.f21917e;
        return oVar;
    }

    @Override // vp.a
    public final vp.i e() {
        o oVar = new o(3);
        oVar.f18389v = vp.r.f21917e;
        oVar.m(this);
        return oVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f18384e.size(); i7++) {
            vp.d dVarO = this.f18384e.O(i7);
            v1Var.C(1, 2);
            v1Var.A(dVarO.size());
            v1Var.w(dVarO);
        }
        v1Var.w(this.f18383d);
    }

    public n0(o oVar) {
        this.f18385i = (byte) -1;
        this.f18386v = -1;
        this.f18383d = oVar.f21889d;
    }

    public n0(vp.e eVar) {
        this.f18385i = (byte) -1;
        this.f18386v = -1;
        this.f18384e = vp.r.f21917e;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        boolean z6 = false;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            vp.t tVarE = eVar.e();
                            if (!z6) {
                                this.f18384e = new vp.r();
                                z6 = true;
                            }
                            this.f18384e.T(tVarE);
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    if (z6) {
                        this.f18384e = this.f18384e.f();
                    }
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18383d = cVar.g();
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
        if (z6) {
            this.f18384e = this.f18384e.f();
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18383d = cVar.g();
        }
    }
}
