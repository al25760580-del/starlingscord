package je;

import ei.h0;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f13857d = {'\r', '\n'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f13858e = {'\n'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f13859f = h0.k(5, di.d.f7629a, di.d.f7631c, di.d.f7634f, di.d.f7632d, di.d.f7633e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f13860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13862c;

    public w() {
        this.f13860a = e0.f13793f;
    }

    public final long A() {
        int i7;
        int i10;
        long j = this.f13860a[this.f13861b];
        int i11 = 7;
        while (true) {
            if (i11 >= 0) {
                int i12 = 1 << i11;
                if ((((long) i12) & j) == 0) {
                    if (i11 < 6) {
                        j &= (long) (i12 - 1);
                        i10 = 7 - i11;
                        break;
                    }
                    if (i11 == 7) {
                        i10 = 1;
                        break;
                    }
                } else {
                    i11--;
                }
            }
            i10 = 0;
            break;
        }
        if (i10 == 0) {
            throw new NumberFormatException(kk.b.i(j, "Invalid UTF-8 sequence first byte: "));
        }
        for (i7 = 1; i7 < i10; i7++) {
            byte b10 = this.f13860a[this.f13861b + i7];
            if ((b10 & 192) != 128) {
                throw new NumberFormatException(kk.b.i(j, "Invalid UTF-8 sequence continuation byte: "));
            }
            j = (j << 6) | ((long) (b10 & 63));
        }
        this.f13861b += i10;
        return j;
    }

    public final Charset B() {
        if (a() >= 3) {
            byte[] bArr = this.f13860a;
            int i7 = this.f13861b;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f13861b = i7 + 3;
                return di.d.f7631c;
            }
        }
        if (a() < 2) {
            return null;
        }
        byte[] bArr2 = this.f13860a;
        int i10 = this.f13861b;
        byte b10 = bArr2[i10];
        if (b10 == -2 && bArr2[i10 + 1] == -1) {
            this.f13861b = i10 + 2;
            return di.d.f7632d;
        }
        if (b10 != -1 || bArr2[i10 + 1] != -2) {
            return null;
        }
        this.f13861b = i10 + 2;
        return di.d.f7633e;
    }

    public final void C(int i7) {
        byte[] bArr = this.f13860a;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        D(bArr, i7);
    }

    public final void D(byte[] bArr, int i7) {
        this.f13860a = bArr;
        this.f13862c = i7;
        this.f13861b = 0;
    }

    public final void E(int i7) {
        b.g(i7 >= 0 && i7 <= this.f13860a.length);
        this.f13862c = i7;
    }

    public final void F(int i7) {
        b.g(i7 >= 0 && i7 <= this.f13862c);
        this.f13861b = i7;
    }

    public final void G(int i7) {
        F(this.f13861b + i7);
    }

    public final int a() {
        return this.f13862c - this.f13861b;
    }

    public final void b(int i7) {
        byte[] bArr = this.f13860a;
        if (i7 > bArr.length) {
            this.f13860a = Arrays.copyOf(bArr, i7);
        }
    }

    public final char c(Charset charset) {
        b.f("Unsupported charset: " + charset, f13859f.contains(charset));
        return (char) (d(charset) >> 16);
    }

    public final int d(Charset charset) {
        byte b10;
        int i7;
        byte b11;
        byte b12;
        if ((charset.equals(di.d.f7631c) || charset.equals(di.d.f7629a)) && a() >= 1) {
            long j = this.f13860a[this.f13861b] & 255;
            char c8 = (char) j;
            ls.l.d(((long) c8) == j, "Out of range: %s", j);
            b10 = (byte) c8;
            i7 = 1;
        } else {
            i7 = 2;
            if ((charset.equals(di.d.f7634f) || charset.equals(di.d.f7632d)) && a() >= 2) {
                byte[] bArr = this.f13860a;
                int i10 = this.f13861b;
                b11 = bArr[i10];
                b12 = bArr[i10 + 1];
            } else {
                if (!charset.equals(di.d.f7633e) || a() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.f13860a;
                int i11 = this.f13861b;
                b11 = bArr2[i11 + 1];
                b12 = bArr2[i11];
            }
            b10 = (byte) ((char) ((b12 & 255) | (b11 << 8)));
        }
        long j5 = b10;
        char c10 = (char) j5;
        ls.l.d(((long) c10) == j5, "Out of range: %s", j5);
        return (c10 << 16) + i7;
    }

    public final void e(byte[] bArr, int i7, int i10) {
        System.arraycopy(this.f13860a, this.f13861b, bArr, i7, i10);
        this.f13861b += i10;
    }

    public final char f(Charset charset, char[] cArr) {
        int iD = d(charset);
        if (iD != 0) {
            char c8 = (char) (iD >> 16);
            for (char c10 : cArr) {
                if (c10 == c8) {
                    this.f13861b += iD & 65535;
                    return c8;
                }
            }
        }
        return (char) 0;
    }

    public final int g() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        int i11 = (bArr[i7] & 255) << 24;
        int i12 = i7 + 2;
        this.f13861b = i12;
        int i13 = ((bArr[i10] & 255) << 16) | i11;
        int i14 = i7 + 3;
        this.f13861b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 8);
        this.f13861b = i7 + 4;
        return (bArr[i14] & 255) | i15;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c6 A[SYNTHETIC] */
    public final String h(Charset charset) {
        int i7;
        byte[] bArr;
        b.f("Unsupported charset: " + charset, f13859f.contains(charset));
        if (a() == 0) {
            return null;
        }
        Charset charset2 = di.d.f7629a;
        if (!charset.equals(charset2)) {
            B();
        }
        if (charset.equals(di.d.f7631c) || charset.equals(charset2)) {
            i7 = 1;
        } else {
            if (!charset.equals(di.d.f7634f) && !charset.equals(di.d.f7633e) && !charset.equals(di.d.f7632d)) {
                throw new IllegalArgumentException("Unsupported charset: " + charset);
            }
            i7 = 2;
        }
        int i10 = this.f13861b;
        while (true) {
            int i11 = this.f13862c;
            if (i10 >= i11 - (i7 - 1)) {
                i10 = i11;
                break;
            }
            if ((charset.equals(di.d.f7631c) || charset.equals(di.d.f7629a)) && e0.G(this.f13860a[i10])) {
                break;
            }
            if (charset.equals(di.d.f7634f) || charset.equals(di.d.f7632d)) {
                byte[] bArr2 = this.f13860a;
                if (bArr2[i10] == 0 && e0.G(bArr2[i10 + 1])) {
                    break;
                }
                if (charset.equals(di.d.f7633e)) {
                    bArr = this.f13860a;
                    if (bArr[i10 + 1] == 0 && e0.G(bArr[i10])) {
                        break;
                    }
                }
                i10 += i7;
            } else {
                if (charset.equals(di.d.f7633e)) {
                    bArr = this.f13860a;
                    if (bArr[i10 + 1] == 0) {
                        continue;
                    }
                }
                i10 += i7;
            }
        }
        String strS = s(i10 - this.f13861b, charset);
        if (this.f13861b != this.f13862c && f(charset, f13857d) == '\r') {
            f(charset, f13858e);
        }
        return strS;
    }

    public final int i() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        int i11 = bArr[i7] & 255;
        int i12 = i7 + 2;
        this.f13861b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        int i14 = i7 + 3;
        this.f13861b = i14;
        int i15 = i13 | ((bArr[i12] & 255) << 16);
        this.f13861b = i7 + 4;
        return ((bArr[i14] & 255) << 24) | i15;
    }

    public final long j() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        long j = ((long) bArr[i7]) & 255;
        int i11 = i7 + 2;
        this.f13861b = i11;
        long j5 = j | ((((long) bArr[i10]) & 255) << 8);
        int i12 = i7 + 3;
        this.f13861b = i12;
        long j7 = j5 | ((((long) bArr[i11]) & 255) << 16);
        int i13 = i7 + 4;
        this.f13861b = i13;
        long j10 = j7 | ((((long) bArr[i12]) & 255) << 24);
        int i14 = i7 + 5;
        this.f13861b = i14;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 32);
        int i15 = i7 + 6;
        this.f13861b = i15;
        long j12 = j11 | ((((long) bArr[i14]) & 255) << 40);
        int i16 = i7 + 7;
        this.f13861b = i16;
        long j13 = j12 | ((((long) bArr[i15]) & 255) << 48);
        this.f13861b = i7 + 8;
        return ((((long) bArr[i16]) & 255) << 56) | j13;
    }

    public final short k() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        int i11 = bArr[i7] & 255;
        this.f13861b = i7 + 2;
        return (short) (((bArr[i10] & 255) << 8) | i11);
    }

    public final long l() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        long j = ((long) bArr[i7]) & 255;
        int i11 = i7 + 2;
        this.f13861b = i11;
        long j5 = j | ((((long) bArr[i10]) & 255) << 8);
        int i12 = i7 + 3;
        this.f13861b = i12;
        long j7 = j5 | ((((long) bArr[i11]) & 255) << 16);
        this.f13861b = i7 + 4;
        return ((((long) bArr[i12]) & 255) << 24) | j7;
    }

    public final int m() {
        int i7 = i();
        if (i7 >= 0) {
            return i7;
        }
        throw new IllegalStateException(kk.b.h(i7, "Top bit not zero: "));
    }

    public final int n() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        int i11 = bArr[i7] & 255;
        this.f13861b = i7 + 2;
        return ((bArr[i10] & 255) << 8) | i11;
    }

    public final long o() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        long j = (((long) bArr[i7]) & 255) << 56;
        int i11 = i7 + 2;
        this.f13861b = i11;
        long j5 = j | ((((long) bArr[i10]) & 255) << 48);
        int i12 = i7 + 3;
        this.f13861b = i12;
        long j7 = j5 | ((((long) bArr[i11]) & 255) << 40);
        int i13 = i7 + 4;
        this.f13861b = i13;
        long j10 = j7 | ((((long) bArr[i12]) & 255) << 32);
        int i14 = i7 + 5;
        this.f13861b = i14;
        long j11 = j10 | ((((long) bArr[i13]) & 255) << 24);
        int i15 = i7 + 6;
        this.f13861b = i15;
        long j12 = j11 | ((((long) bArr[i14]) & 255) << 16);
        int i16 = i7 + 7;
        this.f13861b = i16;
        long j13 = j12 | ((((long) bArr[i15]) & 255) << 8);
        this.f13861b = i7 + 8;
        return (((long) bArr[i16]) & 255) | j13;
    }

    public final String p() {
        if (a() == 0) {
            return null;
        }
        int i7 = this.f13861b;
        while (i7 < this.f13862c && this.f13860a[i7] != 0) {
            i7++;
        }
        byte[] bArr = this.f13860a;
        int i10 = this.f13861b;
        int i11 = e0.f13788a;
        String str = new String(bArr, i10, i7 - i10, di.d.f7631c);
        this.f13861b = i7;
        if (i7 < this.f13862c) {
            this.f13861b = i7 + 1;
        }
        return str;
    }

    public final String q(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i10 = this.f13861b;
        int i11 = (i10 + i7) - 1;
        int i12 = (i11 >= this.f13862c || this.f13860a[i11] != 0) ? i7 : i7 - 1;
        byte[] bArr = this.f13860a;
        int i13 = e0.f13788a;
        String str = new String(bArr, i10, i12, di.d.f7631c);
        this.f13861b += i7;
        return str;
    }

    public final short r() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        int i11 = (bArr[i7] & 255) << 8;
        this.f13861b = i7 + 2;
        return (short) ((bArr[i10] & 255) | i11);
    }

    public final String s(int i7, Charset charset) {
        String str = new String(this.f13860a, this.f13861b, i7, charset);
        this.f13861b += i7;
        return str;
    }

    public final int t() {
        return (u() << 21) | (u() << 14) | (u() << 7) | u();
    }

    public final int u() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        this.f13861b = i7 + 1;
        return bArr[i7] & 255;
    }

    public final long v() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        long j = (((long) bArr[i7]) & 255) << 24;
        int i11 = i7 + 2;
        this.f13861b = i11;
        long j5 = j | ((((long) bArr[i10]) & 255) << 16);
        int i12 = i7 + 3;
        this.f13861b = i12;
        long j7 = j5 | ((((long) bArr[i11]) & 255) << 8);
        this.f13861b = i7 + 4;
        return (((long) bArr[i12]) & 255) | j7;
    }

    public final int w() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        int i11 = (bArr[i7] & 255) << 16;
        int i12 = i7 + 2;
        this.f13861b = i12;
        int i13 = ((bArr[i10] & 255) << 8) | i11;
        this.f13861b = i7 + 3;
        return (bArr[i12] & 255) | i13;
    }

    public final int x() {
        int iG = g();
        if (iG >= 0) {
            return iG;
        }
        throw new IllegalStateException(kk.b.h(iG, "Top bit not zero: "));
    }

    public final long y() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException(kk.b.i(jO, "Top bit not zero: "));
    }

    public final int z() {
        byte[] bArr = this.f13860a;
        int i7 = this.f13861b;
        int i10 = i7 + 1;
        this.f13861b = i10;
        int i11 = (bArr[i7] & 255) << 8;
        this.f13861b = i7 + 2;
        return (bArr[i10] & 255) | i11;
    }

    public w(int i7) {
        this.f13860a = new byte[i7];
        this.f13862c = i7;
    }

    public w(byte[] bArr) {
        this.f13860a = bArr;
        this.f13862c = bArr.length;
    }

    public w(byte[] bArr, int i7) {
        this.f13860a = bArr;
        this.f13862c = i7;
    }
}
