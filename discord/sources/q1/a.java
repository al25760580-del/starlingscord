package q1;

import kotlin.jvm.internal.Intrinsics;
import o1.d;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f18577i = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f18578v = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.a f18579e;

    /* JADX WARN: Illegal instructions before constructor call */
    public a(p1.a domError, String str) {
        Intrinsics.checkNotNullParameter(domError, "domError");
        String type = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(domError.f17765a);
        Intrinsics.checkNotNullParameter(type, "type");
        super(str, type);
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
        this.f18579e = domError;
    }
}
