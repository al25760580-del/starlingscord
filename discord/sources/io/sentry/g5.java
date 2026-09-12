package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g5 implements io.sentry.util.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12694d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w5 f12695e;

    public /* synthetic */ g5(w5 w5Var, int i7) {
        this.f12694d = i7;
        this.f12695e = w5Var;
    }

    @Override // io.sentry.util.d
    public final Object b() {
        switch (this.f12694d) {
            case 0:
                return w5.a(this.f12695e);
            case 1:
                w5 w5Var = this.f12695e;
                w5Var.getClass();
                return new z1(w5Var);
            case 2:
                return w5.b(this.f12695e);
            default:
                return Boolean.valueOf(io.sentry.util.f.a(this.f12695e, "androidx.core.view.ScrollingView"));
        }
    }

    public /* synthetic */ g5(io.sentry.util.f fVar, SentryAndroidOptions sentryAndroidOptions) {
        this.f12694d = 3;
        this.f12695e = sentryAndroidOptions;
    }
}
