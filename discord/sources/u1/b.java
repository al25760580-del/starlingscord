package u1;

import o1.l;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f20913e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ l f20914i;

    public /* synthetic */ b(d dVar, l lVar, int i7) {
        this.f20912d = i7;
        this.f20913e = dVar;
        this.f20914i = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20912d) {
            case 0:
                this.f20913e.f().h(this.f20914i);
                break;
            case 1:
                this.f20913e.f().h(this.f20914i);
                break;
            default:
                this.f20913e.f().h(this.f20914i);
                break;
        }
    }
}
