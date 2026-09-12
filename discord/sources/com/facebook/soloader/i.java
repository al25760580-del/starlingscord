package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InputStream f5400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZipEntry f5401e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZipFile f5402i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f5403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5404w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f5405x = 0;

    public i(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f5402i = zipFile;
        this.f5401e = zipEntry;
        this.f5403v = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f5400d = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.f5400d;
        if (inputStream != null) {
            inputStream.close();
            this.f5404w = false;
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f5404w;
    }

    @Override // com.facebook.soloader.g
    public final int k(long j, ByteBuffer byteBuffer) throws IOException {
        if (this.f5400d == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j5 = this.f5403v;
        long j7 = j5 - j;
        if (j7 <= 0) {
            return -1;
        }
        int i7 = (int) j7;
        if (iRemaining > i7) {
            iRemaining = i7;
        }
        InputStream inputStream = this.f5400d;
        ZipEntry zipEntry = this.f5401e;
        if (inputStream == null) {
            throw new IOException(zipEntry.getName() + "'s InputStream is null");
        }
        long j10 = this.f5405x;
        if (j != j10) {
            if (j > j5) {
                j = j5;
            }
            if (j >= j10) {
                inputStream.skip(j - j10);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.f5402i.getInputStream(zipEntry);
                this.f5400d = inputStream2;
                if (inputStream2 == null) {
                    throw new IOException(zipEntry.getName() + "'s InputStream is null");
                }
                inputStream2.skip(j);
            }
            this.f5405x = j;
        }
        if (byteBuffer.hasArray()) {
            this.f5400d.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f5400d.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f5405x += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return k(this.f5405x, byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
