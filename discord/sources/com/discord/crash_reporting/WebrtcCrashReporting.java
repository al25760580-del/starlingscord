package com.discord.crash_reporting;

import io.sentry.Hint;
import io.sentry.c4;
import io.sentry.x0;

/* JADX INFO: loaded from: classes.dex */
class WebrtcCrashReporting {
    public static String reportWebrtcException(Throwable th2) {
        x0 x0VarF = c4.f();
        x0VarF.getClass();
        x0VarF.t(th2, new Hint());
        return th2.toString();
    }
}
