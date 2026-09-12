package t8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f20664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20665e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20666i;

    public b(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f20664d = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i7) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i7);
            this.f20666i = this.f20665e;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i7 = ((FilterInputStream) this).in.read();
        if (i7 != -1) {
            return i7;
        }
        int i10 = this.f20665e;
        byte[] bArr = this.f20664d;
        if (i10 >= bArr.length) {
            return -1;
        }
        this.f20665e = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        ((FilterInputStream) this).in.reset();
        this.f20665e = this.f20666i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11;
        int i12 = ((FilterInputStream) this).in.read(bArr, i7, i10);
        if (i12 != -1) {
            return i12;
        }
        int i13 = 0;
        if (i10 == 0) {
            return 0;
        }
        while (i13 < i10) {
            int i14 = this.f20665e;
            byte[] bArr2 = this.f20664d;
            if (i14 >= bArr2.length) {
                i11 = -1;
            } else {
                this.f20665e = i14 + 1;
                i11 = bArr2[i14] & 255;
            }
            if (i11 == -1) {
                break;
            }
            bArr[i7 + i13] = (byte) i11;
            i13++;
        }
        if (i13 > 0) {
            return i13;
        }
        return -1;
    }
}
