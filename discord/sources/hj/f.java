package hj;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends g {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10826w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10827x;

    public f(byte[] bArr, int i7, int i10) {
        super(bArr);
        g.b(i7, i7 + i10, bArr.length);
        this.f10826w = i7;
        this.f10827x = i10;
    }

    @Override // hj.g
    public final byte a(int i7) {
        int i10 = this.f10827x;
        if (((i10 - (i7 + 1)) | i7) >= 0) {
            return this.f10831e[this.f10826w + i7];
        }
        if (i7 < 0) {
            throw new ArrayIndexOutOfBoundsException(kk.b.h(i7, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(a3.e.g(i7, i10, "Index > length: ", ", "));
    }

    @Override // hj.g
    public final int e() {
        return this.f10826w;
    }

    @Override // hj.g
    public final byte h(int i7) {
        return this.f10831e[this.f10826w + i7];
    }

    @Override // hj.g
    public final int size() {
        return this.f10827x;
    }
}
