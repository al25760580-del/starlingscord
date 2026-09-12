package cr;

import ar.g0;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f7355e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7356i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, xn.c cVar) {
        super(cVar);
        this.f7355e = hVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws g0 {
        this.f7354d = obj;
        this.f7356i |= Integer.MIN_VALUE;
        Object objF = this.f7355e.F(null, 0, 0L, this);
        return objF == wn.a.f22354d ? objF : new n(objF);
    }
}
