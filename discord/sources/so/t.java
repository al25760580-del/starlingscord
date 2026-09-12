package so;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import lq.b1;
import lq.z;
import vo.e0;
import yo.b0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f20420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f20421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashMap f20422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LinkedHashSet f20423d;

    static {
        s[] sVarArrValues = s.values();
        ArrayList arrayList = new ArrayList(sVarArrValues.length);
        for (s sVar : sVarArrValues) {
            arrayList.add(sVar.f20418e);
        }
        f20420a = CollectionsKt.l0(arrayList);
        r[] rVarArrValues = r.values();
        ArrayList arrayList2 = new ArrayList(rVarArrValues.length);
        for (r rVar : rVarArrValues) {
            arrayList2.add(rVar.f20415d);
        }
        CollectionsKt.l0(arrayList2);
        f20421b = new HashMap();
        f20422c = new HashMap();
        w0.f(new Pair(r.UBYTEARRAY, up.e.e("ubyteArrayOf")), new Pair(r.USHORTARRAY, up.e.e("ushortArrayOf")), new Pair(r.UINTARRAY, up.e.e("uintArrayOf")), new Pair(r.ULONGARRAY, up.e.e("ulongArrayOf")));
        s[] sVarArrValues2 = s.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (s sVar2 : sVarArrValues2) {
            linkedHashSet.add(sVar2.f20419i.f());
        }
        f20423d = linkedHashSet;
        for (s sVar3 : s.values()) {
            HashMap map = f20421b;
            up.b bVar = sVar3.f20419i;
            up.b bVar2 = sVar3.f20417d;
            map.put(bVar, bVar2);
            f20422c.put(bVar2, sVar3.f20419i);
        }
    }

    public static final boolean a(z type) {
        vo.i descriptor;
        Intrinsics.checkNotNullParameter(type, "type");
        if (b1.l(type) || (descriptor = type.r0().g()) == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        vo.l lVarG = descriptor.g();
        return (lVarG instanceof e0) && Intrinsics.areEqual(((b0) ((e0) lVarG)).f23420x, p.f20402l) && f20420a.contains(descriptor.getName());
    }
}
