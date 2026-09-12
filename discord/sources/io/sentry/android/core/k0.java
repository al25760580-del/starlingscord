package io.sentry.android.core;

import android.os.Build;
import io.sentry.ILogger;
import io.sentry.SentryLevel;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ILogger f12341a;

    public k0(ILogger iLogger) {
        com.facebook.imagepipeline.nativecode.c.H(iLogger, "The ILogger object is required.");
        this.f12341a = iLogger;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    public final Boolean a() {
        boolean z5;
        try {
            if (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic")) {
                z5 = true;
            } else {
                String str = Build.FINGERPRINT;
                if (str.startsWith("generic") || str.startsWith("unknown")) {
                    z5 = true;
                } else {
                    String str2 = Build.HARDWARE;
                    if (str2.contains("goldfish") || str2.contains("ranchu")) {
                        z5 = true;
                    } else {
                        String str3 = Build.MODEL;
                        if (str3.contains("google_sdk") || str3.contains("Emulator") || str3.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion")) {
                            z5 = true;
                        } else {
                            String str4 = Build.PRODUCT;
                            if (str4.contains("sdk_google") || str4.contains("google_sdk") || str4.contains("sdk") || str4.contains("sdk_x86") || str4.contains("vbox86p") || str4.contains("emulator") || str4.contains("simulator")) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                        }
                    }
                }
            }
            return Boolean.valueOf(z5);
        } catch (Throwable th2) {
            this.f12341a.g(SentryLevel.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}
