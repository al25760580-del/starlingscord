package pd;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends od.b {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f17984v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f17985w;

    public k(ud.b bVar, int i7) {
        super(i7, bVar.k - 1);
        this.f17985w = bVar;
    }

    @Override // od.m
    public final long d() {
        switch (this.f17984v) {
            case 0:
                a();
                return ((j) this.f17985w).d(this.f17207i);
            default:
                a();
                ud.b bVar = (ud.b) this.f17985w;
                return bVar.f21055o[(int) this.f17207i];
        }
    }

    @Override // od.m
    public final long f() {
        switch (this.f17984v) {
            case 0:
                a();
                return ((j) this.f17985w).c(this.f17207i);
            default:
                return ((ud.b) this.f17985w).b((int) this.f17207i) + d();
        }
    }

    public k(j jVar, long j, long j5) {
        super(j, j5);
        this.f17985w = jVar;
    }
}
