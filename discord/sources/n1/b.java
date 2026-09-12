package n1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f16214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f16215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.internal.debugmeta.c f16216c;

    public b(Bundle credentialData, Bundle candidateQueryData, io.sentry.internal.debugmeta.c displayInfo) {
        Intrinsics.checkNotNullParameter("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", "type");
        Intrinsics.checkNotNullParameter(credentialData, "credentialData");
        Intrinsics.checkNotNullParameter(candidateQueryData, "candidateQueryData");
        Intrinsics.checkNotNullParameter(displayInfo, "displayInfo");
        this.f16214a = credentialData;
        this.f16215b = candidateQueryData;
        this.f16216c = displayInfo;
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
        credentialData.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        candidateQueryData.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false);
    }
}
