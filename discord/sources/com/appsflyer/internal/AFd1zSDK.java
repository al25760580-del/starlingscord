package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1zSDK {
    int AFAdRevenueData();

    boolean getCurrencyIso4217Code();

    boolean getCurrencyIso4217Code(@NotNull String... strArr);

    @NotNull
    List<AFc1cSDK> getMediationNetwork();

    void getMediationNetwork(int i7, int i10);

    String getRevenue(@NotNull Throwable th2, @NotNull String str);
}
