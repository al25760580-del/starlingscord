package hi;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends gn.h {
    @Override // gn.h
    public final void P(l lVar, l lVar2) {
        lVar.f10788b = lVar2;
    }

    @Override // gn.h
    public final void Q(l lVar, Thread thread) {
        lVar.f10787a = thread;
    }

    @Override // gn.h
    public final boolean k(m mVar, c cVar, c cVar2) {
        synchronized (mVar) {
            try {
                if (mVar.f10794e != cVar) {
                    return false;
                }
                mVar.f10794e = cVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gn.h
    public final boolean l(m mVar, Object obj, Object obj2) {
        synchronized (mVar) {
            try {
                if (mVar.f10793d != obj) {
                    return false;
                }
                mVar.f10793d = obj2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gn.h
    public final boolean m(m mVar, l lVar, l lVar2) {
        synchronized (mVar) {
            try {
                if (mVar.f10795i != lVar) {
                    return false;
                }
                mVar.f10795i = lVar2;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // gn.h
    public final c x(m mVar) {
        c cVar;
        c cVar2 = c.f10771d;
        synchronized (mVar) {
            try {
                cVar = mVar.f10794e;
                if (cVar != cVar2) {
                    mVar.f10794e = cVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // gn.h
    public final l y(m mVar) {
        l lVar;
        l lVar2 = l.f10786c;
        synchronized (mVar) {
            try {
                lVar = mVar.f10795i;
                if (lVar != lVar2) {
                    mVar.f10795i = lVar2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }
}
