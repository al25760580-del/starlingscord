package l4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f14906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f14907c;

    public /* synthetic */ r(v vVar, float f2, int i7) {
        this.f14905a = i7;
        this.f14906b = vVar;
        this.f14907c = f2;
    }

    @Override // l4.u
    public final void run() {
        switch (this.f14905a) {
            case 0:
                v vVar = this.f14906b;
                i iVar = vVar.f14917d;
                float f2 = this.f14907c;
                if (iVar != null) {
                    x4.e eVar = vVar.f14919e;
                    eVar.k(eVar.G, x4.g.e(iVar.f14872l, iVar.f14873m, f2));
                } else {
                    vVar.f14933x.add(new r(vVar, f2, 0));
                }
                break;
            case 1:
                v vVar2 = this.f14906b;
                i iVar2 = vVar2.f14917d;
                float f7 = this.f14907c;
                if (iVar2 != null) {
                    vVar2.t((int) x4.g.e(iVar2.f14872l, iVar2.f14873m, f7));
                } else {
                    vVar2.f14933x.add(new r(vVar2, f7, 1));
                }
                break;
            default:
                this.f14906b.v(this.f14907c);
                break;
        }
    }
}
