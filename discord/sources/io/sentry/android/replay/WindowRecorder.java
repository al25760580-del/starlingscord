package io.sentry.android.replay;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewTreeObserver;
import com.facebook.imagepipeline.nativecode.c;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.ILogger;
import io.sentry.SentryLevel;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ViewsKt;
import io.sentry.r;
import io.sentry.w5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001HB3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u001aJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010\u001aJ\u000f\u0010#\u001a\u00020\u0014H\u0016¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010$\u001a\u00020\fH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R0\u00106\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100403j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001004`58\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0014\u0010?\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010F\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lio/sentry/android/replay/WindowRecorder;", "Lio/sentry/android/replay/Recorder;", "Lio/sentry/android/replay/OnRootViewsChangedListener;", "Lio/sentry/android/replay/ExecutorProvider;", "Lio/sentry/w5;", "options", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "screenshotRecorderCallback", "Lio/sentry/android/replay/WindowCallback;", "windowCallback", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "<init>", "(Lio/sentry/w5;Lio/sentry/android/replay/ScreenshotRecorderCallback;Lio/sentry/android/replay/WindowCallback;Lio/sentry/android/replay/util/MainLooperHandler;Ljava/util/concurrent/ScheduledExecutorService;)V", "Landroid/view/View;", "root", "", "added", "", "onRootViewsChanged", "(Landroid/view/View;Z)V", "determineWindowSize", "(Landroid/view/View;)V", ViewProps.START, "()V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "resume", "pause", "reset", "stop", "close", "getExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "getMainLooperHandler", "()Lio/sentry/android/replay/util/MainLooperHandler;", "Landroid/os/Handler;", "getBackgroundHandler", "()Landroid/os/Handler;", "Lio/sentry/w5;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/android/replay/WindowCallback;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Lkotlin/collections/ArrayList;", "rootViews", "Ljava/util/ArrayList;", "Landroid/graphics/Point;", "lastKnownWindowSize", "Landroid/graphics/Point;", "Lio/sentry/util/a;", "rootViewsLock", "Lio/sentry/util/a;", "capturerLock", "backgroundProcessingHandlerLock", "Lio/sentry/android/replay/WindowRecorder$Capturer;", "capturer", "Lio/sentry/android/replay/WindowRecorder$Capturer;", "Landroid/os/HandlerThread;", "backgroundProcessingHandlerThread", "Landroid/os/HandlerThread;", "backgroundProcessingHandler", "Landroid/os/Handler;", "Capturer", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
@SourceDebugExtension({"SMAP\nWindowRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecorder.kt\nio/sentry/android/replay/WindowRecorder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,274:1\n1855#2,2:275\n1#3:277\n*S KotlinDebug\n*F\n+ 1 WindowRecorder.kt\nio/sentry/android/replay/WindowRecorder\n*L\n223#1:275,2\n*E\n"})
public final class WindowRecorder implements Recorder, OnRootViewsChangedListener, ExecutorProvider {
    public static final int $stable = 8;
    private volatile Handler backgroundProcessingHandler;

    @NotNull
    private final io.sentry.util.a backgroundProcessingHandlerLock;
    private volatile HandlerThread backgroundProcessingHandlerThread;
    private volatile Capturer capturer;

    @NotNull
    private final io.sentry.util.a capturerLock;

    @NotNull
    private final AtomicBoolean isRecording;

    @NotNull
    private Point lastKnownWindowSize;

    @NotNull
    private final MainLooperHandler mainLooperHandler;

    @NotNull
    private final w5 options;

    @NotNull
    private final ScheduledExecutorService replayExecutor;

    @NotNull
    private final ArrayList<WeakReference<View>> rootViews;

    @NotNull
    private final io.sentry.util.a rootViewsLock;
    private final ScreenshotRecorderCallback screenshotRecorderCallback;

