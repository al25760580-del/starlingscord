package com.discord.jank_stats;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.os.SystemClock;
import ar.t1;
import com.discord.client_info.ClientInfo;
import com.discord.crash_reporting.OnCrashRegistry;
import com.discord.crash_reporting.d;
import com.discord.logging.Log;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import rn.l;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0011J\u0006\u0010\u001c\u001a\u00020\u0015J\b\u0010\u001d\u001a\u00020\u0015H\u0002J \u0010\u001e\u001a\u00020\u00152\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0!\u0012\u0004\u0012\u00020\u00150 J\u0014\u0010#\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050%R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R#\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/discord/jank_stats/JankSessionRecorder;", "", "<init>", "()V", "LOG_TAG", "", "PREFS_NAME", "flushExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "getFlushExecutor", "()Ljava/util/concurrent/ExecutorService;", "flushExecutor$delegate", "Lkotlin/Lazy;", "store", "Lcom/discord/jank_stats/JankRecordStore;", "initStarted", "", "sessionStartWallMs", "", "init", "", "context", "Landroid/content/Context;", "hydrateLaunchId", "launchId", "recordFrame", "isJank", "onTrackingDisabled", "flushNow", "pendingRecords", "onResult", "Lkotlin/Function1;", "", "Lcom/discord/jank_stats/JankRecordStore$PendingRecord;", "acknowledge", "sessionIds", "", "jank_stats_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JankSessionRecorder {

    @NotNull
    private static final String LOG_TAG = "JankSessionRecorder";

    @NotNull
    private static final String PREFS_NAME = "jank_session";
    private static volatile boolean initStarted;
    private static long sessionStartWallMs;
    private static volatile JankRecordStore store;

    @NotNull
    public static final JankSessionRecorder INSTANCE = new JankSessionRecorder();

    /* JADX INFO: renamed from: flushExecutor$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy flushExecutor = l.b(new d(12));

    private JankSessionRecorder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void acknowledge$lambda$9(Set set) {
        JankRecordStore jankRecordStore = store;
        if (jankRecordStore != null) {
            jankRecordStore.ack(set);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService flushExecutor_delegate$lambda$2() {
        return Executors.newSingleThreadExecutor(new t1(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread flushExecutor_delegate$lambda$2$lambda$1(Runnable runnable) {
        return new Thread(new am.c(10, runnable), "JankSessionFlush");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void flushExecutor_delegate$lambda$2$lambda$1$lambda$0(Runnable runnable) {
        Process.setThreadPriority(10);
        runnable.run();
    }

    private final void flushNow() {
        JankRecordStore jankRecordStore = store;
        if (jankRecordStore == null) {
            return;
        }
        jankRecordStore.flush();
    }

    private final ExecutorService getFlushExecutor() {
        return (ExecutorService) flushExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hydrateLaunchId$lambda$5(String str) {
        JankRecordStore jankRecordStore = store;
        if (jankRecordStore == null) {
            return;
        }
        long j = sessionStartWallMs;
        ClientInfo clientInfo = ClientInfo.INSTANCE;
        Integer intOrNull = StringsKt.toIntOrNull(clientInfo.getVersionCode());
        if (jankRecordStore.hydrate(new JankRecordStore.SessionIdentity(str, j, intOrNull != null ? intOrNull.intValue() : 0, clientInfo.getReleaseChannel()))) {
            sessionStartWallMs = System.currentTimeMillis();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4(Context context, long j, long j5) {
        JankRecordStore.Companion companion = JankRecordStore.INSTANCE;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        JankRecordStore jankRecordStoreOpen$jank_stats_release = companion.open$jank_stats_release(new SharedPreferencesJankKeyValueStore(sharedPreferences), j);
        sessionStartWallMs = j5;
        store = jankRecordStoreOpen$jank_stats_release;
        OnCrashRegistry.INSTANCE.register(LOG_TAG, new d(13));
        Log.i$default(Log.INSTANCE, LOG_TAG, "Jank recording started after " + (SystemClock.uptimeMillis() - j) + "ms, " + jankRecordStoreOpen$jank_stats_release.pending().size() + " record(s) awaiting delivery.", (Throwable) null, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$4$lambda$3() {
        INSTANCE.flushNow();
        return Unit.f14616a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pendingRecords$lambda$8(Function1 function1) {
        List<JankRecordStore.PendingRecord> listPending;
        JankRecordStore jankRecordStore = store;
        if (jankRecordStore == null || (listPending = jankRecordStore.pending()) == null) {
            listPending = n0.f14659d;
        }
        function1.invoke(listPending);
    }

    public final void acknowledge(@NotNull Set<String> sessionIds) {
        Intrinsics.checkNotNullParameter(sessionIds, "sessionIds");
        getFlushExecutor().execute(new am.c(11, sessionIds));
    }

    public final void hydrateLaunchId(@NotNull String launchId) {
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        getFlushExecutor().execute(new bb.a(launchId, 1));
    }

    public final void init(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (initStarted) {
            return;
        }
        initStarted = true;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final long jUptimeMillis = SystemClock.uptimeMillis();
        final Context applicationContext = context.getApplicationContext();
        getFlushExecutor().execute(new Runnable() { // from class: com.discord.jank_stats.b
            @Override // java.lang.Runnable
            public final void run() {
                JankSessionRecorder.init$lambda$4(applicationContext, jUptimeMillis, jCurrentTimeMillis);
            }
        });
    }

    public final void onTrackingDisabled() {
        JankRecordStore jankRecordStore = store;
        if (jankRecordStore == null) {
            return;
        }
        getFlushExecutor().execute(new c(jankRecordStore, 1));
    }

    public final void pendingRecords(@NotNull Function1<? super List<JankRecordStore.PendingRecord>, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        getFlushExecutor().execute(new com.appsflyer.a(onResult, 1));
    }

    public final void recordFrame(boolean isJank) {
        JankRecordStore jankRecordStore = store;
        if (jankRecordStore == null) {
            return;
        }
        jankRecordStore.recordFrame(isJank);
        if (jankRecordStore.takeFlushDeadline(SystemClock.uptimeMillis())) {
            getFlushExecutor().execute(new c(jankRecordStore, 0));
        }
    }
}
