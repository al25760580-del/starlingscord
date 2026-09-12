package com.google.firebase.messaging;

import a5.l0;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat$Builder;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f6586c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e0 f6587d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6589b;

    public h(ExecutorService executorService) {
        this.f6589b = new s.e(0);
        this.f6588a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z5) {
        e0 e0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f6586c) {
            try {
                if (f6587d == null) {
                    f6587d = new e0(context);
                }
                e0Var = f6587d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z5) {
            return e0Var.b(intent).f(new com.discord.misc.utilities.threading.a(1), new com.facebook.react.a(28));
        }
        if (r.f().l(context)) {
            synchronized (b0.f6566b) {
                try {
                    if (b0.f6567c == null) {
                        hg.a aVar = new hg.a(context, "wake:com.google.firebase.iid.WakeLockHolder");
                        b0.f6567c = aVar;
                        synchronized (aVar.f10732a) {
                            aVar.f10738g = true;
                        }
                    }
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        b0.f6567c.a(b0.f6565a);
                    }
                    e0Var.b(intent).addOnCompleteListener(new app.rive.runtime.kotlin.core.a(18, intent));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            e0Var.b(intent);
        }
        return l0.v(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f6588a;
        com.discord.misc.utilities.threading.a aVar = (com.discord.misc.utilities.threading.a) this.f6589b;
        boolean z5 = ff.c.c() && context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z6 = (intent.getFlags() & 268435456) != 0;
        return (!z5 || z6) ? l0.k(new com.facebook.react.runtime.o(1, context, intent), aVar).g(aVar, new g(context, intent, z6)) : a(context, intent, z6);
    }

    public h(Context context) {
        this.f6588a = context;
        this.f6589b = new com.discord.misc.utilities.threading.a(1);
    }

    public h(NotificationCompat$Builder notificationCompat$Builder, String str) {
        this.f6588a = notificationCompat$Builder;
        this.f6589b = str;
    }
}
