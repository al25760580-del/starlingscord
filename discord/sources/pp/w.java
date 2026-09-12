package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends vp.i implements vp.u {
    public List E;
    public List F;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18467e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18468i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18469v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x f18470w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s0 f18471x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18472y;

    public static w g() {
        w wVar = new w();
        wVar.f18470w = x.TRUE;
        wVar.f18471x = s0.Q;
        List list = Collections.EMPTY_LIST;
        wVar.E = list;
        wVar.F = list;
        return wVar;
    }

    @Override // vp.i
    public final vp.a c() {
        y yVarF = f();
        if (yVarF.b()) {
            return yVarF;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        w wVarG = g();
        wVarG.h(f());
        return wVarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        y yVar = null;
        try {
            try {
                y.J.getClass();
                h(new y(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                y yVar2 = (y) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    yVar = yVar2;
                    if (yVar != null) {
                        h(yVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (yVar != null) {
                h(yVar);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        h((y) nVar);
        return this;
    }

    public final y f() {
        y yVar = new y(this);
        int i7 = this.f18467e;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        yVar.f18491i = this.f18468i;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        yVar.f18492v = this.f18469v;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        yVar.f18493w = this.f18470w;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        yVar.f18494x = this.f18471x;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        yVar.f18495y = this.f18472y;
        if ((i7 & 32) == 32) {
            this.E = Collections.unmodifiableList(this.E);
            this.f18467e &= -33;
        }
        yVar.E = this.E;
        if ((this.f18467e & 64) == 64) {
            this.F = Collections.unmodifiableList(this.F);
            this.f18467e &= -65;
        }
        yVar.F = this.F;
        yVar.f18490e = i10;
        return yVar;
    }

    public final void h(y yVar) {
        s0 s0Var;
        if (yVar == y.I) {
            return;
        }
        int i7 = yVar.f18490e;
        if ((i7 & 1) == 1) {
            int i10 = yVar.f18491i;
            this.f18467e = 1 | this.f18467e;
            this.f18468i = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = yVar.f18492v;
            this.f18467e = 2 | this.f18467e;
            this.f18469v = i11;
        }
        if ((i7 & 4) == 4) {
            x xVar = yVar.f18493w;
            xVar.getClass();
            this.f18467e = 4 | this.f18467e;
            this.f18470w = xVar;
        }
        if ((yVar.f18490e & 8) == 8) {
            s0 s0Var2 = yVar.f18494x;
            if ((this.f18467e & 8) != 8 || (s0Var = this.f18471x) == s0.Q) {
                this.f18471x = s0Var2;
            } else {
                r0 r0VarQ = s0.q(s0Var);
                r0VarQ.j(s0Var2);
                this.f18471x = r0VarQ.g();
            }
            this.f18467e |= 8;
        }
        if ((yVar.f18490e & 16) == 16) {
            int i12 = yVar.f18495y;
            this.f18467e = 16 | this.f18467e;
            this.f18472y = i12;
        }
        if (!yVar.E.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = yVar.E;
                this.f18467e &= -33;
            } else {
                if ((this.f18467e & 32) != 32) {
                    this.E = new ArrayList(this.E);
                    this.f18467e |= 32;
                }
                this.E.addAll(yVar.E);
            }
        }
        if (!yVar.F.isEmpty()) {
            if (this.F.isEmpty()) {
                this.F = yVar.F;
                this.f18467e &= -65;
            } else {
                if ((this.f18467e & 64) != 64) {
                    this.F = new ArrayList(this.F);
                    this.f18467e |= 64;
                }
                this.F.addAll(yVar.F);
            }
        }
        this.f21889d = this.f21889d.b(yVar.f18489d);
    }
}
