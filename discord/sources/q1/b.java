package q1;

import kotlin.jvm.internal.Intrinsics;
import o1.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends l {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f18580w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f18581x = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f18582i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p1.a f18583v;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(p1.a domError, String str) {
        Intrinsics.checkNotNullParameter(domError, "domError");
        String type = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(domError.f17765a);
        Intrinsics.checkNotNullParameter(type, "type");
        super(str, type);
        this.f18582i = type;
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
        this.f18583v = domError;
    }

    @Override // o1.l
    public final String a() {
        return this.f18582i;
    }
}
