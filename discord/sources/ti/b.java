package ti;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20800d;

    @Override // java.io.OutputStream
    public final void write(int i7) {
        this.f20800d++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f20800d += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) {
        int i11;
        if (i7 >= 0 && i7 <= bArr.length && i10 >= 0 && (i11 = i7 + i10) <= bArr.length && i11 >= 0) {
            this.f20800d += (long) i10;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
