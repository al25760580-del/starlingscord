package gs;

import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSink;
import okio.BufferedSource;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedSource f10220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BufferedSink f10221e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ BufferedSource f10222i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ BufferedSink f10223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ gc.k f10224w;

    public k(BufferedSource source, BufferedSink sink, gc.k kVar) {
        this.f10222i = source;
        this.f10223v = sink;
        this.f10224w = kVar;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f10220d = source;
        this.f10221e = sink;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10224w.c(true, true, null);
    }
}
