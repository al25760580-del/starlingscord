package h4;

import android.os.Handler;
import android.os.Looper;
import ar.b0;
import f4.l;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineDispatcher f10328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f10329c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f10330d = new a(0, this);

    public b(ExecutorService executorService) {
        l lVar = new l(executorService);
        this.f10327a = lVar;
        this.f10328b = b0.m(lVar);
    }

    public final void a(Runnable runnable) {
        this.f10327a.execute(runnable);
    }
}
