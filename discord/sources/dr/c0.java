package dr;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends xn.c {
    public int E;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d0 f7712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlowCollector f7713e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public e0 f7714i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Job f7715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f7716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f7717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d0 f7718y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Continuation continuation) {
        super(continuation);
        this.f7718y = d0Var;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f7717x = obj;
        this.E |= Integer.MIN_VALUE;
        this.f7718y.collect(null, this);
        return wn.a.f22354d;
    }
}
