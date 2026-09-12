package s;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f19643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f19644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f19645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19646d;

    public final Object a(Object obj) {
        int iNumberOfTrailingZeros;
        int i7 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f19646d;
        int i13 = i10 >>> 7;
        loop0: while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f19643a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j5 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j7 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i14) & i12;
                if (Intrinsics.areEqual(this.f19644b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i7 += 8;
            i13 = i14 + i7;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f19645c[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v4, types: [int] */
    public final boolean equals(Object obj) {
        boolean z5;
        Object[] objArr;
        boolean z6;
        Object[] objArr2;
        long[] jArr;
        Object[] objArr3;
        boolean z7;
        long[] jArr2;
        int i7;
        Object[] objArr4;
        int iHashCode;
        int iNumberOfTrailingZeros;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        boolean z11 = false;
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        Object[] objArr5 = this.f19644b;
        Object[] objArr6 = this.f19645c;
        long[] jArr3 = this.f19643a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j = jArr3[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (?? r13 = z11; r13 < i12; r13++) {
                    if ((255 & j) < 128) {
                        ?? r14 = (i10 << 3) + r13;
                        Object obj2 = objArr5[r14];
                        Object obj3 = objArr6[r14];
                        if (obj3 != null) {
                            objArr3 = objArr5;
                            z7 = z11;
                            jArr2 = jArr3;
                            i7 = i11;
                            objArr4 = objArr6;
                            if (!Intrinsics.areEqual(obj3, pVar.a(obj2))) {
                                return z7;
                            }
                        } else {
                            if (pVar.a(obj2) != null) {
                                return z11;
                            }
                            if (obj2 != null) {
                                pVar.getClass();
                                iHashCode = obj2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            int i13 = iHashCode * (-862048943);
                            int i14 = i13 ^ (i13 << 16);
                            int i15 = i14 & 127;
                            z7 = z11;
                            int i16 = pVar.f19646d;
                            int i17 = (i14 >>> 7) & i16;
                            int i18 = 0;
                            while (true) {
                                long[] jArr4 = pVar.f19643a;
                                int i19 = i17 >> 3;
                                i7 = i11;
                                int i20 = (i17 & 7) << 3;
                                long j5 = jArr4[i19] >>> i20;
                                long j7 = jArr4[i19 + 1] << (64 - i20);
                                objArr3 = objArr5;
                                int i21 = i16;
                                long j10 = j5 | (j7 & ((-i20) >> 63));
                                objArr4 = objArr6;
                                jArr2 = jArr3;
                                long j11 = (((long) i15) * 72340172838076673L) ^ j10;
                                for (long j12 = (j11 - 72340172838076673L) & (~j11) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                                    iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j12) >> 3)) & i21;
                                    if (Intrinsics.areEqual(pVar.f19644b[iNumberOfTrailingZeros], obj2)) {
                                        break;
                                    }
                                }
                                if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                                    iNumberOfTrailingZeros = -1;
                                    break;
                                }
                                i18 += 8;
                                i17 = (i17 + i18) & i21;
                                objArr6 = objArr4;
                                i16 = i21;
                                objArr5 = objArr3;
                                i11 = i7;
                                jArr3 = jArr2;
                            }
                            if (!(iNumberOfTrailingZeros >= 0)) {
                                return z7;
                            }
                        }
                    } else {
                        objArr3 = objArr5;
                        z7 = z11;
                        jArr2 = jArr3;
                        i7 = i11;
                        objArr4 = objArr6;
                    }
                    j >>= i7;
                    objArr6 = objArr4;
                    z10 = z10;
                    z11 = z7;
                    objArr5 = objArr3;
                    i11 = i7;
                    jArr3 = jArr2;
                }
                z5 = z10;
                objArr = objArr5;
                z6 = z11;
                jArr = jArr3;
                int i22 = i11;
                objArr2 = objArr6;
                if (i12 != i22) {
                    return z5;
                }
            } else {
                z5 = z10;
                objArr = objArr5;
                z6 = z11;
                objArr2 = objArr6;
                jArr = jArr3;
            }
            if (i10 == length) {
                return z5;
            }
            i10++;
            objArr6 = objArr2;
            z10 = z5;
            z11 = z6;
            objArr5 = objArr;
            jArr3 = jArr;
        }
    }

    public final int hashCode() {
        Object[] objArr = this.f19644b;
        Object[] objArr2 = this.f19645c;
        long[] jArr = this.f19643a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i7 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i7 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i7 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return iHashCode;
                }
            }
            if (i7 == length) {
                return iHashCode;
            }
            i7++;
        }
    }

    public final String toString() {
        return "{}";
    }
}
