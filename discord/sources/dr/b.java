package dr;

import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProducerScope f7706d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f7707e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f7708i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7709v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, xn.c cVar2) {
        super(cVar2);
        this.f7708i = cVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7707e = obj;
        this.f7709v |= Integer.MIN_VALUE;
        return this.f7708i.c(null, this);
    }
}
