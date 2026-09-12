package com.facebook.react.modules.core;

import android.util.SparseArray;
import android.view.Choreographer;
import bd.u;
import com.discord.misc.utilities.logThrottle.LogThrottleSingleton;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.common.SystemClock;
import com.facebook.react.devsupport.e;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.jstasks.HeadlessJsTaskContext;
import com.facebook.react.jstasks.HeadlessJsTaskEventListener;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0016\u0018\u0000 C2\u00020\u00012\u00020\u0002:\u0005?@ABCB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010%\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020#2\u0006\u0010'\u001a\u00020(H\u0016J\b\u0010*\u001a\u00020#H\u0016J\b\u0010+\u001a\u00020#H\u0002J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020#H\u0002J\b\u0010.\u001a\u00020#H\u0002J\b\u0010/\u001a\u00020#H\u0002J\b\u00100\u001a\u00020#H\u0002J \u00101\u001a\u00020#2\u0006\u00102\u001a\u00020(2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u001dH\u0017J(\u00106\u001a\u00020#2\u0006\u00102\u001a\u00020(2\u0006\u00107\u001a\u00020(2\u0006\u00108\u001a\u0002092\u0006\u00105\u001a\u00020\u001dH\u0016J\u0010\u0010:\u001a\u00020#2\u0006\u00102\u001a\u00020(H\u0017J\u0010\u0010;\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001dH\u0017J\u0015\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u000204H\u0000¢\u0006\u0002\b>R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00060\u0019R\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0018\u00010\u001bR\u00020\u0000X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00120!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/jstasks/HeadlessJsTaskEventListener;", "reactApplicationContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "javaScriptTimerExecutor", "Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;", "reactChoreographer", "Lcom/facebook/react/modules/core/ReactChoreographer;", "devSupportManager", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;Lcom/facebook/react/modules/core/JavaScriptTimerExecutor;Lcom/facebook/react/modules/core/ReactChoreographer;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V", "timerGuard", "", "idleCallbackGuard", "timerIdsToTimers", "Landroid/util/SparseArray;", "Lcom/facebook/react/modules/core/JavaTimerManager$Timer;", "isPaused", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isRunningTasks", "timerFrameCallback", "Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;", "idleFrameCallback", "Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;", "currentIdleCallbackRunnable", "Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;", "frameCallbackPosted", "", "frameIdleCallbackPosted", "sendIdleEvents", "timers", "Ljava/util/PriorityQueue;", "onHostPause", "", "onHostDestroy", "onHostResume", "onHeadlessJsTaskStart", "taskId", "", "onHeadlessJsTaskFinish", "onInstanceDestroy", "maybeSetChoreographerIdleCallback", "maybeIdleCallback", "setChoreographerCallback", "clearFrameCallback", "setChoreographerIdleCallback", "clearChoreographerIdleCallback", "createTimer", "timerId", "delay", "", "repeat", "createAndMaybeCallTimer", "duration", "jsSchedulingTime", "", "deleteTimer", "setSendIdleEvents", "hasActiveTimersInRange", "rangeMs", "hasActiveTimersInRange$ReactAndroid_release", "Timer", "TimerFrameCallback", "IdleFrameCallback", "IdleCallbackRunnable", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJavaTimerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTimerManager.kt\ncom/facebook/react/modules/core/JavaTimerManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,384:1\n1#2:385\n*E\n"})
public class JavaTimerManager implements LifecycleEventListener, HeadlessJsTaskEventListener {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float FRAME_DURATION_MS = 16.666666f;
    private static final float IDLE_CALLBACK_FRAME_DEADLINE_MS = 1.0f;
    private static final int TIMER_QUEUE_CAPACITY = 11;
    private IdleCallbackRunnable currentIdleCallbackRunnable;

    @NotNull
    private final DevSupportManager devSupportManager;
    private boolean frameCallbackPosted;
    private boolean frameIdleCallbackPosted;

    @NotNull
    private final Object idleCallbackGuard;

    @NotNull
    private final IdleFrameCallback idleFrameCallback;

    @NotNull
    private final AtomicBoolean isPaused;

    @NotNull
    private final AtomicBoolean isRunningTasks;

    @NotNull
    private final JavaScriptTimerExecutor javaScriptTimerExecutor;

    @NotNull
    private final ReactApplicationContext reactApplicationContext;

