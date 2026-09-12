package sp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vp.n;
import vp.q;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends n {
    public static final pp.a E = new pp.a(28);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final j f20476y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f20477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f20478e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f20479i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20480v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f20481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20482x;

    static {
        j jVar = new j();
        f20476y = jVar;
        List list = Collections.EMPTY_LIST;
        jVar.f20478e = list;
        jVar.f20479i = list;
    }

    public j() {
        this.f20480v = -1;
        this.f20481w = (byte) -1;
        this.f20482x = -1;
        this.f20477d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        if (this.f20481w == 1) {
            return true;
        }
        this.f20481w = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f20482x;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f20478e.size(); i10++) {
            iF += v1.f(1, (vp.a) this.f20478e.get(i10));
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f20479i.size(); i11++) {
            iE += v1.e(((Integer) this.f20479i.get(i11)).intValue());
        }
        int iE2 = iF + iE;
        if (!this.f20479i.isEmpty()) {
            iE2 = iE2 + 1 + v1.e(iE);
        }
        this.f20480v = iE;
        int size = this.f20477d.size() + iE2;
        this.f20482x = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f20456i = list;
        fVar.f20457v = list;
        return fVar;
    }

    @Override // vp.a
    public final vp.i e() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f20456i = list;
        fVar.f20457v = list;
        fVar.g(this);
        return fVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        for (int i7 = 0; i7 < this.f20478e.size(); i7++) {
            v1Var.t(1, (vp.a) this.f20478e.get(i7));
        }
        if (this.f20479i.size() > 0) {
            v1Var.A(42);
            v1Var.A(this.f20480v);
        }
        for (int i10 = 0; i10 < this.f20479i.size(); i10++) {
            v1Var.s(((Integer) this.f20479i.get(i10)).intValue());
        }
        v1Var.w(this.f20477d);
    }

    public j(f fVar) {
        this.f20480v = -1;
        this.f20481w = (byte) -1;
        this.f20482x = -1;
        this.f20477d = fVar.f21889d;
    }

    public j(vp.e eVar, vp.g gVar) {
        this.f20480v = -1;
        this.f20481w = (byte) -1;
        this.f20482x = -1;
        List list = Collections.EMPTY_LIST;
        this.f20478e = list;
        this.f20479i = list;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        int i7 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 10) {
                            if ((i7 & 1) != 1) {
                                this.f20478e = new ArrayList();
                                i7 |= 1;
                            }
                            this.f20478e.add(eVar.g(i.K, gVar));
                        } else if (iN == 40) {
                            if ((i7 & 2) != 2) {
                                this.f20479i = new ArrayList();
                                i7 |= 2;
                            }
                            this.f20479i.add(Integer.valueOf(eVar.k()));
                        } else if (iN != 42) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 2) != 2 && eVar.b() > 0) {
                                this.f20479i = new ArrayList();
                                i7 |= 2;
                            }
                            while (eVar.b() > 0) {
                                this.f20479i.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                        }
                    }
                    z5 = true;
                } catch (q e10) {
                    e10.f21916d = this;
                    throw e10;
                } catch (IOException e11) {
                    q qVar = new q(e11.getMessage());
                    qVar.f21916d = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                if ((i7 & 1) == 1) {
                    this.f20478e = Collections.unmodifiableList(this.f20478e);
                }
                if ((i7 & 2) == 2) {
                    this.f20479i = Collections.unmodifiableList(this.f20479i);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f20477d = cVar.g();
                }
                throw th2;
            }
        }
        if ((i7 & 1) == 1) {
            this.f20478e = Collections.unmodifiableList(this.f20478e);
        }
        if ((i7 & 2) == 2) {
            this.f20479i = Collections.unmodifiableList(this.f20479i);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f20477d = cVar.g();
        }
    }
}
