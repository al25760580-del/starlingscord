package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
public final class s2 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.swmansion.rnscreens.c f1104e;

    public /* synthetic */ s2(com.swmansion.rnscreens.c cVar, int i7) {
        this.f1103d = i7;
        this.f1104e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1103d) {
            case 0:
                this.f1104e.t();
                break;
            default:
                b2.b bVar = this.f1104e.f966q0;
                if (bVar instanceof h3) {
                    bVar.b(null);
                }
                break;
        }
    }
}
