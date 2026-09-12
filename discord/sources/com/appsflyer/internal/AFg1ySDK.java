package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK {
    final int AFAdRevenueData;
    final int getCurrencyIso4217Code;

    @NotNull
    final String getMediationNetwork;
    final int getMonetizationNetwork;
    final int getRevenue;

    public AFg1ySDK(int i7, int i10, int i11, int i12, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getCurrencyIso4217Code = i7;
        this.AFAdRevenueData = i10;
        this.getMonetizationNetwork = i11;
        this.getRevenue = i12;
        this.getMediationNetwork = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1ySDK)) {
            return false;
        }
        AFg1ySDK aFg1ySDK = (AFg1ySDK) obj;
        return this.getCurrencyIso4217Code == aFg1ySDK.getCurrencyIso4217Code && this.AFAdRevenueData == aFg1ySDK.AFAdRevenueData && this.getMonetizationNetwork == aFg1ySDK.getMonetizationNetwork && this.getRevenue == aFg1ySDK.getRevenue && Intrinsics.areEqual(this.getMediationNetwork, aFg1ySDK.getMediationNetwork);
    }

    public final int hashCode() {
        return this.getMediationNetwork.hashCode() + com.discord.chat.presentation.list.a.u(this.getRevenue, com.discord.chat.presentation.list.a.u(this.getMonetizationNetwork, com.discord.chat.presentation.list.a.u(this.AFAdRevenueData, Integer.hashCode(this.getCurrencyIso4217Code) * 31, 31), 31), 31);
    }

    @NotNull
    public final String toString() {
        int i7 = this.getCurrencyIso4217Code;
        int i10 = this.AFAdRevenueData;
        int i11 = this.getMonetizationNetwork;
        int i12 = this.getRevenue;
        String str = this.getMediationNetwork;
        StringBuilder sbR = a3.e.r(i7, "CmpTcfData(policyVersion=", i10, ", gdprApplies=", ", cmpSdkId=");
        a3.e.z(sbR, i11, ", cmpSdkVersion=", i12, ", tcString=");
        return com.discord.chat.presentation.list.a.k(sbR, str, ")");
    }
}
