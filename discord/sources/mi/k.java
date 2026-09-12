package mi;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements ui.b, ui.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayDeque f15824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ni.i f15825c;

    public k() {
        ni.i iVar = ni.i.f16951d;
        this.f15823a = new HashMap();
        this.f15824b = new ArrayDeque();
        this.f15825c = iVar;
    }

    public final void a(com.facebook.react.a aVar) {
        ni.i iVar = this.f15825c;
        synchronized (this) {
            try {
                iVar.getClass();
                if (!this.f15823a.containsKey(m3.m.class)) {
                    this.f15823a.put(m3.m.class, new ConcurrentHashMap());
                }
                ((ConcurrentHashMap) this.f15823a.get(m3.m.class)).put(aVar, iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
