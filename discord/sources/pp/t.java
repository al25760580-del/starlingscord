package pp;

import com.google.android.gms.internal.play_billing.v1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends vp.n {
    public static final t F;
    public static final a G = new a(7);
    public int E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vp.d f18438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18439e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f18440i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f18441v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y f18442w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s f18443x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte f18444y;

    static {
        t tVar = new t();
        F = tVar;
        tVar.f18440i = r.RETURNS_CONSTANT;
        tVar.f18441v = Collections.EMPTY_LIST;
        tVar.f18442w = y.I;
        tVar.f18443x = s.AT_MOST_ONCE;
    }

    public t() {
        this.f18444y = (byte) -1;
        this.E = -1;
        this.f18438d = vp.d.f21871d;
    }

    @Override // vp.u
    public final boolean b() {
        byte b10 = this.f18444y;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i7 = 0; i7 < this.f18441v.size(); i7++) {
            if (!((y) this.f18441v.get(i7)).b()) {
                this.f18444y = (byte) 0;
                return false;
            }
        }
        if ((this.f18439e & 2) != 2 || this.f18442w.b()) {
            this.f18444y = (byte) 1;
            return true;
        }
        this.f18444y = (byte) 0;
        return false;
    }

    @Override // vp.a
    public final int c() {
        int i7 = this.E;
        if (i7 != -1) {
            return i7;
        }
        int iC = (this.f18439e & 1) == 1 ? v1.c(1, this.f18440i.f18422d) : 0;
        for (int i10 = 0; i10 < this.f18441v.size(); i10++) {
            iC += v1.f(2, (vp.a) this.f18441v.get(i10));
        }
        if ((this.f18439e & 2) == 2) {
            iC += v1.f(3, this.f18442w);
        }
        if ((this.f18439e & 4) == 4) {
            iC += v1.c(4, this.f18443x.f18431d);
        }
        int size = this.f18438d.size() + iC;
        this.E = size;
        return size;
    }

    @Override // vp.a
    public final vp.i d() {
        return q.g();
    }

    @Override // vp.a
    public final vp.i e() {
        q qVarG = q.g();
        qVarG.h(this);
        return qVarG;
    }

    @Override // vp.a
    public final void f(v1 v1Var) throws IOException {
        c();
        if ((this.f18439e & 1) == 1) {
            v1Var.q(1, this.f18440i.f18422d);
        }
        for (int i7 = 0; i7 < this.f18441v.size(); i7++) {
            v1Var.t(2, (vp.a) this.f18441v.get(i7));
        }
        if ((this.f18439e & 2) == 2) {
            v1Var.t(3, this.f18442w);
        }
        if ((this.f18439e & 4) == 4) {
            v1Var.q(4, this.f18443x.f18431d);
        }
        v1Var.w(this.f18438d);
    }

    public t(q qVar) {
        this.f18444y = (byte) -1;
        this.E = -1;
        this.f18438d = qVar.f21889d;
    }

    public t(vp.e eVar, vp.g gVar) {
        this.f18444y = (byte) -1;
        this.E = -1;
        r rVar = r.RETURNS_CONSTANT;
        this.f18440i = rVar;
        this.f18441v = Collections.EMPTY_LIST;
        this.f18442w = y.I;
        s sVar = s.AT_MOST_ONCE;
        this.f18443x = sVar;
        vp.c cVar = new vp.c();
        v1 v1VarM = v1.m(cVar, 1);
        boolean z5 = false;
        char c8 = 0;
        while (!z5) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        s sVar2 = null;
                        r rVar2 = null;
                        w wVarG = null;
                        if (iN == 8) {
                            int iK = eVar.k();
                            if (iK == 0) {
                                rVar2 = rVar;
                            } else if (iK == 1) {
                                rVar2 = r.CALLS;
                            } else if (iK == 2) {
                                rVar2 = r.RETURNS_NOT_NULL;
                            }
                            if (rVar2 == null) {
                                v1VarM.A(iN);
                                v1VarM.A(iK);
                            } else {
                                this.f18439e |= 1;
                                this.f18440i = rVar2;
                            }
                        } else if (iN == 18) {
                            int i7 = (c8 == true ? 1 : 0) & 2;
                            c8 = c8;
                            if (i7 != 2) {
                                this.f18441v = new ArrayList();
                                c8 = 2;
                            }
                            this.f18441v.add(eVar.g(y.J, gVar));
                        } else if (iN == 26) {
                            if ((this.f18439e & 2) == 2) {
                                y yVar = this.f18442w;
                                yVar.getClass();
                                wVarG = w.g();
                                wVarG.h(yVar);
                            }
                            y yVar2 = (y) eVar.g(y.J, gVar);
                            this.f18442w = yVar2;
                            if (wVarG != null) {
                                wVarG.h(yVar2);
                                this.f18442w = wVarG.f();
                            }
                            this.f18439e |= 2;
                        } else if (iN != 32) {
                            if (!eVar.q(iN, v1VarM)) {
                            }
                        } else {
                            int iK2 = eVar.k();
                            if (iK2 == 0) {
                                sVar2 = sVar;
                            } else if (iK2 == 1) {
                                sVar2 = s.EXACTLY_ONCE;
                            } else if (iK2 == 2) {
                                sVar2 = s.AT_LEAST_ONCE;
                            }
                            if (sVar2 == null) {
                                v1VarM.A(iN);
                                v1VarM.A(iK2);
                            } else {
                                this.f18439e |= 4;
                                this.f18443x = sVar2;
                            }
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
                if (((c8 == true ? 1 : 0) & 2) == 2) {
                    this.f18441v = Collections.unmodifiableList(this.f18441v);
                }
                try {
                    v1VarM.l();
                } catch (IOException unused) {
                } finally {
                    this.f18438d = cVar.g();
                }
                throw th2;
            }
        }
        if (((c8 == true ? 1 : 0) & 2) == 2) {
            this.f18441v = Collections.unmodifiableList(this.f18441v);
        }
        try {
            v1VarM.l();
        } catch (IOException unused2) {
        } finally {
            this.f18438d = cVar.g();
        }
    }
}
