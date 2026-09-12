package er;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e implements s {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineContext f8673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8674e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cr.a f8675i;

    public e(CoroutineContext coroutineContext, int i7, cr.a aVar) {
        this.f8673d = coroutineContext;
        this.f8674e = i7;
        this.f8675i = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // er.s
    public final Flow a(CoroutineContext coroutineContext, int i7, cr.a aVar) {
        CoroutineContext coroutineContext2 = this.f8673d;
        CoroutineContext coroutineContextN = coroutineContext.n(coroutineContext2);
        cr.a aVar2 = cr.a.f7342d;
        cr.a aVar3 = this.f8675i;
        int i10 = this.f8674e;
        if (aVar == aVar2) {
            if (i10 != -3) {
                if (i7 == -3) {
                    i7 = i10;
                } else if (i10 != -2) {
                    if (i7 == -2) {
                        i7 = i10;
                    } else {
                        i7 += i10;
                        if (i7 < 0) {
                            i7 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            aVar = aVar3;
        }
        return (Intrinsics.areEqual(coroutineContextN, coroutineContext2) && i7 == i10 && aVar == aVar3) ? this : e(coroutineContextN, i7, aVar);
    }

    public abstract Object c(ProducerScope producerScope, Continuation continuation);

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        Object objI = ar.b0.i(new a4.k(flowCollector, this, null, 1), continuation);
        return objI == wn.a.f22354d ? objI : Unit.f14616a;
    }

    public abstract e e(CoroutineContext coroutineContext, int i7, cr.a aVar);

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f14681d;
        CoroutineContext coroutineContext = this.f8673d;
        if (coroutineContext != gVar) {
            arrayList.add("context=" + coroutineContext);
        }
        int i7 = this.f8674e;
        if (i7 != -3) {
            arrayList.add("capacity=" + i7);
        }
        cr.a aVar = cr.a.f7342d;
        cr.a aVar2 = this.f8675i;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return s0.g.g(sb2, CollectionsKt.O(arrayList, ", ", null, null, null, 62), ']');
    }
}
