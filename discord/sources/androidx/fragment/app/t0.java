package androidx.fragment.app;

import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SimpleArrayMap f2253b = new SimpleArrayMap(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f2254a;

    public t0(FragmentManager fragmentManager) {
        this.f2254a = fragmentManager;
    }

    public static Class a(ClassLoader classLoader, String str) throws ClassNotFoundException {
        SimpleArrayMap simpleArrayMap = f2253b;
        SimpleArrayMap simpleArrayMap2 = (SimpleArrayMap) simpleArrayMap.get(classLoader);
        if (simpleArrayMap2 == null) {
            simpleArrayMap2 = new SimpleArrayMap(0);
            simpleArrayMap.put(classLoader, simpleArrayMap2);
        }
        Class cls = (Class) simpleArrayMap2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        simpleArrayMap2.put(str, cls2);
        return cls2;
    }

    public static Class b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e10) {
            throw new androidx.datastore.preferences.protobuf.d1(s0.g.e("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new androidx.datastore.preferences.protobuf.d1(s0.g.e("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }
}
