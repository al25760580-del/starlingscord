package n1;

import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class u extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f16235c = d0.g("rpId", "userId", "allAcceptedCredentialIds");

    public u(String requestJson) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Bundle requestData = new Bundle();
        requestData.putString("androidx.credentials.signal_request_json_key", requestJson);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        super("androidx.credentials.SIGNAL_ALL_ACCEPTED_CREDENTIALS_REQUEST_TYPE", requestJson, requestData);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        try {
            JSONObject jSONObject = new JSONObject(requestJson);
            Iterator it = f16235c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    String string = jSONObject.getString("userId");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    if (!com.facebook.imagepipeline.nativecode.c.B(string)) {
                        break;
                    }
                    JSONArray jSONArray = jSONObject.getJSONArray("allAcceptedCredentialIds");
                    int length = jSONArray.length();
                    for (int i7 = 0; i7 < length; i7++) {
                        Object obj = jSONArray.get(i7);
                        if (!(obj instanceof String) || !com.facebook.imagepipeline.nativecode.c.B((String) obj)) {
                            break;
                            break;
                        }
                    }
                    return;
                }
                String str = (String) it.next();
                if (!jSONObject.has(str)) {
                    Log.e("SignalAcceptedIdsReq", "Request json is missing required key " + str);
                    break;
                }
            }
        } catch (Exception unused) {
        }
        throw new IllegalArgumentException(kk.b.g('\'', "Structural/type validation failed for JSON: '", requestJson).toString());
    }
}
