package ep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f1;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ArrayList f8559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f8560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f8561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f8562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f8563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f8564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f0 f8565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f8566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final LinkedHashMap f8567i;
    public static final HashSet j;
    public static final LinkedHashMap k;

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v52, types: [java.lang.Object, java.util.Map] */
    static {
        String[] elements = {"containsAll", "removeAll", "retainAll"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set<String> setJ = kotlin.collections.y.J(elements);
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(setJ, 10));
        for (String str : setJ) {
            String strC = cq.c.BOOLEAN.c();
            Intrinsics.checkNotNullExpressionValue(strC, "getDesc(...)");
            arrayList.add(m.a("java/util/Collection", str, "Ljava/util/Collection;", strC));
        }
        f8559a = arrayList;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((f0) it.next()).f8545e);
        }
        f8560b = arrayList2;
        ArrayList arrayList3 = f8559a;
        ArrayList arrayList4 = new ArrayList(kotlin.collections.e0.l(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((f0) it2.next()).f8542b.b());
        }
        String strJ = np.f.j("Collection");
        cq.c cVar = cq.c.BOOLEAN;
        String strC2 = cVar.c();
        Intrinsics.checkNotNullExpressionValue(strC2, "getDesc(...)");
        f0 f0VarA = m.a(strJ, "contains", "Ljava/lang/Object;", strC2);
        i0 i0Var = i0.f8553v;
        Pair pair = new Pair(f0VarA, i0Var);
        String strJ2 = np.f.j("Collection");
        String strC3 = cVar.c();
        Intrinsics.checkNotNullExpressionValue(strC3, "getDesc(...)");
        Pair pair2 = new Pair(m.a(strJ2, "remove", "Ljava/lang/Object;", strC3), i0Var);
        String strJ3 = np.f.j("Map");
        String strC4 = cVar.c();
        Intrinsics.checkNotNullExpressionValue(strC4, "getDesc(...)");
        Pair pair3 = new Pair(m.a(strJ3, "containsKey", "Ljava/lang/Object;", strC4), i0Var);
        String strJ4 = np.f.j("Map");
        String strC5 = cVar.c();
        Intrinsics.checkNotNullExpressionValue(strC5, "getDesc(...)");
        Pair pair4 = new Pair(m.a(strJ4, "containsValue", "Ljava/lang/Object;", strC5), i0Var);
        String strJ5 = np.f.j("Map");
        String strC6 = cVar.c();
        Intrinsics.checkNotNullExpressionValue(strC6, "getDesc(...)");
        Pair pair5 = new Pair(m.a(strJ5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strC6), i0Var);
        Pair pair6 = new Pair(m.a(np.f.j("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), i0.f8554w);
        f0 f0VarA2 = m.a(np.f.j("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        i0 i0Var2 = i0.f8551e;
        Pair pair7 = new Pair(f0VarA2, i0Var2);
        Pair pair8 = new Pair(m.a(np.f.j("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), i0Var2);
        String strJ6 = np.f.j("List");
        cq.c cVar2 = cq.c.INT;
        String strC7 = cVar2.c();
        Intrinsics.checkNotNullExpressionValue(strC7, "getDesc(...)");
        f0 f0VarA3 = m.a(strJ6, "indexOf", "Ljava/lang/Object;", strC7);
        i0 i0Var3 = i0.f8552i;
        Pair pair9 = new Pair(f0VarA3, i0Var3);
        String strJ7 = np.f.j("List");
        String strC8 = cVar2.c();
        Intrinsics.checkNotNullExpressionValue(strC8, "getDesc(...)");
        Map mapG = w0.g(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(m.a(strJ7, "lastIndexOf", "Ljava/lang/Object;", strC8), i0Var3));
        f8561c = mapG;
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.a(mapG.size()));
        for (Map.Entry entry : mapG.entrySet()) {
            linkedHashMap.put(((f0) entry.getKey()).f8545e, entry.getValue());
        }
        f8562d = linkedHashMap;
        LinkedHashSet linkedHashSetD = f1.d(f8561c.keySet(), f8559a);
        ArrayList arrayList5 = new ArrayList(kotlin.collections.e0.l(linkedHashSetD, 10));
        Iterator it3 = linkedHashSetD.iterator();
        while (it3.hasNext()) {
            arrayList5.add(((f0) it3.next()).f8542b);
        }
        f8563e = CollectionsKt.l0(arrayList5);
        ArrayList arrayList6 = new ArrayList(kotlin.collections.e0.l(linkedHashSetD, 10));
        Iterator it4 = linkedHashSetD.iterator();
        while (it4.hasNext()) {
            arrayList6.add(((f0) it4.next()).f8545e);
        }
        f8564f = CollectionsKt.l0(arrayList6);
        cq.c cVar3 = cq.c.INT;
        String strC9 = cVar3.c();
        Intrinsics.checkNotNullExpressionValue(strC9, "getDesc(...)");
        f0 f0VarA4 = m.a("java/util/List", "removeAt", strC9, "Ljava/lang/Object;");
        f8565g = f0VarA4;
        String strI = np.f.i("Number");
        String strC10 = cq.c.BYTE.c();
        Intrinsics.checkNotNullExpressionValue(strC10, "getDesc(...)");
        Pair pair10 = new Pair(m.a(strI, "toByte", "", strC10), up.e.e("byteValue"));
        String strI2 = np.f.i("Number");
        String strC11 = cq.c.SHORT.c();
        Intrinsics.checkNotNullExpressionValue(strC11, "getDesc(...)");
        Pair pair11 = new Pair(m.a(strI2, "toShort", "", strC11), up.e.e("shortValue"));
        String strI3 = np.f.i("Number");
        String strC12 = cVar3.c();
        Intrinsics.checkNotNullExpressionValue(strC12, "getDesc(...)");
        Pair pair12 = new Pair(m.a(strI3, "toInt", "", strC12), up.e.e("intValue"));
        String strI4 = np.f.i("Number");
        String strC13 = cq.c.LONG.c();
        Intrinsics.checkNotNullExpressionValue(strC13, "getDesc(...)");
        Pair pair13 = new Pair(m.a(strI4, "toLong", "", strC13), up.e.e("longValue"));
        String strI5 = np.f.i("Number");
        String strC14 = cq.c.FLOAT.c();
        Intrinsics.checkNotNullExpressionValue(strC14, "getDesc(...)");
        Pair pair14 = new Pair(m.a(strI5, "toFloat", "", strC14), up.e.e("floatValue"));
        String strI6 = np.f.i("Number");
        String strC15 = cq.c.DOUBLE.c();
        Intrinsics.checkNotNullExpressionValue(strC15, "getDesc(...)");
        Pair pair15 = new Pair(m.a(strI6, "toDouble", "", strC15), up.e.e("doubleValue"));
        Pair pair16 = new Pair(f0VarA4, up.e.e("remove"));
        String strI7 = np.f.i("CharSequence");
        String strC16 = cVar3.c();
        Intrinsics.checkNotNullExpressionValue(strC16, "getDesc(...)");
        String strC17 = cq.c.CHAR.c();
        Intrinsics.checkNotNullExpressionValue(strC17, "getDesc(...)");
        Map mapG2 = w0.g(pair10, pair11, pair12, pair13, pair14, pair15, pair16, new Pair(m.a(strI7, "get", strC16, strC17), up.e.e("charAt")), new Pair(m.a(np.f.k("AtomicInteger"), "load", "", "I"), up.e.e("get")), new Pair(m.a(np.f.k("AtomicInteger"), "store", "I", "V"), up.e.e("set")), new Pair(m.a(np.f.k("AtomicInteger"), "exchange", "I", "I"), up.e.e("getAndSet")), new Pair(m.a(np.f.k("AtomicInteger"), "fetchAndAdd", "I", "I"), up.e.e("getAndAdd")), new Pair(m.a(np.f.k("AtomicInteger"), "addAndFetch", "I", "I"), up.e.e("addAndGet")), new Pair(m.a(np.f.k("AtomicLong"), "load", "", "J"), up.e.e("get")), new Pair(m.a(np.f.k("AtomicLong"), "store", "J", "V"), up.e.e("set")), new Pair(m.a(np.f.k("AtomicLong"), "exchange", "J", "J"), up.e.e("getAndSet")), new Pair(m.a(np.f.k("AtomicLong"), "fetchAndAdd", "J", "J"), up.e.e("getAndAdd")), new Pair(m.a(np.f.k("AtomicLong"), "addAndFetch", "J", "J"), up.e.e("addAndGet")), new Pair(m.a(np.f.k("AtomicBoolean"), "load", "", "Z"), up.e.e("get")), new Pair(m.a(np.f.k("AtomicBoolean"), "store", "Z", "V"), up.e.e("set")), new Pair(m.a(np.f.k("AtomicBoolean"), "exchange", "Z", "Z"), up.e.e("getAndSet")), new Pair(m.a(np.f.k("AtomicReference"), "load", "", "Ljava/lang/Object;"), up.e.e("get")), new Pair(m.a(np.f.k("AtomicReference"), "store", "Ljava/lang/Object;", "V"), up.e.e("set")), new Pair(m.a(np.f.k("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), up.e.e("getAndSet")), new Pair(m.a(np.f.k("AtomicIntegerArray"), "loadAt", "I", "I"), up.e.e("get")), new Pair(m.a(np.f.k("AtomicIntegerArray"), "storeAt", "II", "V"), up.e.e("set")), new Pair(m.a(np.f.k("AtomicIntegerArray"), "exchangeAt", "II", "I"), up.e.e("getAndSet")), new Pair(m.a(np.f.k("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), up.e.e("compareAndSet")), new Pair(m.a(np.f.k("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), up.e.e("getAndAdd")), new Pair(m.a(np.f.k("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), up.e.e("addAndGet")), new Pair(m.a(np.f.k("AtomicLongArray"), "loadAt", "I", "J"), up.e.e("get")), new Pair(m.a(np.f.k("AtomicLongArray"), "storeAt", "IJ", "V"), up.e.e("set")), new Pair(m.a(np.f.k("AtomicLongArray"), "exchangeAt", "IJ", "J"), up.e.e("getAndSet")), new Pair(m.a(np.f.k("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), up.e.e("compareAndSet")), new Pair(m.a(np.f.k("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), up.e.e("getAndAdd")), new Pair(m.a(np.f.k("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), up.e.e("addAndGet")), new Pair(m.a(np.f.k("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), up.e.e("get")), new Pair(m.a(np.f.k("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), up.e.e("set")), new Pair(m.a(np.f.k("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), up.e.e("getAndSet")), new Pair(m.a(np.f.k("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), up.e.e("compareAndSet")));
        f8566h = mapG2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.a(mapG2.size()));
        for (Map.Entry entry2 : mapG2.entrySet()) {
            linkedHashMap2.put(((f0) entry2.getKey()).f8545e, entry2.getValue());
        }
        f8567i = linkedHashMap2;
        ?? r5 = f8566h;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r5.entrySet()) {
            f0 f0Var = (f0) entry3.getKey();
            up.e name = (up.e) entry3.getValue();
            String internalName = f0Var.f8541a;
            String parameters = f0Var.f8543c;
            String returnType = f0Var.f8544d;
            Intrinsics.checkNotNullParameter(internalName, "classInternalName");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            Intrinsics.checkNotNullParameter(internalName, "classInternalName");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Intrinsics.checkNotNullParameter(returnType, "returnType");
            String jvmDescriptor = name + '(' + parameters + ')' + returnType;
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
            linkedHashSet.add(internalName + '.' + jvmDescriptor);
        }
        Set setKeySet = f8566h.keySet();
        HashSet hashSet = new HashSet();
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            hashSet.add(((f0) it5.next()).f8542b);
        }
        j = hashSet;
        Set<Map.Entry> setEntrySet = f8566h.entrySet();
        ArrayList<Pair> arrayList7 = new ArrayList(kotlin.collections.e0.l(setEntrySet, 10));
        for (Map.Entry entry4 : setEntrySet) {
            arrayList7.add(new Pair(((f0) entry4.getKey()).f8542b, entry4.getValue()));
        }
        int iA = v0.a(kotlin.collections.e0.l(arrayList7, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iA);
        for (Pair pair17 : arrayList7) {
            linkedHashMap3.put((up.e) pair17.f14613e, (up.e) pair17.f14612d);
        }
        k = linkedHashMap3;
    }
}
