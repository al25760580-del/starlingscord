package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1jSDK extends AFe1hSDK {
    public AFe1jSDK(@NonNull Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback, @NonNull AFc1bSDK aFc1bSDK) {
        super(AFe1mSDK.ARS_VALIDATE, new AFe1mSDK[]{AFe1mSDK.RC_CDN, AFe1mSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, map, purchaseValidationCallback);
        this.getRevenue.add(AFe1mSDK.CONVERSION);
    }

    @Override // com.appsflyer.internal.AFe1hSDK, com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
        if (responseNetwork == null || responseNetwork.getStatusCode() != 424) {
            return super.AFAdRevenueData();
        }
        return true;
    }

    @Override // com.appsflyer.internal.AFe1gSDK
    public final AFd1jSDK<String> getMediationNetwork(@NonNull Map<String, Object> map, @NonNull String str, String str2) {
        return ((AFe1eSDK) this).component1.AFAdRevenueData(map, str, str2);
    }
}
