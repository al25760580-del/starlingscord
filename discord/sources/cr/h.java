package cr;

import ar.a2;
import ar.b0;
import ar.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.d0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: loaded from: classes3.dex */
public class h implements Channel {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7363d;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7357e = AtomicLongFieldUpdater.newUpdater(h.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7358i = AtomicLongFieldUpdater.newUpdater(h.class, "receivers$volatile");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7359v = AtomicLongFieldUpdater.newUpdater(h.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f7360w = AtomicLongFieldUpdater.newUpdater(h.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7361x = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7362y = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater F = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "closeHandler$volatile");

    public h(int i7) {
        this.f7363d = i7;
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        o oVar = j.f7365a;
        this.bufferEnd$volatile = i7 != 0 ? i7 != Integer.MAX_VALUE ? i7 : LongCompanionObject.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f7359v.get(this);
        o oVar2 = new o(0L, null, this, 3);
        this.sendSegment$volatile = oVar2;
        this.receiveSegment$volatile = oVar2;
        if (B()) {
            oVar2 = j.f7365a;
            Intrinsics.checkNotNull(oVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = oVar2;
        this._closeCause$volatile = j.f7381s;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object E(h hVar, xn.c cVar) {
        f fVar;
        o oVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i7 = fVar.f7353i;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                fVar.f7353i = i7 - Integer.MIN_VALUE;
            } else {
                fVar = new f(hVar, cVar);
            }
        } else {
            fVar = new f(hVar, cVar);
        }
        f fVar2 = fVar;
        Object obj = fVar2.f7351d;
        wn.a aVar = wn.a.f22354d;
        int i10 = fVar2.f7353i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            return ((n) obj).f7386a;
        }
        ib.a.L(obj);
        o oVar2 = (o) f7362y.get(hVar);
        while (!hVar.z()) {
            long andIncrement = f7358i.getAndIncrement(hVar);
            long j = j.f7366b;
            long j5 = andIncrement / j;
            int i11 = (int) (andIncrement % j);
            if (oVar2.f9398i != j5) {
                o oVarS = hVar.s(j5, oVar2);
                if (oVarS == null) {
                    continue;
                } else {
                    oVar = oVarS;
                }
            } else {
                oVar = oVar2;
            }
            h hVar2 = hVar;
            Object objJ = hVar2.J(oVar, i11, andIncrement, null);
            if (objJ == j.f7375m) {
                throw new IllegalStateException("unexpected");
            }
            if (objJ != j.f7377o) {
                if (objJ != j.f7376n) {
                    oVar.b();
                    return objJ;
                }
                fVar2.f7353i = 1;
                Object objF = hVar2.F(oVar, i11, andIncrement, fVar2);
                return objF == aVar ? aVar : objF;
            }
            if (andIncrement < hVar2.w()) {
                oVar.b();
            }
            hVar = hVar2;
            oVar2 = oVar;
        }
        return new l(hVar.t());
    }

    public static final o c(h hVar, long j, o oVar) {
        Object objA;
        h hVar2;
        o oVar2 = j.f7365a;
        i iVar = i.f7364d;
        loop0: while (true) {
            objA = fr.b.a(oVar, j, iVar);
            if (!fr.h.d(objA)) {
                fr.u uVarB = fr.h.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7361x;
                    fr.u uVar = (fr.u) atomicReferenceFieldUpdater.get(hVar);
                    if (uVar.f9398i >= uVarB.f9398i) {
                        break loop0;
                    }
                    if (!uVarB.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, uVar, uVarB)) {
                            if (!uVar.f()) {
                                break loop0;
                            }
                            uVar.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == uVar);
                    if (uVarB.f()) {
                        uVarB.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zD = fr.h.d(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7358i;
        if (zD) {
            hVar.r();
            if (oVar.f9398i * ((long) j.f7366b) < atomicLongFieldUpdater.get(hVar)) {
                oVar.b();
                return null;
            }
        } else {
            o oVar3 = (o) fr.h.b(objA);
            long j5 = oVar3.f9398i;
            if (j5 <= j) {
                return oVar3;
            }
            long j7 = ((long) j.f7366b) * j5;
            while (true) {
                long j10 = f7357e.get(hVar);
                long j11 = 1152921504606846975L & j10;
                if (j11 >= j7) {
                    hVar2 = hVar;
                    break;
                }
                hVar2 = hVar;
                if (f7357e.compareAndSet(hVar2, j10, (((long) ((int) (j10 >> 60))) << 60) + j11)) {
                    break;
                }
                hVar = hVar2;
            }
            if (j5 * ((long) j.f7366b) < atomicLongFieldUpdater.get(hVar2)) {
                oVar3.b();
            }
        }
        return null;
    }

    public static final void e(h hVar, Object obj, ar.k kVar) {
        Throwable thV = hVar.v();
        rn.q qVar = Result.f14614e;
        kVar.resumeWith(ib.a.o(thV));
    }

    public static final int i(h hVar, o oVar, int i7, Object obj, long j, Object obj2, boolean z5) {
        oVar.n(i7, obj);
        if (z5) {
            return hVar.K(oVar, i7, obj, j, obj2, z5);
        }
        Object objL = oVar.l(i7);
        if (objL == null) {
            if (hVar.k(j)) {
                if (oVar.k(i7, null, j.f7368d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (oVar.k(i7, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof a2) {
            oVar.n(i7, null);
            if (hVar.H(objL, obj)) {
                oVar.o(i7, j.f7373i);
                return 0;
            }
            a5.h hVar2 = j.k;
            if (oVar.f7388x.getAndSet((i7 * 2) + 1, hVar2) == hVar2) {
                return 5;
            }
            oVar.m(i7, true);
            return 5;
        }
        return hVar.K(oVar, i7, obj, j, obj2, z5);
    }

    public static void x(h hVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7360w;
        if ((atomicLongFieldUpdater.addAndGet(hVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(hVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public boolean A() {
        return false;
    }

    public final boolean B() {
        long j = f7359v.get(this);
        return j == 0 || j == LongCompanionObject.MAX_VALUE;
    }

    public final void C(long j, o oVar) {
        o oVar2;
        o oVar3;
        while (oVar.f9398i < j && (oVar3 = (o) oVar.c()) != null) {
            oVar = oVar3;
        }
        while (true) {
            if (!oVar.d() || (oVar2 = (o) oVar.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
                    fr.u uVar = (fr.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f9398i >= oVar.f9398i) {
                        return;
                    }
                    if (!oVar.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, oVar)) {
                            if (uVar.f()) {
                                uVar.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == uVar);
                    if (oVar.f()) {
                        oVar.e();
                    }
                }
            } else {
                oVar = oVar2;
            }
        }
    }

    public final Object D(Object obj, Continuation frame) {
        ar.k kVar = new ar.k(1, wn.f.b(frame));
        kVar.t();
        Throwable thV = v();
        rn.q qVar = Result.f14614e;
        kVar.resumeWith(ib.a.o(thV));
        Object objR = kVar.r();
        wn.a aVar = wn.a.f22354d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.f14616a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object F(o oVar, int i7, long j, xn.c cVar) throws g0 {
        g frame;
        n nVar;
        o oVarS;
        if (cVar instanceof g) {
            frame = (g) cVar;
            int i10 = frame.f7356i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                frame.f7356i = i10 - Integer.MIN_VALUE;
            } else {
                frame = new g(this, cVar);
            }
        } else {
            frame = new g(this, cVar);
        }
        Object objR = frame.f7354d;
        wn.a aVar = wn.a.f22354d;
        int i11 = frame.f7356i;
        if (i11 == 0) {
            ib.a.L(objR);
            frame.f7356i = 1;
            ar.k kVarP = b0.p(wn.f.b(frame));
            try {
                Intrinsics.checkNotNull(kVarP, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuationImpl<kotlinx.coroutines.channels.ChannelResult<E of kotlinx.coroutines.channels.BufferedChannel>>");
                u uVar = new u(kVarP);
                Object objJ = J(oVar, i7, j, uVar);
                if (objJ != j.f7375m) {
                    if (objJ == j.f7377o) {
                        if (j < w()) {
                            oVar.b();
                        }
                        o oVar2 = (o) f7362y.get(this);
                        while (true) {
                            if (z()) {
                                rn.q qVar = Result.f14614e;
                                kVarP.resumeWith(new n(new l(t())));
                                break;
                            }
                            long andIncrement = f7358i.getAndIncrement(this);
                            long j5 = j.f7366b;
                            long j7 = andIncrement / j5;
                            int i12 = (int) (andIncrement % j5);
                            if (oVar2.f9398i != j7) {
                                oVarS = s(j7, oVar2);
                                if (oVarS == null) {
                                }
                            } else {
                                oVarS = oVar2;
                            }
                            Object objJ2 = J(oVarS, i12, andIncrement, uVar);
                            if (objJ2 == j.f7375m) {
                                uVar.b(oVarS, i12);
                                break;
                            }
                            if (objJ2 == j.f7377o) {
                                if (andIncrement < w()) {
                                    oVarS.b();
                                }
                                oVar2 = oVarS;
                            } else {
                                if (objJ2 == j.f7376n) {
                                    throw new IllegalStateException("unexpected");
                                }
                                oVarS.b();
                                nVar = new n(objJ2);
                            }
                        }
                    } else {
                        oVar.b();
                        nVar = new n(objJ);
                    }
                    kVarP.k(nVar, null);
                    break;
                }
                uVar.b(oVar, i7);
                objR = kVarP.r();
                if (objR == wn.a.f22354d) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objR == aVar) {
                    return aVar;
                }
            } catch (Throwable th2) {
                kVarP.A();
                throw th2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(objR);
        }
        return ((n) objR).f7386a;
    }

    public final void G(a2 a2Var, boolean z5) {
        if (a2Var instanceof CancellableContinuation) {
            Continuation continuation = (Continuation) a2Var;
            rn.q qVar = Result.f14614e;
            continuation.resumeWith(ib.a.o(z5 ? u() : v()));
            return;
        }
        if (a2Var instanceof u) {
            ar.k kVar = ((u) a2Var).f7395d;
            rn.q qVar2 = Result.f14614e;
            kVar.resumeWith(new n(new l(t())));
            return;
        }
        if (!(a2Var instanceof c)) {
            if (a2Var instanceof ir.f) {
                ((ir.e) ((ir.f) a2Var)).g(this, j.f7374l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + a2Var).toString());
            }
        }
        c cVar = (c) a2Var;
        ar.k kVar2 = cVar.f7347e;
        Intrinsics.checkNotNull(kVar2);
        cVar.f7347e = null;
        cVar.f7346d = j.f7374l;
        Throwable thT = cVar.f7348i.t();
        if (thT == null) {
            rn.q qVar3 = Result.f14614e;
            kVar2.resumeWith(Boolean.FALSE);
        } else {
            rn.q qVar4 = Result.f14614e;
            kVar2.resumeWith(ib.a.o(thT));
        }
    }

    public final boolean H(Object obj, Object obj2) {
        if (obj instanceof ir.f) {
            return ((ir.e) ((ir.f) obj)).g(this, obj2) == 0;
        }
        if (obj instanceof u) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return j.a(((u) obj).f7395d, new n(obj2), null);
        }
        if (!(obj instanceof c)) {
            if (obj instanceof CancellableContinuation) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return j.a((CancellableContinuation) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        c cVar = (c) obj;
        ar.k kVar = cVar.f7347e;
        Intrinsics.checkNotNull(kVar);
        cVar.f7347e = null;
        cVar.f7346d = obj2;
        return j.a(kVar, Boolean.TRUE, null);
    }

    public final boolean I(Object obj, o oVar, int i7) {
        ir.i iVar;
        if (obj instanceof CancellableContinuation) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return j.a((CancellableContinuation) obj, Unit.f14616a, null);
        }
        if (!(obj instanceof ir.f)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iG = ((ir.e) obj).g(this, Unit.f14616a);
        if (iG == 0) {
            iVar = ir.i.f13430d;
        } else if (iG == 1) {
            iVar = ir.i.f13431e;
        } else if (iG == 2) {
            iVar = ir.i.f13432i;
        } else {
            if (iG != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iG).toString());
            }
            iVar = ir.i.f13433v;
        }
        if (iVar == ir.i.f13431e) {
            oVar.n(i7, null);
        }
        return iVar == ir.i.f13430d;
    }

    public final Object J(o oVar, int i7, long j, Object obj) {
        Object objL = oVar.l(i7);
        AtomicReferenceArray atomicReferenceArray = oVar.f7388x;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7357e;
        if (objL == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return j.f7376n;
                }
                if (oVar.k(i7, objL, obj)) {
                    q();
                    return j.f7375m;
                }
            }
        } else if (objL == j.f7368d && oVar.k(i7, objL, j.f7373i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i7 * 2);
            oVar.n(i7, null);
            return obj2;
        }
        while (true) {
            Object objL2 = oVar.l(i7);
            if (objL2 == null || objL2 == j.f7369e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (oVar.k(i7, objL2, j.f7372h)) {
                        q();
                        return j.f7377o;
                    }
                } else {
                    if (obj == null) {
                        return j.f7376n;
                    }
                    if (oVar.k(i7, objL2, obj)) {
                        q();
                        return j.f7375m;
                    }
                }
            } else if (objL2 != j.f7368d) {
                a5.h hVar = j.j;
                if (objL2 == hVar) {
                    return j.f7377o;
                }
                if (objL2 == j.f7372h) {
                    return j.f7377o;
                }
                if (objL2 == j.f7374l) {
                    q();
                    return j.f7377o;
                }
                if (objL2 != j.f7371g && oVar.k(i7, objL2, j.f7370f)) {
                    boolean z5 = objL2 instanceof x;
                    if (z5) {
                        objL2 = ((x) objL2).f7396a;
                    }
                    if (I(objL2, oVar, i7)) {
                        oVar.o(i7, j.f7373i);
                        q();
                        Object obj3 = atomicReferenceArray.get(i7 * 2);
                        oVar.n(i7, null);
                        return obj3;
                    }
                    oVar.o(i7, hVar);
                    oVar.i();
                    if (z5) {
                        q();
                    }
                    return j.f7377o;
                }
            } else if (oVar.k(i7, objL2, j.f7373i)) {
                q();
                Object obj4 = atomicReferenceArray.get(i7 * 2);
                oVar.n(i7, null);
                return obj4;
            }
        }
    }

    public final int K(o oVar, int i7, Object obj, long j, Object obj2, boolean z5) {
        while (true) {
            Object objL = oVar.l(i7);
            if (objL == null) {
                if (!k(j) || z5) {
                    if (z5) {
                        if (oVar.k(i7, null, j.j)) {
                            oVar.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (oVar.k(i7, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (oVar.k(i7, null, j.f7368d)) {
                    break;
                }
            } else {
                if (objL != j.f7369e) {
                    a5.h hVar = j.k;
                    if (objL == hVar) {
                        oVar.n(i7, null);
                        return 5;
                    }
                    if (objL == j.f7372h) {
                        oVar.n(i7, null);
                        return 5;
                    }
                    if (objL == j.f7374l) {
                        oVar.n(i7, null);
                        r();
                        return 4;
                    }
                    oVar.n(i7, null);
                    if (objL instanceof x) {
                        objL = ((x) objL).f7396a;
                    }
                    if (H(objL, obj)) {
                        oVar.o(i7, j.f7373i);
                        return 0;
                    }
                    if (oVar.f7388x.getAndSet((i7 * 2) + 1, hVar) != hVar) {
                        oVar.m(i7, true);
                    }
                    return 5;
                }
                if (oVar.k(i7, objL, j.f7368d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void L(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        h hVar = this;
        if (hVar.B()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f7359v;
            if (atomicLongFieldUpdater.get(hVar) > j) {
                break;
            } else {
                hVar = this;
            }
        }
        int i7 = j.f7367c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7360w;
            if (i10 < i7) {
                long j5 = atomicLongFieldUpdater.get(hVar);
                if (j5 == (4611686018427387903L & atomicLongFieldUpdater2.get(hVar)) && j5 == atomicLongFieldUpdater.get(hVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j7, (j7 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        hVar = this;
                    }
                }
                while (true) {
                    long j10 = atomicLongFieldUpdater.get(hVar);
                    long j11 = atomicLongFieldUpdater2.get(hVar);
                    long j12 = j11 & 4611686018427387903L;
                    boolean z5 = (j11 & 4611686018427387904L) != 0;
                    if (j10 == j12 && j10 == atomicLongFieldUpdater.get(hVar)) {
                        break;
                    }
                    if (z5) {
                        hVar = this;
                    } else {
                        hVar = this;
                        atomicLongFieldUpdater2.compareAndSet(hVar, j11, 4611686018427387904L + j12);
                    }
                }
                while (true) {
                    long j13 = atomicLongFieldUpdater2.get(hVar);
                    if (atomicLongFieldUpdater2.compareAndSet(hVar, j13, j13 & 4611686018427387903L)) {
                        return;
                    } else {
                        hVar = this;
                    }
                }
            }
        }
    }

    @Override // cr.w
    public final void a(com.margelo.nitro.playagerangedeclaration.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = G;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            a5.h hVar = j.f7379q;
            if (obj != hVar) {
                if (obj == j.f7380r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            a5.h hVar2 = j.f7380r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, hVar, hVar2)) {
                    cVar.invoke(t());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == hVar);
        }
    }

    @Override // cr.w
    public final boolean b(Throwable th2) {
        return l(th2, false);
    }

    @Override // cr.v
    public final void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        l(cancellationException, true);
    }

    @Override // cr.v
    public final Object g(xn.c cVar) {
        return E(this, cVar);
    }

    @Override // cr.v
    public final com.google.firebase.messaging.r h() {
        d dVar = d.f7349d;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(dVar, 3);
        e eVar = e.f7350d;
        Intrinsics.checkNotNull(eVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new com.google.firebase.messaging.r(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(eVar, 3), null);
    }

    @Override // cr.v
    public final Object j() {
        o oVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7358i;
        long j = atomicLongFieldUpdater.get(this);
        long j5 = f7357e.get(this);
        if (y(j5, true)) {
            return new l(t());
        }
        long j7 = j5 & 1152921504606846975L;
        m mVar = n.f7385b;
        if (j >= j7) {
            return mVar;
        }
        Object obj = j.k;
        o oVar2 = (o) f7362y.get(this);
        while (!z()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j10 = j.f7366b;
            long j11 = andIncrement / j10;
            int i7 = (int) (andIncrement % j10);
            if (oVar2.f9398i != j11) {
                o oVarS = s(j11, oVar2);
                if (oVarS == null) {
                    continue;
                } else {
                    oVar = oVarS;
                }
            } else {
                oVar = oVar2;
            }
            Object objJ = J(oVar, i7, andIncrement, obj);
            o oVar3 = oVar;
            if (objJ == j.f7375m) {
                a2 a2Var = obj instanceof a2 ? (a2) obj : null;
                if (a2Var != null) {
                    a2Var.b(oVar3, i7);
                }
                L(andIncrement);
                oVar3.i();
                return mVar;
            }
            if (objJ != j.f7377o) {
                if (objJ == j.f7376n) {
                    throw new IllegalStateException("unexpected");
                }
                oVar3.b();
                return objJ;
            }
            if (andIncrement < w()) {
                oVar3.b();
            }
            oVar2 = oVar3;
        }
        return new l(t());
    }

    public final boolean k(long j) {
        return j < f7359v.get(this) || j < f7358i.get(this) + ((long) this.f7363d);
    }

    public final boolean l(Throwable th2, boolean z5) {
        h hVar;
        boolean z6;
        long j;
        long j5;
        long j7;
        Object obj;
        long j10;
        long j11;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7357e;
        if (!z5) {
            hVar = this;
            break;
        }
        do {
            j11 = atomicLongFieldUpdater.get(this);
            if (((int) (j11 >> 60)) != 0) {
                hVar = this;
                break;
            }
            o oVar = j.f7365a;
            hVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(hVar, j11, (j11 & 1152921504606846975L) + (((long) 1) << 60)));
        a5.h hVar2 = j.f7381s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = F;
            if (atomicReferenceFieldUpdater.compareAndSet(this, hVar2, th2)) {
                z6 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != hVar2) {
                z6 = false;
                break;
            }
        }
        if (z5) {
            do {
                j10 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j10, (((long) 3) << 60) + (j10 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i7 = (int) (j >> 60);
                if (i7 == 0) {
                    j5 = j & 1152921504606846975L;
                    j7 = 2;
                } else {
                    if (i7 != 1) {
                        break;
                    }
                    j5 = j & 1152921504606846975L;
                    j7 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(hVar, j, (j7 << 60) + j5));
        }
        r();
        if (z6) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = G;
                obj = atomicReferenceFieldUpdater2.get(this);
                a5.h hVar3 = obj == null ? j.f7379q : j.f7380r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, hVar3)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                ((Function1) obj).invoke(t());
                return z6;
            }
        }
        return z6;
    }

    public final o m(long j) {
        Object objE;
        long j5;
        Object obj = E.get(this);
        o oVar = (o) f7361x.get(this);
        if (oVar.f9398i > ((o) obj).f9398i) {
            obj = oVar;
        }
        o oVar2 = (o) f7362y.get(this);
        if (oVar2.f9398i > ((o) obj).f9398i) {
            obj = oVar2;
        }
        fr.c cVar = (fr.c) obj;
        loop0: while (true) {
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fr.c.f9365d;
            Object obj2 = atomicReferenceFieldUpdater.get(cVar);
            objE = null;
            a5.h hVar = fr.b.f9364a;
            if (obj2 == hVar) {
                break;
            }
            fr.c cVar2 = (fr.c) obj2;
            if (cVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(cVar, null, hVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(cVar) == null);
            } else {
                cVar = cVar2;
            }
        }
        o oVar3 = (o) cVar;
        if (A()) {
            o oVar4 = oVar3;
            loop2: while (true) {
                int i7 = j.f7366b - 1;
                while (true) {
                    if (-1 < i7) {
                        j5 = (oVar4.f9398i * ((long) j.f7366b)) + ((long) i7);
                        if (j5 >= f7358i.get(this)) {
                            while (true) {
                                Object objL = oVar4.l(i7);
                                if (objL != null && objL != j.f7369e) {
                                    if (objL != j.f7368d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (oVar4.k(i7, objL, j.f7374l)) {
                                    oVar4.i();
                                    break;
                                }
                            }
                            i7--;
                        }
                    } else {
                        oVar4 = (o) ((fr.c) fr.c.f9366e.get(oVar4));
                        if (oVar4 == null) {
                        }
                    }
                    j5 = -1;
                    break;
                }
            }
            if (j5 != -1) {
                n(j5);
            }
        }
        loop5: for (o oVar5 = oVar3; oVar5 != null; oVar5 = (o) ((fr.c) fr.c.f9366e.get(oVar5))) {
            for (int i10 = j.f7366b - 1; -1 < i10; i10--) {
                if ((oVar5.f9398i * ((long) j.f7366b)) + ((long) i10) < j) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = oVar5.l(i10);
                    if (objL2 != null && objL2 != j.f7369e) {
                        if (!(objL2 instanceof x)) {
                            if (!(objL2 instanceof a2)) {
                                break;
                            }
                            if (oVar5.k(i10, objL2, j.f7374l)) {
                                objE = fr.h.e(objE, objL2);
                                oVar5.m(i10, true);
                                break;
                            }
                        } else {
                            if (oVar5.k(i10, objL2, j.f7374l)) {
                                objE = fr.h.e(objE, ((x) objL2).f7396a);
                                oVar5.m(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (oVar5.k(i10, objL2, j.f7374l)) {
                            oVar5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objE != null) {
            if (!(objE instanceof ArrayList)) {
                G((a2) objE, true);
                return oVar3;
            }
            Intrinsics.checkNotNull(objE, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
            ArrayList arrayList = (ArrayList) objE;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                G((a2) arrayList.get(size), true);
            }
        }
        return oVar3;
    }

    public final void n(long j) {
        o oVar = (o) f7362y.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7358i;
            long j5 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.f7363d) + j5, f7359v.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j5, 1 + j5)) {
                long j7 = j.f7366b;
                long j10 = j5 / j7;
                int i7 = (int) (j5 % j7);
                if (oVar.f9398i != j10) {
                    o oVarS = s(j10, oVar);
                    if (oVarS != null) {
                        oVar = oVarS;
                    }
                }
                o oVar2 = oVar;
                if (J(oVar2, i7, j5, null) != j.f7377o || j5 < w()) {
                    oVar2.b();
                }
                oVar = oVar2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x009b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x007c A[SYNTHETIC] */
    @Override // cr.w
    public Object o(Object obj) {
        int i7;
        a2 a2Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f7357e;
        long j = atomicLongFieldUpdater.get(this);
        boolean z5 = false;
        long j5 = 1152921504606846975L;
        boolean z6 = y(j, false) ? false : !k(j & 1152921504606846975L);
        m mVar = n.f7385b;
        if (z6) {
            return mVar;
        }
        Object obj2 = j.j;
        o oVar = (o) f7361x.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j7 = andIncrement & j5;
            boolean zY = y(andIncrement, z5);
            int i10 = j.f7366b;
            long j10 = i10;
            long j11 = j7 / j10;
            int i11 = (int) (j7 % j10);
            if (oVar.f9398i == j11) {
                i7 = i(this, oVar, i11, obj, j7, obj2, zY);
                if (i7 != 0) {
                    oVar.b();
                    return Unit.f14616a;
                }
                if (i7 != 1) {
                    return Unit.f14616a;
                }
                if (i7 != 2) {
                    if (zY) {
                        oVar.i();
                        return new l(v());
                    }
                    if (obj2 instanceof a2) {
                        a2Var = (a2) obj2;
                    } else {
                        a2Var = null;
                    }
                    if (a2Var != null) {
                        a2Var.b(oVar, i11 + i10);
                    }
                    oVar.i();
                    return mVar;
                }
                if (i7 != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (i7 != 4) {
                    if (j7 < f7358i.get(this)) {
                        oVar.b();
                    }
                    return new l(v());
                }
                if (i7 == 5) {
                    oVar.b();
                }
                z5 = false;
            } else {
                o oVarC = c(this, j11, oVar);
                if (oVarC != null) {
                    oVar = oVarC;
                    i7 = i(this, oVar, i11, obj, j7, obj2, zY);
                    if (i7 != 0) {
                        oVar.b();
                        return Unit.f14616a;
                    }
                    if (i7 != 1) {
                        return Unit.f14616a;
                    }
                    if (i7 != 2) {
                        if (zY) {
                            oVar.i();
                            return new l(v());
                        }
                        if (obj2 instanceof a2) {
                            a2Var = (a2) obj2;
                        } else {
                            a2Var = null;
                        }
                        if (a2Var != null) {
                            a2Var.b(oVar, i11 + i10);
                        }
                        oVar.i();
                        return mVar;
                    }
                    if (i7 != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (i7 != 4) {
                        if (j7 < f7358i.get(this)) {
                            oVar.b();
                        }
                        return new l(v());
                    }
                    if (i7 == 5) {
                        oVar.b();
                    }
                    z5 = false;
                } else {
                    if (zY) {
                        return new l(v());
                    }
                    z5 = false;
                }
            }
            j5 = 1152921504606846975L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:93:0x016e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0178  */
    /* JADX WARN: Code duplicated, block: B:98:0x017c A[RETURN] */
    @Override // cr.w
    public Object p(Object obj, Continuation frame) throws Throwable {
        Object objR;
        wn.a aVar;
        Object obj2;
        h hVar;
        o oVar;
        boolean z5;
        h hVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7361x;
        o oVar2 = (o) atomicReferenceFieldUpdater.get(hVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7357e;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(hVar2);
            long j = andIncrement & 1152921504606846975L;
            boolean zY = hVar2.y(andIncrement, false);
            int i7 = j.f7366b;
            long j5 = i7;
            long j7 = j / j5;
            int i10 = (int) (j % j5);
            if (oVar2.f9398i != j7) {
                o oVarC = c(hVar2, j7, oVar2);
                if (oVarC != null) {
                    oVar2 = oVarC;
                } else if (zY) {
                    Object objD = D(obj, frame);
                    if (objD != wn.a.f22354d) {
                        break;
                    }
                    return objD;
                }
            }
            int i11 = i(hVar2, oVar2, i10, obj, j, null, zY);
            if (i11 == 0) {
                oVar2.b();
            } else {
                if (i11 == 1) {
                    break;
                }
                if (i11 != 2) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7358i;
                    if (i11 == 3) {
                        ar.k kVarP = b0.p(wn.f.b(frame));
                        Object obj3 = obj;
                        try {
                            int i12 = i(hVar2, oVar2, i10, obj3, j, kVarP, false);
                            try {
                                if (i12 == 0) {
                                    oVar2.b();
                                    rn.q qVar = Result.f14614e;
                                } else if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 4) {
                                            String str = "unexpected";
                                            if (i12 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            oVar2.b();
                                            o oVar3 = (o) atomicReferenceFieldUpdater.get(hVar2);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(hVar2);
                                                long j10 = andIncrement2 & 1152921504606846975L;
                                                boolean zY2 = hVar2.y(andIncrement2, false);
                                                int i13 = j.f7366b;
                                                atomicLongFieldUpdater = atomicLongFieldUpdater;
                                                long j11 = i13;
                                                str = str;
                                                long j12 = j10 / j11;
                                                int i14 = (int) (j10 % j11);
                                                if (oVar3.f9398i != j12) {
                                                    o oVarC2 = c(hVar2, j12, oVar3);
                                                    if (oVarC2 != null) {
                                                        z5 = zY2;
                                                        oVar = oVarC2;
                                                    } else if (zY2) {
                                                        e(hVar2, obj3, kVarP);
                                                    }
                                                } else {
                                                    oVar = oVar3;
                                                    z5 = zY2;
                                                }
                                                int i15 = i(hVar2, oVar, i14, obj3, j10, kVarP, z5);
                                                Object obj4 = obj3;
                                                hVar = hVar2;
                                                o oVar4 = oVar;
                                                obj2 = obj4;
                                                if (i15 == 0) {
                                                    oVar4.b();
                                                    rn.q qVar2 = Result.f14614e;
                                                } else if (i15 == 1) {
                                                    rn.q qVar3 = Result.f14614e;
                                                } else if (i15 != 2) {
                                                    if (i15 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (i15 != 4) {
                                                        if (i15 == 5) {
                                                            oVar4.b();
                                                        }
                                                        oVar3 = oVar4;
                                                        hVar2 = hVar;
                                                        obj3 = obj2;
                                                    } else if (j10 < atomicLongFieldUpdater2.get(hVar)) {
                                                        oVar4.b();
                                                    }
                                                } else if (z5) {
                                                    oVar4.i();
                                                } else {
                                                    kVarP.b(oVar4, i14 + i13);
                                                }
                                            }
                                            kVarP.A();
                                            throw th;
                                        }
                                        obj2 = obj3;
                                        hVar = hVar2;
                                        if (j < atomicLongFieldUpdater2.get(hVar)) {
                                            oVar2.b();
                                        }
                                        e(hVar, obj2, kVarP);
                                    } else {
                                        kVarP.b(oVar2, i10 + i7);
                                    }
                                    objR = kVarP.r();
                                    aVar = wn.a.f22354d;
                                    if (objR == aVar) {
                                        Intrinsics.checkNotNullParameter(frame, "frame");
                                    }
                                    if (objR != aVar) {
                                        objR = Unit.f14616a;
                                    }
                                    if (objR == aVar) {
                                        return objR;
                                    }
                                } else {
                                    rn.q qVar4 = Result.f14614e;
                                }
                                kVarP.resumeWith(Unit.f14616a);
                                objR = kVarP.r();
                                aVar = wn.a.f22354d;
                                if (objR == aVar) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                if (objR != aVar) {
                                    objR = Unit.f14616a;
                                }
                                if (objR == aVar) {
                                    return objR;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } else {
                        if (i11 == 4) {
                            if (j < atomicLongFieldUpdater2.get(hVar2)) {
                                oVar2.b();
                            }
                            Object objD2 = D(obj, frame);
                            if (objD2 != wn.a.f22354d) {
                                break;
                            }
                            return objD2;
                        }
                        if (i11 == 5) {
                            oVar2.b();
                        }
                    }
                } else if (zY) {
                    oVar2.i();
                    Object objD3 = D(obj, frame);
                    if (objD3 == wn.a.f22354d) {
                        return objD3;
                    }
                }
            }
            return Unit.f14616a;
        }
        return Unit.f14616a;
    }

    public final void q() {
        Object objA;
        if (B()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f7359v.getAndIncrement(this);
            long j = andIncrement / ((long) j.f7366b);
            if (w() <= andIncrement) {
                if (oVar.f9398i < j && oVar.c() != null) {
                    C(j, oVar);
                }
                x(this);
                return;
            }
            if (oVar.f9398i != j) {
                i iVar = i.f7364d;
                while (true) {
                    objA = fr.b.a(oVar, j, iVar);
                    if (!fr.h.d(objA)) {
                        fr.u uVarB = fr.h.b(objA);
                        while (true) {
                            fr.u uVar = (fr.u) atomicReferenceFieldUpdater.get(this);
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
                o oVar2 = null;
                if (fr.h.d(objA)) {
                    r();
                    C(j, oVar);
                    x(this);
                } else {
                    o oVar3 = (o) fr.h.b(objA);
                    long j5 = oVar3.f9398i;
                    if (j5 > j) {
                        long j7 = j.f7366b;
                        if (f7359v.compareAndSet(this, 1 + andIncrement, j5 * j7)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f7360w;
                            if ((atomicLongFieldUpdater.addAndGet(this, (j5 * j7) - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            x(this);
                        }
                    } else {
                        oVar2 = oVar3;
                    }
                }
                if (oVar2 == null) {
                    continue;
                } else {
                    oVar = oVar2;
                }
            }
            int i7 = (int) (andIncrement % ((long) j.f7366b));
            Object objL = oVar.l(i7);
            boolean z5 = objL instanceof a2;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f7358i;
            if (!z5 || andIncrement < atomicLongFieldUpdater2.get(this) || !oVar.k(i7, objL, j.f7371g)) {
                while (true) {
                    Object objL2 = oVar.l(i7);
                    if (objL2 instanceof a2) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (oVar.k(i7, objL2, new x((a2) objL2))) {
                                x(this);
                                return;
                            }
                        } else if (oVar.k(i7, objL2, j.f7371g)) {
                            if (!I(objL2, oVar, i7)) {
                                oVar.o(i7, j.j);
                                oVar.i();
                                break;
                            } else {
                                oVar.o(i7, j.f7368d);
                                x(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == j.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (oVar.k(i7, objL2, j.f7369e)) {
                                x(this);
                                return;
                            }
                        } else if (objL2 == j.f7368d || objL2 == j.f7372h || objL2 == j.f7373i || objL2 == j.k || objL2 == j.f7374l) {
                            x(this);
                            return;
                        } else if (objL2 != j.f7370f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                x(this);
            } else if (I(objL, oVar, i7)) {
                oVar.o(i7, j.f7368d);
                x(this);
                return;
            } else {
                oVar.o(i7, j.j);
                oVar.i();
                x(this);
            }
        }
    }

    @Override // cr.w
    public final boolean r() {
        return y(f7357e.get(this), false);
    }

    public final o s(long j, o oVar) {
        Object objA;
        long j5;
        o oVar2 = j.f7365a;
        i iVar = i.f7364d;
        loop0: while (true) {
            objA = fr.b.a(oVar, j, iVar);
            if (!fr.h.d(objA)) {
                fr.u uVarB = fr.h.b(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7362y;
                    fr.u uVar = (fr.u) atomicReferenceFieldUpdater.get(this);
                    if (uVar.f9398i >= uVarB.f9398i) {
                        break loop0;
                    }
                    if (!uVarB.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, uVarB)) {
                            if (!uVar.f()) {
                                break loop0;
                            }
                            uVar.e();
                            break loop0;
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
        if (fr.h.d(objA)) {
            r();
            if (oVar.f9398i * ((long) j.f7366b) < w()) {
                oVar.b();
                return null;
            }
        } else {
            o oVar3 = (o) fr.h.b(objA);
            long j7 = oVar3.f9398i;
            if (!B() && j <= f7359v.get(this) / ((long) j.f7366b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = E;
                    fr.u uVar2 = (fr.u) atomicReferenceFieldUpdater2.get(this);
                    if (uVar2.f9398i >= j7 || !oVar3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, uVar2, oVar3)) {
                            if (!uVar2.f()) {
                                break loop3;
                            }
                            uVar2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == uVar2);
                    if (oVar3.f()) {
                        oVar3.e();
                    }
                }
            }
            if (j7 <= j) {
                return oVar3;
            }
            long j10 = j7 * ((long) j.f7366b);
            do {
                j5 = f7358i.get(this);
                if (j5 >= j10) {
                    break;
                }
            } while (!f7358i.compareAndSet(this, j5, j10));
            if (j7 * ((long) j.f7366b) < w()) {
                oVar3.b();
            }
        }
        return null;
    }

    public final Throwable t() {
        return (Throwable) F.get(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i7 = (int) (f7357e.get(this) >> 60);
        if (i7 == 2) {
            sb2.append("closed,");
        } else if (i7 == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f7363d + ',');
        sb2.append("data=[");
        int i10 = 0;
        boolean z5 = true;
        List listG = d0.g(f7362y.get(this), f7361x.get(this), E.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listG) {
            if (((o) obj) != j.f7365a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((o) next).f9398i;
            do {
                Object next2 = it.next();
                long j5 = ((o) next2).f9398i;
                if (j > j5) {
                    next = next2;
                    j = j5;
                }
            } while (it.hasNext());
        }
        o oVar = (o) next;
        long j7 = f7358i.get(this);
        long jW = w();
        loop2: while (true) {
            int i11 = j.f7366b;
            int i12 = i10;
            while (i12 < i11) {
                long j10 = (oVar.f9398i * ((long) j.f7366b)) + ((long) i12);
                if (j10 >= jW && j10 >= j7) {
                    break loop2;
                }
                Object objL = oVar.l(i12);
                boolean z6 = z5;
                Object obj2 = oVar.f7388x.get(i12 * 2);
                if (objL instanceof CancellableContinuation) {
                    string = (j10 >= j7 || j10 < jW) ? (j10 >= jW || j10 < j7) ? "cont" : "send" : "receive";
                } else if (objL instanceof ir.f) {
                    string = (j10 >= j7 || j10 < jW) ? (j10 >= jW || j10 < j7) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof u) {
                    string = "receiveCatching";
                } else if (objL instanceof x) {
                    string = "EB(" + objL + ')';
                } else if (Intrinsics.areEqual(objL, j.f7370f) || Intrinsics.areEqual(objL, j.f7371g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !Intrinsics.areEqual(objL, j.f7369e) && !Intrinsics.areEqual(objL, j.f7373i) && !Intrinsics.areEqual(objL, j.f7372h) && !Intrinsics.areEqual(objL, j.k) && !Intrinsics.areEqual(objL, j.j) && !Intrinsics.areEqual(objL, j.f7374l)) {
                        string = objL.toString();
                    }
                    i12++;
                    z5 = z6;
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
                i12++;
                z5 = z6;
            }
            boolean z7 = z5;
            oVar = (o) oVar.c();
            if (oVar == null) {
                break;
            }
            z5 = z7;
            i10 = 0;
        }
        if (kotlin.text.b0.z(sb2) == ',') {
            Intrinsics.checkNotNullExpressionValue(sb2.deleteCharAt(sb2.length() - 1), "deleteCharAt(...)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final Throwable u() {
        Throwable thT = t();
        return thT == null ? new p("Channel was closed") : thT;
    }

    public final Throwable v() {
        Throwable thT = t();
        return thT == null ? new q("Channel was closed") : thT;
    }

    public final long w() {
        return f7357e.get(this) & 1152921504606846975L;
    }

    public final boolean y(long j, boolean z5) {
        int i7 = (int) (j >> 60);
        if (i7 != 0 && i7 != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7358i;
            if (i7 == 2) {
                m(1152921504606846975L & j);
                if (z5) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7362y;
                        o oVarS = (o) atomicReferenceFieldUpdater.get(this);
                        long j5 = atomicLongFieldUpdater.get(this);
                        if (w() <= j5) {
                            break;
                        }
                        long j7 = j.f7366b;
                        long j10 = j5 / j7;
                        if (oVarS.f9398i != j10 && (oVarS = s(j10, oVarS)) == null) {
                            if (((o) atomicReferenceFieldUpdater.get(this)).f9398i < j10) {
                                break;
                            }
                        } else {
                            oVarS.b();
                            int i10 = (int) (j5 % j7);
                            while (true) {
                                Object objL = oVarS.l(i10);
                                if (objL != null && objL != j.f7369e) {
                                    if (objL != j.f7368d && (objL == j.j || objL == j.f7374l || objL == j.f7373i || objL == j.f7372h || (objL != j.f7371g && (objL == j.f7370f || j5 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (oVarS.k(i10, objL, j.f7372h)) {
                                    q();
                                    break;
                                }
                            }
                            f7358i.compareAndSet(this, j5, j5 + 1);
                        }
                    }
                }
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException(kk.b.h(i7, "unexpected close status: ").toString());
                }
                o oVarM = m(1152921504606846975L & j);
                Object objE = null;
                loop0: do {
                    for (int i11 = j.f7366b - 1; -1 < i11; i11--) {
                        long j11 = (oVarM.f9398i * ((long) j.f7366b)) + ((long) i11);
                        while (true) {
                            Object objL2 = oVarM.l(i11);
                            if (objL2 == j.f7373i) {
                                break loop0;
                            }
                            if (objL2 != j.f7368d) {
                                if (objL2 != j.f7369e && objL2 != null) {
                                    if (!(objL2 instanceof a2) && !(objL2 instanceof x)) {
                                        a5.h hVar = j.f7371g;
                                        if (objL2 == hVar || objL2 == j.f7370f) {
                                            break loop0;
                                        }
                                        if (objL2 != hVar) {
                                            break;
                                        }
                                    } else {
                                        if (j11 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        a2 a2Var = objL2 instanceof x ? ((x) objL2).f7396a : (a2) objL2;
                                        if (oVarM.k(i11, objL2, j.f7374l)) {
                                            objE = fr.h.e(objE, a2Var);
                                            oVarM.n(i11, null);
                                            oVarM.i();
                                            break;
                                        }
                                    }
                                } else {
                                    if (oVarM.k(i11, objL2, j.f7374l)) {
                                        oVarM.i();
                                        break;
                                    }
                                }
                            } else {
                                if (j11 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (oVarM.k(i11, objL2, j.f7374l)) {
                                    oVarM.n(i11, null);
                                    oVarM.i();
                                    break;
                                }
                            }
                        }
                    }
                    oVarM = (o) ((fr.c) fr.c.f9366e.get(oVarM));
                } while (oVarM != null);
                if (objE != null) {
                    if (objE instanceof ArrayList) {
                        Intrinsics.checkNotNull(objE, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>");
                        ArrayList arrayList = (ArrayList) objE;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            G((a2) arrayList.get(size), false);
                        }
                    } else {
                        G((a2) objE, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean z() {
        return y(f7357e.get(this), true);
    }
}
