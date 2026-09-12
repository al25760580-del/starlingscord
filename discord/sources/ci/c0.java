package ci;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ig.g f3683d;

    public c0() {
        this.f3683d = null;
    }

    public void a(Exception exc) {
        ig.g gVar = this.f3683d;
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

    public c0(ig.g gVar) {
        this.f3683d = gVar;
    }
}
