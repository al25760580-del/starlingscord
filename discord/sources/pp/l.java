package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends vp.n {
    public static final a E = new a(4);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final l f18351y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18353e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18354i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public vp.t f18355v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f18356w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18357x;

    static {
        l lVar = new l();
        f18351y = lVar;
        lVar.f18354i = 0;
        lVar.f18355v = vp.d.f21871d;
    }

    public l() {
        this.f18356w = (byte) -1;
        this.f18357x = -1;
        this.f18352d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18356w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f18353e;
        if ((i7 & 1) != 1) {
            this.f18356w = (byte) 0;
            return false;
        }
        if ((i7 & 2) == 2) {
            this.f18356w = (byte) 1;
            return true;
        }
        this.f18356w = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18357x;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18353e & 1) == 1 ? v1.d(1, this.f18354i) : 0;
        if ((this.f18353e & 2) == 2) {
            vp.t tVar = this.f18355v;
            iD += tVar.size() + v1.h(tVar.size()) + v1.j(2);
        }
        int size = this.f18352d.size() + iD;
        this.f18357x = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        b bVar = new b(1);
        bVar.f18214w = vp.d.f21871d;
        return bVar;
    }

    @Override // vp.a
    public final vp.i e() {
        b bVar = new b(1);
        bVar.f18214w = vp.d.f21871d;
        bVar.j(this);
        return bVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18353e & 1) == 1) {
            v1Var.r(1, this.f18354i);
        }
        if ((this.f18353e & 2) == 2) {
            vp.t tVar = this.f18355v;
            v1Var.C(2, 2);
            v1Var.A(tVar.size());
            v1Var.w(tVar);
        }
        v1Var.w(this.f18352d);
    }

    public l(b bVar) {
        this.f18356w = (byte) -1;
        this.f18357x = -1;
        this.f18352d = bVar.f21889d;
    }

    public l(vp.e eVar) {
        this.f18356w = (byte) -1;
        this.f18357x = -1;
        boolean z5 = false;
        this.f18354i = 0;
        this.f18355v = vp.d.f21871d;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f18353e |= 1;
                                this.f18354i = eVar.k();
                            } else if (iN != 18) {
                                if (!eVar.q(iN, v1VarM)) {
                                }
                            } else {
                                this.f18353e |= 2;
                                this.f18355v = eVar.e();
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
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18352d = cVar.g();
                }
                throw th2;
            }
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18352d = cVar.g();
        }
    }
}
