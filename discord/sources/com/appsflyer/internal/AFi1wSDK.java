package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1wSDK {
    private final boolean AFAdRevenueData;

    @NonNull
    public final String getCurrencyIso4217Code;

    @NonNull
    public final AFh1cSDK getMediationNetwork;
    public final AFi1zSDK getMonetizationNetwork;

    @NonNull
    public final String getRevenue;

    public AFi1wSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.getCurrencyIso4217Code = string;
            this.AFAdRevenueData = jSONObject.optBoolean("test_mode");
            this.getRevenue = str;
            this.getMediationNetwork = string.startsWith("default") ? AFh1cSDK.DEFAULT : AFh1cSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.getMonetizationNetwork = jSONObjectOptJSONObject != null ? new AFi1zSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e10) {
            AFLogger.afErrorLogForExcManagerOnly("Error in RC config parsing", e10);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFi1wSDK.class != obj.getClass()) {
            return false;
        }
        AFi1wSDK aFi1wSDK = (AFi1wSDK) obj;
        if (this.AFAdRevenueData == aFi1wSDK.AFAdRevenueData && this.getCurrencyIso4217Code.equals(aFi1wSDK.getCurrencyIso4217Code)) {
            return this.getRevenue.equals(aFi1wSDK.getRevenue);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.getRevenue.hashCode() + ((this.getCurrencyIso4217Code.hashCode() + ((this.AFAdRevenueData ? 1 : 0) * 31)) * 31);
        AFi1zSDK aFi1zSDK = this.getMonetizationNetwork;
        if (aFi1zSDK == null) {
            return iHashCode;
        }
        return aFi1zSDK.hashCode() + (iHashCode * 31);
    }
}