    @NotNull
    private final ReactChoreographer reactChoreographer;
    private boolean sendIdleEvents;

    @NotNull
    private final TimerFrameCallback timerFrameCallback;

    @NotNull
    private final Object timerGuard;

    @NotNull
    private final SparseArray<Timer> timerIdsToTimers;

    @NotNull
    private final PriorityQueue<Timer> timers;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$Companion;", "", "<init>", "()V", "IDLE_CALLBACK_FRAME_DEADLINE_MS", "", "FRAME_DURATION_MS", "TIMER_QUEUE_CAPACITY", "", "isTimerInRange", "", "timer", "Lcom/facebook/react/modules/core/JavaTimerManager$Timer;", "rangeMs", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isTimerInRange(Timer timer, long rangeMs) {
            return !timer.getRepeat() && ((long) timer.getInterval()) < rangeMs;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable;", "Ljava/lang/Runnable;", "frameStartTime", "", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;J)V", "isCancelled", "", "run", "", "cancel", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nJavaTimerManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaTimerManager.kt\ncom/facebook/react/modules/core/JavaTimerManager$IdleCallbackRunnable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,384:1\n1#2:385\n*E\n"})
    public final class IdleCallbackRunnable implements Runnable {
        private final long frameStartTime;
        private volatile boolean isCancelled;

        public IdleCallbackRunnable(long j) {
            this.frameStartTime = j;
        }

        public final void cancel() {
            this.isCancelled = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z5;
            if (this.isCancelled) {
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis() - (this.frameStartTime / ((long) 1000000));
            long jCurrentTimeMillis = SystemClock.currentTimeMillis() - jUptimeMillis;
            if (JavaTimerManager.FRAME_DURATION_MS - jUptimeMillis < 1.0f) {
                return;
            }
            Object obj = JavaTimerManager.this.idleCallbackGuard;
            JavaTimerManager javaTimerManager = JavaTimerManager.this;
            synchronized (obj) {
                z5 = javaTimerManager.sendIdleEvents;
                Unit unit = Unit.f14616a;
            }
            if (z5) {
                JavaTimerManager.this.javaScriptTimerExecutor.callIdleCallbacks(jCurrentTimeMillis);
            }
            JavaTimerManager.this.currentIdleCallbackRunnable = null;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$IdleFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;)V", "doFrame", "", "frameTimeNanos", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class IdleFrameCallback implements Choreographer.FrameCallback {
        public IdleFrameCallback() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            if (!JavaTimerManager.this.isPaused.get() || JavaTimerManager.this.isRunningTasks.get()) {
                IdleCallbackRunnable idleCallbackRunnable = JavaTimerManager.this.currentIdleCallbackRunnable;
                if (idleCallbackRunnable != null) {
                    idleCallbackRunnable.cancel();
                }
                IdleCallbackRunnable idleCallbackRunnable2 = JavaTimerManager.this.new IdleCallbackRunnable(frameTimeNanos);
                JavaTimerManager.this.currentIdleCallbackRunnable = idleCallbackRunnable2;
                JavaTimerManager.this.reactApplicationContext.runOnJSQueueThread(idleCallbackRunnable2);
                JavaTimerManager.this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this);
            }
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$Timer;", "", "timerId", "", "targetTime", "", "interval", "repeat", "", "<init>", "(IJIZ)V", "getTimerId", "()I", "getTargetTime", "()J", "setTargetTime", "(J)V", "getInterval", "getRepeat", "()Z", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Timer {
        private final int interval;
        private final boolean repeat;
        private long targetTime;
        private final int timerId;

        public Timer(int i7, long j, int i10, boolean z5) {
            this.timerId = i7;
            this.targetTime = j;
            this.interval = i10;
            this.repeat = z5;
        }

        public final int getInterval() {
            return this.interval;
        }

        public final boolean getRepeat() {
            return this.repeat;
        }

        public final long getTargetTime() {
            return this.targetTime;
        }

        public final int getTimerId() {
            return this.timerId;
        }

        public final void setTargetTime(long j) {
            this.targetTime = j;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/modules/core/JavaTimerManager$TimerFrameCallback;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/modules/core/JavaTimerManager;)V", "timersToCall", "Lcom/facebook/react/bridge/WritableArray;", "doFrame", "", "frameTimeNanos", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class TimerFrameCallback implements Choreographer.FrameCallback {
        private WritableArray timersToCall;

