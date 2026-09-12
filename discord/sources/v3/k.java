package v3;

import ar.b1;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class k implements ListenableFuture {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g4.j f21410d;

    public k(b1 job) {
        g4.j underlying = new g4.j();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f21410d = underlying;
        job.O(new androidx.fragment.app.r(6, this));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f21410d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return this.f21410d.cancel(z5);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f21410d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f21410d.f9490d instanceof g4.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f21410d.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f21410d.get(j, timeUnit);
    }
}
