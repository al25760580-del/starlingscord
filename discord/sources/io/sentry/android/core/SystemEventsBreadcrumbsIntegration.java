package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.HandlerThread;
import io.sentry.SentryLevel;
import io.sentry.l1;
import io.sentry.v3;
import io.sentry.w5;
import java.io.Closeable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class SystemEventsBreadcrumbsIntegration implements l1, Closeable, c0 {
    public i1 I;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile j1 f12121e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SentryAndroidOptions f12122i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public v3 f12123v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String[] f12124w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f12125x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f12126y = false;
    public volatile IntentFilter E = null;
    public volatile HandlerThread F = null;
    public final AtomicBoolean G = new AtomicBoolean(false);
    public final io.sentry.util.a H = new io.sentry.util.a();

    public SystemEventsBreadcrumbsIntegration(Context context) {
        String[] strArr = {"android.intent.action.ACTION_SHUTDOWN", "android.intent.action.AIRPLANE_MODE", "android.intent.action.BATTERY_CHANGED", "android.intent.action.CAMERA_BUTTON", "android.intent.action.CONFIGURATION_CHANGED", "android.intent.action.DATE_CHANGED", "android.intent.action.DEVICE_STORAGE_LOW", "android.intent.action.DEVICE_STORAGE_OK", "android.intent.action.DOCK_EVENT", "android.intent.action.DREAMING_STARTED", "android.intent.action.DREAMING_STOPPED", "android.intent.action.INPUT_METHOD_CHANGED", "android.intent.action.LOCALE_CHANGED", "android.intent.action.SCREEN_OFF", "android.intent.action.SCREEN_ON", "android.intent.action.TIMEZONE_CHANGED", "android.intent.action.TIME_SET", "android.os.action.DEVICE_IDLE_MODE_CHANGED", "android.os.action.POWER_SAVE_MODE_CHANGED"};
        Context applicationContext = context.getApplicationContext();
        this.f12120d = applicationContext == null ? context : applicationContext;
        this.f12124w = strArr;
    }

    @Override // io.sentry.android.core.c0
    public final void c() {
        if (this.f12123v == null || this.f12122i == null) {
            return;
        }
        this.f12126y = false;
        g(this.f12123v, this.f12122i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        io.sentry.r rVarA = this.H.a();
        try {
            this.f12125x = true;
            this.E = null;
            if (this.F != null) {
                this.F.quit();
            }
            this.F = null;
            rVarA.close();
            f0.f12181w.i(this);
            SentryAndroidOptions sentryAndroidOptions = this.f12122i;
            if (sentryAndroidOptions != null) {
                try {
                    sentryAndroidOptions.getExecutorService().submit(new p(2, this));
                } catch (RejectedExecutionException unused) {
                    i();
                }
            }
            SentryAndroidOptions sentryAndroidOptions2 = this.f12122i;
            if (sentryAndroidOptions2 != null) {
                sentryAndroidOptions2.getLogger().q(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration removed.", new Object[0]);
            }
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.android.core.c0
    public final void f() {
        SentryAndroidOptions sentryAndroidOptions = this.f12122i;
        if (sentryAndroidOptions == null) {
            return;
        }
        try {
            sentryAndroidOptions.getExecutorService().submit(new p(2, this));
        } catch (RejectedExecutionException unused) {
            i();
        }
    }

    public final void g(v3 v3Var, SentryAndroidOptions sentryAndroidOptions) {
        if (sentryAndroidOptions.isEnableSystemEventBreadcrumbs() && !this.f12125x && !this.f12126y && this.f12121e == null) {
            try {
                sentryAndroidOptions.getExecutorService().submit(new c1(this, v3Var, sentryAndroidOptions));
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "Failed to start SystemEventsBreadcrumbsIntegration on executor thread.", new Object[0]);
            }
        }
    }

    public final void i() {
        io.sentry.r rVarA = this.H.a();
        try {
            this.f12126y = true;
            j1 j1Var = this.f12121e;
            this.f12121e = null;
            rVarA.close();
            if (j1Var != null) {
                this.f12120d.unregisterReceiver(j1Var);
            }
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // io.sentry.l1
    public final void register(io.sentry.x0 x0Var, w5 w5Var) {
        SentryAndroidOptions sentryAndroidOptions = w5Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) w5Var : null;
        com.facebook.imagepipeline.nativecode.c.H(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f12122i = sentryAndroidOptions;
        this.f12123v = v3.f13245a;
        sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f12122i.isEnableSystemEventBreadcrumbs()));
        if (this.f12122i.isEnableSystemEventBreadcrumbs()) {
            f0.f12181w.c(this);
            if (l0.i()) {
                g(this.f12123v, this.f12122i);
            }
        }
    }
}
