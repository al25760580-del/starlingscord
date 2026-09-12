package fr;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends RuntimeException {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient CoroutineContext f9369d;

    public f(CoroutineContext coroutineContext) {
        this.f9369d = coroutineContext;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f9369d);
    }
}
