package com.discord.crash_reporting.system_logs;

import android.app.ActivityManager;
import android.content.Context;
import android.os.SystemClock;
import androidx.lifecycle.r0;
import co.s;
import com.discord.misc.utilities.collections.CircularByteBuffer;
import com.facebook.react.uimanager.ViewProps;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import lo.j;
import ls.d;
import ls.l;
import org.jetbrains.annotations.NotNull;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012J\b\u0010\u0013\u001a\u00020\fH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0014\u0010\u0019\u001a\u00020\f2\n\u0010\u001a\u001a\u00060\u001bj\u0002`\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogCapture;", "", "<init>", "()V", "buffer", "Lcom/discord/misc/utilities/collections/CircularByteBuffer;", "tombstoneBuffer", "memoryInfo", "Landroid/app/ActivityManager$MemoryInfo;", "activityManager", "Landroid/app/ActivityManager;", "startThread", "", "context", "Landroid/content/Context;", "appendOutput", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", ViewProps.START, "restartDelayMs", "", "consecutiveFailures", "", "readFromLogcat", "addExceptionToBuffer", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "isLowMemory", "", "Companion", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemLogCapture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemLogCapture.kt\ncom/discord/crash_reporting/system_logs/SystemLogCapture\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,174:1\n13472#2,2:175\n*S KotlinDebug\n*F\n+ 1 SystemLogCapture.kt\ncom/discord/crash_reporting/system_logs/SystemLogCapture\n*L\n135#1:175,2\n*E\n"})
public final class SystemLogCapture {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int MAX_BACKOFF_SHIFT = 8;
    private static final int MAX_CONSECUTIVE_FAILURES = 10;
    private static final long MAX_RESTART_DELAY_MS = 300000;
    private static final long MIN_HEALTHY_LIFETIME_MS = 1000;
    private static final long RESTART_DELAY_MS = 2000;
    private ActivityManager activityManager;

    @NotNull
    private final CircularByteBuffer buffer = new CircularByteBuffer(262144);

    @NotNull
    private final CircularByteBuffer tombstoneBuffer = new CircularByteBuffer(51200);

    @NotNull
    private final ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogCapture$Companion;", "", "<init>", "()V", "RESTART_DELAY_MS", "", "MAX_RESTART_DELAY_MS", "MAX_BACKOFF_SHIFT", "", "MIN_HEALTHY_LIFETIME_MS", "MAX_CONSECUTIVE_FAILURES", "shouldIncludeLogLine", "", "line", "", "shouldIncludeLogLine$crash_reporting_release", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldIncludeLogLine$crash_reporting_release(@NotNull String line) {
            Intrinsics.checkNotNullParameter(line, "line");
            return !StringsKt.D(line, "chatty  : uid=", false) && (!StringsKt.D(line, "OpenSLESRecorder", false) || StringsKt.D(line, " E ", false));
        }

        private Companion() {
        }
    }

    private final void addExceptionToBuffer(Exception e10) {
        StackTraceElement[] stackTrace = e10.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            this.buffer.addLine("    " + stackTraceElement);
        }
    }

    private final boolean isLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = this.memoryInfo;
        ActivityManager activityManager = this.activityManager;
        if (activityManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityManager");
            activityManager = null;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    private final long readFromLogcat() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            Process processStart = new ProcessBuilder(SystemLogUtils.LOGCAT_PATH).redirectErrorStream(true).start();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processStart.getInputStream()));
                try {
                    l.q(bufferedReader, new s(8, this));
                    Unit unit = Unit.f14616a;
                    bufferedReader.close();
                    processStart.destroy();
                    return SystemClock.elapsedRealtime() - jElapsedRealtime;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        d.k(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                processStart.destroy();
                throw th4;
            }
        } catch (Exception e10) {
            this.buffer.addLine("Exception starting logcat process '" + e10 + "'");
            addExceptionToBuffer(e10);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit readFromLogcat$lambda$2$lambda$1(SystemLogCapture systemLogCapture, String line) {
        Intrinsics.checkNotNullParameter(line, "line");
        if (INSTANCE.shouldIncludeLogLine$crash_reporting_release(line)) {
            systemLogCapture.buffer.addLine(line);
        }
        if (SystemLogUtils.INSTANCE.getRegexExtractTombstone$crash_reporting_release().d(line)) {
            systemLogCapture.tombstoneBuffer.addLine(line);
        }
        return Unit.f14616a;
    }

    private final long restartDelayMs(int consecutiveFailures) {
        long jD = RESTART_DELAY_MS << j.d(consecutiveFailures, 0, 8);
        if (jD > 300000) {
            return 300000L;
        }
        return jD;
    }

    private final void start() throws InterruptedException {
        if (!new File(SystemLogUtils.LOGCAT_PATH).exists()) {
            this.buffer.addLine("Unable to locate '/system/bin/logcat'");
            return;
        }
        int i7 = 0;
        while (true) {
            try {
                if (isLowMemory()) {
                    this.buffer.addLine("Low memory. Skipping logcat read for 2000ms");
                } else {
                    i7 = readFromLogcat() < 1000 ? i7 + 1 : 0;
                }
            } catch (Exception e10) {
                i7++;
                this.buffer.addLine("Exception getting system logs, will restart logcat. '" + e10 + "'");
                addExceptionToBuffer(e10);
            }
            if (i7 >= 10) {
                this.buffer.addLine("Stopped capturing system logs: the logcat process exited immediately " + i7 + " times in a row.");
                return;
            }
            Thread.sleep(restartDelayMs(i7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit startThread$lambda$0(SystemLogCapture systemLogCapture) throws InterruptedException {
        systemLogCapture.start();
        return Unit.f14616a;
    }

    public final void appendOutput(@NotNull StringBuilder sb2) {
        Intrinsics.checkNotNullParameter(sb2, "sb");
        this.tombstoneBuffer.appendString(sb2);
        this.buffer.appendString(sb2);
    }

    public final void startThread(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        q.B("SystemLogCapture", 0, new r0(19, this), 20);
    }
}
