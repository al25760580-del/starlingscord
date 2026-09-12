package e2;

/* JADX INFO: loaded from: classes.dex */
public final class x extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f7932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7933e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f7934i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f7935v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f7936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f7937x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, xn.c cVar) {
        super(cVar);
        this.f7936w = zVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7935v = obj;
        this.f7937x |= Integer.MIN_VALUE;
        return this.f7936w.h(null, null, this);
    }
}
