package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends vp.n {
    public static final a E = new a(0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final h f18301y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18303e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18304i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f18305v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f18306w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18307x;

    static {
        h hVar = new h();
        f18301y = hVar;
        hVar.f18304i = 0;
        hVar.f18305v = Collections.EMPTY_LIST;
    }

    public h() {
        this.f18306w = (byte) -1;
        this.f18307x = -1;
        this.f18302d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18306w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if ((this.f18303e & 1) != 1) {
            this.f18306w = (byte) 0;
            return false;
        }
        for (int i7 = 0; i7 < this.f18305v.size(); i7++) {
            if (!((f) this.f18305v.get(i7)).b()) {
                this.f18306w = (byte) 0;
                return false;
            }
        }
        this.f18306w = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18307x;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18303e & 1) == 1 ? v1.d(1, this.f18304i) : 0;
        for (int i10 = 0; i10 < this.f18305v.size(); i10++) {
            iD += v1.f(2, (vp.a) this.f18305v.get(i10));
        }
        int size = this.f18302d.size() + iD;
        this.f18307x = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        g gVar = new g(0);
        gVar.f18291v = Collections.EMPTY_LIST;
        return gVar;
    }

    @Override // vp.a
    public final vp.i e() {
        g gVar = new g(0);
        gVar.f18291v = Collections.EMPTY_LIST;
        gVar.j(this);
        return gVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18303e & 1) == 1) {
            v1Var.r(1, this.f18304i);
        }
        for (int i7 = 0; i7 < this.f18305v.size(); i7++) {
            v1Var.t(2, (vp.a) this.f18305v.get(i7));
        }
        v1Var.w(this.f18302d);
    }

    public h(g gVar) {
        this.f18306w = (byte) -1;
        this.f18307x = -1;
        this.f18302d = gVar.f21889d;
    }

    public h(vp.e eVar, vp.g gVar) {
        this.f18306w = (byte) -1;
        this.f18307x = -1;
        boolean z5 = false;
        this.f18304i = 0;
        this.f18305v = Collections.EMPTY_LIST;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        char c8 = 0;
        while (!z5) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f18303e |= 1;
                                this.f18304i = eVar.k();
                            } else if (iN != 18) {
                                if (!eVar.q(iN, v1VarM)) {
                                }
                            } else {
                                if ((c8 & 2) != 2) {
                                    this.f18305v = new ArrayList();
                                    c8 = 2;
                                }
                                this.f18305v.add(eVar.g(f.E, gVar));
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
                if ((c8 & 2) == 2) {
                    this.f18305v = Collections.unmodifiableList(this.f18305v);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18302d = cVar.g();
                }
                throw th2;
            }
        }
        if ((c8 & 2) == 2) {
            this.f18305v = Collections.unmodifiableList(this.f18305v);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18302d = cVar.g();
        }
    }
}
