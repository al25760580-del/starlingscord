package sh;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements th.g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pf.b f20052e;

    public /* synthetic */ h0(pf.b bVar, int i7) {
        this.f20051d = i7;
        this.f20052e = bVar;
    }

    @Override // th.g
    public final Object a() {
        switch (this.f20051d) {
            case 0:
                return new g0(((u1) this.f20052e.f18027e).f20202a);
            default:
                return new th.b(((u1) this.f20052e.f18027e).f20202a);
        }
    }
}
