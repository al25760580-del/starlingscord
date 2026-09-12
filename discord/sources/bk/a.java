package bk;

import ij.m;
import java.util.ArrayList;
import java.util.Arrays;
import mj.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f3305a = {0, 4, 1, 5};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f3306b = {6, 2, 7, 3};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f3307c = {8, 1, 1, 1, 1, 1, 1, 3};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f3308d = {7, 1, 1, 3, 1, 1, 1, 2, 1};

    public static ArrayList a(b bVar) {
        ArrayList arrayList = new ArrayList();
        int i7 = bVar.f15840e;
        if (i7 > 0) {
            int i10 = bVar.f15839d;
            m[] mVarArr = new m[8];
            int i11 = 0;
            int i12 = 0;
            m[] mVarArrC = c(bVar, i7, i10, 0, 0, f3307c);
            for (int i13 = 0; i13 < 4; i13++) {
                mVarArr[f3305a[i13]] = mVarArrC[i13];
            }
            m mVar = mVarArr[4];
            if (mVar != null) {
                i12 = (int) mVar.f11823a;
                i11 = (int) mVar.f11824b;
            }
            m[] mVarArrC2 = c(bVar, i7, i10, i11, i12, f3308d);
            for (int i14 = 0; i14 < 4; i14++) {
                mVarArr[f3306b[i14]] = mVarArrC2[i14];
            }
            if (mVarArr[0] != null || mVarArr[3] != null) {
                arrayList.add(mVarArr);
            }
        }
        return arrayList;
    }

    public static int[] b(b bVar, int i7, int i10, int i11, int[] iArr, int[] iArr2) {
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        int i12 = 0;
        while (bVar.b(i7, i10) && i7 > 0) {
            int i13 = i12 + 1;
            if (i12 >= 3) {
                break;
            }
            i7--;
            i12 = i13;
        }
        int length = iArr.length;
        int i14 = i7;
        int i15 = 0;
        boolean z5 = false;
        while (i7 < i11) {
            if (bVar.b(i7, i10) != z5) {
                iArr2[i15] = iArr2[i15] + 1;
            } else {
                if (i15 != length - 1) {
                    i15++;
                } else {
                    if (d(iArr2, iArr) < 0.42f) {
                        return new int[]{i14, i7};
                    }
                    i14 += iArr2[0] + iArr2[1];
                    int i16 = i15 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i16);
                    iArr2[i16] = 0;
                    iArr2[i15] = 0;
                    i15--;
                }
                iArr2[i15] = 1;
                z5 = !z5;
            }
            i7++;
        }
        if (i15 != length - 1 || d(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i14, i7 - 1};
    }

    public static m[] c(b bVar, int i7, int i10, int i11, int i12, int[] iArr) {
        int i13;
        boolean z5;
        int[] iArrB;
        m[] mVarArr = new m[4];
        int[] iArr2 = iArr;
        int[] iArr3 = new int[iArr2.length];
        int i14 = i11;
        while (true) {
            if (i14 >= i7) {
                i13 = i14;
                z5 = false;
                break;
            }
            int[] iArrB2 = b(bVar, i12, i14, i10, iArr2, iArr3);
            if (iArrB2 != null) {
                int[] iArr4 = iArrB2;
                while (true) {
                    i13 = i14;
                    if (i13 <= 0 || (iArrB = b(bVar, i12, (i14 = i13 - 1), i10, iArr, iArr3)) == null) {
                        break;
                    }
                    iArr4 = iArrB;
                }
                float f2 = i13;
                mVarArr[0] = new m(iArr4[0], f2);
                mVarArr[1] = new m(iArr4[1], f2);
                z5 = true;
                break;
            }
            i14 += 5;
            iArr2 = iArr;
        }
        int i15 = i13 + 1;
        if (z5) {
            int[] iArr5 = {(int) mVarArr[0].f11823a, (int) mVarArr[1].f11823a};
            int i16 = i15;
            int i17 = 0;
            while (i16 < i7) {
                int[] iArrB3 = b(bVar, iArr5[0], i16, i10, iArr, iArr3);
                if (iArrB3 != null && Math.abs(iArr5[0] - iArrB3[0]) < 5 && Math.abs(iArr5[1] - iArrB3[1]) < 5) {
                    iArr5 = iArrB3;
                    i17 = 0;
                } else {
                    if (i17 > 25) {
                        break;
                    }
                    i17++;
                }
                i16++;
            }
            i15 = i16 - (i17 + 1);
            float f7 = i15;
            mVarArr[2] = new m(iArr5[0], f7);
            mVarArr[3] = new m(iArr5[1], f7);
        }
        if (i15 - i13 < 10) {
            Arrays.fill(mVarArr, (Object) null);
        }
        return mVarArr;
    }

    public static float d(int[] iArr, int[] iArr2) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i7 += iArr[i11];
            i10 += iArr2[i11];
        }
        if (i7 < i10) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i7;
        float f7 = f2 / i10;
        float f10 = 0.8f * f7;
        float f11 = 0.0f;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            float f12 = iArr2[i12] * f7;
            float f13 = i13;
            float f14 = f13 > f12 ? f13 - f12 : f12 - f13;
            if (f14 > f10) {
                return Float.POSITIVE_INFINITY;
            }
            f11 += f14;
        }
        return f11 / f2;
    }
}
