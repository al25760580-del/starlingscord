package com.discord.minibsdiff;

import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\"\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/discord/minibsdiff/RandomFileAccessInputStream;", "Ljava/io/InputStream;", "randomAccessFile", "Ljava/io/RandomAccessFile;", "<init>", "(Ljava/io/RandomAccessFile;)V", "close", "", "read", "", "b", "", "off", "len", "minibsdiff_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RandomFileAccessInputStream extends InputStream {

    @NotNull
    private final RandomAccessFile randomAccessFile;

    public RandomFileAccessInputStream(@NotNull RandomAccessFile randomAccessFile) {
        Intrinsics.checkNotNullParameter(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.randomAccessFile.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.randomAccessFile.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] b10) {
        return this.randomAccessFile.read(b10);
    }

    @Override // java.io.InputStream
    public int read(byte[] b10, int off, int len) {
        return this.randomAccessFile.read(b10, off, len);
    }
}
