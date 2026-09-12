package es;

import java.io.EOFException;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.Buffer;

/* JADX INFO: loaded from: classes.dex */
public final class i extends rs.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lambda f8757e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f8758i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public i(rs.a delegate, Function1 onException) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(onException, "onException");
        this.f8757e = (Lambda) onException;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // rs.f, okio.Sink
    public final void H(Buffer source, long j) throws EOFException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (this.f8758i) {
            source.skip(j);
            return;
        }
        try {
            super.H(source, j);
        } catch (IOException e10) {
            this.f8758i = true;
            this.f8757e.invoke(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // rs.f, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f8758i) {
            return;
        }
        try {
            super.close();
        } catch (IOException e10) {
            this.f8758i = true;
            this.f8757e.invoke(e10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // rs.f, okio.Sink, java.io.Flushable
    public final void flush() {
        if (this.f8758i) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e10) {
            this.f8758i = true;
            this.f8757e.invoke(e10);
        }
    }
}
