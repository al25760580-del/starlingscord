package com.appsflyer.internal;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFd1mSDK {
    void AFAdRevenueData();

    boolean areAllFieldsValid();

    void getCurrencyIso4217Code(@NotNull String str, @NotNull String... strArr);

    boolean getCurrencyIso4217Code();

    void getMediationNetwork();

    void getMonetizationNetwork();

    void getMonetizationNetwork(@NotNull String str, int i7, @NotNull String str2);

    void getMonetizationNetwork(String str, @NotNull String str2);

    void getMonetizationNetwork(@NotNull Throwable th2);

    void getRevenue();

    void getRevenue(@NotNull String str, @NotNull String str2);

    void q_(String str, PackageManager packageManager);
}
