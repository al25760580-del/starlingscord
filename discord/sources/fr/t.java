package fr;

import ar.b0;
import ar.g0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* JADX INFO: loaded from: classes3.dex */
public class t extends ar.a implements CoroutineStackFrame {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Continuation f9396v;

    public t(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true);
        this.f9396v = continuation;
    }

    @Override // ar.i1
    public final boolean R() {
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f9396v;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // ar.i1
    public void t(Object obj) throws g0 {
        h.f(b0.u(obj), wn.f.b(this.f9396v));
    }

    @Override // ar.i1
    public void v(Object obj) {
        this.f9396v.resumeWith(b0.u(obj));
    }

    public void o0() {
    }
}
