package c5;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f3505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f3506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityBlockingQueue f3507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PriorityBlockingQueue f3508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d5.c f3509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e4.l f3510f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u4.b f3511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h[] f3512h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f3513i;
    public final ArrayList j;
    public final ArrayList k;

    public o(d5.c cVar, e4.l lVar) {
        u4.b bVar = new u4.b(new Handler(Looper.getMainLooper()));
        this.f3505a = new AtomicInteger();
        this.f3506b = new HashSet();
        this.f3507c = new PriorityBlockingQueue();
        this.f3508d = new PriorityBlockingQueue();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f3509e = cVar;
        this.f3510f = lVar;
        this.f3512h = new h[4];
        this.f3511g = bVar;
    }

    public final void a(n nVar) {
        nVar.setRequestQueue(this);
        synchronized (this.f3506b) {
            this.f3506b.add(nVar);
        }
        nVar.setSequence(this.f3505a.incrementAndGet());
        nVar.addMarker("add-to-queue");
        b();
        if (nVar.shouldCache()) {
            this.f3507c.add(nVar);
        } else {
            this.f3508d.add(nVar);
        }
    }

    public final void b() {
        synchronized (this.k) {
            try {
                Iterator it = this.k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
