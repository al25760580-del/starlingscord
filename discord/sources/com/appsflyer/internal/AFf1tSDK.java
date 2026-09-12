package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1tSDK extends AFe1eSDK<String> {
    private final AFh1gSDK areAllFieldsValid;

    public AFf1tSDK(@NonNull AFh1gSDK aFh1gSDK, @NonNull AFc1bSDK aFc1bSDK) {
        AFe1mSDK aFe1mSDK = aFh1gSDK.toString;
        AFe1mSDK aFe1mSDK2 = aFe1mSDK == null ? AFe1mSDK.CACHED_EVENT : aFe1mSDK;
        AFe1mSDK[] aFe1mSDKArr = {AFe1mSDK.RC_CDN};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFh1gSDK.getRevenue);
        sb2.append("-");
        sb2.append(getMediationNetwork(aFh1gSDK));
        super(aFe1mSDK2, aFe1mSDKArr, aFc1bSDK, sb2.toString(), aFh1gSDK.getRevenue);
        this.areAllFieldsValid = aFh1gSDK;
    }

    private boolean copy() {
        ResponseNetwork responseNetwork;
        AFe1mSDK aFe1mSDK = this.areAllFieldsValid.toString;
        if (aFe1mSDK == null) {
            aFe1mSDK = AFe1mSDK.CACHED_EVENT;
        }
        return aFe1mSDK == AFe1mSDK.ARS_VALIDATE && (responseNetwork = ((AFe1eSDK) this).component3) != null && responseNetwork.getStatusCode() == 424;
    }

    private boolean equals() {
        ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
        boolean z5 = this.AFAdRevenueData == AFe1uSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
        AFe1mSDK aFe1mSDK = this.getCurrencyIso4217Code;
        return z5 && (aFe1mSDK == AFe1mSDK.CONVERSION || aFe1mSDK == AFe1mSDK.ATTR);
    }

    private static String getMediationNetwork(AFh1gSDK aFh1gSDK) {
        try {
            return new URL(aFh1gSDK.component3).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return super.AFAdRevenueData() || copy() || equals();
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return this.areAllFieldsValid.getMonetizationNetwork;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1jSDK<String> getRevenue(@NonNull String str) {
        String strEncodeToString = Base64.encodeToString(this.areAllFieldsValid.AFAdRevenueData(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(strEncodeToString)));
        this.component4.getMonetizationNetwork(this.areAllFieldsValid.component3, strEncodeToString);
        return ((AFe1eSDK) this).component1.getRevenue(this.areAllFieldsValid);
    }
}
