package rs;

import java.io.EOFException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Sink {
    @Override // okio.Sink
    public final void H(Buffer source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        source.skip(j);
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return Timeout.f17418d;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
    }
}
