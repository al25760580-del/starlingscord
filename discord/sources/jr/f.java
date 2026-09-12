package jr;

import ar.g0;
import ar.j;
import fr.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14075b = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14076c = AtomicLongFieldUpdater.newUpdater(f.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14077d = AtomicReferenceFieldUpdater.newUpdater(f.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f14078e = AtomicLongFieldUpdater.newUpdater(f.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f14079f = AtomicIntegerFieldUpdater.newUpdater(f.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f14080a;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public f() {
        h hVar = new h(0L, null, 2);
        this.head$volatile = hVar;
        this.tail$volatile = hVar;
        this._availablePermits$volatile = 1;
        this.f14080a = new j(4, this);
    }

    public final void c(a aVar) throws g0 {
        Object objA;
        long j;
        h hVar;
        while (true) {
            int andDecrement = f14079f.getAndDecrement(this);
            if (andDecrement <= 1) {
                Function3 function3 = this.f14080a;
                if (andDecrement > 0) {
                    aVar.k(Unit.f14616a, function3);
                    return;
                }
                Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14077d;
                h hVar2 = (h) atomicReferenceFieldUpdater.get(this);
                long andIncrement = f14078e.getAndIncrement(this);
                d dVar = d.f14073d;
                long j5 = andIncrement / ((long) g.f14086f);
                while (true) {
                    objA = fr.b.a(hVar2, j5, dVar);
                    if (fr.h.d(objA)) {
                        j = andIncrement;
                        break;
                    }
                    u uVarB = fr.h.b(objA);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        hVar = hVar2;
                        j = andIncrement;
                        if (uVar.f9398i >= uVarB.f9398i) {
                            break;
                        }
                        if (!uVarB.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarB)) {
                                if (!uVar.f()) {
                                    break;
                                }
                                uVar.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == uVar);
                        if (uVarB.f()) {
                            uVarB.e();
                        }
                        hVar2 = hVar;
                        andIncrement = j;
                    }
                    hVar2 = hVar;
                    andIncrement = j;
                }
                h hVar3 = (h) fr.h.b(objA);
                AtomicReferenceArray atomicReferenceArray = hVar3.f14087w;
                int i7 = (int) (j % ((long) g.f14086f));
                do {
                    if (atomicReferenceArray.compareAndSet(i7, null, aVar)) {
                        aVar.b(hVar3, i7);
                        return;
                    }
                } while (atomicReferenceArray.get(i7) == null);
                a5.h hVar4 = g.f14082b;
                a5.h hVar5 = g.f14083c;
                do {
                    if (atomicReferenceArray.compareAndSet(i7, hVar4, hVar5)) {
                        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                        aVar.k(Unit.f14616a, function3);
                        return;
                    }
                } while (atomicReferenceArray.get(i7) == hVar4);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    public final void d() {
        boolean z5;
        int i7;
        Object objA;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f14079f;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            z5 = true;
            if (andIncrement >= 1) {
                do {
                    i7 = atomicIntegerFieldUpdater.get(this);
                    if (i7 <= 1) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i7, 1));
                throw new IllegalStateException("The number of released permits cannot be greater than 1".toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14075b;
            h hVar = (h) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f14076c.getAndIncrement(this);
            long j = andIncrement2 / ((long) g.f14086f);
            e eVar = e.f14074d;
            while (true) {
                objA = fr.b.a(hVar, j, eVar);
                if (!fr.h.d(objA)) {
                    u uVarB = fr.h.b(objA);
                    while (true) {
                        u uVar = (u) atomicReferenceFieldUpdater.get(this);
                        if (uVar.f9398i >= uVarB.f9398i) {
                            break;
                        }
                        if (!uVarB.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarB)) {
                                if (!uVar.f()) {
                                    break;
                                }
                                uVar.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == uVar);
                        if (uVarB.f()) {
                            uVarB.e();
                        }
                    }
                } else {
                    break;
                }
            }
            h hVar2 = (h) fr.h.b(objA);
            hVar2.b();
            AtomicReferenceArray atomicReferenceArray = hVar2.f14087w;
            boolean z6 = false;
            if (hVar2.f9398i <= j) {
                int i10 = (int) (andIncrement2 % ((long) g.f14086f));
                Object andSet = atomicReferenceArray.getAndSet(i10, g.f14082b);
                if (andSet == null) {
                    int i11 = g.f14081a;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            a5.h hVar3 = g.f14082b;
                            a5.h hVar4 = g.f14084d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i10, hVar3, hVar4)) {
                                    z6 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i10) == hVar3);
                            z5 = true ^ z6;
                            break;
                        }
                        if (atomicReferenceArray.get(i10) == g.f14083c) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                } else if (andSet == g.f14085e) {
                    z5 = false;
                } else if (andSet instanceof CancellableContinuation) {
                    Intrinsics.checkNotNull(andSet, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
                    CancellableContinuation cancellableContinuation = (CancellableContinuation) andSet;
                    a5.h hVarE = cancellableContinuation.e(Unit.f14616a, this.f14080a);
                    if (hVarE != null) {
                        cancellableContinuation.s(hVarE);
                    } else {
                        z5 = false;
                    }
                } else {
                    if (!(andSet instanceof ir.f)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    if (((ir.e) ((ir.f) andSet)).g(this, Unit.f14616a) != 0) {
                        z5 = false;
                    }
                }
            } else {
                z5 = false;
            }
        } while (!z5);
    }
}
