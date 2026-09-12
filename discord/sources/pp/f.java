package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends vp.n {
    public static final a E = new a(1);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final f f18272y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18274e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18275i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public e f18276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte f18277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18278x;

    static {
        f fVar = new f();
        f18272y = fVar;
        fVar.f18275i = 0;
        fVar.f18276v = e.M;
    }

    public f() {
        this.f18277w = (byte) -1;
        this.f18278x = -1;
        this.f18273d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18277w;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        int i7 = this.f18274e;
        if ((i7 & 1) != 1) {
            this.f18277w = (byte) 0;
            return false;
        }
        if ((i7 & 2) != 2) {
            this.f18277w = (byte) 0;
            return false;
        }
        if (this.f18276v.b()) {
            this.f18277w = (byte) 1;
            return true;
        }
        this.f18277w = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.f18278x;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f18274e & 1) == 1 ? v1.d(1, this.f18275i) : 0;
        if ((this.f18274e & 2) == 2) {
            iD += v1.f(2, this.f18276v);
        }
        int size = this.f18273d.size() + iD;
        this.f18278x = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        b bVar = new b(0);
        bVar.f18214w = e.M;
        return bVar;
    }

    @Override // vp.a
    public final vp.i e() {
        b bVar = new b(0);
        bVar.f18214w = e.M;
        bVar.h(this);
        return bVar;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18274e & 1) == 1) {
            v1Var.r(1, this.f18275i);
        }
        if ((this.f18274e & 2) == 2) {
            v1Var.t(2, this.f18276v);
        }
        v1Var.w(this.f18273d);
    }

    public f(b bVar) {
        this.f18277w = (byte) -1;
        this.f18278x = -1;
        this.f18273d = bVar.f21889d;
    }

    public f(vp.e eVar, vp.g gVar) {
        c cVarG;
        this.f18277w = (byte) -1;
        this.f18278x = -1;
        boolean z5 = false;
        this.f18275i = 0;
        this.f18276v = e.M;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        while (!z5) {
            try {
                try {
                    try {
                        int iN = eVar.n();
                        if (iN != 0) {
                            if (iN == 8) {
                                this.f18274e |= 1;
                                this.f18275i = eVar.k();
                            } else if (iN != 18) {
                                if (!eVar.q(iN, v1VarM)) {
                                }
                            } else {
                                if ((this.f18274e & 2) == 2) {
                                    e eVar2 = this.f18276v;
                                    eVar2.getClass();
                                    cVarG = c.g();
                                    cVarG.h(eVar2);
                                } else {
                                    cVarG = null;
                                }
                                e eVar3 = (e) eVar.g(e.N, gVar);
                                this.f18276v = eVar3;
                                if (cVarG != null) {
                                    cVarG.h(eVar3);
                                    this.f18276v = cVarG.f();
                                }
                                this.f18274e |= 2;
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
                    this.f18273d = cVar.g();
                }
                throw th2;
            }
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18273d = cVar.g();
        }
    }
}
