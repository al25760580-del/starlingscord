package yr;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23553c;

    public m0(int i7, int i10, Object obj) {
        if (i7 < 1 || i7 > 18) {
            throw new IllegalArgumentException(kk.b.h(i7, "Min width out of bounds: "));
        }
        if (i10 < i7) {
            throw new IllegalArgumentException("Max width smaller than min width.");
        }
        if (i10 > 18) {
            throw new IllegalArgumentException(kk.b.h(i10, "Max width out of bounds: "));
        }
        if (obj == null) {
            throw new NullPointerException("Missing unit.");
        }
        this.f23551a = i7;
        this.f23552b = i10;
        this.f23553c = obj;
    }

    @Override // yr.j0
    public final int a() {
        return this.f23551a;
    }

    @Override // yr.j0
    public final j0 b(int i7) {
        return new m0(this.f23551a, this.f23552b, this.f23553c);
    }
}
