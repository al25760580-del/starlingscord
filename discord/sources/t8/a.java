package t8;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f20662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20663e;

    public a(InputStream inputStream, int i7) {
        super(inputStream);
        if (i7 < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f20662d = i7;
        this.f20663e = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f20662d);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i7) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i7);
            this.f20663e = this.f20662d;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f20662d == 0) {
            return -1;
        }
        int i7 = ((FilterInputStream) this).in.read();
        if (i7 != -1) {
            this.f20662d--;
        }
        return i7;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.f20663e == -1) {
            throw new IOException("mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f20662d = this.f20663e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f20662d));
        this.f20662d = (int) (((long) this.f20662d) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        int i11 = this.f20662d;
        if (i11 == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read(bArr, i7, Math.min(i10, i11));
        if (i12 > 0) {
            this.f20662d -= i12;
        }
        return i12;
    }
}
