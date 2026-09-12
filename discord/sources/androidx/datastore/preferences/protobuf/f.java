package androidx.datastore.preferences.protobuf;

import androidx.recyclerview.widget.RecyclerView;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g f1848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FileInputStream f1849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1854h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1855i;
    public int j = Integer.MAX_VALUE;

    public f(FileInputStream fileInputStream) {
        Charset charset = u.f1936a;
        this.f1849c = fileInputStream;
        this.f1850d = new byte[RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT];
        this.f1851e = 0;
        this.f1853g = 0;
        this.f1855i = 0;
    }

    public final int A() {
        return s();
    }

    public final long B() {
        return t();
    }

    public final void C() {
        int i7 = this.f1851e + this.f1852f;
        this.f1851e = i7;
        int i10 = this.f1855i + i7;
        int i11 = this.j;
        if (i10 <= i11) {
            this.f1852f = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f1852f = i12;
        this.f1851e = i7 - i12;
    }

    public final void D(int i7) {
        if (G(i7)) {
            return;
        }
        if (i7 <= (Integer.MAX_VALUE - this.f1855i) - this.f1853g) {
            throw w.f();
        }
        throw new w("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i7) throws w {
        int iZ;
        int i10 = i7 & 7;
        int i11 = 0;
        if (i10 == 0) {
            int i12 = this.f1851e - this.f1853g;
            byte[] bArr = this.f1850d;
            if (i12 >= 10) {
                while (i11 < 10) {
                    int i13 = this.f1853g;
                    this.f1853g = i13 + 1;
                    if (bArr[i13] < 0) {
                        i11++;
                    }
                }
                throw w.c();
            }
            while (i11 < 10) {
                if (this.f1853g == this.f1851e) {
                    D(1);
                }
                int i14 = this.f1853g;
                this.f1853g = i14 + 1;
                if (bArr[i14] < 0) {
                    i11++;
                }
            }
            throw w.c();
            return true;
        }
        if (i10 == 1) {
            F(8);
            return true;
        }
        if (i10 == 2) {
            F(s());
            return true;
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw w.b();
            }
            F(4);
            return true;
        }
        do {
            iZ = z();
            if (iZ == 0) {
                break;
            }
        } while (E(iZ));
        a(((i7 >>> 3) << 3) | 4);
        return true;
    }

    public final void F(int i7) throws w {
        int i10 = this.f1851e;
        int i11 = this.f1853g;
        int i12 = i10 - i11;
        if (i7 <= i12 && i7 >= 0) {
            this.f1853g = i11 + i7;
            return;
        }
        FileInputStream fileInputStream = this.f1849c;
        if (i7 < 0) {
            throw w.d();
        }
        int i13 = this.f1855i;
        int i14 = i13 + i11;
        int i15 = i14 + i7;
        int i16 = this.j;
        if (i15 > i16) {
            F((i16 - i13) - i11);
            throw w.f();
        }
        this.f1855i = i14;
        this.f1851e = 0;
        this.f1853g = 0;
        while (i12 < i7) {
            long j = i7 - i12;
            try {
                long jSkip = fileInputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i12 += (int) jSkip;
                }
            } finally {
                this.f1855i += i12;
                C();
            }
        }
        if (i12 >= i7) {
            return;
        }
        int i17 = this.f1851e;
        int i18 = i17 - this.f1853g;
        this.f1853g = i17;
        D(1);
        while (true) {
            int i19 = i7 - i18;
            int i20 = this.f1851e;
            if (i19 <= i20) {
                this.f1853g = i19;
                return;
            } else {
                i18 += i20;
                this.f1853g = i20;
                D(1);
            }
        }
    }

    public final boolean G(int i7) throws IOException {
        int i10 = this.f1853g;
        int i11 = i10 + i7;
        int i12 = this.f1851e;
        if (i11 <= i12) {
            throw new IllegalStateException(s0.g.d(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i13 = this.f1855i;
        if (i7 <= (Integer.MAX_VALUE - i13) - i10 && i13 + i10 + i7 <= this.j) {
            byte[] bArr = this.f1850d;
            if (i10 > 0) {
                if (i12 > i10) {
                    System.arraycopy(bArr, i10, bArr, 0, i12 - i10);
                }
                this.f1855i += i10;
                this.f1851e -= i10;
                this.f1853g = 0;
            }
            int i14 = this.f1851e;
            int iMin = Math.min(bArr.length - i14, (Integer.MAX_VALUE - this.f1855i) - i14);
            FileInputStream fileInputStream = this.f1849c;
            int i15 = fileInputStream.read(bArr, i14, iMin);
            if (i15 == 0 || i15 < -1 || i15 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
            }
            if (i15 > 0) {
                this.f1851e += i15;
                C();
                if (this.f1851e >= i7) {
                    return true;
                }
                return G(i7);
            }
        }
        return false;
    }

    public final void a(int i7) {
        if (this.f1854h != i7) {
            throw new w("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        return this.f1855i + this.f1853g;
    }

    public final boolean c() {
        return this.f1853g == this.f1851e && !G(1);
    }

    public final void d(int i7) {
        this.j = i7;
        C();
    }

    public final int e(int i7) {
        if (i7 < 0) {
            throw w.d();
        }
        int i10 = this.f1855i + this.f1853g + i7;
        int i11 = this.j;
        if (i10 > i11) {
            throw w.f();
        }
        this.j = i10;
        C();
        return i11;
    }

    public final boolean f() {
        return t() != 0;
    }

    public final double g() {
        return Double.longBitsToDouble(r());
    }

    public final int h() {
        return s();
    }

    public final int i() {
        return q();
    }

    public final long j() {
        return r();
    }

    public final float k() {
        return Float.intBitsToFloat(q());
    }

    public final int l() {
        return s();
    }

    public final long m() {
        return t();
    }

    public final byte[] n(int i7) {
        byte[] bArrO = o(i7);
        if (bArrO != null) {
            return bArrO;
        }
        int i10 = this.f1853g;
        int i11 = this.f1851e;
        int length = i11 - i10;
        this.f1855i += i11;
        this.f1853g = 0;
        this.f1851e = 0;
        ArrayList<byte[]> arrayListP = p(i7 - length);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f1850d, i10, bArr, 0, length);
        for (byte[] bArr2 : arrayListP) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] o(int i7) {
        if (i7 == 0) {
            return u.f1937b;
        }
        if (i7 < 0) {
            throw w.d();
        }
        int i10 = this.f1855i;
        int i11 = this.f1853g;
        int i12 = i10 + i11 + i7;
        if (i12 - Integer.MAX_VALUE > 0) {
            throw new w("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i13 = this.j;
        if (i12 > i13) {
            F((i13 - i10) - i11);
            throw w.f();
        }
        int i14 = this.f1851e - i11;
        int i15 = i7 - i14;
        FileInputStream fileInputStream = this.f1849c;
        if (i15 >= 4096 && i15 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.f1850d, this.f1853g, bArr, 0, i14);
        this.f1855i += this.f1851e;
        this.f1853g = 0;
        this.f1851e = 0;
        while (i14 < i7) {
            int i16 = fileInputStream.read(bArr, i14, i7 - i14);
            if (i16 == -1) {
                throw w.f();
            }
            this.f1855i += i16;
            i14 += i16;
        }
        return bArr;
    }

    public final ArrayList p(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
            byte[] bArr = new byte[iMin];
            int i10 = 0;
            while (i10 < iMin) {
                int i11 = this.f1849c.read(bArr, i10, iMin - i10);
                if (i11 == -1) {
                    throw w.f();
                }
                this.f1855i += i11;
                i10 += i11;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int q() {
        int i7 = this.f1853g;
        if (this.f1851e - i7 < 4) {
            D(4);
            i7 = this.f1853g;
        }
        this.f1853g = i7 + 4;
        byte[] bArr = this.f1850d;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    public final long r() {
        int i7 = this.f1853g;
        if (this.f1851e - i7 < 8) {
            D(8);
            i7 = this.f1853g;
        }
        this.f1853g = i7 + 8;
        byte[] bArr = this.f1850d;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    public final int s() {
        int i7;
        int i10 = this.f1853g;
        int i11 = this.f1851e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f1850d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f1853g = i12;
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
                this.f1853g = i13;
                return i7;
            }
        }
        return (int) u();
    }

    public final long t() {
        long j;
        long j5;
        long j7;
        long j10;
        int i7 = this.f1853g;
        int i10 = this.f1851e;
        if (i10 != i7) {
            int i11 = i7 + 1;
            byte[] bArr = this.f1850d;
            byte b10 = bArr[i7];
            if (b10 >= 0) {
                this.f1853g = i11;
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
                this.f1853g = i12;
                return j;
            }
        }
        return u();
    }

    public final long u() throws w {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            if (this.f1853g == this.f1851e) {
                D(1);
            }
            int i10 = this.f1853g;
            this.f1853g = i10 + 1;
            byte b10 = this.f1850d[i10];
            j |= ((long) (b10 & ByteCompanionObject.MAX_VALUE)) << i7;
            if ((b10 & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw w.c();
    }

    public final int v() {
        return q();
    }

    public final long w() {
        return r();
    }

    public final int x() {
        int iS = s();
        return (-(iS & 1)) ^ (iS >>> 1);
    }

    public final long y() {
        long jT = t();
        return (-(jT & 1)) ^ (jT >>> 1);
    }

    public final int z() {
        if (c()) {
            this.f1854h = 0;
            return 0;
        }
        int iS = s();
        this.f1854h = iS;
        if ((iS >>> 3) != 0) {
            return iS;
        }
        throw new w("Protocol message contained an invalid tag (zero).");
    }
}
