package sp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import vp.n;
import vp.q;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends n {
    public static final pp.a E = new pp.a(26);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f20435y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f20436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20437e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20438i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20439v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f20440w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20441x;

    static {
        c cVar = new c();
        f20435y = cVar;
        cVar.f20438i = 0;
        cVar.f20439v = 0;
    }

    public c() {
        this.f20440w = (byte) -1;
        this.f20441x = -1;
        this.f20436d = vp.d.f21871d;
    }

    public static a i(c cVar) {
        a aVar = new a(1);
        aVar.j(cVar);
        return aVar;
    }

    @Override // vp.u
    public final boolean b() {
        if (this.f20440w == 1) {
            return true;
        }
        this.f20440w = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f20441x;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f20437e & 1) == 1 ? v1.d(1, this.f20438i) : 0;
        if ((this.f20437e & 2) == 2) {
            iD += v1.d(2, this.f20439v);
        }
        int size = this.f20436d.size() + iD;
        this.f20441x = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return new a(1);
    }

    @Override // vp.a
    public final vp.i e() {
        return i(this);
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f20437e & 1) == 1) {
            v1Var.r(1, this.f20438i);
        }
        if ((this.f20437e & 2) == 2) {
            v1Var.r(2, this.f20439v);
        }
        v1Var.w(this.f20436d);
    }

    public c(a aVar) {
        this.f20440w = (byte) -1;
        this.f20441x = -1;
        this.f20436d = aVar.f21889d;
    }

    public c(vp.e eVar) {
        this.f20440w = (byte) -1;
        this.f20441x = -1;
        boolean z5 = false;
        this.f20438i = 0;
        this.f20439v = 0;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f20437e |= 1;
                            this.f20438i = eVar.k();
                        } else if (iN != 16) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            this.f20437e |= 2;
                            this.f20439v = eVar.k();
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f20436d = cVar.g();
                    }
                    throw th2;
                }
            } catch (q e10) {
                e10.f21916d = this;
                throw e10;
            } catch (IOException e11) {
                q qVar = new q(e11.getMessage());
                qVar.f21916d = this;
                throw qVar;
            }
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f20436d = cVar.g();
        }
    }
}
