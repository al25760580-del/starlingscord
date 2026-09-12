package mi;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements xi.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f15826c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f15827a = f15826c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile xi.a f15828b;

    public m(xi.a aVar) {
        this.f15828b = aVar;
    }

    @Override // xi.a
    public final Object get() {
        Object obj;
        Object obj2 = this.f15827a;
        Object obj3 = f15826c;
        if (obj2 != obj3) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.f15827a;
                if (obj == obj3) {
                    obj = this.f15828b.get();
                    this.f15827a = obj;
                    this.f15828b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }
}
