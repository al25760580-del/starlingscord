package s;

import kotlin.collections.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f19647a = {-9187201950435737345L, -1};

    static {
        int iC = c(0);
        int iMax = iC > 0 ? Math.max(7, b(iC)) : 0;
        if (iMax != 0) {
            long[] jArr = new long[((iMax + 15) & (-8)) >> 3];
            w.l(jArr, -9187201950435737472L);
            int i7 = iMax >> 3;
            long j = 255 << ((iMax & 7) << 3);
            jArr[i7] = (jArr[i7] & (~j)) | j;
        }
        if (iMax != 0) {
            Object[] objArr = new Object[iMax];
        }
        if (iMax == 0) {
            return;
        }
        Object[] objArr2 = new Object[iMax];
    }

    public static final int a(int i7) {
        if (i7 == 7) {
            return 6;
        }
        return i7 - (i7 / 8);
    }

    public static final int b(int i7) {
        if (i7 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i7);
        }
        return 0;
    }

    public static final int c(int i7) {
        if (i7 == 7) {
            return 8;
        }
        return ((i7 - 1) / 7) + i7;
    }
}
