package uj;

import com.facebook.imageutils.TiffUtil;
import com.facebook.react.views.image.ReactImageView;
import com.google.zxing.Result;
import ij.m;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f21146c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f21147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f21148e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringBuilder f21149a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21150b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, TiffUtil.TIFF_TAG_ORIENTATION, 266, 424, 420, 418, 404, 402, 394, 360, 356, 354, 308, 282, 344, 332, 326, ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS, 278, 436, 434, 428, 422, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f21147d = iArr;
        f21148e = iArr[47];
    }

    public static void g(CharSequence charSequence, int i7, int i10) throws ij.b {
        int iIndexOf = 0;
        int i11 = 1;
        for (int i12 = i7 - 1; i12 >= 0; i12--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i12)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        if (charSequence.charAt(i7) != f21146c[iIndexOf % 47]) {
            throw ij.b.a();
        }
    }

    public static int h(int[] iArr) {
        int i7 = 0;
        for (int i10 : iArr) {
            i7 += i10;
        }
        int length = iArr.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int iRound = Math.round((iArr[i12] * 9.0f) / i7);
            if (iRound <= 0 || iRound > 4) {
                return -1;
            }
            if ((i12 & 1) == 0) {
                for (int i13 = 0; i13 < iRound; i13++) {
                    i11 = (i11 << 1) | 1;
                }
            } else {
                i11 <<= iRound;
            }
        }
        return i11;
    }

    @Override // uj.h
    public final Result b(int i7, mj.a aVar, Map map) throws ij.b, ij.d, ij.h {
        int i10;
        char c8;
        int i11 = aVar.f15838e;
        int iB = aVar.b(0);
        int[] iArr = this.f21150b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        boolean z5 = false;
        int i12 = 0;
        int i13 = iB;
        while (iB < i11) {
            if (aVar.a(iB) != z5) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (h(iArr) == f21148e) {
                    int[] iArr2 = {i13, iB};
                    int iB2 = aVar.b(iArr2[1]);
                    Arrays.fill(iArr, 0);
                    StringBuilder sb2 = this.f21149a;
                    sb2.setLength(0);
                    while (true) {
                        h.e(iB2, aVar, iArr);
                        int iH = h(iArr);
                        if (iH < 0) {
                            throw ij.h.f11808i;
                        }
                        int i14 = 0;
                        while (true) {
                            int[] iArr3 = f21147d;
                            if (i14 >= iArr3.length) {
                                throw ij.h.f11808i;
                            }
                            if (iArr3[i14] == iH) {
                                break;
                            }
                            i14++;
                        }
                        char c10 = f21146c[i14];
                        sb2.append(c10);
                        int i15 = iB2;
                        for (int i16 : iArr) {
                            i15 += i16;
                        }
                        int iB3 = aVar.b(i15);
                        if (c10 == '*') {
                            sb2.deleteCharAt(sb2.length() - 1);
                            int i17 = 0;
                            for (int i18 : iArr) {
                                i17 += i18;
                            }
                            if (iB3 == i11 || !aVar.a(iB3)) {
                                throw ij.h.f11808i;
                            }
                            if (sb2.length() < 2) {
                                throw ij.h.f11808i;
                            }
                            int length2 = sb2.length();
                            g(sb2, length2 - 2, 20);
                            g(sb2, length2 - 1, 15);
                            sb2.setLength(sb2.length() - 2);
                            int length3 = sb2.length();
                            StringBuilder sb3 = new StringBuilder(length3);
                            int i19 = 0;
                            while (i19 < length3) {
                                char cCharAt = sb2.charAt(i19);
                                if (cCharAt >= 'a' && cCharAt <= 'd') {
                                    if (i19 >= length3 - 1) {
                                        throw ij.d.a();
                                    }
                                    i19++;
                                    char cCharAt2 = sb2.charAt(i19);
                                    switch (cCharAt) {
                                        case 'a':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw ij.d.a();
                                            }
                                            i10 = cCharAt2 - '@';
                                            c8 = (char) i10;
                                            sb3.append(c8);
                                            break;
                                            break;
                                        case 'b':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'E') {
                                                i10 = cCharAt2 - '&';
                                            } else if (cCharAt2 >= 'F' && cCharAt2 <= 'J') {
                                                i10 = cCharAt2 - 11;
                                            } else if (cCharAt2 < 'K' || cCharAt2 > 'O') {
                                                if (cCharAt2 >= 'P' && cCharAt2 <= 'S') {
                                                    i10 = cCharAt2 + '+';
                                                } else {
                                                    if (cCharAt2 < 'T' || cCharAt2 > 'Z') {
                                                        throw ij.d.a();
                                                    }
                                                    c8 = 127;
                                                }
                                                sb3.append(c8);
                                            } else {
                                                i10 = cCharAt2 + 16;
                                            }
                                            c8 = (char) i10;
                                            sb3.append(c8);
                                            break;
                                        case 'c':
                                            if (cCharAt2 >= 'A' && cCharAt2 <= 'O') {
                                                i10 = cCharAt2 - ' ';
                                                c8 = (char) i10;
                                            } else {
                                                if (cCharAt2 != 'Z') {
                                                    throw ij.d.a();
                                                }
                                                c8 = ':';
                                            }
                                            sb3.append(c8);
                                            break;
                                        case 'd':
                                            if (cCharAt2 < 'A' || cCharAt2 > 'Z') {
                                                throw ij.d.a();
                                            }
                                            i10 = cCharAt2 + ' ';
                                            c8 = (char) i10;
                                            sb3.append(c8);
                                            break;
                                            break;
                                        default:
                                            c8 = 0;
                                            sb3.append(c8);
                                            break;
                                    }
                                } else {
                                    sb3.append(cCharAt);
                                }
                                i19++;
                            }
                            float f2 = i7;
                            return new Result(sb3.toString(), null, new m[]{new m((iArr2[1] + iArr2[0]) / 2.0f, f2), new m((i17 / 2.0f) + iB2, f2)}, ij.a.f11789v);
                        }
                        iB2 = iB3;
                    }
                } else {
                    i13 += iArr[0] + iArr[1];
                    int i20 = i12 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i20);
                    iArr[i20] = 0;
                    iArr[i12] = 0;
                    i12--;
                }
                iArr[i12] = 1;
                z5 = !z5;
            }
            iB++;
        }
        throw ij.h.f11808i;
    }
}
