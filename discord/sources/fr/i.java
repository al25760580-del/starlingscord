package fr;

import ar.c0;
import ar.e0;
import ar.m0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends CoroutineDispatcher implements e0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e0 f9376i;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CoroutineDispatcher f9377v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f9378w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n f9379x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Object f9380y;

    /* JADX WARN: Multi-variable type inference failed */
    public i(CoroutineDispatcher coroutineDispatcher, int i7) {
        e0 e0Var = coroutineDispatcher instanceof e0 ? (e0) coroutineDispatcher : null;
        this.f9376i = e0Var == null ? c0.f2901a : e0Var;
        this.f9377v = coroutineDispatcher;
        this.f9378w = i7;
        this.f9379x = new n();
        this.f9380y = new Object();
    }

    @Override // ar.e0
    public final m0 P(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f9376i.P(j, runnable, coroutineContext);
    }

    @Override // ar.e0
    public final void e0(long j, ar.k kVar) {
        this.f9376i.e0(j, kVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void l0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableP0;
        this.f9379x.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E;
        if (atomicIntegerFieldUpdater.get(this) >= this.f9378w || !q0() || (runnableP0 = p0()) == null) {
            return;
        }
        try {
            h.g(this.f9377v, this, new hi.o(this, runnableP0, 9, false));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void m0(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableP0;
        this.f9379x.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E;
        if (atomicIntegerFieldUpdater.get(this) >= this.f9378w || !q0() || (runnableP0 = p0()) == null) {
            return;
        }
        try {
            this.f9377v.m0(this, new hi.o(this, runnableP0, 9, false));
        } catch (Throwable th2) {
            atomicIntegerFieldUpdater.decrementAndGet(this);
            throw th2;
        }
    }

    public final Runnable p0() {
        while (true) {
            Runnable runnable = (Runnable) this.f9379x.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f9380y) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f9379x.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean q0() {
        synchronized (this.f9380y) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = E;
            if (atomicIntegerFieldUpdater.get(this) >= this.f9378w) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f9377v);
        sb2.append(".limitedParallelism(");
        return com.discord.chat.presentation.list.a.j(sb2, this.f9378w, ')');
    }
}
