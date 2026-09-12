package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public class j0 extends i0 {
    public static final int v(int i7, List list) {
        if (i7 >= 0 && i7 <= d0.f(list)) {
            return d0.f(list) - i7;
        }
        StringBuilder sbS = a3.e.s(i7, "Element index ", " must be in range [");
        sbS.append(new IntRange(0, d0.f(list), 1));
        sbS.append("].");
        throw new IndexOutOfBoundsException(sbS.toString());
    }

    public static final int w(int i7, List list) {
        if (i7 >= 0 && i7 <= list.size()) {
            return list.size() - i7;
        }
        StringBuilder sbS = a3.e.s(i7, "Position index ", " must be in range [");
        sbS.append(new IntRange(0, list.size(), 1));
        sbS.append("].");
        throw new IndexOutOfBoundsException(sbS.toString());
    }

    public static a1 x(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new a1(list);
    }

    public static y0 y(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new y0(list);
    }
}
