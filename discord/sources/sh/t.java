package sh;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FileInputStream f20186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f20187e;

    public t(FileInputStream fileInputStream, long j) {
        this.f20186d = fileInputStream;
        this.f20187e = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f20186d.close();
        this.f20187e = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j = this.f20187e;
        if (j <= 0) {
            return -1;
        }
        this.f20187e = j - 1;
        return this.f20186d.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        long j = this.f20187e;
        if (j <= 0) {
            return -1;
        }
        int i11 = this.f20186d.read(bArr, i7, (int) Math.min(i10, j));
        if (i11 != -1) {
            this.f20187e -= (long) i11;
        }
        return i11;
    }
}
