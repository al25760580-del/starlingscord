package io.sentry;

import io.sentry.android.replay.BuildConfig;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes3.dex */
public final class v4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile v4 f13246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.sentry.util.a f13247d = new io.sentry.util.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Boolean f13248e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final io.sentry.util.a f13249f = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f13250a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArraySet f13251b = new CopyOnWriteArraySet();

    public static v4 d() {
        if (f13246c == null) {
            r rVarA = f13247d.a();
            try {
                if (f13246c == null) {
                    f13246c = new v4();
                }
                rVarA.close();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f13246c;
    }

    public final void a(String str) {
        com.facebook.imagepipeline.nativecode.c.H(str, "integration is required.");
        this.f13250a.add(str);
    }

    public final void b(String str, String str2) {
        com.facebook.imagepipeline.nativecode.c.H(str, "name is required.");
        com.facebook.imagepipeline.nativecode.c.H(str2, "version is required.");
        this.f13251b.add(new io.sentry.protocol.w(str, str2));
        r rVarA = f13249f.a();
        try {
            f13248e = null;
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean c(ILogger iLogger) {
        Boolean bool = f13248e;
        if (bool != null) {
            return bool.booleanValue();
        }
        r rVarA = f13249f.a();
        try {
            boolean z5 = false;
            for (io.sentry.protocol.w wVar : this.f13251b) {
                if (wVar.f13057d.startsWith("maven:io.sentry:") && !BuildConfig.VERSION_NAME.equalsIgnoreCase(wVar.f13058e)) {
                    iLogger.q(SentryLevel.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", wVar.f13057d, BuildConfig.VERSION_NAME, wVar.f13058e);
                    z5 = true;
                }
            }
            if (z5) {
                SentryLevel sentryLevel = SentryLevel.ERROR;
                iLogger.q(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.q(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.q(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.q(sentryLevel, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f13248e = Boolean.valueOf(z5);
            rVarA.close();
            return z5;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
