package gs;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class d extends rs.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10193e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10194i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f10195v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f10196w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ gc.k f10197x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gc.k this$0, Source delegate, long j) {
        super(delegate);
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f10197x = this$0;
        this.f10192d = j;
        this.f10194i = true;
        if (j == 0) {
            c(null);
        }
    }

    public final IOException c(IOException iOException) {
        if (this.f10195v) {
            return iOException;
        }
        this.f10195v = true;
        gc.k kVar = this.f10197x;
        if (iOException == null && this.f10194i) {
            this.f10194i = false;
            i call = (i) kVar.f9733i;
            Intrinsics.checkNotNullParameter(call, "call");
        }
        return kVar.c(true, false, iOException);
    }

    @Override // rs.g, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f10196w) {
            return;
        }
        this.f10196w = true;
        try {
            super.close();
            c(null);
        } catch (IOException e10) {
            throw c(e10);
        }
    }

    @Override // rs.g, okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (this.f10196w) {
            throw new IllegalStateException("closed");
        }
        try {
            long j5 = delegate().read(sink, j);
            if (this.f10194i) {
                this.f10194i = false;
                i call = (i) this.f10197x.f9733i;
                Intrinsics.checkNotNullParameter(call, "call");
            }
            if (j5 == -1) {
                c(null);
                return -1L;
            }
            long j7 = this.f10193e + j5;
            long j10 = this.f10192d;
            if (j10 == -1 || j7 <= j10) {
                this.f10193e = j7;
                if (j7 == j10) {
                    c(null);
                }
                return j5;
            }
            throw new ProtocolException("expected " + j10 + " bytes but received " + j7);
        } catch (IOException e10) {
            throw c(e10);
        }
    }
}
