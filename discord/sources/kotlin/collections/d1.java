package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class d1 {
    public static sn.n a(sn.n builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        sn.i iVar = builder.f20326d;
        iVar.b();
        return iVar.F > 0 ? builder : sn.n.f20325i;
    }

    public static Set b(Object obj) {
        Set setSingleton = Collections.singleton(obj);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }
}
