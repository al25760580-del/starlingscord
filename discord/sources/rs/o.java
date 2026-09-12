package rs;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class o implements BufferedSink {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Sink f19590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Buffer f19591e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19592i;

    public o(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f19590d = sink;
        this.f19591e = new Buffer();
    }

    @Override // okio.BufferedSink
    public final BufferedSink A(String string) {
        Intrinsics.checkNotNullParameter(string, "string");
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        this.f19591e.l0(string);
        c();
        return this;
    }

    @Override // okio.Sink
    public final void H(Buffer source, long j) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        this.f19591e.H(source, j);
        c();
    }

    @Override // okio.BufferedSink
    public final long J(Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        long j = 0;
        while (true) {
            long j5 = source.read(this.f19591e, 8192L);
            if (j5 == -1) {
                return j;
            }
            j += j5;
            c();
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink K(long j) {
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        this.f19591e.a0(j);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink X(ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        this.f19591e.T(byteString);
        c();
        return this;
    }

    public final BufferedSink c() {
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.f19591e;
        long jF = buffer.f();
        if (jF > 0) {
            this.f19590d.H(buffer, jF);
        }
        return this;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Sink sink = this.f19590d;
        if (this.f19592i) {
            return;
        }
        Buffer buffer = this.f19591e;
        long j = buffer.f17413e;
        if (j > 0) {
            sink.H(buffer, j);
        }
        th = null;
        try {
            sink.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f19592i = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.BufferedSink
    public final BufferedSink f0(long j) {
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        this.f19591e.Y(j);
        c();
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.f19591e;
        long j = buffer.f17413e;
        Sink sink = this.f19590d;
        if (j > 0) {
            sink.H(buffer, j);
        }
        sink.flush();
    }

    @Override // okio.BufferedSink
    public final OutputStream g0() {
        return new e2.k(this, 2);
    }

    @Override // okio.BufferedSink
    public final Buffer h() {
        return this.f19591e;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f19592i;
    }

    @Override // okio.BufferedSink
    public final BufferedSink p() {
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        Buffer buffer = this.f19591e;
        long j = buffer.f17413e;
        if (j > 0) {
            this.f19590d.H(buffer, j);
        }
        return this;
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.f19590d.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f19590d + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f19591e.write(source);
        c();
        return iWrite;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeByte(int i7) {
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        this.f19591e.U(i7);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeInt(int i7) {
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        this.f19591e.c0(i7);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink writeShort(int i7) {
        if (this.f19592i) {
            throw new IllegalStateException("closed");
        }
        this.f19591e.e0(i7);
        c();
        return this;
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] source) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f19592i) {
            this.f19591e.m1268write(source);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSink
    public final BufferedSink write(byte[] source, int i7, int i10) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!this.f19592i) {
            this.f19591e.m1269write(source, i7, i10);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}
