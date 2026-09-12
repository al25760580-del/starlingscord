package com.android.billingclient.api;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3824a;

    public a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i7);
                if (jSONObjectOptJSONObject != null) {
                    arrayList.add(new ProductDetails.PricingPhase(jSONObjectOptJSONObject));
                }
            }
        }
        this.f3824a = arrayList;
    }
}
