package e2;

/* JADX INFO: loaded from: classes.dex */
public final class t extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f7914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7915e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f7916i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7917v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(z zVar, xn.c cVar) {
        super(cVar);
        this.f7916i = zVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7915e = obj;
        this.f7917v |= Integer.MIN_VALUE;
        return this.f7916i.d(this);
    }
}
