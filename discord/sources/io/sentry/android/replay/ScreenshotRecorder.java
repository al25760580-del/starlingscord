package io.sentry.android.replay;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewOverlay;
import android.view.ViewTreeObserver;
import io.sentry.SentryLevel;
import io.sentry.android.replay.screenshot.CanvasStrategy;
import io.sentry.android.replay.screenshot.PixelCopyStrategy;
import io.sentry.android.replay.screenshot.ScreenshotStrategy;
import io.sentry.android.replay.util.DebugOverlayDrawable;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.w3;
import io.sentry.w5;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rn.n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u000eJ\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u000eJ\r\u0010\u0017\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010&R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006."}, d2 = {"Lio/sentry/android/replay/ScreenshotRecorder;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "Lio/sentry/w5;", "options", "Lio/sentry/android/replay/ExecutorProvider;", "executorProvider", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "<init>", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;Lio/sentry/w5;Lio/sentry/android/replay/ExecutorProvider;Lio/sentry/android/replay/ScreenshotRecorderCallback;)V", "", "capture", "()V", "onDraw", "Landroid/view/View;", "root", "bind", "(Landroid/view/View;)V", "unbind", "pause", "resume", "close", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "getConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "Lio/sentry/w5;", "getOptions", "()Lio/sentry/w5;", "Lio/sentry/android/replay/ExecutorProvider;", "getExecutorProvider", "()Lio/sentry/android/replay/ExecutorProvider;", "Ljava/lang/ref/WeakReference;", "rootView", "Ljava/lang/ref/WeakReference;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCapturing", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/util/DebugOverlayDrawable;", "debugOverlayDrawable", "Lio/sentry/android/replay/util/DebugOverlayDrawable;", "contentChanged", "Lio/sentry/android/replay/screenshot/ScreenshotStrategy;", "screenshotStrategy", "Lio/sentry/android/replay/screenshot/ScreenshotStrategy;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseKtx"})
@TargetApi(26)
public final class ScreenshotRecorder implements ViewTreeObserver.OnDrawListener {
    public static final int $stable = 8;

    @NotNull
    private final ScreenshotRecorderConfig config;

    @NotNull
    private final AtomicBoolean contentChanged;

    @NotNull
    private final DebugOverlayDrawable debugOverlayDrawable;

    @NotNull
    private final ExecutorProvider executorProvider;

    @NotNull
    private final AtomicBoolean isCapturing;

    @NotNull
    private final w5 options;
    private WeakReference<View> rootView;

    @NotNull
    private final ScreenshotStrategy screenshotStrategy;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[w3.values().length];
            try {
                iArr[w3.CANVAS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w3.PIXEL_COPY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScreenshotRecorder(@NotNull ScreenshotRecorderConfig config, @NotNull w5 options, @NotNull ExecutorProvider executorProvider, ScreenshotRecorderCallback screenshotRecorderCallback) {
        ScreenshotStrategy canvasStrategy;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(executorProvider, "executorProvider");
        this.config = config;
        this.options = options;
        this.executorProvider = executorProvider;
        this.isCapturing = new AtomicBoolean(true);
        DebugOverlayDrawable debugOverlayDrawable = new DebugOverlayDrawable();
        this.debugOverlayDrawable = debugOverlayDrawable;
        this.contentChanged = new AtomicBoolean(false);
        int i7 = WhenMappings.$EnumSwitchMapping$0[options.getSessionReplay().f12061o.ordinal()];
        if (i7 == 1) {
            canvasStrategy = new CanvasStrategy(executorProvider, screenshotRecorderCallback, options, config);
        } else {
            if (i7 != 2) {
                throw new n();
            }
            canvasStrategy = new PixelCopyStrategy(executorProvider, screenshotRecorderCallback, options, config, debugOverlayDrawable);
        }
        this.screenshotStrategy = canvasStrategy;
    }

    public final void bind(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.rootView = new WeakReference<>(root);
        ViewsKt.addOnDrawListenerSafe(root, this);
        this.contentChanged.set(true);
        this.screenshotStrategy.onContentChanged();
    }

    public final void capture() {
        if (this.options.getSessionReplay().f12060n) {
            this.options.getLogger().q(SentryLevel.DEBUG, "Capturing screenshot, isCapturing: %s", Boolean.valueOf(this.isCapturing.get()));
        }
        if (!this.isCapturing.get()) {
            if (this.options.getSessionReplay().f12060n) {
                this.options.getLogger().q(SentryLevel.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
                return;
            }
            return;
        }
        if (this.options.getSessionReplay().f12060n) {
            this.options.getLogger().q(SentryLevel.DEBUG, "Capturing screenshot, contentChanged: %s, lastCaptureSuccessful: %s", Boolean.valueOf(this.contentChanged.get()), Boolean.valueOf(this.screenshotStrategy.lastCaptureSuccessful()));
        }
        if (!this.contentChanged.get()) {
            this.screenshotStrategy.emitLastScreenshot();
            return;
        }
        WeakReference<View> weakReference = this.rootView;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.options.getLogger().q(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        if (WindowsKt.getPhoneWindow(view) == null) {
            this.options.getLogger().q(SentryLevel.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        try {
            this.contentChanged.set(false);
            this.screenshotStrategy.capture(view);
        } catch (Throwable th2) {
            this.options.getLogger().g(SentryLevel.WARNING, "Failed to capture replay recording", th2);
        }
    }

    public final void close() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
        WeakReference<View> weakReference2 = this.rootView;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.screenshotStrategy.close();
    }

    @NotNull
    public final ScreenshotRecorderConfig getConfig() {
        return this.config;
    }

    @NotNull
    public final ExecutorProvider getExecutorProvider() {
        return this.executorProvider;
    }

    @NotNull
    public final w5 getOptions() {
        return this.options;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        if (this.isCapturing.get()) {
            WeakReference<View> weakReference = this.rootView;
            View view = weakReference != null ? weakReference.get() : null;
            if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
                this.options.getLogger().q(SentryLevel.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            } else {
                this.contentChanged.set(true);
                this.screenshotStrategy.onContentChanged();
            }
        }
    }

    public final void pause() {
        this.isCapturing.set(false);
        WeakReference<View> weakReference = this.rootView;
        unbind(weakReference != null ? weakReference.get() : null);
    }

    public final void resume() {
        View view;
        WeakReference<View> weakReference = this.rootView;
        if (weakReference != null && (view = weakReference.get()) != null) {
            ViewsKt.addOnDrawListenerSafe(view, this);
        }
        this.isCapturing.set(true);
    }

    public final void unbind(View root) {
        ViewOverlay overlay;
        if (this.options.getReplayController().getDebugMaskingEnabled() && root != null && (overlay = root.getOverlay()) != null) {
            overlay.remove(this.debugOverlayDrawable);
        }
        if (root != null) {
            ViewsKt.removeOnDrawListenerSafe(root, this);
        }
    }
}
