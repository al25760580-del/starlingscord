package ic;

import com.facebook.react.common.assets.ReactFontManager;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f11613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f11614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f11615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f11617g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11618h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f11619i;
    public short[] j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f11620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f11622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f11625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f11628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11630v;

    public q0(int i7, int i10, float f2, float f7, int i11) {
        this.f11611a = i7;
        this.f11612b = i10;
        this.f11613c = f2;
        this.f11614d = f7;
        this.f11615e = i7 / i11;
        this.f11616f = i7 / ReactFontManager.TypefaceStyle.NORMAL;
        int i12 = i7 / 65;
        this.f11617g = i12;
        int i13 = i12 * 2;
        this.f11618h = i13;
        this.f11619i = new short[i13];
        this.j = new short[i13 * i10];
        this.f11620l = new short[i13 * i10];
        this.f11622n = new short[i13 * i10];
    }

    public static void e(int i7, int i10, short[] sArr, int i11, short[] sArr2, int i12, short[] sArr3, int i13) {
        for (int i14 = 0; i14 < i10; i14++) {
            int i15 = (i11 * i10) + i14;
            int i16 = (i13 * i10) + i14;
            int i17 = (i12 * i10) + i14;
            for (int i18 = 0; i18 < i7; i18++) {
                sArr[i15] = (short) (((sArr3[i16] * i18) + ((i7 - i18) * sArr2[i17])) / i7);
                i15 += i10;
                i17 += i10;
                i16 += i10;
            }
        }
    }

    public final void a(short[] sArr, int i7, int i10) {
        short[] sArrC = c(this.f11620l, this.f11621m, i10);
        this.f11620l = sArrC;
        int i11 = this.f11612b;
        System.arraycopy(sArr, i7 * i11, sArrC, this.f11621m * i11, i11 * i10);
        this.f11621m += i10;
    }

    public final void b(short[] sArr, int i7, int i10) {
        int i11 = this.f11618h / i10;
        int i12 = this.f11612b;
        int i13 = i10 * i12;
        int i14 = i7 * i12;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = 0;
            for (int i17 = 0; i17 < i13; i17++) {
                i16 += sArr[(i15 * i13) + i14 + i17];
            }
            this.f11619i[i15] = (short) (i16 / i13);
        }
    }

    public final short[] c(short[] sArr, int i7, int i10) {
        int length = sArr.length;
        int i11 = this.f11612b;
        int i12 = length / i11;
        return i7 + i10 <= i12 ? sArr : Arrays.copyOf(sArr, (((i12 * 3) / 2) + i10) * i11);
    }

    public final int d(short[] sArr, int i7, int i10, int i11) {
        int i12 = i7 * this.f11612b;
        int i13 = 255;
        int i14 = 1;
        int i15 = 0;
        int i16 = 0;
        while (i10 <= i11) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i10; i17++) {
                iAbs += Math.abs(sArr[i12 + i17] - sArr[(i12 + i10) + i17]);
            }
            if (iAbs * i15 < i14 * i10) {
                i15 = i10;
                i14 = iAbs;
            }
            if (iAbs * i13 > i16 * i10) {
                i13 = i10;
                i16 = iAbs;
            }
            i10++;
        }
        this.f11629u = i14 / i15;
        this.f11630v = i16 / i13;
        return i15;
    }

    public final void f() {
        float f2;
        float f7;
        float f10;
        double d6;
        int iD;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = this.f11621m;
        float f11 = this.f11613c;
        float f12 = this.f11614d;
        float f13 = f11 / f12;
        float f14 = this.f11615e * f12;
        double d7 = f13;
        int i17 = this.f11611a;
        int i18 = 1;
        int i19 = this.f11612b;
        if (d7 > 1.00001d || d7 < 0.99999d) {
            int i20 = this.k;
            int i21 = this.f11618h;
            if (i20 >= i21) {
                int i22 = 0;
                while (true) {
                    int i23 = this.f11626r;
                    if (i23 > 0) {
                        int iMin = Math.min(i21, i23);
                        a(this.j, i22, iMin);
                        this.f11626r -= iMin;
                        i22 += iMin;
                        f7 = f13;
                        f10 = f14;
                        d6 = d7;
                        f2 = 1.0f;
                    } else {
                        short[] sArr = this.j;
                        int i24 = i17 > 4000 ? i17 / 4000 : i18;
                        f2 = 1.0f;
                        int i25 = this.f11617g;
                        int i26 = this.f11616f;
                        if (i19 == i18 && i24 == i18) {
                            iD = d(sArr, i22, i26, i25);
                            f7 = f13;
                            f10 = f14;
                            d6 = d7;
                        } else {
                            b(sArr, i22, i24);
                            f7 = f13;
                            f10 = f14;
                            short[] sArr2 = this.f11619i;
                            d6 = d7;
                            int iD2 = d(sArr2, 0, i26 / i24, i25 / i24);
                            if (i24 != 1) {
                                int i27 = iD2 * i24;
                                int i28 = i24 * 4;
                                int i29 = i27 - i28;
                                int i30 = i27 + i28;
                                if (i29 >= i26) {
                                    i26 = i29;
                                }
                                if (i30 <= i25) {
                                    i25 = i30;
                                }
                                if (i19 == 1) {
                                    iD = d(sArr, i22, i26, i25);
                                } else {
                                    b(sArr, i22, 1);
                                    iD = d(sArr2, 0, i26, i25);
                                }
                            } else {
                                iD = iD2;
                            }
                        }
                        int i31 = this.f11629u;
                        int i32 = this.f11630v;
                        if (i31 == 0 || (i7 = this.f11627s) == 0 || i32 > i31 * 3 || i31 * 2 <= this.f11628t * 3) {
                            i7 = iD;
                        }
                        this.f11628t = i31;
                        this.f11627s = iD;
                        if (d6 > 1.0d) {
                            short[] sArr3 = this.j;
                            if (f7 >= 2.0f) {
                                i11 = (int) (i7 / (f7 - 1.0f));
                            } else {
                                this.f11626r = (int) (((2.0f - f7) * i7) / (f7 - 1.0f));
                                i11 = i7;
                            }
                            short[] sArrC = c(this.f11620l, this.f11621m, i11);
                            this.f11620l = sArrC;
                            int i33 = i22 + i7;
                            int i34 = i22;
                            int i35 = i11;
                            e(i35, this.f11612b, sArrC, this.f11621m, sArr3, i34, sArr3, i33);
                            this.f11621m += i35;
                            i22 = i7 + i35 + i34;
                        } else {
                            int i36 = i22;
                            short[] sArr4 = this.j;
                            if (f7 < 0.5f) {
                                i10 = (int) ((i7 * f7) / (1.0f - f7));
                            } else {
                                this.f11626r = (int) ((((2.0f * f7) - 1.0f) * i7) / (1.0f - f7));
                                i10 = i7;
                            }
                            int i37 = i7 + i10;
                            short[] sArrC2 = c(this.f11620l, this.f11621m, i37);
                            this.f11620l = sArrC2;
                            System.arraycopy(sArr4, i36 * i19, sArrC2, this.f11621m * i19, i7 * i19);
                            e(i10, this.f11612b, this.f11620l, this.f11621m + i7, sArr4, i36 + i7, sArr4, i36);
                            this.f11621m += i37;
                            i22 = i36 + i10;
                        }
                    }
                    if (i22 + i21 > i20) {
                        break;
                    }
                    i18 = 1;
                    f13 = f7;
                    f14 = f10;
                    d7 = d6;
                }
                int i38 = this.k - i22;
                short[] sArr5 = this.j;
                System.arraycopy(sArr5, i22 * i19, sArr5, 0, i38 * i19);
                this.k = i38;
            }
            if (f10 != f2 || this.f11621m == i16) {
            }
            int i39 = (int) (i17 / f10);
            while (true) {
                if (i39 <= 16384 && i17 <= 16384) {
                    break;
                }
                i39 /= 2;
                i17 /= 2;
            }
            int i40 = this.f11621m - i16;
            short[] sArrC3 = c(this.f11622n, this.f11623o, i40);
            this.f11622n = sArrC3;
            System.arraycopy(this.f11620l, i16 * i19, sArrC3, this.f11623o * i19, i40 * i19);
            this.f11621m = i16;
            this.f11623o += i40;
            int i41 = 0;
            while (true) {
                i12 = this.f11623o;
                i13 = i12 - 1;
                if (i41 >= i13) {
                    break;
                }
                while (true) {
                    i14 = this.f11624p + 1;
                    int i42 = i14 * i39;
                    i15 = this.f11625q;
                    if (i42 <= i15 * i17) {
                        break;
                    }
                    this.f11620l = c(this.f11620l, this.f11621m, 1);
                    for (int i43 = 0; i43 < i19; i43++) {
                        short[] sArr6 = this.f11620l;
                        int i44 = (this.f11621m * i19) + i43;
                        short[] sArr7 = this.f11622n;
                        int i45 = (i41 * i19) + i43;
                        short s2 = sArr7[i45];
                        short s5 = sArr7[i45 + i19];
                        int i46 = this.f11625q * i17;
                        int i47 = this.f11624p;
                        int i48 = i47 * i39;
                        int i49 = (i47 + 1) * i39;
                        int i50 = i49 - i46;
                        int i51 = i49 - i48;
                        sArr6[i44] = (short) ((((i51 - i50) * s5) + (s2 * i50)) / i51);
                    }
                    this.f11625q++;
                    this.f11621m++;
                }
                this.f11624p = i14;
                if (i14 == i17) {
                    this.f11624p = 0;
                    je.b.k(i15 == i39);
                    this.f11625q = 0;
                }
                i41++;
            }
            if (i13 == 0) {
                return;
            }
            short[] sArr8 = this.f11622n;
            System.arraycopy(sArr8, i13 * i19, sArr8, 0, (i12 - i13) * i19);
            this.f11623o -= i13;
            return;
        }
        a(this.j, 0, this.k);
        this.k = 0;
        f10 = f14;
        f2 = 1.0f;
        if (f10 != f2) {
        }
    }
}
