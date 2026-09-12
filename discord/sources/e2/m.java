package e2;

import com.margelo.nitro.rive.f1;
import dr.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class m extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7882e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f7883i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ z f7884v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(z zVar, Continuation continuation, int i7) {
        super(2, continuation);
        this.f7881d = i7;
        this.f7884v = zVar;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f7881d) {
            case 0:
                m mVar = new m(this.f7884v, continuation, 0);
                mVar.f7883i = obj;
                return mVar;
            default:
                m mVar2 = new m(this.f7884v, continuation, 1);
                mVar2.f7883i = obj;
                return mVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f7881d) {
            case 0:
                return ((m) create((j) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
            default:
                return ((m) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
        }
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objE;
        switch (this.f7881d) {
            case 0:
                wn.a aVar = wn.a.f22354d;
                int i7 = this.f7882e;
                if (i7 == 0) {
                    ib.a.L(obj);
                    j jVar = (j) this.f7883i;
                    boolean z5 = jVar instanceof h;
                    z zVar = this.f7884v;
                    if (z5) {
                        h hVar = (h) jVar;
                        this.f7882e = 1;
                        a0 a0Var = (a0) zVar.f7951f.getValue();
                        if (a0Var instanceof b) {
                            objE = Unit.f14616a;
                        } else if (a0Var instanceof f) {
                            if (a0Var != hVar.f7873a || (objE = zVar.e(this)) != aVar) {
                                objE = Unit.f14616a;
                            }
                        } else if (Intrinsics.areEqual(a0Var, b0.f7856a)) {
                            objE = zVar.e(this);
                            if (objE != aVar) {
                                objE = Unit.f14616a;
                            }
                        } else {
                            if (a0Var instanceof e) {
                                throw new IllegalStateException("Can't read in final state.");
                            }
                            objE = Unit.f14616a;
                        }
                        if (objE == aVar) {
                            return aVar;
                        }
                    } else if (jVar instanceof i) {
                        this.f7882e = 2;
                        if (z.a(zVar, (i) jVar, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i7 != 1 && i7 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            default:
                z zVar2 = this.f7884v;
                d0 d0Var = zVar2.f7951f;
                wn.a aVar2 = wn.a.f22354d;
                int i10 = this.f7882e;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                    return Unit.f14616a;
                }
                ib.a.L(obj);
                FlowCollector flowCollector = (FlowCollector) this.f7883i;
                a0 a0Var2 = (a0) d0Var.getValue();
                if (!(a0Var2 instanceof b)) {
                    zVar2.f7953h.A(new h(a0Var2));
                }
                n nVar = new n(a0Var2, null);
                this.f7882e = 1;
                d0Var.collect(new dr.o(new Ref.BooleanRef(), new f1(flowCollector, 3), nVar), this);
                return aVar2;
        }
    }
}
