package sc;

import pc.f;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {
    public static int H(byte[] bArr, int i7) {
        return (bArr[i7 + 3] & 255) | ((bArr[i7] & 255) << 24) | ((bArr[i7 + 1] & 255) << 16) | ((bArr[i7 + 2] & 255) << 8);
    }
}
