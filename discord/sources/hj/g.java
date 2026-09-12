package hj;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class g implements Iterable, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f10828i = new g(t.f10907b);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e f10829v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10830d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f10831e;

    static {
        f10829v = d.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.f10831e = bArr;
    }

    public static int b(int i7, int i10, int i11) {
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

    public static g d(byte[] bArr, int i7, int i10) {
        byte[] bArrCopyOfRange;
        b(i7, i7 + i10, bArr.length);
        switch (f10829v.f10822a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i10 + i7);
                break;
            default:
                bArrCopyOfRange = new byte[i10];
                System.arraycopy(bArr, i7, bArrCopyOfRange, 0, i10);
                break;
        }
        return new g(bArrCopyOfRange);
    }

    public byte a(int i7) {
        return this.f10831e[i7];
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i7 = this.f10830d;
        int i10 = gVar.f10830d;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder sbS = a3.e.s(size, "Ran off end of other: 0, ", ", ");
            sbS.append(gVar.size());
            throw new IllegalArgumentException(sbS.toString());
        }
        byte[] bArr = gVar.f10831e;
        int iE = e() + size;
        int iE2 = e();
        int iE3 = gVar.e();
        while (iE2 < iE) {
            if (this.f10831e[iE2] != bArr[iE3]) {
                return false;
            }
            iE2++;
            iE3++;
        }
        return true;
    }

    public byte h(int i7) {
        return this.f10831e[i7];
    }

    public final int hashCode() {
        int i7 = this.f10830d;
        if (i7 != 0) {
            return i7;
        }
        int size = size();
        int iE = e();
        int i10 = size;
        for (int i11 = iE; i11 < iE + size; i11++) {
            i10 = (i10 * 31) + this.f10831e[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f10830d = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ag.w0(this);
    }

    public int size() {
        return this.f10831e.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = io.sentry.config.a.s(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iB = b(0, 47, size());
            sb2.append(io.sentry.config.a.s(iB == 0 ? f10828i : new f(this.f10831e, e(), iB)));
            sb2.append("...");
            string = sb2.toString();
        }
        return com.discord.chat.presentation.list.a.k(a3.e.t("<ByteString@", hexString, " size=", size, " contents=\""), string, "\">");
    }
}
