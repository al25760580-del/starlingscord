package io.sentry.android.core.internal.util;

import io.sentry.r;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f12292c = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io.sentry.util.a f12293a = new io.sentry.util.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f12294b = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = this.f12294b;
        r rVarA = this.f12293a.a();
        try {
            if (!arrayList.isEmpty()) {
                rVarA.close();
                return arrayList;
            }
            File[] fileArrListFiles = new File("/sys/devices/system/cpu").listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList2 = new ArrayList();
                rVarA.close();
                return arrayList2;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    try {
                        String strY = a.a.y(new File(file, "cpufreq/cpuinfo_max_freq"));
                        if (strY != null) {
                            arrayList.add(Integer.valueOf((int) (Long.parseLong(strY.trim()) / 1000)));
                        }
                    } catch (IOException | NumberFormatException unused) {
                    }
                }
            }
            rVarA.close();
            return arrayList;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
