package uj;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.zxing.Result;
import ij.m;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f21135d = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f21136e = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char[] f21137f = {'A', 'B', 'C', 'D'};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f21138a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f21139b = new int[80];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21140c = 0;

    public static boolean g(char[] cArr, char c8) {
        if (cArr != null) {
            for (char c10 : cArr) {
                if (c10 == c8) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // uj.h
    public final Result b(int i7, mj.a aVar, Map map) throws ij.h {
        int i10;
        int[] iArr;
        int i11;
        Arrays.fill(this.f21139b, 0);
        this.f21140c = 0;
        int iC = aVar.c(0);
        int i12 = aVar.f15838e;
        if (iC >= i12) {
            throw ij.h.f11808i;
        }
        int i13 = 1;
        int i14 = 0;
        boolean z5 = true;
        while (iC < i12) {
            if (aVar.a(iC) != z5) {
                i14++;
            } else {
                int[] iArr2 = this.f21139b;
                int i15 = this.f21140c;
                iArr2[i15] = i14;
                int i16 = i15 + 1;
                this.f21140c = i16;
                if (i16 >= iArr2.length) {
                    int[] iArr3 = new int[i16 << 1];
                    System.arraycopy(iArr2, 0, iArr3, 0, i16);
                    this.f21139b = iArr3;
                }
                z5 = !z5;
                i14 = 1;
            }
            iC++;
        }
        int[] iArr4 = this.f21139b;
        int i17 = this.f21140c;
        iArr4[i17] = i14;
        int i18 = i17 + 1;
        this.f21140c = i18;
        if (i18 >= iArr4.length) {
            int[] iArr5 = new int[i18 << 1];
            System.arraycopy(iArr4, 0, iArr5, 0, i18);
            this.f21139b = iArr5;
        }
        int i19 = 1;
        while (i19 < this.f21140c) {
            int iH = h(i19);
            if (iH != -1) {
                char[] cArr = f21135d;
                char c8 = cArr[iH];
                char[] cArr2 = f21137f;
                if (g(cArr2, c8)) {
                    int i20 = 0;
                    for (int i21 = i19; i21 < i19 + 7; i21++) {
                        i20 += this.f21139b[i21];
                    }
                    if (i19 == i13 || this.f21139b[i19 - 1] >= i20 / 2) {
                        StringBuilder sb2 = this.f21138a;
                        sb2.setLength(0);
                        int i22 = i19;
                        while (true) {
                            int iH2 = h(i22);
                            if (iH2 == -1) {
                                throw ij.h.f11808i;
                            }
                            sb2.append((char) iH2);
                            i10 = i22 + 8;
                            if ((sb2.length() > i13 && g(cArr2, cArr[iH2])) || i10 >= this.f21140c) {
                                break;
                            }
                            i22 = i10;
                            i13 = i13;
                        }
                        int i23 = i22 + 7;
                        int i24 = this.f21139b[i23];
                        int i25 = 0;
                        for (int i26 = -8; i26 < -1; i26++) {
                            i25 += this.f21139b[i10 + i26];
                        }
                        if (i10 < this.f21140c && i24 < i25 / 2) {
                            throw ij.h.f11808i;
                        }
                        int[] iArr6 = new int[4];
                        iArr6[0] = 0;
                        iArr6[i13] = 0;
                        iArr6[2] = 0;
                        iArr6[3] = 0;
                        int[] iArr7 = new int[4];
                        iArr7[0] = 0;
                        iArr7[i13] = 0;
                        iArr7[2] = 0;
                        iArr7[3] = 0;
                        int length = sb2.length() - i13;
                        int i27 = i19;
                        int i28 = 0;
                        while (true) {
                            char cCharAt = sb2.charAt(i28);
                            iArr = f21136e;
                            int i29 = iArr[cCharAt];
                            int i30 = 6;
                            while (i30 >= 0) {
                                int i31 = (i30 & 1) + ((i29 & 1) << 1);
                                iArr6[i31] = iArr6[i31] + this.f21139b[i27 + i30];
                                iArr7[i31] = iArr7[i31] + 1;
                                i29 >>= 1;
                                i30--;
                                i13 = i13;
                            }
                            int i32 = i13;
                            if (i28 >= length) {
                                break;
                            }
                            i27 += 8;
                            i28++;
                            i13 = i32;
                        }
                        float[] fArr = new float[4];
                        float[] fArr2 = new float[4];
                        int i33 = 0;
                        for (int i34 = 2; i33 < i34; i34 = 2) {
                            fArr2[i33] = 0.0f;
                            int i35 = i33 + 2;
                            float f2 = iArr6[i33] / iArr7[i33];
                            float f7 = iArr6[i35];
                            float f10 = iArr7[i35];
                            float f11 = ((f7 / f10) + f2) / 2.0f;
                            fArr2[i35] = f11;
                            fArr[i33] = f11;
                            fArr[i35] = ((f7 * 2.0f) + 1.5f) / f10;
                            i33++;
                        }
                        int i36 = i19;
                        int i37 = 0;
                        loop8: while (true) {
                            int i38 = iArr[sb2.charAt(i37)];
                            for (int i39 = 6; i39 >= 0; i39--) {
                                int i40 = (i39 & 1) + ((i38 & 1) << 1);
                                float f12 = this.f21139b[i36 + i39];
                                if (f12 < fArr2[i40] || f12 > fArr[i40]) {
                                    break loop8;
                                }
                                i38 >>= 1;
                            }
                            if (i37 >= length) {
                                for (int i41 = 0; i41 < sb2.length(); i41++) {
                                    sb2.setCharAt(i41, cArr[sb2.charAt(i41)]);
                                }
                                if (!g(cArr2, sb2.charAt(0))) {
                                    throw ij.h.f11808i;
                                }
                                if (!g(cArr2, sb2.charAt(sb2.length() - 1))) {
                                    throw ij.h.f11808i;
                                }
                                if (sb2.length() <= 3) {
                                    throw ij.h.f11808i;
                                }
                                if (map == null || !map.containsKey(ij.c.E)) {
                                    sb2.deleteCharAt(sb2.length() - 1);
                                    i11 = 0;
                                    sb2.deleteCharAt(0);
                                } else {
                                    i11 = 0;
                                }
                                int i42 = i11;
                                while (i11 < i19) {
                                    i42 += this.f21139b[i11];
                                    i11++;
                                }
                                float f13 = i42;
                                while (i19 < i23) {
                                    i42 += this.f21139b[i19];
                                    i19++;
                                }
                                float f14 = i7;
                                return new Result(sb2.toString(), null, new m[]{new m(f13, f14), new m(i42, f14)}, ij.a.f11787e);
                            }
                            i36 += 8;
                            i37++;
                        }
                        throw ij.h.f11808i;
                    }
                }
            }
            i19 += 2;
            i13 = i13;
        }
        throw ij.h.f11808i;
    }

    public final int h(int i7) {
        int i10 = i7 + 7;
        if (i10 >= this.f21140c) {
            return -1;
        }
        int[] iArr = this.f21139b;
        int i11 = Integer.MAX_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = 0;
        for (int i15 = i7; i15 < i10; i15 += 2) {
            int i16 = iArr[i15];
            if (i16 < i13) {
                i13 = i16;
            }
            if (i16 > i14) {
                i14 = i16;
            }
        }
        int i17 = (i13 + i14) / 2;
        int i18 = 0;
        for (int i19 = i7 + 1; i19 < i10; i19 += 2) {
            int i20 = iArr[i19];
            if (i20 < i11) {
                i11 = i20;
            }
            if (i20 > i18) {
                i18 = i20;
            }
        }
        int i21 = (i11 + i18) / 2;
        int i22 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT;
        int i23 = 0;
        for (int i24 = 0; i24 < 7; i24++) {
            i22 >>= 1;
            if (iArr[i7 + i24] > ((i24 & 1) == 0 ? i17 : i21)) {
                i23 |= i22;
            }
        }
        while (true) {
            int[] iArr2 = f21136e;
            if (i12 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i12] == i23) {
                return i12;
            }
            i12++;
        }
    }
}
