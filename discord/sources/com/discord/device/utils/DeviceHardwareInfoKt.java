package com.discord.device.utils;

import a3.e;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Locale;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.x;
import ls.d;
import ls.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\b\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\b\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\b\u0010\b\u001a\u00020\u0001H\u0000¨\u0006\t"}, d2 = {"getSocFromProcCpuInfo", "", "getNumCpuCores", "", "ramSize", "context", "Landroid/content/Context;", "maxCpuFreq", "socName", "device_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceHardwareInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceHardwareInfo.kt\ncom/discord/device/utils/DeviceHardwareInfoKt\n+ 2 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n57#2:73\n1#3:74\n1#3:75\n*S KotlinDebug\n*F\n+ 1 DeviceHardwareInfo.kt\ncom/discord/device/utils/DeviceHardwareInfoKt\n*L\n10#1:73\n10#1:74\n*E\n"})
public final class DeviceHardwareInfoKt {
    public static final int getNumCpuCores() {
        return Runtime.getRuntime().availableProcessors();
    }

    @NotNull
    public static final String getSocFromProcCpuInfo() {
        Object next;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/proc/cpuinfo")), Charsets.UTF_8), 8192);
            try {
                Iterator it = l.t(bufferedReader).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!x.o((String) next, "Hardware", false));
                String str = (String) next;
                String string = str != null ? StringsKt.b0((String) StringsKt__StringsKt.split$default(str, new String[]{":"}, false, 0, 6, null).get(1)).toString() : "";
                bufferedReader.close();
                return string;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    d.k(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    @NotNull
    public static final String maxCpuFreq() {
        int numCpuCores = getNumCpuCores();
        long j = 0;
        for (int i7 = 0; i7 < numCpuCores; i7++) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(new File("/sys/devices/system/cpu/cpu" + i7 + "/cpufreq/cpuinfo_max_freq")), Charsets.UTF_8), 8192);
                try {
                    String line = bufferedReader.readLine();
                    Intrinsics.checkNotNullExpressionValue(line, "readLine(...)");
                    Long lA0 = StringsKt.a0(line);
                    long jLongValue = lA0 != null ? lA0.longValue() : 0L;
                    if (jLongValue > j) {
                        j = jLongValue;
                    }
                    Unit unit = Unit.f14616a;
                    bufferedReader.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        d.k(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Exception unused) {
            }
        }
        if (j <= 0) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return e.q(new Object[]{Double.valueOf(j / 1000000.0d)}, 1, Locale.getDefault(), "%.2f", "format(...)");
    }

    @NotNull
    public static final String ramSize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
        double d6 = memoryInfo.totalMem / 1.073741824E9d;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return e.q(new Object[]{Double.valueOf(d6)}, 1, Locale.getDefault(), "%.2f", "format(...)");
    }

    @NotNull
    public static final String socName() {
        if (Build.VERSION.SDK_INT < 31) {
            return getSocFromProcCpuInfo();
        }
        String SOC_MANUFACTURER = Build.SOC_MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(SOC_MANUFACTURER, "SOC_MANUFACTURER");
        if (SOC_MANUFACTURER.length() == 0) {
            String SOC_MODEL = Build.SOC_MODEL;
            Intrinsics.checkNotNullExpressionValue(SOC_MODEL, "SOC_MODEL");
            if (SOC_MODEL.length() == 0) {
                return getSocFromProcCpuInfo();
            }
        }
        return b.k(SOC_MANUFACTURER, "_", Build.SOC_MODEL);
    }
}
