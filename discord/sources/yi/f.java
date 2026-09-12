package yi;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f23367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ig.g f23368b;

    public f(j jVar, ig.g gVar) {
        this.f23367a = jVar;
        this.f23368b = gVar;
    }

    @Override // yi.i
    public final boolean a(Exception exc) {
        this.f23368b.c(exc);
        return true;
    }

    @Override // yi.i
    public final boolean b(zi.a aVar) {
        if (aVar.f24008b != 4 || this.f23367a.a(aVar)) {
            return false;
        }
        String str = aVar.f24009c;
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f23368b.b(new a(aVar.f24011e, aVar.f24012f, str));
        return true;
    }
}
