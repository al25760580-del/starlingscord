package com.appsflyer.internal;

import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFg1rSDK {
    Long AFAdRevenueData();

    void AFAdRevenueData(@NotNull AFh1jSDK aFh1jSDK);

    long getCurrencyIso4217Code();

    void getCurrencyIso4217Code(@NotNull AFh1jSDK aFh1jSDK);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map);

    void getCurrencyIso4217Code(@NotNull Map<String, Object> map, int i7, int i10);

    void getMediationNetwork(@NotNull AFh1jSDK aFh1jSDK);

    void getMediationNetwork(@NotNull Map<String, Object> map);

    void getMonetizationNetwork(@NotNull AFh1jSDK aFh1jSDK);

    void getMonetizationNetwork(@NotNull Map<String, Object> map);

    void getMonetizationNetwork(@NotNull Map<String, Object> map, @NotNull AFe1mSDK aFe1mSDK);

    void getRevenue(@NotNull AFh1jSDK aFh1jSDK);

    void getRevenue(@NotNull Map<String, Object> map);
}
