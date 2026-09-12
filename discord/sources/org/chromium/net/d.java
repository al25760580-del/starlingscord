package org.chromium.net;

import org.json.JSONException;
import org.json.JSONObject;
import s0.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static JSONObject a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return jSONObjectOptJSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put(str, jSONObject2);
            return jSONObject2;
        } catch (JSONException e10) {
            throw new IllegalArgumentException(g.e("Failed adding a default object for key [", str, "]"), e10);
        }
    }
}
