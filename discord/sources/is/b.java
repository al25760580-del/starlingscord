package is;

import gs.o;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.Sink;
import okio.Timeout;
import rs.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Sink {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f13438d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13439e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f13440i;

    public b(o this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f13440i = this$0;
        this.f13438d = new h(((BufferedSink) this$0.f10250f).timeout());
    }

    @Override // okio.Sink
    public final void H(Buffer source, long j) {
        BufferedSink bufferedSink = (BufferedSink) this.f13440i.f10250f;
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f13439e) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        bufferedSink.K(j);
        bufferedSink.A("\r\n");
        bufferedSink.H(source, j);
        bufferedSink.A("\r\n");
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f13439e) {
            return;
        }
        this.f13439e = true;
        ((BufferedSink) this.f13440i.f10250f).A("0\r\n\r\n");
        o.i(this.f13440i, this.f13438d);
        this.f13440i.f10246b = 3;
    }

    @Override // okio.Sink, java.io.Flushable
    public final synchronized void flush() {
        if (this.f13439e) {
            return;
        }
        ((BufferedSink) this.f13440i.f10250f).flush();
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.f13438d;
    }
}
