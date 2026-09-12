package dr;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e f7720e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7721i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation continuation) {
        super(continuation);
        this.f7720e = eVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7719d = obj;
        this.f7721i |= Integer.MIN_VALUE;
        return this.f7720e.emit(null, this);
    }
}
