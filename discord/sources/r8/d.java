package r8;

import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final IdentityHashMap f19210d = new IdentityHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f19211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f19213c;

    public d(Object obj, c cVar, boolean z5) {
        obj.getClass();
        this.f19211a = obj;
        this.f19213c = cVar;
        this.f19212b = 1;
        if (z5) {
            IdentityHashMap identityHashMap = f19210d;
            synchronized (identityHashMap) {
                try {
                    Integer num = (Integer) identityHashMap.get(obj);
                    if (num == null) {
                        identityHashMap.put(obj, 1);
                    } else {
                        identityHashMap.put(obj, Integer.valueOf(num.intValue() + 1));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final synchronized Object a() {
        return this.f19211a;
    }
}
