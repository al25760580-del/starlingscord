package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends vp.n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final m0 f18369w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f18370x = new a(14);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f18372e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f18373i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18374v;

    static {
        m0 m0Var = new m0();
        f18369w = m0Var;
        m0Var.f18372e = Collections.EMPTY_LIST;
    }

    public m0() {
        this.f18373i = (byte) -1;
        this.f18374v = -1;
        this.f18371d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18373i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f18372e.size(); i7++) {
            if (!((l0) this.f18372e.get(i7)).b()) {
                this.f18373i = (byte) 0;
                return false;
            }
        }
        this.f18373i = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18374v;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f18372e.size(); i10++) {
            iF += v1.f(1, (vp.a) this.f18372e.get(i10));
        }
        int size = this.f18371d.size() + iF;
        this.f18374v = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        o oVar = new o(1);
        oVar.f18389v = Collections.EMPTY_LIST;
        return oVar;
    }

    @Override // vp.a
    public final vp.i e() {
        o oVar = new o(1);
        oVar.f18389v = Collections.EMPTY_LIST;
        oVar.l(this);
        return oVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f18372e.size(); i7++) {
            v1Var.t(1, (vp.a) this.f18372e.get(i7));
        }
        v1Var.w(this.f18371d);
    }

    public m0(o oVar) {
        this.f18373i = (byte) -1;
        this.f18374v = -1;
        this.f18371d = oVar.f21889d;
    }

    public m0(vp.e eVar, vp.g gVar) {
        this.f18373i = (byte) -1;
        this.f18374v = -1;
        this.f18372e = Collections.EMPTY_LIST;
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
                            if (!z6) {
                                this.f18372e = new ArrayList();
                                z6 = true;
                            }
                            this.f18372e.add(eVar.g(l0.F, gVar));
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    if (z6) {
                        this.f18372e = Collections.unmodifiableList(this.f18372e);
                    }
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18371d = cVar.g();
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
            this.f18372e = Collections.unmodifiableList(this.f18372e);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18371d = cVar.g();
        }
    }
}
