package ar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public class i1 implements Job, o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2928d = AtomicReferenceFieldUpdater.newUpdater(i1.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2929e = AtomicReferenceFieldUpdater.newUpdater(i1.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public i1(boolean z5) {
        this._state$volatile = z5 ? b0.j : b0.f2894i;
    }

    public static o X(fr.m mVar) {
        while (mVar.h()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fr.m.f9383e;
            fr.m mVarE = mVar.e();
            if (mVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(mVar);
                while (true) {
                    mVar = (fr.m) obj;
                    if (!mVar.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mVar);
                }
            } else {
                mVar = mVarE;
            }
        }
        while (true) {
            mVar = mVar.g();
            if (!mVar.h()) {
                if (mVar instanceof o) {
                    return (o) mVar;
                }
                if (mVar instanceof k1) {
                    return null;
                }
            }
        }
    }

    public static String h0(Object obj) {
        if (!(obj instanceof g1)) {
            if (obj instanceof x0) {
                return ((x0) obj).c() ? "Active" : "New";
            }
            return obj instanceof r ? "Cancelled" : "Completed";
        }
        g1 g1Var = (g1) obj;
        if (g1Var.e()) {
            return "Cancelling";
        }
        return g1.f2915e.get(g1Var) == 1 ? "Completing" : "Active";
    }

    public void A(CancellationException cancellationException) {
        x(cancellationException);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.b(this, fVar);
    }

    public final boolean C(Throwable th2) {
        if (R()) {
            return true;
        }
        boolean z5 = th2 instanceof CancellationException;
        n nVar = (n) f2929e.get(this);
        if (nVar == null || nVar == m1.f2944d) {
            return z5;
        }
        return nVar.a(th2) || z5;
    }

    public String D() {
        return "Job was cancelled";
    }

    public boolean E(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return x(th2) && J();
    }

    public final void F(x0 x0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2929e;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        if (nVar != null) {
            nVar.dispose();
            atomicReferenceFieldUpdater.set(this, m1.f2944d);
        }
        androidx.datastore.preferences.protobuf.d1 d1Var = null;
        r rVar = obj instanceof r ? (r) obj : null;
        Throwable th2 = rVar != null ? rVar.f2958a : null;
        if (x0Var instanceof d1) {
            try {
                ((d1) x0Var).k(th2);
                return;
            } catch (Throwable th3) {
                N(new androidx.datastore.preferences.protobuf.d1("Exception in completion handler " + x0Var + " for " + this, th3));
                return;
            }
        }
        k1 k1VarD = x0Var.d();
        if (k1VarD != null) {
            k1VarD.b(new fr.j(1), 1);
            Object obj2 = fr.m.f9382d.get(k1VarD);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (fr.m mVarG = (fr.m) obj2; !Intrinsics.areEqual(mVarG, k1VarD); mVarG = mVarG.g()) {
                if (mVarG instanceof d1) {
                    try {
                        ((d1) mVarG).k(th2);
                    } catch (Throwable th4) {
                        if (d1Var != null) {
                            rn.f.a(d1Var, th4);
                        } else {
                            d1Var = new androidx.datastore.preferences.protobuf.d1("Exception in completion handler " + mVarG + " for " + this, th4);
                            Unit unit = Unit.f14616a;
                        }
                    }
                }
            }
            if (d1Var != null) {
                N(d1Var);
            }
        }
    }

    public final Throwable G(Object obj) {
        Throwable thB;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new a1(D(), null, this) : th2;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        i1 i1Var = (i1) ((o1) obj);
        i1Var.getClass();
        Object obj2 = f2928d.get(i1Var);
        if (obj2 instanceof g1) {
            thB = ((g1) obj2).b();
        } else if (obj2 instanceof r) {
            thB = ((r) obj2).f2958a;
        } else {
            if (obj2 instanceof x0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new a1("Parent job is ".concat(h0(obj2)), thB, i1Var) : cancellationException;
    }

    public final Object H(g1 g1Var, Object obj) {
        Throwable thI;
        r rVar = obj instanceof r ? (r) obj : null;
        Throwable th2 = rVar != null ? rVar.f2958a : null;
        synchronized (g1Var) {
            g1Var.e();
            ArrayList<Throwable> arrayListF = g1Var.f(th2);
            thI = I(g1Var, arrayListF);
            if (thI != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th3 : arrayListF) {
                    if (th3 != thI && th3 != thI && !(th3 instanceof CancellationException) && setNewSetFromMap.add(th3)) {
                        rn.f.a(thI, th3);
                    }
                }
            }
        }
        if (thI != null && thI != th2) {
            obj = new r(thI, false);
        }
        if (thI != null && (C(thI) || M(thI))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            r rVar2 = (r) obj;
            rVar2.getClass();
            r.f2957b.compareAndSet(rVar2, 0, 1);
        }
        b0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2928d;
        Object y0Var = obj instanceof x0 ? new y0((x0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, g1Var, y0Var) && atomicReferenceFieldUpdater.get(this) == g1Var) {
        }
        F(g1Var, obj);
        return obj;
    }

    public final Throwable I(g1 g1Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (g1Var.e()) {
                return new a1(D(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th2 = (Throwable) next;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof u1) {
            for (Object obj2 : arrayList) {
                Throwable th4 = (Throwable) obj2;
                if (th4 != th3 && (th4 instanceof u1)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    public boolean J() {
        return true;
    }

    public boolean K() {
        return this instanceof p;
    }

    public final k1 L(x0 x0Var) {
        k1 k1VarD = x0Var.d();
        if (k1VarD != null) {
            return k1VarD;
        }
        if (x0Var instanceof o0) {
            return new k1();
        }
        if (x0Var instanceof d1) {
            f0((d1) x0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + x0Var).toString());
    }

    public boolean M(Throwable th2) {
        return false;
    }

    @Override // kotlinx.coroutines.Job
    public final m0 O(Function1 function1) {
        return Q(true, new n0(1, function1));
    }

    public final void P(Job job) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2929e;
        m1 m1Var = m1.f2944d;
        if (job == null) {
            atomicReferenceFieldUpdater.set(this, m1Var);
            return;
        }
        job.start();
        n nVarY = job.y(this);
        atomicReferenceFieldUpdater.set(this, nVarY);
        if (isCompleted()) {
            nVarY.dispose();
            atomicReferenceFieldUpdater.set(this, m1Var);
        }
    }

    public final m0 Q(boolean z5, d1 d1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z6;
        boolean zB;
        d1Var.f2904v = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f2928d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z7 = obj instanceof o0;
            m1 m1Var = m1.f2944d;
            z6 = true;
            if (!z7) {
                if (!(obj instanceof x0)) {
                    z6 = false;
                    break;
                }
                x0 x0Var = (x0) obj;
                k1 k1VarD = x0Var.d();
                if (k1VarD == null) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    f0((d1) obj);
                } else {
                    if (d1Var.j()) {
                        g1 g1Var = x0Var instanceof g1 ? (g1) x0Var : null;
                        Throwable thB = g1Var != null ? g1Var.b() : null;
                        if (thB == null) {
                            zB = k1VarD.b(d1Var, 5);
                        } else if (z5) {
                            d1Var.k(thB);
                            return m1Var;
                        }
                    } else {
                        zB = k1VarD.b(d1Var, 1);
                    }
                    if (zB) {
                        break;
                    }
                }
            } else {
                o0 o0Var = (o0) obj;
                if (o0Var.f2948d) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, d1Var)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    e0(o0Var);
                }
            }
            return m1Var;
        }
        if (z6) {
            return d1Var;
        }
        if (z5) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            r rVar = obj2 instanceof r ? (r) obj2 : null;
            d1Var.k(rVar != null ? rVar.f2958a : null);
        }
        return m1Var;
    }

    public boolean R() {
        return this instanceof f;
    }

    public final boolean S(Object obj) {
        Object objI0;
        do {
            objI0 = i0(f2928d.get(this), obj);
            if (objI0 == b0.f2889d) {
                return false;
            }
            if (objI0 == b0.f2890e) {
                return true;
            }
        } while (objI0 == b0.f2891f);
        t(objI0);
        return true;
    }

    public boolean U(Object obj) {
        return S(obj);
    }

    public final Object V(Object obj) {
        Object objI0;
        do {
            objI0 = i0(f2928d.get(this), obj);
            if (objI0 == b0.f2889d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                r rVar = obj instanceof r ? (r) obj : null;
                throw new IllegalStateException(str, rVar != null ? rVar.f2958a : null);
            }
        } while (objI0 == b0.f2891f);
        return objI0;
    }

    public String W() {
        return getClass().getSimpleName();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object Y(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return operation.invoke(obj, this);
    }

    public final void Z(k1 k1Var, Throwable th2) {
        k1Var.b(new fr.j(4), 4);
        Object obj = fr.m.f9382d.get(k1Var);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        androidx.datastore.preferences.protobuf.d1 d1Var = null;
        for (fr.m mVarG = (fr.m) obj; !Intrinsics.areEqual(mVarG, k1Var); mVarG = mVarG.g()) {
            if ((mVarG instanceof d1) && ((d1) mVarG).j()) {
                try {
                    ((d1) mVarG).k(th2);
                } catch (Throwable th3) {
                    if (d1Var != null) {
                        rn.f.a(d1Var, th3);
                    } else {
                        d1Var = new androidx.datastore.preferences.protobuf.d1("Exception in completion handler " + mVarG + " for " + this, th3);
                        Unit unit = Unit.f14616a;
                    }
                }
            }
        }
        if (d1Var != null) {
            N(d1Var);
        }
        C(th2);
    }

    @Override // kotlinx.coroutines.Job
    public final Object a0(xn.c frame) {
        Object obj;
        do {
            obj = f2928d.get(this);
            if (!(obj instanceof x0)) {
                b0.l(frame.getContext());
                return Unit.f14616a;
            }
        } while (g0(obj) < 0);
        k kVar = new k(1, wn.f.b(frame));
        kVar.t();
        kVar.w(new h(2, b0.r(this, new m(kVar, 1))));
        Object objR = kVar.r();
        wn.a aVar = wn.a.f22354d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (objR != aVar) {
            objR = Unit.f14616a;
        }
        return objR == aVar ? objR : Unit.f14616a;
    }

    @Override // kotlinx.coroutines.Job
    public boolean c() {
        Object obj = f2928d.get(this);
        return (obj instanceof x0) && ((x0) obj).c();
    }

    @Override // kotlinx.coroutines.Job
    public final m0 c0(boolean z5, boolean z6, c1 c1Var) {
        return Q(z6, z5 ? new z0(c1Var) : new n0(1, c1Var));
    }

    public final void e0(o0 o0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k1 k1Var = new k1();
        Object w0Var = k1Var;
        if (!o0Var.f2948d) {
            w0Var = new w0(k1Var);
        }
        do {
            atomicReferenceFieldUpdater = f2928d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, o0Var, w0Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == o0Var);
    }

    @Override // kotlinx.coroutines.Job
    public void f(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new a1(D(), null, this);
        }
        A(cancellationException);
    }

    public final void f0(d1 d1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        k1 k1Var = new k1();
        d1Var.getClass();
        fr.m.f9383e.set(k1Var, d1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fr.m.f9382d;
        atomicReferenceFieldUpdater2.set(k1Var, d1Var);
        loop0: while (atomicReferenceFieldUpdater2.get(d1Var) == d1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(d1Var, d1Var, k1Var)) {
                    k1Var.f(d1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(d1Var) == d1Var);
        }
        fr.m mVarG = d1Var.g();
        do {
            atomicReferenceFieldUpdater = f2928d;
            if (atomicReferenceFieldUpdater.compareAndSet(this, d1Var, mVarG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == d1Var);
    }

    public final int g0(Object obj) {
        boolean z5 = obj instanceof o0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2928d;
        if (z5) {
            if (((o0) obj).f2948d) {
                return 0;
            }
            o0 o0Var = b0.j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            d0();
            return 1;
        }
        if (!(obj instanceof w0)) {
            return 0;
        }
        k1 k1Var = ((w0) obj).f2976d;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        d0();
        return 1;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final kotlin.coroutines.f getKey() {
        return w.f2975e;
    }

    public Object i() throws Throwable {
        Object obj = f2928d.get(this);
        if (obj instanceof x0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof r) {
            throw ((r) obj).f2958a;
        }
        return b0.z(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object i0(Object obj, Object obj2) {
        if (!(obj instanceof x0)) {
            return b0.f2889d;
        }
        if (((obj instanceof o0) || (obj instanceof d1)) && !(obj instanceof o) && !(obj2 instanceof r)) {
            x0 x0Var = (x0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2928d;
            Object y0Var = obj2 instanceof x0 ? new y0((x0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, x0Var, y0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                    return b0.f2891f;
                }
            }
            b0(obj2);
            F(x0Var, obj2);
            return obj2;
        }
        x0 x0Var2 = (x0) obj;
        k1 k1VarL = L(x0Var2);
        if (k1VarL == null) {
            return b0.f2891f;
        }
        g1 g1Var = x0Var2 instanceof g1 ? (g1) x0Var2 : null;
        if (g1Var == null) {
            g1Var = new g1(k1VarL, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (g1Var) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g1.f2915e;
            if (atomicIntegerFieldUpdater.get(g1Var) == 1) {
                return b0.f2889d;
            }
            atomicIntegerFieldUpdater.set(g1Var, 1);
            if (g1Var != x0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2928d;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, x0Var2, g1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != x0Var2) {
                        return b0.f2891f;
                    }
                }
            }
            boolean zE = g1Var.e();
            r rVar = obj2 instanceof r ? (r) obj2 : null;
            if (rVar != null) {
                g1Var.a(rVar.f2958a);
            }
            ?? B = zE ? 0 : g1Var.b();
            objectRef.element = B;
            Unit unit = Unit.f14616a;
            if (B != 0) {
                Z(k1VarL, B);
            }
            o oVarX = X(k1VarL);
            if (oVarX != null && k0(g1Var, oVarX, obj2)) {
                return b0.f2890e;
            }
            k1VarL.b(new fr.j(2), 2);
            o oVarX2 = X(k1VarL);
            return (oVarX2 == null || !k0(g1Var, oVarX2, obj2)) ? H(g1Var, obj2) : b0.f2890e;
        }
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCompleted() {
        return !(f2928d.get(this) instanceof x0);
    }

    public final boolean k0(g1 g1Var, o oVar, Object obj) {
        while (oVar.f2947w.Q(false, new f1(this, g1Var, oVar, obj)) == m1.f2944d) {
            oVar = X(oVar);
            if (oVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element l(kotlin.coroutines.f fVar) {
        return kotlin.coroutines.e.a(this, fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext n(CoroutineContext coroutineContext) {
        return kotlin.coroutines.e.c(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence q() {
        h1 block = new h1(this, null);
        Intrinsics.checkNotNullParameter(block, "block");
        return new co.q(block);
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iG0;
        do {
            iG0 = g0(f2928d.get(this));
            if (iG0 == 0) {
                return false;
            }
        } while (iG0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(W() + '{' + h0(f2928d.get(this)) + '}');
        sb2.append('@');
        sb2.append(b0.o(this));
        return sb2.toString();
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException u() {
        CancellationException cancellationException;
        Object obj = f2928d.get(this);
        if (!(obj instanceof g1)) {
            if (obj instanceof x0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof r)) {
                return new a1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th2 = ((r) obj).f2958a;
            cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            return cancellationException == null ? new a1(D(), th2, this) : cancellationException;
        }
        Throwable thB = ((g1) obj).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = D();
        }
        return new a1(strConcat, thB, this);
    }

    public void v(Object obj) {
        t(obj);
    }

    public final Object w(Continuation frame) {
        Object obj;
        do {
            obj = f2928d.get(this);
            if (!(obj instanceof x0)) {
                if (obj instanceof r) {
                    throw ((r) obj).f2958a;
                }
                return b0.z(obj);
            }
        } while (g0(obj) < 0);
        e1 e1Var = new e1(this, wn.f.b(frame));
        e1Var.t();
        e1Var.w(new h(2, b0.r(this, new n0(2, e1Var))));
        Object objR = e1Var.r();
        if (objR == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:2: B:59:0x00b8->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r0
      0x003e: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0061 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:84:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0069 A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:84:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076 A[Catch: all -> 0x0067, TryCatch #0 {, blocks: (B:24:0x004f, B:29:0x0061, B:34:0x0069, B:40:0x0080, B:38:0x0076, B:39:0x007a), top: B:84:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x008d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x0109 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:84:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x004e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0042, please report this as an issue */
    public final boolean x(Object obj) {
        Throwable thG;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z5;
        Throwable thB;
        a5.h hVar;
        x0 x0Var;
        k1 k1VarL;
        g1 g1Var;
        Object objI0;
        Object objI1 = b0.f2889d;
        if (K()) {
            do {
                Object obj3 = f2928d.get(this);
                if (obj3 instanceof x0) {
                    if (obj3 instanceof g1) {
                        if (g1.f2915e.get((g1) obj3) == 1) {
                        }
                    }
                    objI1 = i0(obj3, new r(G(obj), false));
                }
                objI1 = b0.f2889d;
                break;
            } while (objI1 == b0.f2891f);
            if (objI1 != b0.f2890e) {
                if (objI1 == b0.f2889d) {
                    thG = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f2928d;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof g1) {
                            synchronized (obj2) {
                                if (g1.f2917v.get((g1) obj2) == b0.f2893h) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    hVar = b0.f2892g;
                                } else {
                                    boolean zE = ((g1) obj2).e();
                                    if (obj == null || !zE) {
                                        if (thG == null) {
                                            thG = G(obj);
                                        }
                                        ((g1) obj2).a(thG);
                                    }
                                    thB = zE ? null : ((g1) obj2).b();
                                    if (thB != null) {
                                        Z(((g1) obj2).f2918d, thB);
                                    }
                                    hVar = b0.f2889d;
                                }
                            }
                        } else if (obj2 instanceof x0) {
                            if (thG == null) {
                                thG = G(obj);
                            }
                            x0Var = (x0) obj2;
                            if (x0Var.c()) {
                                k1VarL = L(x0Var);
                                if (k1VarL == null) {
                                    continue;
                                } else {
                                    g1Var = new g1(k1VarL, thG);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, x0Var, g1Var)) {
                                            Z(k1VarL, thG);
                                            hVar = b0.f2889d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                                        }
                                    }
                                }
                            } else {
                                objI0 = i0(obj2, new r(thG, false));
                                if (objI0 != b0.f2889d) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objI0 != b0.f2891f) {
                                    objI1 = objI0;
                                    break;
                                }
                            }
                        } else {
                            hVar = b0.f2892g;
                        }
                        objI1 = hVar;
                        break;
                    }
                }
                if (objI1 != b0.f2889d && objI1 != b0.f2890e) {
                    if (objI1 == b0.f2892g) {
                        return false;
                    }
                    t(objI1);
                    return true;
                }
            }
        } else {
            if (objI1 == b0.f2889d) {
                thG = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f2928d;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof g1) {
                        synchronized (obj2) {
                            if (g1.f2917v.get((g1) obj2) == b0.f2893h) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                hVar = b0.f2892g;
                            } else {
                                boolean zE2 = ((g1) obj2).e();
                                if (obj == null) {
                                    if (thG == null) {
                                        thG = G(obj);
                                    }
                                    ((g1) obj2).a(thG);
                                } else {
                                    if (thG == null) {
                                        thG = G(obj);
                                    }
                                    ((g1) obj2).a(thG);
                                }
                                if (zE2) {
                                }
                                if (thB != null) {
                                    Z(((g1) obj2).f2918d, thB);
                                }
                                hVar = b0.f2889d;
                            }
                        }
                    } else if (obj2 instanceof x0) {
                        if (thG == null) {
                            thG = G(obj);
                        }
                        x0Var = (x0) obj2;
                        if (x0Var.c()) {
                            k1VarL = L(x0Var);
                            if (k1VarL == null) {
                                continue;
                            } else {
                                g1Var = new g1(k1VarL, thG);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, x0Var, g1Var)) {
                                        Z(k1VarL, thG);
                                        hVar = b0.f2889d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != x0Var) {
                                    }
                                }
                            }
                        } else {
                            objI0 = i0(obj2, new r(thG, false));
                            if (objI0 != b0.f2889d) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objI0 != b0.f2891f) {
                                objI1 = objI0;
                                break;
                            }
                        }
                    } else {
                        hVar = b0.f2892g;
                    }
                    objI1 = hVar;
                    break;
                }
            }
            if (objI1 != b0.f2889d) {
                if (objI1 == b0.f2892g) {
                    return false;
                }
                t(objI1);
                return true;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.Job
    public final n y(i1 i1Var) {
        o oVar = new o(i1Var);
        oVar.f2904v = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2928d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof o0) {
                o0 o0Var = (o0) obj;
                if (o0Var.f2948d) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, oVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                e0(o0Var);
            } else {
                boolean z5 = obj instanceof x0;
                m1 m1Var = m1.f2944d;
                Throwable thB = null;
                if (!z5) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    r rVar = obj2 instanceof r ? (r) obj2 : null;
                    oVar.k(rVar != null ? rVar.f2958a : null);
                    return m1Var;
                }
                k1 k1VarD = ((x0) obj).d();
                if (k1VarD != null) {
                    if (k1VarD.b(oVar, 7)) {
                        break;
                    }
                    boolean zB = k1VarD.b(oVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof g1) {
                        thB = ((g1) obj3).b();
                    } else {
                        r rVar2 = obj3 instanceof r ? (r) obj3 : null;
                        if (rVar2 != null) {
                            thB = rVar2.f2958a;
                        }
                    }
                    oVar.k(thB);
                    if (zB) {
                        break;
                    }
                    return m1Var;
                }
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                f0((d1) obj);
            }
        }
        return oVar;
    }

    public void d0() {
    }

    public void N(androidx.datastore.preferences.protobuf.d1 d1Var) {
        throw d1Var;
    }

    public void b0(Object obj) {
    }

    public void t(Object obj) {
    }
}