        public TimerFrameCallback() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            Timer timer;
            if (!JavaTimerManager.this.isPaused.get() || JavaTimerManager.this.isRunningTasks.get()) {
                long j = frameTimeNanos / ((long) 1000000);
                Object obj = JavaTimerManager.this.timerGuard;
                JavaTimerManager javaTimerManager = JavaTimerManager.this;
                synchronized (obj) {
                    while (!javaTimerManager.timers.isEmpty()) {
                        try {
                            Object objPeek = javaTimerManager.timers.peek();
                            Intrinsics.checkNotNull(objPeek);
                            if (((Timer) objPeek).getTargetTime() >= j || (timer = (Timer) javaTimerManager.timers.poll()) == null) {
                                break;
                                break;
                            }
                            if (this.timersToCall == null) {
                                this.timersToCall = Arguments.createArray();
                            }
                            WritableArray writableArray = this.timersToCall;
                            if (writableArray != null) {
                                writableArray.pushInt(timer.getTimerId());
                            }
                            if (timer.getRepeat()) {
                                timer.setTargetTime(((long) timer.getInterval()) + j);
                                javaTimerManager.timers.add(timer);
                            } else {
                                javaTimerManager.timerIdsToTimers.remove(timer.getTimerId());
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    Unit unit = Unit.f14616a;
                }
                WritableArray writableArray2 = this.timersToCall;
                if (writableArray2 != null) {
                    JavaTimerManager.this.javaScriptTimerExecutor.callTimers(writableArray2);
                    this.timersToCall = null;
                }
                JavaTimerManager.this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this);
            }
        }
    }

    public JavaTimerManager(@NotNull ReactApplicationContext reactApplicationContext, @NotNull JavaScriptTimerExecutor javaScriptTimerExecutor, @NotNull ReactChoreographer reactChoreographer, @NotNull DevSupportManager devSupportManager) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        Intrinsics.checkNotNullParameter(javaScriptTimerExecutor, "javaScriptTimerExecutor");
        Intrinsics.checkNotNullParameter(reactChoreographer, "reactChoreographer");
        Intrinsics.checkNotNullParameter(devSupportManager, "devSupportManager");
        this.reactApplicationContext = reactApplicationContext;
        this.javaScriptTimerExecutor = javaScriptTimerExecutor;
        this.reactChoreographer = reactChoreographer;
        this.devSupportManager = devSupportManager;
        this.timerGuard = new Object();
        this.idleCallbackGuard = new Object();
        this.timerIdsToTimers = new SparseArray<>();
        this.isPaused = new AtomicBoolean(true);
        this.isRunningTasks = new AtomicBoolean(false);
        this.timerFrameCallback = new TimerFrameCallback();
        this.idleFrameCallback = new IdleFrameCallback();
        this.timers = new PriorityQueue<>(11, new u(2, new a()));
        reactApplicationContext.addLifecycleEventListener(this);
        HeadlessJsTaskContext.INSTANCE.getInstance(reactApplicationContext).addTaskEventListener(this);
    }

