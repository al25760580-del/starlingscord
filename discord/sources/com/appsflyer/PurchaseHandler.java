package com.appsflyer;

import androidx.annotation.NonNull;
import com.appsflyer.internal.AFc1bSDK;
import com.appsflyer.internal.AFc1pSDK;
import com.appsflyer.internal.AFe1nSDK;
import com.appsflyer.internal.AFj1bSDK;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PurchaseHandler {

    @NonNull
    public final AFc1bSDK AFAdRevenueData;

    @NonNull
    public final AFe1nSDK getCurrencyIso4217Code;

    @NonNull
    private final AFc1pSDK getMonetizationNetwork;

    public interface PurchaseValidationCallback {
        void onFailure(@NonNull Throwable th2);

        void onResponse(@NonNull ResponseNetwork<String> responseNetwork);
    }

    public PurchaseHandler(@NonNull AFc1bSDK aFc1bSDK) {
        this.AFAdRevenueData = aFc1bSDK;
        this.getMonetizationNetwork = aFc1bSDK.getCurrencyIso4217Code();
        this.getCurrencyIso4217Code = aFc1bSDK.copydefault();
    }

    public final boolean getMonetizationNetwork(Map<String, Object> map, PurchaseValidationCallback purchaseValidationCallback, String... strArr) {
        boolean zAFAdRevenueData = AFj1bSDK.AFAdRevenueData(map, strArr, this.getMonetizationNetwork);
        if (!zAFAdRevenueData && purchaseValidationCallback != null) {
            purchaseValidationCallback.onFailure(new IllegalArgumentException("Invalid Request Data"));
        }
        return zAFAdRevenueData;
    }
}
