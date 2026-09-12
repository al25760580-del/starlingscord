package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1vSDK {

    @NotNull
    final List<AFe1mSDK> AFAdRevenueData;

    @NotNull
    final String getCurrencyIso4217Code;
    final int getMediationNetwork;

    /* JADX WARN: Multi-variable type inference failed */
    public AFc1vSDK(@NotNull String str, @NotNull List<? extends AFe1mSDK> list, int i7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.getCurrencyIso4217Code = str;
        this.AFAdRevenueData = list;
        this.getMediationNetwork = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1vSDK)) {
            return false;
        }
        AFc1vSDK aFc1vSDK = (AFc1vSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFc1vSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.AFAdRevenueData, aFc1vSDK.AFAdRevenueData) && this.getMediationNetwork == aFc1vSDK.getMediationNetwork;
    }

    public final int hashCode() {
        return Integer.hashCode(this.getMediationNetwork) + a3.e.f(this.AFAdRevenueData, this.getCurrencyIso4217Code.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.getCurrencyIso4217Code;
        List<AFe1mSDK> list = this.AFAdRevenueData;
        int i7 = this.getMediationNetwork;
        StringBuilder sb2 = new StringBuilder("StorageConfigTypeEntry(cacheDirName=");
        sb2.append(str);
        sb2.append(", eventTypes=");
        sb2.append(list);
        sb2.append(", maxCapacity=");
        return kk.b.l(sb2, i7, ")");
    }
}
