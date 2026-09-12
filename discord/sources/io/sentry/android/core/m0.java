package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.w5;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 implements ILogger, io.sentry.transport.h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final m0 f12349e = new m0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f12350d;

    public /* synthetic */ m0(Object obj) {
        this.f12350d = obj;
    }

    public void a(Activity activity) {
        WeakReference weakReference = (WeakReference) this.f12350d;
        if (weakReference == null || weakReference.get() != activity) {
            this.f12350d = new WeakReference(activity);
        }
    }

    @Override // io.sentry.ILogger
    public void e(SentryLevel sentryLevel, Throwable th2, String str, Object... objArr) {
        if (objArr.length == 0) {
            g(sentryLevel, str, th2);
        } else {
            g(sentryLevel, String.format(str, objArr), th2);
        }
    }

    @Override // io.sentry.ILogger
    public void g(SentryLevel sentryLevel, String str, Throwable th2) {
        String str2 = (String) this.f12350d;
        int i7 = j.f12327a[sentryLevel.ordinal()];
        if (i7 == 1) {
            Log.i(str2, str, th2);
            return;
        }
        if (i7 == 2) {
            Log.w(str2, str, th2);
            return;
        }
        if (i7 == 3) {
            Log.e(str2, str, th2);
        } else if (i7 != 4) {
            Log.d(str2, str, th2);
        } else {
            Log.wtf(str2, str, th2);
        }
    }

    @Override // io.sentry.transport.h
    public boolean isConnected() {
        int i7 = w.f12439a[((w5) this.f12350d).getConnectionStatusProvider().I().ordinal()];
        return i7 == 1 || i7 == 2 || i7 == 3;
    }

    @Override // io.sentry.ILogger
    public void q(SentryLevel sentryLevel, String str, Object... objArr) {
        String str2 = (String) this.f12350d;
        int i7 = 5;
        if (objArr.length == 0) {
            int i10 = j.f12327a[sentryLevel.ordinal()];
            if (i10 == 1) {
                i7 = 4;
            } else if (i10 != 2) {
                i7 = i10 != 4 ? 3 : 7;
            }
            Log.println(i7, str2, str);
            return;
        }
        int i11 = j.f12327a[sentryLevel.ordinal()];
        if (i11 == 1) {
            i7 = 4;
        } else if (i11 != 2) {
            i7 = i11 != 4 ? 3 : 7;
        }
        Log.println(i7, str2, String.format(str, objArr));
    }

    @Override // io.sentry.ILogger
    public boolean s(SentryLevel sentryLevel) {
        return true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m0(int i7) {
        this("Sentry");
        switch (i7) {
            case 3:
                this.f12350d = new Handler(Looper.getMainLooper());
                break;
            default:
                break;
        }
    }
}
