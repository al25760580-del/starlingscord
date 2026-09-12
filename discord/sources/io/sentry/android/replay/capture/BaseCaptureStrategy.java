package io.sentry.android.replay.capture;

import android.annotation.TargetApi;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.ViewProps;
import io.sentry.Breadcrumb;
import io.sentry.SentryLevel;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.gestures.ReplayGestureConverter;
import io.sentry.android.replay.util.ReplayExecutorService;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.protocol.v;
import io.sentry.rrweb.e;
import io.sentry.transport.f;
import io.sentry.w5;
import io.sentry.x0;
import io.sentry.x5;
import java.io.File;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0088\u0001\u0089\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0093\u0001\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0*H\u0004¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107Jb\u0010?\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0006\u0012\u0004\u0018\u00018\u00000=\"\u0004\b\u0000\u001082\n\b\u0002\u00109\u001a\u0004\u0018\u00018\u00002\u0006\u0010:\u001a\u00020%2&\b\u0006\u0010<\u001a \u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150;H\u0082\b¢\u0006\u0004\b?\u0010@J`\u0010A\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010>\u0012\u0004\u0012\u00028\u00000=\"\u0004\b\u0000\u001082\n\b\u0002\u00109\u001a\u0004\u0018\u00018\u00002\u0006\u0010:\u001a\u00020%2&\b\u0006\u0010<\u001a \u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150;H\u0082\b¢\u0006\u0004\bA\u0010@R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010GR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u001b\u0010L\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010GR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010Q\u001a\u00020P8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010SR$\u0010$\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b$\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR/\u00101\u001a\u0004\u0018\u0001002\b\u0010Y\u001a\u0004\u0018\u0001008@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u00103R/\u0010d\u001a\u0004\u0018\u00010\u001e2\b\u0010Y\u001a\u0004\u0018\u00010\u001e8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010[\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010f\u001a\u00020e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR/\u0010&\u001a\u0004\u0018\u00010%2\b\u0010Y\u001a\u0004\u0018\u00010%8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010[\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR+\u0010t\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bo\u0010[\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR+\u0010z\u001a\u00020\u00102\u0006\u0010Y\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010[\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR+\u0010\u0014\u001a\u00020\u00132\u0006\u0010Y\u001a\u00020\u00138V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010[\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020+0*8\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008a\u0001"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Lio/sentry/android/replay/capture/CaptureStrategy;", "Lio/sentry/w5;", "options", "Lio/sentry/x0;", "scopes", "Lio/sentry/transport/f;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Lkotlin/Function1;", "Lio/sentry/protocol/v;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Lio/sentry/w5;Lio/sentry/x0;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;Lkotlin/jvm/functions/Function1;)V", "", "segmentId", "replayId", "Lio/sentry/x5;", "replayType", "", ViewProps.START, "(ILio/sentry/protocol/v;Lio/sentry/x5;)V", "resume", "()V", "pause", "stop", "", "duration", "Ljava/util/Date;", "currentSegmentTimestamp", "height", "width", "frameRate", "bitRate", "cache", "", "screenAtStart", "", "Lio/sentry/Breadcrumb;", "breadcrumbs", "Ljava/util/Deque;", "Lio/sentry/rrweb/b;", "events", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "createSegmentInternal", "(JLjava/util/Date;Lio/sentry/protocol/v;IIIIILio/sentry/x5;Lio/sentry/android/replay/ReplayCache;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "T", "initialValue", "propertyName", "Lkotlin/Function3;", "onChange", "Lkotlin/properties/ReadWriteProperty;", "", "persistableAtomicNullable", "(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function3;)Lkotlin/properties/ReadWriteProperty;", "persistableAtomic", "Lio/sentry/w5;", "Lio/sentry/x0;", "Lio/sentry/transport/f;", "Ljava/util/concurrent/ScheduledExecutorService;", "getReplayExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "Lkotlin/jvm/functions/Function1;", "persistingExecutor$delegate", "Lkotlin/Lazy;", "getPersistingExecutor", "persistingExecutor", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "gestureConverter", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminating", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/ReplayCache;", "getCache", "()Lio/sentry/android/replay/ReplayCache;", "setCache", "(Lio/sentry/android/replay/ReplayCache;)V", "<set-?>", "recorderConfig$delegate", "Lkotlin/properties/ReadWriteProperty;", "getRecorderConfig$sentry_android_replay_release", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "setRecorderConfig$sentry_android_replay_release", "segmentTimestamp$delegate", "getSegmentTimestamp", "()Ljava/util/Date;", "setSegmentTimestamp", "(Ljava/util/Date;)V", "segmentTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "replayStartTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getReplayStartTimestamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "screenAtStart$delegate", "getScreenAtStart", "()Ljava/lang/String;", "setScreenAtStart", "(Ljava/lang/String;)V", "currentReplayId$delegate", "getCurrentReplayId", "()Lio/sentry/protocol/v;", "setCurrentReplayId", "(Lio/sentry/protocol/v;)V", "currentReplayId", "currentSegment$delegate", "getCurrentSegment", "()I", "setCurrentSegment", "(I)V", "currentSegment", "replayType$delegate", "getReplayType", "()Lio/sentry/x5;", "setReplayType", "(Lio/sentry/x5;)V", "currentEvents", "Ljava/util/Deque;", "getCurrentEvents", "()Ljava/util/Deque;", "Ljava/io/File;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "Companion", "ReplayPersistingExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
@SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy\n*L\n1#1,221:1\n178#1,9:222\n209#1:231\n178#1,9:232\n209#1:241\n178#1,9:242\n209#1:251\n211#1,9:252\n186#1:261\n209#1:262\n211#1,9:263\n186#1:272\n209#1:273\n211#1,9:274\n186#1:283\n209#1:284\n186#1:285\n209#1:286\n186#1:287\n209#1:288\n*S KotlinDebug\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy\n*L\n67#1:222,9\n67#1:231\n78#1:232,9\n78#1:241\n86#1:242,9\n86#1:251\n88#1:252,9\n88#1:261\n88#1:262\n90#1:263,9\n90#1:272\n90#1:273\n94#1:274,9\n94#1:283\n94#1:284\n219#1:285\n219#1:286\n219#1:287\n219#1:288\n*E\n"})
public abstract class BaseCaptureStrategy implements CaptureStrategy {

    @NotNull
    private static final String TAG = "CaptureStrategy";
    private ReplayCache cache;

    @NotNull
    private final Deque<io.sentry.rrweb.b> currentEvents;

    /* JADX INFO: renamed from: currentReplayId$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty currentReplayId;

    /* JADX INFO: renamed from: currentSegment$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty currentSegment;

    @NotNull
    private final f dateProvider;

    @NotNull
    private final ReplayGestureConverter gestureConverter;

    @NotNull
    private final AtomicBoolean isTerminating;

    @NotNull
    private final w5 options;

    /* JADX INFO: renamed from: persistingExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy persistingExecutor;

    /* JADX INFO: renamed from: recorderConfig$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty recorderConfig;
    private final Function1<v, ReplayCache> replayCacheProvider;

    @NotNull
    private final ScheduledExecutorService replayExecutor;

    @NotNull
    private final AtomicLong replayStartTimestamp;

    /* JADX INFO: renamed from: replayType$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty replayType;
    private final x0 scopes;

    /* JADX INFO: renamed from: screenAtStart$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty screenAtStart;

    /* JADX INFO: renamed from: segmentTimestamp$delegate, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty segmentTimestamp;
    static final /* synthetic */ KProperty[] $$delegatedProperties = {com.discord.chat.presentation.list.a.p(BaseCaptureStrategy.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0), com.discord.chat.presentation.list.a.p(BaseCaptureStrategy.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0), com.discord.chat.presentation.list.a.p(BaseCaptureStrategy.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0), com.discord.chat.presentation.list.a.p(BaseCaptureStrategy.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0), com.discord.chat.presentation.list.a.p(BaseCaptureStrategy.class, "currentSegment", "getCurrentSegment()I", 0), com.discord.chat.presentation.list.a.p(BaseCaptureStrategy.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0)};
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy$ReplayPersistingExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReplayPersistingExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        @NotNull
        public Thread newThread(@NotNull Runnable r5) {
            Intrinsics.checkNotNullParameter(r5, "r");
            StringBuilder sb2 = new StringBuilder("SentryReplayPersister-");
            int i7 = this.cnt;
            this.cnt = i7 + 1;
            sb2.append(i7);
            Thread thread = new Thread(r5, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J&\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\bH\u0096\u0002¢\u0006\u0002\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\rH\u0002J.\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000fR\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2", "Lkotlin/properties/ReadWriteProperty;", "", "value", "Ljava/util/concurrent/atomic/AtomicReference;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "runInBackground", "", "task", "Lkotlin/Function0;", "setValue", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBaseCaptureStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCaptureStrategy.kt\nio/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2\n*L\n1#1,221:1\n*E\n"})
    public static final class AnonymousClass2 implements ReadWriteProperty {
        final /* synthetic */ Function3 $onChange;
        final /* synthetic */ String $propertyName;
        final /* synthetic */ BaseCaptureStrategy this$0;
        private final AtomicReference<T> value;

        public AnonymousClass2(T t5, BaseCaptureStrategy baseCaptureStrategy, Function3 function3, String str) {
            this.this$0 = baseCaptureStrategy;
            this.$onChange = function3;
            this.$propertyName = str;
            this.value = new AtomicReference<>(t5);
        }

        private final void runInBackground(final Function0<Unit> task) {
            if (this.this$0.options.getThreadChecker().c()) {
                this.this$0.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        task.invoke();
                    }
                }));
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th2) {
                this.this$0.options.getLogger().g(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
            }
        }

        /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
        @Override // io.d
        public T getValue(Object thisRef, KProperty property) {
            Intrinsics.checkNotNullParameter(property, "property");
            return this.value.get();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.properties.ReadWriteProperty
        public void setValue(Object thisRef, KProperty property, final T value) {
            Intrinsics.checkNotNullParameter(property, "property");
            final Object andSet = this.value.getAndSet(value);
            if (Intrinsics.areEqual(andSet, value)) {
                return;
            }
            final Function3 function3 = this.$onChange;
            final String str = this.$propertyName;
            runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Object invoke() {
                    m1247invoke();
                    return Unit.f14616a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m1247invoke() {
                    function3.invoke(str, andSet, value);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseCaptureStrategy(@NotNull w5 options, x0 x0Var, @NotNull f dateProvider, @NotNull ScheduledExecutorService replayExecutor, Function1<? super v, ReplayCache> function1) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(replayExecutor, "replayExecutor");
        this.options = options;
        this.scopes = x0Var;
        this.dateProvider = dateProvider;
        this.replayExecutor = replayExecutor;
        this.replayCacheProvider = function1;
        this.persistingExecutor = l.b(new Function0<ReplayExecutorService>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistingExecutor$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ReplayExecutorService invoke() {
                ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new BaseCaptureStrategy.ReplayPersistingExecutorServiceThreadFactory());
                Intrinsics.checkNotNull(scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                return new ReplayExecutorService(scheduledExecutorServiceNewSingleThreadScheduledExecutor, this.this$0.options);
            }
        });
        this.gestureConverter = new ReplayGestureConverter(dateProvider);
        this.isTerminating = new AtomicBoolean(false);
        final Object obj = null;
        final String str = "";
        this.recorderConfig = new ReadWriteProperty(obj, this, str, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<ScreenshotRecorderConfig> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getThreadChecker().c()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().g(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // io.d
            public ScreenshotRecorderConfig getValue(Object thisRef, KProperty property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object thisRef, KProperty property, final ScreenshotRecorderConfig value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final ScreenshotRecorderConfig andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str2 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1251invoke();
                        return Unit.f14616a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1251invoke() {
                        Object obj2 = andSet;
                        ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) value;
                        if (screenshotRecorderConfig == null) {
                            return;
                        }
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_HEIGHT, String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                        }
                        ReplayCache cache2 = baseCaptureStrategy.getCache();
                        if (cache2 != null) {
                            cache2.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_WIDTH, String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                        }
                        ReplayCache cache3 = baseCaptureStrategy.getCache();
                        if (cache3 != null) {
                            cache3.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_FRAME_RATE, String.valueOf(screenshotRecorderConfig.getFrameRate()));
                        }
                        ReplayCache cache4 = baseCaptureStrategy.getCache();
                        if (cache4 != null) {
                            cache4.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_BIT_RATE, String.valueOf(screenshotRecorderConfig.getBitRate()));
                        }
                    }
                });
            }
        };
        final String str2 = ReplayCache.SEGMENT_KEY_TIMESTAMP;
        this.segmentTimestamp = new ReadWriteProperty(obj, this, str2, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Date> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str2;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getThreadChecker().c()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().g(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // io.d
            public Date getValue(Object thisRef, KProperty property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object thisRef, KProperty property, final Date value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final Date andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str3 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1252invoke();
                        return Unit.f14616a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1252invoke() {
                        Object obj2 = andSet;
                        Date date = (Date) value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_TIMESTAMP, date == null ? null : io.sentry.config.a.G(date));
                        }
                    }
                });
            }
        };
        this.replayStartTimestamp = new AtomicLong();
        final String str3 = ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START;
        this.screenAtStart = new ReadWriteProperty(obj, this, str3, this, str3) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<String> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str3;
                this.this$0 = this;
                this.$propertyName$inlined = str3;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getThreadChecker().c()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().g(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // io.d
            public String getValue(Object thisRef, KProperty property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object thisRef, KProperty property, final String value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final String andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str4 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str5 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1253invoke();
                        return Unit.f14616a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1253invoke() {
                        Object obj2 = value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues$sentry_android_replay_release(str5, String.valueOf(obj2));
                        }
                    }
                });
            }
        };
        final v vVar = v.f13055e;
        final String str4 = ReplayCache.SEGMENT_KEY_REPLAY_ID;
        this.currentReplayId = new ReadWriteProperty(vVar, this, str4, this, str4) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<v> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str4;
                this.this$0 = this;
                this.$propertyName$inlined = str4;
                this.value = new AtomicReference<>(vVar);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getThreadChecker().c()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().g(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // io.d
            public v getValue(Object thisRef, KProperty property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object thisRef, KProperty property, final v value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final v andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str5 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str6 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1248invoke();
                        return Unit.f14616a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1248invoke() {
                        Object obj2 = value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues$sentry_android_replay_release(str6, String.valueOf(obj2));
                        }
                    }
                });
            }
        };
        final int i7 = -1;
        final String str5 = ReplayCache.SEGMENT_KEY_ID;
        this.currentSegment = new ReadWriteProperty(i7, this, str5, this, str5) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Integer> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str5;
                this.this$0 = this;
                this.$propertyName$inlined = str5;
                this.value = new AtomicReference<>(i7);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getThreadChecker().c()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().g(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // io.d
            public Integer getValue(Object thisRef, KProperty property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object thisRef, KProperty property, final Integer value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final Integer andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str6 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str7 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1249invoke();
                        return Unit.f14616a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1249invoke() {
                        Object obj2 = value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues$sentry_android_replay_release(str7, String.valueOf(obj2));
                        }
                    }
                });
            }
        };
        final Object obj2 = null;
        final String str6 = ReplayCache.SEGMENT_KEY_REPLAY_TYPE;
        this.replayType = new ReadWriteProperty(obj2, this, str6, this, str6) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<x5> value;

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str6;
                this.this$0 = this;
                this.$propertyName$inlined = str6;
                this.value = new AtomicReference<>(obj2);
            }

            private final void runInBackground(final Function0<Unit> task) {
                if (this.this$0$inline_fun.options.getThreadChecker().c()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th2) {
                    this.this$0$inline_fun.options.getLogger().g(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }

            @Override // io.d
            public x5 getValue(Object thisRef, KProperty property) {
                Intrinsics.checkNotNullParameter(property, "property");
                return this.value.get();
            }

            @Override // kotlin.properties.ReadWriteProperty
            public void setValue(Object thisRef, KProperty property, final x5 value) {
                Intrinsics.checkNotNullParameter(property, "property");
                final x5 andSet = this.value.getAndSet(value);
                if (Intrinsics.areEqual(andSet, value)) {
                    return;
                }
                final String str7 = this.$propertyName;
                final BaseCaptureStrategy baseCaptureStrategy = this.this$0;
                final String str8 = this.$propertyName$inlined;
                runInBackground(new Function0<Unit>() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m1250invoke();
                        return Unit.f14616a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m1250invoke() {
                        Object obj3 = value;
                        ReplayCache cache = baseCaptureStrategy.getCache();
                        if (cache != null) {
                            cache.persistSegmentValues$sentry_android_replay_release(str8, String.valueOf(obj3));
                        }
                    }
                });
            }
        };
        this.currentEvents = new ConcurrentLinkedDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureStrategy.ReplaySegment createSegmentInternal$default(BaseCaptureStrategy baseCaptureStrategy, long j, Date date, v vVar, int i7, int i10, int i11, int i12, int i13, x5 x5Var, ReplayCache replayCache, String str, List list, Deque deque, int i14, Object obj) {
        if (obj == null) {
            return baseCaptureStrategy.createSegmentInternal(j, date, vVar, i7, i10, i11, i12, i13, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? baseCaptureStrategy.getReplayType() : x5Var, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? baseCaptureStrategy.cache : replayCache, (i14 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? baseCaptureStrategy.getScreenAtStart() : str, (i14 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? null : list, (i14 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? baseCaptureStrategy.currentEvents : deque);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService getPersistingExecutor() {
        return (ScheduledExecutorService) this.persistingExecutor.getValue();
    }

    private final <T> ReadWriteProperty persistableAtomic(T initialValue, String propertyName, Function3 onChange) {
        return new AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static /* synthetic */ ReadWriteProperty persistableAtomic$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, final String str, Function3 function3, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((i7 & 1) != 0) {
            obj = null;
        }
        if ((i7 & 4) != 0) {
            function3 = new Function3() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy.persistableAtomic.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    invoke((String) obj3, obj4, obj5);
                    return Unit.f14616a;
                }

                public final void invoke(String str2, Object obj3, Object obj4) {
                    ReplayCache cache = BaseCaptureStrategy.this.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(str, String.valueOf(obj4));
                    }
                }
            };
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, function3, str);
    }

    private final <T> ReadWriteProperty persistableAtomicNullable(T initialValue, String propertyName, Function3 onChange) {
        return new AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static /* synthetic */ ReadWriteProperty persistableAtomicNullable$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, final String str, Function3 function3, int i7, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((i7 & 1) != 0) {
            obj = null;
        }
        if ((i7 & 4) != 0) {
            function3 = new Function3() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy.persistableAtomicNullable.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    invoke((String) obj3, obj4, obj5);
                    return Unit.f14616a;
                }

                public final void invoke(String str2, Object obj3, Object obj4) {
                    ReplayCache cache = BaseCaptureStrategy.this.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(str, String.valueOf(obj4));
                    }
                }
            };
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, function3, str);
    }

    @NotNull
    public final CaptureStrategy.ReplaySegment createSegmentInternal(long duration, @NotNull Date currentSegmentTimestamp, @NotNull v replayId, int segmentId, int height, int width, int frameRate, int bitRate, @NotNull x5 replayType, ReplayCache cache, String screenAtStart, List<Breadcrumb> breadcrumbs, @NotNull Deque<io.sentry.rrweb.b> events) {
        Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Intrinsics.checkNotNullParameter(replayType, "replayType");
        Intrinsics.checkNotNullParameter(events, "events");
        return CaptureStrategy.INSTANCE.createSegment(this.scopes, this.options, duration, currentSegmentTimestamp, replayId, segmentId, height, width, replayType, cache, frameRate, bitRate, screenAtStart, breadcrumbs, events);
    }

    public final ReplayCache getCache() {
        return this.cache;
    }

    @NotNull
    public final Deque<io.sentry.rrweb.b> getCurrentEvents() {
        return this.currentEvents;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public v getCurrentReplayId() {
        return (v) this.currentReplayId.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public int getCurrentSegment() {
        return ((Number) this.currentSegment.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final ScreenshotRecorderConfig getRecorderConfig$sentry_android_replay_release() {
        return (ScreenshotRecorderConfig) this.recorderConfig.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public File getReplayCacheDir() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            return replayCache.getReplayCacheDir$sentry_android_replay_release();
        }
        return null;
    }

    @NotNull
    public final ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    @NotNull
    public final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    @NotNull
    public x5 getReplayType() {
        return (x5) this.replayType.getValue(this, $$delegatedProperties[5]);
    }

    public final String getScreenAtStart() {
        return (String) this.screenAtStart.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public Date getSegmentTimestamp() {
        return (Date) this.segmentTimestamp.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    /* JADX INFO: renamed from: isTerminating, reason: from getter */
    public final AtomicBoolean getIsTerminating() {
        return this.isTerminating;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(@NotNull ScreenshotRecorderConfig recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        setRecorderConfig$sentry_android_replay_release(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenChanged(String str) {
        CaptureStrategy.DefaultImpls.onScreenChanged(this, str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(@NotNull MotionEvent event) {
        List<e> listConvert;
        Intrinsics.checkNotNullParameter(event, "event");
        ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        if (recorderConfig$sentry_android_replay_release == null || (listConvert = this.gestureConverter.convert(event, recorderConfig$sentry_android_replay_release)) == null) {
            return;
        }
        i0.o(this.currentEvents, listConvert);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void resume() {
        setSegmentTimestamp(io.sentry.config.a.y());
    }

    public final void setCache(ReplayCache replayCache) {
        this.cache = replayCache;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentReplayId(@NotNull v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.currentReplayId.setValue(this, $$delegatedProperties[3], vVar);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentSegment(int i7) {
        this.currentSegment.setValue(this, $$delegatedProperties[4], Integer.valueOf(i7));
    }

    public final void setRecorderConfig$sentry_android_replay_release(ScreenshotRecorderConfig screenshotRecorderConfig) {
        this.recorderConfig.setValue(this, $$delegatedProperties[0], screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setReplayType(@NotNull x5 x5Var) {
        Intrinsics.checkNotNullParameter(x5Var, "<set-?>");
        this.replayType.setValue(this, $$delegatedProperties[5], x5Var);
    }

    public final void setScreenAtStart(String str) {
        this.screenAtStart.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setSegmentTimestamp(Date date) {
        this.segmentTimestamp.setValue(this, $$delegatedProperties[1], date);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void start(int segmentId, @NotNull v replayId, x5 replayType) {
        ReplayCache replayCache;
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        Function1<v, ReplayCache> function1 = this.replayCacheProvider;
        if (function1 == null || (replayCache = (ReplayCache) function1.invoke(replayId)) == null) {
            replayCache = new ReplayCache(this.options, replayId);
        }
        this.cache = replayCache;
        setCurrentReplayId(replayId);
        setCurrentSegment(segmentId);
        if (replayType == null) {
            replayType = this instanceof SessionCaptureStrategy ? x5.SESSION : x5.BUFFER;
        }
        setReplayType(replayType);
        setSegmentTimestamp(io.sentry.config.a.y());
        this.replayStartTimestamp.set(this.dateProvider.e());
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void stop() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            replayCache.close();
        }
        this.replayStartTimestamp.set(0L);
        setSegmentTimestamp(null);
        v EMPTY_ID = v.f13055e;
        Intrinsics.checkNotNullExpressionValue(EMPTY_ID, "EMPTY_ID");
        setCurrentReplayId(EMPTY_ID);
    }

    public /* synthetic */ BaseCaptureStrategy(w5 w5Var, x0 x0Var, f fVar, ScheduledExecutorService scheduledExecutorService, Function1 function1, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(w5Var, x0Var, fVar, scheduledExecutorService, (i7 & 16) != 0 ? null : function1);
    }
}
