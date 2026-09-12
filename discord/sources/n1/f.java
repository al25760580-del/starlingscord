package n1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class f extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16219b;

    public f(String jsonString, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.f16219b = jsonString;
        Intrinsics.checkNotNullParameter(jsonString, "jsonString");
        boolean z5 = false;
        if (jsonString.length() != 0) {
            try {
                new JSONObject(jsonString);
                z5 = true;
            } catch (Exception unused) {
            }
        }
        if (!z5) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
