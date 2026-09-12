package n1;

import android.os.Bundle;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f16218d;

    public e(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "requestJson");
        Intrinsics.checkNotNullParameter(jsonString, "requestJson");
        try {
            JSONObject jSONObject = new JSONObject(jsonString).getJSONObject("user");
            String string = jSONObject.getString(StackTraceHelper.NAME_KEY);
            String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
            Intrinsics.checkNotNull(string);
            io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(string, string2);
            Intrinsics.checkNotNullParameter(jsonString, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", jsonString);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            Intrinsics.checkNotNullParameter(jsonString, "requestJson");
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle2.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", jsonString);
            bundle2.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", null);
            super(bundle, bundle2, cVar);
            this.f16218d = jsonString;
            Intrinsics.checkNotNullParameter(jsonString, "jsonString");
            if (jsonString.length() != 0) {
                try {
                    new JSONObject(jsonString);
                    return;
                } catch (Exception unused) {
                }
            }
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        } catch (Exception unused2) {
            throw new IllegalArgumentException("user.name must be defined in requestJson");
        }
    }
}
