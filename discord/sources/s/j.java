package s;

import kotlin.collections.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f19635a;

    static {
        long[] jArr = q.f19647a;
        int iC = q.c(0);
        int iMax = iC > 0 ? Math.max(7, q.b(iC)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            w.l(jArr, -9187201950435737472L);
        }
        int i7 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i7] = (jArr[i7] & (~j)) | j;
        long[] jArr2 = new long[iMax];
        f19635a = new long[0];
    }
}
