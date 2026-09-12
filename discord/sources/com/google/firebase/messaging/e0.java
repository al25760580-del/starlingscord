package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f6576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Intent f6577e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f6578i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ArrayDeque f6579v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c0 f6580w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f6581x;

    public e0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new a5.u("Firebase-FirebaseInstanceIdServiceConnection", 1));
        this.f6579v = new ArrayDeque();
        this.f6581x = false;
        Context applicationContext = context.getApplicationContext();
        this.f6576d = applicationContext;
        this.f6577e = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f6578i = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f6579v.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                c0 c0Var = this.f6580w;
                if (c0Var == null || !c0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f6580w.a((d0) this.f6579v.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized ig.l b(Intent intent) {
        d0 d0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            d0Var = new d0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f6578i;
            d0Var.f6574b.f11763a.b(scheduledThreadPoolExecutor, new app.rive.runtime.kotlin.core.a(20, scheduledThreadPoolExecutor.schedule(new s(1, d0Var), 20L, TimeUnit.SECONDS)));
            this.f6579v.add(d0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return d0Var.f6574b.f11763a;
    }

    public final void c() {
        e0 e0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.f6581x);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.f6581x) {
            return;
        }
        this.f6581x = true;
        try {
            ef.a aVarA = ef.a.a();
            Context context = this.f6576d;
            e0Var = this;
            try {
                if (aVarA.c(context, context.getClass().getName(), this.f6577e, e0Var, 65, null)) {
                    return;
                } else {
                    Log.e("FirebaseMessaging", "binding to the service failed");
                }
                while (true) {
                    ArrayDeque arrayDeque = e0Var.f6579v;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((d0) arrayDeque.poll()).f6574b.d(null);
                    }
                }
            } catch (SecurityException e10) {
                e = e10;
                Log.e("FirebaseMessaging", "Exception while binding the service", e);
            }
        } catch (SecurityException e11) {
            e = e11;
            e0Var = this;
        }
        e0Var.f6581x = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f6581x = false;
            if (iBinder instanceof c0) {
                this.f6580w = (c0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f6579v;
            while (!arrayDeque.isEmpty()) {
                ((d0) arrayDeque.poll()).f6574b.d(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
