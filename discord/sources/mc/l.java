package mc;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f15563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f15564e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f15565i;

    public /* synthetic */ l(n nVar, o oVar, int i7) {
        this.f15563d = i7;
        this.f15564e = nVar;
        this.f15565i = oVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, mc.o] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, mc.o] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, mc.o] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15563d) {
            case 0:
                n nVar = this.f15564e;
                this.f15565i.u(nVar.f15568a, nVar.f15569b);
                break;
            case 1:
                n nVar2 = this.f15564e;
                this.f15565i.t(nVar2.f15568a, nVar2.f15569b);
                break;
            default:
                n nVar3 = this.f15564e;
                this.f15565i.b(nVar3.f15568a, nVar3.f15569b);
                break;
        }
    }
}
