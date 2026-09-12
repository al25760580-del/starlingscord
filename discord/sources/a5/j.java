package a5;

import com.android.billingclient.api.ProductDetails;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.modules.dialog.AlertFragment;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.android.billingclient.api.a f219d;

    public j(JSONObject jSONObject) throws JSONException {
        this.f216a = jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.f217b = true == strOptString.isEmpty() ? null : strOptString;
        this.f218c = jSONObject.getString("offerIdToken");
        this.f219d = new com.android.billingclient.api.a(jSONObject.getJSONArray("pricingPhases"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
            jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        if (jSONObjectOptJSONObject2 != null) {
            jSONObjectOptJSONObject2.getString("productId");
            jSONObjectOptJSONObject2.optString(AlertFragment.ARG_TITLE);
            jSONObjectOptJSONObject2.optString(StackTraceHelper.NAME_KEY);
            jSONObjectOptJSONObject2.optString("description");
            jSONObjectOptJSONObject2.optString("basePlanId");
            JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("pricingPhase");
            if (jSONObjectOptJSONObject3 != null) {
                new ProductDetails.PricingPhase(jSONObjectOptJSONObject3);
            }
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i7 = 0; i7 < jSONArrayOptJSONArray.length(); i7++) {
                arrayList.add(jSONArrayOptJSONArray.getString(i7));
            }
        }
    }
}
