package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1vSDK {

    @NonNull
    public final String AFAdRevenueData;
    public final Throwable areAllFieldsValid;
    public final AFi1uSDK component1;
    public final String component3;
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final long getMonetizationNetwork;
    public final int getRevenue;

    public AFi1vSDK(String str, @NonNull String str2, long j, long j5, int i7, AFi1uSDK aFi1uSDK, String str3, Throwable th2) {
        this.getMediationNetwork = str;
        this.AFAdRevenueData = str2;
        this.getMonetizationNetwork = j;
        this.getCurrencyIso4217Code = j5;
        this.getRevenue = i7;
        this.component1 = aFi1uSDK;
        this.component3 = str3;
        this.areAllFieldsValid = th2;
    }
}
