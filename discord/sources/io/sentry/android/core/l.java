package io.sentry.android.core;

import io.sentry.SentryLevel;
import io.sentry.w5;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends io.sentry.logger.c implements c0 {
    @Override // io.sentry.logger.c, io.sentry.logger.a, io.sentry.metrics.a
    public final void a(boolean z5) {
        f0.f12181w.i(this);
        super.a(z5);
    }

    @Override // io.sentry.android.core.c0
    public final void c() {
    }

    @Override // io.sentry.android.core.c0
    public final void f() {
        w5 w5Var = this.f12804e;
        try {
            w5Var.getExecutorService().submit(new k(this, 0));
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Failed to submit log flush in onBackground()", new Object[0]);
        }
    }
}
