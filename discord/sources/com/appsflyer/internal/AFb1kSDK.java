package com.appsflyer.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.oaid.OaidClient;

/* JADX INFO: loaded from: classes.dex */
public final class AFb1kSDK {
    public static Boolean getMediationNetwork;
    public static String getRevenue;

    /* JADX WARN: Code duplicated, block: B:25:0x004c  */
    public static AFb1mSDK getCurrencyIso4217Code(Context context) {
        Boolean lat;
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        String str = getRevenue;
        boolean z5 = str != null;
        if (z5) {
            lat = null;
        } else {
            Boolean bool = getMediationNetwork;
            if ((bool == null || !bool.booleanValue()) && !(getMediationNetwork == null && appsFlyerProperties.getBoolean(AppsFlyerProperties.COLLECT_OAID, true))) {
                lat = null;
                str = null;
            } else {
                try {
                    OaidClient oaidClient = new OaidClient(context);
                    oaidClient.setLogging(appsFlyerProperties.isEnableLog());
                    OaidClient.Info infoFetch = oaidClient.fetch();
                    if (infoFetch != null) {
                        String id2 = infoFetch.getId();
                        try {
                            lat = infoFetch.getLat();
                            str = id2;
                        } catch (Throwable unused) {
                            str = id2;
                            AFLogger.afDebugLog("No OAID library");
                            lat = null;
                        }
                    } else {
                        lat = null;
                        str = null;
                    }
                } catch (Throwable unused2) {
                    str = null;
                }
            }
        }
        if (str == null) {
            return null;
        }
        AFb1mSDK aFb1mSDK = new AFb1mSDK(str, lat);
        aFb1mSDK.getMediationNetwork = Boolean.valueOf(z5);
        return aFb1mSDK;
    }

    private static boolean getMonetizationNetwork() {
        Boolean bool = getMediationNetwork;
        return bool == null || bool.booleanValue();
    }

    public static AFb1mSDK l_(ContentResolver contentResolver) {
        String string;
        if (!getMonetizationNetwork() || contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i7 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i7 == 0) {
            return new AFb1mSDK(Settings.Secure.getString(contentResolver, "advertising_id"), Boolean.FALSE);
        }
        if (i7 == 2) {
            return null;
        }
        try {
            string = Settings.Secure.getString(contentResolver, "advertising_id");
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th2);
            string = "";
        }
        return new AFb1mSDK(string, Boolean.TRUE);
    }
}
