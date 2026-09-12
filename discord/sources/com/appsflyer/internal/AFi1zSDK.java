package com.appsflyer.internal;

import java.util.ArrayList;
import kotlin.Result;
import kotlin.collections.n0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import rn.q;
import rn.r;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1zSDK {
    public final AFi1xSDK AFAdRevenueData;
    public final AFh1aSDK getCurrencyIso4217Code;
    public AFi1ySDK getMediationNetwork;

    public AFi1zSDK(@NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.getMediationNetwork = getCurrencyIso4217Code(jSONObject);
        this.getCurrencyIso4217Code = getRevenue(jSONObject);
        this.AFAdRevenueData = getMediationNetwork(jSONObject);
    }

    private static JSONObject AFAdRevenueData(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject;
        if (!jSONObject.has(str) || (jSONObjectOptJSONObject = jSONObject.getJSONArray(str).optJSONObject(0).optJSONObject("data")) == null) {
            return null;
        }
        return jSONObjectOptJSONObject.optJSONObject("v1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9, types: [kotlin.collections.n0] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    private static AFi1ySDK getCurrencyIso4217Code(JSONObject jSONObject) {
        Object objO;
        ?? arrayList;
        try {
            q qVar = Result.f14614e;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "r_debugger");
            if (jSONObjectAFAdRevenueData != null) {
                long j = jSONObjectAFAdRevenueData.getLong("ttl");
                int i7 = jSONObjectAFAdRevenueData.getInt("counter");
                String strOptString = jSONObjectAFAdRevenueData.optString("app_ver", "");
                String strOptString2 = jSONObjectAFAdRevenueData.optString("sdk_ver", "");
                float fOptDouble = (float) jSONObjectAFAdRevenueData.optDouble("ratio", 1.0d);
                JSONArray jSONArrayOptJSONArray = jSONObjectAFAdRevenueData.optJSONArray("tags");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.checkNotNullExpressionValue(jSONArrayOptJSONArray, "");
                    arrayList = new ArrayList();
                    int length = jSONArrayOptJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        String string = jSONArrayOptJSONArray.getString(i10);
                        Intrinsics.checkNotNullExpressionValue(string, "");
                        arrayList.add(string);
                    }
                } else {
                    arrayList = n0.f14659d;
                }
                ?? r7 = arrayList;
                Intrinsics.checkNotNullExpressionValue(strOptString, "");
                Intrinsics.checkNotNullExpressionValue(strOptString2, "");
                objO = new AFi1ySDK(j, fOptDouble, r7, i7, strOptString, strOptString2);
            } else {
                objO = null;
            }
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        q qVar3 = Result.f14614e;
        return (AFi1ySDK) (objO instanceof r ? null : objO);
    }

    private static AFi1xSDK getMediationNetwork(JSONObject jSONObject) {
        Object objO;
        try {
            q qVar = Result.f14614e;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "meta_data");
            objO = jSONObjectAFAdRevenueData != null ? new AFi1xSDK(jSONObjectAFAdRevenueData.optDouble("send_rate", 1.0d)) : null;
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        return (AFi1xSDK) (objO instanceof r ? null : objO);
    }

    private static AFh1aSDK getRevenue(JSONObject jSONObject) {
        Object objO;
        try {
            q qVar = Result.f14614e;
            JSONObject jSONObjectAFAdRevenueData = AFAdRevenueData(jSONObject, "exc_mngr");
            objO = jSONObjectAFAdRevenueData != null ? new AFh1aSDK(jSONObjectAFAdRevenueData.getString("sdk_ver"), jSONObjectAFAdRevenueData.optInt("min", -1), jSONObjectAFAdRevenueData.optInt("expire", -1), jSONObjectAFAdRevenueData.optLong("ttl", -1L)) : null;
        } catch (Throwable th2) {
            q qVar2 = Result.f14614e;
            objO = ib.a.o(th2);
        }
        return (AFh1aSDK) (objO instanceof r ? null : objO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(AFi1zSDK.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(obj, "");
        AFi1zSDK aFi1zSDK = (AFi1zSDK) obj;
        return Intrinsics.areEqual(this.getCurrencyIso4217Code, aFi1zSDK.getCurrencyIso4217Code) && Intrinsics.areEqual(this.AFAdRevenueData, aFi1zSDK.AFAdRevenueData) && Intrinsics.areEqual(this.getMediationNetwork, aFi1zSDK.getMediationNetwork);
    }

    public final int hashCode() {
        AFh1aSDK aFh1aSDK = this.getCurrencyIso4217Code;
        int iHashCode = (aFh1aSDK != null ? aFh1aSDK.hashCode() : 0) * 31;
        AFi1xSDK aFi1xSDK = this.AFAdRevenueData;
        int iHashCode2 = (iHashCode + (aFi1xSDK != null ? aFi1xSDK.hashCode() : 0)) * 31;
        AFi1ySDK aFi1ySDK = this.getMediationNetwork;
        return iHashCode2 + (aFi1ySDK != null ? aFi1ySDK.hashCode() : 0);
    }
}
