package hj;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t0 f10908e = new t0(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f10911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10912d;

    public t0(int i7, int[] iArr, Object[] objArr, boolean z5) {
        this.f10909a = i7;
        this.f10910b = iArr;
        this.f10911c = objArr;
        this.f10912d = z5;
    }

    public final void a(int i7) {
        int[] iArr = this.f10910b;
        if (i7 > iArr.length) {
            int i10 = this.f10909a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f10910b = Arrays.copyOf(iArr, i7);
            this.f10911c = Arrays.copyOf(this.f10911c, i7);
        }
    }

    public final void b(int i7, Object obj) {
        if (!this.f10912d) {
            throw new UnsupportedOperationException();
        }
        a(this.f10909a + 1);
        int[] iArr = this.f10910b;
        int i10 = this.f10909a;
        iArr[i10] = i7;
        this.f10911c[i10] = obj;
        this.f10909a = i10 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        int i7 = this.f10909a;
        if (i7 == t0Var.f10909a) {
            int[] iArr = this.f10910b;
            int[] iArr2 = t0Var.f10910b;
            for (int i10 = 0; i10 < i7; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.f10911c;
            Object[] objArr2 = t0Var.f10911c;
            int i11 = this.f10909a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f10909a;
        int i10 = (527 + i7) * 31;
        int[] iArr = this.f10910b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i7; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f10911c;
        int i14 = this.f10909a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
