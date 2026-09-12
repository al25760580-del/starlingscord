package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerConversionListener;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1pSDK {
    public static void getMonetizationNetwork(Map<String, Object> map) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1uSDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            StringBuilder sb2 = new StringBuilder("[GCD-A02] Calling onConversionDataSuccess with:\n");
            sb2.append(map.toString());
            AFLogger.afDebugLog(sb2.toString());
            appsFlyerConversionListener.onConversionDataSuccess(map);
        }
    }

    public static void getRevenue(String str) {
        AppsFlyerConversionListener appsFlyerConversionListener = AFa1uSDK.getMonetizationNetwork().getMediationNetwork;
        if (appsFlyerConversionListener != null) {
            AFLogger.afDebugLog("[GCD-A02] Calling onConversionFailure with:\n".concat(String.valueOf(str)));
            appsFlyerConversionListener.onConversionDataFail(str);
        }
    }
}
