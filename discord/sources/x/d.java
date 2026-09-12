package x;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f22493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f22494c;

    public d(int i7, long[] jArr, Object[] objArr) {
        this.f22492a = i7;
        this.f22493b = jArr;
        this.f22494c = objArr;
    }

    public final int a(long j) {
        int i7 = this.f22492a - 1;
        if (i7 != -1) {
            long[] jArr = this.f22493b;
            int i10 = 0;
            if (i7 != 0) {
                while (i10 <= i7) {
                    int i11 = (i10 + i7) >>> 1;
                    long j5 = jArr[i11] - j;
                    if (j5 < 0) {
                        i10 = i11 + 1;
                    } else {
                        if (j5 <= 0) {
                            return i11;
                        }
                        i7 = i11 - 1;
                    }
                }
                return -(i10 + 1);
            }
            long j7 = jArr[0];
            if (j7 == j) {
                return 0;
            }
            if (j7 > j) {
                return -2;
            }
        }
        return -1;
    }

    public final d b(long j, Object obj) {
        long[] jArr;
        int i7;
        Object[] objArr = this.f22494c;
        int i10 = 0;
        int i11 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i11++;
            }
        }
        int i12 = i11 + 1;
        long[] jArr2 = new long[i12];
        Object[] objArr2 = new Object[i12];
        if (i12 > 1) {
            int i13 = 0;
            while (true) {
                jArr = this.f22493b;
                i7 = this.f22492a;
                if (i10 >= i12 || i13 >= i7) {
                    break;
                }
                long j5 = jArr[i13];
                Object obj3 = objArr[i13];
                if (j5 > j) {
                    jArr2[i10] = j;
                    objArr2[i10] = obj;
                    i10++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i10] = j5;
                    objArr2[i10] = obj3;
                    i10++;
                }
                i13++;
            }
            if (i13 == i7) {
                jArr2[i11] = j;
                objArr2[i11] = obj;
            } else {
                while (i10 < i12) {
                    long j7 = jArr[i13];
                    Object obj4 = objArr[i13];
                    if (obj4 != null) {
                        jArr2[i10] = j7;
                        objArr2[i10] = obj4;
                        i10++;
                    }
                    i13++;
                }
            }
        } else {
            jArr2[0] = j;
            objArr2[0] = obj;
        }
        return new d(i12, jArr2, objArr2);
    }
}
