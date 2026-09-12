package w8;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f22070a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22071b = a("RIFF");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f22072c = a("WEBP");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f22073d = a("VP8 ");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f22074e = a("VP8L");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f22075f = a("VP8X");

    public static byte[] a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException("ASCII not found!", e10);
        }
    }

    public static boolean b(int i7, byte[] bArr, byte[] bArr2) {
        if (bArr2 != null && bArr2.length + i7 <= bArr.length) {
            for (int i10 = 0; i10 < bArr2.length; i10++) {
                if (bArr[i10 + i7] == bArr2[i10]) {
                }
            }
            return true;
        }
        return false;
    }
}
