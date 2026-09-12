package zp;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m f24070d = new m();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        lq.z it = (lq.z) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        return it.toString();
    }
}
