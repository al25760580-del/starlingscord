package com.discord.analytics.touch;

import a3.e;
import android.os.Debug;
import android.os.Process;
import com.discord.logging.Log;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlin.text.x;
import ls.d;
import ls.l;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u000f"}, d2 = {"Lcom/discord/analytics/touch/TouchLoggerMemory;", "", "<init>", "()V", "getMemoryStats", "Lcom/discord/analytics/touch/MemoryStats;", "tag", "", "formatMemoryStats", "stats", "collectMemoryStatsFast", "getVmRssFromProc", "", "pid", "", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTouchLoggerMemory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchLoggerMemory.kt\ncom/discord/analytics/touch/TouchLoggerMemory\n+ 2 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n284#2,5:126\n1#3:131\n*S KotlinDebug\n*F\n+ 1 TouchLoggerMemory.kt\ncom/discord/analytics/touch/TouchLoggerMemory\n*L\n103#1:126,5\n103#1:131\n*E\n"})
public final class TouchLoggerMemory {

    @NotNull
    public static final TouchLoggerMemory INSTANCE = new TouchLoggerMemory();

    private TouchLoggerMemory() {
    }

    private final MemoryStats collectMemoryStatsFast(String tag) {
        Runtime runtime = Runtime.getRuntime();
        int iMyPid = Process.myPid();
        long j = runtime.totalMemory();
        long j5 = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        long jFreeMemory = (j / j5) - (runtime.freeMemory() / j5);
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / j5;
        long nativeHeapFreeSize = Debug.getNativeHeapFreeSize() / j5;
        return new MemoryStats(jFreeMemory, nativeHeapAllocatedSize - nativeHeapFreeSize, 0L, getVmRssFromProc(tag, iMyPid), 0L, 0L, 0L, nativeHeapAllocatedSize, nativeHeapFreeSize, jFreeMemory);
    }

    private final long getVmRssFromProc(String tag, int pid) {
        int I;
        try {
            File file = new File("/proc/" + pid + "/status");
            if (!file.exists()) {
                return 0L;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
            try {
                for (String str : l.t(bufferedReader)) {
                    if (x.o(str, "VmRSS:", false) && (I = StringsKt.I(str, ':', 0, 6)) != -1) {
                        String strSubstring = str.substring(I + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                        String string = StringsKt.b0(strSubstring).toString();
                        int I2 = StringsKt.I(string, ' ', 0, 6);
                        if (I2 != -1) {
                            string = string.substring(0, I2);
                            Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
                        }
                        Long lA0 = StringsKt.a0(string);
                        long jLongValue = lA0 != null ? lA0.longValue() : 0L;
                        bufferedReader.close();
                        return jLongValue;
                    }
                }
                Unit unit = Unit.f14616a;
                bufferedReader.close();
                return 0L;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    d.k(bufferedReader, th2);
                    throw th3;
                }
            }
        } catch (Exception e10) {
            Log.INSTANCE.e(tag, "Error reading VmRSS", e10);
            return 0L;
        }
    }

    @NotNull
    public final String formatMemoryStats(@NotNull MemoryStats stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        long totalPss = stats.getTotalPss();
        long j = IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET;
        long nativePss = stats.getNativePss() / j;
        long javaPss = stats.getJavaPss() / j;
        long swapPss = stats.getSwapPss() / j;
        long graphicsPss = stats.getGraphicsPss() / j;
        StringBuilder sbM = kk.b.m(totalPss / j, "Memory: PSS: ", "MB, Native: ");
        sbM.append(nativePss);
        sbM.append("MB, Java: ");
        sbM.append(javaPss);
        sbM.append("MB");
        if (swapPss > 1) {
            sbM.append(", Swap: ");
            sbM.append(swapPss);
            sbM.append("MB");
        }
        if (graphicsPss > 1) {
            sbM.append(", Graphics: ");
            sbM.append(graphicsPss);
            sbM.append("MB");
        }
        return sbM.toString();
    }

    @NotNull
    public final MemoryStats getMemoryStats(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        long jNanoTime = System.nanoTime();
        MemoryStats memoryStatsCollectMemoryStatsFast = collectMemoryStatsFast(tag);
        double dNanoTime = (System.nanoTime() - jNanoTime) / 1000.0d;
        if (dNanoTime > 1000.0d) {
            Log log = Log.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Locale locale = Locale.US;
            Log.w$default(log, tag, g.f("! Memory collection slow: ", e.q(new Object[]{Double.valueOf(dNanoTime)}, 1, locale, "%.2f", "format(...)"), "μs (", e.q(new Object[]{Double.valueOf(dNanoTime / 1000.0d)}, 1, locale, "%.2f", "format(...)"), "ms)"), (Throwable) null, 4, (Object) null);
        }
        return memoryStatsCollectMemoryStatsFast;
    }
}
