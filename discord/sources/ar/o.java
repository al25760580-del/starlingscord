package ar;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends d1 implements n {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i1 f2947w;

    public o(i1 i1Var) {
        this.f2947w = i1Var;
    }

    @Override // ar.n
    public final boolean a(Throwable th2) {
        return i().E(th2);
    }

    @Override // ar.d1
    public final boolean j() {
        return true;
    }

    @Override // ar.d1
    public final void k(Throwable th2) {
        this.f2947w.x(i());
    }
}
