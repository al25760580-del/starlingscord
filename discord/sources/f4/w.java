package f4;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f8867e = v3.q.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ph.c f8868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8869b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8870c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f8871d = new Object();

    public w(ph.c cVar) {
        this.f8868a = cVar;
    }

    public final void a(e4.j jVar) {
        synchronized (this.f8871d) {
            try {
                if (((v) this.f8869b.remove(jVar)) != null) {
                    v3.q.d().a(f8867e, "Stopping timer for " + jVar);
                    this.f8870c.remove(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
