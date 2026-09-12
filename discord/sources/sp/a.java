package sp;

import vp.n;
import vp.q;
import vp.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends vp.i implements u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20424e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20425i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20426v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20427w;

    public /* synthetic */ a(int i7) {
        this.f20424e = i7;
    }

    @Override // vp.i
    public final vp.a c() {
        switch (this.f20424e) {
            case 0:
                b bVarF = f();
                bVarF.b();
                return bVarF;
            default:
                c cVarG = g();
                cVarG.b();
                return cVarG;
        }
    }

    public final Object clone() {
        switch (this.f20424e) {
            case 0:
                a aVar = new a(0);
                aVar.h(f());
                return aVar;
            default:
                a aVar2 = new a(1);
                aVar2.j(g());
                return aVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        switch (this.f20424e) {
            case 0:
                b bVar = null;
                try {
                    try {
                        b.E.getClass();
                        h(new b(eVar));
                        return this;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bVar != null) {
                            h(bVar);
                        }
                        throw th;
                    }
                } catch (q e10) {
                    b bVar2 = (b) e10.f21916d;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        bVar = bVar2;
                        if (bVar != null) {
                            h(bVar);
                        }
                        throw th;
                    }
                }
            default:
                c cVar = null;
                try {
                    try {
                        c.E.getClass();
                        j(new c(eVar));
                        return this;
                    } catch (Throwable th4) {
                        th = th4;
                        if (cVar != null) {
                            j(cVar);
                        }
                        throw th;
                    }
                } catch (q e11) {
                    c cVar2 = (c) e11.f21916d;
                    try {
                        throw e11;
                    } catch (Throwable th5) {
                        th = th5;
                        cVar = cVar2;
                        if (cVar != null) {
                            j(cVar);
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(n nVar) {
        switch (this.f20424e) {
            case 0:
                h((b) nVar);
                break;
            default:
                j((c) nVar);
                break;
        }
        return this;
    }

    public b f() {
        b bVar = new b(this);
        int i7 = this.f20425i;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        bVar.f20431i = this.f20426v;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        bVar.f20432v = this.f20427w;
        bVar.f20430e = i10;
        return bVar;
    }

    public c g() {
        c cVar = new c(this);
        int i7 = this.f20425i;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        cVar.f20438i = this.f20426v;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        cVar.f20439v = this.f20427w;
        cVar.f20437e = i10;
        return cVar;
    }

    public void h(b bVar) {
        if (bVar == b.f20428y) {
            return;
        }
        int i7 = bVar.f20430e;
        if ((i7 & 1) == 1) {
            int i10 = bVar.f20431i;
            this.f20425i = 1 | this.f20425i;
            this.f20426v = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = bVar.f20432v;
            this.f20425i = 2 | this.f20425i;
            this.f20427w = i11;
        }
        this.f21889d = this.f21889d.b(bVar.f20429d);
    }

    public void j(c cVar) {
        if (cVar == c.f20435y) {
            return;
        }
        int i7 = cVar.f20437e;
        if ((i7 & 1) == 1) {
            int i10 = cVar.f20438i;
            this.f20425i = 1 | this.f20425i;
            this.f20426v = i10;
        }
        if ((i7 & 2) == 2) {
            int i11 = cVar.f20439v;
            this.f20425i = 2 | this.f20425i;
            this.f20427w = i11;
        }
        this.f21889d = this.f21889d.b(cVar.f20436d);
    }
}
