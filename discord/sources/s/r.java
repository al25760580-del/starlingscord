package s;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f19648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f19649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19651d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    public final boolean equals(Object obj) {
        boolean z5;
        Object[] objArr;
        boolean z6;
        Object[] objArr2;
        boolean z7;
        long j;
        int i7;
        int iHashCode;
        int iNumberOfTrailingZeros;
        boolean z10 = true;
        if (obj == this) {
            return true;
        }
        boolean z11 = false;
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (rVar.f19651d != this.f19651d) {
            return false;
        }
        Object[] objArr3 = this.f19649b;
        long[] jArr = this.f19648a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j5 = jArr[i10];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (?? r12 = z11; r12 < i12; r12++) {
                    if ((255 & j5) < 128) {
                        Object obj2 = objArr3[(i10 << 3) + r12];
                        if (obj2 != null) {
                            rVar.getClass();
                            iHashCode = obj2.hashCode();
                        } else {
                            iHashCode = 0;
                        }
                        int i13 = iHashCode * (-862048943);
                        int i14 = i13 ^ (i13 << 16);
                        int i15 = i14 & 127;
                        z7 = z11;
                        int i16 = rVar.f19650c;
                        int i17 = (i14 >>> 7) & i16;
                        int i18 = 0;
                        while (true) {
                            long[] jArr2 = rVar.f19648a;
                            int i19 = i17 >> 3;
                            i7 = i11;
                            int i20 = (i17 & 7) << 3;
                            long j7 = jArr2[i19] >>> i20;
                            long j10 = jArr2[i19 + 1] << (64 - i20);
                            objArr2 = objArr3;
                            int i21 = i16;
                            long j11 = j7 | (j10 & ((-i20) >> 63));
                            j = j5;
                            long j12 = (((long) i15) * 72340172838076673L) ^ j11;
                            for (long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j13) >> 3) + i17) & i21;
                                if (Intrinsics.areEqual(rVar.f19649b[iNumberOfTrailingZeros], obj2)) {
                                    break;
                                }
                            }
                            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                                iNumberOfTrailingZeros = -1;
                                break;
                            }
                            i18 += 8;
                            i17 = (i17 + i18) & i21;
                            objArr3 = objArr2;
                            i16 = i21;
                            i11 = i7;
                            j5 = j;
                        }
                        if (!(iNumberOfTrailingZeros >= 0)) {
                            return z7;
                        }
                    } else {
                        objArr2 = objArr3;
                        z7 = z11;
                        j = j5;
                        i7 = i11;
                    }
                    j5 = j >> i7;
                    objArr3 = objArr2;
                    z10 = z10;
                    z11 = z7;
                    i11 = i7;
                }
                z5 = z10;
                objArr = objArr3;
                z6 = z11;
                if (i12 != i11) {
                    return z5;
                }
            } else {
                z5 = z10;
                objArr = objArr3;
                z6 = z11;
            }
            if (i10 == length) {
                return z5;
            }
            i10++;
            objArr3 = objArr;
            z10 = z5;
            z11 = z6;
        }
    }

    public final int hashCode() {
        int iHashCode = (this.f19650c * 31) + this.f19651d;
        Object[] objArr = this.f19649b;
        long[] jArr = this.f19648a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j = jArr[i7];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i7 << 3) + i11];
                            if (!Intrinsics.areEqual(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        return iHashCode;
                    }
                }
                if (i7 != length) {
                    i7++;
                }
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c A[DONT_INVERT, PHI: r11
      0x008c: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0046, B:20:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008e A[LOOP:0: B:5:0x0035->B:22:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[SYNTHETIC] */
    public final String toString() {
        androidx.fragment.app.r rVar = new androidx.fragment.app.r(5, this);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f19649b;
        long[] jArr = this.f19648a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "]");
            break;
        }
        int i7 = 0;
        int i10 = 0;
        loop0: while (true) {
            long j = jArr[i7];
            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i7 == length) {
                    sb2.append((CharSequence) "]");
                    break;
                }
                i7++;
            } else {
                int i11 = 8;
                int i12 = 8 - ((~(i7 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j & 255) < 128) {
                        Object obj = objArr[(i7 << 3) + i13];
                        if (i10 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i10 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append((CharSequence) rVar.invoke(obj));
                        i10++;
                    }
                    j >>= i11;
                    i13++;
                    i11 = i11;
                }
                if (i12 == i11) {
                    if (i7 == length) {
                        i7++;
                    }
                }
                sb2.append((CharSequence) "]");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
