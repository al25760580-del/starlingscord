package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class m1 implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runtime f12814a = Runtime.getRuntime();

    @Override // io.sentry.u0
    public final void a(a3 a3Var) {
        Runtime runtime = this.f12814a;
        a3Var.f12043b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }

    @Override // io.sentry.u0
    public final void c() {
    }
}
