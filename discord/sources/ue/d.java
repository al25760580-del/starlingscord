package ue;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2.a f21103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21104b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21105c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21106d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21107e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f21108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile w2.a f21109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile w2.a f21110h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Semaphore f21111i;
    public final Set j;

    public d(Context context, Set set) {
        context.getApplicationContext();
        this.f21111i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.f21109g != null) {
            boolean z5 = this.f21104b;
            if (!z5) {
                if (z5) {
                    c();
                } else {
                    this.f21107e = true;
                }
            }
            if (this.f21110h != null) {
                this.f21109g.getClass();
                this.f21109g = null;
                return;
            }
            this.f21109g.getClass();
            w2.a aVar = this.f21109g;
            aVar.f22001i.set(true);
            if (aVar.f21999d.cancel(false)) {
                this.f21110h = this.f21109g;
            }
            this.f21109g = null;
        }
    }

    public final void b() {
        if (this.f21110h != null || this.f21109g == null) {
            return;
        }
        this.f21109g.getClass();
        if (this.f21108f == null) {
            this.f21108f = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        w2.a aVar = this.f21109g;
        Executor executor = this.f21108f;
        if (aVar.f22000e == 1) {
            aVar.f22000e = 2;
            executor.execute(aVar.f21999d);
            return;
        }
        int iB = f0.e.b(aVar.f22000e);
        if (iB == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iB == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f21109g = new w2.a(this);
        b();
    }

    public final void d() {
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            ((ye.l) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f21111i.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e10);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
