package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface ILogger {
    void e(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr);

    void g(SentryLevel sentryLevel, String str, Throwable th2);

    void q(SentryLevel sentryLevel, String str, Object... objArr);

    boolean s(SentryLevel sentryLevel);
}
