package com.discord.js_watchdog;

import com.discord.codegen.NativeJSWatchdogModuleSpec;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016¨\u0006\u0015"}, d2 = {"Lcom/discord/js_watchdog/JSWatchdogModule;", "Lcom/discord/codegen/NativeJSWatchdogModuleSpec;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "ping", "", "sentTimestamp", "", "sessionId", "", "resetTimestamps", "", "enableTrace", BaseJavaModule.METHOD_TYPE_PROMISE, "Lcom/facebook/react/bridge/Promise;", "(DLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/facebook/react/bridge/Promise;)V", "checkForStallReport", "Lcom/facebook/react/bridge/WritableMap;", "disable", "js_watchdog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JSWatchdogModule extends NativeJSWatchdogModuleSpec {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSWatchdogModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
    }

    @Override // com.discord.codegen.NativeJSWatchdogModuleSpec
    public WritableMap checkForStallReport() {
        StallReport stallReportCheckForExistingReport = JSWatchdogManager.INSTANCE.checkForExistingReport();
        if (stallReportCheckForExistingReport != null) {
            return stallReportCheckForExistingReport.getData();
        }
        return null;
    }

    @Override // com.discord.codegen.NativeJSWatchdogModuleSpec
    public void disable() {
        JSWatchdogManager.INSTANCE.disable();
    }

    @Override // com.discord.codegen.NativeJSWatchdogModuleSpec
    public void ping(double sentTimestamp, String sessionId, Boolean resetTimestamps, Boolean enableTrace, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        JSWatchdogManager jSWatchdogManager = JSWatchdogManager.INSTANCE;
        boolean zBooleanValue = resetTimestamps != null ? resetTimestamps.booleanValue() : false;
        long j = (long) sentTimestamp;
        if (sessionId == null) {
            sessionId = "";
        }
        jSWatchdogManager.ping(zBooleanValue, j, sessionId, enableTrace != null ? enableTrace.booleanValue() : false, promise);
    }
}
