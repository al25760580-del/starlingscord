package kotlin.collections;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class c0 {
    public static sn.e a(sn.e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.i();
        builder.f20309i = true;
        return builder.f20308e > 0 ? builder : sn.e.f20306w;
    }

    public static sn.e b() {
        return new sn.e(0, 1, null);
    }

    public static List c(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static void d(int i7, Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i7 < array.length) {
            array[i7] = null;
        }
    }
}
