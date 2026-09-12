package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends vp.k {
    public static final n G;
    public static final a H = new a(5);
    public byte E;
    public int F;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vp.d f18375e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18376i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public List f18378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f18379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f18380y;

    static {
        n nVar = new n();
        G = nVar;
        nVar.f18377v = 6;
        List list = Collections.EMPTY_LIST;
        nVar.f18378w = list;
        nVar.f18379x = list;
        nVar.f18380y = list;
    }

    public n(m mVar) {
        super(mVar);
        this.E = (byte) -1;
        this.F = -1;
        this.f18375e = mVar.f21889d;
    }

    @Override // vp.u
    public final vp.a a() {
        return G;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f18378w.size(); i7++) {
            if (!((a1) this.f18378w.get(i7)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        for (int i10 = 0; i10 < this.f18380y.size(); i10++) {
            if (!((l) this.f18380y.get(i10)).b()) {
                this.E = (byte) 0;
                return false;
            }
        }
        if (i()) {
            this.E = (byte) 1;
            return true;
        }
        this.E = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.F;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18376i & 1) == 1 ? v1.d(1, this.f18377v) : 0;
        for (int i10 = 0; i10 < this.f18378w.size(); i10++) {
            iD += v1.f(2, (vp.a) this.f18378w.get(i10));
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f18379x.size(); i11++) {
            iE += v1.e(((Integer) this.f18379x.get(i11)).intValue());
        }
        int size = (this.f18379x.size() * 2) + iD + iE;
        for (int i12 = 0; i12 < this.f18380y.size(); i12++) {
            size += v1.f(32, (vp.a) this.f18380y.get(i12));
        }
        int size2 = this.f18375e.size() + j() + size;
        this.F = size2;
        return size2;
    }

    @Override // vp.a
    public final vp.i d() {
        return m.h();
    }

    @Override // vp.a
    public final vp.i e() {
        m mVarH = m.h();
        mVarH.j(this);
        return mVarH;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        e4.c cVar = new e4.c(this);
        if ((this.f18376i & 1) == 1) {
            v1Var.r(1, this.f18377v);
        }
        for (int i7 = 0; i7 < this.f18378w.size(); i7++) {
            v1Var.t(2, (vp.a) this.f18378w.get(i7));
        }
        for (int i10 = 0; i10 < this.f18379x.size(); i10++) {
            v1Var.r(31, ((Integer) this.f18379x.get(i10)).intValue());
        }
        for (int i11 = 0; i11 < this.f18380y.size(); i11++) {
            v1Var.t(32, (vp.a) this.f18380y.get(i11));
        }
        cVar.W(19000, v1Var);
        v1Var.w(this.f18375e);
    }

    public n() {
        this.E = (byte) -1;
        this.F = -1;
        this.f18375e = vp.d.f21871d;
    }

    public n(vp.e eVar, vp.g gVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.f18377v = 6;
        List list = Collections.EMPTY_LIST;
        this.f18378w = list;
        this.f18379x = list;
        this.f18380y = list;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        int i7 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f18376i |= 1;
                            this.f18377v = eVar.k();
                        } else if (iN == 18) {
                            if ((i7 & 2) != 2) {
                                this.f18378w = new ArrayList();
                                i7 |= 2;
                            }
                            this.f18378w.add(eVar.g(a1.J, gVar));
                        } else if (iN == 248) {
                            if ((i7 & 4) != 4) {
                                this.f18379x = new ArrayList();
                                i7 |= 4;
                            }
                            this.f18379x.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 250) {
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 4) != 4 && eVar.b() > 0) {
                                this.f18379x = new ArrayList();
                                i7 |= 4;
                            }
                            while (eVar.b() > 0) {
                                this.f18379x.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                        } else if (iN != 258) {
                            if (!n(eVar, v1VarM, gVar, iN)) {
                            }
                        } else {
                            if ((i7 & 8) != 8) {
                                this.f18380y = new ArrayList();
                                i7 |= 8;
                            }
                            this.f18380y.add(eVar.g(l.E, gVar));
                        }
                    }
                    z5 = true;
                } catch (vp.q e10) {
                    e10.f21916d = this;
                    throw e10;
                } catch (IOException e11) {
                    vp.q qVar = new vp.q(e11.getMessage());
                    qVar.f21916d = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                if ((i7 & 2) == 2) {
                    this.f18378w = Collections.unmodifiableList(this.f18378w);
                }
                if ((i7 & 4) == 4) {
                    this.f18379x = Collections.unmodifiableList(this.f18379x);
                }
                if ((i7 & 8) == 8) {
                    this.f18380y = Collections.unmodifiableList(this.f18380y);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18375e = cVar.g();
                }
                m();
                throw th2;
            }
        }
        if ((i7 & 2) == 2) {
            this.f18378w = Collections.unmodifiableList(this.f18378w);
        }
        if ((i7 & 4) == 4) {
            this.f18379x = Collections.unmodifiableList(this.f18379x);
        }
        if ((i7 & 8) == 8) {
            this.f18380y = Collections.unmodifiableList(this.f18380y);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18375e = cVar.g();
        }
        m();
    }
}
