package io.sentry.react.utils;

import android.app.Activity;
import com.facebook.react.bridge.ReactApplicationContext;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.m0;
import java.lang.ref.WeakReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RNSentryActivityUtils {
    private RNSentryActivityUtils() {
    }

    public static Activity getCurrentActivity(@NotNull ReactApplicationContext reactApplicationContext, @NotNull ILogger iLogger) {
        Activity currentActivity = reactApplicationContext.getCurrentActivity();
        if (currentActivity != null) {
            return currentActivity;
        }
        iLogger.q(SentryLevel.DEBUG, "[RNSentryActivityUtils] Given ReactApplicationContext has no activity attached, using CurrentActivityHolder as a fallback.", new Object[0]);
        WeakReference weakReference = (WeakReference) m0.f12349e.f12350d;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }
}