    @NotNull
    private final WindowCallback windowCallback;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lio/sentry/android/replay/WindowRecorder$Capturer;", "Ljava/lang/Runnable;", "Lio/sentry/w5;", "options", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "<init>", "(Lio/sentry/w5;Lio/sentry/android/replay/util/MainLooperHandler;)V", "", "resume", "()V", "pause", "stop", "run", "Lio/sentry/w5;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Lio/sentry/android/replay/ScreenshotRecorder;", "recorder", "Lio/sentry/android/replay/ScreenshotRecorder;", "getRecorder", "()Lio/sentry/android/replay/ScreenshotRecorder;", "setRecorder", "(Lio/sentry/android/replay/ScreenshotRecorder;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "getConfig", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "setConfig", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRecording", "Ljava/util/concurrent/atomic/AtomicBoolean;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Capturer implements Runnable {
        private ScreenshotRecorderConfig config;

        @NotNull
        private final AtomicBoolean isRecording;

        @NotNull
        private final MainLooperHandler mainLooperHandler;

        @NotNull
        private final w5 options;
        private ScreenshotRecorder recorder;

        public Capturer(@NotNull w5 options, @NotNull MainLooperHandler mainLooperHandler) {
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
            this.options = options;
            this.mainLooperHandler = mainLooperHandler;
            this.isRecording = new AtomicBoolean(true);
        }

        public final ScreenshotRecorderConfig getConfig() {
            return this.config;
        }

        public final ScreenshotRecorder getRecorder() {
            return this.recorder;
        }

        public final void pause() {
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.pause();
            }
            this.isRecording.getAndSet(false);
        }

        public final void resume() {
            if (this.options.getSessionReplay().f12060n) {
                this.options.getLogger().q(SentryLevel.DEBUG, "Resuming the capture runnable.", new Object[0]);
            }
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.resume();
            }
            this.isRecording.getAndSet(true);
            this.mainLooperHandler.removeCallbacks(this);
            if (this.mainLooperHandler.post(this)) {
                return;
            }
            this.options.getLogger().q(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.isRecording.get()) {
                if (this.options.getSessionReplay().f12060n) {
                    this.options.getLogger().q(SentryLevel.DEBUG, "Not capturing frames, recording is not running.", new Object[0]);
                    return;
                }
                return;
            }
            try {
                if (this.options.getSessionReplay().f12060n) {
                    this.options.getLogger().q(SentryLevel.DEBUG, "Capturing a frame.", new Object[0]);
                }
                ScreenshotRecorder screenshotRecorder = this.recorder;
                if (screenshotRecorder != null) {
                    screenshotRecorder.capture();
                }
            } catch (Throwable th2) {
                this.options.getLogger().g(SentryLevel.ERROR, "Failed to capture a frame", th2);
            }
            if (this.options.getSessionReplay().f12060n) {
                ILogger logger = this.options.getLogger();
                SentryLevel sentryLevel = SentryLevel.DEBUG;
                StringBuilder sb2 = new StringBuilder("Posting the capture runnable again, frame rate is ");
                ScreenshotRecorderConfig screenshotRecorderConfig = this.config;
                logger.q(sentryLevel, b.l(sb2, screenshotRecorderConfig != null ? screenshotRecorderConfig.getFrameRate() : 1, " fps."), new Object[0]);
            }
            MainLooperHandler mainLooperHandler = this.mainLooperHandler;
            ScreenshotRecorderConfig screenshotRecorderConfig2 = this.config;
            if (mainLooperHandler.postDelayed(this, 1000 / ((long) (screenshotRecorderConfig2 != null ? screenshotRecorderConfig2.getFrameRate() : 1)))) {
                return;
            }
            this.options.getLogger().q(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }

        public final void setConfig(ScreenshotRecorderConfig screenshotRecorderConfig) {
            this.config = screenshotRecorderConfig;
        }

        public final void setRecorder(ScreenshotRecorder screenshotRecorder) {
            this.recorder = screenshotRecorder;
        }

        public final void stop() {
            ScreenshotRecorder screenshotRecorder = this.recorder;
            if (screenshotRecorder != null) {
                screenshotRecorder.close();
            }
            this.recorder = null;
            this.isRecording.getAndSet(false);
        }
    }

