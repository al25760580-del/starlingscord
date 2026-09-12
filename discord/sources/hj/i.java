package hj;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f10841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f10847i;
    public int j = Integer.MAX_VALUE;

    public i(InputStream inputStream) {
        t.a(inputStream, "input");
        this.f10841c = inputStream;
        this.f10842d = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f10843e = 0;
        this.f10845g = 0;
        this.f10847i = 0;
    }

    public final byte[] A(int i7) throws IOException {
        byte[] bArrB = B(i7);
        if (bArrB != null) {
            return bArrB;
        }
        int i10 = this.f10845g;
        int i11 = this.f10843e;
        int length = i11 - i10;
        this.f10847i += i11;
        this.f10845g = 0;
        this.f10843e = 0;
        ArrayList<byte[]> arrayListC = C(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f10842d, i10, bArr, 0, length);
        for (byte[] bArr2 : arrayListC) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] B(int i7) throws IOException {
        if (i7 == 0) {
            return t.f10907b;
        }
        if (i7 < 0) {
            throw v.d();
        }
        int i10 = this.f10847i;
        int i11 = this.f10845g;
        int i12 = i10 + i11 + i7;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.j;
        if (i12 > i13) {
            K((i13 - i10) - i11);
            throw v.e();
        }
        int i14 = this.f10843e - i11;
        int i15 = i7 - i14;
        InputStream inputStream = this.f10841c;
        if (i15 >= 4096) {
            try {
                if (i15 > inputStream.available()) {
                    return null;
                }
            } catch (v e10) {
                e10.f10913d = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f10842d, this.f10845g, bArr, 0, i14);
        this.f10847i += this.f10843e;
        this.f10845g = 0;
        this.f10843e = 0;
        while (i14 < i7) {
            try {
                int i16 = inputStream.read(bArr, i14, i7 - i14);
                if (i16 == -1) {
                    throw v.e();
                }
                this.f10847i += i16;
                i14 += i16;
            } catch (v e11) {
                e11.f10913d = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final ArrayList C(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f10841c.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw v.e();
                }
                this.f10847i += i11;
                i10 += i11;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int D() throws v {
        int i7 = this.f10845g;
        if (this.f10843e - i7 < 4) {
            J(4);
            i7 = this.f10845g;
        }
        this.f10845g = i7 + 4;
        byte[] bArr = this.f10842d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long E() throws v {
        int i7 = this.f10845g;
        if (this.f10843e - i7 < 8) {
            J(8);
            i7 = this.f10845g;
        }
        this.f10845g = i7 + 8;
        byte[] bArr = this.f10842d;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int F() {
        int i7;
        int i10 = this.f10845g;
        int i11 = this.f10843e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f10842d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f10845g = i12;
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
                this.f10845g = i13;
                return i7;
            }
        }
        return (int) H();
    }

    public final long G() {
        long j;
        long j5;
        long j7;
        long j10;
        int i7 = this.f10845g;
        int i10 = this.f10843e;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f10842d;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.f10845g = i11;
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
                this.f10845g = i12;
                return j;
            }
        }
        return H();
    }

    public final long H() throws v {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f10845g == this.f10843e) {
                J(1);
            }
            int i10 = this.f10845g;
            this.f10845g = i10 + 1;
            byte b10 = this.f10842d[i10];
            j |= ((long) (b10 & ByteCompanionObject.MAX_VALUE)) << i7;
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw v.c();
    }

    public final void I() {
        int i7 = this.f10843e + this.f10844f;
        this.f10843e = i7;
        int i10 = this.f10847i + i7;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f10844f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f10844f = i12;
        this.f10843e = i7 - i12;
    }

    public final void J(int i7) throws v {
        if (L(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f10847i) - this.f10845g) {
            throw v.e();
        }
        throw new v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void K(int i7) throws v {
        int i10 = this.f10843e;
        int i11 = this.f10845g;
        if (i7 <= i10 - i11 && i7 >= 0) {
            this.f10845g = i11 + i7;
            return;
        }
        InputStream inputStream = this.f10841c;
        if (i7 < 0) {
            throw v.d();
        }
        int i12 = this.f10847i;
        int i13 = i12 + i11;
        int i14 = i13 + i7;
        int i15 = this.j;
        if (i14 > i15) {
            K((i15 - i12) - i11);
            throw v.e();
        }
        this.f10847i = i13;
        int i16 = i10 - i11;
        this.f10843e = 0;
        this.f10845g = 0;
        while (i16 < i7) {
            long j = i7 - i16;
            try {
                try {
                    long jSkip = inputStream.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(inputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i16 += (int) jSkip;
                    }
                } catch (v e10) {
                    e10.f10913d = true;
                    throw e10;
                }
            } catch (Throwable th2) {
                this.f10847i += i16;
                I();
                throw th2;
            }
        }
        this.f10847i += i16;
        I();
        if (i16 >= i7) {
            return;
        }
        int i17 = this.f10843e;
        int i18 = i17 - this.f10845g;
        this.f10845g = i17;
        J(1);
        while (true) {
            int i19 = i7 - i18;
            int i20 = this.f10843e;
            if (i19 <= i20) {
                this.f10845g = i19;
                return;
            } else {
                i18 += i20;
                this.f10845g = i20;
                J(1);
            }
        }
    }

    public final boolean L(int i7) throws IOException {
        InputStream inputStream = this.f10841c;
        int i10 = this.f10845g;
        int i11 = i10 + i7;
        int i12 = this.f10843e;
        if (i11 <= i12) {
            throw new IllegalStateException(s0.g.d(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.f10847i;
        if (i7 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i7 <= this.j) {
            byte[] bArr = this.f10842d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f10847i += i10;
                this.f10843e -= i10;
                this.f10845g = 0;
            }
            int i14 = this.f10843e;
            try {
                int i15 = inputStream.read(bArr, i14, Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.f10847i) - i14));
                if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                    throw new IllegalStateException(inputStream.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
                }
                if (i15 > 0) {
                    this.f10843e += i15;
                    I();
                    if (this.f10843e >= i7) {
                        return true;
                    }
                    return L(i7);
                }
            } catch (v e10) {
                e10.f10913d = true;
                throw e10;
            }
        }
        return false;
    }

    @Override // hj.j
    public final void a(int i7) throws v {
        if (this.f10846h != i7) {
            throw new v("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // hj.j
    public final int b() {
        return this.f10847i + this.f10845g;
    }

    @Override // hj.j
    public final boolean c() {
        return this.f10845g == this.f10843e && !L(1);
    }

    @Override // hj.j
    public final void d(int i7) {
        this.j = i7;
        I();
    }

    @Override // hj.j
    public final int e(int i7) throws v {
        if (i7 < 0) {
            throw v.d();
        }
        int i10 = this.f10847i + this.f10845g + i7;
        int i11 = this.j;
        if (i10 > i11) {
            throw v.e();
        }
        this.j = i10;
        I();
        return i11;
    }

    @Override // hj.j
    public final boolean f() {
        return G() != 0;
    }

    @Override // hj.j
    public final g g() throws IOException {
        int iF = F();
        int i7 = this.f10843e;
        int i10 = this.f10845g;
        int i11 = i7 - i10;
        byte[] bArr = this.f10842d;
        if (iF <= i11 && iF > 0) {
            g gVarD = g.d(bArr, i10, iF);
            this.f10845g += iF;
            return gVarD;
        }
        if (iF == 0) {
            return g.f10828i;
        }
        if (iF < 0) {
            throw v.d();
        }
        byte[] bArrB = B(iF);
        if (bArrB != null) {
            return g.d(bArrB, 0, bArrB.length);
        }
        int i12 = this.f10845g;
        int i13 = this.f10843e;
        int length = i13 - i12;
        this.f10847i += i13;
        this.f10845g = 0;
        this.f10843e = 0;
        ArrayList<byte[]> arrayListC = C(iF - length);
        byte[] bArr2 = new byte[iF];
        System.arraycopy(bArr, i12, bArr2, 0, length);
        for (byte[] bArr3 : arrayListC) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        g gVar = g.f10828i;
        return new g(bArr2);
    }

    @Override // hj.j
    public final double h() {
        return Double.longBitsToDouble(E());
    }

    @Override // hj.j
    public final int i() {
        return F();
    }

    @Override // hj.j
    public final int j() {
        return D();
    }

    @Override // hj.j
    public final long k() {
        return E();
    }

    @Override // hj.j
    public final float l() {
        return Float.intBitsToFloat(D());
    }

    @Override // hj.j
    public final int m() {
        return F();
    }

    @Override // hj.j
    public final long n() {
        return G();
    }

    @Override // hj.j
    public final int p() {
        return D();
    }

    @Override // hj.j
    public final long q() {
        return E();
    }

    @Override // hj.j
    public final int r() {
        int iF = F();
        return (-(iF & 1)) ^ (iF >>> 1);
    }

    @Override // hj.j
    public final long s() {
        long jG = G();
        return (-(jG & 1)) ^ (jG >>> 1);
    }

    @Override // hj.j
    public final String t() throws v {
        int iF = F();
        byte[] bArr = this.f10842d;
        if (iF > 0) {
            int i7 = this.f10843e;
            int i10 = this.f10845g;
            if (iF <= i7 - i10) {
                String str = new String(bArr, i10, iF, t.f10906a);
                this.f10845g += iF;
                return str;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF < 0) {
            throw v.d();
        }
        if (iF > this.f10843e) {
            return new String(A(iF), t.f10906a);
        }
        J(iF);
        String str2 = new String(bArr, this.f10845g, iF, t.f10906a);
        this.f10845g += iF;
        return str2;
    }

    @Override // hj.j
    public final String u() throws IOException {
        int iF = F();
        int i7 = this.f10845g;
        int i10 = this.f10843e;
        int i11 = i10 - i7;
        byte[] bArrA = this.f10842d;
        if (iF <= i11 && iF > 0) {
            this.f10845g = i7 + iF;
        } else {
            if (iF == 0) {
                return "";
            }
            if (iF < 0) {
                throw v.d();
            }
            i7 = 0;
            if (iF <= i10) {
                J(iF);
                this.f10845g = iF;
            } else {
                bArrA = A(iF);
            }
        }
        return e1.f10825a.m(bArrA, i7, iF);
    }

    @Override // hj.j
    public final int v() throws v {
        if (c()) {
            this.f10846h = 0;
            return 0;
        }
        int iF = F();
        this.f10846h = iF;
        if ((iF >>> 3) != 0) {
            return iF;
        }
        throw new v("Protocol message contained an invalid tag (zero).");
    }

    @Override // hj.j
    public final int w() {
        return F();
    }

    @Override // hj.j
    public final long x() {
        return G();
    }

    @Override // hj.j
    public final boolean y(int i7) throws v {
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                K(8);
                return true;
            }
            if (i10 == 2) {
                K(F());
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
            K(4);
            return true;
        }
        int i12 = this.f10843e - this.f10845g;
        byte[] bArr = this.f10842d;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f10845g;
                this.f10845g = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw v.c();
        }
        while (i11 < 10) {
            if (this.f10845g == this.f10843e) {
                J(1);
            }
            int i14 = this.f10845g;
            this.f10845g = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw v.c();
        return true;
    }
}
