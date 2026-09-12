package e2;

/* JADX INFO: loaded from: classes.dex */
public final class u extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f7918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7919e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ z f7920i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7921v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(z zVar, xn.c cVar) {
        super(cVar);
        this.f7920i = zVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7919e = obj;
        this.f7921v |= Integer.MIN_VALUE;
        return this.f7920i.e(this);
    }
}
