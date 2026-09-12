package xb;

import javax.inject.Provider;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Provider {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f22738i = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b f22739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f22740e;

    public static Provider a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f22740e = f22738i;
        aVar.f22739d = bVar;
        return aVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Object obj;
        Object obj2 = this.f22740e;
        Object obj3 = f22738i;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f22740e;
                if (obj == obj3) {
                    obj = this.f22739d.get();
                    Object obj4 = this.f22740e;
                    if (obj4 != obj3 && obj4 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f22740e = obj;
                    this.f22739d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
