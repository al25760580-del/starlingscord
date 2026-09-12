package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements io.sentry.util.thread.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f12290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f12291b;

    static {
        e eVar = new e();
        new Handler(Looper.getMainLooper()).post(new bc.a(10));
        f12290a = eVar;
        f12291b = Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public final String a() {
        return c() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.a
    public final long b() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.a
    public final boolean c() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }
}
