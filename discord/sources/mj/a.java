package mj;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f15837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15838e;

    public a(int i7) {
        this.f15838e = i7;
        this.f15837d = new int[(i7 + 31) / 32];
    }

    public final boolean a(int i7) {
        return ((1 << (i7 & 31)) & this.f15837d[i7 / 32]) != 0;
    }

    public final int b(int i7) {
        int i10 = this.f15838e;
        if (i7 >= i10) {
            return i10;
        }
        int i11 = i7 / 32;
        int i12 = (~((1 << (i7 & 31)) - 1)) & this.f15837d[i11];
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f15837d;
            if (i11 == iArr.length) {
                return i10;
            }
            i12 = iArr[i11];
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i12) + (i11 << 5);
        return iNumberOfTrailingZeros > i10 ? i10 : iNumberOfTrailingZeros;
    }

    public final int c(int i7) {
        int i10 = this.f15838e;
        if (i7 >= i10) {
            return i10;
        }
        int i11 = i7 / 32;
        int i12 = (~((1 << (i7 & 31)) - 1)) & (~this.f15837d[i11]);
        while (i12 == 0) {
            i11++;
            int[] iArr = this.f15837d;
            if (i11 == iArr.length) {
                return i10;
            }
            i12 = ~iArr[i11];
        }
        int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(i12) + (i11 << 5);
        return iNumberOfTrailingZeros > i10 ? i10 : iNumberOfTrailingZeros;
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f15837d.clone();
        int i7 = this.f15838e;
        a aVar = new a();
        aVar.f15837d = iArr;
        aVar.f15838e = i7;
        return aVar;
    }

    public final boolean d(int i7, int i10) {
        if (i10 < i7 || i7 < 0 || i10 > this.f15838e) {
            throw new IllegalArgumentException();
        }
        if (i10 != i7) {
            int i11 = i10 - 1;
            int i12 = i7 / 32;
            int i13 = i11 / 32;
            int i14 = i12;
            while (i14 <= i13) {
                if ((((2 << (i14 >= i13 ? 31 & i11 : 31)) - (1 << (i14 > i12 ? 0 : i7 & 31))) & this.f15837d[i14]) != 0) {
                    return false;
                }
                i14++;
            }
        }
        return true;
    }

    public final void e() {
        int i7;
        int[] iArr = new int[this.f15837d.length];
        int i10 = this.f15838e;
        int i11 = (i10 - 1) / 32;
        int i12 = i11 + 1;
        int i13 = 0;
        while (true) {
            if (i13 >= i12) {
                break;
            }
            long j = this.f15837d[i13];
            long j5 = ((j & 1431655765) << 1) | ((j >> 1) & 1431655765);
            long j7 = ((j5 & 858993459) << 2) | ((j5 >> 2) & 858993459);
            long j10 = ((j7 & 252645135) << 4) | ((j7 >> 4) & 252645135);
            long j11 = ((j10 & 16711935) << 8) | ((j10 >> 8) & 16711935);
            iArr[i11 - i13] = (int) (((j11 & 65535) << 16) | ((j11 >> 16) & 65535));
            i13++;
        }
        int i14 = i12 << 5;
        if (i10 != i14) {
            int i15 = i14 - i10;
            int i16 = iArr[0] >>> i15;
            for (i7 = 1; i7 < i12; i7++) {
                int i17 = iArr[i7];
                iArr[i7 - 1] = i16 | (i17 << (32 - i15));
                i16 = i17 >>> i15;
            }
            iArr[i11] = i16;
        }
        this.f15837d = iArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15838e == aVar.f15838e && Arrays.equals(this.f15837d, aVar.f15837d);
    }

    public final void f(int i7) {
        int[] iArr = this.f15837d;
        int i10 = i7 / 32;
        iArr[i10] = (1 << (i7 & 31)) | iArr[i10];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f15837d) + (this.f15838e * 31);
    }

    public final String toString() {
        int i7 = this.f15838e;
        StringBuilder sb2 = new StringBuilder((i7 / 8) + i7 + 1);
        for (int i10 = 0; i10 < i7; i10++) {
            if ((i10 & 7) == 0) {
                sb2.append(' ');
            }
            sb2.append(a(i10) ? 'X' : '.');
        }
        return sb2.toString();
    }
}
