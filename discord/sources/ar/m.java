package ar;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends d1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f2942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final k f2943x;

    public /* synthetic */ m(k kVar, int i7) {
        this.f2942w = i7;
        this.f2943x = kVar;
    }

    @Override // ar.d1
    public final boolean j() {
        switch (this.f2942w) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // ar.d1
    public final void k(Throwable th2) throws g0 {
        int i7 = this.f2942w;
        k kVar = this.f2943x;
        switch (i7) {
            case 0:
                Throwable thQ = kVar.q(i());
                if (kVar.x()) {
                    Continuation continuation = kVar.f2936v;
                    Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
                    fr.g gVar = (fr.g) continuation;
                    gVar.getClass();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = fr.g.E;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(gVar);
                        a5.h hVar = fr.h.f9375b;
                        if (Intrinsics.areEqual(obj, hVar)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(gVar, hVar, thQ)) {
                                if (atomicReferenceFieldUpdater.get(gVar) != hVar) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(gVar, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(gVar) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                kVar.m(thQ);
                if (!kVar.x()) {
                    kVar.o();
                }
                break;
            default:
                rn.q qVar = Result.f14614e;
                kVar.resumeWith(Unit.f14616a);
                break;
        }
    }
}
