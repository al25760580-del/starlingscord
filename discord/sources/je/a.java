package je;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends OutputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FileOutputStream f13754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13755e = false;

    public a(File file) {
        this.f13754d = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f13754d;
        if (this.f13755e) {
            return;
        }
        this.f13755e = true;
        flush();
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException e10) {
            b.O("AtomicFile", "Failed to sync file descriptor:", e10);
        }
        fileOutputStream.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f13754d.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i7) throws IOException {
        this.f13754d.write(i7);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f13754d.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i7, int i10) throws IOException {
        this.f13754d.write(bArr, i7, i10);
    }
}
