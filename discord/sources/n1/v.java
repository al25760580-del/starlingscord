package n1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f16237b;

    public v(String type, String requestJson, Bundle requestData) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(requestJson, "requestJson");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        this.f16236a = type;
        this.f16237b = requestData;
    }
}
