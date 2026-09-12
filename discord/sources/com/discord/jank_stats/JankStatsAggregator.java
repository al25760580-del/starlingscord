package com.discord.jank_stats;

import a3.e;
import android.view.Window;
import androidx.appcompat.widget.k1;
import androidx.metrics.performance.FrameData;
import androidx.metrics.performance.JankStats;
import com.discord.crash_reporting.CrashReporting;
import com.discord.logging.Log;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ud.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\fJ\u0010\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/discord/jank_stats/JankStatsAggregator;", "", "<init>", "()V", "listener", "Landroidx/metrics/performance/JankStats$OnFrameListener;", "jankStats", "Landroidx/metrics/performance/JankStats;", "numFrames", "", "numJankFrames", "initialize", "", "window", "Landroid/view/Window;", "enableTracking", "setJankHeuristicMultiplier", "jankHeuristicMultiplier", "", "disableTracking", "issueJankReport", "Lcom/discord/jank_stats/JankReport;", "reason", "", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JankStatsAggregator {
    private static JankStats jankStats;
    private static int numFrames;
    private static int numJankFrames;

    @NotNull
    public static final JankStatsAggregator INSTANCE = new JankStatsAggregator();

    @NotNull
    private static final JankStats.OnFrameListener listener = new k1(20);

    private JankStatsAggregator() {
    }

    public static /* synthetic */ JankReport issueJankReport$default(JankStatsAggregator jankStatsAggregator, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "";
        }
        return jankStatsAggregator.issueJankReport(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listener$lambda$0(FrameData frameData) {
        int i7;
        Intrinsics.checkNotNullParameter(frameData, "frameData");
        int i10 = numFrames;
        if (i10 == Integer.MAX_VALUE || (i7 = numJankFrames) == Integer.MAX_VALUE) {
            INSTANCE.disableTracking();
            Log.e$default(Log.INSTANCE, JankStatsAggregatorKt.LOG_TAG, "Frame count reached unexpected max int", (Throwable) null, 4, (Object) null);
            CrashReporting.INSTANCE.captureMessage(JankStatsAggregatorKt.LOG_TAG, "Frame count reached unexpected max int", CrashReporting.ErrorLevel.WARNING);
        } else {
            numFrames = i10 + 1;
            if (frameData.f2427d) {
                numJankFrames = i7 + 1;
            }
        }
    }

    public final void disableTracking() {
        JankStats jankStats2 = jankStats;
        if (jankStats2 == null) {
            return;
        }
        Intrinsics.checkNotNull(jankStats2);
        jankStats2.f2429b.r(false);
        Log.i$default(Log.INSTANCE, JankStatsAggregatorKt.LOG_TAG, "Jank tracking disabled.", (Throwable) null, 4, (Object) null);
    }

    public final void enableTracking() {
        JankStats jankStats2 = jankStats;
        if (jankStats2 == null) {
            return;
        }
        Intrinsics.checkNotNull(jankStats2);
        jankStats2.f2429b.r(true);
        Log.i$default(Log.INSTANCE, JankStatsAggregatorKt.LOG_TAG, "Jank tracking enabled.", (Throwable) null, 4, (Object) null);
    }

    public final void initialize(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        synchronized (this) {
            JankStats.OnFrameListener frameListener = listener;
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(frameListener, "frameListener");
            jankStats = new JankStats(window, frameListener);
            INSTANCE.setJankHeuristicMultiplier(1.0f);
            Unit unit = Unit.f14616a;
        }
    }

    @NotNull
    public final JankReport issueJankReport(@NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        int i7 = numFrames;
        int i10 = numJankFrames;
        numFrames = 0;
        numJankFrames = 0;
        Log log = Log.INSTANCE;
        double d6 = i7 > 0 ? (((double) i10) / ((double) i7)) * 100.0d : 0.0d;
        StringBuilder sbT = e.t("*** Jank Report (", reason, "), totalFrames = ", i7, ", jankFrames = ");
        sbT.append(i10);
        sbT.append(", jank % = ");
        sbT.append(d6);
        Log.i$default(log, JankStatsAggregatorKt.LOG_TAG, sbT.toString(), (Throwable) null, 4, (Object) null);
        return new JankReport(i7, i10);
    }

    public final void setJankHeuristicMultiplier(float jankHeuristicMultiplier) {
        JankStats jankStats2 = jankStats;
        Intrinsics.checkNotNull(jankStats2);
        jankStats2.getClass();
        d.f21065e = -1L;
        jankStats2.f2430c = jankHeuristicMultiplier;
        Log.i$default(Log.INSTANCE, JankStatsAggregatorKt.LOG_TAG, "Jank heuristic multiplier set to " + jankHeuristicMultiplier + ".", (Throwable) null, 4, (Object) null);
    }
}
