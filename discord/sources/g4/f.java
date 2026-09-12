package g4;

/* JADX INFO: loaded from: classes.dex */
public final class f extends ls.d {
    @Override // ls.d
    public final boolean g(h hVar, c cVar, c cVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f9491e != cVar) {
                    return false;
                }
                hVar.f9491e = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ls.d
    public final boolean h(h hVar, Object obj, Object obj2) {
        synchronized (hVar) {
            try {
                if (hVar.f9490d != obj) {
                    return false;
                }
                hVar.f9490d = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ls.d
    public final boolean i(h hVar, g gVar, g gVar2) {
        synchronized (hVar) {
            try {
                if (hVar.f9492i != gVar) {
                    return false;
                }
                hVar.f9492i = gVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ls.d
    public final void w(g gVar, g gVar2) {
        gVar.f9485b = gVar2;
    }

    @Override // ls.d
    public final void x(g gVar, Thread thread) {
        gVar.f9484a = thread;
    }
}
