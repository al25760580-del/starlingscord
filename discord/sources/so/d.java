package so;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f20333a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashSet f20334b;

    static {
        Set<k> set = k.f20349w;
        ArrayList arrayList = new ArrayList(e0.l(set, 10));
        for (k primitiveType : set) {
            Intrinsics.checkNotNullParameter(primitiveType, "primitiveType");
            arrayList.add(p.f20402l.a(primitiveType.f20352d));
        }
        ArrayList<up.c> arrayListW = CollectionsKt.W(CollectionsKt.W(CollectionsKt.W(arrayList, o.f20372f.g()), o.f20376h.g()), o.j.g());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (up.c topLevelFqName : arrayListW) {
            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
            linkedHashSet.add(new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f()));
        }
        f20334b = linkedHashSet;
    }
}
