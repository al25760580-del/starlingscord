package io.sentry.android.core;

import android.os.FileObserver;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.z2;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends FileObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z2 f12405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f12406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12407d;

    public s0(String str, z2 z2Var, ILogger iLogger, long j) {
        super(str);
        this.f12404a = str;
        this.f12405b = z2Var;
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "Logger is required.");
        this.f12406c = iLogger;
        this.f12407d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i7, String str) {
        if (str == null || i7 != 8) {
            return;
        }
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        Integer numValueOf = Integer.valueOf(i7);
        String str2 = this.f12404a;
        ILogger iLogger = this.f12406c;
        iLogger.q(sentryLevel, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        Hint hintP = a5.l0.p(new r0(this.f12407d, iLogger));
        StringBuilder sbN = kk.b.n(str2);
        sbN.append(File.separator);
        sbN.append(str);
        String string = sbN.toString();
        z2 z2Var = this.f12405b;
        z2Var.getClass();
        com.facebook.imagepipeline.nativecode.c.H(string, "Path is required.");
        z2Var.b(new File(string), hintP);
    }
}
