package ar;

import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineDispatcher f2932d;

    public j0(CoroutineDispatcher coroutineDispatcher) {
        this.f2932d = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws g0 {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f14681d;
        CoroutineDispatcher coroutineDispatcher = this.f2932d;
        if (fr.h.h(coroutineDispatcher, gVar)) {
            fr.h.g(coroutineDispatcher, gVar, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.f2932d.toString();
    }
}
