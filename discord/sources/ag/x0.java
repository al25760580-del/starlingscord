package ag;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends y0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f596v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f597w;

    public x0(byte[] bArr, int i7, int i10) {
        super(bArr);
        y0.j(i7, i7 + i10, bArr.length);
        this.f596v = i7;
        this.f597w = i10;
    }

    @Override // ag.y0
    public final byte a(int i7) {
        int i10 = this.f597w;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.f602e[this.f596v + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(kk.b.h(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a3.e.g(i7, i10, "Index > length: ", ", "));
    }

    @Override // ag.y0
    public final byte b(int i7) {
        return this.f602e[this.f596v + i7];
    }

    @Override // ag.y0
    public final int d() {
        return this.f596v;
    }

    @Override // ag.y0
    public final int e() {
        return this.f597w;
    }

    @Override // ag.y0
    public final void h(byte[] bArr, int i7) {
        System.arraycopy(this.f602e, this.f596v, bArr, 0, i7);
    }
}
