package ag;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class y0 implements Iterable, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final y0 f600i = new y0(z0.f603a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f601d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f602e;

    static {
        int i7 = v0.f585a;
    }

    public y0(byte[] bArr) {
        bArr.getClass();
        this.f602e = bArr;
    }

    public static int j(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(s0.g.d(i7, "Beginning index: ", " < 0"));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(a3.e.g(i7, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a3.e.g(i10, i11, "End index: ", " >= "));
    }

    public static y0 k(byte[] bArr, int i7) {
        j(0, i7, bArr.length);
        byte[] bArr2 = new byte[i7];
        System.arraycopy(bArr, 0, bArr2, 0, i7);
        return new y0(bArr2);
    }

    public byte a(int i7) {
        return this.f602e[i7];
    }

    public byte b(int i7) {
        return this.f602e[i7];
    }

    public int d() {
        return 0;
    }

    public int e() {
        return this.f602e.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y0) || e() != ((y0) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return obj.equals(this);
        }
        y0 y0Var = (y0) obj;
        int i7 = this.f601d;
        int i10 = y0Var.f601d;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int iE = e();
        if (iE > y0Var.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > y0Var.e()) {
            throw new IllegalArgumentException(a3.e.g(iE, y0Var.e(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = y0Var.f602e;
        int iD = d() + iE;
        int iD2 = d();
        int iD3 = y0Var.d();
        while (iD2 < iD) {
            if (this.f602e[iD2] != bArr[iD3]) {
                return false;
            }
            iD2++;
            iD3++;
        }
        return true;
    }

    public void h(byte[] bArr, int i7) {
        System.arraycopy(this.f602e, 0, bArr, 0, i7);
    }

    public final int hashCode() {
        int i7 = this.f601d;
        if (i7 != 0) {
            return i7;
        }
        int iE = e();
        int iD = d();
        byte[] bArr = z0.f603a;
        int i10 = iE;
        for (int i11 = iD; i11 < iD + iE; i11++) {
            i10 = (i10 * 31) + this.f602e[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f601d = i10;
        return i10;
    }

    public final ByteArrayInputStream i() {
        return new ByteArrayInputStream(this.f602e, d(), e());
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new w0(this);
    }

    public final byte[] m() {
        int iE = e();
        if (iE == 0) {
            return z0.f603a;
        }
        byte[] bArr = new byte[iE];
        h(bArr, iE);
        return bArr;
    }

    public final String toString() {
        y0 x0Var;
        String strConcat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int iE = e();
        if (e() <= 50) {
            strConcat = c.c(this);
        } else {
            int iJ = j(0, 47, e());
            if (iJ == 0) {
                x0Var = f600i;
            } else {
                x0Var = new x0(this.f602e, d(), iJ);
            }
            strConcat = c.c(x0Var).concat("...");
        }
        return com.discord.chat.presentation.list.a.k(a3.e.t("<ByteString@", hexString, " size=", iE, " contents=\""), strConcat, "\">");
    }
}
