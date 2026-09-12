package gs;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Sink;

/* JADX INFO: loaded from: classes.dex */
public final class c extends rs.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10187e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10188i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f10189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gc.k f10191x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gc.k this$0, Sink delegate, long j) {
        super(delegate);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10191x = this$0;
        this.f10187e = j;
    }

    @Override // rs.f, okio.Sink
    public final void H(Buffer source, long j) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f10190w) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f10187e;
        if (j5 != -1 && this.f10189v + j > j5) {
            StringBuilder sbM = kk.b.m(j5, "expected ", " bytes but received ");
            sbM.append(this.f10189v + j);
            throw new ProtocolException(sbM.toString());
        }
        try {
            super.H(source, j);
            this.f10189v += j;
        } catch (IOException e10) {
            throw c(e10);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f10188i) {
            return iOException;
        }
        this.f10188i = true;
        return this.f10191x.c(false, true, iOException);
    }

    @Override // rs.f, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f10190w) {
            return;
        }
        this.f10190w = true;
        long j = this.f10187e;
        if (j != -1 && this.f10189v != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            c(null);
        } catch (IOException e10) {
            throw c(e10);
        }
    }

    @Override // rs.f, okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e10) {
            throw c(e10);
        }
    }
}
