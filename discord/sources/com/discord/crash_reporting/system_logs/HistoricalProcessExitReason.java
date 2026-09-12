package com.discord.crash_reporting.system_logs;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import com.google.firebase.messaging.n;
import java.util.List;
import java.util.Map;
import kk.b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason;", "", "<init>", "()V", "lastReason", "Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "context", "Landroid/content/Context;", "exitReasonLookup", "", "", "", "Reason", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HistoricalProcessExitReason {

    @NotNull
    public static final HistoricalProcessExitReason INSTANCE = new HistoricalProcessExitReason();

    @NotNull
    private static final Map<Integer, String> exitReasonLookup;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/discord/crash_reporting/system_logs/HistoricalProcessExitReason$Reason;", "", "reason", "", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getDescription", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Reason {
        private final String description;

        @NotNull
        private final String reason;

        public Reason(@NotNull String reason, String str) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.reason = reason;
            this.description = str;
        }

        public static /* synthetic */ Reason copy$default(Reason reason, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = reason.reason;
            }
            if ((i7 & 2) != 0) {
                str2 = reason.description;
            }
            return reason.copy(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final Reason copy(@NotNull String reason, String description) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            return new Reason(reason, description);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Reason)) {
                return false;
            }
            Reason reason = (Reason) other;
            return Intrinsics.areEqual(this.reason, reason.reason) && Intrinsics.areEqual(this.description, reason.description);
        }

        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            int iHashCode = this.reason.hashCode() * 31;
            String str = this.description;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            return g.f("Reason(reason=", this.reason, ", description=", this.description, ")");
        }
    }

    static {
        exitReasonLookup = Build.VERSION.SDK_INT < 30 ? w0.d() : w0.g(new Pair(6, "ANR"), new Pair(4, "CRASH"), new Pair(5, "CRASH_NATIVE"), new Pair(12, "DEPENDENCY_DIED"), new Pair(9, "EXCESSIVE_RESOURCE_USAGE"), new Pair(1, "EXIT_SELF"), new Pair(7, "INITIALIZATION_FAILURE"), new Pair(3, "LOW_MEMORY"), new Pair(13, "OTHER"), new Pair(8, "PERMISSION_CHANGE"), new Pair(2, "SIGNALED"), new Pair(0, "UNKNOWN"), new Pair(10, "USER_REQUESTED"), new Pair(11, "USER_STOPPED"));
    }

    private HistoricalProcessExitReason() {
    }

    public final Reason lastReason(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return null;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 1);
        Intrinsics.checkNotNullExpressionValue(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        ApplicationExitInfo applicationExitInfoC = n.c(CollectionsKt.firstOrNull(historicalProcessExitReasons));
        if (applicationExitInfoC == null) {
            return null;
        }
        String strH = exitReasonLookup.get(Integer.valueOf(applicationExitInfoC.getReason()));
        if (strH == null) {
            strH = b.h(applicationExitInfoC.getReason(), "Unknown ");
        }
        return new Reason(strH, applicationExitInfoC.getDescription());
    }
}
