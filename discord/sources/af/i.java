package af;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static i f444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f445c = new j(0, 0, 0, false, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f446a;

    public /* synthetic */ i(Object obj) {
        this.f446a = obj;
    }

    public static synchronized i a() {
        try {
            if (f444b == null) {
                f444b = new i();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f444b;
    }

    @Override // af.b
    public void g(xe.b bVar) {
        gg.a aVar = (gg.a) this.f446a;
        if (bVar.f22910e == 0) {
            aVar.f(null, aVar.T);
            return;
        }
        i iVar = aVar.L;
        if (iVar != null) {
            ((ye.k) iVar.f446a).j(bVar);
        }
    }
}
