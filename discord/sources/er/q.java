package er;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements CoroutineContext {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f8709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f8710e;

    public q(Throwable th2, CoroutineContext coroutineContext) {
        this.f8709d = coroutineContext;
        this.f8710e = th2;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext B(kotlin.coroutines.f fVar) {
        return this.f8709d.B(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object Y(Object obj, Function2 function2) {
        return this.f8709d.Y(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element l(kotlin.coroutines.f fVar) {
        return this.f8709d.l(fVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext n(CoroutineContext coroutineContext) {
        return this.f8709d.n(coroutineContext);
    }
}
