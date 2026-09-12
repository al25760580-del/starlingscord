package sq;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.d0;
import kotlin.collections.e0;
import kotlin.jvm.internal.markers.KMappedMarker;
import lq.l0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements Iterable, KMappedMarker {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f20499d;

    public static String a(a aVar, int i7, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i7 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder("Type: ");
        sb3.append(aVar.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) l0.f15225e.f8034e;
        sb4.append("[\n");
        ArrayList arrayList = new ArrayList(e0.l(aVar, 10));
        int i10 = 0;
        for (Object obj : aVar) {
            int i11 = i10 + 1;
            Object obj2 = null;
            if (i10 < 0) {
                d0.k();
                throw null;
            }
            for (Object obj3 : concurrentHashMap.entrySet()) {
                if (((Number) ((Map.Entry) obj3).getValue()).intValue() == i10) {
                    obj2 = obj3;
                    break;
                }
            }
            sb4.append("  " + ((Map.Entry) obj2) + '[' + i10 + "]: " + obj);
            sb4.append('\n');
            arrayList.add(sb4);
            i10 = i11;
        }
        sb2.append("Content: " + s0.g.g(sb4, "]", '\n'));
        sb2.append('\n');
        return sb2.toString();
    }

    public final boolean isEmpty() {
        return this.f20499d.a() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f20499d.iterator();
    }
}
