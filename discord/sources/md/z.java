package md;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements o0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f15740d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f15741e;

    public z(o0 o0Var, long j) {
        this.f15740d = o0Var;
        this.f15741e = j;
    }

    @Override // md.o0
    public final void b() {
        this.f15740d.b();
    }

    @Override // md.o0
    public final int c(e4.r rVar, lc.f fVar, int i7) {
        int iC = this.f15740d.c(rVar, fVar, i7);
        if (iC == -4) {
            fVar.f15012x = Math.max(0L, fVar.f15012x + this.f15741e);
        }
        return iC;
    }

    @Override // md.o0
    public final int f(long j) {
        return this.f15740d.f(j - this.f15741e);
    }

    @Override // md.o0
    public final boolean isReady() {
        return this.f15740d.isReady();
    }
}
