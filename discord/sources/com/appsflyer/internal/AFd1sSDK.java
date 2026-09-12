package com.appsflyer.internal;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1sSDK {
    public static boolean getCurrencyIso4217Code(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        int mediationNetwork = AFk1zSDK.getMediationNetwork(str);
        int mediationNetwork2 = AFk1zSDK.getMediationNetwork(str2);
        Pair<Integer, Integer> currencyIso4217Code = AFd1rSDK.getCurrencyIso4217Code(str2);
        Pair<Integer, Integer> monetizationNetwork = AFd1rSDK.getMonetizationNetwork(str2);
        if (mediationNetwork2 != -1 && currencyIso4217Code == null) {
            return mediationNetwork2 == mediationNetwork;
        }
        if (monetizationNetwork != null) {
            return ((Number) monetizationNetwork.f14612d).intValue() <= mediationNetwork && mediationNetwork <= ((Number) monetizationNetwork.f14613e).intValue();
        }
        return currencyIso4217Code != null && ((Number) currencyIso4217Code.f14612d).intValue() <= mediationNetwork && mediationNetwork <= ((Number) currencyIso4217Code.f14613e).intValue();
    }
}
