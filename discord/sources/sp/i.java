package sp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vp.n;
import vp.q;
import vp.t;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends n {
    public static final i J;
    public static final pp.a K = new pp.a(29);
    public int E;
    public List F;
    public int G;
    public byte H;
    public int I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f20469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20470e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20471i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20472v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f20473w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public h f20474x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f20475y;

    static {
        i iVar = new i();
        J = iVar;
        iVar.f20471i = 1;
        iVar.f20472v = 0;
        iVar.f20473w = "";
        iVar.f20474x = h.NONE;
        List list = Collections.EMPTY_LIST;
        iVar.f20475y = list;
        iVar.F = list;
    }

    public i() {
        this.E = -1;
        this.G = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f20469d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        if (this.H == 1) {
            return true;
        }
        this.H = (byte) 1;
        return true;
    }

    @Override // vp.a
    public final int c() {
        vp.d tVar;
        int i7 = this.I;
        if (i7 != -1) {
            return i7;
        }
        int iD = (this.f20470e & 1) == 1 ? v1.d(1, this.f20471i) : 0;
        if ((this.f20470e & 2) == 2) {
            iD += v1.d(2, this.f20472v);
        }
        if ((this.f20470e & 8) == 8) {
            iD += v1.c(3, this.f20474x.f20468d);
        }
        int iE = 0;
        for (int i10 = 0; i10 < this.f20475y.size(); i10++) {
            iE += v1.e(((Integer) this.f20475y.get(i10)).intValue());
        }
        int iE2 = iD + iE;
        if (!this.f20475y.isEmpty()) {
            iE2 = iE2 + 1 + v1.e(iE);
        }
        this.E = iE;
        int iE3 = 0;
        for (int i11 = 0; i11 < this.F.size(); i11++) {
            iE3 += v1.e(((Integer) this.F.get(i11)).intValue());
        }
        int size = iE2 + iE3;
        if (!this.F.isEmpty()) {
            size = size + 1 + v1.e(iE3);
        }
        this.G = iE3;
        if ((this.f20470e & 4) == 4) {
            Object obj = this.f20473w;
            if (obj instanceof String) {
                try {
                    tVar = new t(((String) obj).getBytes("UTF-8"));
                    this.f20473w = tVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                tVar = (vp.d) obj;
            }
            size += tVar.size() + v1.h(tVar.size()) + v1.j(6);
        }
        int size2 = this.f20469d.size() + size;
        this.I = size2;
        return size2;
    }

    @Override // vp.a
    public final vp.i d() {
        return g.g();
    }

    @Override // vp.a
    public final vp.i e() {
        g gVarG = g.g();
        gVarG.h(this);
        return gVarG;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        vp.d tVar;
        c();
        if ((this.f20470e & 1) == 1) {
            v1Var.r(1, this.f20471i);
        }
        if ((this.f20470e & 2) == 2) {
            v1Var.r(2, this.f20472v);
        }
        if ((this.f20470e & 8) == 8) {
            v1Var.q(3, this.f20474x.f20468d);
        }
        if (this.f20475y.size() > 0) {
            v1Var.A(34);
            v1Var.A(this.E);
        }
        for (int i7 = 0; i7 < this.f20475y.size(); i7++) {
            v1Var.s(((Integer) this.f20475y.get(i7)).intValue());
        }
        if (this.F.size() > 0) {
            v1Var.A(42);
            v1Var.A(this.G);
        }
        for (int i10 = 0; i10 < this.F.size(); i10++) {
            v1Var.s(((Integer) this.F.get(i10)).intValue());
        }
        if ((this.f20470e & 4) == 4) {
            Object obj = this.f20473w;
            if (obj instanceof String) {
                try {
                    tVar = new t(((String) obj).getBytes("UTF-8"));
                    this.f20473w = tVar;
                } catch (UnsupportedEncodingException e10) {
                    throw new RuntimeException("UTF-8 not supported?", e10);
                }
            } else {
                tVar = (vp.d) obj;
            }
            v1Var.C(6, 2);
            v1Var.A(tVar.size());
            v1Var.w(tVar);
        }
        v1Var.w(this.f20469d);
    }

    public i(g gVar) {
        this.E = -1;
        this.G = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f20469d = gVar.f21889d;
    }

    public i(vp.e eVar) {
        h hVar;
        this.E = -1;
        this.G = -1;
        this.H = (byte) -1;
        this.I = -1;
        this.f20471i = 1;
        boolean z5 = false;
        this.f20472v = 0;
        this.f20473w = "";
        h hVar2 = h.NONE;
        this.f20474x = hVar2;
        List list = Collections.EMPTY_LIST;
        this.f20475y = list;
        this.F = list;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        int i7 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN == 8) {
                            this.f20470e |= 1;
                            this.f20471i = eVar.k();
                        } else if (iN == 16) {
                            this.f20470e |= 2;
                            this.f20472v = eVar.k();
                        } else if (iN == 24) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                hVar = hVar2;
                            } else if (iK != 1) {
                                hVar = iK != 2 ? null : h.DESC_TO_CLASS_ID;
                            } else {
                                hVar = h.INTERNAL_TO_CLASS_ID;
                            }
                            if (hVar == null) {
                                v1VarM.A(iN);
                                v1VarM.A(iK);
                            } else {
                                this.f20470e |= 8;
                                this.f20474x = hVar;
                            }
                        } else if (iN == 32) {
                            if ((i7 & 16) != 16) {
                                this.f20475y = new ArrayList();
                                i7 |= 16;
                            }
                            this.f20475y.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 34) {
                            int iD = eVar.d(eVar.k());
                            if ((i7 & 16) != 16 && eVar.b() > 0) {
                                this.f20475y = new ArrayList();
                                i7 |= 16;
                            }
                            while (eVar.b() > 0) {
                                this.f20475y.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD);
                        } else if (iN == 40) {
                            if ((i7 & 32) != 32) {
                                this.F = new ArrayList();
                                i7 |= 32;
                            }
                            this.F.add(Integer.valueOf(eVar.k()));
                        } else if (iN == 42) {
                            int iD2 = eVar.d(eVar.k());
                            if ((i7 & 32) != 32 && eVar.b() > 0) {
                                this.F = new ArrayList();
                                i7 |= 32;
                            }
                            while (eVar.b() > 0) {
                                this.F.add(Integer.valueOf(eVar.k()));
                            }
                            eVar.c(iD2);
                        } else if (iN != 50) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            t tVarE = eVar.e();
                            this.f20470e |= 4;
                            this.f20473w = tVarE;
                        }
                    }
                    z5 = true;
                } catch (Throwable th2) {
                    if ((i7 & 16) == 16) {
                        this.f20475y = Collections.unmodifiableList(this.f20475y);
                    }
                    if ((i7 & 32) == 32) {
                        this.F = Collections.unmodifiableList(this.F);
                    }
                    try {
                        v1VarM.l();
                    } catch (IOException unused) {
                    } finally {
                        this.f20469d = cVar.g();
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
        if ((i7 & 16) == 16) {
            this.f20475y = Collections.unmodifiableList(this.f20475y);
        }
        if ((i7 & 32) == 32) {
            this.F = Collections.unmodifiableList(this.F);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f20469d = cVar.g();
        }
    }
}
