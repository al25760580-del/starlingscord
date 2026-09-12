package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public class d0 extends c0 {
    public static IntRange e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new IntRange(0, collection.size() - 1, 1);
    }

    public static int f(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    public static List g(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length > 0 ? w.b(elements) : n0.f14659d;
    }

    public static List h(Object obj) {
        return obj != null ? c0.c(obj) : n0.f14659d;
    }

    public static ArrayList i(Object... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? new ArrayList() : new ArrayList(new r(elements, true));
    }

    public static final List j(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : c0.c(list.get(0));
        }
        return n0.f14659d;
    }

    public static void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
