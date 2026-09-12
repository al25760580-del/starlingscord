package com.discord.crash_reporting.system_logs;

import android.content.Context;
import com.discord.logging.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\b0\fJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u0016\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogReport;", "", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "fetchNativeCrashDiagnostics", "", "context", "Landroid/content/Context;", "cb", "Lkotlin/Function1;", "Lcom/discord/crash_reporting/system_logs/SystemLogReport$NativeCrashDiagnostics;", "recordBreadcrumb", "msg", "category", "NativeCrashDiagnostics", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSystemLogReport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemLogReport.kt\ncom/discord/crash_reporting/system_logs/SystemLogReport\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,35:1\n1869#2,2:36\n*S KotlinDebug\n*F\n+ 1 SystemLogReport.kt\ncom/discord/crash_reporting/system_logs/SystemLogReport\n*L\n20#1:36,2\n*E\n"})
public final class SystemLogReport {

    @NotNull
    public static final SystemLogReport INSTANCE = new SystemLogReport();
    private static final String TAG = "SystemLogReport";

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/discord/crash_reporting/system_logs/SystemLogReport$NativeCrashDiagnostics;", "", "exitReason", "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "tombstone", "Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "<init>", "(Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;)V", "getExitReason", "()Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "getTombstone", "()Lcom/discord/crash_reporting/system_logs/SystemLogUtils$Tombstone;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NativeCrashDiagnostics {
        private final HistoricalProcessExitReason.Reason exitReason;
        private final SystemLogUtils.Tombstone tombstone;

        public NativeCrashDiagnostics(HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone) {
            this.exitReason = reason;
            this.tombstone = tombstone;
        }

        public static /* synthetic */ NativeCrashDiagnostics copy$default(NativeCrashDiagnostics nativeCrashDiagnostics, HistoricalProcessExitReason.Reason reason, SystemLogUtils.Tombstone tombstone, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                reason = nativeCrashDiagnostics.exitReason;
            }
            if ((i7 & 2) != 0) {
                tombstone = nativeCrashDiagnostics.tombstone;
            }
            return nativeCrashDiagnostics.copy(reason, tombstone);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final HistoricalProcessExitReason.Reason getExitReason() {
            return this.exitReason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final SystemLogUtils.Tombstone getTombstone() {
            return this.tombstone;
        }

        @NotNull
        public final NativeCrashDiagnostics copy(HistoricalProcessExitReason.Reason exitReason, SystemLogUtils.Tombstone tombstone) {
            return new NativeCrashDiagnostics(exitReason, tombstone);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NativeCrashDiagnostics)) {
                return false;
            }
            NativeCrashDiagnostics nativeCrashDiagnostics = (NativeCrashDiagnostics) other;
            return Intrinsics.areEqual(this.exitReason, nativeCrashDiagnostics.exitReason) && Intrinsics.areEqual(this.tombstone, nativeCrashDiagnostics.tombstone);
        }

        public final HistoricalProcessExitReason.Reason getExitReason() {
            return this.exitReason;
        }

        public final SystemLogUtils.Tombstone getTombstone() {
            return this.tombstone;
        }

        public int hashCode() {
            HistoricalProcessExitReason.Reason reason = this.exitReason;
            int iHashCode = (reason == null ? 0 : reason.hashCode()) * 31;
            SystemLogUtils.Tombstone tombstone = this.tombstone;
            return iHashCode + (tombstone != null ? tombstone.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "NativeCrashDiagnostics(exitReason=" + this.exitReason + ", tombstone=" + this.tombstone + ")";
        }
    }

    private SystemLogReport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchNativeCrashDiagnostics$lambda$2(Function1 function1, Context context, SystemLogUtils.Tombstone tombstone) {
        if (tombstone != null) {
            Iterator it = StringsKt__StringsKt.split$default(tombstone.getText(), new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, null).iterator();
            while (it.hasNext()) {
                INSTANCE.recordBreadcrumb((String) it.next(), "Tombstone");
            }
            INSTANCE.recordBreadcrumb(tombstone.getGroupHash(), "Tombstone-Hash");
        }
        function1.invoke(new NativeCrashDiagnostics(HistoricalProcessExitReason.INSTANCE.lastReason(context), tombstone));
        return Unit.f14616a;
    }

    private final void recordBreadcrumb(String msg, String category) {
        Log log = Log.INSTANCE;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        Log.i$default(log, TAG2, "Breadcrumb, [" + category + "]: " + msg, (Throwable) null, 4, (Object) null);
    }

    public final void fetchNativeCrashDiagnostics(@NotNull Context context, @NotNull Function1<? super NativeCrashDiagnostics, Unit> cb2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cb2, "cb");
        SystemLogUtils.INSTANCE.fetchLastTombstone(new b7.a(20, cb2, context));
    }
}
