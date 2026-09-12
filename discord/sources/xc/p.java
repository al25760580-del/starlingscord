package xc;

import pc.w;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f22841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f22843e;

    public p(boolean z5, String str, int i7, byte[] bArr, int i10, int i11, byte[] bArr2) {
        byte b10 = 0;
        int i12 = 1;
        je.b.g((i7 == 0) ^ (bArr2 == null));
        this.f22839a = z5;
        this.f22840b = str;
        this.f22842d = i7;
        this.f22843e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (!str.equals("cbc1")) {
                        b10 = -1;
                    }
                    break;
                case 3046671:
                    b10 = !str.equals("cbcs") ? (byte) -1 : (byte) 1;
                    break;
                case 3049879:
                    b10 = !str.equals("cenc") ? (byte) -1 : (byte) 2;
                    break;
                case 3049895:
                    b10 = !str.equals("cens") ? (byte) -1 : (byte) 3;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                    i12 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    je.b.N("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.f22841c = new w(i12, i10, i11, bArr);
    }
}
