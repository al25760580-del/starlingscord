package s;

import kotlin.collections.w;

/* JADX INFO: loaded from: classes.dex */
public final class o extends r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19642e;

    public o(int i7) {
        this.f19648a = q.f19647a;
        this.f19649b = t.a.f20568c;
        if (i7 >= 0) {
            b(q.c(i7));
        } else {
            t.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final int a(int i7) {
        int i10 = this.f19650c;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f19648a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j5 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j5 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j5) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final void b(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, q.b(i7)) : 0;
        this.f19650c = iMax;
        if (iMax == 0) {
            jArr = q.f19647a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            w.l(jArr, -9187201950435737472L);
        }
        this.f19648a = jArr;
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f19642e = q.a(this.f19650c) - this.f19651d;
        this.f19649b = iMax == 0 ? t.a.f20568c : new Object[iMax];
    }
}
