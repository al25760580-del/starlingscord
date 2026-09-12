package pp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends vp.j {
    public List E;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18365v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public List f18367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public List f18368y;

    public static m h() {
        m mVar = new m();
        mVar.f18366w = 6;
        List list = Collections.EMPTY_LIST;
        mVar.f18367x = list;
        mVar.f18368y = list;
        mVar.E = list;
        return mVar;
    }

    @Override // vp.i
    public final vp.a c() {
        n nVarG = g();
        if (nVarG.b()) {
            return nVarG;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        m mVarH = h();
        mVarH.j(g());
        return mVarH;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        n nVar = null;
        try {
            try {
                n.H.getClass();
                j(new n(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                n nVar2 = (n) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    nVar = nVar2;
                    if (nVar != null) {
                        j(nVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (nVar != null) {
                j(nVar);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        j((n) nVar);
        return this;
    }

    public final n g() {
        n nVar = new n(this);
        int i7 = this.f18365v;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        nVar.f18377v = this.f18366w;
        if ((i7 & 2) == 2) {
            this.f18367x = Collections.unmodifiableList(this.f18367x);
            this.f18365v &= -3;
        }
        nVar.f18378w = this.f18367x;
        if ((this.f18365v & 4) == 4) {
            this.f18368y = Collections.unmodifiableList(this.f18368y);
            this.f18365v &= -5;
        }
        nVar.f18379x = this.f18368y;
        if ((this.f18365v & 8) == 8) {
            this.E = Collections.unmodifiableList(this.E);
            this.f18365v &= -9;
        }
        nVar.f18380y = this.E;
        nVar.f18376i = i10;
        return nVar;
    }

    public final void j(n nVar) {
        if (nVar == n.G) {
            return;
        }
        if ((nVar.f18376i & 1) == 1) {
            int i7 = nVar.f18377v;
            this.f18365v = 1 | this.f18365v;
            this.f18366w = i7;
        }
        if (!nVar.f18378w.isEmpty()) {
            if (this.f18367x.isEmpty()) {
                this.f18367x = nVar.f18378w;
                this.f18365v &= -3;
            } else {
                if ((this.f18365v & 2) != 2) {
                    this.f18367x = new ArrayList(this.f18367x);
                    this.f18365v |= 2;
                }
                this.f18367x.addAll(nVar.f18378w);
            }
        }
        if (!nVar.f18379x.isEmpty()) {
            if (this.f18368y.isEmpty()) {
                this.f18368y = nVar.f18379x;
                this.f18365v &= -5;
            } else {
                if ((this.f18365v & 4) != 4) {
                    this.f18368y = new ArrayList(this.f18368y);
                    this.f18365v |= 4;
                }
                this.f18368y.addAll(nVar.f18379x);
            }
        }
        if (!nVar.f18380y.isEmpty()) {
            if (this.E.isEmpty()) {
                this.E = nVar.f18380y;
                this.f18365v &= -9;
            } else {
                if ((this.f18365v & 8) != 8) {
                    this.E = new ArrayList(this.E);
                    this.f18365v |= 8;
                }
                this.E.addAll(nVar.f18380y);
            }
        }
        f(nVar);
        this.f21889d = this.f21889d.b(nVar.f18375e);
    }
}
