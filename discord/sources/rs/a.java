package rs;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Sink {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f19553d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f19554e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f19555i;

    public a(OutputStream out, Timeout timeout) {
        Intrinsics.checkNotNullParameter(out, "out");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        this.f19554e = out;
        this.f19555i = timeout;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a2 A[LOOP:1: B:12:0x006a->B:25:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x00a4 A[SYNTHETIC] */
    @Override // okio.Sink
    public final void H(Buffer source, long j) throws IOException {
        long j5;
        gs.h hVar;
        int i7 = this.f19553d;
        Object obj = this.f19554e;
        Object obj2 = this.f19555i;
        Intrinsics.checkNotNullParameter(source, "source");
        switch (i7) {
            case 0:
                v.f(source.f17413e, 0L, j);
                for (long j7 = j; j7 > 0; j7 -= j5) {
                    q qVar = source.f17412d;
                    Intrinsics.checkNotNull(qVar);
                    j5 = 0;
                    try {
                        try {
                            while (j5 < 65536) {
                                j5 += (long) (qVar.f19598c - qVar.f19597b);
                                if (j5 >= j7) {
                                    j5 = j7;
                                    hVar = (gs.h) obj;
                                    a aVar = (a) obj2;
                                    hVar.i();
                                    aVar.H(source, j5);
                                    Unit unit = Unit.f14616a;
                                    if (!hVar.j()) {
                                        throw hVar.m(null);
                                    }
                                } else {
                                    qVar = qVar.f19601f;
                                    Intrinsics.checkNotNull(qVar);
                                }
                            }
                            aVar.H(source, j5);
                            Unit unit2 = Unit.f14616a;
                            if (!hVar.j()) {
                                throw hVar.m(null);
                            }
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
                    hVar = (gs.h) obj;
                    a aVar2 = (a) obj2;
                    hVar.i();
                }
                return;
            default:
                v.f(source.f17413e, 0L, j);
                long j10 = j;
                while (j10 > 0) {
                    ((Timeout) obj2).f();
                    q qVar2 = source.f17412d;
                    Intrinsics.checkNotNull(qVar2);
                    int iMin = (int) Math.min(j10, qVar2.f19598c - qVar2.f19597b);
                    ((OutputStream) obj).write(qVar2.f19596a, qVar2.f19597b, iMin);
                    int i10 = qVar2.f19597b + iMin;
                    qVar2.f19597b = i10;
                    long j11 = iMin;
                    j10 -= j11;
                    source.f17413e -= j11;
                    if (i10 == qVar2.f19598c) {
                        source.f17412d = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        int i7 = this.f19553d;
        Object obj = this.f19554e;
        switch (i7) {
            case 0:
                gs.h hVar = (gs.h) obj;
                a aVar = (a) this.f19555i;
                hVar.i();
                try {
                    try {
                        aVar.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        int i7 = this.f19553d;
        Object obj = this.f19554e;
        switch (i7) {
            case 0:
                gs.h hVar = (gs.h) obj;
                a aVar = (a) this.f19555i;
                hVar.i();
                try {
                    try {
                        aVar.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        switch (this.f19553d) {
            case 0:
                return (gs.h) this.f19554e;
            default:
                return (Timeout) this.f19555i;
        }
    }

    public final String toString() {
        switch (this.f19553d) {
            case 0:
                return "AsyncTimeout.sink(" + ((a) this.f19555i) + ')';
            default:
                return "sink(" + ((OutputStream) this.f19554e) + ')';
        }
    }

    public a(gs.h hVar, a aVar) {
        this.f19554e = hVar;
        this.f19555i = aVar;
    }
}
