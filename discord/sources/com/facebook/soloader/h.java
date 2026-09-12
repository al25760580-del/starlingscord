package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public File f5397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FileInputStream f5398e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FileChannel f5399i;

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f5398e.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.f5399i.isOpen();
    }

    @Override // com.facebook.soloader.g
    public final int k(long j, ByteBuffer byteBuffer) {
        return this.f5399i.read(byteBuffer, j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.f5399i.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.f5399i.write(byteBuffer);
    }
}
