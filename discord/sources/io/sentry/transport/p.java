package io.sentry.transport;

import io.sentry.w5;
import java.io.Closeable;
import java.util.Date;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w5 f13197e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f13198i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f13199v = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Timer f13200w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final io.sentry.util.a f13201x = new io.sentry.util.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f13196d = d.f13180d;

    public p(w5 w5Var) {
        this.f13197e = w5Var;
    }

    public final void c(io.sentry.l lVar, Date date) {
        ConcurrentHashMap concurrentHashMap = this.f13198i;
        Date date2 = (Date) concurrentHashMap.get(lVar);
        if (date2 == null || date.after(date2)) {
            concurrentHashMap.put(lVar, date);
            Iterator it = this.f13199v.iterator();
            while (it.hasNext()) {
                ((o) it.next()).onRateLimitChanged(this);
            }
            io.sentry.r rVarA = this.f13201x.a();
            try {
                if (this.f13200w == null) {
                    this.f13200w = new Timer(true);
                }
                this.f13200w.schedule(new io.sentry.n(2, this), date);
                rVarA.close();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.f13201x.a();
        try {
            Timer timer = this.f13200w;
            if (timer != null) {
                timer.cancel();
                this.f13200w = null;
            }
            rVarA.close();
            this.f13199v.clear();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean f(io.sentry.l lVar) {
        Date date;
        this.f13196d.getClass();
        Date date2 = new Date(System.currentTimeMillis());
        io.sentry.l lVar2 = io.sentry.l.All;
        ConcurrentHashMap concurrentHashMap = this.f13198i;
        Date date3 = (Date) concurrentHashMap.get(lVar2);
        if (date3 != null && !date2.after(date3)) {
            return true;
        }
        if (io.sentry.l.Unknown.equals(lVar) || (date = (Date) concurrentHashMap.get(lVar)) == null) {
            return false;
        }
        return !date2.after(date);
    }
}
