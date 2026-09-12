package dr;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends xn.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f7787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7788e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ a4.j f7789i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f7790v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public FlowCollector f7791w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a4.j jVar, Continuation continuation) {
        super(continuation);
        this.f7789i = jVar;
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        this.f7787d = obj;
        this.f7788e |= Integer.MIN_VALUE;
        return this.f7789i.emit(null, this);
    }
}
