package mj;

import ij.h;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f15848e = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ij.f f15849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f15850b = f15848e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f15851c = new int[32];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f15852d;

    public d(ij.f fVar) {
        this.f15849a = fVar;
    }

    public static int a(int[] iArr) {
        int length = iArr.length;
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int i13 = iArr[i12];
            if (i13 > i7) {
                i11 = i12;
                i7 = i13;
            }
            if (i13 > i10) {
                i10 = i13;
            }
        }
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            int i17 = i16 - i11;
            int i18 = iArr[i16] * i17 * i17;
            if (i18 > i15) {
                i14 = i16;
                i15 = i18;
            }
        }
        if (i11 <= i14) {
            int i19 = i11;
            i11 = i14;
            i14 = i19;
        }
        if (i11 - i14 <= length / 16) {
            throw h.f11808i;
        }
        int i20 = i11 - 1;
        int i21 = -1;
        int i22 = i20;
        while (i20 > i14) {
            int i23 = i20 - i14;
            int i24 = (i10 - iArr[i20]) * (i11 - i20) * i23 * i23;
            if (i24 > i21) {
                i22 = i20;
                i21 = i24;
            }
            i20--;
        }
        return i22 << 3;
    }
}
