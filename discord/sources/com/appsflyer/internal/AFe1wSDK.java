package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1wSDK {

    @NotNull
    final String AFAdRevenueData;

    @NotNull
    final String getRevenue;

    public AFe1wSDK(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AFAdRevenueData = str;
        this.getRevenue = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFe1wSDK)) {
            return false;
        }
        AFe1wSDK aFe1wSDK = (AFe1wSDK) obj;
        return Intrinsics.areEqual(this.AFAdRevenueData, aFe1wSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getRevenue, aFe1wSDK.getRevenue);
    }

    public final int hashCode() {
        return this.getRevenue.hashCode() + (this.AFAdRevenueData.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return s0.g.f("HostConfig(prefix=", this.AFAdRevenueData, ", host=", this.getRevenue, ")");
    }
}
