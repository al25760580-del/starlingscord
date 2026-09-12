package hr;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final /* synthetic */ c E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f11083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef f11084e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f11085i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f11086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f11087w;
    private volatile /* synthetic */ int workerCtl$volatile;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11089y;

    public a(c cVar, int i7) {
        this.E = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.f11083d = new m();
        this.f11084e = new Ref.ObjectRef();
        this.f11085i = b.f11093v;
        this.nextParkedWorker = c.H;
        int iNanoTime = (int) System.nanoTime();
        this.f11088x = iNanoTime == 0 ? 42 : iNanoTime;
        f(i7);
    }

    public final i a(boolean z5) {
        i iVarE;
        i iVarE2;
        long j;
        b bVar = this.f11085i;
        b bVar2 = b.f11090d;
        c cVar = this.E;
        i iVar = null;
        m mVar = this.f11083d;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.F;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f11118b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.f11109e) {
                            int i7 = m.f11120d.get(mVar);
                            int i10 = m.f11119c.get(mVar);
                            while (i7 != i10 && m.f11121e.get(mVar) != 0) {
                                i10--;
                                i iVarC = mVar.c(i10, true);
                                if (iVarC != null) {
                                    iVar = iVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                                iVar = iVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(mVar) == iVar2);
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.f11101x.d();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.F.compareAndSet(cVar, j, j - 4398046511104L));
            this.f11085i = b.f11090d;
        }
        if (z5) {
            boolean z6 = d(cVar.f11096d * 2) == 0;
            if (z6 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            i iVarB = (i) m.f11118b.getAndSet(mVar, null);
            if (iVarB == null) {
                iVarB = mVar.b();
            }
            if (iVarB != null) {
                return iVarB;
            }
            if (!z6 && (iVarE = e()) != null) {
                return iVarE;
            }
        } else {
            i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i7) {
        int i10 = this.f11088x;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f11088x = i13;
        int i14 = i7 - 1;
        return (i14 & i7) == 0 ? i13 & i14 : (i13 & Integer.MAX_VALUE) % i7;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.E;
        if (iD == 0) {
            i iVar = (i) cVar.f11100w.d();
            return iVar != null ? iVar : (i) cVar.f11101x.d();
        }
        i iVar2 = (i) cVar.f11101x.d();
        return iVar2 != null ? iVar2 : (i) cVar.f11100w.d();
    }

    public final void f(int i7) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.E.f11099v);
        sb2.append("-worker-");
        sb2.append(i7 == 0 ? "TERMINATED" : String.valueOf(i7));
        setName(sb2.toString());
        this.indexInArray = i7;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.f11085i;
        boolean z5 = bVar2 == b.f11090d;
        if (z5) {
            c.F.addAndGet(this.E, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.f11085i = bVar;
        }
        return z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [T, hr.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [hr.i] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [hr.i] */
    public final i i(int i7) {
        long j;
        T tC;
        long j5;
        long j7;
        T t5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.F;
        c cVar = this.E;
        int i10 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        Object obj = null;
        if (i10 < 2) {
            return null;
        }
        int iD = d(i10);
        int i11 = 0;
        long jMin = LongCompanionObject.MAX_VALUE;
        while (i11 < i10) {
            iD++;
            if (iD > i10) {
                iD = 1;
            }
            a aVar = (a) cVar.f11102y.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f11083d;
                if (i7 != 3) {
                    mVar.getClass();
                    int i12 = m.f11120d.get(mVar);
                    int i13 = m.f11119c.get(mVar);
                    boolean z5 = i7 == 1;
                    while (true) {
                        if (i12 != i13) {
                            j = 0;
                            if (!z5 || m.f11121e.get(mVar) != 0) {
                                int i14 = i12 + 1;
                                tC = mVar.c(i12, z5);
                                if (tC != 0) {
                                    break;
                                }
                                i12 = i14;
                            }
                        } else {
                            j = 0;
                        }
                        tC = obj;
                        break;
                    }
                } else {
                    tC = mVar.b();
                    j = 0;
                }
                Ref.ObjectRef objectRef = this.f11084e;
                if (tC == 0) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f11118b;
                        ?? r14 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (r14 == 0) {
                            j5 = -1;
                        } else {
                            j5 = -1;
                            if (((r14.f11109e ? 1 : 2) & i7) != 0) {
                                k.f11116f.getClass();
                                m mVar2 = mVar;
                                long jNanoTime = System.nanoTime() - r14.f11108d;
                                long j10 = k.f11112b;
                                if (jNanoTime < j10) {
                                    j7 = j10 - jNanoTime;
                                    t5 = 0;
                                    break;
                                }
                                do {
                                    t5 = 0;
                                    if (atomicReferenceFieldUpdater.compareAndSet(mVar2, r14, null)) {
                                        objectRef.element = r14;
                                        j7 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(mVar2) == r14);
                                mVar = mVar2;
                                obj = null;
                            }
                        }
                        j7 = -2;
                        t5 = obj;
                        break;
                    }
                } else {
                    objectRef.element = tC;
                    t5 = obj;
                    j7 = -1;
                    j5 = -1;
                }
                if (j7 == j5) {
                    i iVar = (i) objectRef.element;
                    objectRef.element = t5;
                    return iVar;
                }
                if (j7 > j) {
                    jMin = Math.min(jMin, j7);
                }
            }
            i11++;
            obj = null;
        }
        if (jMin == LongCompanionObject.MAX_VALUE) {
            jMin = 0;
        }
        this.f11087w = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z5 = false;
            while (true) {
                if (c.G.get(this.E) != 1) {
                    b bVar = this.f11085i;
                    b bVar2 = b.f11094w;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.f11089y);
                    if (iVarA != null) {
                        this.f11087w = 0L;
                        c cVar = this.E;
                        this.f11086v = 0L;
                        if (this.f11085i == b.f11092i) {
                            this.f11085i = b.f11091e;
                        }
                        if (!iVarA.f11109e) {
                            try {
                                iVarA.run();
                                break;
                            } catch (Throwable th2) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                                break;
                            }
                        }
                        if (h(b.f11091e) && !cVar.q() && !cVar.n(c.F.get(cVar))) {
                            cVar.q();
                        }
                        try {
                            iVarA.run();
                        } catch (Throwable th3) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th3);
                        }
                        c.F.addAndGet(cVar, -2097152L);
                        if (this.f11085i == bVar2) {
                            break;
                        }
                        this.f11085i = b.f11093v;
                        break;
                    }
                    this.f11089y = false;
                    if (this.f11087w == 0) {
                        Object obj = this.nextParkedWorker;
                        a5.h hVar = c.H;
                        if (obj != hVar) {
                            F.set(this, -1);
                            while (this.nextParkedWorker != c.H) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = F;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.E;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.G;
                                if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                    break;
                                }
                                b bVar3 = this.f11085i;
                                b bVar4 = b.f11094w;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                h(b.f11092i);
                                Thread.interrupted();
                                if (this.f11086v == 0) {
                                    j = 2097151;
                                    this.f11086v = System.nanoTime() + this.E.f11098i;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.E.f11098i);
                                if (System.nanoTime() - this.f11086v >= 0) {
                                    this.f11086v = 0L;
                                    c cVar3 = this.E;
                                    synchronized (cVar3.f11102y) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.F;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j)) > cVar3.f11096d) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i7 = this.indexInArray;
                                                        f(0);
                                                        cVar3.l(this, i7, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j);
                                                        if (andDecrement != i7) {
                                                            Object objB = cVar3.f11102y.b(andDecrement);
                                                            Intrinsics.checkNotNull(objB);
                                                            a aVar = (a) objB;
                                                            cVar3.f11102y.c(i7, aVar);
                                                            aVar.f(i7);
                                                            cVar3.l(aVar, andDecrement, i7);
                                                        }
                                                        cVar3.f11102y.c(andDecrement, null);
                                                        Unit unit = Unit.f14616a;
                                                        this.f11085i = bVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th4) {
                                            throw th4;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.E;
                            if (this.nextParkedWorker == hVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.E;
                                while (true) {
                                    long j5 = atomicLongFieldUpdater2.get(cVar4);
                                    int i10 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.f11102y.b((int) (j5 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.E.compareAndSet(cVar5, j5, ((j5 + 2097152) & (-2097152)) | ((long) i10))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z5) {
                            h(b.f11092i);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f11087w);
                            this.f11087w = 0L;
                            break;
                        }
                        z5 = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f11094w);
    }
}
