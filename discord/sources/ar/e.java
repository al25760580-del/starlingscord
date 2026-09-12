package ar;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2905b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred[] f2906a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public e(Deferred[] deferredArr) {
        this.f2906a = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    public final Object a(xn.h frame) {
        k kVar = new k(1, wn.f.b(frame));
        kVar.t();
        Deferred[] deferredArr = this.f2906a;
        int length = deferredArr.length;
        c[] cVarArr = new c[length];
        for (int i7 = 0; i7 < length; i7++) {
            Deferred deferred = deferredArr[i7];
            deferred.start();
            c cVar = new c(this, kVar);
            cVar.f2899x = b0.r(deferred, cVar);
            Unit unit = Unit.f14616a;
            cVarArr[i7] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i10 = 0; i10 < length; i10++) {
            c cVar2 = cVarArr[i10];
            cVar2.getClass();
            c.E.set(cVar2, dVar);
        }
        if (k.f2935y.get(kVar) instanceof n1) {
            kVar.w(dVar);
        } else {
            dVar.b();
        }
        Object objR = kVar.r();
        if (objR == wn.a.f22354d) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objR;
    }
}
