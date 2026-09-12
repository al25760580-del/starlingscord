package g4;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = h.f9489y;
        }
        if (!h.f9488x.h(this, null, obj)) {
            return false;
        }
        h.d(this);
        return true;
    }

    public final boolean k(Throwable th2) {
        if (!h.f9488x.h(this, null, new b(th2))) {
            return false;
        }
        h.d(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean l(ListenableFuture listenableFuture) {
        b bVar;
        listenableFuture.getClass();
        Object obj = this.f9490d;
        if (obj != null) {
            if (obj instanceof a) {
                listenableFuture.cancel(((a) obj).f9468a);
            }
        } else if (listenableFuture.isDone()) {
            if (h.f9488x.h(this, null, h.g(listenableFuture))) {
                h.d(this);
                return true;
            }
        } else {
            e eVar = new e(this, listenableFuture);
            if (h.f9488x.h(this, null, eVar)) {
                try {
                    listenableFuture.a(eVar, i.f9493d);
                    return true;
                } catch (Throwable th2) {
                    try {
                        bVar = new b(th2);
                    } catch (Throwable unused) {
                        bVar = b.f9470b;
                    }
                    h.f9488x.h(this, eVar, bVar);
                    return true;
                }
            }
            obj = this.f9490d;
            if (obj instanceof a) {
                listenableFuture.cancel(((a) obj).f9468a);
            }
        }
        return false;
    }
}
