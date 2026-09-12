package c5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3499d;

    public i(byte[] bArr, Map map, List list, boolean z5) {
        this.f3496a = bArr;
        this.f3497b = map;
        if (list == null) {
            this.f3498c = null;
        } else {
            this.f3498c = Collections.unmodifiableList(list);
        }
        this.f3499d = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public i(byte[] bArr, boolean z5, List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                g gVar = (g) it.next();
                treeMap.put(gVar.f3489a, gVar.f3490b);
            }
        }
        this(bArr, treeMap, list, z5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public i(byte[] bArr, Map map) {
        ?? arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new g((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(bArr, map, arrayList, false);
    }
}
