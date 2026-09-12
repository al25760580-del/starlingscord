package androidx.datastore.preferences.protobuf;

import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class i extends l0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f1869h = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f1870i = n1.f1913f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e0 f1871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e2.k f1875g;

    public i(e2.k kVar, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i7, 20);
        this.f1872d = new byte[iMax];
        this.f1873e = iMax;
        this.f1875g = kVar;
    }

    public static int A(long j) {
        int i7;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j) != 0) {
            i7 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public static int r(int i7, e eVar) {
        return s(eVar) + y(i7);
    }

    public static int s(e eVar) {
        int size = eVar.size();
        return z(size) + size;
    }

    public static int t(int i7) {
        return y(i7) + 4;
    }

    public static int u(int i7) {
        return y(i7) + 8;
    }

    public static int v(int i7, a aVar, v0 v0Var) {
        return aVar.b(v0Var) + (y(i7) * 2);
    }

    public static int w(int i7) {
        if (i7 >= 0) {
            return z(i7);
        }
        return 10;
    }

    public static int x(String str) {
        int length;
        try {
            length = q1.b(str);
        } catch (p1 unused) {
            length = str.getBytes(u.f1936a).length;
        }
        return z(length) + length;
    }

    public static int y(int i7) {
        return z(i7 << 3);
    }

    public static int z(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public final void B() {
        this.f1875g.write(this.f1872d, 0, this.f1874f);
        this.f1874f = 0;
    }

    public final void C(int i7) {
        if (this.f1873e - this.f1874f < i7) {
            B();
        }
    }

    public final void D(byte b10) {
        if (this.f1874f == this.f1873e) {
            B();
        }
        int i7 = this.f1874f;
        this.f1874f = i7 + 1;
        this.f1872d[i7] = b10;
    }

    public final void E(byte[] bArr, int i7, int i10) {
        int i11 = this.f1874f;
        int i12 = this.f1873e;
        int i13 = i12 - i11;
        byte[] bArr2 = this.f1872d;
        if (i13 >= i10) {
            System.arraycopy(bArr, i7, bArr2, i11, i10);
            this.f1874f += i10;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i11, i13);
        int i14 = i7 + i13;
        int i15 = i10 - i13;
        this.f1874f = i12;
        B();
        if (i15 > i12) {
            this.f1875g.write(bArr, i14, i15);
        } else {
            System.arraycopy(bArr, i14, bArr2, 0, i15);
            this.f1874f = i15;
        }
    }

    public final void F(int i7, boolean z5) {
        C(11);
        o(i7, 0);
        byte b10 = z5 ? (byte) 1 : (byte) 0;
        int i10 = this.f1874f;
        this.f1874f = i10 + 1;
        this.f1872d[i10] = b10;
    }

    public final void G(int i7, e eVar) {
        R(i7, 2);
        H(eVar);
    }

    public final void H(e eVar) {
        T(eVar.size());
        l(eVar.f1838e, eVar.b(), eVar.size());
    }

    public final void I(int i7, int i10) {
        C(14);
        o(i7, 5);
        m(i10);
    }

    public final void J(int i7) {
        C(4);
        m(i7);
    }

    public final void K(int i7, long j) {
        C(18);
        o(i7, 1);
        n(j);
    }

    public final void L(long j) {
        C(8);
        n(j);
    }

    public final void M(int i7, int i10) {
        C(20);
        o(i7, 0);
        if (i10 >= 0) {
            p(i10);
        } else {
            q(i10);
        }
    }

    public final void N(int i7) {
        if (i7 >= 0) {
            T(i7);
        } else {
            V(i7);
        }
    }

    public final void O(int i7, a aVar, v0 v0Var) {
        R(i7, 2);
        T(aVar.b(v0Var));
        v0Var.d(aVar, this.f1871c);
    }

    public final void P(int i7, String str) throws h {
        R(i7, 2);
        Q(str);
    }

    public final void Q(String str) throws h {
        try {
            int length = str.length() * 3;
            int iZ = z(length);
            int i7 = iZ + length;
            int i10 = this.f1873e;
            if (i7 > i10) {
                byte[] bArr = new byte[length];
                int iF = q1.f1929a.f(str, bArr, 0, length);
                T(iF);
                E(bArr, 0, iF);
                return;
            }
            if (i7 > i10 - this.f1874f) {
                B();
            }
            int iZ2 = z(str.length());
            int i11 = this.f1874f;
            byte[] bArr2 = this.f1872d;
            try {
                if (iZ2 == iZ) {
                    int i12 = i11 + iZ2;
                    this.f1874f = i12;
                    int iF2 = q1.f1929a.f(str, bArr2, i12, i10 - i12);
                    this.f1874f = i11;
                    p((iF2 - i11) - iZ2);
                    this.f1874f = iF2;
                } else {
                    int iB = q1.b(str);
                    p(iB);
                    this.f1874f = q1.f1929a.f(str, bArr2, this.f1874f, iB);
                }
            } catch (p1 e10) {
                this.f1874f = i11;
                throw e10;
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new h(e11);
            }
        } catch (p1 e12) {
            f1869h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e12);
            byte[] bytes = str.getBytes(u.f1936a);
            try {
                T(bytes.length);
                l(bytes, 0, bytes.length);
            } catch (h e13) {
                throw e13;
            } catch (IndexOutOfBoundsException e14) {
                throw new h(e14);
            }
        }
    }

    public final void R(int i7, int i10) {
        T((i7 << 3) | i10);
    }

    public final void S(int i7, int i10) {
        C(20);
        o(i7, 0);
        p(i10);
    }

    public final void T(int i7) {
        C(5);
        p(i7);
    }

    public final void U(int i7, long j) {
        C(20);
        o(i7, 0);
        q(j);
    }

    public final void V(long j) {
        C(10);
        q(j);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public final void l(byte[] bArr, int i7, int i10) {
        E(bArr, i7, i10);
    }

    public final void m(int i7) {
        int i10 = this.f1874f;
        int i11 = i10 + 1;
        this.f1874f = i11;
        byte[] bArr = this.f1872d;
        bArr[i10] = (byte) (i7 & 255);
        int i12 = i10 + 2;
        this.f1874f = i12;
        bArr[i11] = (byte) ((i7 >> 8) & 255);
        int i13 = i10 + 3;
        this.f1874f = i13;
        bArr[i12] = (byte) ((i7 >> 16) & 255);
        this.f1874f = i10 + 4;
        bArr[i13] = (byte) ((i7 >> 24) & 255);
    }

    public final void n(long j) {
        int i7 = this.f1874f;
        int i10 = i7 + 1;
        this.f1874f = i10;
        byte[] bArr = this.f1872d;
        bArr[i7] = (byte) (j & 255);
        int i11 = i7 + 2;
        this.f1874f = i11;
        bArr[i10] = (byte) ((j >> 8) & 255);
        int i12 = i7 + 3;
        this.f1874f = i12;
        bArr[i11] = (byte) ((j >> 16) & 255);
        int i13 = i7 + 4;
        this.f1874f = i13;
        bArr[i12] = (byte) (255 & (j >> 24));
        int i14 = i7 + 5;
        this.f1874f = i14;
        bArr[i13] = (byte) (((int) (j >> 32)) & 255);
        int i15 = i7 + 6;
        this.f1874f = i15;
        bArr[i14] = (byte) (((int) (j >> 40)) & 255);
        int i16 = i7 + 7;
        this.f1874f = i16;
        bArr[i15] = (byte) (((int) (j >> 48)) & 255);
        this.f1874f = i7 + 8;
        bArr[i16] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void o(int i7, int i10) {
        p((i7 << 3) | i10);
    }

    public final void p(int i7) {
        boolean z5 = f1870i;
        byte[] bArr = this.f1872d;
        if (!z5) {
            while ((i7 & (-128)) != 0) {
                int i10 = this.f1874f;
                this.f1874f = i10 + 1;
                bArr[i10] = (byte) ((i7 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                i7 >>>= 7;
            }
            int i11 = this.f1874f;
            this.f1874f = i11 + 1;
            bArr[i11] = (byte) i7;
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i12 = this.f1874f;
            this.f1874f = i12 + 1;
            n1.j(bArr, (byte) ((i7 & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), i12);
            i7 >>>= 7;
        }
        int i13 = this.f1874f;
        this.f1874f = i13 + 1;
        n1.j(bArr, (byte) i7, i13);
    }

    public final void q(long j) {
        boolean z5 = f1870i;
        byte[] bArr = this.f1872d;
        if (!z5) {
            while ((j & (-128)) != 0) {
                int i7 = this.f1874f;
                this.f1874f = i7 + 1;
                bArr[i7] = (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
                j >>>= 7;
            }
            int i10 = this.f1874f;
            this.f1874f = i10 + 1;
            bArr[i10] = (byte) j;
            return;
        }
        while ((j & (-128)) != 0) {
            int i11 = this.f1874f;
            this.f1874f = i11 + 1;
            n1.j(bArr, (byte) ((((int) j) & 127) | IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT), i11);
            j >>>= 7;
        }
        int i12 = this.f1874f;
        this.f1874f = i12 + 1;
        n1.j(bArr, (byte) j, i12);
    }
}
