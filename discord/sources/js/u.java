package js;

import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class u implements Sink {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Buffer f14176e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f14177i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ w f14178v;

    public u(w this$0, boolean z5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f14178v = this$0;
        this.f14175d = z5;
        this.f14176e = new Buffer();
    }

    @Override // okio.Sink
    public final void H(Buffer source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        byte[] bArr = ds.b.f7815a;
        Buffer buffer = this.f14176e;
        buffer.H(source, j);
        while (buffer.f17413e >= 16384) {
            c(false);
        }
    }

    public final void c(boolean z5) throws IOException {
        long jMin;
        boolean z6;
        w wVar = this.f14178v;
        synchronized (wVar) {
            try {
                wVar.f14194l.i();
                while (wVar.f14189e >= wVar.f14190f && !this.f14175d && !this.f14177i && wVar.f() == null) {
                    try {
                        try {
                            wVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th2) {
                        wVar.f14194l.l();
                        throw th2;
                    }
                }
                wVar.f14194l.l();
                wVar.b();
                jMin = Math.min(wVar.f14190f - wVar.f14189e, this.f14176e.f17413e);
                wVar.f14189e += jMin;
                z6 = z5 && jMin == this.f14176e.f17413e;
                Unit unit = Unit.f14616a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f14178v.f14194l.i();
        try {
            w wVar2 = this.f14178v;
            wVar2.f14186b.q(wVar2.f14185a, z6, this.f14176e, jMin);
        } finally {
            this.f14178v.f14194l.l();
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        w wVar = this.f14178v;
        byte[] bArr = ds.b.f7815a;
        synchronized (wVar) {
            if (this.f14177i) {
                return;
            }
            boolean z5 = wVar.f() == null;
            Unit unit = Unit.f14616a;
            w wVar2 = this.f14178v;
            if (!wVar2.j.f14175d) {
                if (this.f14176e.f17413e > 0) {
                    while (this.f14176e.f17413e > 0) {
                        c(true);
                    }
                } else if (z5) {
                    wVar2.f14186b.q(wVar2.f14185a, true, null, 0L);
                }
            }
            synchronized (this.f14178v) {
                this.f14177i = true;
                Unit unit2 = Unit.f14616a;
            }
            this.f14178v.f14186b.flush();
            this.f14178v.a();
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        w wVar = this.f14178v;
        byte[] bArr = ds.b.f7815a;
        synchronized (wVar) {
            wVar.b();
            Unit unit = Unit.f14616a;
        }
        while (this.f14176e.f17413e > 0) {
            c(false);
            this.f14178v.f14186b.flush();
        }
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        return this.f14178v.f14194l;
    }
}
