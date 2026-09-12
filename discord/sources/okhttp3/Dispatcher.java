package okhttp3;

import gs.f;
import gs.i;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Dispatcher {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f17315c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17313a = 64;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17314b = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f17316d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f17317e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f17318f = new ArrayDeque();

    public final synchronized void a() {
        try {
            Iterator it = this.f17316d.iterator();
            while (it.hasNext()) {
                ((f) it.next()).f10209i.cancel();
            }
            Iterator it2 = this.f17317e.iterator();
            while (it2.hasNext()) {
                ((f) it2.next()).f10209i.cancel();
            }
            Iterator it3 = this.f17318f.iterator();
            while (it3.hasNext()) {
                ((i) it3.next()).cancel();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ExecutorService b() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (this.f17315c == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String name = Intrinsics.stringPlus(ds.b.f7821g, " Dispatcher");
                Intrinsics.checkNotNullParameter(name, "name");
                this.f17315c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ds.a(name, false));
            }
            threadPoolExecutor = this.f17315c;
            Intrinsics.checkNotNull(threadPoolExecutor);
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    public final void c(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            synchronized (this) {
            }
            e();
        }
        Unit unit = Unit.f14616a;
        e();
    }

    public final void d(f call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.f10208e.decrementAndGet();
        c(this.f17317e, call);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r3 < r4) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        r1.remove();
        r2.f10208e.incrementAndGet();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, "asyncCall");
        r0.add(r2);
        r8.f17317e.add(r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r8 = this;
            byte[] r0 = ds.b.f7815a
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            monitor-enter(r8)
            java.util.ArrayDeque r1 = r8.f17316d     // Catch: java.lang.Throwable -> L4f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r2 = "readyAsyncCalls.iterator()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> L4f
        L13:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L4f
            if (r2 == 0) goto L57
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L4f
            gs.f r2 = (gs.f) r2     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r3 = r8.f17317e     // Catch: java.lang.Throwable -> L4f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L4f
            int r4 = r8.f17313a     // Catch: java.lang.Throwable -> L54
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4f
            if (r3 < r4) goto L2c
            goto L57
        L2c:
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f10208e     // Catch: java.lang.Throwable -> L4f
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L4f
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L4f
            int r4 = r8.f17314b     // Catch: java.lang.Throwable -> L51
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4f
            if (r3 < r4) goto L39
            goto L13
        L39:
            r1.remove()     // Catch: java.lang.Throwable -> L4f
            java.util.concurrent.atomic.AtomicInteger r3 = r2.f10208e     // Catch: java.lang.Throwable -> L4f
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L4f
            java.lang.String r3 = "asyncCall"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.Throwable -> L4f
            r0.add(r2)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r3 = r8.f17317e     // Catch: java.lang.Throwable -> L4f
            r3.add(r2)     // Catch: java.lang.Throwable -> L4f
            goto L13
        L4f:
            r0 = move-exception
            goto Lb4
        L51:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L51
            throw r0     // Catch: java.lang.Throwable -> L4f
        L54:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L4f
        L57:
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L4f
            java.util.ArrayDeque r1 = r8.f17317e     // Catch: java.lang.Throwable -> Lb1
            r1.size()     // Catch: java.lang.Throwable -> Lb1
            java.util.ArrayDeque r1 = r8.f17318f     // Catch: java.lang.Throwable -> Lb1
            r1.size()     // Catch: java.lang.Throwable -> Lb1
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L4f
            kotlin.Unit r1 = kotlin.Unit.f14616a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r8)
            int r1 = r0.size()
            r2 = 0
        L6b:
            if (r2 >= r1) goto Lb0
            int r3 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            gs.f r2 = (gs.f) r2
            java.util.concurrent.ExecutorService r4 = r8.b()
            r2.getClass()
            java.lang.String r5 = "executorService"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            gs.i r5 = r2.f10209i
            byte[] r6 = ds.b.f7815a
            java.util.concurrent.ThreadPoolExecutor r4 = (java.util.concurrent.ThreadPoolExecutor) r4     // Catch: java.util.concurrent.RejectedExecutionException -> L8b java.lang.Throwable -> La7
            r4.execute(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L8b java.lang.Throwable -> La7
            goto La5
        L8b:
            r4 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> La7
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> La7
            r6.initCause(r4)     // Catch: java.lang.Throwable -> La7
            r5.j(r6)     // Catch: java.lang.Throwable -> La7
            cs.h r4 = r2.f10207d     // Catch: java.lang.Throwable -> La7
            r4.onFailure(r5, r6)     // Catch: java.lang.Throwable -> La7
            okhttp3.OkHttpClient r4 = r5.f10212d
            okhttp3.Dispatcher r4 = r4.f17337d
            r4.d(r2)
        La5:
            r2 = r3
            goto L6b
        La7:
            r0 = move-exception
            okhttp3.OkHttpClient r1 = r5.f10212d
            okhttp3.Dispatcher r1 = r1.f17337d
            r1.d(r2)
            throw r0
        Lb0:
            return
        Lb1:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lb1
            throw r0     // Catch: java.lang.Throwable -> L4f
        Lb4:
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Dispatcher.e():void");
    }
}
