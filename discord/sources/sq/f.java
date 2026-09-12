package sq;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends bn.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f20500b = new f(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f20501c = new f(true);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String error) {
        super(false);
        Intrinsics.checkNotNullParameter(error, "error");
    }
}
