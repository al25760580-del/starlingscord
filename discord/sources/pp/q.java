package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends vp.i implements vp.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18406e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f18407i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f18408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y f18409w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public s f18410x;

    public static q g() {
        q qVar = new q();
        qVar.f18407i = r.RETURNS_CONSTANT;
        qVar.f18408v = Collections.EMPTY_LIST;
        qVar.f18409w = y.I;
        qVar.f18410x = s.AT_MOST_ONCE;
        return qVar;
    }

    @Override // vp.i
    public final vp.a c() {
        t tVarF = f();
        if (tVarF.b()) {
            return tVarF;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        q qVarG = g();
        qVarG.h(f());
        return qVarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        t tVar = null;
        try {
            try {
                t.G.getClass();
                h(new t(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                t tVar2 = (t) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    tVar = tVar2;
                    if (tVar != null) {
                        h(tVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (tVar != null) {
                h(tVar);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        h((t) nVar);
        return this;
    }

    public final t f() {
        t tVar = new t(this);
        int i7 = this.f18406e;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        tVar.f18440i = this.f18407i;
        if ((i7 & 2) == 2) {
            this.f18408v = Collections.unmodifiableList(this.f18408v);
            this.f18406e &= -3;
        }
        tVar.f18441v = this.f18408v;
        if ((i7 & 4) == 4) {
            i10 |= 2;
        }
        tVar.f18442w = this.f18409w;
        if ((i7 & 8) == 8) {
            i10 |= 4;
        }
        tVar.f18443x = this.f18410x;
        tVar.f18439e = i10;
        return tVar;
    }

    public final void h(t tVar) {
        y yVar;
        if (tVar == t.F) {
            return;
        }
        if ((tVar.f18439e & 1) == 1) {
            r rVar = tVar.f18440i;
            rVar.getClass();
            this.f18406e = 1 | this.f18406e;
            this.f18407i = rVar;
        }
        if (!tVar.f18441v.isEmpty()) {
            if (this.f18408v.isEmpty()) {
                this.f18408v = tVar.f18441v;
                this.f18406e &= -3;
            } else {
                if ((this.f18406e & 2) != 2) {
                    this.f18408v = new ArrayList(this.f18408v);
                    this.f18406e |= 2;
                }
                this.f18408v.addAll(tVar.f18441v);
            }
        }
        if ((tVar.f18439e & 2) == 2) {
            y yVar2 = tVar.f18442w;
            if ((this.f18406e & 4) != 4 || (yVar = this.f18409w) == y.I) {
                this.f18409w = yVar2;
            } else {
                w wVarG = w.g();
                wVarG.h(yVar);
                wVarG.h(yVar2);
                this.f18409w = wVarG.f();
            }
            this.f18406e |= 4;
        }
        if ((tVar.f18439e & 4) == 4) {
            s sVar = tVar.f18443x;
            sVar.getClass();
            this.f18406e |= 8;
            this.f18410x = sVar;
        }
        this.f21889d = this.f21889d.b(tVar.f18438d);
    }
}
