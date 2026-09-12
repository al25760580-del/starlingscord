package io.sentry.android.core.internal.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.core.k0;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Charset f12303g = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f12304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f12305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ILogger f12306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f12307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f12308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Runtime f12309f;

    public i(Context context, ILogger iLogger, k0 k0Var) {
        Runtime runtime = Runtime.getRuntime();
        this.f12304a = context;
        com.facebook.imagepipeline.nativecode.c.H(k0Var, "The BuildInfoProvider is required.");
        this.f12305b = k0Var;
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "The Logger is required.");
        this.f12306c = iLogger;
        this.f12307d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
        this.f12308e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
        com.facebook.imagepipeline.nativecode.c.H(runtime, "The Runtime is required.");
        this.f12309f = runtime;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007f  */
    public final boolean a() {
        boolean z5;
        boolean z6;
        this.f12305b.getClass();
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        String[] strArr = this.f12307d;
        int length = strArr.length;
        int i7 = 0;
        while (true) {
            ILogger iLogger = this.f12306c;
            if (i7 < length) {
                String str2 = strArr[i7];
                try {
                    if (new File(str2).exists()) {
                        return true;
                    }
                    i7++;
                } catch (RuntimeException e10) {
                    iLogger.e(SentryLevel.ERROR, e10, "Error when trying to check if root file %s exists.", str2);
                }
            } else {
                Process process = null;
                try {
                    try {
                        try {
                            Process processExec = this.f12309f.exec(new String[]{"/system/xbin/which", "su"});
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), f12303g));
                            try {
                                z5 = bufferedReader.readLine() != null;
                                bufferedReader.close();
                                processExec.destroy();
                                if (z5) {
                                    return true;
                                }
                                com.facebook.imagepipeline.nativecode.c.H(iLogger, "The ILogger object is required.");
                                PackageManager packageManager = this.f12304a.getPackageManager();
                                if (packageManager != null) {
                                    for (String str3 : this.f12308e) {
                                        try {
                                            if (Build.VERSION.SDK_INT >= 33) {
                                                packageManager.getPackageInfo(str3, PackageManager.PackageInfoFlags.of(0L));
                                            } else {
                                                packageManager.getPackageInfo(str3, 0);
                                            }
                                            z6 = true;
                                        } catch (PackageManager.NameNotFoundException unused) {
                                        }
                                    }
                                    z6 = false;
                                } else {
                                    z6 = false;
                                }
                                return z6;
                            } catch (Throwable th2) {
                                try {
                                    bufferedReader.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                                throw th2;
                            }
                        } catch (IOException unused2) {
                            iLogger.q(SentryLevel.DEBUG, "SU isn't found on this Device.", new Object[0]);
                            if (0 != 0) {
                                process.destroy();
                            }
                            z5 = false;
                        }
                    } catch (Throwable th4) {
                        iLogger.g(SentryLevel.DEBUG, "Error when trying to check if SU exists.", th4);
                        if (0 != 0) {
                            process.destroy();
                        }
                        z5 = false;
                    }
                } catch (Throwable th5) {
                    if (0 != 0) {
                        process.destroy();
                    }
                    throw th5;
                }
            }
        }
    }
}
