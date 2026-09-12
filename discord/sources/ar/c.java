package ar;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends d1 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final k f2898w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public m0 f2899x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e f2900y;

    public c(e eVar, k kVar) {
        this.f2900y = eVar;
        this.f2898w = kVar;
    }

    @Override // ar.d1
    public final boolean j() {
        return false;
    }

    @Override // ar.d1
    public final void k(Throwable th2) throws g0 {
        k kVar = this.f2898w;
        if (th2 != null) {
            kVar.getClass();
            a5.h hVarE = kVar.E(new r(th2, false), null);
            if (hVarE != null) {
                kVar.s(hVarE);
                d dVar = (d) E.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f2905b;
        e eVar = this.f2900y;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            Deferred[] deferredArr = eVar.f2906a;
            ArrayList arrayList = new ArrayList(deferredArr.length);
            for (Deferred deferred : deferredArr) {
                arrayList.add(deferred.i());
            }
            rn.q qVar = Result.f14614e;
            kVar.resumeWith(arrayList);
        }
    }
}
