package er;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f8692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f8693e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8694i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(continuation);
        this.f8693e = nVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f8692d = obj;
        this.f8694i |= Integer.MIN_VALUE;
        return this.f8693e.emit(null, this);
    }
}
