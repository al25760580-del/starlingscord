package com.discord.jank_stats;

import android.view.Window;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\fJ\u0006\u0010\u0012\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u0006\u0010\u0015\u001a\u00020\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/discord/jank_stats/FrameMetricsAggregator;", "", "<init>", "()V", "tracker", "Lcom/discord/jank_stats/FrameMetricsFrameTracker;", "numFrames", "", "numJankFrames", "reportWindowOpen", "", "initialize", "", "window", "Landroid/view/Window;", "bindTo", "enableTracking", "disableTracking", "closeReportWindow", "recordFrame", "isJank", "issueReport", "Lcom/discord/jank_stats/FrameMetricsReport;", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameMetricsAggregator {
    private static int numFrames;
    private static int numJankFrames;
    private static FrameMetricsFrameTracker tracker;

    @NotNull
    public static final FrameMetricsAggregator INSTANCE = new FrameMetricsAggregator();
    private static boolean reportWindowOpen = true;

    private FrameMetricsAggregator() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFrame(boolean isJank) {
        synchronized (this) {
            try {
                if (reportWindowOpen) {
                    numFrames++;
                    if (isJank) {
                        numJankFrames++;
                    }
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        JankSessionRecorder.INSTANCE.recordFrame(isJank);
    }

    public final void bindTo(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        synchronized (this) {
            FrameMetricsFrameTracker frameMetricsFrameTracker = tracker;
            if (frameMetricsFrameTracker == null || !frameMetricsFrameTracker.isBoundTo(window)) {
                FrameMetricsFrameTracker frameMetricsFrameTracker2 = tracker;
                tracker = new FrameMetricsFrameTracker(window, new FrameMetricsAggregator$bindTo$previous$1$1(INSTANCE));
                if (frameMetricsFrameTracker2 != null) {
                    frameMetricsFrameTracker2.stop();
                }
            }
        }
    }

    public final void closeReportWindow() {
        synchronized (this) {
            reportWindowOpen = false;
            Unit unit = Unit.f14616a;
        }
    }

    public final void disableTracking() {
        FrameMetricsFrameTracker frameMetricsFrameTracker = tracker;
        if (frameMetricsFrameTracker == null) {
            return;
        }
        frameMetricsFrameTracker.stop();
        JankSessionRecorder.INSTANCE.onTrackingDisabled();
    }

    public final void enableTracking() {
        synchronized (this) {
            reportWindowOpen = true;
            Unit unit = Unit.f14616a;
        }
        FrameMetricsFrameTracker frameMetricsFrameTracker = tracker;
        if (frameMetricsFrameTracker != null) {
            frameMetricsFrameTracker.start();
        }
    }

    public final void initialize(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        bindTo(window);
    }

    @NotNull
    public final FrameMetricsReport issueReport() {
        FrameMetricsReport frameMetricsReport;
        synchronized (this) {
            frameMetricsReport = new FrameMetricsReport(numFrames, numJankFrames);
            numFrames = 0;
            numJankFrames = 0;
        }
        return frameMetricsReport;
    }
}
