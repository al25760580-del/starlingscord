package dr;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0 f7728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public er.v f7729e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7730i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g0 f7731v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7732w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(g0 g0Var, xn.c cVar) {
        super(cVar);
        this.f7731v = g0Var;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7730i = obj;
        this.f7732w |= Integer.MIN_VALUE;
        return this.f7731v.a(this);
    }
}
