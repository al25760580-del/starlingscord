package y3;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f23176e;

    public /* synthetic */ f(g gVar, int i7) {
        this.f23175d = i7;
        this.f23176e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23175d) {
            case 0:
                g.a(this.f23176e);
                break;
            default:
                g.c(this.f23176e);
                break;
        }
    }
}
