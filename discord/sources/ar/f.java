package ar;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Thread f2907v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t0 f2908w;

    public f(CoroutineContext coroutineContext, Thread thread, t0 t0Var) {
        super(coroutineContext, true);
        this.f2907v = thread;
        this.f2908w = t0Var;
    }

    @Override // ar.i1
    public final void t(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f2907v;
        if (Intrinsics.areEqual(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
