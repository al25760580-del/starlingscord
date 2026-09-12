package io.sentry.android.replay;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.MotionEvent;
import com.facebook.imagepipeline.nativecode.c;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.SentryLevel;
import io.sentry.a1;
import io.sentry.a6;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.android.replay.gestures.GestureRecorder;
import io.sentry.android.replay.gestures.TouchRecorderCallback;
import io.sentry.android.replay.util.ContextKt;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ReplayExecutorService;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.cache.g;
import io.sentry.hints.b;
import io.sentry.i3;
import io.sentry.j3;
import io.sentry.k0;
import io.sentry.l0;
import io.sentry.l1;
import io.sentry.l2;
import io.sentry.protocol.v;
import io.sentry.r;
import io.sentry.transport.f;
import io.sentry.transport.o;
import io.sentry.transport.p;
import io.sentry.util.i;
import io.sentry.v4;
import io.sentry.w5;
import io.sentry.x0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.x;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0006\u0097\u0001\u0098\u0001\u0099\u0001BA\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0016Bu\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u001eJ\u001f\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0017H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020#H\u0016¢\u0006\u0004\b*\u0010)J\u0019\u0010,\u001a\u00020#2\b\u0010+\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0011H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020#2\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000200H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020#H\u0016¢\u0006\u0004\b6\u0010)J\u000f\u00107\u001a\u00020#H\u0016¢\u0006\u0004\b7\u0010)J\u000f\u00108\u001a\u00020#H\u0016¢\u0006\u0004\b8\u0010)J\u000f\u00109\u001a\u00020\u0017H\u0016¢\u0006\u0004\b9\u0010'J\u000f\u0010:\u001a\u00020#H\u0016¢\u0006\u0004\b:\u0010)J\u0017\u0010=\u001a\u00020#2\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010=\u001a\u00020#2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\b=\u0010CJ\u000f\u0010D\u001a\u00020#H\u0016¢\u0006\u0004\bD\u0010)J\u0017\u0010G\u001a\u00020#2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020#2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020#2\u0006\u0010N\u001a\u00020MH\u0016¢\u0006\u0004\bO\u0010PJ\u001f\u0010T\u001a\u00020#2\u0006\u0010R\u001a\u00020Q2\u0006\u0010S\u001a\u00020QH\u0016¢\u0006\u0004\bT\u0010UJ\u0015\u0010X\u001a\u00020#2\u0006\u0010W\u001a\u00020V¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020#H\u0002¢\u0006\u0004\bZ\u0010)J\u000f\u0010[\u001a\u00020#H\u0002¢\u0006\u0004\b[\u0010)J\u000f\u0010\\\u001a\u00020#H\u0002¢\u0006\u0004\b\\\u0010)J\u000f\u0010]\u001a\u00020#H\u0002¢\u0006\u0004\b]\u0010)J\u000f\u0010^\u001a\u00020#H\u0002¢\u0006\u0004\b^\u0010)J\u0019\u0010a\u001a\u00020#2\b\b\u0002\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020#H\u0002¢\u0006\u0004\bc\u0010)R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010eR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010fR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010gR\u0016\u0010h\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010lR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010|\u001a\u00020x8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\by\u0010t\u001a\u0004\bz\u0010{R\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u0010t\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u0087\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0084\u0001\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010gR\u0017\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010\u008d\u0001R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010fR\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0096\u0001\u001a\u0004\u0018\u00010?8F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u009a\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/l1;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "Lio/sentry/j3;", "Lio/sentry/l0;", "Lio/sentry/transport/o;", "Lio/sentry/android/replay/WindowCallback;", "Landroid/content/Context;", "context", "Lio/sentry/transport/f;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/Recorder;", "recorderProvider", "Lkotlin/Function1;", "Lio/sentry/protocol/v;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/f;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "(Landroid/content/Context;Lio/sentry/transport/f;)V", "", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Lio/sentry/android/replay/gestures/GestureRecorder;", "gestureRecorderProvider", "(Landroid/content/Context;Lio/sentry/transport/f;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lio/sentry/android/replay/util/MainLooperHandler;Lkotlin/jvm/functions/Function0;)V", "Lio/sentry/x0;", "scopes", "Lio/sentry/w5;", "options", "", "register", "(Lio/sentry/x0;Lio/sentry/w5;)V", "isRecording", "()Z", ViewProps.START, "()V", "resume", "isTerminating", "captureReplay", "(Ljava/lang/Boolean;)V", "getReplayId", "()Lio/sentry/protocol/v;", "Lio/sentry/i3;", "converter", "setBreadcrumbConverter", "(Lio/sentry/i3;)V", "getBreadcrumbConverter", "()Lio/sentry/i3;", "pause", "enableDebugMaskingOverlay", "disableDebugMaskingOverlay", "isDebugMaskingOverlayEnabled", "stop", "Landroid/graphics/Bitmap;", "bitmap", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;)V", "Ljava/io/File;", "screenshot", "", "frameTimestamp", "(Ljava/io/File;J)V", "close", "Lio/sentry/k0;", "status", "onConnectionStatusChanged", "(Lio/sentry/k0;)V", "Lio/sentry/transport/p;", "rateLimiter", "onRateLimitChanged", "(Lio/sentry/transport/p;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", "width", "height", "onWindowSizeChanged", "(II)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "resumeInternal", "pauseInternal", "checkCanRecord", "registerRootViewListeners", "unregisterRootViewListeners", "", "unfinishedReplayId", "cleanupReplays", "(Ljava/lang/String;)V", "finalizePreviousReplay", "Landroid/content/Context;", "Lio/sentry/transport/f;", "Lkotlin/jvm/functions/Function0;", "Lkotlin/jvm/functions/Function1;", "lastKnownConnectionStatus", "Lio/sentry/k0;", "debugMaskingEnabled", "Z", "Lio/sentry/w5;", "Lio/sentry/x0;", "recorder", "Lio/sentry/android/replay/Recorder;", "gestureRecorder", "Lio/sentry/android/replay/gestures/GestureRecorder;", "Lio/sentry/util/i;", "random$delegate", "Lkotlin/Lazy;", "getRandom", "()Lio/sentry/util/i;", "random", "Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy$delegate", "getRootViewsSpy$sentry_android_replay_release", "()Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy", "Lio/sentry/android/replay/util/ReplayExecutorService;", "replayExecutor$delegate", "getReplayExecutor", "()Lio/sentry/android/replay/util/ReplayExecutorService;", "replayExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isManualPause", "isManualPause$sentry_android_replay_release", "captureStrategy", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayBreadcrumbConverter", "Lio/sentry/i3;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Lio/sentry/util/a;", "lifecycleLock", "Lio/sentry/util/a;", "Lio/sentry/android/replay/ReplayLifecycle;", "lifecycle", "Lio/sentry/android/replay/ReplayLifecycle;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "Companion", "PreviousReplayHint", "ReplayExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReplayIntegration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,515:1\n13309#2,2:516\n*S KotlinDebug\n*F\n+ 1 ReplayIntegration.kt\nio/sentry/android/replay/ReplayIntegration\n*L\n406#1:516,2\n*E\n"})
public final class ReplayIntegration implements l1, Closeable, ScreenshotRecorderCallback, TouchRecorderCallback, j3, l0, o, WindowCallback {
    private CaptureStrategy captureStrategy;

