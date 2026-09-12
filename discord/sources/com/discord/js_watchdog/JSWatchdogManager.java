package com.discord.js_watchdog;

import android.content.Context;
import ar.b0;
import ar.v0;
import com.discord.crash_reporting.CrashReporting;
import com.discord.logging.Log;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.uimanager.ViewProps;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import kk.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import wn.a;
import xn.d;
import xn.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J.\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u001fJ\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0015J\u0006\u0010#\u001a\u00020\u0015J\b\u0010$\u001a\u00020\u0015H\u0002J \u0010%\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002J \u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020(2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/discord/js_watchdog/JSWatchdogManager;", "", "<init>", "()V", "storage", "Lcom/discord/js_watchdog/JSWatchdogStorage;", "cacheDir", "Ljava/io/File;", ViewProps.ENABLED, "", "recentPingTS", "", "Ljava/lang/Long;", "previousPingTS", "freezeTimer", "Ljava/util/TimerTask;", "pingCoroutineJob", "Lkotlinx/coroutines/Job;", "timerInstance", "Ljava/util/Timer;", "initialize", "", "context", "Landroid/content/Context;", "ping", "resetTimestamps", "sentTimestamp", "sessionId", "", "enableTrace", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "checkForExistingReport", "Lcom/discord/js_watchdog/StallReport;", "enable", "disable", "cancelExistingJobs", "updateStallTime", "saveStallReport", "stallTime", "", "js_watchdog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSWatchdogManager {
    private static File cacheDir;
    private static boolean enabled;
    private static TimerTask freezeTimer;
    private static Job pingCoroutineJob;
    private static Long previousPingTS;
    private static Long recentPingTS;
    private static JSWatchdogStorage storage;

    @NotNull
    public static final JSWatchdogManager INSTANCE = new JSWatchdogManager();

    @NotNull
    private static Timer timerInstance = new Timer();

    /* JADX INFO: renamed from: com.discord.js_watchdog.JSWatchdogManager$ping$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @d(c = "com.discord.js_watchdog.JSWatchdogManager$ping$1", f = "JSWatchdogManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends h implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $enableTrace;
        final /* synthetic */ Promise $promise;
        final /* synthetic */ boolean $resetTimestamps;
        final /* synthetic */ long $sentTimestamp;
        final /* synthetic */ String $sessionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z5, long j, Promise promise, String str, boolean z6, Continuation continuation) {
            super(2, continuation);
            this.$resetTimestamps = z5;
            this.$sentTimestamp = j;
            this.$promise = promise;
            this.$sessionId = str;
            this.$enableTrace = z6;
        }

        @Override // xn.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$resetTimestamps, this.$sentTimestamp, this.$promise, this.$sessionId, this.$enableTrace, continuation);
        }

        @Override // xn.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar = a.f22354d;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
            try {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                if (this.$resetTimestamps) {
                    JSWatchdogManager.recentPingTS = null;
                    JSWatchdogManager.previousPingTS = null;
                }
                JSWatchdogManager.previousPingTS = JSWatchdogManager.recentPingTS;
                JSWatchdogManager.recentPingTS = new Long(this.$sentTimestamp);
                Long l6 = JSWatchdogManager.previousPingTS;
                if (l6 != null) {
                    long j = this.$sentTimestamp;
                    String str = this.$sessionId;
                    boolean z5 = this.$enableTrace;
                    long jLongValue = (j - l6.longValue()) - ((long) 500);
                    if (jLongValue > 1000) {
                        Log.i$default(Log.INSTANCE, JSWatchdogManagerKt.LOG_TAG, "Exceeded JS stall threshold [based on previous ping]: " + jLongValue, (Throwable) null, 4, (Object) null);
                        booleanRef.element = true;
                        JSWatchdogManager.INSTANCE.saveStallReport((int) jLongValue, str, z5);
                    }
                }
                if (JSWatchdogManager.enabled) {
                    Timer timer = JSWatchdogManager.timerInstance;
                    final long j5 = this.$sentTimestamp;
                    final String str2 = this.$sessionId;
                    final boolean z6 = this.$enableTrace;
                    TimerTask timerTask = new TimerTask() { // from class: com.discord.js_watchdog.JSWatchdogManager$ping$1$invokeSuspend$$inlined$scheduleAtFixedRate$1
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public void run() throws Throwable {
                            JSWatchdogManager.INSTANCE.updateStallTime(j5, str2, z6);
                        }
                    };
                    timer.scheduleAtFixedRate(timerTask, 1500L, 1000L);
                    JSWatchdogManager.freezeTimer = timerTask;
                }
                this.$promise.resolve(Boolean.valueOf(booleanRef.element));
            } catch (Exception e10) {
                CrashReporting.INSTANCE.captureMessage("Failed to process JSWatchdog ping", e10);
                this.$promise.reject(e10);
            }
            return Unit.f14616a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
        }
    }

    private JSWatchdogManager() {
    }

    private final void cancelExistingJobs() {
        Job job = pingCoroutineJob;
        if (job != null) {
            job.f(null);
        }
        pingCoroutineJob = null;
        TimerTask timerTask = freezeTimer;
        if (timerTask != null) {
            timerTask.cancel();
        }
        freezeTimer = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public final void saveStallReport(int stallTime, String sessionId, boolean enableTrace) throws Throwable {
        String strFindSampleTrace;
        JSWatchdogStorage jSWatchdogStorage = storage;
        if (jSWatchdogStorage == null) {
            return;
        }
        JSWatchdogStorage jSWatchdogStorage2 = null;
        if (enableTrace) {
            if (jSWatchdogStorage == null) {
                Intrinsics.throwUninitializedPropertyAccessException("storage");
                jSWatchdogStorage = null;
            }
            String trace = jSWatchdogStorage.getTrace();
            if (trace == null || trace.length() == 0) {
                HermesSamplingProfilerUtil hermesSamplingProfilerUtil = HermesSamplingProfilerUtil.INSTANCE;
                File file = cacheDir;
                if (file == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("cacheDir");
                    file = null;
                }
                strFindSampleTrace = hermesSamplingProfilerUtil.findSampleTrace(file);
            } else {
                strFindSampleTrace = null;
            }
        } else {
            strFindSampleTrace = null;
        }
        JSWatchdogStorage jSWatchdogStorage3 = storage;
        if (jSWatchdogStorage3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storage");
        } else {
            jSWatchdogStorage2 = jSWatchdogStorage3;
        }
        jSWatchdogStorage2.update(stallTime, sessionId, strFindSampleTrace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStallTime(long sentTimestamp, String sessionId, boolean enableTrace) throws Throwable {
        long jCurrentTimeMillis = (System.currentTimeMillis() - sentTimestamp) - ((long) 500);
        Log.i$default(Log.INSTANCE, JSWatchdogManagerKt.LOG_TAG, b.i(jCurrentTimeMillis, "updateStallTime: "), (Throwable) null, 4, (Object) null);
        saveStallReport((int) jCurrentTimeMillis, sessionId, enableTrace);
    }

    public final StallReport checkForExistingReport() {
        JSWatchdogStorage jSWatchdogStorage = storage;
        if (jSWatchdogStorage == null) {
            return null;
        }
        if (jSWatchdogStorage == null) {
            Intrinsics.throwUninitializedPropertyAccessException("storage");
            jSWatchdogStorage = null;
        }
        return jSWatchdogStorage.getStallReportAndClear();
    }

    public final void disable() {
        enabled = false;
        cancelExistingJobs();
        Log.i$default(Log.INSTANCE, JSWatchdogManagerKt.LOG_TAG, "JS Watchdog disabled.", (Throwable) null, 4, (Object) null);
    }

    public final void enable() {
        enabled = true;
        Log.i$default(Log.INSTANCE, JSWatchdogManagerKt.LOG_TAG, "JS Watchdog enabled.", (Throwable) null, 4, (Object) null);
    }

    public final void initialize(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        synchronized (this) {
            storage = JSWatchdogStorage.INSTANCE.getInstance(context);
            cacheDir = context.getCacheDir();
            Unit unit = Unit.f14616a;
        }
    }

    public final void ping(boolean resetTimestamps, long sentTimestamp, @NotNull String sessionId, boolean enableTrace, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        cancelExistingJobs();
        pingCoroutineJob = b0.t(v0.f2972d, null, new AnonymousClass1(resetTimestamps, sentTimestamp, promise, sessionId, enableTrace, null), 3);
    }
}
