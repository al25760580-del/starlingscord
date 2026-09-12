package com.discord.lifecycle;

import a3.e;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import android.os.SystemClock;
import com.facebook.imagepipeline.nativecode.b;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002%&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J.\u0010\u0014\u001a\u00020\u000e2&\u0010\n\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bJ,\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\rH\u0002J\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001cH\u0002J\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001cH\u0002J\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001cH\u0002J.\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005H\u0002J.\u0010#\u001a\u0004\u0018\u00010\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u001c2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0010\u0010$\u001a\u00020\u00162\b\b\u0002\u0010\"\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R.\u0010\n\u001a\"\u0012\u0004\u0012\u00020\f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lcom/discord/lifecycle/ForegroundServiceStartGuard;", "", "<init>", "()V", "GRACE_PERIOD_MS", "", "powerManager", "Landroid/os/PowerManager;", "keyguardManager", "Landroid/app/KeyguardManager;", "logger", "Lkotlin/Function2;", "", "", "", "initialized", "", "init", "applicationContext", "Landroid/content/Context;", "setLogger", "createResult", "Lcom/discord/lifecycle/ForegroundServiceStartGuard$Result;", "decision", "Lcom/discord/lifecycle/ForegroundServiceStartGuard$Decision;", "reason", "diagnostics", "checkScreenInteractive", "", "checkKeyguard", "checkProcessImportance", "checkFallbackAllowedConditions", "lifecycleSnapshot", "Lcom/discord/lifecycle/ActivityResumedTracker$Snapshot;", "nowElapsedRealtime", "checkAllowedConditions", "evaluate", "Decision", "Result", "lifecycle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nForegroundServiceStartGuard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ForegroundServiceStartGuard.kt\ncom/discord/lifecycle/ForegroundServiceStartGuard\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,257:1\n1#2:258\n*E\n"})
public final class ForegroundServiceStartGuard {
    private static final long GRACE_PERIOD_MS = 5000;

