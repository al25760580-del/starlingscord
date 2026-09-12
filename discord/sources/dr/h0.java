package dr;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i0 f7745e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7746i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(i0 i0Var, Continuation continuation) {
        super(continuation);
        this.f7745e = i0Var;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7744d = obj;
        this.f7746i |= Integer.MIN_VALUE;
        this.f7745e.collect(null, this);
        return wn.a.f22354d;
    }
}
