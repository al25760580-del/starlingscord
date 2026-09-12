package fc;

import android.util.SparseArray;
import java.util.HashMap;
import kk.b;
import sb.d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f9052a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f9053b;

    static {
        HashMap map = new HashMap();
        f9053b = map;
        map.put(d.f19823d, 0);
        map.put(d.f19824e, 1);
        map.put(d.f19825i, 2);
        for (d dVar : map.keySet()) {
            f9052a.append(((Integer) f9053b.get(dVar)).intValue(), dVar);
        }
    }

    public static int a(d dVar) {
        Integer num = (Integer) f9053b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i7) {
        d dVar = (d) f9052a.get(i7);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException(b.h(i7, "Unknown Priority for value "));
    }
}
