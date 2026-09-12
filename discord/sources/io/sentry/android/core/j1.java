package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.SentryLevel;
import java.nio.charset.Charset;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.x0 f12334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f12335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f12336c = new io.sentry.android.core.internal.util.g(LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f12337d = new char[64];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SystemEventsBreadcrumbsIntegration f12338e;

    public j1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.x0 x0Var, SentryAndroidOptions sentryAndroidOptions) {
        this.f12338e = systemEventsBreadcrumbsIntegration;
        this.f12334a = x0Var;
        this.f12335b = sentryAndroidOptions;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        i1 i1Var;
        Bundle extras;
        int i7;
        String action = intent.getAction();
        boolean zEquals = "android.intent.action.BATTERY_CHANGED".equals(action);
        SentryAndroidOptions sentryAndroidOptions = this.f12335b;
        String str = null;
        if (!zEquals) {
            i1Var = null;
        } else {
            if (this.f12336c.a()) {
                return;
            }
            Float fB = p0.b(intent, sentryAndroidOptions);
            i1Var = new i1(fB != null ? Integer.valueOf(fB.intValue()) : null, p0.d(intent, sentryAndroidOptions));
            SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = this.f12338e;
            if (i1Var.equals(systemEventsBreadcrumbsIntegration.I)) {
                return;
            } else {
                systemEventsBreadcrumbsIntegration.I = i1Var;
            }
        }
        Breadcrumb breadcrumb = new Breadcrumb(System.currentTimeMillis());
        breadcrumb.f12008w = "system";
        breadcrumb.f12010y = "device.event";
        if (action != null) {
            int length = action.length();
            char[] cArr = this.f12337d;
            int length2 = cArr.length;
            int i10 = length - 1;
            while (true) {
                if (i10 >= 0) {
                    char cCharAt = action.charAt(i10);
                    if (cCharAt == '.') {
                        str = new String(cArr, length2, cArr.length - length2);
                        break;
                    }
                    if (length2 == 0) {
                        Charset charset = io.sentry.util.l.f13233a;
                        int iLastIndexOf = action.lastIndexOf(".");
                        if (iLastIndexOf >= 0 && action.length() > (i7 = iLastIndexOf + 1)) {
                            str = action.substring(i7);
                            break;
                        }
                        break;
                    }
                    length2--;
                    cArr[length2] = cCharAt;
                    i10--;
                }
                str = action;
                break;
            }
        }
        if (str != null) {
            breadcrumb.c(str, "action");
        }
        if (i1Var != null) {
            Integer num = i1Var.f12226a;
            if (num != null) {
                breadcrumb.c(num, "level");
            }
            Boolean bool = i1Var.f12227b;
            if (bool != null) {
                breadcrumb.c(bool, "charging");
            }
        } else if (sentryAndroidOptions.isEnableSystemEventBreadcrumbsExtras() && (extras = intent.getExtras()) != null && !extras.isEmpty()) {
            HashMap map = new HashMap(extras.size());
            for (String str2 : extras.keySet()) {
                try {
                    Object obj = extras.get(str2);
                    if (obj != null) {
                        map.put(str2, obj.toString());
                    }
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().e(SentryLevel.ERROR, th2, "%s key of the %s action threw an error.", str2, action);
                }
            }
            breadcrumb.c(map, "extras");
        }
        breadcrumb.F = SentryLevel.INFO;
        Hint hint = new Hint();
        hint.d(intent, "android:intent");
        this.f12334a.g(breadcrumb, hint);
    }
}
