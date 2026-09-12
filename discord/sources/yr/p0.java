package yr;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f23560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f23561b;

    public p0(char c8, char c10) {
        this.f23560a = c8;
        this.f23561b = c10;
    }

    @Override // yr.j0
    public final int a() {
        return 1;
    }

    @Override // yr.j0
    public final j0 b(int i7) {
        return new p0(this.f23560a, this.f23561b);
    }
}
