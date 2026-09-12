package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.v3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements Runnable {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final long f12328x = TimeUnit.DAYS.toMillis(91);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f12329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v3 f12330e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SentryAndroidOptions f12331i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i0 f12332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f12333w;

    public j0(Context context, SentryAndroidOptions sentryAndroidOptions, io.sentry.transport.d dVar, i0 i0Var) {
        Context applicationContext = context.getApplicationContext();
        this.f12329d = applicationContext != null ? applicationContext : context;
        this.f12330e = v3.f13245a;
        this.f12331i = sentryAndroidOptions;
        this.f12332v = i0Var;
        dVar.getClass();
        this.f12333w = System.currentTimeMillis() - f12328x;
    }

    public final void a(ApplicationExitInfo applicationExitInfo, boolean z5) {
        i0 i0Var = this.f12332v;
        e4.m mVarD = i0Var.d(applicationExitInfo, z5);
        if (mVarD == null) {
            return;
        }
        SentryEvent sentryEvent = (SentryEvent) mVarD.f7993e;
        if (this.f12330e.x(sentryEvent, (Hint) mVarD.f7994i).equals(io.sentry.protocol.v.f13055e) || ((io.sentry.hints.c) mVarD.f7995v).d()) {
            return;
        }
        this.f12331i.getLogger().q(SentryLevel.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", i0Var.getLabel(), sentryEvent.f12670d);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager activityManager = (ActivityManager) this.f12329d.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.f12331i;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        ApplicationExitInfo applicationExitInfo = null;
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            if (!cVar.i()) {
                sentryAndroidOptions.getLogger().q(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                cVar.f12534w.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        i0 i0Var = this.f12332v;
        Long lB = i0Var.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoC = com.google.firebase.messaging.n.c(it.next());
            if (applicationExitInfoC.getReason() == i0Var.a()) {
                it.remove();
                applicationExitInfo = applicationExitInfoC;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "No %ss have been found in the historical exit reasons list.", i0Var.getLabel());
            return;
        }
        long timestamp = applicationExitInfo.getTimestamp();
        long j = this.f12333w;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Latest %s happened too long ago, returning early.", i0Var.getLabel());
            return;
        }
        if (lB != null && applicationExitInfo.getTimestamp() <= lB.longValue()) {
            sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "Latest %s has already been reported, returning early.", i0Var.getLabel());
            return;
        }
        if (i0Var.c()) {
            Collections.reverse(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApplicationExitInfo applicationExitInfoC2 = com.google.firebase.messaging.n.c(it2.next());
                if (applicationExitInfoC2.getReason() == i0Var.a()) {
                    if (applicationExitInfoC2.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "%s happened too long ago %s.", i0Var.getLabel(), applicationExitInfoC2);
                    } else if (lB == null || applicationExitInfoC2.getTimestamp() > lB.longValue()) {
                        a(applicationExitInfoC2, false);
                    } else {
                        sentryAndroidOptions.getLogger().q(SentryLevel.DEBUG, "%s has already been reported %s.", i0Var.getLabel(), applicationExitInfoC2);
                    }
                }
            }
        }
        a(applicationExitInfo, true);
    }
}