    private final void clearChoreographerIdleCallback() {
        if (this.frameIdleCallbackPosted) {
            this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.idleFrameCallback);
            this.frameIdleCallbackPosted = false;
        }
    }

    private final void clearFrameCallback() {
        HeadlessJsTaskContext companion = HeadlessJsTaskContext.INSTANCE.getInstance(this.reactApplicationContext);
        if (this.frameCallbackPosted && this.isPaused.get() && !companion.hasActiveTasks()) {
            this.reactChoreographer.removeFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.timerFrameCallback);
            this.frameCallbackPosted = false;
        }
    }

    private final void maybeIdleCallback() {
        if (!this.isPaused.get() || this.isRunningTasks.get()) {
            return;
        }
        clearFrameCallback();
    }

    private final void maybeSetChoreographerIdleCallback() {
        synchronized (this.idleCallbackGuard) {
            try {
                if (this.sendIdleEvents) {
                    setChoreographerIdleCallback();
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void setChoreographerCallback() {
        if (this.frameCallbackPosted) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.TIMERS_EVENTS, this.timerFrameCallback);
        this.frameCallbackPosted = true;
    }

    private final void setChoreographerIdleCallback() {
        if (this.frameIdleCallbackPosted) {
            return;
        }
        this.reactChoreographer.postFrameCallback(ReactChoreographer.CallbackType.IDLE_EVENT, this.idleFrameCallback);
        this.frameIdleCallbackPosted = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSendIdleEvents$lambda$7(JavaTimerManager javaTimerManager, boolean z5) {
        synchronized (javaTimerManager.idleCallbackGuard) {
            try {
                if (z5) {
                    javaTimerManager.setChoreographerIdleCallback();
                } else {
                    javaTimerManager.clearChoreographerIdleCallback();
                }
                Unit unit = Unit.f14616a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int timers$lambda$0(Timer timer, Timer timer2) {
        return Long.signum(timer.getTargetTime() - timer2.getTargetTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int timers$lambda$1(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public void createAndMaybeCallTimer(int timerId, int duration, double jsSchedulingTime, boolean repeat) {
        long jCurrentTimeMillis = SystemClock.currentTimeMillis();
        long j = (long) jsSchedulingTime;
        if (this.devSupportManager.getIsDevSupportEnabled() && Math.abs(j - jCurrentTimeMillis) > LogThrottleSingleton.RATE_LIMIT_ONE_MINUTE) {
            this.javaScriptTimerExecutor.emitTimeDriftWarning("Debugger and device times have drifted by more than 60s. Please correct this by running adb shell \"date `date +%m%d%H%M%Y.%S`\" on your debugger machine.");
        }
        long jMax = Math.max(0L, (j - jCurrentTimeMillis) + ((long) duration));
        if (duration != 0 || repeat) {
            createTimer(timerId, jMax, repeat);
            return;
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(timerId);
        this.javaScriptTimerExecutor.callTimers(writableArrayCreateArray);
    }

    @xa.a
    public void createTimer(int timerId, long delay, boolean repeat) {
        Timer timer = new Timer(timerId, (SystemClock.nanoTime() / ((long) 1000000)) + delay, (int) delay, repeat);
        synchronized (this.timerGuard) {
            this.timers.add(timer);
            this.timerIdsToTimers.put(timerId, timer);
            Unit unit = Unit.f14616a;
        }
    }

    @xa.a
    public void deleteTimer(int timerId) {
        synchronized (this.timerGuard) {
            Timer timer = this.timerIdsToTimers.get(timerId);
            if (timer == null) {
                return;
            }
            this.timerIdsToTimers.remove(timerId);
            this.timers.remove(timer);
        }
    }

    public final boolean hasActiveTimersInRange$ReactAndroid_release(long rangeMs) {
        synchronized (this.timerGuard) {
            Timer timerPeek = this.timers.peek();
            if (timerPeek == null) {
                return false;
            }
            if (Companion.isTimerInRange(timerPeek, rangeMs)) {
                return true;
            }
            Iterator<Timer> it = this.timers.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                Timer next = it.next();
                Companion companion = Companion;
                Intrinsics.checkNotNull(next);
                if (companion.isTimerInRange(next, rangeMs)) {
                    return true;
                }
            }
            Unit unit = Unit.f14616a;
            return false;
        }
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskFinish(int taskId) {
        if (HeadlessJsTaskContext.INSTANCE.getInstance(this.reactApplicationContext).hasActiveTasks()) {
            return;
        }
        this.isRunningTasks.set(false);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.jstasks.HeadlessJsTaskEventListener
    public void onHeadlessJsTaskStart(int taskId) {
        if (this.isRunningTasks.getAndSet(true)) {
            return;
        }
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isPaused.set(true);
        clearFrameCallback();
        maybeIdleCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isPaused.set(false);
        setChoreographerCallback();
        maybeSetChoreographerIdleCallback();
    }

    public void onInstanceDestroy() {
        HeadlessJsTaskContext.INSTANCE.getInstance(this.reactApplicationContext).removeTaskEventListener(this);
        this.reactApplicationContext.removeLifecycleEventListener(this);
        clearFrameCallback();
        clearChoreographerIdleCallback();
    }

    @xa.a
    public void setSendIdleEvents(boolean sendIdleEvents) {
        synchronized (this.idleCallbackGuard) {
            this.sendIdleEvents = sendIdleEvents;
            Unit unit = Unit.f14616a;
        }
        UiThreadUtil.runOnUiThread(new e(this, sendIdleEvents, 1));
    }
}
