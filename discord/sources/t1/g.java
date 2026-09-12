package t1;

import n1.h;
import o1.l;
import o1.o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f20585e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20586i;

    public /* synthetic */ g(h hVar, l lVar, int i7) {
        this.f20584d = i7;
        this.f20585e = hVar;
        this.f20586i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20584d) {
            case 0:
                this.f20585e.h(this.f20586i);
                break;
            case 1:
                Object oVar = this.f20586i;
                if (oVar == null) {
                    oVar = new o("No provider data returned");
                }
                this.f20585e.h(oVar);
                break;
            default:
                this.f20585e.h(this.f20586i);
                break;
        }
    }
}
