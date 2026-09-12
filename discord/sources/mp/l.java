package mp;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f15989a = new d(g.f15977e, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f15990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d f15991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashMap f15992d;

    static {
        g gVar = g.f15978i;
        f15990b = new d(gVar, false);
        f15991c = new d(gVar, true);
        String strI = np.f.i("Object");
        String strH = np.f.h("Predicate");
        String strH2 = np.f.h("Function");
        String strH3 = np.f.h("Consumer");
        String strH4 = np.f.h("BiFunction");
        String strH5 = np.f.h("BiConsumer");
        String strH6 = np.f.h("UnaryOperator");
        String strJ = np.f.j("stream/Stream");
        String strJ2 = np.f.j("Optional");
        q qVar = new q(0);
        new e4.r(qVar, np.f.j("Iterator")).D("forEachRemaining", null, new i(strH3, 0));
        new e4.r(qVar, np.f.i("Iterable")).D("spliterator", null, new n(4));
        e4.r rVar = new e4.r(qVar, np.f.j("Collection"));
        rVar.D("removeIf", null, new i(strH, 17));
        rVar.D("stream", null, new i(strJ, 26));
        rVar.D("parallelStream", null, new k(strJ, 1));
        e4.r rVar2 = new e4.r(qVar, np.f.j("List"));
        rVar2.D("replaceAll", null, new k(strH6, 2));
        rVar2.D("addFirst", "2.1", new k(strI, 3));
        rVar2.D("addLast", "2.1", new k(strI, 4));
        rVar2.D("removeFirst", "2.1", new k(strI, 5));
        rVar2.D("removeLast", "2.1", new k(strI, 6));
        e4.r rVar3 = new e4.r(qVar, np.f.j("LinkedList"));
        rVar3.D("addFirst", "2.1", new i(strI, 1));
        rVar3.D("addLast", "2.1", new i(strI, 2));
        rVar3.D("removeFirst", "2.1", new i(strI, 3));
        rVar3.D("removeLast", "2.1", new i(strI, 4));
        e4.r rVar4 = new e4.r(qVar, np.f.j("LinkedHashSet"));
        rVar4.D("addFirst", "2.2", new i(strI, 5));
        rVar4.D("addLast", "2.2", new i(strI, 6));
        rVar4.D("removeFirst", "2.2", new i(strI, 7));
        rVar4.D("removeLast", "2.2", new i(strI, 8));
        rVar4.D("getFirst", "2.2", new i(strI, 9));
        rVar4.D("getLast", "2.2", new i(strI, 10));
        e4.r rVar5 = new e4.r(qVar, np.f.j("Map"));
        rVar5.D("forEach", null, new i(strH5, 11));
        rVar5.D("putIfAbsent", null, new i(strI, 12));
        rVar5.D("replace", null, new i(strI, 13));
        rVar5.D("replace", null, new i(strI, 14));
        rVar5.D("replaceAll", null, new i(strH4, 15));
        rVar5.D("compute", null, new j(0, strI, strH4));
        rVar5.D("computeIfAbsent", null, new j(1, strI, strH2));
        rVar5.D("computeIfPresent", null, new j(2, strI, strH4));
        rVar5.D("merge", null, new j(3, strI, strH4));
        e4.r rVar6 = new e4.r(qVar, np.f.j("LinkedHashMap"));
        rVar6.D("putFirst", "2.2", new i(strI, 16));
        rVar6.D("putLast", "2.2", new i(strI, 18));
        e4.r rVar7 = new e4.r(qVar, strJ2);
        rVar7.D("empty", null, new i(strJ2, 19));
        rVar7.D("of", null, new j(4, strI, strJ2));
        rVar7.D("ofNullable", null, new j(5, strI, strJ2));
        rVar7.D("get", null, new i(strI, 20));
        rVar7.D("ifPresent", null, new i(strH3, 21));
        new e4.r(qVar, np.f.i("ref/Reference")).D("get", null, new i(strI, 22));
        new e4.r(qVar, strH).D("test", null, new i(strI, 23));
        new e4.r(qVar, np.f.h("BiPredicate")).D("test", null, new i(strI, 24));
        new e4.r(qVar, strH3).D("accept", null, new i(strI, 25));
        new e4.r(qVar, strH5).D("accept", null, new i(strI, 27));
        new e4.r(qVar, strH2).D("apply", null, new i(strI, 28));
        new e4.r(qVar, strH4).D("apply", null, new i(strI, 29));
        new e4.r(qVar, np.f.h("Supplier")).D("get", null, new k(strI, 0));
        f15992d = qVar.f16005a;
    }
}
