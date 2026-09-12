package hr;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends CoroutineDispatcher {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f11117i = new l();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        e.f11105v.f11107i.f(runnable, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        e.f11105v.f11107i.f(runnable, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher o0(int i7) {
        fr.h.a(i7);
        return i7 >= k.f11114d ? this : super.o0(i7);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
