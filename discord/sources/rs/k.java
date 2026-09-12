package rs;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Source {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f19576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Inflater f19577e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19578i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19579v;

    public k(p source, Inflater inflater) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this.f19576d = source;
        this.f19577e = inflater;
    }

    public final long c(Buffer sink, long j) throws IOException {
        Inflater inflater = this.f19577e;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(kk.b.i(j, "byteCount < 0: ").toString());
        }
        if (this.f19579v) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                q qVarQ = sink.Q(1);
                int iMin = (int) Math.min(j, 8192 - qVarQ.f19598c);
                boolean zNeedsInput = inflater.needsInput();
                p pVar = this.f19576d;
                if (zNeedsInput && !pVar.c()) {
                    q qVar = pVar.f19594e.f17412d;
                    Intrinsics.checkNotNull(qVar);
                    int i7 = qVar.f19598c;
                    int i10 = qVar.f19597b;
                    int i11 = i7 - i10;
                    this.f19578i = i11;
                    inflater.setInput(qVar.f19596a, i10, i11);
                }
                int iInflate = inflater.inflate(qVarQ.f19596a, qVarQ.f19598c, iMin);
                int i12 = this.f19578i;
                if (i12 != 0) {
                    int remaining = i12 - inflater.getRemaining();
                    this.f19578i -= remaining;
                    pVar.skip(remaining);
                }
                if (iInflate > 0) {
                    qVarQ.f19598c += iInflate;
                    long j5 = iInflate;
                    sink.f17413e += j5;
                    return j5;
                }
                if (qVarQ.f19597b == qVarQ.f19598c) {
                    sink.f17412d = qVarQ.a();
                    r.a(qVarQ);
                }
            } catch (DataFormatException e10) {
                throw new IOException(e10);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f19579v) {
            return;
        }
        this.f19577e.end();
        this.f19579v = true;
        this.f19576d.close();
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        do {
            long jC = c(sink, j);
            if (jC > 0) {
                return jC;
            }
            Inflater inflater = this.f19577e;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f19576d.c());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f19576d.f19593d.timeout();
    }
}
