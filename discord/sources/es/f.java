package es;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8745e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f8746i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ h f8747v;

    public f(h this$0, String key, long j, ArrayList sources, long[] lengths) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(sources, "sources");
        Intrinsics.checkNotNullParameter(lengths, "lengths");
        this.f8747v = this$0;
        this.f8744d = key;
        this.f8745e = j;
        this.f8746i = sources;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f8746i.iterator();
        while (it.hasNext()) {
            ds.b.c((Source) it.next());
        }
    }
}
