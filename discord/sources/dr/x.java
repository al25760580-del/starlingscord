package dr;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f7800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FlowCollector f7801e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a0 f7802i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Job f7803v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f7804w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y f7805x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f7806y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Continuation continuation) {
        super(continuation);
        this.f7805x = yVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f7804w = obj;
        this.f7806y |= Integer.MIN_VALUE;
        y.k(this.f7805x, null, this);
        return wn.a.f22354d;
    }
}
