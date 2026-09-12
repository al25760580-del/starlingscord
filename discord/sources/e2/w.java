package e2;

/* JADX INFO: loaded from: classes.dex */
public final class w extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f7927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7928e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7929i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z f7930v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7931w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(z zVar, xn.c cVar) {
        super(cVar);
        this.f7930v = zVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7929i = obj;
        this.f7931w |= Integer.MIN_VALUE;
        return this.f7930v.g(this);
    }
}
