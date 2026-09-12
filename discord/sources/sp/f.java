package sp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vp.n;
import vp.q;
import vp.u;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends vp.i implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20455e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public List f20456i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public List f20457v;

    @Override // vp.i
    public final vp.a c() {
        j jVarF = f();
        jVarF.b();
        return jVarF;
    }

    public final Object clone() {
        f fVar = new f();
        List list = Collections.EMPTY_LIST;
        fVar.f20456i = list;
        fVar.f20457v = list;
        fVar.g(f());
        return fVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        j jVar = null;
        try {
            try {
                j.E.getClass();
                g(new j(eVar, gVar));
                return this;
            } catch (q e10) {
                j jVar2 = (j) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    jVar = jVar2;
                    if (jVar != null) {
                        g(jVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (jVar != null) {
                g(jVar);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(n nVar) {
        g((j) nVar);
        return this;
    }

    public final j f() {
        j jVar = new j(this);
        if ((this.f20455e & 1) == 1) {
            this.f20456i = Collections.unmodifiableList(this.f20456i);
            this.f20455e &= -2;
        }
        jVar.f20478e = this.f20456i;
        if ((this.f20455e & 2) == 2) {
            this.f20457v = Collections.unmodifiableList(this.f20457v);
            this.f20455e &= -3;
        }
        jVar.f20479i = this.f20457v;
        return jVar;
    }

    public final void g(j jVar) {
        if (jVar == j.f20476y) {
            return;
        }
        if (!jVar.f20478e.isEmpty()) {
            if (this.f20456i.isEmpty()) {
                this.f20456i = jVar.f20478e;
                this.f20455e &= -2;
            } else {
                if ((this.f20455e & 1) != 1) {
                    this.f20456i = new ArrayList(this.f20456i);
                    this.f20455e |= 1;
                }
                this.f20456i.addAll(jVar.f20478e);
            }
        }
        if (!jVar.f20479i.isEmpty()) {
            if (this.f20457v.isEmpty()) {
                this.f20457v = jVar.f20479i;
                this.f20455e &= -3;
            } else {
                if ((this.f20455e & 2) != 2) {
                    this.f20457v = new ArrayList(this.f20457v);
                    this.f20455e |= 2;
                }
                this.f20457v.addAll(jVar.f20479i);
            }
        }
        this.f21889d = this.f21889d.b(jVar.f20477d);
    }
}
