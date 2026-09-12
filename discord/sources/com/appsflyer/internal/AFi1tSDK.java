package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1tSDK {
    public final String getCurrencyIso4217Code;
    public final String getMediationNetwork;
    private final boolean getMonetizationNetwork;

    @NotNull
    public final String getRevenue;

    public AFi1tSDK(@NotNull String str, String str2, String str3, boolean z5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getRevenue = str;
        this.getMediationNetwork = str2;
        this.getCurrencyIso4217Code = str3;
        this.getMonetizationNetwork = z5;
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getMonetizationNetwork;
    }
}
