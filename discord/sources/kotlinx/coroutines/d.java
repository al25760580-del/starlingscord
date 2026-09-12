package kotlinx.coroutines;

import ar.b2;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends CoroutineDispatcher {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f14754i = 0;

    static {
        new d();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        b2 b2Var = (b2) coroutineContext.l(b2.f2896i);
        if (b2Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        b2Var.f2897e = true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
