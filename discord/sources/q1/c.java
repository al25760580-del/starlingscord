package q1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c extends Exception {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f18584d = 0;

    public c(String str) {
        this("androidx.credentials.SignalCredentialStateException.TYPE_PROVIDER_CONFIGURATION", str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String type, String str) {
        super(str != null ? str.toString() : null);
        Intrinsics.checkNotNullParameter(type, "type");
    }
}
