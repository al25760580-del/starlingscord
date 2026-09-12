package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.w5;

/* JADX INFO: loaded from: classes3.dex */
public final class f {
    public static boolean a(w5 w5Var, String str) {
        return b(str, w5Var != null ? w5Var.getLogger() : null);
    }

    public static boolean b(String str, ILogger iLogger) {
        return c(str, iLogger) != null;
    }

    public static Class c(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.q(SentryLevel.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e10) {
            if (iLogger == null) {
                return null;
            }
            iLogger.g(SentryLevel.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e10);
            return null;
        } catch (Throwable th2) {
            if (iLogger == null) {
                return null;
            }
            iLogger.g(SentryLevel.ERROR, "Failed to initialize ".concat(str), th2);
            return null;
        }
    }
}
