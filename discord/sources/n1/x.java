package n1;

import android.os.Bundle;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.d0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class x extends v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f16238c = d0.g("rpId", "userId", StackTraceHelper.NAME_KEY, "displayName");

    public x(String requestJson) {
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        List list = u.f16235c;
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Bundle requestData = new Bundle();
        requestData.putString("androidx.credentials.signal_request_json_key", requestJson);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        super("androidx.credentials.SIGNAL_CURRENT_USER_DETAILS_STATE_REQUEST_TYPE", requestJson, requestData);
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        try {
            JSONObject jSONObject = new JSONObject(requestJson);
            Iterator it = f16238c.iterator();
            while (it.hasNext()) {
                if (!jSONObject.has((String) it.next())) {
                    throw new IllegalArgumentException(kk.b.g('\'', "Structural/type validation failed for JSON: '", requestJson).toString());
                }
            }
            String string = jSONObject.getString("userId");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            if (com.facebook.imagepipeline.nativecode.c.B(string)) {
                return;
            }
        } catch (Exception unused) {
        }
        throw new IllegalArgumentException(kk.b.g('\'', "Structural/type validation failed for JSON: '", requestJson).toString());
    }
}
