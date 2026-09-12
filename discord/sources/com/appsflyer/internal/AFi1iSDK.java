package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1iSDK {
    public final long getCurrencyIso4217Code;
    public final String getMediationNetwork;
    public final String getMonetizationNetwork;
    public final long getRevenue;

    public AFi1iSDK(long j, long j5, String str, String str2) {
        this.getRevenue = j;
        this.getCurrencyIso4217Code = j5;
        this.getMonetizationNetwork = str;
        this.getMediationNetwork = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1iSDK)) {
            return false;
        }
        AFi1iSDK aFi1iSDK = (AFi1iSDK) obj;
        return this.getRevenue == aFi1iSDK.getRevenue && this.getCurrencyIso4217Code == aFi1iSDK.getCurrencyIso4217Code && Intrinsics.areEqual(this.getMonetizationNetwork, aFi1iSDK.getMonetizationNetwork) && Intrinsics.areEqual(this.getMediationNetwork, aFi1iSDK.getMediationNetwork);
    }

    public final int hashCode() {
        int iH = com.discord.chat.presentation.list.a.h(this.getCurrencyIso4217Code, Long.hashCode(this.getRevenue) * 31, 31);
        String str = this.getMonetizationNetwork;
        int iHashCode = (iH + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.getMediationNetwork;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        long j = this.getRevenue;
        long j5 = this.getCurrencyIso4217Code;
        String str = this.getMonetizationNetwork;
        String str2 = this.getMediationNetwork;
        StringBuilder sbM = kk.b.m(j, "PlayIntegrityApiData(piaTimestamp=", ", ttrMillis=");
        sbM.append(j5);
        sbM.append(", piaToken=");
        sbM.append(str);
        return a3.e.o(sbM, ", errorCode=", str2, ")");
    }
}
