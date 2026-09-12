package xn;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends a {
    public f(Continuation continuation) {
        super(continuation);
        if (continuation != null && continuation.getContext() != kotlin.coroutines.g.f14681d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return kotlin.coroutines.g.f14681d;
    }
}
