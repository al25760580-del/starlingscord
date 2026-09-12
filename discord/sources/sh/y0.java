package sh;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Enumeration f20243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileInputStream f20244e;

    public y0(Enumeration enumeration) throws IOException {
        this.f20243d = enumeration;
        c();
    }

    public final void c() throws IOException {
        FileInputStream fileInputStream = this.f20244e;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        Enumeration enumeration = this.f20243d;
        if (enumeration.hasMoreElements()) {
            this.f20244e = new FileInputStream((File) enumeration.nextElement());
        } else {
            this.f20244e = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        FileInputStream fileInputStream = this.f20244e;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.f20244e = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            FileInputStream fileInputStream = this.f20244e;
            if (fileInputStream == null) {
                return -1;
            }
            int i7 = fileInputStream.read();
            if (i7 != -1) {
                return i7;
            }
            c();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        if (this.f20244e == null) {
            return -1;
        }
        bArr.getClass();
        if (i7 < 0 || i10 < 0 || i10 > bArr.length - i7) {
            throw new IndexOutOfBoundsException();
        }
        if (i10 == 0) {
            return 0;
        }
        do {
            int i11 = this.f20244e.read(bArr, i7, i10);
            if (i11 > 0) {
                return i11;
            }
            c();
        } while (this.f20244e != null);
        return -1;
    }
}
