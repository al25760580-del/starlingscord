package com.google.android.gms.internal.play_billing;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z1 f6028a;

    static {
        j jVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            jVar = new j(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            jVar = new j(1);
        }
        f6028a = jVar;
    }
}
