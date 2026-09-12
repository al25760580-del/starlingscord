package io.sentry.transport;

import a5.l0;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.h0;
import io.sentry.j4;
import io.sentry.k4;
import io.sentry.l4;
import io.sentry.p4;
import io.sentry.s6;
import io.sentry.u;
import io.sentry.w5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f13173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io.sentry.cache.d f13174e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w5 f13175i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p f13176v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f13177w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e f13178x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile b f13179y;

    /* JADX WARN: Type inference failed for: r3v0, types: [io.sentry.transport.a] */
    public c(w5 w5Var, p pVar, h hVar, e4.l lVar) {
        int maxQueueSize = w5Var.getMaxQueueSize();
        final io.sentry.cache.d envelopeDiskCache = w5Var.getEnvelopeDiskCache();
        final ILogger logger = w5Var.getLogger();
        k4 dateProvider = w5Var.getDateProvider();
        n nVar = new n(maxQueueSize, new h0(2), new RejectedExecutionHandler() { // from class: io.sentry.transport.a
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                if (runnable instanceof b) {
                    b bVar = (b) runnable;
                    Hint hint = bVar.f13169e;
                    if (!l0.E(hint, io.sentry.hints.d.class)) {
                        envelopeDiskCache.n(bVar.f13168d, hint);
                    }
                    Object objB = hint.b("sentry:typeCheckHint");
                    if (io.sentry.hints.k.class.isInstance(hint.b("sentry:typeCheckHint")) && objB != null) {
                        ((io.sentry.hints.k) objB).b(false);
                    }
                    Object objB2 = hint.b("sentry:typeCheckHint");
                    if (io.sentry.hints.h.class.isInstance(hint.b("sentry:typeCheckHint")) && objB2 != null) {
                        ((io.sentry.hints.h) objB2).c(true);
                    }
                    logger.q(SentryLevel.WARNING, "Envelope rejected", new Object[0]);
                }
            }
        }, logger, dateProvider);
        e eVar = new e(w5Var, lVar, pVar);
        this.f13179y = null;
        this.f13173d = nVar;
        io.sentry.cache.d envelopeDiskCache2 = w5Var.getEnvelopeDiskCache();
        com.facebook.imagepipeline.nativecode.c.H(envelopeDiskCache2, "envelopeCache is required");
        this.f13174e = envelopeDiskCache2;
        this.f13175i = w5Var;
        this.f13176v = pVar;
        com.facebook.imagepipeline.nativecode.c.H(hVar, "transportGate is required");
        this.f13177w = hVar;
        this.f13178x = eVar;
    }

    @Override // io.sentry.transport.g
    public final void D(e4.c cVar, Hint hint) {
        io.sentry.cache.d dVar;
        boolean z5;
        e4.c cVarU;
        List listSingletonList;
        Iterable<p4> iterable = (Iterable) cVar.f7967i;
        boolean zE = l0.E(hint, io.sentry.hints.d.class);
        w5 w5Var = this.f13175i;
        io.sentry.cache.d dVar2 = this.f13174e;
        if (zE) {
            w5Var.getLogger().q(SentryLevel.DEBUG, "Captured Envelope is already cached", new Object[0]);
            dVar = i.f13186d;
            z5 = true;
        } else {
            dVar = dVar2;
            z5 = false;
        }
        p pVar = this.f13176v;
        w5 w5Var2 = pVar.f13197e;
        ArrayList arrayList = null;
        for (p4 p4Var : iterable) {
            String itemType = p4Var.f12887a.f13085w.getItemType();
            itemType.getClass();
            switch (itemType) {
                case "attachment":
                    listSingletonList = Collections.singletonList(io.sentry.l.Attachment);
                    break;
                case "replay_video":
                    listSingletonList = Collections.singletonList(io.sentry.l.Replay);
                    break;
                case "profile_chunk":
                    listSingletonList = Arrays.asList(io.sentry.l.ProfileChunkUi, io.sentry.l.ProfileChunk);
                    break;
                case "profile":
                    listSingletonList = Collections.singletonList(io.sentry.l.Profile);
                    break;
                case "feedback":
                    listSingletonList = Collections.singletonList(io.sentry.l.Feedback);
                    break;
                case "log":
                    listSingletonList = Collections.singletonList(io.sentry.l.LogItem);
                    break;
                case "span":
                    listSingletonList = Collections.singletonList(io.sentry.l.Span);
                    break;
                case "event":
                    listSingletonList = Collections.singletonList(io.sentry.l.Error);
                    break;
                case "trace_metric":
                    listSingletonList = Collections.singletonList(io.sentry.l.TraceMetric);
                    break;
                case "check_in":
                    listSingletonList = Collections.singletonList(io.sentry.l.Monitor);
                    break;
                case "session":
                    listSingletonList = Collections.singletonList(io.sentry.l.Session);
                    break;
                case "transaction":
                    listSingletonList = Collections.singletonList(io.sentry.l.Transaction);
                    break;
                default:
                    listSingletonList = Collections.singletonList(io.sentry.l.Unknown);
                    break;
            }
            Iterator it = listSingletonList.iterator();
            while (it.hasNext()) {
                if (pVar.f((io.sentry.l) it.next())) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(p4Var);
                    w5Var2.getClientReportRecorder().r(io.sentry.clientreport.d.RATELIMIT_BACKOFF, p4Var);
                    break;
                }
            }
        }
        if (arrayList != null) {
            w5Var2.getLogger().q(SentryLevel.WARNING, "%d envelope items will be dropped due rate limiting.", Integer.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList();
            for (p4 p4Var2 : iterable) {
                if (!arrayList.contains(p4Var2)) {
                    arrayList2.add(p4Var2);
                }
            }
            if (arrayList2.isEmpty()) {
                w5Var2.getLogger().q(SentryLevel.WARNING, "Envelope discarded due all items rate limited.", new Object[0]);
                Object objB = hint.b("sentry:typeCheckHint");
                if (io.sentry.hints.k.class.isInstance(hint.b("sentry:typeCheckHint")) && objB != null) {
                    ((io.sentry.hints.k) objB).b(false);
                }
                Object objB2 = hint.b("sentry:typeCheckHint");
                if (io.sentry.hints.h.class.isInstance(hint.b("sentry:typeCheckHint")) && objB2 != null) {
                    ((io.sentry.hints.h) objB2).c(false);
                }
                Object objB3 = hint.b("sentry:typeCheckHint");
                if (io.sentry.hints.c.class.isInstance(hint.b("sentry:typeCheckHint")) && objB3 != null) {
                    ((io.sentry.hints.c) objB3).f12723d.countDown();
                    w5Var2.getLogger().q(SentryLevel.DEBUG, "Disk flush envelope fired due to rate limit", new Object[0]);
                }
                cVarU = null;
            } else {
                cVarU = new e4.c((l4) cVar.f7966e, arrayList2);
            }
        } else {
            cVarU = cVar;
        }
        if (cVarU == null) {
            if (z5) {
                dVar2.Q(cVar);
                return;
            }
            return;
        }
        if (s6.class.isInstance(hint.b("sentry:typeCheckHint"))) {
            cVarU = w5Var.getClientReportRecorder().u(cVarU);
        }
        Future futureSubmit = this.f13173d.submit(new b(this, cVarU, hint, dVar));
        if (futureSubmit != null && futureSubmit.isCancelled()) {
            w5Var.getClientReportRecorder().k(io.sentry.clientreport.d.QUEUE_OVERFLOW, cVarU);
            return;
        }
        Object objB4 = hint.b("sentry:typeCheckHint");
        if (!u.class.isInstance(hint.b("sentry:typeCheckHint")) || objB4 == null) {
            return;
        }
        u uVar = (u) objB4;
        uVar.f13211y.add(uVar.f13210x);
        w5Var.getLogger().q(SentryLevel.DEBUG, "Envelope enqueued", new Object[0]);
    }

    @Override // io.sentry.transport.g
    public final void a(boolean z5) {
        this.f13176v.close();
        this.f13173d.shutdown();
        this.f13175i.getLogger().q(SentryLevel.DEBUG, "Shutting down", new Object[0]);
        if (z5) {
            return;
        }
        try {
            long flushTimeoutMillis = this.f13175i.getFlushTimeoutMillis();
            if (this.f13173d.awaitTermination(flushTimeoutMillis, TimeUnit.MILLISECONDS)) {
                return;
            }
            this.f13175i.getLogger().q(SentryLevel.WARNING, "Failed to shutdown the async connection async sender  within " + flushTimeoutMillis + " ms. Trying to force it now.", new Object[0]);
            this.f13173d.shutdownNow();
            if (this.f13179y != null) {
                this.f13173d.getRejectedExecutionHandler().rejectedExecution(this.f13179y, this.f13173d);
            }
        } catch (InterruptedException unused) {
            this.f13175i.getLogger().q(SentryLevel.DEBUG, "Thread interrupted while closing the connection.", new Object[0]);
            Thread.currentThread().interrupt();
        }
    }

    @Override // io.sentry.transport.g
    public final void b(long j) {
        n nVar = this.f13173d;
        nVar.getClass();
        try {
            ga.l lVar = nVar.f13195w;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            lVar.getClass();
            ((q) lVar.f9547e).tryAcquireSharedNanos(1, timeUnit.toNanos(j));
        } catch (InterruptedException e10) {
            nVar.f13193i.g(SentryLevel.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(false);
    }

    @Override // io.sentry.transport.g
    public final p d() {
        return this.f13176v;
    }

    @Override // io.sentry.transport.g
    public final boolean e() {
        boolean z5;
        p pVar = this.f13176v;
        pVar.getClass();
        pVar.f13196d.getClass();
        Date date = new Date(System.currentTimeMillis());
        ConcurrentHashMap concurrentHashMap = pVar.f13198i;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z5 = false;
                break;
            }
            Date date2 = (Date) concurrentHashMap.get((io.sentry.l) it.next());
            if (date2 != null && !date.after(date2)) {
                z5 = true;
                break;
            }
        }
        n nVar = this.f13173d;
        j4 j4Var = nVar.f13192e;
        return (z5 || (j4Var != null && (nVar.f13194v.now().b(j4Var) > 2000000000L ? 1 : (nVar.f13194v.now().b(j4Var) == 2000000000L ? 0 : -1)) < 0)) ? false : true;
    }
}
