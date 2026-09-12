package com.google.firebase.messaging;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PowerManager.WakeLock f6621e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FirebaseMessaging f6622i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ThreadPoolExecutor f6623v = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a5.u("firebase-iid-executor", 1));

    public u(FirebaseMessaging firebaseMessaging, long j) {
        this.f6622i = firebaseMessaging;
        this.f6620d = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.f6532b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6621e = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public final boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f6622i.f6532b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final boolean b() throws IOException {
        try {
            if (this.f6622i.a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e10) {
            String message = e10.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e10.getMessage() != null) {
                    throw e10;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e10.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock = this.f6621e;
        r rVarF = r.f();
        FirebaseMessaging firebaseMessaging = this.f6622i;
        if (rVarF.l(firebaseMessaging.f6532b)) {
            wakeLock.acquire();
        }
        try {
            try {
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f6539i = true;
                }
                if (!firebaseMessaging.f6538h.e()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f6539i = false;
                    }
                    if (r.f().l(firebaseMessaging.f6532b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (r.f().k(firebaseMessaging.f6532b) && !a()) {
                    c4.d dVar = new c4.d();
                    dVar.f3451b = this;
                    dVar.a();
                    if (r.f().l(firebaseMessaging.f6532b)) {
                        wakeLock.release();
                        return;
                    }
                    return;
                }
                if (b()) {
                    synchronized (firebaseMessaging) {
                        firebaseMessaging.f6539i = false;
                    }
                } else {
                    firebaseMessaging.g(this.f6620d);
                }
                if (r.f().l(firebaseMessaging.f6532b)) {
                    wakeLock.release();
                }
            } catch (IOException e10) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e10.getMessage() + ". Won't retry the operation.");
                synchronized (firebaseMessaging) {
                    firebaseMessaging.f6539i = false;
                    if (r.f().l(firebaseMessaging.f6532b)) {
                        wakeLock.release();
                    }
                }
            }
        } catch (Throwable th2) {
            if (r.f().l(firebaseMessaging.f6532b)) {
                wakeLock.release();
            }
            throw th2;
        }
    }
}
