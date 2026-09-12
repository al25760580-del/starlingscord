package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.Map;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1iSDK extends AFe1lSDK<Void> {
    private final AFe1xSDK<String> component2;
    private final Throwable component3;
    private final AFc1oSDK component4;

    public AFg1iSDK(AFf1rSDK aFf1rSDK, AFc1oSDK aFc1oSDK) {
        super(AFe1mSDK.GCDSDK, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, "GCD-CHECK");
        this.component3 = aFf1rSDK.component1();
        this.component2 = ((AFe1eSDK) aFf1rSDK).component3;
        this.component4 = aFc1oSDK;
    }

    private Map<String, Object> areAllFieldsValid() {
        String monetizationNetwork = this.component4.getMonetizationNetwork("attributionId", null);
        if (monetizationNetwork == null) {
            return null;
        }
        try {
            new AFd1iSDK();
            return AFd1iSDK.getRevenue(monetizationNetwork);
        } catch (JSONException e10) {
            StringBuilder sb2 = new StringBuilder("[GCD] Failed to parse GCD response: ");
            sb2.append(e10.getMessage());
            AFLogger.afErrorLog(sb2.toString(), e10);
            return null;
        }
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    public final long getCurrencyIso4217Code() {
        return 1000L;
    }

    @Override // com.appsflyer.internal.AFe1lSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() {
        AFLogger.afDebugLog("[GCD-A01] Loading conversion data. Counter: ".concat(String.valueOf(this.component4.getMediationNetwork("appsFlyerCount", 0))));
        long currencyIso4217Code = this.component4.getCurrencyIso4217Code("appsflyerConversionDataCacheExpiration", 0L);
        if (currencyIso4217Code != 0 && System.currentTimeMillis() - currencyIso4217Code > 5184000000L) {
            AFLogger.afDebugLog("[GCD-E02] Cached conversion data expired");
            this.component4.getCurrencyIso4217Code("sixtyDayConversionData", true);
            this.component4.AFAdRevenueData("attributionId", null);
            this.component4.getRevenue("appsflyerConversionDataCacheExpiration", 0L);
        }
        Map<String, Object> mapAreAllFieldsValid = areAllFieldsValid();
        if (mapAreAllFieldsValid != null) {
            try {
                if (!mapAreAllFieldsValid.containsKey("is_first_launch")) {
                    mapAreAllFieldsValid.put("is_first_launch", Boolean.FALSE);
                }
                AFg1pSDK.getMonetizationNetwork(mapAreAllFieldsValid);
            } catch (Exception e10) {
                StringBuilder sb2 = new StringBuilder("[GCD] Error executing conversion data callback: ");
                sb2.append(e10.getLocalizedMessage());
                AFLogger.afErrorLog(sb2.toString(), e10);
            }
            return AFe1uSDK.SUCCESS;
        }
        try {
            if (this.component3 != null) {
                StringBuilder sb3 = new StringBuilder("Launch exception: ");
                sb3.append(this.component3.getMessage());
                AFg1pSDK.getRevenue(sb3.toString());
                return AFe1uSDK.SUCCESS;
            }
            AFe1xSDK<String> aFe1xSDK = this.component2;
            if (aFe1xSDK != null && !aFe1xSDK.isSuccessful()) {
                StringBuilder sb4 = new StringBuilder("Launch status code: ");
                sb4.append(this.component2.getStatusCode());
                AFg1pSDK.getRevenue(sb4.toString());
                return AFe1uSDK.SUCCESS;
            }
            return AFe1uSDK.FAILURE;
        } catch (Exception e11) {
            StringBuilder sb5 = new StringBuilder("[GCD] Error executing conversion data callback: ");
            sb5.append(e11.getLocalizedMessage());
            AFLogger.afErrorLog(sb5.toString(), e11);
        }
    }
}
