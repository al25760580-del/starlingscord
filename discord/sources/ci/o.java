package ci;

/* JADX INFO: loaded from: classes3.dex */
public final class o implements r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f3718i = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile p f3719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f3720e;

    /* JADX WARN: Multi-variable type inference failed */
    public static o b(p pVar) {
        if (pVar instanceof o) {
            return (o) pVar;
        }
        o oVar = new o();
        oVar.f3720e = f3718i;
        oVar.f3719d = pVar;
        return oVar;
    }

    @Override // ci.r
    public final Object a() {
        Object obj = this.f3720e;
        Object obj2 = f3718i;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            try {
                Object obj3 = this.f3720e;
                if (obj3 != obj2) {
                    return obj3;
                }
                Object objA = this.f3719d.a();
                Object obj4 = this.f3720e;
                if (obj4 != obj2 && obj4 != objA) {
                    throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + objA + ". This is likely due to a circular dependency.");
                }
                this.f3720e = objA;
                this.f3719d = null;
                return objA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
