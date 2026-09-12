package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFAdRevenueData;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1nSDK extends AFh1jSDK {
    public final Map<String, Object> copydefault;

    @NonNull
    public final AFAdRevenueData hashCode;

    public AFh1nSDK(@NonNull AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.hashCode = aFAdRevenueData;
        this.copydefault = map;
    }

    @Override // com.appsflyer.internal.AFh1jSDK
    public final AFe1mSDK getCurrencyIso4217Code() {
        return AFe1mSDK.ADREVENUE;
    }
}
