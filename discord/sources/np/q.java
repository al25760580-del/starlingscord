package np;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f17018d = new q();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.length() > 1 ? kk.b.g(';', "L", it) : it;
    }
}
