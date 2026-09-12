package pp;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends vp.i implements vp.u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f18211e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18212i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18213v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f18214w;

    public /* synthetic */ b(int i7) {
        this.f18211e = i7;
    }

    @Override // vp.i
    public final vp.a c() {
        switch (this.f18211e) {
            case 0:
                f fVarF = f();
                if (fVarF.b()) {
                    return fVarF;
                }
                throw new androidx.datastore.preferences.protobuf.d1();
            default:
                l lVarG = g();
                if (lVarG.b()) {
                    return lVarG;
                }
                throw new androidx.datastore.preferences.protobuf.d1();
        }
    }

    public final Object clone() {
        switch (this.f18211e) {
            case 0:
                b bVar = new b(0);
                bVar.f18214w = e.M;
                bVar.h(f());
                return bVar;
            default:
                b bVar2 = new b(1);
                bVar2.f18214w = vp.d.f21871d;
                bVar2.j(g());
                return bVar2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020  */
    /* JADX WARN: Code duplicated, block: B:30:0x003f  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        switch (this.f18211e) {
            case 0:
                f fVar = null;
                try {
                    try {
                        f.E.getClass();
                        h(new f(eVar, gVar));
                        return this;
                    } catch (Throwable th2) {
                        th = th2;
                        if (fVar != null) {
                            h(fVar);
                        }
                        throw th;
                    }
                } catch (vp.q e10) {
                    f fVar2 = (f) e10.f21916d;
                    try {
                        throw e10;
                    } catch (Throwable th3) {
                        th = th3;
                        fVar = fVar2;
                        if (fVar != null) {
                            h(fVar);
                        }
                        throw th;
                    }
                }
            default:
                l lVar = null;
                try {
                    try {
                        l.E.getClass();
                        j(new l(eVar));
                        return this;
                    } catch (Throwable th4) {
                        th = th4;
                        if (lVar != null) {
                            j(lVar);
                        }
                        throw th;
                    }
                } catch (vp.q e11) {
                    l lVar2 = (l) e11.f21916d;
                    try {
                        throw e11;
                    } catch (Throwable th5) {
                        th = th5;
                        lVar = lVar2;
                        if (lVar != null) {
                            j(lVar);
                        }
                        throw th;
                    }
                }
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        switch (this.f18211e) {
            case 0:
                h((f) nVar);
                break;
            default:
                j((l) nVar);
                break;
        }
        return this;
    }

    public f f() {
        f fVar = new f(this);
        int i7 = this.f18212i;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        fVar.f18275i = this.f18213v;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        fVar.f18276v = (e) this.f18214w;
        fVar.f18274e = i10;
        return fVar;
    }

    public l g() {
        l lVar = new l(this);
        int i7 = this.f18212i;
        int i10 = (i7 & 1) != 1 ? 0 : 1;
        lVar.f18354i = this.f18213v;
        if ((i7 & 2) == 2) {
            i10 |= 2;
        }
        lVar.f18355v = (vp.t) this.f18214w;
        lVar.f18353e = i10;
        return lVar;
    }

    public void h(f fVar) {
        e eVar;
        if (fVar == f.f18272y) {
            return;
        }
        int i7 = fVar.f18274e;
        if ((i7 & 1) == 1) {
            int i10 = fVar.f18275i;
            this.f18212i = 1 | this.f18212i;
            this.f18213v = i10;
        }
        if ((i7 & 2) == 2) {
            e eVar2 = fVar.f18276v;
            if ((this.f18212i & 2) != 2 || (eVar = (e) this.f18214w) == e.M) {
                this.f18214w = eVar2;
            } else {
                c cVarG = c.g();
                cVarG.h(eVar);
                cVarG.h(eVar2);
                this.f18214w = cVarG.f();
            }
            this.f18212i |= 2;
        }
        this.f21889d = this.f21889d.b(fVar.f18273d);
    }

    public void j(l lVar) {
        if (lVar == l.f18351y) {
            return;
        }
        int i7 = lVar.f18353e;
        if ((i7 & 1) == 1) {
            int i10 = lVar.f18354i;
            this.f18212i = 1 | this.f18212i;
            this.f18213v = i10;
        }
        if ((i7 & 2) == 2) {
            vp.t tVar = lVar.f18355v;
            tVar.getClass();
            this.f18212i = 2 | this.f18212i;
            this.f18214w = tVar;
        }
        this.f21889d = this.f21889d.b(lVar.f18352d);
    }
}
