package io.sentry.android.replay.capture;

import a3.e;
import android.graphics.Bitmap;
import com.facebook.react.uimanager.ViewProps;
import gc.o;
import io.sentry.IScope;
import io.sentry.SentryLevel;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.protocol.v;
import io.sentry.transport.f;
import io.sentry.w5;
import io.sentry.x0;
import io.sentry.x5;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 82\u00020\u0001:\u00018BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u001fJ+\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00130\nH\u0016¢\u0006\u0004\b%\u0010&J3\u0010,\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00130)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107¨\u00069"}, d2 = {"Lio/sentry/android/replay/capture/SessionCaptureStrategy;", "Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Lio/sentry/w5;", "options", "Lio/sentry/x0;", "scopes", "Lio/sentry/transport/f;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lkotlin/Function1;", "Lio/sentry/protocol/v;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Lio/sentry/w5;Lio/sentry/x0;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function1;)V", "", "taskName", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "", "onSegmentCreated", "createCurrentSegment", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "", "segmentId", "replayId", "Lio/sentry/x5;", "replayType", ViewProps.START, "(ILio/sentry/protocol/v;Lio/sentry/x5;)V", "pause", "()V", "stop", "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "captureReplay", "(ZLkotlin/jvm/functions/Function1;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "", "store", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;Lkotlin/jvm/functions/Function2;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Lio/sentry/android/replay/capture/CaptureStrategy;", "convert", "()Lio/sentry/android/replay/capture/CaptureStrategy;", "Lio/sentry/w5;", "Lio/sentry/x0;", "Lio/sentry/transport/f;", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SessionCaptureStrategy extends BaseCaptureStrategy {

    @NotNull
    private static final String TAG = "SessionCaptureStrategy";

    @NotNull
    private final f dateProvider;

    @NotNull
    private final w5 options;
    private final x0 scopes;
    public static final int $stable = 8;

    public /* synthetic */ SessionCaptureStrategy(w5 w5Var, x0 x0Var, f fVar, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(w5Var, x0Var, fVar, scheduledExecutorService, (i7 & 16) != 0 ? null : function1);
    }

    private final void createCurrentSegment(String taskName, Function1<? super CaptureStrategy.ReplaySegment, Unit> onSegmentCreated) {
        ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        if (recorderConfig$sentry_android_replay_release == null) {
            this.options.getLogger().q(SentryLevel.DEBUG, e.l("Recorder config is not set, not creating segment for task: ", taskName), new Object[0]);
            return;
        }
        long jE = this.dateProvider.e();
        Date segmentTimestamp = getSegmentTimestamp();
        if (segmentTimestamp == null) {
            return;
        }
        getReplayExecutor().submit(new ReplayRunnable(e.l("SessionCaptureStrategy.", taskName), new a(this, jE - segmentTimestamp.getTime(), segmentTimestamp, getCurrentReplayId(), recorderConfig$sentry_android_replay_release, onSegmentCreated, 1)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(SessionCaptureStrategy sessionCaptureStrategy, long j, Date date, v vVar, ScreenshotRecorderConfig screenshotRecorderConfig, Function1 function1) {
        function1.invoke(BaseCaptureStrategy.createSegmentInternal$default(sessionCaptureStrategy, j, date, vVar, sessionCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$3(SessionCaptureStrategy sessionCaptureStrategy, Function2 function2, long j, ScreenshotRecorderConfig screenshotRecorderConfig) {
        ReplayCache cache = sessionCaptureStrategy.getCache();
        if (cache != null) {
            function2.invoke(cache, Long.valueOf(j));
        }
        Date segmentTimestamp = sessionCaptureStrategy.getSegmentTimestamp();
        if (segmentTimestamp == null) {
            sessionCaptureStrategy.options.getLogger().q(SentryLevel.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (sessionCaptureStrategy.getIsTerminating().get()) {
            sessionCaptureStrategy.options.getLogger().q(SentryLevel.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (screenshotRecorderConfig == null) {
            sessionCaptureStrategy.options.getLogger().q(SentryLevel.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long jE = sessionCaptureStrategy.dateProvider.e();
        if (jE - segmentTimestamp.getTime() >= sessionCaptureStrategy.options.getSessionReplay().j) {
            CaptureStrategy.ReplaySegment replaySegmentCreateSegmentInternal$default = BaseCaptureStrategy.createSegmentInternal$default(sessionCaptureStrategy, sessionCaptureStrategy.options.getSessionReplay().j, segmentTimestamp, sessionCaptureStrategy.getCurrentReplayId(), sessionCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null);
            if (replaySegmentCreateSegmentInternal$default instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegmentInternal$default;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, sessionCaptureStrategy.scopes, null, 2, null);
                sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                sessionCaptureStrategy.setSegmentTimestamp(created.getReplay().R);
            }
        }
        if (jE - sessionCaptureStrategy.getReplayStartTimestamp().get() >= sessionCaptureStrategy.options.getSessionReplay().k) {
            sessionCaptureStrategy.options.getReplayController().stop();
            sessionCaptureStrategy.options.getLogger().q(SentryLevel.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(SessionCaptureStrategy sessionCaptureStrategy, IScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.k(sessionCaptureStrategy.getCurrentReplayId());
        String strA = it.a();
        sessionCaptureStrategy.setScreenAtStart(strA != null ? StringsKt.W('.', strA, strA) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(IScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.k(v.f13055e);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean isTerminating, @NotNull Function1<? super Date, Unit> onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (this.options.getSessionReplay().f12060n) {
            this.options.getLogger().q(SentryLevel.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        getIsTerminating().set(isTerminating);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public CaptureStrategy convert() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        createCurrentSegment("onConfigurationChanged", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.onConfigurationChanged.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CaptureStrategy.ReplaySegment) obj);
                return Unit.f14616a;
            }

            public final void invoke(CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                    CaptureStrategy.ReplaySegment.Created.capture$default(created, SessionCaptureStrategy.this.scopes, null, 2, null);
                    SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                    sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                    SessionCaptureStrategy.this.setSegmentTimestamp(created.getReplay().R);
                }
            }
        });
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(Bitmap bitmap, @NotNull final Function2<? super ReplayCache, ? super Long, Unit> store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        final long jE = this.dateProvider.e();
        getReplayExecutor().submit(new ReplayRunnable("SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                SessionCaptureStrategy.onScreenshotRecorded$lambda$3(this.f12480d, store, jE, recorderConfig$sentry_android_replay_release);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.pause.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CaptureStrategy.ReplaySegment) obj);
                return Unit.f14616a;
            }

            public final void invoke(CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.scopes, null, 2, null);
                    SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                    sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                }
            }
        });
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void start(int segmentId, @NotNull v replayId, x5 replayType) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.start(segmentId, replayId, replayType);
        x0 x0Var = this.scopes;
        if (x0Var != null) {
            x0Var.r(null, new o(21, this));
        }
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache cache = getCache();
        final File replayCacheDir$sentry_android_replay_release = cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null;
        createCurrentSegment("stop", new Function1<CaptureStrategy.ReplaySegment, Unit>() { // from class: io.sentry.android.replay.capture.SessionCaptureStrategy.stop.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((CaptureStrategy.ReplaySegment) obj);
                return Unit.f14616a;
            }

            public final void invoke(CaptureStrategy.ReplaySegment segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                    CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.scopes, null, 2, null);
                }
                SessionCaptureStrategy.this.setCurrentSegment(-1);
                a.a.d(replayCacheDir$sentry_android_replay_release);
            }
        });
        x0 x0Var = this.scopes;
        if (x0Var != null) {
            x0Var.r(null, new hm.a(27));
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCaptureStrategy(@NotNull w5 options, x0 x0Var, @NotNull f dateProvider, @NotNull ScheduledExecutorService executor, Function1<? super v, ReplayCache> function1) {
        super(options, x0Var, dateProvider, executor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.options = options;
        this.scopes = x0Var;
        this.dateProvider = dateProvider;
    }
}
