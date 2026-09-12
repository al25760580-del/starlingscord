package v3;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f21413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WorkerParameters f21414e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile int f21415i = -256;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f21416v;

    public p(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f21413d = context;
        this.f21414e = workerParameters;
    }

    public ListenableFuture a() {
        g4.j jVar = new g4.j();
        jVar.k(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return jVar;
    }

    public abstract g4.j d();

    public final void e(int i7) {
        this.f21415i = i7;
        c();
    }

    public void c() {
    }
}
