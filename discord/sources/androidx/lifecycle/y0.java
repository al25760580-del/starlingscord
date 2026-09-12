package androidx.lifecycle;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2.a f2410a = new u2.a();

    public final void a() {
        u2.a aVar = this.f2410a;
        if (aVar != null && !aVar.f20925d) {
            aVar.f20925d = true;
            synchronized (aVar.f20922a) {
                try {
                    Iterator it = aVar.f20923b.values().iterator();
                    while (it.hasNext()) {
                        u2.a.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = aVar.f20924c.iterator();
                    while (it2.hasNext()) {
                        u2.a.a((AutoCloseable) it2.next());
                    }
                    aVar.f20924c.clear();
                    Unit unit = Unit.f14616a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        b();
    }

    public void b() {
    }
}
