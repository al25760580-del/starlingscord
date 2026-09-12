package sp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import vp.n;
import vp.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends n {
    public static final pp.a E = new pp.a(25);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final b f20428y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f20429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20430e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20431i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20432v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f20433w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20434x;

    static {
        b bVar = new b();
        f20428y = bVar;
        bVar.f20431i = 0;
        bVar.f20432v = 0;
    }

    public b() {
        this.f20433w = (byte) -1;
        this.f20434x = -1;
        this.f20429d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        if (this.f20433w == 1) {
            return true;
        }
        this.f20433w = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f20434x;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f20430e & 1) == 1 ? v1.d(1, this.f20431i) : 0;
        if ((this.f20430e & 2) == 2) {
            iD += v1.d(2, this.f20432v);
        }
        int size = this.f20429d.size() + iD;
        this.f20434x = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return new a(0);
    }

    @Override // vp.a
    public final vp.i e() {
        a aVar = new a(0);
        aVar.h(this);
        return aVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f20430e & 1) == 1) {
            v1Var.r(1, this.f20431i);
        }
        if ((this.f20430e & 2) == 2) {
            v1Var.r(2, this.f20432v);
        }
        v1Var.w(this.f20429d);
    }

    public b(a aVar) {
        this.f20433w = (byte) -1;
        this.f20434x = -1;
        this.f20429d = aVar.f21889d;
    }

    public b(vp.e eVar) {
        this.f20433w = (byte) -1;
        this.f20434x = -1;
        boolean z5 = false;
        this.f20431i = 0;
        this.f20432v = 0;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f20430e |= 1;
                            this.f20431i = eVar.k();
                        } else if (iN != 16) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            this.f20430e |= 2;
                            this.f20432v = eVar.k();
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f20429d = cVar.g();
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
            this.f20429d = cVar.g();
        }
    }
}
