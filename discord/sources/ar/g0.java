package ar;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f2914d;

    public g0(Throwable th2, CoroutineDispatcher coroutineDispatcher, CoroutineContext coroutineContext) {
        super("Coroutine dispatcher " + coroutineDispatcher + " threw an exception, context = " + coroutineContext, th2);
        this.f2914d = th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f2914d;
    }
}
