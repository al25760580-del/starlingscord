package yr;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23562a;

    public q0(boolean z5) {
        this.f23562a = z5;
    }

    @Override // yr.j0
    public final int a() {
        return this.f23562a ? 1 : 0;
    }

    @Override // yr.j0
    public final j0 b(int i7) {
        return new q0(this.f23562a);
    }

    public q0(boolean z5, int i7) {
        this.f23562a = z5;
    }
}
