package q8;

import java.io.IOException;
import java.io.InputStream;
import n8.i;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InputStream f18631d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18632e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r8.c f18633i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f18634v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f18635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f18636x;

    public e(InputStream inputStream, byte[] bArr, r8.c cVar) {
        inputStream.getClass();
        this.f18631d = inputStream;
        bArr.getClass();
        this.f18632e = bArr;
        cVar.getClass();
        this.f18633i = cVar;
        this.f18634v = 0;
        this.f18635w = 0;
        this.f18636x = false;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        i.e(this.f18635w <= this.f18634v);
        c();
        return this.f18631d.available() + (this.f18634v - this.f18635w);
    }

    public final void c() throws IOException {
        if (this.f18636x) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f18636x) {
            return;
        }
        this.f18636x = true;
        this.f18633i.release(this.f18632e);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.f18636x) {
            o8.a.g("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        i.e(this.f18635w <= this.f18634v);
        c();
        int i7 = this.f18635w;
        int i10 = this.f18634v;
        byte[] bArr = this.f18632e;
        if (i7 >= i10) {
            int i11 = this.f18631d.read(bArr);
            if (i11 <= 0) {
                return -1;
            }
            this.f18634v = i11;
            this.f18635w = 0;
        }
        int i12 = this.f18635w;
        this.f18635w = i12 + 1;
        return bArr[i12] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        i.e(this.f18635w <= this.f18634v);
        c();
        int i7 = this.f18634v;
        int i10 = this.f18635w;
        long j5 = i7 - i10;
        if (j5 >= j) {
            this.f18635w = (int) (((long) i10) + j);
            return j;
        }
        this.f18635w = i7;
        return this.f18631d.skip(j - j5) + j5;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        i.e(this.f18635w <= this.f18634v);
        c();
        int i11 = this.f18635w;
        int i12 = this.f18634v;
        byte[] bArr2 = this.f18632e;
        if (i11 >= i12) {
            int i13 = this.f18631d.read(bArr2);
            if (i13 <= 0) {
                return -1;
            }
            this.f18634v = i13;
            this.f18635w = 0;
        }
        int iMin = Math.min(this.f18634v - this.f18635w, i10);
        System.arraycopy(bArr2, this.f18635w, bArr, i7, iMin);
        this.f18635w += iMin;
        return iMin;
    }
}
