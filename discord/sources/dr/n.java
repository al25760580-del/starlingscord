package dr;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o f7770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f7771e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7772i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o f7773v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f7774w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(continuation);
        this.f7773v = oVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7772i = obj;
        this.f7774w |= Integer.MIN_VALUE;
        return this.f7773v.emit(null, this);
    }
}
