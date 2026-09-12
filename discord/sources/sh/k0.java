package sh;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements th.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final th.f f20083e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final th.f f20084i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final th.f f20085v;

    public /* synthetic */ k0(th.f fVar, th.f fVar2, th.f fVar3, int i7) {
        this.f20082d = i7;
        this.f20083e = fVar;
        this.f20084i = fVar2;
        this.f20085v = fVar3;
    }

    @Override // th.g
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f20082d) {
            case 0:
                return new j0((v0) this.f20083e.a(), (n0) this.f20084i.a(), (e1) this.f20085v.a());
            default:
                return new w0((v0) this.f20083e.a(), (s) this.f20084i.a(), (a0) this.f20085v.a());
        }
    }
}
