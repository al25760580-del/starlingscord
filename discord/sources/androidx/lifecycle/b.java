package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f2331a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2332b;

    public b(HashMap map) {
        this.f2332b = map;
        for (Map.Entry entry : map.entrySet()) {
            n nVar = (n) entry.getValue();
            List arrayList = (List) this.f2331a.get(nVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2331a.put(nVar, arrayList);
            }
            arrayList.add((c) entry.getKey());
        }
    }

    public static void a(List list, LifecycleOwner lifecycleOwner, n nVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                c cVar = (c) list.get(size);
                Method method = cVar.f2335b;
                try {
                    int i7 = cVar.f2334a;
                    if (i7 == 0) {
                        method.invoke(obj, null);
                    } else if (i7 == 1) {
                        method.invoke(obj, lifecycleOwner);
                    } else if (i7 == 2) {
                        method.invoke(obj, lifecycleOwner, nVar);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
