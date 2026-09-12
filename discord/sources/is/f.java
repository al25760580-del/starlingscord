package is;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13451v;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f13436e) {
            return;
        }
        if (!this.f13451v) {
            c();
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
        if (this.f13451v) {
            return -1L;
        }
        long j5 = super.read(sink, j);
        if (j5 != -1) {
            return j5;
        }
        this.f13451v = true;
        c();
        return -1L;
    }
}
