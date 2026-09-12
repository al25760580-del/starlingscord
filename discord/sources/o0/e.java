package o0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ib.a {
    @Override // ib.a
    public final void C(f fVar, f fVar2) {
        fVar.f17091b = fVar2;
    }

    @Override // ib.a
    public final void D(f fVar, Thread thread) {
        fVar.f17090a = thread;
    }

    @Override // ib.a
    public final boolean f(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f17097e != cVar) {
                    return false;
                }
                gVar.f17097e = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ib.a
    public final boolean g(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f17096d != obj) {
                    return false;
                }
                gVar.f17096d = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ib.a
    public final boolean h(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f17098i != fVar) {
                    return false;
                }
                gVar.f17098i = fVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
