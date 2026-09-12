package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0007\u0010\u0011"}, d2 = {"Lcom/appsflyer/internal/AFj1aSDK;", "", "<init>", "()V", "", "", "p0", "AFAdRevenueData", "(Ljava/util/Map;)Ljava/util/Map;", "Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/lang/Runnable;", "p1", "", "p2", "Ljava/util/concurrent/TimeUnit;", "p3", "", "(Ljava/util/concurrent/ScheduledExecutorService;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AFj1aSDK {

    @NotNull
    public static final AFj1aSDK INSTANCE = new AFj1aSDK();

    private AFj1aSDK() {
    }

    public static final void AFAdRevenueData(@NotNull ScheduledExecutorService p3, @NotNull Runnable p5, long p6, @NotNull TimeUnit p10) {
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p10, "");
        try {
            p3.schedule(p5, p6, p10);
        } catch (RejectedExecutionException e10) {
            AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e10);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("scheduleJob failed with Exception", th2);
        }
    }

    @NotNull
    public static final Map<String, Object> AFAdRevenueData(@NotNull Map<String, Object> p3) {
        Intrinsics.checkNotNullParameter(p3, "");
        Object obj = p3.get("meta");
        Map<String, Object> map = TypeIntrinsics.isMutableMap(obj) ? (Map) obj : null;
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        p3.put("meta", linkedHashMap);
        return linkedHashMap;
    }
}
