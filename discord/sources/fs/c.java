package fs;

import a3.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f9420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f9421i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.c f9422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f9425d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f9426e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f9427f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f9428g;

    static {
        String name = Intrinsics.stringPlus(ds.b.f7821g, " TaskRunner");
        Intrinsics.checkNotNullParameter(name, "name");
        ds.a threadFactory = new ds.a(name, true);
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        u4.c cVar = new u4.c();
        cVar.f20946d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        f9420h = new c(cVar);
        Logger logger = Logger.getLogger(c.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f9421i = logger;
    }

    public c(u4.c backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f9422a = backend;
        this.f9423b = 10000;
        this.f9426e = new ArrayList();
        this.f9427f = new ArrayList();
        this.f9428g = new h(15, this);
    }

    public static final void a(c cVar, a aVar) {
        byte[] bArr = ds.b.f7815a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.f9410a);
        try {
            long jA = aVar.a();
            synchronized (cVar) {
                cVar.b(aVar, jA);
                Unit unit = Unit.f14616a;
            }
        } finally {
            synchronized (cVar) {
                cVar.b(aVar, -1L);
                Unit unit2 = Unit.f14616a;
                threadCurrentThread.setName(name);
            }
        }
    }

    public final void b(a aVar, long j) {
        byte[] bArr = ds.b.f7815a;
        b bVar = aVar.f9412c;
        Intrinsics.checkNotNull(bVar);
        if (bVar.f9417d != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z5 = bVar.f9419f;
        bVar.f9419f = false;
        bVar.f9417d = null;
        this.f9426e.remove(bVar);
        if (j != -1 && !z5 && !bVar.f9416c) {
            bVar.e(aVar, j, true);
        }
        if (bVar.f9418e.isEmpty()) {
            return;
        }
        this.f9427f.add(bVar);
    }

    public final a c() {
        boolean z5;
        byte[] bArr = ds.b.f7815a;
        while (true) {
            ArrayList arrayList = this.f9427f;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = LongCompanionObject.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z5 = false;
                    break;
                }
                a aVar2 = (a) ((b) it.next()).f9418e.get(0);
                long jMax = Math.max(0L, aVar2.f9413d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z5 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            ArrayList arrayList2 = this.f9426e;
            if (aVar != null) {
                byte[] bArr2 = ds.b.f7815a;
                aVar.f9413d = -1L;
                b bVar = aVar.f9412c;
                Intrinsics.checkNotNull(bVar);
                bVar.f9418e.remove(aVar);
                arrayList.remove(bVar);
                bVar.f9417d = aVar;
                arrayList2.add(bVar);
                if (z5 || (!this.f9424c && !arrayList.isEmpty())) {
                    h runnable = this.f9428g;
                    Intrinsics.checkNotNullParameter(runnable, "runnable");
                    ((ThreadPoolExecutor) this.f9422a.f20946d).execute(runnable);
                }
                return aVar;
            }
            if (this.f9424c) {
                if (jMin >= this.f9425d - jNanoTime) {
                    break;
                }
                Intrinsics.checkNotNullParameter(this, "taskRunner");
                notify();
                break;
            }
            this.f9424c = true;
            this.f9425d = jNanoTime + jMin;
            try {
                try {
                    Intrinsics.checkNotNullParameter(this, "taskRunner");
                    long j = jMin / 1000000;
                    long j5 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j5);
                    }
                } catch (InterruptedException unused) {
                    int size = arrayList2.size() - 1;
                    if (size >= 0) {
                        while (true) {
                            int i7 = size - 1;
                            ((b) arrayList2.get(size)).b();
                            if (i7 < 0) {
                                break;
                            }
                            size = i7;
                        }
                    }
                    int size2 = arrayList.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i10 = size2 - 1;
                            b bVar2 = (b) arrayList.get(size2);
                            bVar2.b();
                            if (bVar2.f9418e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                            if (i10 < 0) {
                                break;
                            }
                            size2 = i10;
                        }
                    }
                }
                this.f9424c = false;
            } catch (Throwable th2) {
                this.f9424c = false;
                throw th2;
            }
        }
        return null;
    }

    public final void d(b taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        byte[] bArr = ds.b.f7815a;
        if (taskQueue.f9417d == null) {
            boolean zIsEmpty = taskQueue.f9418e.isEmpty();
            ArrayList arrayList = this.f9427f;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                Intrinsics.checkNotNullParameter(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.f9424c) {
            Intrinsics.checkNotNullParameter(this, "taskRunner");
            notify();
        } else {
            h runnable = this.f9428g;
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            ((ThreadPoolExecutor) this.f9422a.f20946d).execute(runnable);
        }
    }

    public final b e() {
        int i7;
        synchronized (this) {
            i7 = this.f9423b;
            this.f9423b = i7 + 1;
        }
        return new b(this, Intrinsics.stringPlus("Q", Integer.valueOf(i7)));
    }
}
