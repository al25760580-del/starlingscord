package e2;

/* JADX INFO: loaded from: classes.dex */
public final class p extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z f7891e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ar.p f7892i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f7893v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f7894w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7895x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(z zVar, xn.c cVar) {
        super(cVar);
        this.f7894w = zVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7893v = obj;
        this.f7895x |= Integer.MIN_VALUE;
        return z.a(this.f7894w, null, this);
    }
}
