package xe;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f22940h;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f22940h = bArr;
    }

    @Override // xe.n
    public final byte[] z() {
        return this.f22940h;
    }
}
