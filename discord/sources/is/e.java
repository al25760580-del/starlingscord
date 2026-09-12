package is;

import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSink;
import okio.Sink;
import okio.Timeout;
import rs.h;
import rs.o;
import rs.q;
import rs.r;
import rs.v;

/* JADX INFO: loaded from: classes.dex */
public final class e implements Sink {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13447d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13448e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f13449i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f13450v;

    public e(Buffer sink, Deflater deflater) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        o sink2 = v.c(sink);
        Intrinsics.checkNotNullParameter(sink2, "sink");
        Intrinsics.checkNotNullParameter(deflater, "deflater");
        this.f13449i = sink2;
        this.f13450v = deflater;
    }

    @Override // okio.Sink
    public final void H(Buffer source, long j) {
        int i7 = this.f13447d;
        Object obj = this.f13450v;
        switch (i7) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                if (this.f13448e) {
                    throw new IllegalStateException("closed");
                }
                long j5 = source.f17413e;
                byte[] bArr = ds.b.f7815a;
                if (j < 0 || 0 > j5 || j5 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((BufferedSink) ((gs.o) obj).f10250f).H(source, j);
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                v.f(source.f17413e, 0L, j);
                while (j > 0) {
                    q qVar = source.f17412d;
                    Intrinsics.checkNotNull(qVar);
                    int iMin = (int) Math.min(j, qVar.f19598c - qVar.f19597b);
                    ((Deflater) obj).setInput(qVar.f19596a, qVar.f19597b, iMin);
                    c(false);
                    long j7 = iMin;
                    source.f17413e -= j7;
                    int i10 = qVar.f19597b + iMin;
                    qVar.f19597b = i10;
                    if (i10 == qVar.f19598c) {
                        source.f17412d = qVar.a();
                        r.a(qVar);
                    }
                    j -= j7;
                }
                return;
        }
    }

    public void c(boolean z5) {
        q qVarQ;
        int iDeflate;
        Deflater deflater = (Deflater) this.f13450v;
        o oVar = (o) this.f13449i;
        Buffer buffer = oVar.f19591e;
        while (true) {
            qVarQ = buffer.Q(1);
            byte[] bArr = qVarQ.f19596a;
            if (z5) {
                int i7 = qVarQ.f19598c;
                iDeflate = deflater.deflate(bArr, i7, 8192 - i7, 2);
            } else {
                int i10 = qVarQ.f19598c;
                iDeflate = deflater.deflate(bArr, i10, 8192 - i10);
            }
            if (iDeflate > 0) {
                qVarQ.f19598c += iDeflate;
                buffer.f17413e += (long) iDeflate;
                oVar.c();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (qVarQ.f19597b == qVarQ.f19598c) {
            buffer.f17412d = qVarQ.a();
            r.a(qVarQ);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        switch (this.f13447d) {
            case 0:
                gs.o oVar = (gs.o) this.f13450v;
                if (this.f13448e) {
                    return;
                }
                this.f13448e = true;
                gs.o.i(oVar, (h) this.f13449i);
                oVar.f10246b = 3;
                return;
            default:
                Deflater deflater = (Deflater) this.f13450v;
                if (this.f13448e) {
                    return;
                }
                deflater.finish();
                c(false);
                th = null;
                try {
                    deflater.end();
                    break;
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((o) this.f13449i).close();
                    break;
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.f13448e = true;
                if (th != null) {
                    throw th;
                }
                return;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        switch (this.f13447d) {
            case 0:
                if (!this.f13448e) {
                    ((BufferedSink) ((gs.o) this.f13450v).f10250f).flush();
                    break;
                }
                break;
            default:
                c(true);
                ((o) this.f13449i).flush();
                break;
        }
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        switch (this.f13447d) {
            case 0:
                return (h) this.f13449i;
            default:
                return ((o) this.f13449i).f19590d.timeout();
        }
    }

    public String toString() {
        switch (this.f13447d) {
            case 1:
                return "DeflaterSink(" + ((o) this.f13449i) + ')';
            default:
                return super.toString();
        }
    }

    public e(gs.o this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f13450v = this$0;
        this.f13449i = new h(((BufferedSink) this$0.f10250f).timeout());
    }
}
