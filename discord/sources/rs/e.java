package rs;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f19567e;

    public /* synthetic */ e(BufferedSource bufferedSource, int i7) {
        this.f19566d = i7;
        this.f19567e = bufferedSource;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMin;
        switch (this.f19566d) {
            case 0:
                jMin = Math.min(((Buffer) this.f19567e).f17413e, Integer.MAX_VALUE);
                break;
            default:
                p pVar = (p) this.f19567e;
                if (pVar.f19595i) {
                    throw new IOException("closed");
                }
                jMin = Math.min(pVar.f19594e.f17413e, Integer.MAX_VALUE);
                break;
        }
        return (int) jMin;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f19566d) {
            case 0:
                break;
            default:
                ((p) this.f19567e).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f19566d) {
            case 0:
                Buffer buffer = (Buffer) this.f19567e;
                if (buffer.f17413e > 0) {
                    return buffer.readByte() & 255;
                }
                return -1;
            default:
                p pVar = (p) this.f19567e;
                Buffer buffer2 = pVar.f19594e;
                if (pVar.f19595i) {
                    throw new IOException("closed");
                }
                if (buffer2.f17413e == 0 && pVar.f19593d.read(buffer2, 8192L) == -1) {
                    return -1;
                }
                return buffer2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.f19566d) {
            case 0:
                return ((Buffer) this.f19567e) + ".inputStream()";
            default:
                return ((p) this.f19567e) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i7, int i10) throws IOException {
        switch (this.f19566d) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                return ((Buffer) this.f19567e).read(sink, i7, i10);
            default:
                Intrinsics.checkNotNullParameter(sink, "data");
                p pVar = (p) this.f19567e;
                Buffer buffer = pVar.f19594e;
                if (!pVar.f19595i) {
                    v.f(sink.length, i7, i10);
                    if (buffer.f17413e == 0 && pVar.f19593d.read(buffer, 8192L) == -1) {
                        return -1;
                    }
                    return buffer.read(sink, i7, i10);
                }
                throw new IOException("closed");
        }
    }

    private final void c() {
    }
}
