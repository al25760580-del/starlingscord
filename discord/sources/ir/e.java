package ir;

import ar.a2;
import ar.g0;
import ar.k;
import fr.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.c0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements ar.i, f, a2 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f13418x = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f13419d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f13421i;
    private volatile /* synthetic */ Object state$volatile = h.f13425a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f13420e = new ArrayList(2);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13422v = -1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f13423w = h.f13428d;

    public e(CoroutineContext coroutineContext) {
        this.f13419d = coroutineContext;
    }

    @Override // ar.i
    public final void a(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13418x;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == h.f13426b) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, h.f13427c)) {
                    ArrayList arrayList = this.f13420e;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((c) it.next()).a();
                    }
                    this.f13423w = h.f13428d;
                    this.f13420e = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // ar.a2
    public final void b(u uVar, int i7) {
        this.f13421i = uVar;
        this.f13422v = i7;
    }

    public final Object c(xn.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13418x;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        c cVar2 = (c) obj;
        Object obj2 = this.f13423w;
        ArrayList<c> arrayList = this.f13420e;
        if (arrayList != null) {
            for (c cVar3 : arrayList) {
                if (cVar3 != cVar2) {
                    cVar3.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, h.f13426b);
            this.f13423w = h.f13428d;
            this.f13420e = null;
        }
        Object objInvoke = cVar2.f13407c.invoke(cVar2.f13405a, cVar2.f13408d, obj2);
        Continuation continuation = cVar2.f13409e;
        if (cVar2.f13408d == h.f13429e) {
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction0<R of kotlinx.coroutines.selects.SelectImplementation>");
            return ((Function1) continuation).invoke(cVar);
        }
        Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlin.coroutines.SuspendFunction1<kotlin.Any?, R of kotlinx.coroutines.selects.SelectImplementation>");
        return ((Function2) continuation).invoke(objInvoke, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(xn.c cVar) throws g0 {
        d frame;
        e eVar;
        if (cVar instanceof d) {
            frame = (d) cVar;
            int i7 = frame.f13417v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f13417v = i7 - Integer.MIN_VALUE;
            } else {
                frame = new d(this, cVar);
            }
        } else {
            frame = new d(this, cVar);
        }
        Object obj = frame.f13415e;
        wn.a aVar = wn.a.f22354d;
        int i10 = frame.f13417v;
        if (i10 == 0) {
            ib.a.L(obj);
            frame.f13414d = this;
            frame.f13417v = 1;
            k kVar = new k(1, wn.f.b(frame));
            kVar.t();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13418x;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                a5.h hVar = h.f13425a;
                if (obj2 == hVar) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, kVar)) {
                            kVar.w(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj2);
                } else {
                    if (!(obj2 instanceof List)) {
                        if (!(obj2 instanceof c)) {
                            throw new IllegalStateException(("unexpected state: " + obj2).toString());
                        }
                        Unit unit = Unit.f14616a;
                        c cVar2 = (c) obj2;
                        Object obj3 = this.f13423w;
                        Function3 function3 = cVar2.f13410f;
                        kVar.k(unit, function3 != null ? (Function3) function3.invoke(this, cVar2.f13408d, obj3) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, hVar)) {
                            Iterator it = ((Iterable) obj2).iterator();
                            while (it.hasNext()) {
                                c cVarE = e(it.next());
                                Intrinsics.checkNotNull(cVarE);
                                cVarE.f13411g = null;
                                cVarE.f13412h = -1;
                                f(cVarE, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj2);
                }
            }
            Object objR = kVar.r();
            wn.a aVar2 = wn.a.f22354d;
            if (objR == aVar2) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            if (objR != aVar2) {
                objR = Unit.f14616a;
            }
            if (objR != aVar) {
                eVar = this;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            return obj;
        }
        eVar = frame.f13414d;
        ib.a.L(obj);
        frame.f13414d = null;
        frame.f13417v = 2;
        Object objC = eVar.c(frame);
        return objC == aVar ? aVar : objC;
    }

    public final c e(Object obj) {
        ArrayList arrayList = this.f13420e;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((c) obj3).f13405a == obj) {
                obj2 = obj3;
                break;
            }
        }
        c cVar = (c) obj2;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void f(c cVar, boolean z5) {
        Object obj = cVar.f13405a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13418x;
        if (atomicReferenceFieldUpdater.get(this) instanceof c) {
            return;
        }
        if (!z5) {
            ArrayList arrayList = this.f13420e;
            Intrinsics.checkNotNull(arrayList);
            if (arrayList == null || !arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((c) it.next()).f13405a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        cVar.f13406b.invoke(obj, this, cVar.f13408d);
        if (this.f13423w != h.f13428d) {
            atomicReferenceFieldUpdater.set(this, cVar);
            return;
        }
        if (!z5) {
            ArrayList arrayList2 = this.f13420e;
            Intrinsics.checkNotNull(arrayList2);
            arrayList2.add(cVar);
        }
        cVar.f13411g = this.f13421i;
        cVar.f13412h = this.f13422v;
        this.f13421i = null;
        this.f13422v = -1;
    }

    public final int g(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13418x;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                if (Intrinsics.areEqual(obj3, h.f13426b) || (obj3 instanceof c)) {
                    return 3;
                }
                if (Intrinsics.areEqual(obj3, h.f13427c)) {
                    return 2;
                }
                if (Intrinsics.areEqual(obj3, h.f13425a)) {
                    List listC = c0.c(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listC)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListW = CollectionsKt.W((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListW)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            c cVarE = e(obj);
            if (cVarE != null) {
                Function3 function3 = cVarE.f13410f;
                Function3 function4 = function3 != null ? (Function3) function3.invoke(this, cVarE.f13408d, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, cVarE)) {
                        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj3;
                        this.f13423w = obj2;
                        a5.h hVarE = cancellableContinuation.e(Unit.f14616a, function4);
                        if (hVarE == null) {
                            this.f13423w = h.f13428d;
                            return 2;
                        }
                        cancellableContinuation.s(hVarE);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }
}
