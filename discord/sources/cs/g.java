package cs;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import kotlin.jvm.internal.Intrinsics;
import mo.c0;
import okhttp3.Request;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Closeable, Flushable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final es.h f7425d;

    public g(File directory, long j) {
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(directory, "directory");
        ks.a fileSystem = ks.a.f14809a;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f7425d = new es.h(directory, j, fs.c.f9420h);
    }

    public final void c(Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        es.h hVar = this.f7425d;
        String key = c0.D(request.f17368a);
        synchronized (hVar) {
            Intrinsics.checkNotNullParameter(key, "key");
            hVar.l();
            hVar.c();
            es.h.Q(key);
            es.e eVar = (es.e) hVar.E.get(key);
            if (eVar == null) {
                return;
            }
            hVar.O(eVar);
            if (hVar.f8755x <= hVar.f8751e) {
                hVar.K = false;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f7425d.close();
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.f7425d.flush();
    }
}