    @NotNull
    public static final ForegroundServiceStartGuard INSTANCE = new ForegroundServiceStartGuard();
    private static volatile boolean initialized;
    private static volatile KeyguardManager keyguardManager;
    private static volatile Function2<? super String, ? super Map<String, ? extends Object>, Unit> logger;
    private static volatile PowerManager powerManager;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/discord/lifecycle/ForegroundServiceStartGuard$Decision;", "", "<init>", "(Ljava/lang/String;I)V", "ALLOWED", "BLOCKED", "lifecycle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Decision {
        ALLOWED,
        BLOCKED;

        private static final /* synthetic */ EnumEntries $ENTRIES = b.l(values());

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }
    }

    private ForegroundServiceStartGuard() {
    }

    private final Result checkAllowedConditions(Map<String, String> diagnostics, ActivityResumedTracker.Snapshot lifecycleSnapshot, long nowElapsedRealtime) {
        Result resultCheckProcessImportance = checkProcessImportance(diagnostics);
        return resultCheckProcessImportance != null ? resultCheckProcessImportance : checkFallbackAllowedConditions(diagnostics, lifecycleSnapshot, nowElapsedRealtime);
    }

    private final Result checkFallbackAllowedConditions(Map<String, String> diagnostics, ActivityResumedTracker.Snapshot lifecycleSnapshot, long nowElapsedRealtime) {
        String lowerCase = lifecycleSnapshot.getState().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        diagnostics.put("activityState", lowerCase);
        long lastPausedAtElapsedRealtime = lifecycleSnapshot.getLastPausedAtElapsedRealtime();
        diagnostics.put("lastPausedAtElapsedRealtime", String.valueOf(lastPausedAtElapsedRealtime));
        if (lastPausedAtElapsedRealtime <= 0) {
            return null;
        }
        long j = nowElapsedRealtime - lastPausedAtElapsedRealtime;
        diagnostics.put("elapsedSincePauseMs", String.valueOf(j));
        if (j < 5000) {
            return createResult(Decision.ALLOWED, "allowed_grace_period", diagnostics);
        }
        return null;
    }

    private final Result checkKeyguard(Map<String, String> diagnostics) {
        KeyguardManager keyguardManager2 = keyguardManager;
        if (keyguardManager2 == null && !initialized) {
            diagnostics.put("keyguardLocked", "unknown_not_initialized");
            diagnostics.put("missingKeyguardManager", "true");
            return null;
        }
        boolean zIsKeyguardLocked = keyguardManager2 != null ? keyguardManager2.isKeyguardLocked() : false;
        diagnostics.put("keyguardLocked", String.valueOf(zIsKeyguardLocked));
        if (zIsKeyguardLocked) {
            return createResult(Decision.BLOCKED, "blocked_device_locked", diagnostics);
        }
        return null;
    }

    private final Result checkProcessImportance(Map<String, String> diagnostics) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        int i7 = runningAppProcessInfo.importance;
        diagnostics.put("importance", String.valueOf(i7));
        if (i7 == 100) {
            return createResult(Decision.ALLOWED, "allowed_top", diagnostics);
        }
        return null;
    }

    private final Result checkScreenInteractive(Map<String, String> diagnostics) {
        PowerManager powerManager2 = powerManager;
        if (powerManager2 == null && !initialized) {
            diagnostics.put("screenInteractive", "unknown_not_initialized");
            diagnostics.put("missingPowerManager", "true");
            return null;
        }
        boolean zIsInteractive = powerManager2 != null ? powerManager2.isInteractive() : false;
        diagnostics.put("screenInteractive", String.valueOf(zIsInteractive));
        diagnostics.put("apiLevel", String.valueOf(Build.VERSION.SDK_INT));
        if (zIsInteractive) {
            return null;
        }
        return createResult(Decision.BLOCKED, "blocked_screen_off", diagnostics);
    }

    private final Result createResult(Decision decision, String reason, Map<String, String> diagnostics) {
        Result result = new Result(decision, reason, diagnostics);
        try {
            Function2<? super String, ? super Map<String, ? extends Object>, Unit> function2 = logger;
            if (function2 != null) {
                String strName = decision.name();
                Locale locale = Locale.ROOT;
                String lowerCase = strName.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String str = "FGS guard evaluated: " + lowerCase + " - " + reason;
                String lowerCase2 = decision.name().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                LinkedHashMap linkedHashMapH = w0.h(new Pair("decision", lowerCase2), new Pair("reason", reason));
                linkedHashMapH.putAll(diagnostics);
                Unit unit = Unit.f14616a;
                function2.invoke(str, linkedHashMapH);
            }
        } catch (Throwable unused) {
        }
        return result;
    }

    public static /* synthetic */ Result evaluate$default(ForegroundServiceStartGuard foregroundServiceStartGuard, long j, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            j = SystemClock.elapsedRealtime();
        }
        return foregroundServiceStartGuard.evaluate(j);
    }

    @NotNull
    public final Result evaluate(long nowElapsedRealtime) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("initialized", String.valueOf(initialized));
        Result resultCheckScreenInteractive = checkScreenInteractive(linkedHashMap);
        if (resultCheckScreenInteractive != null) {
            return resultCheckScreenInteractive;
        }
        Result resultCheckKeyguard = checkKeyguard(linkedHashMap);
        if (resultCheckKeyguard != null) {
            return resultCheckKeyguard;
        }
        Result resultCheckAllowedConditions = checkAllowedConditions(linkedHashMap, ActivityResumedTracker.INSTANCE.snapshot(), nowElapsedRealtime);
        return resultCheckAllowedConditions != null ? resultCheckAllowedConditions : createResult(Decision.BLOCKED, "blocked_not_top_no_grace", linkedHashMap);
    }

    public final void init(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        if (initialized) {
            return;
        }
        Object systemService = applicationContext.getSystemService("power");
        powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        Object systemService2 = applicationContext.getSystemService("keyguard");
        keyguardManager = systemService2 instanceof KeyguardManager ? (KeyguardManager) systemService2 : null;
        initialized = true;
    }

    public final void setLogger(Function2<? super String, ? super Map<String, ? extends Object>, Unit> logger2) {
        logger = logger2;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/discord/lifecycle/ForegroundServiceStartGuard$Result;", "", "decision", "Lcom/discord/lifecycle/ForegroundServiceStartGuard$Decision;", "reason", "", "diagnostics", "", "<init>", "(Lcom/discord/lifecycle/ForegroundServiceStartGuard$Decision;Ljava/lang/String;Ljava/util/Map;)V", "getDecision", "()Lcom/discord/lifecycle/ForegroundServiceStartGuard$Decision;", "getReason", "()Ljava/lang/String;", "getDiagnostics", "()Ljava/util/Map;", "allowed", "", "getAllowed", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lifecycle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result {

        @NotNull
        private final Decision decision;

        @NotNull
        private final Map<String, String> diagnostics;

        @NotNull
        private final String reason;

        public Result(@NotNull Decision decision, @NotNull String reason, @NotNull Map<String, String> diagnostics) {
            Intrinsics.checkNotNullParameter(decision, "decision");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
            this.decision = decision;
            this.reason = reason;
            this.diagnostics = diagnostics;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Result copy$default(Result result, Decision decision, String str, Map map, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                decision = result.decision;
            }
            if ((i7 & 2) != 0) {
                str = result.reason;
            }
            if ((i7 & 4) != 0) {
                map = result.diagnostics;
            }
            return result.copy(decision, str, map);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Decision getDecision() {
            return this.decision;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        @NotNull
        public final Map<String, String> component3() {
            return this.diagnostics;
        }

        @NotNull
        public final Result copy(@NotNull Decision decision, @NotNull String reason, @NotNull Map<String, String> diagnostics) {
            Intrinsics.checkNotNullParameter(decision, "decision");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
            return new Result(decision, reason, diagnostics);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return this.decision == result.decision && Intrinsics.areEqual(this.reason, result.reason) && Intrinsics.areEqual(this.diagnostics, result.diagnostics);
        }

        public final boolean getAllowed() {
            return this.decision == Decision.ALLOWED;
        }

        @NotNull
        public final Decision getDecision() {
            return this.decision;
        }

        @NotNull
        public final Map<String, String> getDiagnostics() {
            return this.diagnostics;
        }

        @NotNull
        public final String getReason() {
            return this.reason;
        }

        public int hashCode() {
            return this.diagnostics.hashCode() + e.d(this.decision.hashCode() * 31, 31, this.reason);
        }

        @NotNull
        public String toString() {
            return "Result(decision=" + this.decision + ", reason=" + this.reason + ", diagnostics=" + this.diagnostics + ")";
        }

        public /* synthetic */ Result(Decision decision, String str, Map map, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this(decision, str, (i7 & 4) != 0 ? w0.d() : map);
        }
    }
}
