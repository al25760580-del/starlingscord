package zr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PushbackInputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends Reader {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PushbackInputStream f24101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public BufferedReader f24102e = null;

    public i(InputStream inputStream) {
        this.f24101d = new PushbackInputStream(inputStream, 3);
    }

    public final void c() throws IOException {
        if (this.f24102e != null) {
            return;
        }
        byte[] bArr = new byte[3];
        PushbackInputStream pushbackInputStream = this.f24101d;
        int i7 = pushbackInputStream.read(bArr, 0, 3);
        if ((i7 != 3 || bArr[0] != -17 || bArr[1] != -69 || bArr[2] != -65) && i7 > 0) {
            pushbackInputStream.unread(bArr, 0, i7);
        }
        this.f24102e = new BufferedReader(new InputStreamReader(pushbackInputStream, "UTF-8"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        BufferedReader bufferedReader = this.f24102e;
        if (bufferedReader == null) {
            this.f24101d.close();
        } else {
            bufferedReader.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i7, int i10) throws IOException {
        c();
        return this.f24102e.read(cArr, i7, i10);
    }

    @Override // java.io.Reader
    public final boolean ready() throws IOException {
        c();
        return this.f24102e.ready();
    }
}
