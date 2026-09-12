package com.appsflyer.internal;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1uSDK {
    void getCurrencyIso4217Code();

    boolean getCurrencyIso4217Code(String str);

    @NotNull
    List<AFc1tSDK> getMediationNetwork();

    String getMonetizationNetwork(@NotNull AFc1tSDK aFc1tSDK);

    void getMonetizationNetwork();
}
