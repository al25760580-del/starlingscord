package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1bSDK {
    @NonNull
    AFe1qSDK AFAdRevenueData();

    @NonNull
    AFe1ySDK AFInAppEventParameterName();

    @NonNull
    AFc1uSDK AFInAppEventType();

    @NonNull
    AFf1cSDK AFKeystoreWrapper();

    @NonNull
    AFj1rSDK AFLogger();

    @NonNull
    AFb1aSDK afDebugLog();

    @NonNull
    AFg1aSDK afErrorLog();

    @NonNull
    AFa1hSDK afErrorLogForExcManagerOnly();

    @NonNull
    AFc1eSDK afInfoLog();

    AFh1qSDK afLogForce();

    @NonNull
    AFb1bSDK afRDLog();

    @NonNull
    AFd1xSDK afWarnLog();

    @NonNull
    PurchaseHandler areAllFieldsValid();

    @NonNull
    AFf1lSDK component1();

    @NonNull
    AFc1oSDK component2();

    @NonNull
    AFh1tSDK component3();

    @NonNull
    AFg1rSDK component4();

    @NonNull
    AFj1pSDK copy();

    @NonNull
    AFe1nSDK copydefault();

    @NonNull
    AFi1kSDK d();

    @NonNull
    AFi1lSDK e();

    @NonNull
    AFd1mSDK equals();

    @NonNull
    AFf1gSDK force();

    @NonNull
    AFc1pSDK getCurrencyIso4217Code();

    @NonNull
    ExecutorService getMediationNetwork();

    @NonNull
    ScheduledExecutorService getMonetizationNetwork();

    @NonNull
    AFd1lSDK getRevenue();

    @NonNull
    AFa1rSDK i();

    @NonNull
    AFc1gSDK registerClient();

    @NonNull
    AFa1bSDK unregisterClient();

    AFi1jSDK v();

    @NonNull
    AFi1sSDK w();
}
