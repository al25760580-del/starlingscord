package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes3.dex */
public class i0 extends h0 {
    public static void o(Collection collection, Iterable elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void p(Collection collection, Sequence elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static boolean q(Collection collection, Object[] elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return collection.addAll(w.b(elements));
    }

    public static final boolean r(Iterable iterable, Function1 function1, boolean z5) {
        Iterator it = iterable.iterator();
        boolean z6 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z5) {
                it.remove();
                z6 = true;
            }
        }
        return z6;
    }

    public static void s(List list, Function1 predicate) {
        int iF;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            r(TypeIntrinsics.asMutableIterable(list), predicate, true);
            return;
        }
        int iF2 = d0.f(list);
        int i7 = 0;
        if (iF2 >= 0) {
            int i10 = 0;
            while (true) {
                Object obj = list.get(i7);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i10 != i7) {
                        list.set(i10, obj);
                    }
                    i10++;
                }
                if (i7 == iF2) {
                    break;
                } else {
                    i7++;
                }
            }
            i7 = i10;
        }
        if (i7 >= list.size() || i7 > (iF = d0.f(list))) {
            return;
        }
        while (true) {
            list.remove(iF);
            if (iF == i7) {
                return;
            } else {
                iF--;
            }
        }
    }

    public static Object t(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object u(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return arrayList.remove(d0.f(arrayList));
    }
}
