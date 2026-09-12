package n1;

import android.os.Bundle;
import kotlin.collections.p0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class q extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f16232e;

    public q(String jsonString) {
        Intrinsics.checkNotNullParameter(jsonString, "requestJson");
        Intrinsics.checkNotNullParameter(jsonString, "requestJson");
        Bundle requestData = new Bundle();
        requestData.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", jsonString);
        Bundle candidateQueryData = new Bundle();
        p0 allowedProviders = p0.f14661d;
        Intrinsics.checkNotNullParameter(jsonString, "requestJson");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        super("androidx.credentials.TYPE_DIGITAL_CREDENTIAL", requestData, candidateQueryData, false, allowedProviders);
        this.f16232e = jsonString;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        if (jsonString.length() != 0) {
            try {
                new JSONObject(jsonString);
                return;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
    }
}
