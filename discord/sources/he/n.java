package he;

import com.google.android.exoplayer2.upstream.DataSource;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final DataSource f10629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f10630e;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10632v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10633w = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f10631i = new byte[1];

    public n(DataSource dataSource, p pVar) {
        this.f10629d = dataSource;
        this.f10630e = pVar;
    }

    public final void c() {
        if (this.f10632v) {
            return;
        }
        this.f10629d.d(this.f10630e);
        this.f10632v = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f10633w) {
            return;
        }
        this.f10629d.close();
        this.f10633w = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f10631i;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) {
        je.b.k(!this.f10633w);
        c();
        int i11 = this.f10629d.read(bArr, i7, i10);
        if (i11 == -1) {
            return -1;
        }
        return i11;
    }
}
