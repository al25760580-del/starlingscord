package es;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.Source;
import okio.Timeout;
import rs.o;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Source {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8724d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f8725e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r9.a f8726i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f8727v;

    public a(BufferedSource bufferedSource, r9.a aVar, o oVar) {
        this.f8725e = bufferedSource;
        this.f8726i = aVar;
        this.f8727v = oVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zT;
        if (!this.f8724d) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = ds.b.f7815a;
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
            try {
                zT = ds.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                this.f8724d = true;
                this.f8726i.i();
            }
        }
        this.f8725e.close();
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            long j5 = this.f8725e.read(sink, j);
            o oVar = this.f8727v;
            if (j5 != -1) {
                sink.g(oVar.f19591e, sink.f17413e - j5, j5);
                oVar.c();
                return j5;
            }
            if (!this.f8724d) {
                this.f8724d = true;
                oVar.close();
            }
            return -1L;
        } catch (IOException e10) {
            if (this.f8724d) {
                throw e10;
            }
            this.f8724d = true;
            this.f8726i.i();
            throw e10;
        }
    }

    @Override // okio.Source
    public final Timeout timeout() {
        return this.f8725e.timeout();
    }
}
