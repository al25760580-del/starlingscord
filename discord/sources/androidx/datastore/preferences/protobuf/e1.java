package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e1 f1841f = new e1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f1843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f1844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1845d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1846e;

    public e1(int i7, int[] iArr, Object[] objArr, boolean z5) {
        this.f1842a = i7;
        this.f1843b = iArr;
        this.f1844c = objArr;
        this.f1846e = z5;
    }

    public static e1 b() {
        return new e1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iY;
        int iA;
        int iU;
        int i7 = this.f1845d;
        if (i7 != -1) {
            return i7;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f1842a; i11++) {
            int i12 = this.f1843b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f1844c[i11]).getClass();
                    iU = i.u(i13);
                } else if (i14 == 2) {
                    iU = i.r(i13, (e) this.f1844c[i11]);
                } else if (i14 == 3) {
                    iY = i.y(i13) * 2;
                    iA = ((e1) this.f1844c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(w.b());
                    }
                    ((Integer) this.f1844c[i11]).getClass();
                    iU = i.t(i13);
                }
                i10 = iU + i10;
            } else {
                long jLongValue = ((Long) this.f1844c[i11]).longValue();
                iY = i.y(i13);
                iA = i.A(jLongValue);
            }
            i10 = iA + iY + i10;
        }
        this.f1845d = i10;
        return i10;
    }

    public final void c(int i7, Object obj) {
        if (!this.f1846e) {
            throw new UnsupportedOperationException();
        }
        int i10 = this.f1842a;
        int[] iArr = this.f1843b;
        if (i10 == iArr.length) {
            int i11 = i10 + (i10 < 4 ? 8 : i10 >> 1);
            this.f1843b = Arrays.copyOf(iArr, i11);
            this.f1844c = Arrays.copyOf(this.f1844c, i11);
        }
        int[] iArr2 = this.f1843b;
        int i12 = this.f1842a;
        iArr2[i12] = i7;
        this.f1844c[i12] = obj;
        this.f1842a = i12 + 1;
    }

    public final void d(e0 e0Var) {
        if (this.f1842a == 0) {
            return;
        }
        e0Var.getClass();
        i iVar = (i) e0Var.f1840a;
        for (int i7 = 0; i7 < this.f1842a; i7++) {
            int i10 = this.f1843b[i7];
            Object obj = this.f1844c[i7];
            int i11 = i10 >>> 3;
            int i12 = i10 & 7;
            if (i12 == 0) {
                iVar.U(i11, ((Long) obj).longValue());
            } else if (i12 == 1) {
                iVar.K(i11, ((Long) obj).longValue());
            } else if (i12 == 2) {
                e0Var.a(i11, (e) obj);
            } else if (i12 == 3) {
                iVar.R(i11, 3);
                ((e1) obj).d(e0Var);
                iVar.R(i11, 4);
            } else {
                if (i12 != 5) {
                    throw new RuntimeException(w.b());
                }
                iVar.I(i11, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        int i7 = this.f1842a;
        if (i7 == e1Var.f1842a) {
            int[] iArr = this.f1843b;
            int[] iArr2 = e1Var.f1843b;
            for (int i10 = 0; i10 < i7; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.f1844c;
            Object[] objArr2 = e1Var.f1844c;
            int i11 = this.f1842a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f1842a;
        int i10 = (527 + i7) * 31;
        int[] iArr = this.f1843b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i7; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = (i10 + i11) * 31;
        Object[] objArr = this.f1844c;
        int i14 = this.f1842a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
