package m0;

import s0.g;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f15341b = {18, 20, 17, 15};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f15342c = {65535, 262143, 32767, 8191};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f15343d = {32767, 8191, 65535, 262143};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15344a;

    public static final int a(long j) {
        int i7 = (int) (3 & j);
        int i10 = ((int) (j >> (f15341b[i7] + 31))) & f15343d[i7];
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    public static final int b(long j) {
        int i7 = ((int) (j >> 33)) & f15342c[(int) (3 & j)];
        if (i7 == 0) {
            return Integer.MAX_VALUE;
        }
        return i7 - 1;
    }

    public static final int c(long j) {
        int i7 = (int) (3 & j);
        return ((int) (j >> f15341b[i7])) & f15343d[i7];
    }

    public static final int d(long j) {
        return ((int) (j >> 2)) & f15342c[(int) (3 & j)];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f15344a == ((a) obj).f15344a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15344a);
    }

    public final String toString() {
        long j = this.f15344a;
        int iB = b(j);
        String strValueOf = iB == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iB);
        int iA = a(j);
        String strValueOf2 = iA != Integer.MAX_VALUE ? String.valueOf(iA) : "Infinity";
        StringBuilder sb2 = new StringBuilder("Constraints(minWidth = ");
        sb2.append(d(j));
        sb2.append(", maxWidth = ");
        sb2.append(strValueOf);
        sb2.append(", minHeight = ");
        sb2.append(c(j));
        sb2.append(", maxHeight = ");
        return g.g(sb2, strValueOf2, ')');
    }
}
