package ei;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public class i extends d implements SortedMap {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public SortedSet f8311w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ n0 f8312x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n0 n0Var, SortedMap sortedMap) {
        super(n0Var, sortedMap);
        this.f8312x = n0Var;
    }

    public SortedSet b() {
        return new j(this.f8312x, d());
    }

    @Override // ei.d, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f8311w;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetB = b();
        this.f8311w = sortedSetB;
        return sortedSetB;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f8295i;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new i(this.f8312x, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new i(this.f8312x, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new i(this.f8312x, d().tailMap(obj));
    }
}
