package ar;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: loaded from: classes3.dex */
public final class p extends i1 implements CompletableDeferred {
    @Override // kotlinx.coroutines.CompletableDeferred
    public final boolean T(Throwable th2) {
        return S(new r(th2, false));
    }

    @Override // kotlinx.coroutines.Deferred
    public final Object z(Continuation continuation) {
        Object objW = w(continuation);
        wn.a aVar = wn.a.f22354d;
        return objW;
    }
}
