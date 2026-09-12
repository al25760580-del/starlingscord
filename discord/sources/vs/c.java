package vs;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: loaded from: classes.dex */
public final class c extends UploadDataProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile FileChannel f21958d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f21959e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f21960i = new Object();

    public c(b bVar) {
        this.f21959e = bVar;
    }

    public final FileChannel c() {
        if (this.f21958d == null) {
            synchronized (this.f21960i) {
                try {
                    if (this.f21958d == null) {
                        this.f21958d = this.f21959e.d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f21958d;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f21958d;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return c().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelC = c();
        int i7 = 0;
        while (i7 == 0) {
            int i10 = fileChannelC.read(byteBuffer);
            if (i10 == -1) {
                break;
            } else {
                i7 += i10;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        c().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
