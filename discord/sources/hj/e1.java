package hj;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ls.d f10825a;

    static {
        f10825a = (c1.f10813e && c1.f10812d && !d.a()) ? new d1(1) : new d1(0);
    }

    public static int a(byte[] bArr, int i7, int i10) {
        byte b10 = bArr[i7 - 1];
        int i11 = i10 - i7;
        if (i11 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i11 == 1) {
            return b(b10, bArr[i7]);
        }
        if (i11 == 2) {
            return c(b10, bArr[i7], bArr[i7 + 1]);
        }
        throw new AssertionError();
    }

    public static int b(int i7, int i10) {
        if (i7 > -12 || i10 > -65) {
            return -1;
        }
        return i7 ^ (i10 << 8);
    }

    public static int c(int i7, int i10, int i11) {
        if (i7 > -12 || i10 > -65 || i11 > -65) {
            return -1;
        }
        return (i7 ^ (i10 << 8)) ^ (i11 << 16);
    }
}
