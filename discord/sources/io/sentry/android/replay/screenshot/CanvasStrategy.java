package io.sentry.android.replay.screenshot;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.View;
import io.sentry.SentryLevel;
import io.sentry.android.replay.ExecutorProvider;
import io.sentry.android.replay.ScreenshotRecorderCallback;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.r;
import io.sentry.w5;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import rn.l;
import rn.m;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u0019\u0010\u001b\u001a\u00020\u000e*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001dR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u0010\u0015\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010;\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lio/sentry/android/replay/screenshot/CanvasStrategy;", "Lio/sentry/android/replay/screenshot/ScreenshotStrategy;", "Lio/sentry/android/replay/ExecutorProvider;", "executor", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "Lio/sentry/w5;", "options", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "<init>", "(Lio/sentry/android/replay/ExecutorProvider;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/w5;Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/View;", "root", "", "capture", "(Landroid/view/View;)V", "onContentChanged", "()V", "close", "", "lastCaptureSuccessful", "()Z", "emitLastScreenshot", "Landroid/os/Handler;", "Lio/sentry/android/replay/util/ReplayRunnable;", "runnable", "postSafely", "(Landroid/os/Handler;Lio/sentry/android/replay/util/ReplayRunnable;)V", "Lio/sentry/android/replay/ExecutorProvider;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/w5;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "Landroid/graphics/Bitmap;", "screenshot", "Landroid/graphics/Bitmap;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroid/graphics/Picture;", "unprocessedPictureRef", "Ljava/util/concurrent/atomic/AtomicReference;", "Lio/sentry/util/a;", "screenshotLock", "Lio/sentry/util/a;", "Landroid/graphics/Matrix;", "prescaledMatrix$delegate", "Lkotlin/Lazy;", "getPrescaledMatrix", "()Landroid/graphics/Matrix;", "prescaledMatrix", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas;", "textIgnoringCanvas", "Lio/sentry/android/replay/screenshot/TextIgnoringDelegateCanvas;", "isClosed", "Landroid/graphics/SurfaceTexture;", "surfaceTexture", "Landroid/graphics/SurfaceTexture;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "Ljava/lang/Runnable;", "pictureRenderTask", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NewApi", "UseKtx"})
@SourceDebugExtension({"SMAP\nCanvasStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CanvasStrategy.kt\nio/sentry/android/replay/screenshot/CanvasStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1015:1\n1#2:1016\n*E\n"})
public final class CanvasStrategy implements ScreenshotStrategy {
    public static final int $stable = 8;

    @NotNull
    private final ScreenshotRecorderConfig config;

    @NotNull
    private final ExecutorProvider executor;

    @NotNull
    private final AtomicBoolean isClosed;

    @NotNull
    private final AtomicBoolean lastCaptureSuccessful;

    @NotNull
    private final w5 options;

    @SuppressLint({"NewApi"})
    @NotNull
    private final Runnable pictureRenderTask;

    /* JADX INFO: renamed from: prescaledMatrix$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy prescaledMatrix;
    private volatile Bitmap screenshot;

    @NotNull
    private final io.sentry.util.a screenshotLock;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    @NotNull
    private final Surface surface;

    @NotNull
    private final SurfaceTexture surfaceTexture;

    @NotNull
    private final TextIgnoringDelegateCanvas textIgnoringCanvas;

    @NotNull
    private AtomicReference<Picture> unprocessedPictureRef;

    public CanvasStrategy(@NotNull ExecutorProvider executor, ScreenshotRecorderCallback screenshotRecorderCallback, @NotNull w5 options, @NotNull ScreenshotRecorderConfig config) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(config, "config");
        this.executor = executor;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.options = options;
        this.config = config;
        this.unprocessedPictureRef = new AtomicReference<>(null);
        this.screenshotLock = new io.sentry.util.a();
        this.prescaledMatrix = l.a(m.f19487i, new Function0<Matrix>() { // from class: io.sentry.android.replay.screenshot.CanvasStrategy$prescaledMatrix$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Matrix invoke() {
                Matrix matrix = new Matrix();
                CanvasStrategy canvasStrategy = this.this$0;
                matrix.preScale(canvasStrategy.config.getScaleFactorX(), canvasStrategy.config.getScaleFactorY());
                return matrix;
            }
        });
        this.lastCaptureSuccessful = new AtomicBoolean(false);
        this.textIgnoringCanvas = new TextIgnoringDelegateCanvas();
        this.isClosed = new AtomicBoolean(false);
        SurfaceTexture surfaceTextureA = a.a();
        surfaceTextureA.setDefaultBufferSize(config.getRecordingWidth(), config.getRecordingHeight());
        this.surfaceTexture = surfaceTextureA;
        this.surface = new Surface(surfaceTextureA);
        c9.a.c("ReplayCanvasStrategy");
        this.pictureRenderTask = new b(this, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void close$lambda$6(CanvasStrategy canvasStrategy) {
        Bitmap bitmap = canvasStrategy.screenshot;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (!bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        canvasStrategy.surface.release();
        canvasStrategy.surfaceTexture.release();
    }

    private final Matrix getPrescaledMatrix() {
        return (Matrix) this.prescaledMatrix.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pictureRenderTask$lambda$3(final CanvasStrategy canvasStrategy) {
        if (canvasStrategy.isClosed.get()) {
            canvasStrategy.options.getLogger().q(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
            return;
        }
        Picture andSet = canvasStrategy.unprocessedPictureRef.getAndSet(null);
        if (andSet == null) {
            return;
        }
        try {
            Canvas canvasLockHardwareCanvas = canvasStrategy.surface.lockHardwareCanvas();
            try {
                canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                andSet.draw(canvasLockHardwareCanvas);
                canvasStrategy.surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                if (canvasStrategy.screenshot == null) {
                    r rVarA = canvasStrategy.screenshotLock.a();
                    try {
                        if (canvasStrategy.screenshot == null) {
                            canvasStrategy.screenshot = Bitmap.createBitmap(canvasStrategy.config.getRecordingWidth(), canvasStrategy.config.getRecordingHeight(), Bitmap.Config.ARGB_8888);
                        }
                        Unit unit = Unit.f14616a;
                        com.facebook.imagepipeline.nativecode.c.i(rVarA, null);
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            com.facebook.imagepipeline.nativecode.c.i(rVarA, th2);
                            throw th3;
                        }
                    }
                }
                if (canvasStrategy.isClosed.get()) {
                    canvasStrategy.options.getLogger().q(SentryLevel.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                    return;
                }
                Surface surface = canvasStrategy.surface;
                Bitmap bitmap = canvasStrategy.screenshot;
                Intrinsics.checkNotNull(bitmap);
                PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.c
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i7) {
                        CanvasStrategy.pictureRenderTask$lambda$3$lambda$2(this.f12486a, i7);
                    }
                }, canvasStrategy.executor.getBackgroundHandler());
            } catch (Throwable th4) {
                canvasStrategy.surface.unlockCanvasAndPost(canvasLockHardwareCanvas);
                throw th4;
            }
        } catch (Throwable th5) {
            canvasStrategy.options.getLogger().g(SentryLevel.ERROR, "Canvas Strategy: picture render failed", th5);
            canvasStrategy.lastCaptureSuccessful.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pictureRenderTask$lambda$3$lambda$2(CanvasStrategy canvasStrategy, int i7) {
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (canvasStrategy.isClosed.get()) {
            canvasStrategy.options.getLogger().q(SentryLevel.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
            return;
        }
        if (i7 != 0) {
            canvasStrategy.options.getLogger().q(SentryLevel.ERROR, kk.b.h(i7, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
            canvasStrategy.lastCaptureSuccessful.set(false);
            return;
        }
        canvasStrategy.lastCaptureSuccessful.set(true);
        Bitmap bitmap = canvasStrategy.screenshot;
        if (bitmap == null || bitmap.isRecycled() || (screenshotRecorderCallback = canvasStrategy.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    @SuppressLint({"NewApi"})
    public void capture(@NotNull View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (this.isClosed.get()) {
            return;
        }
        Picture picture = new Picture();
        Canvas canvasBeginRecording = picture.beginRecording(this.config.getRecordingWidth(), this.config.getRecordingHeight());
        Intrinsics.checkNotNullExpressionValue(canvasBeginRecording, "beginRecording(...)");
        this.textIgnoringCanvas.setDelegate(canvasBeginRecording);
        this.textIgnoringCanvas.setMatrix(getPrescaledMatrix());
        root.draw(this.textIgnoringCanvas);
        picture.endRecording();
        if (this.isClosed.get()) {
            return;
        }
        this.unprocessedPictureRef.set(picture);
        postSafely(this.executor.getBackgroundHandler(), new ReplayRunnable("screenshot_recorder.canvas", this.pictureRenderTask));
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void close() {
        this.isClosed.set(true);
        postSafely(this.executor.getBackgroundHandler(), new ReplayRunnable("CanvasStrategy.close", new b(this, 1)));
        this.unprocessedPictureRef.getAndSet(null);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void emitLastScreenshot() {
        Bitmap bitmap;
        ScreenshotRecorderCallback screenshotRecorderCallback;
        if (!lastCaptureSuccessful() || (bitmap = this.screenshot) == null || bitmap.isRecycled() || (screenshotRecorderCallback = this.screenshotRecorderCallback) == null) {
            return;
        }
        screenshotRecorderCallback.onScreenshotRecorded(bitmap);
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public boolean lastCaptureSuccessful() {
        return this.lastCaptureSuccessful.get();
    }

    @Override // io.sentry.android.replay.screenshot.ScreenshotStrategy
    public void onContentChanged() {
    }

    public final void postSafely(@NotNull Handler handler, @NotNull ReplayRunnable runnable) {
        Intrinsics.checkNotNullParameter(handler, "<this>");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        try {
            handler.post(runnable);
        } catch (Throwable th2) {
            this.options.getLogger().g(SentryLevel.ERROR, "Canvas Strategy: failed to post runnable " + runnable.getTaskName(), th2);
        }
    }
}
