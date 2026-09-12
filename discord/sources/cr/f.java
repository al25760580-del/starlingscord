package cr;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f7352e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7353i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, xn.c cVar) {
        super(cVar);
        this.f7352e = hVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7351d = obj;
        this.f7353i |= Integer.MIN_VALUE;
        Object objE = h.E(this.f7352e, this);
        return objE == wn.a.f22354d ? objE : new n(objE);
    }
}
