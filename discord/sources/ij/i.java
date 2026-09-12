package ij;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11813h;

    public i(byte[] bArr, int i7, int i10, int i11, int i12, int i13, int i14, boolean z5) {
        super(i13, i14, 0);
        if (i11 + i13 > i7 || i12 + i14 > i10) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f11809d = bArr;
        this.f11810e = i7;
        this.f11811f = i10;
        this.f11812g = i11;
        this.f11813h = i12;
        if (z5) {
            int i15 = (i12 * i7) + i11;
            int i16 = 0;
            while (i16 < i14) {
                int i17 = (i13 / 2) + i15;
                int i18 = (i15 + i13) - 1;
                int i19 = i15;
                while (i19 < i17) {
                    byte b10 = bArr[i19];
                    bArr[i19] = bArr[i18];
                    bArr[i18] = b10;
                    i19++;
                    i18--;
                }
                i16++;
                i15 += i7;
            }
        }
    }

    @Override // ij.f
    public final byte[] c() {
        byte[] bArr = this.f11809d;
        int i7 = this.f11804b;
        int i10 = this.f11805c;
        int i11 = this.f11810e;
        if (i7 == i11 && i10 == this.f11811f) {
            return bArr;
        }
        int i12 = i7 * i10;
        byte[] bArr2 = new byte[i12];
        int i13 = (this.f11813h * i11) + this.f11812g;
        if (i7 == i11) {
            System.arraycopy(bArr, i13, bArr2, 0, i12);
            return bArr2;
        }
        for (int i14 = 0; i14 < i10; i14++) {
            System.arraycopy(bArr, i13, bArr2, i14 * i7, i7);
            i13 += i11;
        }
        return bArr2;
    }

    @Override // ij.f
    public final byte[] d(byte[] bArr, int i7) {
        if (i7 < 0 || i7 >= this.f11805c) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i7)));
        }
        int i10 = this.f11804b;
        if (bArr == null || bArr.length < i10) {
            bArr = new byte[i10];
        }
        System.arraycopy(this.f11809d, ((i7 + this.f11813h) * this.f11810e) + this.f11812g, bArr, 0, i10);
        return bArr;
    }
}
