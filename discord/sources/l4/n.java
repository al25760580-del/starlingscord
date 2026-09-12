package l4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f14893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f14894c;

    public /* synthetic */ n(v vVar, String str, int i7) {
        this.f14892a = i7;
        this.f14893b = vVar;
        this.f14894c = str;
    }

    @Override // l4.u
    public final void run() {
        switch (this.f14892a) {
            case 0:
                this.f14893b.s(this.f14894c);
                break;
            case 1:
                this.f14893b.q(this.f14894c);
                break;
            default:
                this.f14893b.u(this.f14894c);
                break;
        }
    }
}
