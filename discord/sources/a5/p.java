package a5;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f247d;

    public p(String str) {
        this.f244a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f245b = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.f246c = strOptString;
        this.f247d = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return TextUtils.equals(this.f244a, ((p) obj).f244a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f244a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UnfetchedProduct{productId='");
        sb2.append(this.f245b);
        sb2.append("', productType='");
        sb2.append(this.f246c);
        sb2.append("', statusCode=");
        return kk.b.l(sb2, this.f247d, "}");
    }
}
