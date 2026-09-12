package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends vp.j {
    public w0 E;
    public List F;
    public List G;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18466y;

    public static v0 h() {
        v0 v0Var = new v0();
        v0Var.E = w0.INV;
        List list = Collections.EMPTY_LIST;
        v0Var.F = list;
        v0Var.G = list;
        return v0Var;
    }

    @Override // vp.i
    public final vp.a c() {
        x0 x0VarG = g();
        if (x0VarG.b()) {
            return x0VarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        v0 v0VarH = h();
        v0VarH.j(g());
        return v0VarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        x0 x0Var = null;
        try {
            try {
                x0.K.getClass();
                j(new x0(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                x0 x0Var2 = (x0) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    x0Var = x0Var2;
                    if (x0Var != null) {
                        j(x0Var);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (x0Var != null) {
                j(x0Var);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((x0) nVar);
        return this;
    }

    public final x0 g() {
        x0 x0Var = new x0(this);
        int i7 = this.f18463v;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        x0Var.f18485v = this.f18464w;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        x0Var.f18486w = this.f18465x;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        x0Var.f18487x = this.f18466y;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        x0Var.f18488y = this.E;
        if ((i7 & 16) == 16) {
            this.F = Collections.unmodifiableList(this.F);
            this.f18463v &= -17;
        }
        x0Var.E = this.F;
        if ((this.f18463v & 32) == 32) {
            this.G = Collections.unmodifiableList(this.G);
            this.f18463v &= -33;
        }
        x0Var.F = this.G;
        x0Var.f18484i = i10;
        return x0Var;
    }

    public final void j(x0 x0Var) {
        if (x0Var == x0.J) {
            return;
        }
        int i7 = x0Var.f18484i;
        if ((i7 & 1) == 1) {
            int i10 = x0Var.f18485v;
            this.f18463v = 1 | this.f18463v;
            this.f18464w = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = x0Var.f18486w;
            this.f18463v = 2 | this.f18463v;
            this.f18465x = i11;
        }
        if ((i7 & 4) == 4) {
            boolean z5 = x0Var.f18487x;
            this.f18463v = 4 | this.f18463v;
            this.f18466y = z5;
        }
        if ((i7 & 8) == 8) {
            w0 w0Var = x0Var.f18488y;
            w0Var.getClass();
            this.f18463v = 8 | this.f18463v;
            this.E = w0Var;
        }
        if (!x0Var.E.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = x0Var.E;
                this.f18463v &= -17;
            } else {
                if ((this.f18463v & 16) != 16) {
                    this.F = new ArrayList(this.F);
                    this.f18463v |= 16;
                }
                this.F.addAll(x0Var.E);
            }
        }
        if (!x0Var.F.isEmpty()) {
            if (this.G.isEmpty()) {
                this.G = x0Var.F;
                this.f18463v &= -33;
            } else {
                if ((this.f18463v & 32) != 32) {
                    this.G = new ArrayList(this.G);
                    this.f18463v |= 32;
                }
                this.G.addAll(x0Var.F);
            }
        }
        f(x0Var);
        this.f21889d = this.f21889d.b(x0Var.f18483e);
    }
}
