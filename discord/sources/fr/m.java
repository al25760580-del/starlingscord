package fr;

import ar.b0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9382d = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9383e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9384i = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean b(m mVar, int i7) {
        while (true) {
            m mVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9383e;
            if (mVarE == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    mVarE = (m) obj;
                    if (!mVarE.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(mVarE);
                }
            }
            if (mVarE instanceof j) {
                return (((j) mVarE).f9381v & i7) == 0 && mVarE.b(mVar, i7);
            }
            atomicReferenceFieldUpdater.set(mVar, mVarE);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9382d;
            atomicReferenceFieldUpdater2.set(mVar, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(mVarE, this, mVar)) {
                    mVar.f(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(mVarE) == this);
        }
    }

    public final m e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9383e;
            m mVar = (m) atomicReferenceFieldUpdater2.get(this);
            m mVar2 = mVar;
            while (true) {
                m mVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f9382d;
                    obj = atomicReferenceFieldUpdater.get(mVar2);
                    if (obj == this) {
                        if (mVar == mVar2) {
                            return mVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, mVar, mVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != mVar) {
                                break;
                            }
                        }
                        return mVar2;
                    }
                    if (h()) {
                        return null;
                    }
                    if (!(obj instanceof r)) {
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        mVar3 = mVar2;
                        mVar2 = (m) obj;
                    } else {
                        if (mVar3 != null) {
                            break;
                        }
                        mVar2 = (m) atomicReferenceFieldUpdater2.get(mVar2);
                    }
                }
                m mVar4 = ((r) obj).f9395a;
                while (!atomicReferenceFieldUpdater.compareAndSet(mVar3, mVar2, mVar4)) {
                    if (atomicReferenceFieldUpdater.get(mVar3) != mVar2) {
                        break;
                    }
                }
                mVar2 = mVar3;
            }
        }
    }

    public final void f(m mVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9383e;
            m mVar2 = (m) atomicReferenceFieldUpdater.get(mVar);
            if (f9382d.get(this) != mVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(mVar, mVar2, this)) {
                    if (h()) {
                        mVar.e();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(mVar) == mVar2);
        }
    }

    public final m g() {
        m mVar;
        Object obj = f9382d.get(this);
        r rVar = obj instanceof r ? (r) obj : null;
        if (rVar != null && (mVar = rVar.f9395a) != null) {
            return mVar;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (m) obj;
    }

    public boolean h() {
        return f9382d.get(this) instanceof r;
    }

    public String toString() {
        return new l(this, b0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + b0.o(this);
    }
}
