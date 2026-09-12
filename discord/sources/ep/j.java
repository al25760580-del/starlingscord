package ep;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f8557a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f8558b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f8557a = linkedHashMap;
        b(up.h.f21297t, a("java.util.ArrayList", "java.util.LinkedList"));
        b(up.h.f21298u, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(up.h.f21299v, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        up.c topLevelFqName = new up.c("java.util.function.Function");
        Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
        b(new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()), a("java.util.function.UnaryOperator"));
        up.c topLevelFqName2 = new up.c("java.util.function.BiFunction");
        Intrinsics.checkNotNullParameter(topLevelFqName2, "topLevelFqName");
        b(new up.b(topLevelFqName2.b(), topLevelFqName2.f21262a.f()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(((up.b) entry.getKey()).a(), ((up.b) entry.getValue()).a()));
        }
        f8558b = w0.l(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            up.c topLevelFqName = new up.c(str);
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            arrayList.add(new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()));
        }
        return arrayList;
    }

    public static void b(up.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            f8557a.put(obj, bVar);
        }
    }
}
