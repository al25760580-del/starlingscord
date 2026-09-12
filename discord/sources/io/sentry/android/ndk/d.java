package io.sentry.android.ndk;

import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.j6;
import io.sentry.ndk.NativeScope;
import io.sentry.p3;
import io.sentry.protocol.h0;
import io.sentry.s3;
import io.sentry.w5;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends s3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f12467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeScope f12468b;

    public d(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "The SentryOptions object is required.");
        this.f12467a = sentryAndroidOptions;
        this.f12468b = nativeScope;
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void b(String str) {
        w5 w5Var = this.f12467a;
        try {
            w5Var.getExecutorService().submit(new c(this, str, 1));
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Scope sync removeExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.w0
    public final void c(Breadcrumb breadcrumb) {
        w5 w5Var = this.f12467a;
        try {
            w5Var.getExecutorService().submit(new com.mkuczera.haptic.a(18, this, breadcrumb));
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.w0
    public final void e(j6 j6Var, p3 p3Var) {
        w5 w5Var = this.f12467a;
        if (j6Var == null) {
            return;
        }
        try {
            w5Var.getExecutorService().submit(new com.mkuczera.haptic.a(20, this, j6Var));
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Scope sync setTrace failed.", new Object[0]);
        }
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void f(String str, String str2) {
        w5 w5Var = this.f12467a;
        try {
            w5Var.getExecutorService().submit(new b(this, str, str2, 1));
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Scope sync setTag(%s) has an error.", str);
        }
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void j(String str, String str2) {
        w5 w5Var = this.f12467a;
        try {
            w5Var.getExecutorService().submit(new b(this, str, str2, 0));
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Scope sync setExtra(%s) has an error.", str);
        }
    }

    @Override // io.sentry.w0
    public final void m(h0 h0Var) {
        w5 w5Var = this.f12467a;
        try {
            w5Var.getExecutorService().submit(new com.mkuczera.haptic.a(19, this, h0Var));
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Scope sync setUser has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.s3, io.sentry.w0
    public final void n(String str) {
        w5 w5Var = this.f12467a;
        try {
            w5Var.getExecutorService().submit(new c(this, str, 0));
        } catch (Throwable th2) {
            w5Var.getLogger().e(SentryLevel.ERROR, th2, "Scope sync removeTag(%s) has an error.", str);
        }
    }
}
