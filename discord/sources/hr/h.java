package hr;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h extends kotlinx.coroutines.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f11107i;

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        c.i(this.f11107i, runnable, 6);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        c.i(this.f11107i, runnable, 2);
    }
}
