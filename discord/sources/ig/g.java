package ig;

import af.w;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f11763a = new l();

    public final void a(Exception exc) {
        this.f11763a.p(exc);
    }

    public final void b(Object obj) {
        this.f11763a.q(obj);
    }

    public final boolean c(Exception exc) {
        l lVar = this.f11763a;
        lVar.getClass();
        w.h(exc, "Exception must not be null");
        synchronized (lVar.f11774a) {
            try {
                if (lVar.f11776c) {
                    return false;
                }
                lVar.f11776c = true;
                lVar.f11779f = exc;
                lVar.f11775b.f(lVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Object obj) {
        l lVar = this.f11763a;
        synchronized (lVar.f11774a) {
            try {
                if (lVar.f11776c) {
                    return;
                }
                lVar.f11776c = true;
                lVar.f11778e = obj;
                lVar.f11775b.f(lVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
