package com.google.firebase.messaging;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 implements Runnable {
    public static Boolean E;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f6556x = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static Boolean f6557y;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f6558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f6559e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PowerManager.WakeLock f6560i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y f6561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f6562w;

    public a0(y yVar, Context context, p pVar, long j) {
        this.f6561v = yVar;
        this.f6558d = context;
        this.f6562w = j;
        this.f6559e = pVar;
        this.f6560i = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (f6556x) {
            try {
                Boolean bool = E;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                E = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z5 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z5 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z5;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (f6556x) {
            try {
                Boolean bool = f6557y;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f6557y = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zBooleanValue;
    }

    public final synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f6558d.getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th2) {
            throw th2;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        y yVar = this.f6561v;
        Context context = this.f6558d;
        boolean zC = c(context);
        PowerManager.WakeLock wakeLock = this.f6560i;
        if (zC) {
            wakeLock.acquire(f.f6582a);
        }
        try {
            try {
                try {
                    yVar.d(true);
                    if (!this.f6559e.e()) {
                        yVar.d(false);
                        if (c(context)) {
                            try {
                                wakeLock.release();
                                return;
                            } catch (RuntimeException unused) {
                                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                                return;
                            }
                        }
                        return;
                    }
                    if (!a(context) || d()) {
                        if (yVar.e()) {
                            yVar.d(false);
                        } else {
                            yVar.f(this.f6562w);
                        }
                        if (c(context)) {
                            wakeLock.release();
                            return;
                        }
                        return;
                    }
                    new z(this, this).a();
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } catch (IOException e10) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e10.getMessage());
                    yVar.d(false);
                    if (c(context)) {
                        wakeLock.release();
                    }
                }
            } catch (RuntimeException unused3) {
                Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
            }
        } catch (Throwable th2) {
            if (c(context)) {
                try {
                    wakeLock.release();
                } catch (RuntimeException unused4) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
            throw th2;
        }
    }
}
