package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends vp.n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final p f18394w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f18395x = new a(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f18397e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public byte f18398i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18399v;

    static {
        p pVar = new p();
        f18394w = pVar;
        pVar.f18397e = Collections.EMPTY_LIST;
    }

    public p() {
        this.f18398i = (byte) -1;
        this.f18399v = -1;
        this.f18396d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18398i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f18397e.size(); i7++) {
            if (!((t) this.f18397e.get(i7)).b()) {
                this.f18398i = (byte) 0;
                return false;
            }
        }
        this.f18398i = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18399v;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f18397e.size(); i10++) {
            iF += v1.f(1, (vp.a) this.f18397e.get(i10));
        }
        int size = this.f18396d.size() + iF;
        this.f18399v = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        o oVar = new o(0);
        oVar.f18389v = Collections.EMPTY_LIST;
        return oVar;
    }

    @Override // vp.a
    public final vp.i e() {
        o oVar = new o(0);
        oVar.f18389v = Collections.EMPTY_LIST;
        oVar.k(this);
        return oVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f18397e.size(); i7++) {
            v1Var.t(1, (vp.a) this.f18397e.get(i7));
        }
        v1Var.w(this.f18396d);
    }

    public p(o oVar) {
        this.f18398i = (byte) -1;
        this.f18399v = -1;
        this.f18396d = oVar.f21889d;
    }

    public p(vp.e eVar, vp.g gVar) {
        this.f18398i = (byte) -1;
        this.f18399v = -1;
        this.f18397e = Collections.EMPTY_LIST;
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
                                this.f18397e = new ArrayList();
                                z6 = true;
                            }
                            this.f18397e.add(eVar.g(t.G, gVar));
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    if (z6) {
                        this.f18397e = Collections.unmodifiableList(this.f18397e);
                    }
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f18396d = cVar.g();
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
            this.f18397e = Collections.unmodifiableList(this.f18397e);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18396d = cVar.g();
        }
    }
}
