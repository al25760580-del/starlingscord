package xq;

import androidx.core.view.x0;
import androidx.core.view.y0;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends xn.g implements Function2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f23043e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f23044i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f23045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f23046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ x0 f23047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ol.c f23048y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(x0 x0Var, ol.c cVar, Continuation continuation) {
        super(2, continuation);
        this.f23047x = x0Var;
        this.f23048y = cVar;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        q qVar = new q(this.f23047x, this.f23048y, continuation);
        qVar.f23046w = obj;
        return qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((k) obj, (Continuation) obj2)).invokeSuspend(Unit.f14616a);
    }

    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        k kVar;
        Iterator it;
        Object next;
        wn.a aVar = wn.a.f22354d;
        int i7 = this.f23045v;
        if (i7 == 0) {
            ib.a.L(obj);
            kVar = (k) this.f23046w;
            it = this.f23047x.iterator();
            y0 y0Var = (y0) it;
            if (!y0Var.hasNext()) {
                return Unit.f14616a;
            }
            next = y0Var.next();
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            next = this.f23044i;
            it = this.f23043e;
            kVar = (k) this.f23046w;
            ib.a.L(obj);
        }
        if (!it.hasNext()) {
            return Unit.f14616a;
        }
        Object next2 = it.next();
        Pair pair = new Pair(next, next2);
        this.f23046w = kVar;
        this.f23043e = it;
        this.f23044i = next2;
        this.f23045v = 1;
        kVar.a(pair, this);
        return aVar;
    }
}
