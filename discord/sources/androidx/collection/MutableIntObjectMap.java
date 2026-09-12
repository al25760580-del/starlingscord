package androidx.collection;

import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import rn.d0;
import rn.e0;
import s.g;
import s.q;

/* JADX INFO: loaded from: classes.dex */
public final class MutableIntObjectMap extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1219f;

    public final int c(int i7) {
        int i10 = this.f19630d;
        int i11 = i7 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f19627a;
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

    public final void d(int i7) {
        long[] jArr;
        int iMax = i7 > 0 ? Math.max(7, q.b(i7)) : 0;
        this.f19630d = iMax;
        if (iMax == 0) {
            jArr = q.f19647a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            w.l(jArr, -9187201950435737472L);
        }
        this.f19627a = jArr;
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f1219f = q.a(this.f19630d) - this.f19631e;
        this.f19628b = new int[iMax];
        this.f19629c = new Object[iMax];
    }

    public final Object e(int i7) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i7) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f19630d;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.f19627a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j5 = (((long) i11) * 72340172838076673L) ^ j;
            for (long j7 = (~j5) & (j5 - 72340172838076673L) & (-9187201950435737472L); j7 != 0; j7 &= j7 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j7) >> 3) + i13) & i12;
                if (this.f19628b[iNumberOfTrailingZeros] == i7) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros < 0) {
            return null;
        }
        this.f19631e--;
        long[] jArr2 = this.f19627a;
        int i17 = this.f19630d;
        int i18 = iNumberOfTrailingZeros >> 3;
        int i19 = (iNumberOfTrailingZeros & 7) << 3;
        long j10 = (jArr2[i18] & (~(255 << i19))) | (254 << i19);
        jArr2[i18] = j10;
        jArr2[(((iNumberOfTrailingZeros - 7) & i17) + (i17 & 7)) >> 3] = j10;
        Object[] objArr = this.f19629c;
        Object obj = objArr[iNumberOfTrailingZeros];
        objArr[iNumberOfTrailingZeros] = null;
        return obj;
    }

    public final void f(int i7, Object obj) {
        long j;
        long j5;
        int i10;
        long j7;
        int iC;
        int[] iArr;
        Object[] objArr;
        int i11 = i7;
        int i12 = -862048943;
        int iHashCode = Integer.hashCode(i11) * (-862048943);
        int i13 = iHashCode ^ (iHashCode << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = this.f19630d;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr = this.f19627a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = 1;
            int i22 = i18;
            long j10 = (((-i20) >> 63) & (jArr[i19 + 1] << (64 - i20))) | (jArr[i19] >>> i20);
            long j11 = i15;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (j12 - 72340172838076673L) & (~j12) & (-9187201950435737472L);
            while (j13 != 0) {
                iC = ((Long.numberOfTrailingZeros(j13) >> 3) + i17) & i16;
                int i23 = i12;
                if (this.f19628b[iC] == i11) {
                    break loop0;
                }
                j13 &= j13 - 1;
                i12 = i23;
            }
            int i24 = i12;
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                int iC2 = c(i14);
                long j14 = 255;
                if (this.f1219f != 0 || ((this.f19627a[iC2 >> 3] >> ((iC2 & 7) << 3)) & 255) == 254) {
                    j = j11;
                    j5 = 255;
                    i10 = 1;
                    j7 = 128;
                    iC = iC2;
                } else {
                    int i25 = this.f19630d;
                    if (i25 > 8) {
                        j7 = 128;
                        long j15 = this.f19631e;
                        d0 d0Var = e0.f19470e;
                        j = j11;
                        char c8 = '\b';
                        if (Long.compare((j15 * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr2 = this.f19627a;
                            int i26 = this.f19630d;
                            int[] iArr2 = this.f19628b;
                            Object[] objArr2 = this.f19629c;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            while (i28 < i27) {
                                char c10 = c8;
                                long j16 = jArr2[i28] & (-9187201950435737472L);
                                jArr2[i28] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i28++;
                                c8 = c10;
                                i21 = i21;
                                j14 = j14;
                            }
                            char c11 = c8;
                            j5 = j14;
                            int i29 = i21;
                            Intrinsics.checkNotNullParameter(jArr2, "<this>");
                            int length = jArr2.length;
                            int i30 = length - 1;
                            int i31 = length - 2;
                            jArr2[i31] = (jArr2[i31] & 72057594037927935L) | (-72057594037927936L);
                            jArr2[i30] = jArr2[0];
                            int i32 = 0;
                            while (i32 != i26) {
                                int i33 = i32 >> 3;
                                int i34 = (i32 & 7) << 3;
                                long j17 = (jArr2[i33] >> i34) & j5;
                                if (j17 != 128 && j17 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i32]) * i24;
                                    int i35 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i36 = i35 >>> 7;
                                    int iC3 = c(i36);
                                    int i37 = i36 & i26;
                                    char c12 = c11;
                                    if (((iC3 - i37) & i26) / 8 == ((i32 - i37) & i26) / 8) {
                                        int i38 = i29;
                                        jArr2[i33] = (jArr2[i33] & (~(j5 << i34))) | (((long) (i35 & 127)) << i34);
                                        Intrinsics.checkNotNullParameter(jArr2, "<this>");
                                        jArr2[jArr2.length - i38] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                        i29 = i38;
                                        c11 = c12;
                                    } else {
                                        int i39 = i29;
                                        int i40 = iC3 >> 3;
                                        long j18 = jArr2[i40];
                                        int i41 = (iC3 & 7) << 3;
                                        if (((j18 >> i41) & j5) == 128) {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr2[i40] = (j18 & (~(j5 << i41))) | (((long) (i35 & 127)) << i41);
                                            jArr2[i33] = (jArr2[i33] & (~(j5 << i34))) | (128 << i34);
                                            iArr[iC3] = iArr[i32];
                                            iArr[i32] = 0;
                                            objArr[iC3] = objArr[i32];
                                            objArr[i32] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr2[i40] = (((long) (i35 & 127)) << i41) | (j18 & (~(j5 << i41)));
                                            int i42 = iArr[iC3];
                                            iArr[iC3] = iArr[i32];
                                            iArr[i32] = i42;
                                            Object obj2 = objArr[iC3];
                                            objArr[iC3] = objArr[i32];
                                            objArr[i32] = obj2;
                                            i32--;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr2, "<this>");
                                        jArr2[jArr2.length - 1] = (jArr2[0] & 72057594037927935L) | Long.MIN_VALUE;
                                        i32++;
                                        i29 = i39;
                                        c11 = c12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i32++;
                                }
                            }
                            i10 = i29;
                            this.f1219f = q.a(this.f19630d) - this.f19631e;
                        }
                        iC = c(i14);
                    } else {
                        j = j11;
                        j7 = 128;
                    }
                    j5 = 255;
                    i10 = 1;
                    int i43 = this.f19630d;
                    long[] jArr3 = q.f19647a;
                    int i44 = i43 != 0 ? (i43 * 2) + 1 : 6;
                    long[] jArr4 = this.f19627a;
                    int[] iArr3 = this.f19628b;
                    Object[] objArr3 = this.f19629c;
                    d(i44);
                    long[] jArr5 = this.f19627a;
                    int[] iArr4 = this.f19628b;
                    Object[] objArr4 = this.f19629c;
                    int i45 = this.f19630d;
                    int i46 = 0;
                    while (i46 < i43) {
                        if (((jArr4[i46 >> 3] >> ((i46 & 7) << 3)) & 255) < j7) {
                            int i47 = iArr3[i46];
                            int iHashCode3 = Integer.hashCode(i47) * i24;
                            int i48 = iHashCode3 ^ (iHashCode3 << 16);
                            int iC4 = c(i48 >>> 7);
                            long j19 = i48 & 127;
                            int i49 = iC4 >> 3;
                            int i50 = (iC4 & 7) << 3;
                            long j20 = (jArr5[i49] & (~(255 << i50))) | (j19 << i50);
                            jArr5[i49] = j20;
                            jArr5[(((iC4 - 7) & i45) + (i45 & 7)) >> 3] = j20;
                            iArr4[iC4] = i47;
                            objArr4[iC4] = objArr3[i46];
                        }
                        i46++;
                        i43 = i43;
                    }
                    iC = c(i14);
                }
                this.f19631e++;
                int i51 = this.f1219f;
                long[] jArr6 = this.f19627a;
                int i52 = iC >> 3;
                long j21 = jArr6[i52];
                int i53 = (iC & 7) << 3;
                this.f1219f = i51 - (((j21 >> i53) & j5) == j7 ? i10 : 0);
                int i54 = this.f19630d;
                long j22 = (j21 & (~(j5 << i53))) | (j << i53);
                jArr6[i52] = j22;
                jArr6[(((iC - 7) & i54) + (i54 & 7)) >> 3] = j22;
                break;
            }
            i18 = i22 + 8;
            i17 = (i17 + i18) & i16;
            i11 = i7;
            i12 = i24;
        }
        this.f19628b[iC] = i7;
        this.f19629c[iC] = obj;
    }
}
