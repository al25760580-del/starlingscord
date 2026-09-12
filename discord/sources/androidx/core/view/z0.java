package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends xn.g implements Function2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1757e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f1758i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final /* synthetic */ View f1759v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(View view, Continuation continuation) {
        super(2, continuation);
        this.f1759v = view;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        z0 z0Var = new z0(this.f1759v, continuation);
        z0Var.f1758i = obj;
        return z0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((xq.k) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f1757e;
        if (i7 == 0) {
            ib.a.L(obj);
            xq.k kVar = (xq.k) this.f1758i;
            View view = this.f1759v;
            this.f1758i = kVar;
            this.f1757e = 1;
            kVar.a(view, this);
            return aVar;
        }
        if (i7 == 1) {
            xq.k kVar2 = (xq.k) this.f1758i;
            ib.a.L(obj);
            View view2 = this.f1759v;
            if (view2 instanceof ViewGroup) {
                this.f1758i = null;
                this.f1757e = 2;
                kVar2.getClass();
                Object objB = kVar2.b(new c0(new y0((ViewGroup) view2)), this);
                if (objB != aVar) {
                    objB = Unit.f14616a;
                }
                if (objB == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ib.a.L(obj);
        }
        return Unit.f14616a;
    }
}
