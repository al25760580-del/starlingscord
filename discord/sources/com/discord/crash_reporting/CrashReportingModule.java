package com.discord.crash_reporting;

import a3.e;
import com.discord.crash_reporting.system_logs.HistoricalProcessExitReason;
import com.discord.crash_reporting.system_logs.SystemLogReport;
import com.discord.crash_reporting.system_logs.SystemLogUtils;
import com.discord.logging.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import io.sentry.react.RNSentryModule;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.b0;
import org.jetbrains.annotations.NotNull;
import rn.f;
import w3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000[\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0012\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0010\u001a\u00020\rH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0007J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!H\u0007J\b\u0010\"\u001a\u00020\u0015H\u0007J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013¨\u0006*"}, d2 = {"Lcom/discord/crash_reporting/CrashReportingModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getReactContext", "()Lcom/facebook/react/bridge/ReactApplicationContext;", "sentryModule", "Lio/sentry/react/RNSentryModule;", "getSentryModule", "()Lio/sentry/react/RNSentryModule;", "pendingCrashEventId", "", "pendingCrashLock", "", "getName", "reactSoftExceptionListener", "com/discord/crash_reporting/CrashReportingModule$reactSoftExceptionListener$1", "Lcom/discord/crash_reporting/CrashReportingModule$reactSoftExceptionListener$1;", "invalidate", "", "initializeManager", "getSystemLog", "callback", "Lcom/facebook/react/bridge/Callback;", "getDidCrashDuringPreviousExecution", "getLastCrashReport", "markCrashHandled", "eventId", "getIsUserStaffForCrashReporting", "setUser", "user", "Lcom/facebook/react/bridge/ReadableMap;", "crash", "buildCrashReportMap", "Lcom/facebook/react/bridge/WritableMap;", "info", "Lcom/discord/crash_reporting/CrashPersistence$LastCrashInfo;", "diagnostics", "Lcom/discord/crash_reporting/system_logs/SystemLogReport$NativeCrashDiagnostics;", "Companion", "crash_reporting_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CrashReportingModule extends ReactContextBaseJavaModule {

    @NotNull
    private static final String TAG = "CrashReportingModule";
    private volatile String pendingCrashEventId;

    @NotNull
    private final Object pendingCrashLock;

    @NotNull
    private final ReactApplicationContext reactContext;

    @NotNull
    private final CrashReportingModule$reactSoftExceptionListener$1 reactSoftExceptionListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.discord.crash_reporting.CrashReportingModule$reactSoftExceptionListener$1] */
    public CrashReportingModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.pendingCrashLock = new Object();
        this.reactSoftExceptionListener = new ReactSoftExceptionLogger.ReactSoftExceptionListener() { // from class: com.discord.crash_reporting.CrashReportingModule$reactSoftExceptionListener$1
            @Override // com.facebook.react.bridge.ReactSoftExceptionLogger.ReactSoftExceptionListener
            public void logSoftException(String category, Throwable cause) {
                Intrinsics.checkNotNullParameter(category, "category");
                Intrinsics.checkNotNullParameter(cause, "cause");
                CrashReporting crashReporting = CrashReporting.INSTANCE;
                String strL = e.l("SoftException: ", category);
                String message = cause.getMessage();
                if (message == null) {
                    message = "No message";
                }
                CrashReporting.addBreadcrumb$default(crashReporting, strL, w0.g(new Pair("message", message), new Pair("stacktrace", f.b(cause))), "react.softexception", CrashReporting.BreadcrumbLevel.ERROR, false, 16, null);
                Log.INSTANCE.e(category, "Unhandled SoftException", cause);
            }
        };
    }

    private final WritableMap buildCrashReportMap(CrashPersistence.LastCrashInfo info, SystemLogReport.NativeCrashDiagnostics diagnostics) {
        SystemLogUtils.Tombstone tombstone;
        HistoricalProcessExitReason.Reason exitReason;
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("event_id", info.getEventId());
        writableMapCreateMap.putDouble("timestamp", info.getTimestampMs());
        writableMapCreateMap.putString("origin", info.getOrigin());
        writableMapCreateMap.putString("level", info.getLevel());
        writableMapCreateMap.putBoolean("is_native", info.isNative());
        writableMapCreateMap.putString("error_message", info.getErrorMessage());
        writableMapCreateMap.putString("error_stack", info.getErrorStack());
        if (diagnostics != null && (exitReason = diagnostics.getExitReason()) != null) {
            writableMapCreateMap.putString("exit_reason", exitReason.getReason());
            writableMapCreateMap.putString("exit_description", exitReason.getDescription());
        }
        if (diagnostics == null || (tombstone = diagnostics.getTombstone()) == null) {
            return writableMapCreateMap;
        }
        IntRange intRange = new IntRange(0, 1000, 1);
        jo.c random = jo.d.f13988d;
        Intrinsics.checkNotNullParameter(intRange, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        try {
            if (q.u(random, intRange) == 0 && !StringsKt.K(tombstone.getText())) {
                writableMapCreateMap.putString("tombstone", b0.B(6291456, tombstone.getText()));
            }
            writableMapCreateMap.putString("tombstone_cause", tombstone.getCause());
            writableMapCreateMap.putString("tombstone_hash", tombstone.getGroupHash());
            writableMapCreateMap.putString("tombstone_group_by", tombstone.getGroupBy());
            writableMapCreateMap.putString("tombstone_origin", tombstone.getOrigin());
            return writableMapCreateMap;
        } catch (IllegalArgumentException e10) {
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getLastCrashReport$lambda$2(CrashReportingModule crashReportingModule, CrashPersistence.LastCrashInfo lastCrashInfo, Callback callback, SystemLogReport.NativeCrashDiagnostics diagnostics) {
        Intrinsics.checkNotNullParameter(diagnostics, "diagnostics");
        callback.invoke(crashReportingModule.buildCrashReportMap(lastCrashInfo, diagnostics));
        return Unit.f14616a;
    }

    private final RNSentryModule getSentryModule() {
        NativeModule nativeModule = getReactApplicationContext().getCatalystInstance().getNativeModule("RNSentry");
        Intrinsics.checkNotNull(nativeModule, "null cannot be cast to non-null type io.sentry.react.RNSentryModule");
        return (RNSentryModule) nativeModule;
    }

    @ReactMethod
    public final void crash() {
        getSentryModule().crash();
    }

    @ReactMethod
    public final void getDidCrashDuringPreviousExecution(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Boolean boolIsCrashedLastRun = CrashReporting.INSTANCE.isCrashedLastRun();
        if (boolIsCrashedLastRun != null) {
            callback.invoke(boolIsCrashedLastRun);
        }
    }

    @ReactMethod
    public final void getIsUserStaffForCrashReporting(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        CrashPersistence.Companion companion = CrashPersistence.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        callback.invoke(Boolean.valueOf(companion.getInstance(reactApplicationContext).isStaff()));
    }

    @ReactMethod
    public final void getLastCrashReport(@NotNull Callback callback) {
        CrashPersistence.LastCrashInfo lastCrashInfo;
        Intrinsics.checkNotNullParameter(callback, "callback");
        boolean z5 = false;
        try {
            synchronized (this.pendingCrashLock) {
                if (this.pendingCrashEventId != null) {
                    z5 = true;
                } else {
                    CrashPersistence.Companion companion = CrashPersistence.INSTANCE;
                    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
                    lastCrashInfo = companion.getInstance(reactApplicationContext).getLastCrashInfo();
                    if (lastCrashInfo != null) {
                        this.pendingCrashEventId = lastCrashInfo.getEventId();
                    }
                }
                lastCrashInfo = null;
            }
        } catch (Throwable th2) {
            Log.INSTANCE.e(TAG, "Failed to get last crash report", th2);
            lastCrashInfo = null;
        }
        if (lastCrashInfo == null) {
            if (z5) {
                Log.i$default(Log.INSTANCE, TAG, "Crash report already pending; suppressing duplicate request", (Throwable) null, 4, (Object) null);
            }
            callback.invoke(null);
        } else {
            if (!lastCrashInfo.isNative()) {
                callback.invoke(buildCrashReportMap(lastCrashInfo, null));
                return;
            }
            SystemLogReport systemLogReport = SystemLogReport.INSTANCE;
            ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
            systemLogReport.fetchNativeCrashDiagnostics(reactApplicationContext2, new com.discord.age_assurance.a(this, lastCrashInfo, callback, 6));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "CrashReportingManager";
    }

    @NotNull
    public final ReactApplicationContext getReactContext() {
        return this.reactContext;
    }

    @ReactMethod
    public final void getSystemLog(@NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SystemLogUtils systemLogUtils = SystemLogUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        callback.invoke(systemLogUtils.fetch(reactApplicationContext));
    }

    @ReactMethod
    public final void initializeManager() {
        SystemLogUtils systemLogUtils = SystemLogUtils.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        systemLogUtils.initSystemLogCapture(reactApplicationContext);
        ReactSoftExceptionLogger.addListener(this.reactSoftExceptionListener);
        o8.a.f17171a = new FLogDelegate();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        ReactSoftExceptionLogger.removeListener(this.reactSoftExceptionListener);
    }

    @ReactMethod
    public final void markCrashHandled(String eventId) {
        if (eventId == null || StringsKt.K(eventId)) {
            return;
        }
        try {
            CrashPersistence.Companion companion = CrashPersistence.INSTANCE;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            companion.getInstance(reactApplicationContext).markCrashHandled(eventId);
            synchronized (this.pendingCrashLock) {
                try {
                    if (Intrinsics.areEqual(this.pendingCrashEventId, eventId)) {
                        this.pendingCrashEventId = null;
                    }
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            Log.INSTANCE.e(TAG, "Failed to mark crash handled", th3);
        }
    }

    @ReactMethod
    public final void setUser(@NotNull ReadableMap user) {
        Intrinsics.checkNotNullParameter(user, "user");
        boolean z5 = user.getBoolean("staff");
        CrashPersistence.Companion companion = CrashPersistence.INSTANCE;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        companion.getInstance(reactApplicationContext).setStaff(z5);
    }
}
