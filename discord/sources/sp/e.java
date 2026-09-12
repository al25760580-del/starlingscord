package sp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import vp.n;
import vp.q;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends n {
    public static final e G;
    public static final pp.a H = new pp.a(27);
    public byte E;
    public int F;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f20448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20449e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f20450i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f20451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f20452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f20453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f20454y;

    static {
        e eVar = new e();
        G = eVar;
        eVar.f20450i = b.f20428y;
        c cVar = c.f20435y;
        eVar.f20451v = cVar;
        eVar.f20452w = cVar;
        eVar.f20453x = cVar;
        eVar.f20454y = cVar;
    }

    public e() {
        this.E = (byte) -1;
        this.F = -1;
        this.f20448d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        if (this.E == 1) {
            return true;
        }
        this.E = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.F;
        if (i7 != -1) {
            return i7;
        }
        int iF = (this.f20449e & 1) == 1 ? v1.f(1, this.f20450i) : 0;
        if ((this.f20449e & 2) == 2) {
            iF += v1.f(2, this.f20451v);
        }
        if ((this.f20449e & 4) == 4) {
            iF += v1.f(3, this.f20452w);
        }
        if ((this.f20449e & 8) == 8) {
            iF += v1.f(4, this.f20453x);
        }
        if ((this.f20449e & 16) == 16) {
            iF += v1.f(5, this.f20454y);
        }
        int size = this.f20448d.size() + iF;
        this.F = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return d.g();
    }

    @Override // vp.a
    public final vp.i e() {
        d dVarG = d.g();
        dVarG.h(this);
        return dVarG;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f20449e & 1) == 1) {
            v1Var.t(1, this.f20450i);
        }
        if ((this.f20449e & 2) == 2) {
            v1Var.t(2, this.f20451v);
        }
        if ((this.f20449e & 4) == 4) {
            v1Var.t(3, this.f20452w);
        }
        if ((this.f20449e & 8) == 8) {
            v1Var.t(4, this.f20453x);
        }
        if ((this.f20449e & 16) == 16) {
            v1Var.t(5, this.f20454y);
        }
        v1Var.w(this.f20448d);
    }

    public e(d dVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.f20448d = dVar.f21889d;
    }

    public e(vp.e eVar, vp.g gVar) {
        this.E = (byte) -1;
        this.F = -1;
        this.f20450i = b.f20428y;
        c cVar = c.f20435y;
        this.f20451v = cVar;
        this.f20452w = cVar;
        this.f20453x = cVar;
        this.f20454y = cVar;
        vp.c cVar2 = new vp.c();
        v1 v1VarM = v1.m(cVar2, 1);
        boolean z5 = false;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        a aVarI = null;
                        if (iN == 10) {
                            if ((this.f20449e & 1) == 1) {
                                b bVar = this.f20450i;
                                bVar.getClass();
                                aVarI = new a(0);
                                aVarI.h(bVar);
                            }
                            b bVar2 = (b) eVar.g(b.E, gVar);
                            this.f20450i = bVar2;
                            if (aVarI != null) {
                                aVarI.h(bVar2);
                                this.f20450i = aVarI.f();
                            }
                            this.f20449e |= 1;
                        } else if (iN == 18) {
                            if ((this.f20449e & 2) == 2) {
                                c cVar3 = this.f20451v;
                                cVar3.getClass();
                                aVarI = c.i(cVar3);
                            }
                            c cVar4 = (c) eVar.g(c.E, gVar);
                            this.f20451v = cVar4;
                            if (aVarI != null) {
                                aVarI.j(cVar4);
                                this.f20451v = aVarI.g();
                            }
                            this.f20449e |= 2;
                        } else if (iN == 26) {
                            if ((this.f20449e & 4) == 4) {
                                c cVar5 = this.f20452w;
                                cVar5.getClass();
                                aVarI = c.i(cVar5);
                            }
                            c cVar6 = (c) eVar.g(c.E, gVar);
                            this.f20452w = cVar6;
                            if (aVarI != null) {
                                aVarI.j(cVar6);
                                this.f20452w = aVarI.g();
                            }
                            this.f20449e |= 4;
                        } else if (iN == 34) {
                            if ((this.f20449e & 8) == 8) {
                                c cVar7 = this.f20453x;
                                cVar7.getClass();
                                aVarI = c.i(cVar7);
                            }
                            c cVar8 = (c) eVar.g(c.E, gVar);
                            this.f20453x = cVar8;
                            if (aVarI != null) {
                                aVarI.j(cVar8);
                                this.f20453x = aVarI.g();
                            }
                            this.f20449e |= 8;
                        } else if (iN != 42) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            if ((this.f20449e & 16) == 16) {
                                c cVar9 = this.f20454y;
                                cVar9.getClass();
                                aVarI = c.i(cVar9);
                            }
                            c cVar10 = (c) eVar.g(c.E, gVar);
                            this.f20454y = cVar10;
                            if (aVarI != null) {
                                aVarI.j(cVar10);
                                this.f20454y = aVarI.g();
                            }
                            this.f20449e |= 16;
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
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f20448d = cVar2.g();
                }
                throw th2;
            }
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f20448d = cVar2.g();
        }
    }
}
