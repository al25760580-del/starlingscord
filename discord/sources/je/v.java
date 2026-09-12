package je;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f13853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13855d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13856e;

    public v() {
        this.f13852a = 0;
        this.f13853b = e0.f13793f;
    }

    public void a() {
        int i7;
        int i10;
        switch (this.f13852a) {
            case 0:
                int i11 = this.f13854c;
                b.k(i11 >= 0 && (i11 < (i7 = this.f13856e) || (i11 == i7 && this.f13855d == 0)));
                break;
            default:
                int i12 = this.f13855d;
                b.k(i12 >= 0 && (i12 < (i10 = this.f13854c) || (i12 == i10 && this.f13856e == 0)));
                break;
        }
    }

    public int b() {
        return ((this.f13856e - this.f13854c) * 8) - this.f13855d;
    }

    public void c() {
        if (this.f13855d == 0) {
            return;
        }
        this.f13855d = 0;
        this.f13854c++;
        a();
    }

    public boolean d(int i7) {
        int i10 = this.f13855d;
        int i11 = i7 / 8;
        int i12 = i10 + i11;
        int i13 = (this.f13856e + i7) - (i11 * 8);
        if (i13 > 7) {
            i12++;
            i13 -= 8;
        }
        while (true) {
            i10++;
            if (i10 > i12 || i12 >= this.f13854c) {
                break;
            }
            if (q(i10)) {
                i12++;
                i10 += 2;
            }
        }
        int i14 = this.f13854c;
        if (i12 >= i14) {
            return i12 == i14 && i13 == 0;
        }
        return true;
    }

    public boolean e() {
        int i7 = this.f13855d;
        int i10 = this.f13856e;
        int i11 = 0;
        while (this.f13855d < this.f13854c && !h()) {
            i11++;
        }
        boolean z5 = this.f13855d == this.f13854c;
        this.f13855d = i7;
        this.f13856e = i10;
        return !z5 && d((i11 * 2) + 1);
    }

    public int f() {
        b.k(this.f13855d == 0);
        return this.f13854c;
    }

    public int g() {
        return (this.f13854c * 8) + this.f13855d;
    }

    public boolean h() {
        switch (this.f13852a) {
            case 0:
                boolean z5 = (this.f13853b[this.f13854c] & (IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT >> this.f13855d)) != 0;
                r();
                return z5;
            case 1:
                boolean z6 = (this.f13853b[this.f13855d] & (IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT >> this.f13856e)) != 0;
                r();
                return z6;
            default:
                boolean z7 = (((this.f13853b[this.f13855d] & 255) >> this.f13856e) & 1) == 1;
                s(1);
                return z7;
        }
    }

    public int i(int i7) {
        switch (this.f13852a) {
            case 0:
                if (i7 == 0) {
                    return 0;
                }
                this.f13855d += i7;
                int i10 = 0;
                while (true) {
                    int i11 = this.f13855d;
                    if (i11 <= 8) {
                        byte[] bArr = this.f13853b;
                        int i12 = this.f13854c;
                        int i13 = ((-1) >>> (32 - i7)) & (i10 | ((bArr[i12] & 255) >> (8 - i11)));
                        if (i11 == 8) {
                            this.f13855d = 0;
                            this.f13854c = i12 + 1;
                        }
                        a();
                        return i13;
                    }
                    int i14 = i11 - 8;
                    this.f13855d = i14;
                    byte[] bArr2 = this.f13853b;
                    int i15 = this.f13854c;
                    this.f13854c = i15 + 1;
                    i10 |= (bArr2[i15] & 255) << i14;
                }
                break;
            case 1:
                this.f13856e += i7;
                int i16 = 0;
                while (true) {
                    int i17 = this.f13856e;
                    int i18 = 2;
                    if (i17 <= 8) {
                        byte[] bArr3 = this.f13853b;
                        int i19 = this.f13855d;
                        int i20 = ((-1) >>> (32 - i7)) & (i16 | ((bArr3[i19] & 255) >> (8 - i17)));
                        if (i17 == 8) {
                            this.f13856e = 0;
                            this.f13855d = i19 + (q(i19 + 1) ? 2 : 1);
                        }
                        a();
                        return i20;
                    }
                    int i21 = i17 - 8;
                    this.f13856e = i21;
                    byte[] bArr4 = this.f13853b;
                    int i22 = this.f13855d;
                    i16 |= (bArr4[i22] & 255) << i21;
                    if (!q(i22 + 1)) {
                        i18 = 1;
                    }
                    this.f13855d = i22 + i18;
                }
                break;
            default:
                int i23 = this.f13855d;
                int iMin = Math.min(i7, 8 - this.f13856e);
                byte[] bArr5 = this.f13853b;
                int i24 = i23 + 1;
                int i25 = ((bArr5[i23] & 255) >> this.f13856e) & (255 >> (8 - iMin));
                while (iMin < i7) {
                    i25 |= (bArr5[i24] & 255) << iMin;
                    iMin += 8;
                    i24++;
                }
                int i26 = i25 & ((-1) >>> (32 - i7));
                s(i7);
                return i26;
        }
    }

    public void j(byte[] bArr, int i7) {
        int i10 = i7 >> 3;
        for (int i11 = 0; i11 < i10; i11++) {
            byte[] bArr2 = this.f13853b;
            int i12 = this.f13854c;
            int i13 = i12 + 1;
            this.f13854c = i13;
            byte b10 = bArr2[i12];
            int i14 = this.f13855d;
            byte b11 = (byte) (b10 << i14);
            bArr[i11] = b11;
            bArr[i11] = (byte) (((255 & bArr2[i13]) >> (8 - i14)) | b11);
        }
        int i15 = i7 & 7;
        if (i15 == 0) {
            return;
        }
        byte b12 = (byte) (bArr[i10] & (255 >> i15));
        bArr[i10] = b12;
        int i16 = this.f13855d;
        if (i16 + i15 > 8) {
            byte[] bArr3 = this.f13853b;
            int i17 = this.f13854c;
            this.f13854c = i17 + 1;
            bArr[i10] = (byte) (b12 | ((bArr3[i17] & 255) << i16));
            this.f13855d = i16 - 8;
        }
        int i18 = this.f13855d + i15;
        this.f13855d = i18;
        byte[] bArr4 = this.f13853b;
        int i19 = this.f13854c;
        bArr[i10] = (byte) (((byte) (((255 & bArr4[i19]) >> (8 - i18)) << (8 - i15))) | bArr[i10]);
        if (i18 == 8) {
            this.f13855d = 0;
            this.f13854c = i19 + 1;
        }
        a();
    }

    public void k(byte[] bArr, int i7) {
        b.k(this.f13855d == 0);
        System.arraycopy(this.f13853b, this.f13854c, bArr, 0, i7);
        this.f13854c += i7;
        a();
    }

    public int l() {
        int i7 = 0;
        while (!h()) {
            i7++;
        }
        return ((1 << i7) - 1) + (i7 > 0 ? i(i7) : 0);
    }

    public int m() {
        int iL = l();
        return ((iL + 1) / 2) * (iL % 2 == 0 ? -1 : 1);
    }

    public void n(w wVar) {
        o(wVar.f13860a, wVar.f13862c);
        p(wVar.f13861b * 8);
    }

    public void o(byte[] bArr, int i7) {
        this.f13853b = bArr;
        this.f13854c = 0;
        this.f13855d = 0;
        this.f13856e = i7;
    }

    public void p(int i7) {
        int i10 = i7 / 8;
        this.f13854c = i10;
        this.f13855d = i7 - (i10 * 8);
        a();
    }

    public boolean q(int i7) {
        if (2 > i7 || i7 >= this.f13854c) {
            return false;
        }
        byte[] bArr = this.f13853b;
        return bArr[i7] == 3 && bArr[i7 + (-2)] == 0 && bArr[i7 - 1] == 0;
    }

    public void r() {
        switch (this.f13852a) {
            case 0:
                int i7 = this.f13855d + 1;
                this.f13855d = i7;
                if (i7 == 8) {
                    this.f13855d = 0;
                    this.f13854c++;
                }
                a();
                break;
            default:
                int i10 = this.f13856e + 1;
                this.f13856e = i10;
                if (i10 == 8) {
                    this.f13856e = 0;
                    int i11 = this.f13855d;
                    this.f13855d = i11 + (q(i11 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void s(int i7) {
        int i10;
        switch (this.f13852a) {
            case 0:
                int i11 = i7 / 8;
                int i12 = this.f13854c + i11;
                this.f13854c = i12;
                int i13 = (i7 - (i11 * 8)) + this.f13855d;
                this.f13855d = i13;
                if (i13 > 7) {
                    this.f13854c = i12 + 1;
                    this.f13855d = i13 - 8;
                }
                a();
                break;
            case 1:
                int i14 = this.f13855d;
                int i15 = i7 / 8;
                int i16 = i14 + i15;
                this.f13855d = i16;
                int i17 = (i7 - (i15 * 8)) + this.f13856e;
                this.f13856e = i17;
                if (i17 > 7) {
                    this.f13855d = i16 + 1;
                    this.f13856e = i17 - 8;
                }
                while (true) {
                    i14++;
                    if (i14 > this.f13855d) {
                        a();
                        break;
                    } else if (q(i14)) {
                        this.f13855d++;
                        i14 += 2;
                    }
                }
                break;
            default:
                int i18 = i7 / 8;
                int i19 = this.f13855d + i18;
                this.f13855d = i19;
                int i20 = (i7 - (i18 * 8)) + this.f13856e;
                this.f13856e = i20;
                boolean z5 = true;
                if (i20 > 7) {
                    this.f13855d = i19 + 1;
                    this.f13856e = i20 - 8;
                }
                int i21 = this.f13855d;
                if (i21 < 0 || (i21 >= (i10 = this.f13854c) && (i21 != i10 || this.f13856e != 0))) {
                    z5 = false;
                }
                b.k(z5);
                break;
        }
    }

    public void t(int i7) {
        b.k(this.f13855d == 0);
        this.f13854c += i7;
        a();
    }

    public v(byte[] bArr, int i7, int i10) {
        this.f13852a = 1;
        this.f13853b = bArr;
        this.f13855d = i7;
        this.f13854c = i10;
        this.f13856e = 0;
        a();
    }

    public v(byte[] bArr) {
        this.f13852a = 2;
        this.f13853b = bArr;
        this.f13854c = bArr.length;
    }

    public v(byte[] bArr, int i7) {
        this.f13852a = 0;
        this.f13853b = bArr;
        this.f13856e = i7;
    }

    public v(int i7, int i10) {
        this.f13852a = 3;
        this.f13854c = i7;
        this.f13855d = i10;
        this.f13853b = new byte[(i10 * 2) - 1];
        this.f13856e = 0;
    }
}
