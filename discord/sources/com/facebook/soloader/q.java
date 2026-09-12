package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5418d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f5419e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AutoCloseable f5420i;

    public q(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f5419e = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f5420i = fileLockLock;
        } catch (Throwable th2) {
            ((FileOutputStream) this.f5419e).close();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f5418d) {
            case 0:
                FileOutputStream fileOutputStream = (FileOutputStream) this.f5419e;
                try {
                    FileLock fileLock = (FileLock) this.f5420i;
                    if (fileLock != null) {
                        fileLock.release();
                        break;
                    }
                    return;
                } finally {
                    fileOutputStream.close();
                }
            default:
                ((InputStream) this.f5420i).close();
                return;
        }
    }

    public q(g0 g0Var, InputStream inputStream) {
        this.f5419e = g0Var;
        this.f5420i = inputStream;
    }
}
