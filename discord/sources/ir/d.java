package ir;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f13414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f13415e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f13416i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13417v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, xn.c cVar) {
        super(cVar);
        this.f13416i = eVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f13415e = obj;
        this.f13417v |= Integer.MIN_VALUE;
        return this.f13416i.d(this);
    }
}
