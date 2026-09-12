package uj;

import com.google.zxing.Result;
import ij.m;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21154b = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f21155c = {1, 1, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f21156d = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f21157e = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f21158a = -1;

    public static int g(int[] iArr) throws ij.h {
        float f2 = 0.38f;
        int i7 = -1;
        for (int i10 = 0; i10 < 20; i10++) {
            float fD = h.d(iArr, f21157e[i10], 0.5f);
            if (fD < f2) {
                i7 = i10;
                f2 = fD;
            } else if (fD == f2) {
                i7 = -1;
            }
        }
        if (i7 >= 0) {
            return i7 % 10;
        }
        throw ij.h.f11808i;
    }

    public static int[] h(int i7, mj.a aVar, int[] iArr) throws ij.h {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int i10 = aVar.f15838e;
        int i11 = i7;
        boolean z5 = false;
        int i12 = 0;
        while (i7 < i10) {
            if (aVar.a(i7) != z5) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (h.d(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i7};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z5 = !z5;
            }
            i7++;
        }
        throw ij.h.f11808i;
    }

    @Override // uj.h
    public final Result b(int i7, mj.a aVar, Map map) throws ij.d, ij.h {
        int[] iArrH;
        int[] iArr;
        int length;
        int length2;
        int i10;
        int i11;
        boolean z5;
        int i12 = aVar.f15838e;
        int iB = aVar.b(0);
        if (iB == i12) {
            throw ij.h.f11808i;
        }
        int[] iArrH2 = h(iB, aVar, f21155c);
        int i13 = iArrH2[1];
        int i14 = iArrH2[0];
        this.f21158a = (i13 - i14) / 4;
        i(aVar, i14);
        int[][] iArr2 = f21156d;
        aVar.e();
        try {
            int iB2 = aVar.b(0);
            if (iB2 == i12) {
                throw ij.h.f11808i;
            }
            try {
                iArrH = h(iB2, aVar, iArr2[0]);
                while (true) {
                    if (i10 >= length2) {
                        z5 = false;
                        break;
                    }
                    int i15 = iArr[i10];
                    if (length == i15) {
                        z5 = true;
                        break;
                    }
                    if (i15 > i11) {
                        i11 = i15;
                    }
                    i10++;
                }
            } catch (ij.h unused) {
                iArrH = h(iB2, aVar, iArr2[1]);
            }
            i(aVar, iArrH[0]);
            int i16 = iArrH[0];
            iArrH[0] = i12 - iArrH[1];
            iArrH[1] = i12 - i16;
            aVar.e();
            StringBuilder sb2 = new StringBuilder(20);
            int i17 = iArrH2[1];
            int i18 = iArrH[0];
            int[] iArr3 = new int[10];
            int[] iArr4 = new int[5];
            int[] iArr5 = new int[5];
            while (i17 < i18) {
                h.e(i17, aVar, iArr3);
                for (int i19 = 0; i19 < 5; i19++) {
                    int i20 = i19 * 2;
                    iArr4[i19] = iArr3[i20];
                    iArr5[i19] = iArr3[i20 + 1];
                }
                sb2.append((char) (g(iArr4) + 48));
                sb2.append((char) (g(iArr5) + 48));
                for (int i21 = 0; i21 < 10; i21++) {
                    i17 += iArr3[i21];
                }
            }
            String string = sb2.toString();
            iArr = map != null ? (int[]) map.get(ij.c.f11798w) : null;
            if (iArr == null) {
                iArr = f21154b;
            }
            length = string.length();
            length2 = iArr.length;
            i10 = 0;
            i11 = 0;
            if (!z5 && length > i11) {
                z5 = true;
            }
            if (!z5) {
                throw ij.d.a();
            }
            float f2 = i7;
            return new Result(string, null, new m[]{new m(iArrH2[1], f2), new m(iArrH[0], f2)}, ij.a.F);
        } catch (Throwable th2) {
            aVar.e();
            throw th2;
        }
    }

    public final void i(mj.a aVar, int i7) throws ij.h {
        int i10 = this.f21158a * 10;
        if (i10 >= i7) {
            i10 = i7;
        }
        for (int i11 = i7 - 1; i10 > 0 && i11 >= 0 && !aVar.a(i11); i11--) {
            i10--;
        }
        if (i10 != 0) {
            throw ij.h.f11808i;
        }
    }
}
