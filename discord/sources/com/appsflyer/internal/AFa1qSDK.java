package com.appsflyer.internal;

import com.appsflyer.deeplink.DeepLink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1qSDK implements AFe1vSDK<AFa1mSDK> {
    @Override // com.appsflyer.internal.AFe1vSDK
    public final /* synthetic */ AFa1mSDK getMonetizationNetwork(String str) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        DeepLink monetizationNetwork = null;
        if (str == null || str.length() == 0) {
            return new AFa1mSDK(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("found", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (zOptBoolean && (jSONObjectOptJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            monetizationNetwork = DeepLink.getMonetizationNetwork(jSONObjectOptJSONObject);
            monetizationNetwork.getCurrencyIso4217Code.put("is_deferred", true);
        }
        return new AFa1mSDK(zOptBoolean2, monetizationNetwork);
    }
}
