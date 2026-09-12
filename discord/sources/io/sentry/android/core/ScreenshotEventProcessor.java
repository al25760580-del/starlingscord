package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class ScreenshotEventProcessor implements io.sentry.b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SentryAndroidOptions f12106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k0 f12107e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f12108i;

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, k0 k0Var) {
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12106d = sentryAndroidOptions;
        this.f12107e = k0Var;
        this.f12108i = new io.sentry.android.core.internal.util.g(2000L, 3);
        if (sentryAndroidOptions.isAttachScreenshot()) {
            c9.a.c("Screenshot");
        }
    }

    @Override // io.sentry.b0
    public final SentryEvent f(SentryEvent sentryEvent, Hint hint) {
        Bitmap bitmapA;
        if (sentryEvent.f()) {
            SentryAndroidOptions sentryAndroidOptions = this.f12106d;
            if (!sentryAndroidOptions.isAttachScreenshot()) {
                sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "attachScreenshot is disabled.", new Object[0]);
                return sentryEvent;
            }
            WeakReference weakReference = (WeakReference) m0.f12349e.f12350d;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null && !a5.l0.J(hint)) {
                boolean zA = this.f12108i.a();
                sentryAndroidOptions.getBeforeScreenshotCaptureCallback();
                if (!zA && (bitmapA = hf.a.a(activity, sentryAndroidOptions.getThreadChecker(), sentryAndroidOptions.getLogger(), this.f12107e)) != null) {
                    hint.f12015d = new io.sentry.a(new com.facebook.react.runtime.o(9, this, bitmapA));
                    hint.d(activity, "android:activity");
                }
            }
        }
        return sentryEvent;
    }

    @Override // io.sentry.b0
    public final io.sentry.protocol.d0 g(io.sentry.protocol.d0 d0Var, Hint hint) {
        return d0Var;
    }
}
