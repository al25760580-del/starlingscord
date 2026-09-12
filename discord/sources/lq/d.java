package lq;

import java.util.AbstractCollection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractCollection f15183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p0 f15184e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mq.b f15185i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final pq.e f15186v;

    public d(AbstractCollection abstractCollection, p0 p0Var, mq.b bVar, pq.e eVar) {
        this.f15183d = abstractCollection;
        this.f15184e = p0Var;
        this.f15185i = bVar;
        this.f15186v = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m0 runForkingPoint = (m0) obj;
        Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
        Iterator it = this.f15183d.iterator();
        while (it.hasNext()) {
            e block = new e(this.f15184e, this.f15185i, (pq.e) it.next(), this.f15186v);
            runForkingPoint.getClass();
            Intrinsics.checkNotNullParameter(block, "block");
            if (!runForkingPoint.f15227a) {
                runForkingPoint.f15227a = ((Boolean) block.invoke()).booleanValue();
            }
        }
        return Unit.f14616a;
    }
}
