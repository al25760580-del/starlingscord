package com.margelo.nitro.rive;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class f1 implements FlowCollector {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f6939e;

    public /* synthetic */ f1(FlowCollector flowCollector, int i7) {
        this.f6938d = i7;
        this.f6939e = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x0116  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        e1 e1Var;
        l1 l1Var;
        p1 p1Var;
        e2.o oVar;
        switch (this.f6938d) {
            case 0:
                if (continuation instanceof e1) {
                    e1Var = (e1) continuation;
                    int i7 = e1Var.f6936e;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        e1Var.f6936e = i7 - Integer.MIN_VALUE;
                    } else {
                        e1Var = new e1(this, continuation);
                    }
                } else {
                    e1Var = new e1(this, continuation);
                }
                Object obj2 = e1Var.f6935d;
                wn.a aVar = wn.a.f22354d;
                int i10 = e1Var.f6936e;
                if (i10 == 0) {
                    ib.a.L(obj2);
                    Unit unit = Unit.f14616a;
                    e1Var.f6936e = 1;
                    if (this.f6939e.emit(unit, e1Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj2);
                }
                return Unit.f14616a;
            case 1:
                if (continuation instanceof l1) {
                    l1Var = (l1) continuation;
                    int i11 = l1Var.f6954e;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        l1Var.f6954e = i11 - Integer.MIN_VALUE;
                    } else {
                        l1Var = new l1(this, continuation);
                    }
                } else {
                    l1Var = new l1(this, continuation);
                }
                Object obj3 = l1Var.f6953d;
                wn.a aVar2 = wn.a.f22354d;
                int i12 = l1Var.f6954e;
                if (i12 == 0) {
                    ib.a.L(obj3);
                    Unit unit2 = Unit.f14616a;
                    l1Var.f6954e = 1;
                    if (this.f6939e.emit(unit2, l1Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj3);
                }
                return Unit.f14616a;
            case 2:
                if (continuation instanceof p1) {
                    p1Var = (p1) continuation;
                    int i13 = p1Var.f6969e;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        p1Var.f6969e = i13 - Integer.MIN_VALUE;
                    } else {
                        p1Var = new p1(this, continuation);
                    }
                } else {
                    p1Var = new p1(this, continuation);
                }
                Object obj4 = p1Var.f6968d;
                wn.a aVar3 = wn.a.f22354d;
                int i14 = p1Var.f6969e;
                if (i14 == 0) {
                    ib.a.L(obj4);
                    Double d6 = new Double(((Number) obj).floatValue());
                    p1Var.f6969e = 1;
                    if (this.f6939e.emit(d6, p1Var) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj4);
                }
                return Unit.f14616a;
            default:
                if (continuation instanceof e2.o) {
                    oVar = (e2.o) continuation;
                    int i15 = oVar.f7888e;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        oVar.f7888e = i15 - Integer.MIN_VALUE;
                    } else {
                        oVar = new e2.o(this, continuation);
                    }
                } else {
                    oVar = new e2.o(this, continuation);
                }
                Object obj5 = oVar.f7887d;
                wn.a aVar4 = wn.a.f22354d;
                int i16 = oVar.f7888e;
                if (i16 == 0) {
                    ib.a.L(obj5);
                    e2.a0 a0Var = (e2.a0) obj;
                    if (a0Var instanceof e2.f) {
                        throw ((e2.f) a0Var).f7869a;
                    }
                    if (a0Var instanceof e2.e) {
                        throw ((e2.e) a0Var).f7868a;
                    }
                    if (!(a0Var instanceof e2.b)) {
                        if (a0Var instanceof e2.b0) {
                            throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        }
                        throw new rn.n();
                    }
                    Object obj6 = ((e2.b) a0Var).f7854a;
                    oVar.f7888e = 1;
                    if (this.f6939e.emit(obj6, oVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj5);
                }
                return Unit.f14616a;
        }
    }
}
