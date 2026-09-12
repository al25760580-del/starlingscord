package ag;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f532d = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z5;
        if (obj instanceof k0) {
            byte[] bArr = ((j0) this).f530e;
            int length = bArr.length * 8;
            byte[] bArr2 = ((j0) ((k0) obj)).f530e;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z5 = true;
                    for (int i7 = 0; i7 < bArr.length; i7++) {
                        z5 &= bArr[i7] == bArr2[i7];
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((j0) this).f530e;
        if (bArr.length * 8 < 32) {
            int i7 = bArr[0] & 255;
            for (int i10 = 1; i10 < bArr.length; i10++) {
                i7 |= (bArr[i10] & 255) << (i10 * 8);
            }
            return i7;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(c.d("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i11 = bArr[0] & 255;
        int i12 = bArr[1] & 255;
        int i13 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i11 | (i12 << 8) | (i13 << 16);
    }

    public final String toString() {
        byte[] bArr = ((j0) this).f530e;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b10 : bArr) {
            char[] cArr = f532d;
            sb2.append(cArr[(b10 >> 4) & 15]);
            sb2.append(cArr[b10 & 15]);
        }
        return sb2.toString();
    }
}
