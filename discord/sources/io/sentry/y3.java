package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public interface y3 {
    static boolean T(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.q(SentryLevel.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    x3 u(x0 x0Var, w5 w5Var);
}
