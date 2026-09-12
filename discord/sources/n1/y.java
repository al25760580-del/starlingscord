package n1;

import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class y extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f16239c = d0.g("rpId", "credentialId");

    public y(String requestJson) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        List list = u.f16235c;
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Bundle requestData = new Bundle();
        requestData.putString("androidx.credentials.signal_request_json_key", requestJson);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        super("androidx.credentials.SIGNAL_UNKNOWN_CREDENTIAL_STATE_REQUEST_TYPE", requestJson, requestData);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        try {
            JSONObject jSONObject = new JSONObject(requestJson);
            Iterator it = f16239c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    String string = jSONObject.getString("credentialId");
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    if (!com.facebook.imagepipeline.nativecode.c.B(string)) {
                        break;
                    } else {
                        return;
                    }
                }
                String str = (String) it.next();
                if (!jSONObject.has(str)) {
                    Log.e("SignalUnknownRequest", "Request json is missing required key " + str);
                    break;
                }
            }
        } catch (Exception unused) {
        }
        throw new IllegalArgumentException(kk.b.g('\'', "Structural/type validation failed for JSON: '", requestJson).toString());
    }
}
