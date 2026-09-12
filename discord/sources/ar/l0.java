package ar;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledFuture f2940d;

    public l0(ScheduledFuture scheduledFuture) {
        this.f2940d = scheduledFuture;
    }

    @Override // ar.m0
    public final void dispose() {
        this.f2940d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f2940d + ']';
    }
}
