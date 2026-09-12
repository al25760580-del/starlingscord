package dr;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Ref.ObjectRef f7747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7748e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7749i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f7750v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f7751w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Continuation continuation, Ref.ObjectRef objectRef, FlowCollector flowCollector) {
        super(2, continuation);
        this.f7750v = objectRef;
        this.f7751w = flowCollector;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(continuation, this.f7750v, this.f7751w);
        iVar.f7749i = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create(new cr.n(((cr.n) obj).f7386a), (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [T, a5.h] */
    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f7748e;
        if (i7 == 0) {
            ib.a.L(obj);
            ?? r7 = ((cr.n) this.f7749i).f7386a;
            boolean z5 = r7 instanceof cr.m;
            objectRef = this.f7750v;
            if (!z5) {
                objectRef.element = r7;
            }
            if (z5) {
                cr.l lVar = r7 instanceof cr.l ? (cr.l) r7 : null;
                Throwable th2 = lVar != null ? lVar.f7384a : null;
                if (th2 != null) {
                    throw th2;
                }
                Object obj2 = objectRef.element;
                if (obj2 != null) {
                    Object obj3 = obj2 != er.c.f8670b ? obj2 : null;
                    this.f7749i = r7;
                    this.f7747d = objectRef;
                    this.f7748e = 1;
                    if (this.f7751w.emit(obj3, this) == aVar) {
                        return aVar;
                    }
                    objectRef2 = objectRef;
                }
                objectRef.element = er.c.f8672d;
            }
            return Unit.f14616a;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef2 = this.f7747d;
        ib.a.L(obj);
        objectRef = objectRef2;
        objectRef.element = er.c.f8672d;
        return Unit.f14616a;
    }
}
