package com.google.android.gms.internal.play_billing;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class y4 implements x0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f6192d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x4 f6193e = new x4(this);

    public y4(w4 w4Var) {
        this.f6192d = new WeakReference(w4Var);
    }

    @Override // com.google.android.gms.internal.play_billing.x0
    public final void b(Runnable runnable, Executor executor) {
        this.f6193e.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        w4 w4Var = (w4) this.f6192d.get();
        boolean zCancel = this.f6193e.cancel(z5);
        if (!zCancel || w4Var == null) {
            return zCancel;
        }
        w4Var.f6180a = null;
        w4Var.f6181b = null;
        w4Var.f6182c.i(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6193e.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f6193e.f6166d instanceof c1;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f6193e.isDone();
    }

    public final String toString() {
        return this.f6193e.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f6193e.get(j, timeUnit);
    }
}
