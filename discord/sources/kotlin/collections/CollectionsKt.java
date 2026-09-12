package kotlin.collections;

import com.discord.misc.utilities.chat_view_types.ChatViewRecyclerTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"kotlin/collections/c0", "kotlin/collections/d0", "kotlin/collections/e0", "kotlin/collections/f0", "kotlin/collections/g0", "kotlin/collections/h0", "kotlin/collections/i0", "kotlin/collections/j0", "kotlin/collections/k0", "kotlin/collections/CollectionsKt___CollectionsKt"}, d2 = {}, k = 4, mv = {2, 1, 0}, xi = ChatViewRecyclerTypes.MEDIA_ATTACHMENT_MOSAIC_IMAGE)
public final class CollectionsKt extends CollectionsKt___CollectionsKt {
    private CollectionsKt() {
    }

    public static co.q C(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new co.q(2, iterable);
    }

    public static double D(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i7 = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i7++;
            if (i7 < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        if (i7 == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i7);
    }

    public static boolean E(Iterable iterable, Object obj) {
        int iIndexOf;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i7 = 0;
            for (Object obj2 : iterable) {
                if (i7 < 0) {
                    d0.k();
                    throw null;
                }
                if (Intrinsics.areEqual(obj, obj2)) {
                    iIndexOf = i7;
                } else {
                    i7++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List F(int i7, List list) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return i0(list);
        }
        if (list != null) {
            int size = list.size() - i7;
            if (size <= 0) {
                return n0.f14659d;
            }
            if (size == 1) {
                return c0.c(P(list));
            }
            arrayList = new ArrayList(size);
            if (list != null) {
                if (list instanceof RandomAccess) {
                    int size2 = list.size();
                    while (i7 < size2) {
                        arrayList.add(list.get(i7));
                        i7++;
                    }
                } else {
                    ListIterator listIterator = list.listIterator(i7);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i10 = 0;
        for (Object obj : list) {
            if (i10 >= i7) {
                arrayList.add(obj);
            } else {
                i10++;
            }
        }
        return d0.j(arrayList);
    }

    public static List G(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return f0(list, size);
    }

    public static ArrayList H(Collection collection, Function1 predicate) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList I(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList destination = new ArrayList();
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Object obj : list) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static Object J(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return K((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object K(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object L(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object M(int i7, List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i7 < 0 || i7 >= list.size()) {
            return null;
        }
        return list.get(i7);
    }

    public static /* synthetic */ void N(Iterable iterable, StringBuilder sb2, String str, String str2, String str3, Function1 function1, int i7) {
        if ((i7 & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i7 & 4) != 0 ? "" : str2;
        String str6 = (i7 & 8) != 0 ? "" : str3;
        if ((i7 & 64) != 0) {
            function1 = null;
        }
        CollectionsKt___CollectionsKt.z(iterable, sb2, str4, str5, str6, function1);
    }

    public static String O(Iterable iterable, String str, String str2, String str3, Function1 function1, int i7) {
        if ((i7 & 1) != 0) {
            str = ", ";
        }
        String separator = str;
        String prefix = (i7 & 2) != 0 ? "" : str2;
        String postfix = (i7 & 4) != 0 ? "" : str3;
        if ((i7 & 32) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb2 = new StringBuilder();
        CollectionsKt___CollectionsKt.z(iterable, sb2, separator, prefix, postfix, function1);
        return sb2.toString();
    }

    public static Object P(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return Q((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object Q(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(d0.f(list));
    }

    public static Object R(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return kk.b.f(1, list);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object S(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return kk.b.f(1, list);
    }

    public static ArrayList T(Iterable iterable, Iterable elements) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return V((Collection) iterable, elements);
        }
        ArrayList arrayList = new ArrayList();
        i0.o(arrayList, iterable);
        i0.o(arrayList, elements);
        return arrayList;
    }

    public static ArrayList U(Iterable iterable, Object obj) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return W((Collection) iterable, obj);
        }
        ArrayList arrayList = new ArrayList();
        i0.o(arrayList, iterable);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList V(Collection collection, Iterable elements) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            i0.o(arrayList, elements);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList W(Collection collection, Object obj) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List X(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list != null && list.size() <= 1) {
            return i0(list);
        }
        List listB = CollectionsKt___CollectionsKt.B(list);
        Intrinsics.checkNotNullParameter(listB, "<this>");
        Collections.reverse(listB);
        return listB;
    }

    public static Object Y(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return Z((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object Z(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object a0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object b0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List c0(List list, IntRange indices) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? n0.f14659d : i0(list.subList(indices.f14688d, indices.f14689e + 1));
    }

    public static List d0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list == null) {
            List listB = CollectionsKt___CollectionsKt.B(list);
            Intrinsics.checkNotNullParameter(listB, "<this>");
            if (((ArrayList) listB).size() > 1) {
                Collections.sort(listB);
            }
            return listB;
        }
        if (list.size() <= 1) {
            return i0(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        Intrinsics.checkNotNullParameter(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return w.b(array);
    }

    public static List e0(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List listB = CollectionsKt___CollectionsKt.B(iterable);
            h0.n(listB, comparator);
            return listB;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return i0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        w.n(array, comparator);
        return w.b(array);
    }

    public static List f0(Iterable iterable, int i7) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (i7 < 0) {
            throw new IllegalArgumentException(s0.g.d(i7, "Requested element count ", " is less than zero.").toString());
        }
        if (i7 == 0) {
            return n0.f14659d;
        }
        if (iterable instanceof Collection) {
            if (i7 >= ((Collection) iterable).size()) {
                return i0(iterable);
            }
            if (i7 == 1) {
                return c0.c(J(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i7);
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i10++;
            if (i10 == i7) {
                break;
            }
        }
        return d0.j(arrayList);
    }

    public static HashSet g0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet(v0.a(e0.l(iterable, 12)));
        CollectionsKt___CollectionsKt.A(iterable, hashSet);
        return hashSet;
    }

    public static int[] h0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        int[] iArr = new int[arrayList.size()];
        Iterator it = arrayList.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            iArr[i7] = ((Number) it.next()).intValue();
            i7++;
        }
        return iArr;
    }

    public static List i0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return d0.j(CollectionsKt___CollectionsKt.B(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return n0.f14659d;
        }
        if (size != 1) {
            return j0(collection);
        }
        return c0.c(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList j0(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    public static LinkedHashSet k0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        CollectionsKt___CollectionsKt.A(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set l0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            CollectionsKt___CollectionsKt.A(iterable, linkedHashSet);
            Intrinsics.checkNotNullParameter(linkedHashSet, "<this>");
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : d1.b(linkedHashSet.iterator().next());
            }
            return p0.f14661d;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return p0.f14661d;
        }
        if (size2 == 1) {
            return d1.b(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(v0.a(collection.size()));
        CollectionsKt___CollectionsKt.A(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static x m0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new x(new i6.a(5, list));
    }

    public static ArrayList n0(List list, List other) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        Iterator it = list.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(e0.l(list, 10), e0.l(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new Pair(it.next(), it2.next()));
        }
        return arrayList;
    }
}
