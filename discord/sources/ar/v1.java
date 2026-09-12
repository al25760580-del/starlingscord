package ar;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 extends fr.t implements Runnable {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f2973w;

    public v1(long j, xn.c cVar) {
        super(cVar, cVar.getContext());
        this.f2973w = j;
    }

    @Override // ar.i1
    public final String W() {
        return super.W() + "(timeMillis=" + this.f2973w + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0.n(this.f2883i);
        x(new u1("Timed out waiting for " + this.f2973w + " ms", this));
    }
}
