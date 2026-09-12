package com.discord.jank_stats;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.FrameMetrics;
import android.view.View;
import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0017R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\u00020\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/discord/jank_stats/FrameMetricsFrameTracker;", "", "Landroid/view/Window;", "window", "Lkotlin/Function1;", "", "", "onJankFrame", "<init>", "(Landroid/view/Window;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/FrameMetrics;", "frameMetrics", "", "expectedDeadlineNanos", "(Landroid/view/FrameMetrics;)J", "refreshRateDeadlineNanos", "()J", "", "refreshRateHz", "()F", "isBoundTo", "(Landroid/view/Window;)Z", ViewProps.START, "()V", "stop", "Lkotlin/jvm/functions/Function1;", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "windowRef", "Ljava/lang/ref/WeakReference;", "Landroid/os/HandlerThread;", "handlerThread", "Landroid/os/HandlerThread;", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "listener", "Landroid/view/Window$OnFrameMetricsAvailableListener;", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFrameMetricsFrameTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrameMetricsFrameTracker.kt\ncom/discord/jank_stats/FrameMetricsFrameTracker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,75:1\n1#2:76\n*E\n"})
public final class FrameMetricsFrameTracker {
    private HandlerThread handlerThread;

    @NotNull
    private final Window.OnFrameMetricsAvailableListener listener;

    @NotNull
    private final Function1<Boolean, Unit> onJankFrame;

    @NotNull
    private final WeakReference<Window> windowRef;

    /* JADX WARN: Multi-variable type inference failed */
    public FrameMetricsFrameTracker(@NotNull Window window, @NotNull Function1<? super Boolean, Unit> onJankFrame) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(onJankFrame, "onJankFrame");
        this.onJankFrame = onJankFrame;
        this.windowRef = new WeakReference<>(window);
        this.listener = new a(0, this);
    }

    private final long expectedDeadlineNanos(FrameMetrics frameMetrics) {
        return Build.VERSION.SDK_INT >= 31 ? frameMetrics.getMetric(13) : refreshRateDeadlineNanos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void listener$lambda$0(FrameMetricsFrameTracker frameMetricsFrameTracker, Window window, FrameMetrics frameMetrics, int i7) {
        if (frameMetrics.getMetric(9) == 1) {
            return;
        }
        long metric = frameMetrics.getMetric(8);
        Intrinsics.checkNotNull(frameMetrics);
        frameMetricsFrameTracker.onJankFrame.invoke(Boolean.valueOf(metric > frameMetricsFrameTracker.expectedDeadlineNanos(frameMetrics)));
    }

    private final long refreshRateDeadlineNanos() {
        return (long) (1000000000 / refreshRateHz());
    }

    private final float refreshRateHz() {
        View decorView;
        Display display;
        Window window = this.windowRef.get();
        if (window == null || (decorView = window.getDecorView()) == null || (display = decorView.getDisplay()) == null) {
            return 60.0f;
        }
        Float fValueOf = Float.valueOf(display.getRefreshRate());
        if (fValueOf.floatValue() <= 30.0f) {
            fValueOf = null;
        }
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 60.0f;
    }

    public final boolean isBoundTo(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        return this.windowRef.get() == window;
    }

    public final void start() {
        Window window = this.windowRef.get();
        if (window == null) {
            return;
        }
        synchronized (window) {
            if (this.handlerThread != null) {
                return;
            }
            HandlerThread handlerThread = new HandlerThread("FrameMetricsTracker");
            handlerThread.start();
            window.addOnFrameMetricsAvailableListener(this.listener, new Handler(handlerThread.getLooper()));
            this.handlerThread = handlerThread;
            Unit unit = Unit.f14616a;
        }
    }

    public final void stop() {
        Window window = this.windowRef.get();
        if (window == null) {
            HandlerThread handlerThread = this.handlerThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            this.handlerThread = null;
            return;
        }
        synchronized (window) {
            HandlerThread handlerThread2 = this.handlerThread;
            if (handlerThread2 == null) {
                return;
            }
            window.removeOnFrameMetricsAvailableListener(this.listener);
            handlerThread2.quitSafely();
            this.handlerThread = null;
            Unit unit = Unit.f14616a;
        }
    }
}
