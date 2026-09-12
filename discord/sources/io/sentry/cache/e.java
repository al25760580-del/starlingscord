package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.r0;
import io.sentry.w5;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f12537a;

    public e(SentryAndroidOptions sentryAndroidOptions) {
        this.f12537a = sentryAndroidOptions;
    }

    public final void a(String str) {
        a.a(this.f12537a, ".options-cache", str);
    }

    public final void b(Object obj, String str) {
        a.d(this.f12537a, obj, ".options-cache", str);
    }
}
