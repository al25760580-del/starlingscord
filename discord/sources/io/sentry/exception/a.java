package io.sentry.exception;

import com.facebook.imagepipeline.nativecode.c;
import io.sentry.protocol.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f12658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f12659e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Thread f12660i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f12661v;

    public a(m mVar, Throwable th2, Thread thread, boolean z5) {
        this.f12658d = mVar;
        c.H(th2, "Throwable is required.");
        this.f12659e = th2;
        c.H(thread, "Thread is required.");
        this.f12660i = thread;
        this.f12661v = z5;
    }
}
