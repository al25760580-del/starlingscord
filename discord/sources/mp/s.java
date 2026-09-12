package mp;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.v0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f16010a;

    public s(LinkedHashMap map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f16010a = map;
    }

    public final s a() {
        LinkedHashMap linkedHashMap = this.f16010a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(v0.a(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            d dVar = (d) entry.getValue();
            linkedHashMap2.put(key, new d(dVar.f15968a, dVar.f15969b, dVar.f15970c, true));
        }
        return new s(linkedHashMap2);
    }
}
