package ar;

/* JADX INFO: loaded from: classes3.dex */
public final class o0 implements x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2948d;

    public o0(boolean z5) {
        this.f2948d = z5;
    }

    @Override // ar.x0
    public final boolean c() {
        return this.f2948d;
    }

    @Override // ar.x0
    public final k1 d() {
        return null;
    }

    public final String toString() {
        return s0.g.g(new StringBuilder("Empty{"), this.f2948d ? "Active" : "New", '}');
    }
}
