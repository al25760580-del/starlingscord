package kotlin.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class w0 extends v0 {
    public static o0 d() {
        o0 o0Var = o0.f14660d;
        Intrinsics.checkNotNull(o0Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return o0Var;
    }

    public static Object e(Map map, Object obj) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap f(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        HashMap map = new HashMap(v0.a(pairs.length));
        j(map, pairs);
        return map;
    }

    public static Map g(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        if (pairs.length <= 0) {
            return d();
        }
        LinkedHashMap destination = new LinkedHashMap(v0.a(pairs.length));
        Intrinsics.checkNotNullParameter(pairs, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        j(destination, pairs);
        return destination;
    }

    public static LinkedHashMap h(Pair... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.a(pairs.length));
        j(linkedHashMap, pairs);
        return linkedHashMap;
    }

    public static LinkedHashMap i(Map map, Map map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static final void j(HashMap map, Pair[] pairs) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair pair : pairs) {
            map.put(pair.f14612d, pair.f14613e);
        }
    }

    public static final void k(LinkedHashMap linkedHashMap, Iterable pairs) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.f14612d, pair.f14613e);
        }
    }

    public static Map l(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list == null) {
            LinkedHashMap destination = new LinkedHashMap();
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(destination, "destination");
            k(destination, list);
            Intrinsics.checkNotNullParameter(destination, "<this>");
            int size = destination.size();
            if (size != 0) {
                return size != 1 ? destination : v0.c(destination);
            }
            return d();
        }
        int size2 = list.size();
        if (size2 == 0) {
            return d();
        }
        if (size2 == 1) {
            return v0.b((Pair) (list != null ? list.get(0) : list.iterator().next()));
        }
        LinkedHashMap destination2 = new LinkedHashMap(v0.a(list.size()));
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(destination2, "destination");
        k(destination2, list);
        return destination2;
    }

    public static Map m(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? n(map) : v0.c(map);
        }
        return d();
    }

    public static LinkedHashMap n(Map map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }
}
