package zc;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f23749f = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f23750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f23754e;

    public final void a(byte[] bArr, int i7, int i10) {
        if (this.f23750a) {
            int i11 = i10 - i7;
            byte[] bArr2 = this.f23754e;
            int length = bArr2.length;
            int i12 = this.f23752c + i11;
            if (length < i12) {
                this.f23754e = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i7, this.f23754e, this.f23752c, i11);
            this.f23752c += i11;
        }
    }
}
