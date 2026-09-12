package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f12344a = new io.sentry.android.core.util.a(new hm.a(18));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f12345b = new io.sentry.android.core.util.a(new hm.a(19));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f12346c = new io.sentry.android.core.util.a(new hm.a(20));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f12347d = new io.sentry.android.core.util.a(new hm.a(21));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final io.sentry.android.core.util.a f12348e = new io.sentry.android.core.util.a(new hm.a(22));

    public static /* synthetic */ ApplicationInfo a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* synthetic */ PackageInfo b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c(Context context) {
        if (!context.getPackageName().endsWith(".test")) {
            return false;
        }
        try {
            Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
            while (it.hasNext()) {
                ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String d(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            iLogger.g(SentryLevel.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    public static ActivityManager.MemoryInfo e(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.q(SentryLevel.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            iLogger.g(SentryLevel.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    public static PackageInfo f(Context context, ILogger iLogger, k0 k0Var) {
        try {
            k0Var.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT)) : context.getPackageManager().getPackageInfo(context.getPackageName(), RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT);
        } catch (Throwable th2) {
            iLogger.g(SentryLevel.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    public static PackageInfo g(Context context, k0 k0Var) {
        k0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? (PackageInfo) f12344a.a(context) : (PackageInfo) f12345b.a(context);
    }

    public static String h(PackageInfo packageInfo, k0 k0Var) {
        k0Var.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean i() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Intent j(Context context, k0 k0Var, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, Handler handler) {
        k0Var.getClass();
        return Build.VERSION.SDK_INT >= 33 ? context.registerReceiver(broadcastReceiver, intentFilter, null, handler, 4) : context.registerReceiver(broadcastReceiver, intentFilter, null, handler);
    }

    public static void k(PackageInfo packageInfo, k0 k0Var, p0 p0Var, io.sentry.protocol.a aVar) {
        aVar.f12907d = packageInfo.packageName;
        aVar.f12912x = packageInfo.versionName;
        aVar.f12913y = h(packageInfo, k0Var);
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i7 = 0; i7 < strArr.length; i7++) {
                String str = strArr[i7];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i7] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        aVar.E = map;
        if (p0Var != null) {
            try {
                a5.i0 i0Var = p0Var.f12364f;
                if (i0Var != null) {
                    aVar.I = Boolean.valueOf(i0Var.f214e);
                    String[] strArr2 = (String[]) i0Var.f215i;
                    if (strArr2 != null) {
                        aVar.J = Arrays.asList(strArr2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
