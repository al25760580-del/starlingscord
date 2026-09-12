package y;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rn.d0;
import rn.e0;
import s.o;
import s.q;
import s.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f23092h = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f23093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f23094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public o f23096g;

    public b(long j, Function1 function1, Function1 function2) {
        super(j, e.f23106w);
        this.f23093d = function1;
        this.f23094e = function2;
    }

    @Override // y.c
    public boolean d() {
        return false;
    }

    @Override // y.c
    public int f() {
        return this.f23095f;
    }

    @Override // y.c
    public Function1 g() {
        return this.f23094e;
    }

    @Override // y.c
    public void h(g gVar) {
        int iHashCode;
        long j;
        long j5;
        long j7;
        int iNumberOfTrailingZeros;
        long[] jArr;
        long j10;
        Object[] objArr;
        o oVarJ = j();
        int i7 = 6;
        if (oVarJ == null) {
            int i10 = s.f19652a;
            oVarJ = new o(6);
            l(oVarJ);
        }
        if (gVar != null) {
            oVarJ.getClass();
            iHashCode = gVar.hashCode();
        } else {
            iHashCode = 0;
        }
        int i11 = -862048943;
        int i12 = iHashCode * (-862048943);
        int i13 = i12 ^ (i12 << 16);
        int i14 = i13 >>> 7;
        int i15 = i13 & 127;
        int i16 = oVarJ.f19650c;
        int i17 = i14 & i16;
        int i18 = 0;
        loop0: while (true) {
            long[] jArr2 = oVarJ.f19648a;
            int i19 = i17 >> 3;
            int i20 = (i17 & 7) << 3;
            int i21 = i7;
            long j11 = (((-i20) >> 63) & (jArr2[i19 + 1] << (64 - i20))) | (jArr2[i19] >>> i20);
            long j12 = i15;
            int i22 = i15;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                iNumberOfTrailingZeros = (i17 + (Long.numberOfTrailingZeros(j14) >> 3)) & i16;
                int i23 = i11;
                if (Intrinsics.areEqual(oVarJ.f19649b[iNumberOfTrailingZeros], gVar)) {
                    break loop0;
                }
                j14 &= j14 - 1;
                i11 = i23;
            }
            int i24 = i11;
            if ((j11 & ((~j11) << i21) & (-9187201950435737472L)) != 0) {
                int iA = oVarJ.a(i14);
                long j15 = 255;
                if (oVarJ.f19642e != 0 || ((oVarJ.f19648a[iA >> 3] >> ((iA & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j5 = j12;
                    j7 = 128;
                } else {
                    int i25 = oVarJ.f19650c;
                    if (i25 > 8) {
                        long j16 = oVarJ.f19651d;
                        d0 d0Var = e0.f19470e;
                        j7 = 128;
                        if (Long.compare((j16 * 32) ^ Long.MIN_VALUE, (((long) i25) * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = oVarJ.f19648a;
                            int i26 = oVarJ.f19650c;
                            Object[] objArr2 = oVarJ.f19649b;
                            int i27 = (i26 + 7) >> 3;
                            int i28 = 0;
                            while (i28 < i27) {
                                long j17 = j15;
                                long j18 = jArr3[i28] & (-9187201950435737472L);
                                jArr3[i28] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i28++;
                                j12 = j12;
                                j15 = j17;
                            }
                            j = j15;
                            j5 = j12;
                            char c8 = 7;
                            Intrinsics.checkNotNullParameter(jArr3, "<this>");
                            int length = jArr3.length;
                            int i29 = length - 1;
                            int i30 = length - 2;
                            long j19 = 72057594037927935L;
                            jArr3[i30] = (jArr3[i30] & 72057594037927935L) | (-72057594037927936L);
                            jArr3[i29] = jArr3[0];
                            int i31 = 0;
                            while (i31 != i26) {
                                int i32 = i31 >> 3;
                                int i33 = (i31 & 7) << 3;
                                long j20 = (jArr3[i32] >> i33) & j;
                                if (j20 != 128 && j20 == 254) {
                                    Object obj = objArr2[i31];
                                    int iHashCode2 = (obj != null ? obj.hashCode() : 0) * i24;
                                    int i34 = iHashCode2 ^ (iHashCode2 << 16);
                                    int i35 = i34 >>> 7;
                                    int iA2 = oVarJ.a(i35);
                                    int i36 = i35 & i26;
                                    c8 = c8;
                                    if (((iA2 - i36) & i26) / 8 == ((i31 - i36) & i26) / 8) {
                                        j10 = j19;
                                        jArr3[i32] = (((long) (i34 & 127)) << i33) | (jArr3[i32] & (~(j << i33)));
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j10) | Long.MIN_VALUE;
                                        i31++;
                                    } else {
                                        j10 = j19;
                                        int i37 = iA2 >> 3;
                                        long j21 = jArr3[i37];
                                        int i38 = (iA2 & 7) << 3;
                                        if (((j21 >> i38) & j) == 128) {
                                            objArr = objArr2;
                                            jArr3[i37] = ((~(j << i38)) & j21) | (((long) (i34 & 127)) << i38);
                                            jArr3[i32] = (jArr3[i32] & (~(j << i33))) | (128 << i33);
                                            objArr[iA2] = objArr[i31];
                                            objArr[i31] = null;
                                        } else {
                                            objArr = objArr2;
                                            jArr3[i37] = (((long) (i34 & 127)) << i38) | ((~(j << i38)) & j21);
                                            Object obj2 = objArr[iA2];
                                            objArr[iA2] = objArr[i31];
                                            objArr[i31] = obj2;
                                            i31--;
                                        }
                                        Intrinsics.checkNotNullParameter(jArr3, "<this>");
                                        jArr3[jArr3.length - 1] = (jArr3[0] & j10) | Long.MIN_VALUE;
                                        i31++;
                                        i26 = i26;
                                        objArr2 = objArr;
                                    }
                                    j19 = j10;
                                } else {
                                    i31++;
                                }
                            }
                            oVarJ.f19642e = q.a(oVarJ.f19650c) - oVarJ.f19651d;
                        }
                        iA = oVarJ.a(i14);
                    } else {
                        j7 = 128;
                    }
                    j = 255;
                    j5 = j12;
                    int i39 = oVarJ.f19650c;
                    long[] jArr4 = q.f19647a;
                    int i40 = i39 == 0 ? i21 : (i39 * 2) + 1;
                    long[] jArr5 = oVarJ.f19648a;
                    Object[] objArr3 = oVarJ.f19649b;
                    oVarJ.b(i40);
                    long[] jArr6 = oVarJ.f19648a;
                    Object[] objArr4 = oVarJ.f19649b;
                    int i41 = oVarJ.f19650c;
                    int i42 = 0;
                    while (i42 < i39) {
                        if (((jArr5[i42 >> 3] >> ((i42 & 7) << 3)) & 255) < j7) {
                            Object obj3 = objArr3[i42];
                            int iHashCode3 = (obj3 != null ? obj3.hashCode() : 0) * i24;
                            int i43 = iHashCode3 ^ (iHashCode3 << 16);
                            int iA3 = oVarJ.a(i43 >>> 7);
                            long j22 = i43 & 127;
                            int i44 = iA3 >> 3;
                            int i45 = (iA3 & 7) << 3;
                            jArr = jArr6;
                            long j23 = (jArr6[i44] & (~(255 << i45))) | (j22 << i45);
                            jArr[i44] = j23;
                            jArr[(((iA3 - 7) & i41) + (i41 & 7)) >> 3] = j23;
                            objArr4[iA3] = obj3;
                        } else {
                            jArr = jArr6;
                        }
                        i42++;
                        i39 = i39;
                        jArr6 = jArr;
                    }
                    iA = oVarJ.a(i14);
                }
                iNumberOfTrailingZeros = iA;
                oVarJ.f19651d++;
                int i46 = oVarJ.f19642e;
                long[] jArr7 = oVarJ.f19648a;
                int i47 = iNumberOfTrailingZeros >> 3;
                long j24 = jArr7[i47];
                int i48 = (iNumberOfTrailingZeros & 7) << 3;
                oVarJ.f19642e = i46 - (((j24 >> i48) & j) == j7 ? 1 : 0);
                int i49 = oVarJ.f19650c;
                long j25 = (j24 & (~(j << i48))) | (j5 << i48);
                jArr7[i47] = j25;
                jArr7[(((iNumberOfTrailingZeros - 7) & i49) + (i49 & 7)) >> 3] = j25;
                break;
            }
            i18 += 8;
            i17 = (i17 + i18) & i16;
            i7 = i21;
            i15 = i22;
            i11 = i24;
        }
        oVarJ.f19649b[iNumberOfTrailingZeros] = gVar;
    }

    @Override // y.c
    public void i(int i7) {
        this.f23095f = i7;
    }

    public o j() {
        return this.f23096g;
    }

    @Override // y.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public Function1 c() {
        return this.f23093d;
    }

    public void l(o oVar) {
        this.f23096g = oVar;
    }
}
