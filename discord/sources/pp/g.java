package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends vp.i implements vp.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18289e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18290i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f18291v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18292w;

    public /* synthetic */ g(int i7) {
        this.f18289e = i7;
    }

    public static g h() {
        g gVar = new g(1);
        gVar.f18291v = Collections.EMPTY_LIST;
        gVar.f18292w = -1;
        return gVar;
    }

    @Override // vp.i
    public final vp.a c() {
        switch (this.f18289e) {
            case 0:
                h hVarF = f();
                if (hVarF.b()) {
                    return hVarF;
                }
                throw new androidx.datastore.preferences.protobuf.d1();
            default:
                y0 y0VarG = g();
                if (y0VarG.b()) {
                    return y0VarG;
                }
                throw new androidx.datastore.preferences.protobuf.d1();
        }
    }

    public final Object clone() {
        switch (this.f18289e) {
            case 0:
                g gVar = new g(0);
                gVar.f18291v = Collections.EMPTY_LIST;
                gVar.j(f());
                return gVar;
            default:
                g gVarH = h();
                gVarH.k(g());
                return gVarH;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003d  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        switch (this.f18289e) {
            case 0:
                h hVar = null;
                try {
                    try {
                        j((h) h.E.a(eVar, gVar));
                        return this;
                    } catch (Throwable th2) {
                        th = th2;
                        if (hVar != null) {
                            j(hVar);
                        }
                        throw th;
                    }
                } catch (vp.q e10) {
                    h hVar2 = (h) e10.f21916d;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        hVar = hVar2;
                        if (hVar != null) {
                            j(hVar);
                        }
                        throw th;
                    }
                }
            default:
                y0 y0Var = null;
                try {
                    try {
                        y0.E.getClass();
                        k(new y0(eVar, gVar));
                        return this;
                    } catch (Throwable th4) {
                        th = th4;
                        if (y0Var != null) {
                            k(y0Var);
                        }
                        throw th;
                    }
                } catch (vp.q e11) {
                    y0 y0Var2 = (y0) e11.f21916d;
                    try {
                        throw e11;
                    } catch (Throwable th5) {
                        th = th5;
                        y0Var = y0Var2;
                        if (y0Var != null) {
                            k(y0Var);
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        switch (this.f18289e) {
            case 0:
                j((h) nVar);
                break;
            default:
                k((y0) nVar);
                break;
        }
        return this;
    }

    public h f() {
        h hVar = new h(this);
        int i7 = this.f18290i;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        hVar.f18304i = this.f18292w;
        if ((i7 & 2) == 2) {
            this.f18291v = Collections.unmodifiableList(this.f18291v);
            this.f18290i &= -3;
        }
        hVar.f18305v = this.f18291v;
        hVar.f18303e = i10;
        return hVar;
    }

    public y0 g() {
        y0 y0Var = new y0(this);
        int i7 = this.f18290i;
        if ((i7 & 1) == 1) {
            this.f18291v = Collections.unmodifiableList(this.f18291v);
            this.f18290i &= -2;
        }
        y0Var.f18499i = this.f18291v;
        int i10 = (i7 & 2) != 2 ? 0 : 1;
        y0Var.f18500v = this.f18292w;
        y0Var.f18498e = i10;
        return y0Var;
    }

    public void j(h hVar) {
        if (hVar == h.f18301y) {
            return;
        }
        if ((hVar.f18303e & 1) == 1) {
            int i7 = hVar.f18304i;
            this.f18290i = 1 | this.f18290i;
            this.f18292w = i7;
        }
        if (!hVar.f18305v.isEmpty()) {
            if (this.f18291v.isEmpty()) {
                this.f18291v = hVar.f18305v;
                this.f18290i &= -3;
            } else {
                if ((this.f18290i & 2) != 2) {
                    this.f18291v = new ArrayList(this.f18291v);
                    this.f18290i |= 2;
                }
                this.f18291v.addAll(hVar.f18305v);
            }
        }
        this.f21889d = this.f21889d.b(hVar.f18302d);
    }

    public void k(y0 y0Var) {
        if (y0Var == y0.f18496y) {
            return;
        }
        if (!y0Var.f18499i.isEmpty()) {
            if (this.f18291v.isEmpty()) {
                this.f18291v = y0Var.f18499i;
                this.f18290i &= -2;
            } else {
                if ((this.f18290i & 1) != 1) {
                    this.f18291v = new ArrayList(this.f18291v);
                    this.f18290i |= 1;
                }
                this.f18291v.addAll(y0Var.f18499i);
            }
        }
        if ((y0Var.f18498e & 1) == 1) {
            int i7 = y0Var.f18500v;
            this.f18290i |= 2;
            this.f18292w = i7;
        }
        this.f21889d = this.f21889d.b(y0Var.f18497d);
    }
}
