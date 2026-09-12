package com.discord.js_watchdog;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0006\u0010\u0018\u001a\u00020\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u001a"}, d2 = {"Lcom/discord/js_watchdog/JSWatchdogStorage;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "storage", "Landroid/content/SharedPreferences;", "getStorage", "()Landroid/content/SharedPreferences;", "stallTime", "", "getStallTime", "()I", "sessionId", "", "getSessionId", "()Ljava/lang/String;", SharedPreferencesKey.TRACE, "getTrace", "update", "", "getStallReportAndClear", "Lcom/discord/js_watchdog/StallReport;", "clear", "Companion", "js_watchdog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJSWatchdogStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSWatchdogStorage.kt\ncom/discord/js_watchdog/JSWatchdogStorage\n+ 2 SharedPreferences.kt\nandroidx/core/content/SharedPreferencesKt\n*L\n1#1,65:1\n40#2,13:66\n40#2,13:79\n*S KotlinDebug\n*F\n+ 1 JSWatchdogStorage.kt\ncom/discord/js_watchdog/JSWatchdogStorage\n*L\n28#1:66,13\n49#1:79,13\n*E\n"})
public final class JSWatchdogStorage {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static JSWatchdogStorage instance;

    @NotNull
    private final SharedPreferences storage;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/js_watchdog/JSWatchdogStorage$Companion;", "", "<init>", "()V", "instance", "Lcom/discord/js_watchdog/JSWatchdogStorage;", "getInstance", "context", "Landroid/content/Context;", "js_watchdog_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JSWatchdogStorage getInstance(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (JSWatchdogStorage.instance == null) {
                JSWatchdogStorage.instance = new JSWatchdogStorage(context);
            }
            JSWatchdogStorage jSWatchdogStorage = JSWatchdogStorage.instance;
            Intrinsics.checkNotNull(jSWatchdogStorage);
            return jSWatchdogStorage;
        }

        private Companion() {
        }
    }

    public JSWatchdogStorage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("js_watchdog", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.storage = sharedPreferences;
    }

    private final String getSessionId() {
        String string = this.storage.getString(SharedPreferencesKey.SESSION_ID, null);
        return string == null ? "" : string;
    }

    private final int getStallTime() {
        return this.storage.getInt(SharedPreferencesKey.STALL_TIME, 0);
    }

    public final void clear() {
        SharedPreferences.Editor editorEdit = this.storage.edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    public final StallReport getStallReportAndClear() {
        int stallTime = getStallTime();
        if (stallTime <= 0) {
            return null;
        }
        StallReport stallReport = new StallReport(stallTime, getSessionId(), getTrace());
        clear();
        return stallReport;
    }

    @NotNull
    public final SharedPreferences getStorage() {
        return this.storage;
    }

    public final String getTrace() {
        return this.storage.getString(SharedPreferencesKey.TRACE, null);
    }

    public final void update(int stallTime, @NotNull String sessionId, String trace) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        SharedPreferences.Editor editorEdit = this.storage.edit();
        editorEdit.putInt(SharedPreferencesKey.STALL_TIME, stallTime);
        editorEdit.putString(SharedPreferencesKey.SESSION_ID, sessionId);
        if (trace != null) {
            editorEdit.putString(SharedPreferencesKey.TRACE, trace);
        }
        editorEdit.apply();
    }
}
