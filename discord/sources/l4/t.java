package l4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f14911b;

    public /* synthetic */ t(v vVar, int i7) {
        this.f14910a = i7;
        this.f14911b = vVar;
    }

    @Override // l4.u
    public final void run() {
        switch (this.f14910a) {
            case 0:
                this.f14911b.n();
                break;
            default:
                this.f14911b.l();
                break;
        }
    }
}
