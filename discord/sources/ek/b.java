package ek;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj.b f8440a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f8446g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f8441b = new ArrayList(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f8447h = new int[3];

    public b(mj.b bVar, int i7, int i10, int i11, int i12, float f2) {
        this.f8440a = bVar;
        this.f8442c = i7;
        this.f8443d = i10;
        this.f8444e = i11;
        this.f8445f = i12;
        this.f8446g = f2;
    }

    public final boolean a(int[] iArr) {
        float f2 = this.f8446g;
        float f7 = f2 / 2.0f;
        for (int i7 = 0; i7 < 3; i7++) {
            if (Math.abs(f2 - iArr[i7]) >= f7) {
                return false;
            }
        }
        return true;
    }

    public final a b(int i7, int i10, int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = i11 + i12 + i13;
        float f2 = (i10 - i13) - (i12 / 2.0f);
        int i15 = (int) f2;
        int i16 = i12 * 2;
        mj.b bVar = this.f8440a;
        int i17 = bVar.f15840e;
        int[] iArr2 = this.f8447h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i18 = i7;
        while (i18 >= 0 && bVar.b(i15, i18)) {
            int i19 = iArr2[1];
            if (i19 > i16) {
                break;
            }
            iArr2[1] = i19 + 1;
            i18--;
        }
        float f7 = Float.NaN;
        if (i18 >= 0 && iArr2[1] <= i16) {
            while (i18 >= 0 && !bVar.b(i15, i18)) {
                int i20 = iArr2[0];
                if (i20 > i16) {
                    break;
                }
                iArr2[0] = i20 + 1;
                i18--;
            }
            if (iArr2[0] <= i16) {
                int i21 = i7 + 1;
                while (i21 < i17 && bVar.b(i15, i21)) {
                    int i22 = iArr2[1];
                    if (i22 > i16) {
                        break;
                    }
                    iArr2[1] = i22 + 1;
                    i21++;
                }
                if (i21 != i17 && iArr2[1] <= i16) {
                    while (i21 < i17 && !bVar.b(i15, i21)) {
                        int i23 = iArr2[2];
                        if (i23 > i16) {
                            break;
                        }
                        iArr2[2] = i23 + 1;
                        i21++;
                    }
                    int i24 = iArr2[2];
                    if (i24 <= i16 && Math.abs(((iArr2[0] + iArr2[1]) + i24) - i14) * 5 < i14 * 2 && a(iArr2)) {
                        f7 = (i21 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f7)) {
            return null;
        }
        float f10 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList<a> arrayList = this.f8441b;
        for (a aVar : arrayList) {
            float f11 = aVar.f8439c;
            float f12 = aVar.f11823a;
            float f13 = aVar.f11824b;
            if (Math.abs(f7 - f13) <= f10 && Math.abs(f2 - f12) <= f10) {
                float fAbs = Math.abs(f10 - f11);
                if (fAbs <= 1.0f || fAbs <= f11) {
                    return new a((f12 + f2) / 2.0f, (f13 + f7) / 2.0f, (aVar.f8439c + f10) / 2.0f);
                }
            }
        }
        arrayList.add(new a(f2, f7, f10));
        return null;
    }
}
