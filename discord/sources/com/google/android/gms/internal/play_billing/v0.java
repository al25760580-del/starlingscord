package com.google.android.gms.internal.play_billing;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements x0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final w0 f6152e = new w0(v0.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6153d;

    public v0(Object obj) {
        this.f6153d = obj;
    }

    @Override // com.google.android.gms.internal.play_billing.x0
    public final void b(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f6152e.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", a3.e.m("RuntimeException while executing runnable ", runnable.toString(), " with executor ", String.valueOf(executor)), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z5) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6153d;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f6153d.toString() + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f6153d;
    }
}
