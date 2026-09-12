package pc;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f17864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f17865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f17868f;

    public a(c cVar, long j, long j5, long j7, long j10, long j11) {
        this.f17863a = cVar;
        this.f17864b = j;
        this.f17865c = j5;
        this.f17866d = j7;
        this.f17867e = j10;
        this.f17868f = j11;
    }

    @Override // pc.u
    public final boolean c() {
        return true;
    }

    @Override // pc.u
    public final t h(long j) {
        v vVar = new v(j, b.a(this.f17863a.d(j), 0L, this.f17865c, this.f17866d, this.f17867e, this.f17868f));
        return new t(vVar, vVar);
    }

    @Override // pc.u
    public final long i() {
        return this.f17864b;
    }
}
