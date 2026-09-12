package vc;

import pc.l;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f21614d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f21615a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21617c;

    public static long a(byte[] bArr, int i7, boolean z5) {
        long j = ((long) bArr[0]) & 255;
        if (z5) {
            j &= ~f21614d[i7 - 1];
        }
        for (int i10 = 1; i10 < i7; i10++) {
            j = (j << 8) | (((long) bArr[i10]) & 255);
        }
        return j;
    }

    public final long b(l lVar, boolean z5, boolean z6, int i7) {
        int i10;
        int i11 = this.f21616b;
        byte[] bArr = this.f21615a;
        if (i11 == 0) {
            if (!lVar.a(bArr, 0, 1, z5)) {
                return -1L;
            }
            int i12 = bArr[0] & 255;
            int i13 = 0;
            while (true) {
                if (i13 >= 8) {
                    i10 = -1;
                    break;
                }
                if ((f21614d[i13] & ((long) i12)) != 0) {
                    i10 = i13 + 1;
                    break;
                }
                i13++;
            }
            this.f21617c = i10;
            if (i10 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f21616b = 1;
        }
        int i14 = this.f21617c;
        if (i14 > i7) {
            this.f21616b = 0;
            return -2L;
        }
        if (i14 != 1) {
            lVar.readFully(bArr, 1, i14 - 1);
        }
        this.f21616b = 0;
        return a(bArr, this.f21617c, z6);
    }
}
