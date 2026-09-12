package rs;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Source {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19556d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19557e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19558i;

    public b(InputStream input, Timeout timeout) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f19557e = input;
        this.f19558i = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i7 = this.f19556d;
        Object obj = this.f19557e;
        switch (i7) {
            case 0:
                gs.h hVar = (gs.h) obj;
                b bVar = (b) this.f19558i;
                hVar.i();
                try {
                    try {
                        bVar.close();
                        Unit unit = Unit.f14616a;
                        if (hVar.j()) {
                            throw hVar.m(null);
                        }
                        return;
                    } catch (IOException e10) {
                        if (!hVar.j()) {
                            throw e10;
                        }
                        throw hVar.m(e10);
                    }
                } catch (Throwable th2) {
                    hVar.j();
                    throw th2;
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        switch (this.f19556d) {
            case 0:
                Intrinsics.checkNotNullParameter(sink, "sink");
                gs.h hVar = (gs.h) this.f19557e;
                b bVar = (b) this.f19558i;
                hVar.i();
                try {
                    try {
                        long j5 = bVar.read(sink, j);
                        if (hVar.j()) {
                            throw hVar.m(null);
                        }
                        return j5;
                    } catch (IOException e10) {
                        if (hVar.j()) {
                            throw hVar.m(e10);
                        }
                        throw e10;
                    }
                } catch (Throwable th2) {
                    hVar.j();
                    throw th2;
                }
            default:
                Intrinsics.checkNotNullParameter(sink, "sink");
                if (j == 0) {
                    return 0L;
                }
                if (j < 0) {
                    throw new IllegalArgumentException(kk.b.i(j, "byteCount < 0: ").toString());
                }
                try {
                    ((Timeout) this.f19558i).f();
                    q qVarQ = sink.Q(1);
                    int i7 = ((InputStream) this.f19557e).read(qVarQ.f19596a, qVarQ.f19598c, (int) Math.min(j, 8192 - qVarQ.f19598c));
                    if (i7 == -1) {
                        if (qVarQ.f19597b == qVarQ.f19598c) {
                            sink.f17412d = qVarQ.a();
                            r.a(qVarQ);
                        }
                        return -1L;
                    }
                    qVarQ.f19598c += i7;
                    long j7 = i7;
                    sink.f17413e += j7;
                    return j7;
                } catch (AssertionError e11) {
                    if (v.g(e11)) {
                        throw new IOException(e11);
                    }
                    throw e11;
                }
        }
    }

    @Override // okio.Source
    public final Timeout timeout() {
        switch (this.f19556d) {
            case 0:
                return (gs.h) this.f19557e;
            default:
                return (Timeout) this.f19558i;
        }
    }

    public final String toString() {
        switch (this.f19556d) {
            case 0:
                return "AsyncTimeout.source(" + ((b) this.f19558i) + ')';
            default:
                return "source(" + ((InputStream) this.f19557e) + ')';
        }
    }

    public b(gs.h hVar, b bVar) {
        this.f19557e = hVar;
        this.f19558i = bVar;
    }
}
