package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1zSDK implements AFf1bSDK {

    @NotNull
    private final Context getMediationNetwork;

    @NotNull
    private final AppsFlyerProperties getRevenue;

    public AFg1zSDK(@NotNull Context context, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.getMediationNetwork = context;
        this.getRevenue = appsFlyerProperties;
    }

    @Override // com.appsflyer.internal.AFf1bSDK
    public final AFg1ySDK getCurrencyIso4217Code() {
        String string;
        if (!Boolean.parseBoolean(this.getRevenue.getString(AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION))) {
            return null;
        }
        try {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.getMediationNetwork);
            int i7 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
            int i10 = defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1);
            int i11 = defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1);
            int i12 = defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1);
            String str = "";
            if (i7 == 1 && (string = defaultSharedPreferences.getString("IABTCF_TCString", "")) != null) {
                Intrinsics.checkNotNullExpressionValue(string, "");
                str = string;
            }
            return new AFg1ySDK(i11, i7, i10, i12, str);
        } catch (Exception e10) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.DMA, "TCF data collection exception", e10, false, false, false, false, 120, null);
            return null;
        }
    }
}
