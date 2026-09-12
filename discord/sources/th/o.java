package th;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ig.g f20784d;

    public o() {
        this.f20784d = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            ig.g gVar = this.f20784d;
            if (gVar != null) {
                gVar.c(e10);
            }
        }
    }

    public o(ig.g gVar) {
        this.f20784d = gVar;
    }
}
