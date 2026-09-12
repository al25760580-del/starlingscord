package yr;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23548b;

    public k0(int i7, Object obj) {
        if (i7 < 1 || i7 > 9) {
            throw new IllegalArgumentException(kk.b.h(i7, "Fraction width out of bounds: "));
        }
        this.f23547a = i7;
        this.f23548b = obj;
    }

    @Override // yr.j0
    public final int a() {
        return this.f23547a;
    }

    @Override // yr.j0
    public final j0 b(int i7) {
        return new k0(this.f23547a, this.f23548b);
    }
}
