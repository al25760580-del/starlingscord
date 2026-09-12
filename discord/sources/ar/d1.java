package ar;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d1 extends fr.m implements m0, x0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i1 f2904v;

    @Override // ar.x0
    public final boolean c() {
        return true;
    }

    @Override // ar.x0
    public final k1 d() {
        return null;
    }

    @Override // ar.m0
    public final void dispose() {
        i1 i1VarI = i();
        i1VarI.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i1.f2928d;
            Object obj = atomicReferenceFieldUpdater.get(i1VarI);
            if (obj instanceof d1) {
                if (obj != this) {
                    return;
                }
                o0 o0Var = b0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(i1VarI, obj, o0Var)) {
                    if (atomicReferenceFieldUpdater.get(i1VarI) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof x0) || ((x0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = fr.m.f9382d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof fr.r) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                fr.m mVar = (fr.m) obj2;
                mVar.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = fr.m.f9384i;
                fr.r rVar = (fr.r) atomicReferenceFieldUpdater3.get(mVar);
                if (rVar == null) {
                    rVar = new fr.r(mVar);
                    atomicReferenceFieldUpdater3.set(mVar, rVar);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, rVar)) {
                        mVar.e();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    public Job getParent() {
        return i();
    }

    public final i1 i() {
        i1 i1Var = this.f2904v;
        if (i1Var != null) {
            return i1Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract boolean j();

    public abstract void k(Throwable th2);

    @Override // fr.m
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.o(this) + "[job@" + b0.o(i()) + ']';
    }
}
