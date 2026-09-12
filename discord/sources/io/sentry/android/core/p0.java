package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.w5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static volatile p0 f12358i;
    public static final io.sentry.util.a j = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f12360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f12361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f12362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a3.n f12363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a5.i0 f12364f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final io.sentry.protocol.o f12365g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f12366h;

    public p0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        a3.n nVar;
        a5.i0 i0Var;
        Bundle bundle;
        this.f12359a = context;
        this.f12360b = sentryAndroidOptions;
        this.f12361c = new k0(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.f.f12292c.a();
        io.sentry.protocol.o oVar = new io.sentry.protocol.o();
        oVar.f13006d = "Android";
        oVar.f13007e = Build.VERSION.RELEASE;
        oVar.f13009v = Build.DISPLAY;
        ILogger logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    property = line;
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                logger.g(SentryLevel.ERROR, "Exception while attempting to read kernel information", e10);
            }
        }
        if (property != null) {
            oVar.f13010w = property;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            oVar.f13011x = Boolean.valueOf(new io.sentry.android.core.internal.util.i(this.f12359a, sentryAndroidOptions.getLogger(), this.f12361c).a());
        }
        this.f12365g = oVar;
        this.f12362d = this.f12361c.a();
        ILogger logger2 = sentryAndroidOptions.getLogger();
        boolean z5 = false;
        try {
            PackageInfo packageInfoG = l0.g(context, this.f12361c);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoG == null || packageManager == null) {
                nVar = null;
            } else {
                str = packageInfoG.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    nVar = new a3.n(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    logger2.q(SentryLevel.DEBUG, "%s package isn't installed.", str);
                    nVar = null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        this.f12363e = nVar;
        k0 k0Var = this.f12361c;
        k0Var.getClass();
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) l0.f12347d.a(context) : (ApplicationInfo) l0.f12348e.a(context);
        PackageInfo packageInfoG2 = l0.g(context, k0Var);
        if (packageInfoG2 != null) {
            String[] strArr = packageInfoG2.splitNames;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                z5 = bundle.getBoolean("com.android.vending.splits.required");
            }
            i0Var = new a5.i0(strArr, z5);
        } else {
            i0Var = null;
        }
        this.f12364f = i0Var;
        ActivityManager.MemoryInfo memoryInfoE = l0.e(context, sentryAndroidOptions.getLogger());
        if (memoryInfoE != null) {
            this.f12366h = Long.valueOf(memoryInfoE.totalMem);
        } else {
            this.f12366h = null;
        }
    }

    public static Float b(Intent intent, w5 w5Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    public static p0 c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (f12358i == null) {
            io.sentry.r rVarA = j.a();
            try {
                if (f12358i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    f12358i = new p0(context, sentryAndroidOptions);
                }
                rVarA.close();
            } catch (Throwable th2) {
                try {
                    rVarA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return f12358i;
    }

    public static Boolean d(Intent intent, w5 w5Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z5 = true;
            if (intExtra != 1 && intExtra != 2) {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        } catch (Throwable th2) {
            w5Var.getLogger().g(SentryLevel.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0094  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:41:0x010c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:54:0x0155  */
    /* JADX WARN: Code duplicated, block: B:57:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x018c  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a1 A[Catch: all -> 0x01aa, TRY_LEAVE, TryCatch #3 {all -> 0x01aa, blocks: (B:62:0x0198, B:64:0x01a1), top: B:91:0x0198 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final io.sentry.protocol.f a(boolean z5, boolean z6) {
        io.sentry.protocol.e eVar;
        Boolean bool;
        ILogger logger;
        DisplayMetrics displayMetrics;
        Date dateZ;
        LocaleList locales;
        TimeZone timeZone;
        String str;
        Locale locale;
        ArrayList arrayListA;
        Intent intentJ;
        int i7;
        ActivityManager.MemoryInfo memoryInfoE;
        Float fValueOf;
        int intExtra;
        Context context = this.f12359a;
        io.sentry.protocol.f fVar = new io.sentry.protocol.f();
        fVar.f12941e = Build.MANUFACTURER;
        fVar.f12944i = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.f12360b;
        fVar.f12945v = l0.d(sentryAndroidOptions.getLogger());
        fVar.f12946w = Build.MODEL;
        fVar.f12947x = Build.ID;
        fVar.f12948y = Build.SUPPORTED_ABIS;
        k0 k0Var = this.f12361c;
        k0Var.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            fVar.f12942e0 = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Boolean bool2 = null;
        try {
            int i10 = context.getResources().getConfiguration().orientation;
            try {
                try {
                    try {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                eVar = null;
                            } else {
                                eVar = io.sentry.protocol.e.LANDSCAPE;
                            }
                            if (eVar == null) {
                                try {
                                    sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                                    eVar = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting device orientation.", th);
                                }
                            }
                            fVar.H = eVar;
                            bool = this.f12362d;
                            if (bool != null) {
                                fVar.I = bool;
                            }
                            logger = sentryAndroidOptions.getLogger();
                            displayMetrics = context.getResources().getDisplayMetrics();
                            if (displayMetrics != null) {
                                fVar.R = Integer.valueOf(displayMetrics.widthPixels);
                                fVar.S = Integer.valueOf(displayMetrics.heightPixels);
                                fVar.T = Float.valueOf(displayMetrics.density);
                                fVar.U = Integer.valueOf(displayMetrics.densityDpi);
                            }
                            dateZ = io.sentry.config.a.z(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                            fVar.V = dateZ;
                            locales = context.getResources().getConfiguration().getLocales();
                            if (locales.isEmpty()) {
                                timeZone = Calendar.getInstance().getTimeZone();
                            } else {
                                timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                            }
                            fVar.W = timeZone;
                            if (fVar.X == null) {
                                try {
                                    str = (String) sentryAndroidOptions.getRuntimeManager().h(new gc.o(15, this));
                                } catch (Throwable th3) {
                                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting installationId.", th3);
                                    str = null;
                                }
                                fVar.X = str;
                            }
                            locale = Locale.getDefault();
                            if (fVar.Y == null) {
                                fVar.Y = locale.toString();
                            }
                            arrayListA = io.sentry.android.core.internal.util.f.f12292c.a();
                            if (!arrayListA.isEmpty()) {
                                fVar.f12938c0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                                fVar.f12937b0 = Integer.valueOf(arrayListA.size());
                            }
                            fVar.J = this.f12366h;
                            if (z5 && sentryAndroidOptions.isCollectAdditionalContext()) {
                                boolean zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                                intentJ = l0.j(context, k0Var, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
                                if (intentJ != null) {
                                    fVar.E = b(intentJ, sentryAndroidOptions);
                                    fVar.F = d(intentJ, sentryAndroidOptions);
                                    try {
                                        intExtra = intentJ.getIntExtra("temperature", -1);
                                        if (intExtra != -1) {
                                            fValueOf = Float.valueOf(intExtra / 10.0f);
                                        } else {
                                            fValueOf = null;
                                        }
                                    } catch (Throwable th4) {
                                        sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting battery temperature.", th4);
                                    }
                                    fVar.a0 = fValueOf;
                                }
                                i7 = o0.f12355a[sentryAndroidOptions.getConnectionStatusProvider().I().ordinal()];
                                if (i7 == 1) {
                                    bool2 = Boolean.FALSE;
                                } else if (i7 == 2) {
                                    bool2 = Boolean.TRUE;
                                }
                                fVar.G = bool2;
                                memoryInfoE = l0.e(context, sentryAndroidOptions.getLogger());
                                if (memoryInfoE != null && z6) {
                                    fVar.K = Long.valueOf(memoryInfoE.availMem);
                                    fVar.M = Boolean.valueOf(memoryInfoE.lowMemory);
                                }
                                sentryAndroidOptions.getRuntimeManager().c(new com.discord.chat.presentation.message.view.a0(this, fVar, zIsCollectExternalStorageContext));
                                if (fVar.Z == null) {
                                    fVar.Z = sentryAndroidOptions.getConnectionStatusProvider().r();
                                }
                            }
                            return fVar;
                        }
                        eVar = io.sentry.protocol.e.PORTRAIT;
                        dateZ = io.sentry.config.a.z(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                    } catch (IllegalArgumentException e10) {
                        sentryAndroidOptions.getLogger().e(SentryLevel.ERROR, e10, "Error getting the device's boot time.", new Object[0]);
                        dateZ = null;
                    }
                    if (eVar == null) {
                        sentryAndroidOptions.getLogger().q(SentryLevel.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                        eVar = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    eVar = null;
                    sentryAndroidOptions.getLogger().g(SentryLevel.ERROR, "Error getting device orientation.", th);
                    fVar.H = eVar;
                    bool = this.f12362d;
                    if (bool != null) {
                        fVar.I = bool;
                    }
                    logger = sentryAndroidOptions.getLogger();
                    displayMetrics = context.getResources().getDisplayMetrics();
                    if (displayMetrics != null) {
                        fVar.R = Integer.valueOf(displayMetrics.widthPixels);
                        fVar.S = Integer.valueOf(displayMetrics.heightPixels);
                        fVar.T = Float.valueOf(displayMetrics.density);
                        fVar.U = Integer.valueOf(displayMetrics.densityDpi);
                    }
                    dateZ = io.sentry.config.a.z(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                    fVar.V = dateZ;
                    locales = context.getResources().getConfiguration().getLocales();
                    if (locales.isEmpty()) {
                        timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
                    } else {
                        timeZone = Calendar.getInstance().getTimeZone();
                    }
                    fVar.W = timeZone;
                    if (fVar.X == null) {
                        str = (String) sentryAndroidOptions.getRuntimeManager().h(new gc.o(15, this));
                        fVar.X = str;
                    }
                    locale = Locale.getDefault();
                    if (fVar.Y == null) {
                        fVar.Y = locale.toString();
                    }
                    arrayListA = io.sentry.android.core.internal.util.f.f12292c.a();
                    if (!arrayListA.isEmpty()) {
                        fVar.f12938c0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                        fVar.f12937b0 = Integer.valueOf(arrayListA.size());
                    }
                    fVar.J = this.f12366h;
                    if (z5) {
                        boolean zIsCollectExternalStorageContext2 = sentryAndroidOptions.isCollectExternalStorageContext();
                        intentJ = l0.j(context, k0Var, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
                        if (intentJ != null) {
                            fVar.E = b(intentJ, sentryAndroidOptions);
                            fVar.F = d(intentJ, sentryAndroidOptions);
                            intExtra = intentJ.getIntExtra("temperature", -1);
                            if (intExtra != -1) {
                                fValueOf = Float.valueOf(intExtra / 10.0f);
                            } else {
                                fValueOf = null;
                            }
                            fVar.a0 = fValueOf;
                        }
                        i7 = o0.f12355a[sentryAndroidOptions.getConnectionStatusProvider().I().ordinal()];
                        if (i7 == 1) {
                            bool2 = Boolean.FALSE;
                        } else if (i7 == 2) {
                            bool2 = Boolean.TRUE;
                        }
                        fVar.G = bool2;
                        memoryInfoE = l0.e(context, sentryAndroidOptions.getLogger());
                        if (memoryInfoE != null) {
                            fVar.K = Long.valueOf(memoryInfoE.availMem);
                            fVar.M = Boolean.valueOf(memoryInfoE.lowMemory);
                        }
                        sentryAndroidOptions.getRuntimeManager().c(new com.discord.chat.presentation.message.view.a0(this, fVar, zIsCollectExternalStorageContext2));
                        if (fVar.Z == null) {
                            fVar.Z = sentryAndroidOptions.getConnectionStatusProvider().r();
                        }
                    }
                    return fVar;
                }
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th6) {
                logger.g(SentryLevel.ERROR, "Error getting DisplayMetrics.", th6);
                displayMetrics = null;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        fVar.H = eVar;
        bool = this.f12362d;
        if (bool != null) {
            fVar.I = bool;
        }
        logger = sentryAndroidOptions.getLogger();
        if (displayMetrics != null) {
            fVar.R = Integer.valueOf(displayMetrics.widthPixels);
            fVar.S = Integer.valueOf(displayMetrics.heightPixels);
            fVar.T = Float.valueOf(displayMetrics.density);
            fVar.U = Integer.valueOf(displayMetrics.densityDpi);
        }
        fVar.V = dateZ;
        locales = context.getResources().getConfiguration().getLocales();
        if (locales.isEmpty()) {
            timeZone = Calendar.getInstance(locales.get(0)).getTimeZone();
        } else {
            timeZone = Calendar.getInstance().getTimeZone();
        }
        fVar.W = timeZone;
        if (fVar.X == null) {
            str = (String) sentryAndroidOptions.getRuntimeManager().h(new gc.o(15, this));
            fVar.X = str;
        }
        locale = Locale.getDefault();
        if (fVar.Y == null) {
            fVar.Y = locale.toString();
        }
        arrayListA = io.sentry.android.core.internal.util.f.f12292c.a();
        if (!arrayListA.isEmpty()) {
            fVar.f12938c0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
            fVar.f12937b0 = Integer.valueOf(arrayListA.size());
        }
        fVar.J = this.f12366h;
        if (z5) {
            boolean zIsCollectExternalStorageContext3 = sentryAndroidOptions.isCollectExternalStorageContext();
            intentJ = l0.j(context, k0Var, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null);
            if (intentJ != null) {
                fVar.E = b(intentJ, sentryAndroidOptions);
                fVar.F = d(intentJ, sentryAndroidOptions);
                intExtra = intentJ.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf = Float.valueOf(intExtra / 10.0f);
                } else {
                    fValueOf = null;
                }
                fVar.a0 = fValueOf;
            }
            i7 = o0.f12355a[sentryAndroidOptions.getConnectionStatusProvider().I().ordinal()];
            if (i7 == 1) {
                bool2 = Boolean.FALSE;
            } else if (i7 == 2) {
                bool2 = Boolean.TRUE;
            }
            fVar.G = bool2;
            memoryInfoE = l0.e(context, sentryAndroidOptions.getLogger());
            if (memoryInfoE != null) {
                fVar.K = Long.valueOf(memoryInfoE.availMem);
                fVar.M = Boolean.valueOf(memoryInfoE.lowMemory);
            }
            sentryAndroidOptions.getRuntimeManager().c(new com.discord.chat.presentation.message.view.a0(this, fVar, zIsCollectExternalStorageContext3));
            if (fVar.Z == null) {
                fVar.Z = sentryAndroidOptions.getConnectionStatusProvider().r();
            }
        }
        return fVar;
    }
}