    public WindowRecorder(@NotNull w5 options, ScreenshotRecorderCallback screenshotRecorderCallback, @NotNull WindowCallback windowCallback, @NotNull MainLooperHandler mainLooperHandler, @NotNull ScheduledExecutorService replayExecutor) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(windowCallback, "windowCallback");
        Intrinsics.checkNotNullParameter(mainLooperHandler, "mainLooperHandler");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.options = options;
        this.screenshotRecorderCallback = screenshotRecorderCallback;
        this.windowCallback = windowCallback;
        this.mainLooperHandler = mainLooperHandler;
        this.replayExecutor = replayExecutor;
        this.isRecording = new AtomicBoolean(false);
        this.rootViews = new ArrayList<>();
        this.lastKnownWindowSize = new Point();
        this.rootViewsLock = new io.sentry.util.a();
        this.capturerLock = new io.sentry.util.a();
        this.backgroundProcessingHandlerLock = new io.sentry.util.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        reset();
        this.mainLooperHandler.removeCallbacks(this.capturer);
        r rVarA = this.backgroundProcessingHandlerLock.a();
        try {
            Handler handler = this.backgroundProcessingHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = this.backgroundProcessingHandlerThread;
            if (handlerThread != null) {
                handlerThread.quitSafely();
            }
            c.i(rVarA, null);
            stop();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.i(rVarA, th2);
                throw th3;
            }
        }
    }

    public final void determineWindowSize(@NotNull final View root) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (!ViewsKt.hasSize(root)) {
            ViewsKt.addOnPreDrawListenerSafe(root, new ViewTreeObserver.OnPreDrawListener() { // from class: io.sentry.android.replay.WindowRecorder.determineWindowSize.1
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    WeakReference weakReference = (WeakReference) CollectionsKt.S(WindowRecorder.this.rootViews);
                    if (!Intrinsics.areEqual(root, weakReference != null ? (View) weakReference.get() : null)) {
                        ViewsKt.removeOnPreDrawListenerSafe(root, this);
                        return true;
                    }
                    if (ViewsKt.hasSize(root)) {
                        ViewsKt.removeOnPreDrawListenerSafe(root, this);
                        if (root.getWidth() != WindowRecorder.this.lastKnownWindowSize.x && root.getHeight() != WindowRecorder.this.lastKnownWindowSize.y) {
                            WindowRecorder.this.lastKnownWindowSize.set(root.getWidth(), root.getHeight());
                            WindowRecorder.this.windowCallback.onWindowSizeChanged(root.getWidth(), root.getHeight());
                        }
                    }
                    return true;
                }
            });
            return;
        }
        if (root.getWidth() != this.lastKnownWindowSize.x) {
            int height = root.getHeight();
            Point point = this.lastKnownWindowSize;
            if (height != point.y) {
                point.set(root.getWidth(), root.getHeight());
                this.windowCallback.onWindowSizeChanged(root.getWidth(), root.getHeight());
            }
        }
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    @NotNull
    public Handler getBackgroundHandler() {
        if (this.backgroundProcessingHandler == null) {
            r rVarA = this.backgroundProcessingHandlerLock.a();
            try {
                if (this.backgroundProcessingHandler == null) {
                    this.backgroundProcessingHandlerThread = new HandlerThread("SentryReplayBackgroundProcessing");
                    HandlerThread handlerThread = this.backgroundProcessingHandlerThread;
                    if (handlerThread != null) {
                        handlerThread.start();
                    }
                    HandlerThread handlerThread2 = this.backgroundProcessingHandlerThread;
                    Intrinsics.checkNotNull(handlerThread2);
                    this.backgroundProcessingHandler = new Handler(handlerThread2.getLooper());
                }
                Unit unit = Unit.f14616a;
                c.i(rVarA, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.i(rVarA, th2);
                    throw th3;
                }
            }
        }
        Handler handler = this.backgroundProcessingHandler;
        Intrinsics.checkNotNull(handler);
        return handler;
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    @NotNull
    /* JADX INFO: renamed from: getExecutor, reason: from getter */
    public ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    @Override // io.sentry.android.replay.ExecutorProvider
    @NotNull
    public MainLooperHandler getMainLooperHandler() {
        return this.mainLooperHandler;
    }

    @Override // io.sentry.android.replay.Recorder
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig config) {
        Capturer capturer;
        ScreenshotRecorder recorder;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.isRecording.get()) {
            if (this.capturer == null) {
                r rVarA = this.capturerLock.a();
                try {
                    if (this.capturer == null) {
                        this.capturer = new Capturer(this.options, this.mainLooperHandler);
                    }
                    Unit unit = Unit.f14616a;
                    c.i(rVarA, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        c.i(rVarA, th2);
                        throw th3;
                    }
                }
            }
            Capturer capturer2 = this.capturer;
            if (capturer2 != null) {
                capturer2.setConfig(config);
            }
            Capturer capturer3 = this.capturer;
            if (capturer3 != null) {
                capturer3.setRecorder(new ScreenshotRecorder(config, this.options, this, this.screenshotRecorderCallback));
            }
            WeakReference weakReference = (WeakReference) CollectionsKt.S(this.rootViews);
            View view = weakReference != null ? (View) weakReference.get() : null;
            if (view != null && (capturer = this.capturer) != null && (recorder = capturer.getRecorder()) != null) {
                recorder.bind(view);
            }
            this.mainLooperHandler.removeCallbacks(this.capturer);
            if (this.mainLooperHandler.postDelayed(this.capturer, 100L)) {
                return;
            }
            this.options.getLogger().q(SentryLevel.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(@NotNull final View root, boolean added) {
        ScreenshotRecorder recorder;
        ScreenshotRecorder recorder2;
        ScreenshotRecorder recorder3;
        Intrinsics.checkNotNullParameter(root, "root");
        r rVarA = this.rootViewsLock.a();
        try {
            if (!added) {
                Capturer capturer = this.capturer;
                if (capturer != null && (recorder2 = capturer.getRecorder()) != null) {
                    recorder2.unbind(root);
                }
                i0.s(this.rootViews, new Function1<WeakReference<View>, Boolean>() { // from class: io.sentry.android.replay.WindowRecorder$onRootViewsChanged$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(WeakReference<View> it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Boolean.valueOf(Intrinsics.areEqual(it.get(), root));
                    }
                });
                WeakReference weakReference = (WeakReference) CollectionsKt.S(this.rootViews);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null && !Intrinsics.areEqual(root, view)) {
                    Capturer capturer2 = this.capturer;
                    if (capturer2 != null && (recorder = capturer2.getRecorder()) != null) {
                        recorder.bind(view);
                    }
                    determineWindowSize(view);
                }
            } else {
                if (WindowsKt.getPhoneWindow(root) == null) {
                    this.options.getLogger().q(SentryLevel.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
                    c.i(rVarA, null);
                    return;
                }
                this.rootViews.add(new WeakReference<>(root));
                Capturer capturer3 = this.capturer;
                if (capturer3 != null && (recorder3 = capturer3.getRecorder()) != null) {
                    recorder3.bind(root);
                }
                determineWindowSize(root);
            }
            Unit unit = Unit.f14616a;
            c.i(rVarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.i(rVarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.pause();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void reset() {
        ScreenshotRecorder recorder;
        this.lastKnownWindowSize.set(0, 0);
        r rVarA = this.rootViewsLock.a();
        try {
            Iterator<T> it = this.rootViews.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                Capturer capturer = this.capturer;
                if (capturer != null && (recorder = capturer.getRecorder()) != null) {
                    recorder.unbind((View) weakReference.get());
                }
            }
            this.rootViews.clear();
            Unit unit = Unit.f14616a;
            c.i(rVarA, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.i(rVarA, th2);
                throw th3;
            }
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.resume();
        }
    }

    @Override // io.sentry.android.replay.Recorder
    public void start() {
        this.isRecording.getAndSet(true);
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        Capturer capturer = this.capturer;
        if (capturer != null) {
            capturer.stop();
        }
        r rVarA = this.capturerLock.a();
        try {
            this.capturer = null;
            Unit unit = Unit.f14616a;
            c.i(rVarA, null);
            this.isRecording.set(false);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.i(rVarA, th2);
                throw th3;
            }
        }
    }

    public /* synthetic */ WindowRecorder(w5 w5Var, ScreenshotRecorderCallback screenshotRecorderCallback, WindowCallback windowCallback, MainLooperHandler mainLooperHandler, ScheduledExecutorService scheduledExecutorService, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(w5Var, (i7 & 2) != 0 ? null : screenshotRecorderCallback, windowCallback, mainLooperHandler, scheduledExecutorService);
    }
}
