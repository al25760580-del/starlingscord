package com.discord.foreground_service.utils;

import com.discord.crash_reporting.CrashReporting;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.w0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sn.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0007H\u0002J\\\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072&\u0010\u000e\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011\u0012\u0004\u0012\u00020\u000b0\u000f2\u000e\u0010\u0012\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0002J'\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0000¢\u0006\u0002\b\u0015J;\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0000¢\u0006\u0002\b\u0015J'\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0000¢\u0006\u0002\b\u0017J;\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0000¢\u0006\u0002\b\u0017J'\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0000¢\u0006\u0002\b\u0018J;\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u0010\b\u0002\u0010\u0014\u001a\n\u0018\u00010\u0010j\u0004\u0018\u0001`\u0011H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/discord/foreground_service/utils/Log;", "", "<init>", "()V", "TAG", "", "buildBreadcrumbData", "", "levelDetail", "baseData", "logWithBreadcrumb", "", "message", "breadcrumbData", "logger", "Lkotlin/Function3;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "throwable", "i", "e", "i$foreground_service_release", "w", "w$foreground_service_release", "e$foreground_service_release", "foreground_service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Log {

    @NotNull
    public static final Log INSTANCE = new Log();

    @NotNull
    public static final String TAG = "ForegroundService";

    private Log() {
    }

    private final Map<String, Object> buildBreadcrumbData(String levelDetail, Map<String, ? extends Object> baseData) {
        i builder = new i();
        Object obj = baseData.get("action");
        if (obj == null) {
            obj = "log";
        }
        builder.put("action", obj);
        Object obj2 = baseData.get("detail");
        Object obj3 = levelDetail;
        if (obj2 != null) {
            obj3 = obj2;
        }
        builder.put("detail", obj3);
        Object obj4 = baseData.get("fgs_operation");
        builder.put("fgs_operation", obj4 != null ? obj4 : "log");
        builder.putAll(baseData);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.b();
    }

    public static /* synthetic */ void e$foreground_service_release$default(Log log, String str, Exception exc, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            exc = null;
        }
        log.e$foreground_service_release(str, exc);
    }

    public static /* synthetic */ void i$foreground_service_release$default(Log log, String str, Exception exc, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            exc = null;
        }
        log.i$foreground_service_release(str, exc);
    }

    private final void logWithBreadcrumb(String message, Map<String, ? extends Object> breadcrumbData, Function3 logger, Exception throwable) {
        CrashReporting.addBreadcrumb$default(CrashReporting.INSTANCE, message, breadcrumbData, TAG, null, false, 24, null);
        logger.invoke(TAG, message, throwable);
    }

    public static /* synthetic */ void w$foreground_service_release$default(Log log, String str, Exception exc, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            exc = null;
        }
        log.w$foreground_service_release(str, exc);
    }

    public final void e$foreground_service_release(@NotNull String message, Exception e10) {
        Intrinsics.checkNotNullParameter(message, "message");
        logWithBreadcrumb(message, buildBreadcrumbData("error", w0.d()), new Log$e$1(com.discord.logging.Log.INSTANCE), e10);
    }

    public final void i$foreground_service_release(@NotNull String message, Exception e10) {
        Intrinsics.checkNotNullParameter(message, "message");
        logWithBreadcrumb(message, buildBreadcrumbData("info", w0.d()), new Log$i$1(com.discord.logging.Log.INSTANCE), e10);
    }

    public final void w$foreground_service_release(@NotNull String message, Exception e10) {
        Intrinsics.checkNotNullParameter(message, "message");
        logWithBreadcrumb(message, buildBreadcrumbData("warn", w0.d()), new Log$w$1(com.discord.logging.Log.INSTANCE), e10);
    }

    public static /* synthetic */ void e$foreground_service_release$default(Log log, String str, Map map, Exception exc, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            exc = null;
        }
        log.e$foreground_service_release(str, map, exc);
    }

    public static /* synthetic */ void i$foreground_service_release$default(Log log, String str, Map map, Exception exc, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            exc = null;
        }
        log.i$foreground_service_release(str, map, exc);
    }

    public static /* synthetic */ void w$foreground_service_release$default(Log log, String str, Map map, Exception exc, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            exc = null;
        }
        log.w$foreground_service_release(str, map, exc);
    }

    public final void e$foreground_service_release(@NotNull String message, @NotNull Map<String, ? extends Object> breadcrumbData, Exception e10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(breadcrumbData, "breadcrumbData");
        logWithBreadcrumb(message, buildBreadcrumbData("error", breadcrumbData), new Log$e$2(com.discord.logging.Log.INSTANCE), e10);
    }

    public final void i$foreground_service_release(@NotNull String message, @NotNull Map<String, ? extends Object> breadcrumbData, Exception e10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(breadcrumbData, "breadcrumbData");
        logWithBreadcrumb(message, buildBreadcrumbData("info", breadcrumbData), new Log$i$2(com.discord.logging.Log.INSTANCE), e10);
    }

    public final void w$foreground_service_release(@NotNull String message, @NotNull Map<String, ? extends Object> breadcrumbData, Exception e10) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(breadcrumbData, "breadcrumbData");
        logWithBreadcrumb(message, buildBreadcrumbData("warn", breadcrumbData), new Log$w$2(com.discord.logging.Log.INSTANCE), e10);
    }
}
