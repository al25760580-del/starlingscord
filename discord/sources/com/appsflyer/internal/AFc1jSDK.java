package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1jSDK {

    @NotNull
    private static final Lazy getMonetizationNetwork = rn.l.b(new Function0<ExecutorService>() { // from class: com.appsflyer.internal.AFc1jSDK.4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    });

    @NotNull
    public static final ExecutorService AFAdRevenueData() {
        AFc1kSDK aFc1kSDK = new AFc1kSDK(1, 4, 30L, TimeUnit.SECONDS, new SynchronousQueue(), null, 32, null);
        aFc1kSDK.allowCoreThreadTimeOut(true);
        return aFc1kSDK;
    }

    @NotNull
    public static final ExecutorService getCurrencyIso4217Code() {
        Object value = getMonetizationNetwork.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return (ExecutorService) value;
    }

    @NotNull
    public static final ScheduledExecutorService getMediationNetwork() {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewSingleThreadScheduledExecutor, "");
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    @NotNull
    public static final ScheduledExecutorService getMonetizationNetwork() {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        Intrinsics.checkNotNullExpressionValue(scheduledExecutorServiceNewScheduledThreadPool, "");
        return scheduledExecutorServiceNewScheduledThreadPool;
    }
}
