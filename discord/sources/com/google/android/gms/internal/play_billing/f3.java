package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class f3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f3 f6006f = new f3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6010d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6011e;

    public f3(int i7, int[] iArr, Object[] objArr, boolean z5) {
        this.f6007a = i7;
        this.f6008b = iArr;
        this.f6009c = objArr;
        this.f6011e = z5;
    }

    public static f3 b() {
        return new f3(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iS;
        int iT;
        int iS2;
        int i7 = this.f6010d;
        if (i7 != -1) {
            return i7;
        }
        int iF = 0;
        for (int i10 = 0; i10 < this.f6007a; i10++) {
            int i11 = this.f6008b[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 == 2) {
                        int i14 = i12 << 3;
                        t1 t1Var = (t1) this.f6009c[i10];
                        int iS3 = v1.S(i14);
                        int iD = t1Var.d();
                        iF = com.discord.chat.presentation.list.a.f(iD, iD, iS3, iF);
                    } else if (i13 == 3) {
                        int iS4 = v1.S(i12 << 3);
                        iS = iS4 + iS4;
                        iT = ((f3) this.f6009c[i10]).a();
                    } else {
                        if (i13 != 5) {
                            throw new IllegalStateException(new l2());
                        }
                        ((Integer) this.f6009c[i10]).getClass();
                        iS2 = v1.S(i12 << 3) + 4;
                    }
                } else {
                    ((Long) this.f6009c[i10]).getClass();
                    iS2 = v1.S(i12 << 3) + 8;
                }
                iF = iS2 + iF;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.f6009c[i10]).longValue();
                iS = v1.S(i15);
                iT = v1.T(jLongValue);
            }
            iF = iT + iS + iF;
        }
        this.f6010d = iF;
        return iF;
    }

    public final void c(int i7, Object obj) {
        if (!this.f6011e) {
            throw new UnsupportedOperationException();
        }
        e(this.f6007a + 1);
        int[] iArr = this.f6008b;
        int i10 = this.f6007a;
        iArr[i10] = i7;
        this.f6009c[i10] = obj;
        this.f6007a = i10 + 1;
    }

    public final void d(w1 w1Var) throws ag.a1 {
        v1 v1Var = w1Var.f6175a;
        if (this.f6007a != 0) {
            for (int i7 = 0; i7 < this.f6007a; i7++) {
                int i10 = this.f6008b[i7];
                Object obj = this.f6009c[i7];
                int i11 = i10 >>> 3;
                int i12 = i10 & 7;
                if (i12 == 0) {
                    v1Var.Q(i11, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    v1Var.I(i11, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    t1 t1Var = (t1) obj;
                    v1Var.P((i11 << 3) | 2);
                    v1Var.P(t1Var.d());
                    t1Var.i(v1Var);
                } else if (i12 == 3) {
                    v1Var.N(i11, 3);
                    ((f3) obj).d(w1Var);
                    v1Var.N(i11, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new l2());
                    }
                    v1Var.G(i11, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i7) {
        int[] iArr = this.f6008b;
        if (i7 > iArr.length) {
            int i10 = this.f6007a;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i7) {
                i7 = i11;
            }
            if (i7 < 8) {
                i7 = 8;
            }
            this.f6008b = Arrays.copyOf(iArr, i7);
            this.f6009c = Arrays.copyOf(this.f6009c, i7);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        int i7 = this.f6007a;
        if (i7 == f3Var.f6007a) {
            int[] iArr = this.f6008b;
            int[] iArr2 = f3Var.f6008b;
            for (int i10 = 0; i10 < i7; i10++) {
                if (iArr[i10] == iArr2[i10]) {
                }
            }
            Object[] objArr = this.f6009c;
            Object[] objArr2 = f3Var.f6009c;
            int i11 = this.f6007a;
            for (int i12 = 0; i12 < i11; i12++) {
                if (objArr[i12].equals(objArr2[i12])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.f6007a;
        int i10 = i7 + 527;
        int[] iArr = this.f6008b;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i7; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.f6009c;
        int i14 = this.f6007a;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }
}
