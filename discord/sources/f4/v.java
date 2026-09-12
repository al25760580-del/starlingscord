package f4;

/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f8865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e4.j f8866e;

    public v(w wVar, e4.j jVar) {
        this.f8865d = wVar;
        this.f8866e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f8865d.f8871d) {
            try {
                if (((v) this.f8865d.f8869b.remove(this.f8866e)) != null) {
                    u uVar = (u) this.f8865d.f8870c.remove(this.f8866e);
                    if (uVar != null) {
                        e4.j jVar = this.f8866e;
                        y3.g gVar = (y3.g) uVar;
                        v3.q.d().a(y3.g.L, "Exceeded time limits on execution for " + jVar);
                        gVar.E.execute(new y3.f(gVar, 0));
                    }
                } else {
                    v3.q.d().a("WrkTimerRunnable", "Timer with " + this.f8866e + " is already marked as complete.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
