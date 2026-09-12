package dr;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f7765e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7766i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Continuation continuation) {
        super(continuation);
        this.f7765e = mVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7764d = obj;
        this.f7766i |= Integer.MIN_VALUE;
        return this.f7765e.emit(null, this);
    }
}
