package c5;

import android.os.Process;
import com.google.android.gms.internal.play_billing.u0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f3477y = w.f3524a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue f3478d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BlockingQueue f3479e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d5.c f3480i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u4.b f3481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f3482w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4.i f3483x;

    public c(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, d5.c cVar, u4.b bVar) {
        this.f3478d = priorityBlockingQueue;
        this.f3479e = priorityBlockingQueue2;
        this.f3480i = cVar;
        this.f3481v = bVar;
        this.f3483x = new e4.i(this, priorityBlockingQueue2, bVar);
    }

    private void a() {
        n nVar = (n) this.f3478d.take();
        nVar.addMarker("cache-queue-take");
        nVar.sendEvent(1);
        try {
            if (nVar.isCanceled()) {
                nVar.finish("cache-discard-canceled");
                nVar.sendEvent(2);
                return;
            }
            b bVarB = this.f3480i.b(nVar.getCacheKey());
            if (bVarB == null) {
                nVar.addMarker("cache-miss");
                if (!this.f3483x.v(nVar)) {
                    this.f3479e.put(nVar);
                }
                nVar.sendEvent(2);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (bVarB.f3473e < jCurrentTimeMillis) {
                nVar.addMarker("cache-hit-expired");
                nVar.setCacheEntry(bVarB);
                if (!this.f3483x.v(nVar)) {
                    this.f3479e.put(nVar);
                }
                nVar.sendEvent(2);
                return;
            }
            nVar.addMarker("cache-hit");
            r networkResponse = nVar.parseNetworkResponse(new i(bVarB.f3469a, bVarB.f3475g));
            nVar.addMarker("cache-hit-parsed");
            if (networkResponse.f3516c == null) {
                if (bVarB.f3474f < jCurrentTimeMillis) {
                    nVar.addMarker("cache-hit-refresh-needed");
                    nVar.setCacheEntry(bVarB);
                    networkResponse.f3517d = true;
                    if (this.f3483x.v(nVar)) {
                        this.f3481v.h0(nVar, networkResponse, null);
                    } else {
                        this.f3481v.h0(nVar, networkResponse, new u0(this, nVar, 4, false));
                    }
                } else {
                    this.f3481v.h0(nVar, networkResponse, null);
                }
                nVar.sendEvent(2);
                return;
            }
            nVar.addMarker("cache-parsing-failed");
            d5.c cVar = this.f3480i;
            String cacheKey = nVar.getCacheKey();
            synchronized (cVar) {
                b bVarB2 = cVar.b(cacheKey);
                if (bVarB2 != null) {
                    bVarB2.f3474f = 0L;
                    bVarB2.f3473e = 0L;
                    cVar.g(cacheKey, bVarB2);
                }
            }
            nVar.setCacheEntry(null);
            if (!this.f3483x.v(nVar)) {
                this.f3479e.put(nVar);
            }
            nVar.sendEvent(2);
        } catch (Throwable th2) {
            nVar.sendEvent(2);
            throw th2;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f3477y) {
            w.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f3480i.e();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f3482w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                w.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
