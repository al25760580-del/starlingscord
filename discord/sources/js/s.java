package js;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class s implements Source {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSource f14165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14166e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14167i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f14168v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14169w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f14170x;

    public s(BufferedSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f14165d = source;
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        int i7;
        int i10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            int i11 = this.f14169w;
            BufferedSource bufferedSource = this.f14165d;
            if (i11 == 0) {
                bufferedSource.skip(this.f14170x);
                this.f14170x = 0;
                if ((this.f14167i & 4) == 0) {
                    i7 = this.f14168v;
                    int iS = ds.b.s(bufferedSource);
                    this.f14169w = iS;
                    this.f14166e = iS;
                    int i12 = bufferedSource.readByte() & 255;
                    this.f14167i = bufferedSource.readByte() & 255;
                    Logger logger = t.f14171v;
                    if (logger.isLoggable(Level.FINE)) {
                        ByteString byteString = g.f14124a;
                        logger.fine(g.a(this.f14168v, this.f14166e, i12, this.f14167i, true));
                    }
                    i10 = bufferedSource.readInt() & Integer.MAX_VALUE;
                    this.f14168v = i10;
                    if (i12 != 9) {
                        throw new IOException(i12 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long j5 = bufferedSource.read(sink, Math.min(j, i11));
                if (j5 != -1) {
                    this.f14169w -= (int) j5;
                    return j5;
                }
            }
            return -1L;
        } while (i10 == i7);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f14165d.timeout();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
