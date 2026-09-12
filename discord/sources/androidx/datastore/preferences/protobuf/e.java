package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e implements Iterable, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f1835i = new e(u.f1937b);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f1836v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1837d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f1838e;

    static {
        f1836v = c.a() ? new d(1) : new d(0);
    }

    public e(byte[] bArr) {
        bArr.getClass();
        this.f1838e = bArr;
    }

    public static e a(byte[] bArr, int i7, int i10) {
        byte[] bArrCopyOfRange;
        int i11 = i7 + i10;
        int length = bArr.length;
        if (((i11 - i7) | i7 | i11 | (length - i11)) < 0) {
            if (i7 < 0) {
                throw new IndexOutOfBoundsException(s0.g.d(i7, "Beginning index: ", " < 0"));
            }
            if (i11 < i7) {
                throw new IndexOutOfBoundsException(a3.e.g(i7, i11, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(a3.e.g(i11, length, "End index: ", " >= "));
        }
        switch (f1836v.f1833a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i7, i10 + i7);
                break;
            default:
                bArrCopyOfRange = new byte[i10];
                System.arraycopy(bArr, i7, bArrCopyOfRange, 0, i10);
                break;
        }
        return new e(bArrCopyOfRange);
    }

    public int b() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e) || size() != ((e) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof e)) {
            return obj.equals(this);
        }
        e eVar = (e) obj;
        int i7 = this.f1837d;
        int i10 = eVar.f1837d;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int size = size();
        if (size > eVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > eVar.size()) {
            StringBuilder sbS = a3.e.s(size, "Ran off end of other: 0, ", ", ");
            sbS.append(eVar.size());
            throw new IllegalArgumentException(sbS.toString());
        }
        byte[] bArr = eVar.f1838e;
        int iB = b() + size;
        int iB2 = b();
        int iB3 = eVar.b();
        while (iB2 < iB) {
            if (this.f1838e[iB2] != bArr[iB3]) {
                return false;
            }
            iB2++;
            iB3++;
        }
        return true;
    }

    public final int hashCode() {
        int i7 = this.f1837d;
        if (i7 != 0) {
            return i7;
        }
        int size = size();
        int iB = b();
        int i10 = size;
        for (int i11 = iB; i11 < iB + size; i11++) {
            i10 = (i10 * 31) + this.f1838e[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.f1837d = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new ag.w0(this);
    }

    public int size() {
        return this.f1838e.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
