package uj;

import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import com.facebook.react.common.assets.ReactFontManager;
import com.google.zxing.Result;
import ij.m;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f21142d = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, 265, 73, 328, 25, 280, 88, 13, 268, 76, 28, 259, 67, 322, 19, TiffUtil.TIFF_TAG_ORIENTATION, 82, 7, 262, 70, 22, 385, 193, 448, 145, ReactFontManager.TypefaceStyle.NORMAL, JfifUtil.MARKER_RST0, 133, 388, 196, 168, 162, 138, 42};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f21144b = new StringBuilder(20);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f21145c = new int[9];

    public c(boolean z5) {
        this.f21143a = z5;
    }

    public static int g(int[] iArr) {
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 : iArr) {
                if (i11 < i10 && i11 > i7) {
                    i10 = i11;
                }
            }
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                if (i16 > i10) {
                    i13 |= 1 << ((length - 1) - i15);
                    i12++;
                    i14 += i16;
                }
            }
            if (i12 == 3) {
                for (int i17 = 0; i17 < length && i12 > 0; i17++) {
                    int i18 = iArr[i17];
                    if (i18 > i10) {
                        i12--;
                        if ((i18 << 1) >= i14) {
                            return -1;
                        }
                    }
                }
                return i13;
            }
            if (i12 <= 3) {
                return -1;
            }
            i7 = i10;
        }
    }

    @Override // uj.h
    public final Result b(int i7, mj.a aVar, Map map) throws ij.b, ij.h {
        int i10;
        char cCharAt;
        int[] iArr = this.f21145c;
        Arrays.fill(iArr, 0);
        StringBuilder sb2 = this.f21144b;
        sb2.setLength(0);
        int i11 = aVar.f15838e;
        int iB = aVar.b(0);
        int length = iArr.length;
        boolean z5 = false;
        int i12 = 0;
        int i13 = iB;
        while (iB < i11) {
            char c8 = 1;
            if (aVar.a(iB) != z5) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i10 = 1;
                    i12++;
                } else if (g(iArr) == 148 && aVar.d(Math.max(0, i13 - ((iB - i13) / 2)), i13)) {
                    int[] iArr2 = {i13, iB};
                    int iB2 = aVar.b(iArr2[1]);
                    while (true) {
                        h.e(iB2, aVar, iArr);
                        int iG = g(iArr);
                        if (iG < 0) {
                            throw ij.h.f11808i;
                        }
                        int i14 = 0;
                        while (true) {
                            if (i14 >= 43) {
                                if (iG != 148) {
                                    throw ij.h.f11808i;
                                }
                                cCharAt = '*';
                                break;
                            }
                            if (f21142d[i14] == iG) {
                                cCharAt = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(i14);
                                break;
                            }
                            i14++;
                        }
                        sb2.append(cCharAt);
                        char c10 = c8;
                        int i15 = iB2;
                        for (int i16 : iArr) {
                            i15 += i16;
                        }
                        int iB3 = aVar.b(i15);
                        if (cCharAt == '*') {
                            sb2.setLength(sb2.length() - 1);
                            int i17 = 0;
                            for (int i18 : iArr) {
                                i17 += i18;
                            }
                            int i19 = (iB3 - iB2) - i17;
                            if (iB3 != i11 && (i19 << 1) < i17) {
                                throw ij.h.f11808i;
                            }
                            if (this.f21143a) {
                                int length2 = sb2.length() - 1;
                                int iIndexOf = 0;
                                for (int i20 = 0; i20 < length2; i20++) {
                                    iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(sb2.charAt(i20));
                                }
                                if (sb2.charAt(length2) != "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".charAt(iIndexOf % 43)) {
                                    throw ij.b.a();
                                }
                                sb2.setLength(length2);
                            }
                            if (sb2.length() == 0) {
                                throw ij.h.f11808i;
                            }
                            String string = sb2.toString();
                            float f2 = (iArr2[c10] + iArr2[0]) / 2.0f;
                            float f7 = i7;
                            return new Result(string, null, new m[]{new m(f2, f7), new m((i17 / 2.0f) + iB2, f7)}, ij.a.f11788i);
                        }
                        c8 = c10;
                        iB2 = iB3;
                    }
                } else {
                    i10 = 1;
                    i13 += iArr[0] + iArr[1];
                    int i21 = i12 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i21);
                    iArr[i21] = 0;
                    iArr[i12] = 0;
                    i12--;
                }
                iArr[i12] = i10;
                z5 = !z5;
            }
            iB++;
        }
        throw ij.h.f11808i;
    }
}
