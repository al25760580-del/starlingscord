package ep;

import com.facebook.react.devsupport.StackTraceHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.v0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f8537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f8538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f8539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f8540d;

    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, java.util.Map] */
    static {
        up.d dVar = so.o.j;
        up.e eVarE = up.e.e(StackTraceHelper.NAME_KEY);
        Intrinsics.checkNotNullExpressionValue(eVarE, "identifier(...)");
        Pair pair = new Pair(dVar.a(eVarE).g(), so.p.f20396d);
        up.e eVarE2 = up.e.e("ordinal");
        Intrinsics.checkNotNullExpressionValue(eVarE2, "identifier(...)");
        Pair pair2 = new Pair(dVar.a(eVarE2).g(), up.e.e("ordinal"));
        Pair pair3 = new Pair(e4.f.e("size", so.o.C), up.e.e("size"));
        up.c cVar = so.o.G;
        Pair pair4 = new Pair(e4.f.e("size", cVar), up.e.e("size"));
        up.d dVar2 = so.o.f20370e;
        up.e eVarE3 = up.e.e("length");
        Intrinsics.checkNotNullExpressionValue(eVarE3, "identifier(...)");
        Map mapG = w0.g(pair, pair2, pair3, pair4, new Pair(dVar2.a(eVarE3).g(), up.e.e("length")), new Pair(e4.f.e("keys", cVar), up.e.e("keySet")), new Pair(e4.f.e("values", cVar), up.e.e("values")), new Pair(e4.f.e("entries", cVar), up.e.e("entrySet")), new Pair(e4.f.e("size", so.o.a0), up.e.e("length")), new Pair(e4.f.e("size", so.o.f20365b0), up.e.e("length")), new Pair(e4.f.e("size", so.o.f20367c0), up.e.e("length")));
        f8537a = mapG;
        Set<Map.Entry> setEntrySet = mapG.entrySet();
        ArrayList<Pair> arrayList = new ArrayList(kotlin.collections.e0.l(setEntrySet, 10));
        for (Map.Entry entry : setEntrySet) {
            arrayList.add(new Pair(((up.c) entry.getKey()).f21262a.f(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair5 : arrayList) {
            up.e eVar = (up.e) pair5.f14613e;
            Object arrayList2 = linkedHashMap.get(eVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(eVar, arrayList2);
            }
            ((List) arrayList2).add((up.e) pair5.f14612d);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.a(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            Iterable iterable = (Iterable) entry2.getValue();
            Intrinsics.checkNotNullParameter(iterable, "<this>");
            linkedHashMap2.put(key, CollectionsKt.i0(CollectionsKt.k0(iterable)));
        }
        f8538b = linkedHashMap2;
        ?? r5 = f8537a;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry3 : r5.entrySet()) {
            String str = uo.d.f21197a;
            up.b bVarF = uo.d.f(((up.c) entry3.getKey()).b().f21262a);
            Intrinsics.checkNotNull(bVarF);
            linkedHashSet.add(bVarF.a().a((up.e) entry3.getValue()));
        }
        Set setKeySet = f8537a.keySet();
        f8539c = setKeySet;
        Set set = setKeySet;
        ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.l(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList3.add(((up.c) it.next()).f21262a.f());
        }
        f8540d = CollectionsKt.l0(arrayList3);
    }
}
