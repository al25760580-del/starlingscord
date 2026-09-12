package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.Map;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1lSDK implements AFa1hSDK {

    @NotNull
    private final AFc1oSDK getCurrencyIso4217Code;

    public AFa1lSDK(@NotNull AFc1oSDK aFc1oSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        this.getCurrencyIso4217Code = aFc1oSDK;
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    public final void getMediationNetwork() {
        this.getCurrencyIso4217Code.getCurrencyIso4217Code("deeplink_data");
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    @NotNull
    public final Map<String, Object> getMonetizationNetwork() {
        if (this.getCurrencyIso4217Code.getRevenue("deeplink_data")) {
            try {
                String monetizationNetwork = this.getCurrencyIso4217Code.getMonetizationNetwork("deeplink_data", null);
                return monetizationNetwork == null ? w0.d() : AFj1cSDK.getRevenue(new JSONObject(monetizationNetwork));
            } catch (Throwable th2) {
                AFLogger.afErrorLog("Exception while parsing stored deeplink data", th2, true, false);
            }
        }
        return w0.d();
    }

    @Override // com.appsflyer.internal.AFa1hSDK
    public final void getMonetizationNetwork(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.getCurrencyIso4217Code.AFAdRevenueData("deeplink_data", new JSONObject(map).toString());
    }
}
