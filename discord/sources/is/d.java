package is;

import gs.l;
import gs.o;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f13445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f13446w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(o this$0, long j) {
        super(this$0);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this.f13446w = this$0;
        this.f13445v = j;
        if (j == 0) {
            c();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.f13436e) {
            return;
        }
        if (this.f13445v != 0) {
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
                ((l) this.f13446w.f10248d).k();
                c();
            }
        }
        this.f13436e = true;
    }

    @Override // is.a, okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("byteCount < 0: ", Long.valueOf(j)).toString());
        }
        if (this.f13436e) {
            throw new IllegalStateException("closed");
        }
        long j5 = this.f13445v;
        if (j5 == 0) {
            return -1L;
        }
        long j7 = super.read(sink, Math.min(j5, j));
        if (j7 == -1) {
            ((l) this.f13446w.f10248d).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        long j10 = this.f13445v - j7;
        this.f13445v = j10;
        if (j10 == 0) {
            c();
        }
        return j7;
    }
}