    @NotNull
    private final Context context;

    @NotNull
    private final f dateProvider;
    private boolean debugMaskingEnabled;
    private GestureRecorder gestureRecorder;
    private Function0<GestureRecorder> gestureRecorderProvider;

    @NotNull
    private final AtomicBoolean isEnabled;

    @NotNull
    private final AtomicBoolean isManualPause;

    @NotNull
    private volatile k0 lastKnownConnectionStatus;

    @NotNull
    private final ReplayLifecycle lifecycle;

    @NotNull
    private final io.sentry.util.a lifecycleLock;

    @NotNull
    private MainLooperHandler mainLooperHandler;
    private w5 options;

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy random;
    private Recorder recorder;
    private final Function0<Recorder> recorderProvider;

    @NotNull
    private i3 replayBreadcrumbConverter;
    private final Function1<v, ReplayCache> replayCacheProvider;
    private Function1<? super Boolean, ? extends CaptureStrategy> replayCaptureStrategyProvider;

    /* JADX INFO: renamed from: replayExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy replayExecutor;

    /* JADX INFO: renamed from: rootViewsSpy$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy rootViewsSpy;
    private x0 scopes;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$Companion;", "", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$PreviousReplayHint;", "Lio/sentry/hints/b;", "<init>", "()V", "", "shouldEnrich", "()Z", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PreviousReplayHint implements b {
        @Override // io.sentry.hints.b
        public boolean shouldEnrich() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$ReplayExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReplayExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r5) {
            Intrinsics.checkNotNullParameter(r5, "r");
            StringBuilder sb2 = new StringBuilder("SentryReplayIntegration-");
            int i7 = this.cnt;
            this.cnt = i7 + 1;
            sb2.append(i7);
            Thread thread = new Thread(r5, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    static {
        v4.d().b("maven:io.sentry:sentry-android-replay", BuildConfig.VERSION_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReplayIntegration(@NotNull Context context, @NotNull f dateProvider, Function0<? extends Recorder> function0, Function1<? super v, ReplayCache> function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = function0;
        this.replayCacheProvider = function1;
        this.lastKnownConnectionStatus = k0.UNKNOWN;
        this.random = l.b(new Function0<i>() { // from class: io.sentry.android.replay.ReplayIntegration$random$2
            @Override // kotlin.jvm.functions.Function0
            public final i invoke() {
                return new i();
            }
        });
        this.rootViewsSpy = l.b(new Function0<RootViewsSpy>() { // from class: io.sentry.android.replay.ReplayIntegration$rootViewsSpy$2
            @Override // kotlin.jvm.functions.Function0
            public final RootViewsSpy invoke() {
                return RootViewsSpy.INSTANCE.install();
            }
        });
        this.replayExecutor = l.b(new Function0<ReplayExecutorService>() { // from class: io.sentry.android.replay.ReplayIntegration$replayExecutor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ReplayExecutorService invoke() {
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ReplayIntegration.ReplayExecutorServiceThreadFactory());
                Intrinsics.checkNotNull(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                w5 w5Var = this.this$0.options;
                if (w5Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    w5Var = null;
                }
                return new ReplayExecutorService(scheduledExecutorServiceNewSingleThreadScheduledExecutor, w5Var);
            }
        });
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        l2 l2Var = l2.f12792a;
        Intrinsics.checkNotNullExpressionValue(l2Var, "getInstance(...)");
        this.replayBreadcrumbConverter = l2Var;
        this.mainLooperHandler = new MainLooperHandler(null, 1, null);
        this.lifecycleLock = new io.sentry.util.a();
        this.lifecycle = new ReplayLifecycle();
    }

    private final void checkCanRecord() {
        x0 x0Var;
        x0 x0Var2;
        p pVarD;
        p pVarD2;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (this.lastKnownConnectionStatus == k0.DISCONNECTED || !(((x0Var = this.scopes) == null || (pVarD2 = x0Var.d()) == null || !pVarD2.f(io.sentry.l.All)) && ((x0Var2 = this.scopes) == null || (pVarD = x0Var2.d()) == null || !pVarD.f(io.sentry.l.Replay)))) {
                pauseInternal();
            }
        }
    }

    private final void cleanupReplays(String unfinishedReplayId) {
        File[] fileArrListFiles;
        w5 w5Var = this.options;
        if (w5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            w5Var = null;
        }
        String cacheDirPath = w5Var.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        Intrinsics.checkNotNull(fileArrListFiles);
        for (File file : fileArrListFiles) {
            String name = file.getName();
            Intrinsics.checkNotNull(name);
            if (x.o(name, "replay_", false)) {
                String string = getReplayId().toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (!StringsKt.D(name, string, false) && (StringsKt.K(unfinishedReplayId) || !StringsKt.D(name, unfinishedReplayId, false))) {
                    a.a.d(file);
                }
            }
        }
    }

    public static /* synthetic */ void cleanupReplays$default(ReplayIntegration replayIntegration, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = "";
        }
        replayIntegration.cleanupReplays(str);
    }

    private final void finalizePreviousReplay() {
        w5 w5Var = this.options;
        w5 w5Var2 = null;
        if (w5Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            w5Var = null;
        }
        a1 executorService = w5Var.getExecutorService();
        Intrinsics.checkNotNullExpressionValue(executorService, "getExecutorService(...)");
        w5 w5Var3 = this.options;
        if (w5Var3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
        } else {
            w5Var2 = w5Var3;
        }
        ExecutorsKt.submitSafely(executorService, w5Var2, "ReplayIntegration.finalize_previous_replay", new io.sentry.android.core.p(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finalizePreviousReplay$lambda$10(ReplayIntegration replayIntegration) throws IOException {
        w5 w5Var;
        w5 w5Var2 = replayIntegration.options;
        if (w5Var2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("options");
            w5Var2 = null;
        }
        g gVarFindPersistingScopeObserver = w5Var2.findPersistingScopeObserver();
        if (gVarFindPersistingScopeObserver != null) {
            w5 w5Var3 = replayIntegration.options;
            if (w5Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                w5Var3 = null;
            }
            String str = (String) gVarFindPersistingScopeObserver.p(w5Var3, "replay.json", String.class);
            if (str != null) {
                v vVar = new v(str);
                if (Intrinsics.areEqual(vVar, v.f13055e)) {
                    cleanupReplays$default(replayIntegration, null, 1, null);
                    return;
                }
                ReplayCache.Companion companion = ReplayCache.INSTANCE;
                w5 w5Var4 = replayIntegration.options;
                if (w5Var4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    w5Var4 = null;
                }
                LastSegmentData lastSegmentDataFromDisk$sentry_android_replay_release = companion.fromDisk$sentry_android_replay_release(w5Var4, vVar, replayIntegration.replayCacheProvider);
                if (lastSegmentDataFromDisk$sentry_android_replay_release == null) {
                    cleanupReplays$default(replayIntegration, null, 1, null);
                    return;
                }
                w5 w5Var5 = replayIntegration.options;
                if (w5Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    w5Var5 = null;
                }
                Object objP = gVarFindPersistingScopeObserver.p(w5Var5, "breadcrumbs.json", List.class);
                List<Breadcrumb> list = objP instanceof List ? (List) objP : null;
                CaptureStrategy.Companion companion2 = CaptureStrategy.INSTANCE;
                x0 x0Var = replayIntegration.scopes;
                w5 w5Var6 = replayIntegration.options;
                if (w5Var6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    w5Var = null;
                } else {
                    w5Var = w5Var6;
                }
                CaptureStrategy.ReplaySegment replaySegmentCreateSegment = companion2.createSegment(x0Var, w5Var, lastSegmentDataFromDisk$sentry_android_replay_release.getDuration(), lastSegmentDataFromDisk$sentry_android_replay_release.getTimestamp(), vVar, lastSegmentDataFromDisk$sentry_android_replay_release.getId(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingHeight(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingWidth(), lastSegmentDataFromDisk$sentry_android_replay_release.getReplayType(), lastSegmentDataFromDisk$sentry_android_replay_release.getCache(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getFrameRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getBitRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getScreenAtStart(), list, new LinkedList(lastSegmentDataFromDisk$sentry_android_replay_release.getEvents()));
                if (replaySegmentCreateSegment instanceof CaptureStrategy.ReplaySegment.Created) {
                    Hint hintP = a5.l0.p(new PreviousReplayHint());
                    x0 x0Var2 = replayIntegration.scopes;
                    Intrinsics.checkNotNull(hintP);
                    ((CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegment).capture(x0Var2, hintP);
                }
                replayIntegration.cleanupReplays(str);
                return;
            }
        }
        cleanupReplays$default(replayIntegration, null, 1, null);
    }

    private final i getRandom() {
        return (i) this.random.getValue();
    }

    private final ReplayExecutorService getReplayExecutor() {
        return (ReplayExecutorService) this.replayExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void onScreenshotRecorded$lambda$4(Ref.ObjectRef objectRef, IScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String strA = it.a();
        objectRef.element = strA != null ? StringsKt.W('.', strA, strA) : 0;
    }

    private final void pauseInternal() {
        r rVarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.PAUSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.pause();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.pause();
                    }
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    Unit unit = Unit.f14616a;
                    c.i(rVarA, null);
                    return;
                }
            }
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

    private final void registerRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            Intrinsics.checkNotNull(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.add((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().add(this.gestureRecorder);
    }

    private final void resumeInternal() {
        x0 x0Var;
        x0 x0Var2;
        p pVarD;
        p pVarD2;
        r rVarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.RESUMED;
                if (replayLifecycle.isAllowed(replayState)) {
                    if (!this.isManualPause.get() && this.lastKnownConnectionStatus != k0.DISCONNECTED && (((x0Var = this.scopes) == null || (pVarD2 = x0Var.d()) == null || !pVarD2.f(io.sentry.l.All)) && ((x0Var2 = this.scopes) == null || (pVarD = x0Var2.d()) == null || !pVarD.f(io.sentry.l.Replay)))) {
                        this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                        CaptureStrategy captureStrategy = this.captureStrategy;
                        if (captureStrategy != null) {
                            captureStrategy.resume();
                        }
                        Recorder recorder = this.recorder;
                        if (recorder != null) {
                            recorder.resume();
                            Unit unit = Unit.f14616a;
                        }
                        c.i(rVarA, null);
                        return;
                    }
                    c.i(rVarA, null);
                    return;
                }
            }
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

    private final void unregisterRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            Intrinsics.checkNotNull(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.remove((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().remove(this.gestureRecorder);
    }

    @Override // io.sentry.j3
    public void captureReplay(Boolean isTerminating) {
        if (this.isEnabled.get() && isRecording()) {
            v vVar = v.f13055e;
            CaptureStrategy captureStrategy = this.captureStrategy;
            w5 w5Var = null;
            if (vVar.equals(captureStrategy != null ? captureStrategy.getCurrentReplayId() : null)) {
                w5 w5Var2 = this.options;
                if (w5Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    w5Var = w5Var2;
                }
                w5Var.getLogger().q(SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.captureReplay(Intrinsics.areEqual(isTerminating, Boolean.TRUE), new Function1<Date, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.captureReplay.1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Date) obj);
                        return Unit.f14616a;
                    }

                    public final void invoke(Date newTimestamp) {
                        Intrinsics.checkNotNullParameter(newTimestamp, "newTimestamp");
                        CaptureStrategy captureStrategy3 = ReplayIntegration.this.captureStrategy;
                        if (captureStrategy3 != null) {
                            CaptureStrategy captureStrategy4 = ReplayIntegration.this.captureStrategy;
                            Integer numValueOf = captureStrategy4 != null ? Integer.valueOf(captureStrategy4.getCurrentSegment()) : null;
                            Intrinsics.checkNotNull(numValueOf);
                            captureStrategy3.setCurrentSegment(numValueOf.intValue() + 1);
                        }
                        CaptureStrategy captureStrategy5 = ReplayIntegration.this.captureStrategy;
                        if (captureStrategy5 == null) {
                            return;
                        }
                        captureStrategy5.setSegmentTimestamp(newTimestamp);
                    }
                });
            }
            CaptureStrategy captureStrategy3 = this.captureStrategy;
            this.captureStrategy = captureStrategy3 != null ? captureStrategy3.convert() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        p pVarD;
        r rVarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.CLOSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    w5 w5Var = this.options;
                    if (w5Var == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        w5Var = null;
                    }
                    w5Var.getConnectionStatusProvider().W(this);
                    x0 x0Var = this.scopes;
                    if (x0Var != null && (pVarD = x0Var.d()) != null) {
                        pVarD.f13199v.remove(this);
                    }
                    stop();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.close();
                    }
                    this.recorder = null;
                    getRootViewsSpy$sentry_android_replay_release().close();
                    getReplayExecutor().shutdown();
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    Unit unit = Unit.f14616a;
                    c.i(rVarA, null);
                    return;
                }
            }
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

    public void disableDebugMaskingOverlay() {
        this.debugMaskingEnabled = false;
    }

    public void enableDebugMaskingOverlay() {
        this.debugMaskingEnabled = true;
    }

    @Override // io.sentry.j3
    @NotNull
    /* JADX INFO: renamed from: getBreadcrumbConverter, reason: from getter */
    public i3 getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public final File getReplayCacheDir() {
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            return captureStrategy.getReplayCacheDir();
        }
        return null;
    }

    @NotNull
    public v getReplayId() {
        v currentReplayId;
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null && (currentReplayId = captureStrategy.getCurrentReplayId()) != null) {
            return currentReplayId;
        }
        v EMPTY_ID = v.f13055e;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    @NotNull
    public final RootViewsSpy getRootViewsSpy$sentry_android_replay_release() {
        return (RootViewsSpy) this.rootViewsSpy.getValue();
    }

    @Override // io.sentry.j3
    /* JADX INFO: renamed from: isDebugMaskingOverlayEnabled, reason: from getter */
    public boolean getDebugMaskingEnabled() {
        return this.debugMaskingEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: isEnabled$sentry_android_replay_release, reason: from getter */
    public final AtomicBoolean getIsEnabled() {
        return this.isEnabled;
    }

    @NotNull
    /* JADX INFO: renamed from: isManualPause$sentry_android_replay_release, reason: from getter */
    public final AtomicBoolean getIsManualPause() {
        return this.isManualPause;
    }

    public boolean isRecording() {
        return this.lifecycle.getCurrentState().compareTo(ReplayState.STARTED) >= 0 && this.lifecycle.getCurrentState().compareTo(ReplayState.STOPPED) < 0;
    }

    public final void onConfigurationChanged(@NotNull ScreenshotRecorderConfig config) {
        Recorder recorder;
        Intrinsics.checkNotNullParameter(config, "config");
        if (this.isEnabled.get() && isRecording()) {
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.onConfigurationChanged(config);
            }
            Recorder recorder2 = this.recorder;
            if (recorder2 != null) {
                recorder2.onConfigurationChanged(config);
            }
            if (this.lifecycle.getCurrentState() != ReplayState.PAUSED || (recorder = this.recorder) == null) {
                return;
            }
            recorder.pause();
        }
    }

    @Override // io.sentry.l0
    public void onConnectionStatusChanged(@NotNull k0 status) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.lastKnownConnectionStatus = status;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (status == k0.DISCONNECTED) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.transport.o
    public void onRateLimitChanged(@NotNull p rateLimiter) {
        Intrinsics.checkNotNullParameter(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (rateLimiter.f(io.sentry.l.All) || rateLimiter.f(io.sentry.l.Replay)) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(@NotNull final Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        x0 x0Var = this.scopes;
        if (x0Var != null) {
            x0Var.r(null, new a(objectRef, 0));
        }
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onScreenshotRecorded(bitmap, new Function2<ReplayCache, Long, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.onScreenshotRecorded.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
                    invoke((ReplayCache) obj, ((Number) obj2).longValue());
                    return Unit.f14616a;
                }

                public final void invoke(ReplayCache onScreenshotRecorded, long j) throws IOException {
                    Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
                    onScreenshotRecorded.addFrame$sentry_android_replay_release(bitmap, j, objectRef.element);
                }
            });
        }
        checkCanRecord();
    }

    @Override // io.sentry.android.replay.gestures.TouchRecorderCallback
    public void onTouchEvent(@NotNull MotionEvent event) {
        CaptureStrategy captureStrategy;
        Intrinsics.checkNotNullParameter(event, "event");
        if (this.isEnabled.get() && this.lifecycle.isTouchRecordingAllowed() && (captureStrategy = this.captureStrategy) != null) {
            captureStrategy.onTouchEvent(event);
        }
    }

    @Override // io.sentry.android.replay.WindowCallback
    public void onWindowSizeChanged(int width, int height) {
        if (this.isEnabled.get() && isRecording()) {
            w5 w5Var = this.options;
            w5 w5Var2 = null;
            if (w5Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                w5Var = null;
            }
            if (w5Var.getSessionReplay().f12058l) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
                Context context = this.context;
                w5 w5Var3 = this.options;
                if (w5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                } else {
                    w5Var2 = w5Var3;
                }
                a6 sessionReplay = w5Var2.getSessionReplay();
                Intrinsics.checkNotNullExpressionValue(sessionReplay, "getSessionReplay(...)");
                onConfigurationChanged(companion.fromSize(context, sessionReplay, width, height));
            }
        }
    }

    @Override // io.sentry.j3
    public void pause() {
        this.isManualPause.set(true);
        pauseInternal();
    }

    @Override // io.sentry.l1
    public void register(@NotNull x0 scopes, @NotNull w5 options) {
        Double d6;
        ReplayIntegration replayIntegration;
        Recorder windowRecorder;
        GestureRecorder gestureRecorder;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.options = options;
        if (Build.VERSION.SDK_INT < 26) {
            options.getLogger().q(SentryLevel.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
            return;
        }
        Double d7 = options.getSessionReplay().f12049a;
        if ((d7 == null || d7.doubleValue() <= 0.0d) && ((d6 = options.getSessionReplay().f12050b) == null || d6.doubleValue() <= 0.0d)) {
            options.getLogger().q(SentryLevel.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        Function0<Recorder> function0 = this.recorderProvider;
        if (function0 == null || (windowRecorder = (Recorder) function0.invoke()) == null) {
            replayIntegration = this;
            windowRecorder = new WindowRecorder(options, replayIntegration, this, this.mainLooperHandler, getReplayExecutor());
        } else {
            replayIntegration = this;
        }
        replayIntegration.recorder = windowRecorder;
        Function0<GestureRecorder> function1 = replayIntegration.gestureRecorderProvider;
        if (function1 == null || (gestureRecorder = (GestureRecorder) function1.invoke()) == null) {
            gestureRecorder = new GestureRecorder(options, this);
        }
        replayIntegration.gestureRecorder = gestureRecorder;
        replayIntegration.isEnabled.set(true);
        options.getConnectionStatusProvider().M(this);
        p pVarD = scopes.d();
        if (pVarD != null) {
            pVarD.f13199v.add(this);
        }
        c9.a.c("Replay");
        finalizePreviousReplay();
    }

    @Override // io.sentry.j3
    public void resume() {
        this.isManualPause.set(false);
        resumeInternal();
    }

    @Override // io.sentry.j3
    public void setBreadcrumbConverter(@NotNull i3 converter) {
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    @Override // io.sentry.j3
    public void start() {
        CaptureStrategy bufferCaptureStrategy;
        w5 w5Var;
        w5 w5Var2;
        r rVarA = this.lifecycleLock.a();
        try {
            if (!this.isEnabled.get()) {
                c.i(rVarA, null);
                return;
            }
            ReplayLifecycle replayLifecycle = this.lifecycle;
            ReplayState replayState = ReplayState.STARTED;
            if (!replayLifecycle.isAllowed(replayState)) {
                w5 w5Var3 = this.options;
                if (w5Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    w5Var3 = null;
                }
                w5Var3.getLogger().q(SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                c.i(rVarA, null);
                return;
            }
            i random = getRandom();
            w5 w5Var4 = this.options;
            if (w5Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("options");
                w5Var4 = null;
            }
            boolean zSample = SamplingKt.sample(random, w5Var4.getSessionReplay().f12049a);
            if (!zSample) {
                w5 w5Var5 = this.options;
                if (w5Var5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("options");
                    w5Var5 = null;
                }
                Double d6 = w5Var5.getSessionReplay().f12050b;
                if (!(d6 != null && d6.doubleValue() > 0.0d)) {
                    w5 w5Var6 = this.options;
                    if (w5Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        w5Var6 = null;
                    }
                    w5Var6.getLogger().q(SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    c.i(rVarA, null);
                    return;
                }
            }
            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
            Function1<? super Boolean, ? extends CaptureStrategy> function1 = this.replayCaptureStrategyProvider;
            if (function1 == null || (bufferCaptureStrategy = (CaptureStrategy) function1.invoke(Boolean.valueOf(zSample))) == null) {
                if (zSample) {
                    w5 w5Var7 = this.options;
                    if (w5Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        w5Var2 = null;
                    } else {
                        w5Var2 = w5Var7;
                    }
                    bufferCaptureStrategy = new SessionCaptureStrategy(w5Var2, this.scopes, this.dateProvider, getReplayExecutor(), this.replayCacheProvider);
                } else {
                    w5 w5Var8 = this.options;
                    if (w5Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("options");
                        w5Var = null;
                    } else {
                        w5Var = w5Var8;
                    }
                    bufferCaptureStrategy = new BufferCaptureStrategy(w5Var, this.scopes, this.dateProvider, getRandom(), getReplayExecutor(), this.replayCacheProvider);
                }
            }
            this.captureStrategy = bufferCaptureStrategy;
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.start();
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                CaptureStrategy.DefaultImpls.start$default(captureStrategy, 0, null, null, 7, null);
            }
            registerRootViewListeners();
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

    @Override // io.sentry.j3
    public void stop() {
        r rVarA = this.lifecycleLock.a();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.STOPPED;
                if (replayLifecycle.isAllowed(replayState)) {
                    unregisterRootViewListeners();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.reset();
                    }
                    Recorder recorder2 = this.recorder;
                    if (recorder2 != null) {
                        recorder2.stop();
                    }
                    GestureRecorder gestureRecorder = this.gestureRecorder;
                    if (gestureRecorder != null) {
                        gestureRecorder.stop();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    Unit unit = Unit.f14616a;
                    c.i(rVarA, null);
                    return;
                }
            }
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

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(@NotNull final File screenshot, final long frameTimestamp) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            CaptureStrategy.DefaultImpls.onScreenshotRecorded$default(captureStrategy, null, new Function2<ReplayCache, Long, Unit>() { // from class: io.sentry.android.replay.ReplayIntegration.onScreenshotRecorded.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((ReplayCache) obj, ((Number) obj2).longValue());
                    return Unit.f14616a;
                }

                public final void invoke(ReplayCache onScreenshotRecorded, long j) {
                    Intrinsics.checkNotNullParameter(onScreenshotRecorded, "$this$onScreenshotRecorded");
                    ReplayCache.addFrame$default(onScreenshotRecorded, screenshot, frameTimestamp, null, 4, null);
                }
            }, 1, null);
        }
        checkCanRecord();
    }

    public /* synthetic */ ReplayIntegration(Context context, f fVar, Function0 function0, Function1 function1, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fVar, (i7 & 4) != 0 ? null : function0, (i7 & 8) != 0 ? null : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(@NotNull Context context, @NotNull f dateProvider) {
        this(ContextKt.appContext(context), dateProvider, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
    }

    public /* synthetic */ ReplayIntegration(Context context, f fVar, Function0 function0, Function1 function1, Function1 function2, MainLooperHandler mainLooperHandler, Function0 function3, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, fVar, function0, function1, (i7 & 16) != 0 ? null : function2, (i7 & 32) != 0 ? null : mainLooperHandler, (i7 & 64) != 0 ? null : function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(@NotNull Context context, @NotNull f dateProvider, Function0<? extends Recorder> function0, Function1<? super v, ReplayCache> function1, Function1<? super Boolean, ? extends CaptureStrategy> function2, MainLooperHandler mainLooperHandler, Function0<GestureRecorder> function3) {
        this(ContextKt.appContext(context), dateProvider, function0, function1);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.replayCaptureStrategyProvider = function2;
        this.mainLooperHandler = mainLooperHandler == null ? new MainLooperHandler(null, 1, null) : mainLooperHandler;
        this.gestureRecorderProvider = function3;
    }
}
