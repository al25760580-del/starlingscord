package pp;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends vp.j {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18449v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18450w;

    @Override // vp.i
    public final vp.a c() {
        v vVar = new v(this);
        int i7 = (this.f18449v & 1) != 1 ? 0 : 1;
        vVar.f18460v = this.f18450w;
        vVar.f18459i = i7;
        if (vVar.b()) {
            return vVar;
        }
        throw new androidx.datastore.preferences.protobuf.d1();
    }

    public final Object clone() {
        u uVar = new u();
        v vVar = new v(this);
        int i7 = (this.f18449v & 1) != 1 ? 0 : 1;
        vVar.f18460v = this.f18450w;
        vVar.f18459i = i7;
        uVar.g(vVar);
        return uVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // vp.i
    public final vp.i d(vp.e eVar, vp.g gVar) throws Throwable {
        v vVar = null;
        try {
            try {
                v.E.getClass();
                g(new v(eVar, gVar));
                return this;
            } catch (vp.q e10) {
                v vVar2 = (v) e10.f21916d;
                try {
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    vVar = vVar2;
                    if (vVar != null) {
                        g(vVar);
                    }
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (vVar != null) {
                g(vVar);
            }
            throw th;
        }
    }

    @Override // vp.i
    public final /* bridge */ /* synthetic */ vp.i e(vp.n nVar) {
        g((v) nVar);
        return this;
    }

    public final void g(v vVar) {
        if (vVar == v.f18457y) {
            return;
        }
        if ((vVar.f18459i & 1) == 1) {
            int i7 = vVar.f18460v;
            this.f18449v = 1 | this.f18449v;
            this.f18450w = i7;
        }
        f(vVar);
        this.f21889d = this.f21889d.b(vVar.f18458e);
    }
}
