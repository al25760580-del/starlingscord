package c5;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes.dex */
public final class h extends Thread {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue f3491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e4.l f3492e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d5.c f3493i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u4.b f3494v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f3495w = false;

    public h(PriorityBlockingQueue priorityBlockingQueue, e4.l lVar, d5.c cVar, u4.b bVar) {
        this.f3491d = priorityBlockingQueue;
        this.f3492e = lVar;
        this.f3493i = cVar;
        this.f3494v = bVar;
    }

    private void a() {
        n nVar = (n) this.f3491d.take();
        u4.b bVar = this.f3494v;
        SystemClock.elapsedRealtime();
        nVar.sendEvent(3);
        Object obj = null;
        try {
            nVar.addMarker("network-queue-take");
            if (nVar.isCanceled()) {
                nVar.finish("network-discard-cancelled");
                nVar.notifyListenerResponseNotUsable();
                return;
            }
            TrafficStats.setThreadStatsTag(nVar.getTrafficStatsTag());
            i iVarS = this.f3492e.s(nVar);
            nVar.addMarker("network-http-complete");
            if (iVarS.f3499d && nVar.hasHadResponseDelivered()) {
                nVar.finish("not-modified");
                nVar.notifyListenerResponseNotUsable();
                return;
            }
            r networkResponse = nVar.parseNetworkResponse(iVarS);
            nVar.addMarker("network-parse-complete");
            if (nVar.shouldCache() && networkResponse.f3515b != null) {
                this.f3493i.g(nVar.getCacheKey(), networkResponse.f3515b);
                nVar.addMarker("network-cache-written");
            }
            nVar.markDelivered();
            bVar.h0(nVar, networkResponse, null);
            nVar.notifyListenerResponseReceived(networkResponse);
        } catch (t e10) {
            SystemClock.elapsedRealtime();
            t networkError = nVar.parseNetworkError(e10);
            bVar.getClass();
            nVar.addMarker("post-error");
            ((f) bVar.f20945e).execute(new a5.t(nVar, new r(networkError), obj, 3));
            nVar.notifyListenerResponseNotUsable();
        } catch (Exception e11) {
            Log.e("Volley", w.a("Unhandled exception %s", e11.toString()), e11);
            t tVar = new t(e11);
            SystemClock.elapsedRealtime();
            bVar.getClass();
            nVar.addMarker("post-error");
            ((f) bVar.f20945e).execute(new a5.t(nVar, new r(tVar), obj, 3));
            nVar.notifyListenerResponseNotUsable();
        } finally {
            nVar.sendEvent(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f3495w) {
                    Thread.currentThread().interrupt();
                    return;
                }
                w.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
