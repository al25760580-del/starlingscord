package hr;

import ar.b0;
import fr.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.Intrinsics;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater E = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater F = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final a5.h H = new a5.h("NOT_IN_STACK", 2);
    private volatile /* synthetic */ int _isTerminated$volatile;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11097e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f11098i;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f11099v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f f11100w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final f f11101x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s f11102y;

    public c(long j, String str, int i7, int i10) {
        this.f11096d = i7;
        this.f11097e = i10;
        this.f11098i = j;
        this.f11099v = str;
        if (i7 < 1) {
            throw new IllegalArgumentException(s0.g.d(i7, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i7) {
            throw new IllegalArgumentException(a3.e.g(i10, i7, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(s0.g.d(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(a3.e.h(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.f11100w = new f();
        this.f11101x = new f();
        this.f11102y = new s((i7 + 1) * 2);
        this.controlState$volatile = ((long) i7) << 42;
    }

    public static /* synthetic */ void i(c cVar, Runnable runnable, int i7) {
        cVar.f(runnable, false, (i7 & 4) == 0);
    }

    public final int c() {
        synchronized (this.f11102y) {
            try {
                if (G.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = F;
                long j = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j & 2097151);
                int i10 = i7 - ((int) ((j & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f11096d) {
                    return 0;
                }
                if (i7 >= this.f11097e) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f11102y.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.f11102y.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008a  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i7;
        i iVarA;
        if (G.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !Intrinsics.areEqual(aVar.E, this)) {
                aVar = null;
            }
            synchronized (this.f11102y) {
                i7 = (int) (F.get(this) & 2097151);
            }
            if (1 <= i7) {
                int i10 = 1;
                while (true) {
                    Object objB = this.f11102y.b(i10);
                    Intrinsics.checkNotNull(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.f11083d;
                        f fVar = this.f11101x;
                        mVar.getClass();
                        i iVar = (i) m.f11118b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            i iVarB = mVar.b();
                            if (iVarB == null) {
                                break;
                            } else {
                                fVar.a(iVarB);
                            }
                        }
                    }
                    if (i10 == i7) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f11101x.b();
            this.f11100w.b();
            while (true) {
                if (aVar != null) {
                    iVarA = aVar.a(true);
                    if (iVarA == null) {
                        iVarA = (i) this.f11100w.d();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (i) this.f11100w.d();
                    if (iVarA == null && (iVarA = (i) this.f11101x.d()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (Throwable th2) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                }
            }
            if (aVar != null) {
                aVar.h(b.f11094w);
            }
            E.set(this, 0L);
            F.set(this, 0L);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i(this, runnable, 6);
    }

    public final void f(Runnable runnable, boolean z5, boolean z6) {
        i jVar;
        b bVar;
        k.f11116f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f11108d = jNanoTime;
            jVar.f11109e = z5;
        } else {
            jVar = new j(runnable, jNanoTime, z5);
        }
        boolean z7 = jVar.f11109e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = F;
        long jAddAndGet = z7 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !Intrinsics.areEqual(aVar.E, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.f11085i) != b.f11094w && (jVar.f11109e || bVar != b.f11091e)) {
            aVar.f11089y = true;
            m mVar = aVar.f11083d;
            if (z6) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f11118b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f11109e ? this.f11101x.a(jVar) : this.f11100w.a(jVar))) {
                throw new RejectedExecutionException(com.discord.chat.presentation.list.a.k(new StringBuilder(), this.f11099v, " was terminated"));
            }
        }
        if (z7) {
            if (q() || n(jAddAndGet)) {
                return;
            }
            q();
            return;
        }
        if (q() || n(atomicLongFieldUpdater.get(this))) {
            return;
        }
        q();
    }

    public final void l(a aVar, int i7, int i10) {
        while (true) {
            long j = E.get(this);
            int i11 = (int) (2097151 & j);
            long j5 = (2097152 + j) & (-2097152);
            if (i11 == i7) {
                if (i10 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == H) {
                            i11 = -1;
                            break;
                        }
                        if (objC == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i11 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (E.compareAndSet(this, j, ((long) i11) | j5)) {
                    return;
                }
            }
        }
    }

    public final boolean n(long j) {
        int i7 = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i7 < 0) {
            i7 = 0;
        }
        int i10 = this.f11096d;
        if (i7 < i10) {
            int iC = c();
            if (iC == 1 && i10 > 1) {
                c();
            }
            if (iC > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean q() {
        a5.h hVar;
        int iB;
        while (true) {
            long j = E.get(this);
            a aVar = (a) this.f11102y.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
            } else {
                long j5 = (2097152 + j) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    hVar = H;
                    if (objC == hVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (E.compareAndSet(this, j, ((long) iB) | j5)) {
                        aVar.g(hVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.F.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        s sVar = this.f11102y;
        int iA = sVar.a();
        int i7 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            a aVar = (a) sVar.b(i14);
            if (aVar != null) {
                m mVar = aVar.f11083d;
                mVar.getClass();
                int i15 = m.f11118b.get(mVar) != null ? (m.f11119c.get(mVar) - m.f11120d.get(mVar)) + 1 : m.f11119c.get(mVar) - m.f11120d.get(mVar);
                int iOrdinal = aVar.f11085i.ordinal();
                if (iOrdinal == 0) {
                    i7++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iOrdinal == 2) {
                    i11++;
                } else if (iOrdinal == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new n();
                    }
                    i13++;
                }
            }
        }
        long j = F.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f11099v);
        sb5.append('@');
        sb5.append(b0.o(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f11096d;
        sb5.append(i16);
        sb5.append(", max = ");
        a3.e.z(sb5, this.f11097e, "}, Worker States {CPU = ", i7, ", blocking = ");
        a3.e.z(sb5, i10, ", parked = ", i11, ", dormant = ");
        a3.e.z(sb5, i12, ", terminated = ", i13, "}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.f11100w.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f11101x.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}
