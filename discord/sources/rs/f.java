package rs;

import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements Sink {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sink f19568d;

    public f(Sink delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f19568d = delegate;
    }

    @Override // okio.Sink
    public void H(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f19568d.H(source, j);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f19568d.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
        this.f19568d.flush();
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.f19568d.timeout();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f19568d + ')';
    }
}
