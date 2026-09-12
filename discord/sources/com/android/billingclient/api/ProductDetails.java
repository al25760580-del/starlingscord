package com.android.billingclient.api;

import a3.e;
import a5.i;
import a5.j;
import android.text.TextUtils;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ProductDetails {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f3792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f3795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3796f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3797g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f3798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f3799i;
    public final ArrayList j;

    public static final class PricingPhase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3800a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f3801b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3802c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f3803d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f3804e;

        public PricingPhase(JSONObject jSONObject) {
            this.f3803d = jSONObject.optString("billingPeriod");
            this.f3802c = jSONObject.optString("priceCurrencyCode");
            this.f3800a = jSONObject.optString("formattedPrice");
            this.f3801b = jSONObject.optLong("priceAmountMicros");
            jSONObject.optInt("recurrenceMode");
            this.f3804e = jSONObject.optInt("billingCycleCount");
        }
    }

    public ProductDetails(String str) {
        this.f3791a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f3792b = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.f3793c = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.f3794d = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f3795e = jSONObject.optString(AlertFragment.ARG_TITLE);
        jSONObject.optString(StackTraceHelper.NAME_KEY);
        this.f3796f = jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f3797g = jSONObject.optString("skuDetailsToken");
        this.f3798h = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                arrayList.add(new j(jSONArrayOptJSONArray.getJSONObject(i7)));
            }
            this.f3799i = arrayList;
        } else {
            this.f3799i = (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject jSONObjectOptJSONObject = this.f3792b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.f3792b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                arrayList2.add(new i(jSONArrayOptJSONArray2.getJSONObject(i10)));
            }
            this.j = arrayList2;
            return;
        }
        if (jSONObjectOptJSONObject == null) {
            this.j = null;
        } else {
            arrayList2.add(new i(jSONObjectOptJSONObject));
            this.j = arrayList2;
        }
    }

    public final i a() {
        ArrayList arrayList = this.j;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (i) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductDetails) {
            return TextUtils.equals(this.f3791a, ((ProductDetails) obj).f3791a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3791a.hashCode();
    }

    public final String toString() {
        String string = this.f3792b.toString();
        String strValueOf = String.valueOf(this.f3799i);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        e.A(sb2, this.f3791a, "', parsedJson=", string, ", productId='");
        sb2.append(this.f3793c);
        sb2.append("', productType='");
        sb2.append(this.f3794d);
        sb2.append("', title='");
        sb2.append(this.f3795e);
        sb2.append("', productDetailsToken='");
        return com.discord.chat.presentation.list.a.l(sb2, this.f3797g, "', subscriptionOfferDetails=", strValueOf, "}");
    }
}
