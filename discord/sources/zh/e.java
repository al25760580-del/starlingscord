package zh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ig.g f23991d;

    public e() {
        this.f23991d = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e10) {
            ig.g gVar = this.f23991d;
            if (gVar != null) {
                gVar.c(e10);
            }
        }
    }

    public e(ig.g gVar) {
        this.f23991d = gVar;
    }
}
