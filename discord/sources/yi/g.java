package yi;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ig.g f23369a;

    public g(ig.g gVar) {
        this.f23369a = gVar;
    }

    @Override // yi.i
    public final boolean a(Exception exc) {
        return false;
    }

    @Override // yi.i
    public final boolean b(zi.a aVar) {
        int i7 = aVar.f24008b;
        if (i7 != 3 && i7 != 4 && i7 != 5) {
            return false;
        }
        this.f23369a.d(aVar.f24007a);
        return true;
    }
}
