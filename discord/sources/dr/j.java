package dr;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.margelo.nitro.rive.c f7755e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7756i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.margelo.nitro.rive.c cVar, Continuation continuation) {
        super(continuation);
        this.f7755e = cVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7754d = obj;
        this.f7756i |= Integer.MIN_VALUE;
        return this.f7755e.emit(null, this);
    }
}
