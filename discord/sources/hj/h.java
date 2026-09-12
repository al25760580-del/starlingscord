package hj;

import java.util.Arrays;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f10834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10840i = Integer.MAX_VALUE;

    public h(byte[] bArr, int i7, int i10, boolean z5) {
        this.f10834c = bArr;
        this.f10835d = i10 + i7;
        this.f10837f = i7;
        this.f10838g = i7;
    }

    public final int A() throws v {
        int i7 = this.f10837f;
        if (this.f10835d - i7 < 4) {
            throw v.e();
        }
        this.f10837f = i7 + 4;
        byte[] bArr = this.f10834c;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long B() throws v {
        int i7 = this.f10837f;
        if (this.f10835d - i7 < 8) {
            throw v.e();
        }
        this.f10837f = i7 + 8;
        byte[] bArr = this.f10834c;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int C() {
        int i7;
        int i10 = this.f10837f;
        int i11 = this.f10835d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f10834c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f10837f = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i7 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i7 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i7 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i7 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i19;
                            }
                            i7 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f10837f = i13;
                return i7;
            }
        }
        return (int) E();
    }

    public final long D() {
        long j;
        long j5;
        long j7;
        long j10;
        int i7 = this.f10837f;
        int i10 = this.f10835d;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f10834c;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.f10837f = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i7 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i7 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i7 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j10 = (-2080896) ^ i17;
                        } else {
                            long j11 = i17;
                            i12 = i7 + 5;
                            long j12 = j11 ^ (((long) bArr[i16]) << 28);
                            if (j12 >= 0) {
                                j7 = 266354560;
                            } else {
                                i16 = i7 + 6;
                                long j13 = j12 ^ (((long) bArr[i12]) << 35);
                                if (j13 < 0) {
                                    j5 = -34093383808L;
                                } else {
                                    i12 = i7 + 7;
                                    j12 = j13 ^ (((long) bArr[i16]) << 42);
                                    if (j12 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j13 = j12 ^ (((long) bArr[i12]) << 49);
                                        if (j13 < 0) {
                                            j5 = -558586000294016L;
                                        } else {
                                            i12 = i7 + 9;
                                            long j14 = (j13 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i18 = i7 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j14;
                                        }
                                    }
                                }
                                j10 = j5 ^ j13;
                            }
                            j = j7 ^ j12;
                        }
                        i12 = i16;
                        j = j10;
                    }
                }
                this.f10837f = i12;
                return j;
            }
        }
        return E();
    }

    public final long E() throws v {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i10 = this.f10837f;
            if (i10 == this.f10835d) {
                throw v.e();
            }
            this.f10837f = i10 + 1;
            byte b10 = this.f10834c[i10];
            j |= ((long) (b10 & ByteCompanionObject.MAX_VALUE)) << i7;
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw v.c();
    }

    public final void F() {
        int i7 = this.f10835d + this.f10836e;
        this.f10835d = i7;
        int i10 = i7 - this.f10838g;
        int i11 = this.f10840i;
        if (i10 <= i11) {
            this.f10836e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f10836e = i12;
        this.f10835d = i7 - i12;
    }

    public final void G(int i7) throws v {
        if (i7 >= 0) {
            int i10 = this.f10835d;
            int i11 = this.f10837f;
            if (i7 <= i10 - i11) {
                this.f10837f = i11 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw v.e();
        }
        throw v.d();
    }

    @Override // hj.j
    public final void a(int i7) throws v {
        if (this.f10839h != i7) {
            throw new v("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // hj.j
    public final int b() {
        return this.f10837f - this.f10838g;
    }

    @Override // hj.j
    public final boolean c() {
        return this.f10837f == this.f10835d;
    }

    @Override // hj.j
    public final void d(int i7) {
        this.f10840i = i7;
        F();
    }

    @Override // hj.j
    public final int e(int i7) throws v {
        if (i7 < 0) {
            throw v.d();
        }
        int iB = b() + i7;
        if (iB < 0) {
            throw new v("Failed to parse the message.");
        }
        int i10 = this.f10840i;
        if (iB > i10) {
            throw v.e();
        }
        this.f10840i = iB;
        F();
        return i10;
    }

    @Override // hj.j
    public final boolean f() {
        return D() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0033  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // hj.j
    public final g g() throws v {
        byte[] bArrCopyOfRange;
        int iC = C();
        byte[] bArr = this.f10834c;
        if (iC > 0) {
            int i7 = this.f10835d;
            int i10 = this.f10837f;
            if (iC <= i7 - i10) {
                g gVarD = g.d(bArr, i10, iC);
                this.f10837f += iC;
                return gVarD;
            }
        }
        if (iC == 0) {
            return g.f10828i;
        }
        if (iC > 0) {
            int i11 = this.f10835d;
            int i12 = this.f10837f;
            if (iC <= i11 - i12) {
                int i13 = iC + i12;
                this.f10837f = i13;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, i13);
            } else {
                if (iC <= 0) {
                    throw v.e();
                }
                if (iC == 0) {
                    throw v.d();
                }
                bArrCopyOfRange = t.f10907b;
            }
        } else {
            if (iC <= 0) {
                throw v.e();
            }
            if (iC == 0) {
                throw v.d();
            }
            bArrCopyOfRange = t.f10907b;
        }
        g gVar = g.f10828i;
        return new g(bArrCopyOfRange);
    }

    @Override // hj.j
    public final double h() {
        return Double.longBitsToDouble(B());
    }

    @Override // hj.j
    public final int i() {
        return C();
    }

    @Override // hj.j
    public final int j() {
        return A();
    }

    @Override // hj.j
    public final long k() {
        return B();
    }

    @Override // hj.j
    public final float l() {
        return Float.intBitsToFloat(A());
    }

    @Override // hj.j
    public final int m() {
        return C();
    }

    @Override // hj.j
    public final long n() {
        return D();
    }

    @Override // hj.j
    public final int p() {
        return A();
    }

    @Override // hj.j
    public final long q() {
        return B();
    }

    @Override // hj.j
    public final int r() {
        int iC = C();
        return (-(iC & 1)) ^ (iC >>> 1);
    }

    @Override // hj.j
    public final long s() {
        long jD = D();
        return (-(jD & 1)) ^ (jD >>> 1);
    }

    @Override // hj.j
    public final String t() throws v {
        int iC = C();
        if (iC > 0) {
            int i7 = this.f10835d;
            int i10 = this.f10837f;
            if (iC <= i7 - i10) {
                String str = new String(this.f10834c, i10, iC, t.f10906a);
                this.f10837f += iC;
                return str;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC < 0) {
            throw v.d();
        }
        throw v.e();
    }

    @Override // hj.j
    public final String u() throws v {
        int iC = C();
        if (iC > 0) {
            int i7 = this.f10835d;
            int i10 = this.f10837f;
            if (iC <= i7 - i10) {
                String strM = e1.f10825a.m(this.f10834c, i10, iC);
                this.f10837f += iC;
                return strM;
            }
        }
        if (iC == 0) {
            return "";
        }
        if (iC <= 0) {
            throw v.d();
        }
        throw v.e();
    }

    @Override // hj.j
    public final int v() throws v {
        if (c()) {
            this.f10839h = 0;
            return 0;
        }
        int iC = C();
        this.f10839h = iC;
        if ((iC >>> 3) != 0) {
            return iC;
        }
        throw new v("Protocol message contained an invalid tag (zero).");
    }

    @Override // hj.j
    public final int w() {
        return C();
    }

    @Override // hj.j
    public final long x() {
        return D();
    }

    @Override // hj.j
    public final boolean y(int i7) throws v {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                G(8);
                return true;
            }
            if (i10 == 2) {
                G(C());
                return true;
            }
            if (i10 == 3) {
                z();
                a(((i7 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw v.b();
            }
            G(4);
            return true;
        }
        int i12 = this.f10835d - this.f10837f;
        byte[] bArr = this.f10834c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f10837f;
                this.f10837f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw v.c();
        }
        while (i11 < 10) {
            int i14 = this.f10837f;
            if (i14 == this.f10835d) {
                throw v.e();
            }
            this.f10837f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw v.c();
        return true;
    }
}
