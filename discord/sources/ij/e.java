package ij;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f11802d;

    public e(f fVar) {
        super(fVar.f11804b, fVar.f11805c, 0);
        this.f11802d = fVar;
    }

    @Override // ij.f
    public final byte[] c() {
        byte[] bArrC = this.f11802d.c();
        int i7 = this.f11804b * this.f11805c;
        byte[] bArr = new byte[i7];
        for (int i10 = 0; i10 < i7; i10++) {
            bArr[i10] = (byte) (255 - (bArrC[i10] & 255));
        }
        return bArr;
    }

    @Override // ij.f
    public final byte[] d(byte[] bArr, int i7) {
        byte[] bArrD = this.f11802d.d(bArr, i7);
        for (int i10 = 0; i10 < this.f11804b; i10++) {
            bArrD[i10] = (byte) (255 - (bArrD[i10] & 255));
        }
        return bArrD;
    }

    @Override // ij.f
    public final boolean e() {
        return this.f11802d.e();
    }

    @Override // ij.f
    public final f f() {
        return new e(this.f11802d.f());
    }
}
