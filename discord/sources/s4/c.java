package s4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f19721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f19722b;

    public c(float[] fArr, int[] iArr) {
        this.f19721a = fArr;
        this.f19722b = iArr;
    }

    public final void a(c cVar) {
        int i7 = 0;
        while (true) {
            int[] iArr = cVar.f19722b;
            if (i7 >= iArr.length) {
                return;
            }
            this.f19721a[i7] = cVar.f19721a[i7];
            this.f19722b[i7] = iArr[i7];
            i7++;
        }
    }

    public final c b(float[] fArr) {
        int iV;
        int[] iArr = new int[fArr.length];
        for (int i7 = 0; i7 < fArr.length; i7++) {
            float f2 = fArr[i7];
            float[] fArr2 = this.f19721a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f2);
            int[] iArr2 = this.f19722b;
            if (iBinarySearch >= 0) {
                iV = iArr2[iBinarySearch];
            } else {
                int i10 = -(iBinarySearch + 1);
                if (i10 == 0) {
                    iV = iArr2[0];
                } else if (i10 == iArr2.length - 1) {
                    iV = iArr2[iArr2.length - 1];
                } else {
                    int i11 = i10 - 1;
                    float f7 = fArr2[i11];
                    iV = gn.h.v(iArr2[i11], iArr2[i10], (f2 - f7) / (fArr2[i10] - f7));
                }
            }
            iArr[i7] = iV;
        }
        return new c(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (Arrays.equals(this.f19721a, cVar.f19721a) && Arrays.equals(this.f19722b, cVar.f19722b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f19722b) + (Arrays.hashCode(this.f19721a) * 31);
    }
}
