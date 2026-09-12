package dr;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends er.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f7726a = new AtomicReference(null);

    @Override // er.d
    public final boolean a(er.b bVar) {
        AtomicReference atomicReference = this.f7726a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(z.f7811b);
        return true;
    }

    @Override // er.d
    public final Continuation[] b(er.b bVar) {
        this.f7726a.set(null);
        return er.c.f8669a;
    }

    public final Object c(c0 frame) {
        ar.k kVar = new ar.k(1, wn.f.b(frame));
        kVar.t();
        a5.h hVar = z.f7811b;
        while (true) {
            AtomicReference atomicReference = this.f7726a;
            if (atomicReference.compareAndSet(hVar, kVar)) {
                break;
            }
            if (atomicReference.get() != hVar) {
                rn.q qVar = Result.f14614e;
                kVar.resumeWith(Unit.f14616a);
                break;
            }
        }
        Object objR = kVar.r();
        wn.a aVar = wn.a.f22354d;
        if (objR == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR == aVar ? objR : Unit.f14616a;
    }
}
