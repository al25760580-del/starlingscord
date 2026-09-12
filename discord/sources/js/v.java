package js;

import java.io.IOException;
import java.io.InterruptedIOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Source {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f14179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14180e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Buffer f14181i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Buffer f14182v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14183w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f14184x;

    public v(w this$0, long j, boolean z5) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f14184x = this$0;
        this.f14179d = j;
        this.f14180e = z5;
        this.f14181i = new Buffer();
        this.f14182v = new Buffer();
    }

    public final void c(long j) {
        byte[] bArr = ds.b.f7815a;
        this.f14184x.f14186b.n(j);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        w wVar = this.f14184x;
        synchronized (wVar) {
            this.f14183w = true;
            Buffer buffer = this.f14182v;
            j = buffer.f17413e;
            buffer.c();
            wVar.notifyAll();
            Unit unit = Unit.f14616a;
        }
        if (j > 0) {
            c(j);
        }
        this.f14184x.a();
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) throws Throwable {
        Throwable b0Var;
        boolean z5;
        long j5;
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j7 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
        }
        while (true) {
            w wVar = this.f14184x;
            synchronized (wVar) {
                wVar.k.i();
                try {
                    if (wVar.f() == null || this.f14180e) {
                        b0Var = null;
                    } else {
                        b0Var = wVar.f14196n;
                        if (b0Var == null) {
                            b bVarF = wVar.f();
                            Intrinsics.checkNotNull(bVarF);
                            b0Var = new b0(bVarF);
                        }
                    }
                    if (this.f14183w) {
                        throw new IOException("stream closed");
                    }
                    Buffer buffer = this.f14182v;
                    long j10 = buffer.f17413e;
                    z5 = false;
                    if (j10 > j7) {
                        j5 = buffer.read(sink, Math.min(j, j10));
                        long j11 = wVar.f14187c + j5;
                        wVar.f14187c = j11;
                        long j12 = j11 - wVar.f14188d;
                        if (b0Var == null && j12 >= wVar.f14186b.M.a() / 2) {
                            wVar.f14186b.y(wVar.f14185a, j12);
                            wVar.f14188d = wVar.f14187c;
                        }
                    } else {
                        if (!this.f14180e && b0Var == null) {
                            try {
                                wVar.wait();
                                z5 = true;
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                throw new InterruptedIOException();
                            }
                        }
                        j5 = -1;
                    }
                    wVar.k.l();
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    wVar.k.l();
                    throw th2;
                }
            }
            if (!z5) {
                if (j5 != -1) {
                    c(j5);
                    return j5;
                }
                if (b0Var == null) {
                    return -1L;
                }
                throw b0Var;
            }
            j7 = 0;
        }
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f14184x.k;
    }
}
