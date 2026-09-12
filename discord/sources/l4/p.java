package l4;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f14899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14900c;

    public /* synthetic */ p(v vVar, int i7, int i10) {
        this.f14898a = i10;
        this.f14899b = vVar;
        this.f14900c = i7;
    }

    @Override // l4.u
    public final void run() {
        switch (this.f14898a) {
            case 0:
                this.f14899b.p(this.f14900c);
                break;
            case 1:
                this.f14899b.t(this.f14900c);
                break;
            default:
                this.f14899b.o(this.f14900c);
                break;
        }
    }
}
