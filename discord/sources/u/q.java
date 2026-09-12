package u;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class q implements o, l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f20898d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext f20899e;

    public q(l lVar, CoroutineContext coroutineContext) {
        this.f20898d = lVar;
        this.f20899e = coroutineContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void a(Function0 function0, xn.c cVar) {
        p frame;
        if (cVar instanceof p) {
            frame = (p) cVar;
            int i7 = frame.f20897v;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                frame.f20897v = i7 - Integer.MIN_VALUE;
            } else {
                frame = new p(this, cVar);
            }
        } else {
            frame = new p(this, cVar);
        }
        Object obj = frame.f20895e;
        wn.a aVar = wn.a.f22354d;
        int i10 = frame.f20897v;
        try {
            if (i10 == 0) {
                ib.a.L(obj);
                frame.f20894d = (Lambda) function0;
                frame.f20897v = 1;
                ar.k kVar = new ar.k(1, wn.f.b(frame));
                kVar.t();
                Object objR = kVar.r();
                if (objR == aVar) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                if (objR == aVar) {
                    return;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function0 = (Function0) frame.f20894d;
                ib.a.L(obj);
            }
            throw new rn.h();
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f20899e;
    }

    @Override // u.x
    public final Object getValue() {
        return this.f20898d.getValue();
    }

    @Override // u.l
    public final void setValue(Object obj) {
        this.f20898d.setValue(obj);
    }
}
