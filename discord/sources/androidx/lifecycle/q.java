package androidx.lifecycle;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class q extends o implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lifecycle f2381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineContext f2382e;

    public q(Lifecycle lifecycle, CoroutineContext coroutineContext) {
        Job job;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.f2381d = lifecycle;
        this.f2382e = coroutineContext;
        if (lifecycle.b() != Lifecycle.State.f2295d || (job = (Job) coroutineContext.l(ar.w.f2975e)) == null) {
            return;
        }
        job.f(null);
    }

    @Override // androidx.lifecycle.t
    public final void c(LifecycleOwner source, n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        Lifecycle lifecycle = this.f2381d;
        if (lifecycle.b().compareTo(Lifecycle.State.f2295d) <= 0) {
            lifecycle.c(this);
            Job job = (Job) this.f2382e.l(ar.w.f2975e);
            if (job != null) {
                job.f(null);
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public final CoroutineContext getCoroutineContext() {
        return this.f2382e;
    }
}
