package cg;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ig.g f3650d;

    public c() {
        this.f3650d = null;
    }

    public void a(Exception exc) {
        ig.g gVar = this.f3650d;
        if (gVar != null) {
            gVar.c(exc);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            b();
        } catch (Exception e10) {
            a(e10);
        }
    }

    public c(ig.g gVar) {
        this.f3650d = gVar;
    }
}
