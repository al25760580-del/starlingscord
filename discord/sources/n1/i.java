package n1;

import android.os.Bundle;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f16223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f16224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f16225d;

    public i(String type, Bundle requestData, Bundle candidateQueryData, boolean z5, Set allowedProviders) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        this.f16222a = type;
        this.f16223b = requestData;
        this.f16224c = candidateQueryData;
        this.f16225d = allowedProviders;
        requestData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z5);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z5);
        requestData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
        candidateQueryData.putInt("androidx.credentials.BUNDLE_KEY_TYPE_PRIORITY_VALUE", 100);
    }
}
