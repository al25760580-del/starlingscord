package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f12095d;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        com.facebook.imagepipeline.nativecode.c.H(thread, "Thread must be provided.");
        this.f12095d = thread;
        setStackTrace(thread.getStackTrace());
    }
}
