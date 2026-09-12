package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1nSDK extends AFe1eSDK<Map<String, Object>> {
    private static final List<String> areAllFieldsValid = Arrays.asList("googleplay", "playstore", "googleplaystore");
    private final AFc1pSDK copy;
    private final AFh1tSDK copydefault;
    private final AFc1oSDK equals;
    private Map<String, Object> hashCode;
    private String registerClient;
    private final AFd1lSDK toString;

    public AFg1nSDK(@NonNull AFc1bSDK aFc1bSDK) {
        super(AFe1mSDK.GCDSDK, new AFe1mSDK[]{AFe1mSDK.RC_CDN}, aFc1bSDK, "GCD-FETCH");
        this.toString = aFc1bSDK.getRevenue();
        this.equals = aFc1bSDK.component2();
        this.copydefault = aFc1bSDK.component3();
        this.copy = aFc1bSDK.getCurrencyIso4217Code();
        this.getRevenue.add(AFe1mSDK.CONVERSION);
        this.getRevenue.add(AFe1mSDK.LAUNCH);
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final boolean AFAdRevenueData() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AppsFlyerRequestListener areAllFieldsValid() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final boolean copydefault() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    @NonNull
    public final AFe1uSDK getMediationNetwork() {
        AFe1uSDK mediationNetwork;
        AFe1uSDK aFe1uSDK;
        if (((AFe1eSDK) this).component2.getMonetizationNetwork()) {
            AFLogger.afDebugLog("[GCD-E03] 'isStopTracking' enabled");
            this.registerClient = "'isStopTracking' enabled";
            throw new AFe1iSDK();
        }
        AFe1uSDK aFe1uSDK2 = AFe1uSDK.FAILURE;
        int i7 = 0;
        while (i7 <= 2) {
            boolean z5 = true;
            boolean z6 = i7 >= 2;
            this.copydefault.toString = System.currentTimeMillis();
            try {
                try {
                    mediationNetwork = super.getMediationNetwork();
                    ResponseNetwork responseNetwork = ((AFe1eSDK) this).component3;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        if (statusCode != 403 && statusCode < 500) {
                            z5 = false;
                        }
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Map<String, Object> map = (Map) responseNetwork.getBody();
                            int statusCode2 = responseNetwork.getStatusCode();
                            Boolean bool = (Boolean) map.get("iscache");
                            if (statusCode2 == 404) {
                                map.remove("error_reason");
                                map.remove("status_code");
                                map.put("af_status", "Organic");
                                map.put("af_message", "organic install");
                            }
                            if (bool != null && !bool.booleanValue()) {
                                this.equals.getRevenue("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (map.containsKey("af_siteid")) {
                                if (map.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    StringBuilder sb2 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    sb2.append(map.get(AFInAppEventParameterName.AF_CHANNEL));
                                    AFLogger.afDebugLog(sb2.toString());
                                } else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s's Cross Promotion", map.get("af_siteid")));
                                }
                            }
                            map.put("is_first_launch", Boolean.FALSE);
                            this.equals.AFAdRevenueData("attributionId", new JSONObject(map).toString());
                            if (!this.equals.getMediationNetwork("sixtyDayConversionData", false)) {
                                map.put("is_first_launch", Boolean.TRUE);
                            }
                            this.hashCode = map;
                            aFe1uSDK = AFe1uSDK.SUCCESS;
                        } else {
                            if (!z6) {
                                if (!z5) {
                                }
                            }
                            this.registerClient = "Error connection to server: ".concat(String.valueOf(statusCode));
                            aFe1uSDK = AFe1uSDK.FAILURE;
                        }
                        this.copydefault.getMonetizationNetwork(i7);
                        AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                        return aFe1uSDK;
                    }
                } catch (AFe1pSDK e10) {
                    AFLogger.afDebugLog("[GCD-E05] AppsFlyer dev key is missing");
                    this.registerClient = "AppsFlyer dev key is missing";
                    throw e10;
                } catch (Exception e11) {
                    StringBuilder sb3 = new StringBuilder("[GCD] Error: ");
                    sb3.append(e11.getMessage());
                    AFLogger.afErrorLog(sb3.toString(), e11, false, false);
                    mediationNetwork = AFe1uSDK.FAILURE;
                    if (z6) {
                        this.registerClient = e11.getMessage();
                        throw e11;
                    }
                }
                this.copydefault.getMonetizationNetwork(i7);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                aFe1uSDK2 = mediationNetwork;
                i7++;
            } catch (Throwable th2) {
                this.copydefault.getMonetizationNetwork(i7);
                AFLogger.afDebugLog("[GCD-A03] Server retrieving attempt finished");
                throw th2;
            }
        }
        return aFe1uSDK2;
    }

    @Override // com.appsflyer.internal.AFe1eSDK, com.appsflyer.internal.AFe1lSDK
    public final void getRevenue() {
        super.getRevenue();
        Map<String, Object> map = this.hashCode;
        String str = this.registerClient;
        if (map != null) {
            AFg1pSDK.getMonetizationNetwork(map);
        } else if (str == null || str.isEmpty()) {
            AFg1pSDK.getRevenue("Unknown error");
        } else {
            AFg1pSDK.getRevenue(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1eSDK
    public final AFd1jSDK<Map<String, Object>> getRevenue(@NonNull String str) {
        String strConcat;
        String currencyIso4217Code = AFa1uSDK.getCurrencyIso4217Code(this.equals, this.copy.areAllFieldsValid());
        if (currencyIso4217Code != null && !currencyIso4217Code.trim().isEmpty()) {
            if (!areAllFieldsValid.contains(currencyIso4217Code.toLowerCase(Locale.getDefault()))) {
                strConcat = "-".concat(currencyIso4217Code);
            } else {
                AFLogger.afWarnLog("[GCD] AF detected using redundant Google-Play channel for attribution - " + currencyIso4217Code + ". Using without channel postfix.");
                strConcat = "";
            }
        } else {
            strConcat = "";
        }
        AFd1lSDK aFd1lSDK = this.toString;
        AFd1jSDK<Map<String, Object>> aFd1jSDK = (AFd1jSDK) AFd1lSDK.getRevenue(new Object[]{aFd1lSDK, strConcat, str}, 2067226218, -2067226217, System.identityHashCode(aFd1lSDK));
        StringBuilder sb2 = new StringBuilder("[GCD-B01] URL: ");
        sb2.append(aFd1jSDK.getRevenue.getRevenue);
        AFLogger.afInfoLog(sb2.toString());
        return aFd1jSDK;
    }
}
