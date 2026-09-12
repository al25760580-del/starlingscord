package hr;

import fr.w;
import java.util.concurrent.Executor;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends kotlinx.coroutines.c implements Executor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f11103i = new d();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final CoroutineDispatcher f11104v;

    static {
        l lVar = l.f11117i;
        int i7 = w.f9400a;
        if (64 >= i7) {
            i7 = 64;
        }
        f11104v = lVar.o0(fr.h.j(i7, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        l0(kotlin.coroutines.g.f14681d, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        f11104v.l0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        f11104v.m0(coroutineContext, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
