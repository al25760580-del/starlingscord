package th;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f20773i = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f20774d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f20775e = f20773i;

    public f(g gVar) {
        this.f20774d = gVar;
    }

    public static f b(g gVar) {
        return gVar instanceof f ? (f) gVar : new f(gVar);
    }

    @Override // th.g
    public final Object a() {
        Object obj = this.f20775e;
        Object obj2 = f20773i;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f20775e;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objA = this.f20774d.a();
                Object obj4 = this.f20775e;
                if (obj4 != obj2 && obj4 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.f20775e = objA;
                this.f20774d = null;
                return objA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
