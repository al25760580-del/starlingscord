package er;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Continuation, CoroutineStackFrame {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Continuation f8722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext f8723e;

    public z(Continuation continuation, CoroutineContext coroutineContext) {
        this.f8722d = continuation;
        this.f8723e = coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f8722d;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final CoroutineContext getContext() {
        return this.f8723e;
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.f8722d.resumeWith(obj);
    }
}
