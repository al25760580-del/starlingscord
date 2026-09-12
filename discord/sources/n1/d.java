package n1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class d extends c {
    public d(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "responseJson");
        Intrinsics.checkNotNullParameter(jsonString, "responseJson");
        Bundle bundle = new Bundle();
        bundle.putString("androidx.credentials.BUNDLE_KEY_RESPONSE_JSON", jsonString);
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", bundle);
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        if (jsonString.length() != 0) {
            try {
                new JSONObject(jsonString);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("responseJson must not be empty, and must be a valid JSON");
    }
}
