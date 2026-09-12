package sp;

import vp.n;
import vp.q;
import vp.u;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends vp.i implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20442e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f20443i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c f20444v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c f20445w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c f20446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c f20447y;

    public static d g() {
        d dVar = new d();
        dVar.f20443i = b.f20428y;
        c cVar = c.f20435y;
        dVar.f20444v = cVar;
        dVar.f20445w = cVar;
        dVar.f20446x = cVar;
        dVar.f20447y = cVar;
        return dVar;
    }

    @Override // vp.i
    public final vp.a c() {
        e eVarF = f();
        eVarF.b();
        return eVarF;
    }

    public final Object clone() {
        d dVarG = g();
        dVarG.h(f());
        return dVarG;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        e eVar2 = null;
        try {
            try {
                e.H.getClass();
                h(new e(eVar, gVar));
                return this;
            } catch (q e10) {
                e eVar3 = (e) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    eVar2 = eVar3;
                    if (eVar2 != null) {
                        h(eVar2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (eVar2 != null) {
                h(eVar2);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(n nVar) {
        h((e) nVar);
        return this;
    }

    public final e f() {
        e eVar = new e(this);
        int i7 = this.f20442e;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        eVar.f20450i = this.f20443i;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        eVar.f20451v = this.f20444v;
        if ((i7 & 4) == 4) {
            i10 |= 4;
        }
        eVar.f20452w = this.f20445w;
        if ((i7 & 8) == 8) {
            i10 |= 8;
        }
        eVar.f20453x = this.f20446x;
        if ((i7 & 16) == 16) {
            i10 |= 16;
        }
        eVar.f20454y = this.f20447y;
        eVar.f20449e = i10;
        return eVar;
    }

    public final void h(e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        b bVar;
        if (eVar == e.G) {
            return;
        }
        if ((eVar.f20449e & 1) == 1) {
            b bVar2 = eVar.f20450i;
            if ((this.f20442e & 1) != 1 || (bVar = this.f20443i) == b.f20428y) {
                this.f20443i = bVar2;
            } else {
                a aVar = new a(0);
                aVar.h(bVar);
                aVar.h(bVar2);
                this.f20443i = aVar.f();
            }
            this.f20442e |= 1;
        }
        if ((eVar.f20449e & 2) == 2) {
            c cVar5 = eVar.f20451v;
            if ((this.f20442e & 2) != 2 || (cVar4 = this.f20444v) == c.f20435y) {
                this.f20444v = cVar5;
            } else {
                a aVarI = c.i(cVar4);
                aVarI.j(cVar5);
                this.f20444v = aVarI.g();
            }
            this.f20442e |= 2;
        }
        if ((eVar.f20449e & 4) == 4) {
            c cVar6 = eVar.f20452w;
            if ((this.f20442e & 4) != 4 || (cVar3 = this.f20445w) == c.f20435y) {
                this.f20445w = cVar6;
            } else {
                a aVarI2 = c.i(cVar3);
                aVarI2.j(cVar6);
                this.f20445w = aVarI2.g();
            }
            this.f20442e |= 4;
        }
        if ((eVar.f20449e & 8) == 8) {
            c cVar7 = eVar.f20453x;
            if ((this.f20442e & 8) != 8 || (cVar2 = this.f20446x) == c.f20435y) {
                this.f20446x = cVar7;
            } else {
                a aVarI3 = c.i(cVar2);
                aVarI3.j(cVar7);
                this.f20446x = aVarI3.g();
            }
            this.f20442e |= 8;
        }
        if ((eVar.f20449e & 16) == 16) {
            c cVar8 = eVar.f20454y;
            if ((this.f20442e & 16) != 16 || (cVar = this.f20447y) == c.f20435y) {
                this.f20447y = cVar8;
            } else {
                a aVarI4 = c.i(cVar);
                aVarI4.j(cVar8);
                this.f20447y = aVarI4.g();
            }
            this.f20442e |= 16;
        }
        this.f21889d = this.f21889d.b(eVar.f20448d);
    }
}
