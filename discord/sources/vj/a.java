package vj;

import uj.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f21683b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f21686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f21687f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f21682a = new int[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float[] f21684c = new float[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f21685d = new float[4];

    public a() {
        int[] iArr = new int[8];
        this.f21683b = iArr;
        this.f21686e = new int[iArr.length / 2];
        this.f21687f = new int[iArr.length / 2];
    }

    public static void g(float[] fArr, int[] iArr) {
        int i7 = 0;
        float f2 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f7 = fArr[i10];
            if (f7 < f2) {
                i7 = i10;
                f2 = f7;
            }
        }
        iArr[i7] = iArr[i7] - 1;
    }

    public static void h(float[] fArr, int[] iArr) {
        int i7 = 0;
        float f2 = fArr[0];
        for (int i10 = 1; i10 < iArr.length; i10++) {
            float f7 = fArr[i10];
            if (f7 > f2) {
                i7 = i10;
                f2 = f7;
            }
        }
        iArr[i7] = iArr[i7] + 1;
    }

    public static boolean i(int[] iArr) {
        int i7 = iArr[0] + iArr[1];
        float f2 = i7 / ((iArr[2] + i7) + iArr[3]);
        if (f2 >= 0.7916667f && f2 <= 0.89285713f) {
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            for (int i12 : iArr) {
                if (i12 > i11) {
                    i11 = i12;
                }
                if (i12 < i10) {
                    i10 = i12;
                }
            }
            if (i11 < i10 * 10) {
                return true;
            }
        }
        return false;
    }
}
