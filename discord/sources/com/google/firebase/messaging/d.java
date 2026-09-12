package com.google.firebase.messaging;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6570d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6571e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f6572i;

    public d(InputStream inputStream) {
        super(inputStream);
        this.f6572i = -1L;
        this.f6571e = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f6570d) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f6571e);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i7) {
        switch (this.f6570d) {
            case 0:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i7);
                    this.f6572i = this.f6571e;
                }
                return;
            default:
                super.mark(i7);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f6570d) {
            case 0:
                if (this.f6571e == 0) {
                    return -1;
                }
                int i7 = ((FilterInputStream) this).in.read();
                if (i7 != -1) {
                    this.f6571e--;
                }
                return i7;
            default:
                int i10 = super.read();
                if (i10 != -1) {
                    this.f6572i++;
                }
                return i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f6570d) {
            case 0:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f6572i == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f6571e = this.f6572i;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        switch (this.f6570d) {
            case 0:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j, this.f6571e));
                this.f6571e -= jSkip;
                return jSkip;
            default:
                return super.skip(j);
        }
    }

    public d(BufferedInputStream bufferedInputStream, long j) {
        super(bufferedInputStream);
        this.f6571e = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i7, int i10) throws IOException {
        switch (this.f6570d) {
            case 0:
                long j = this.f6571e;
                if (j == 0) {
                    return -1;
                }
                int i11 = ((FilterInputStream) this).in.read(bArr, i7, (int) Math.min(i10, j));
                if (i11 != -1) {
                    this.f6571e -= (long) i11;
                }
                return i11;
            default:
                int i12 = super.read(bArr, i7, i10);
                if (i12 != -1) {
                    this.f6572i += (long) i12;
                }
                return i12;
        }
    }
}
