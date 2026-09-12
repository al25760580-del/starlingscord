package a4;

import androidx.work.CoroutineWorker;
import cr.t;
import dr.z;
import e4.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes.dex */
public final class k extends xn.h implements Function2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f138e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f139i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object f140v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f141w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Object obj3, Continuation continuation, int i7) {
        super(2, continuation);
        this.f137d = i7;
        this.f139i = obj;
        this.f140v = obj2;
        this.f141w = obj3;
    }

    @Override // xn.a
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.f137d) {
            case 0:
                return new k((i) this.f139i, (o) this.f140v, (e) this.f141w, continuation, 0);
            case 1:
                k kVar = new k((FlowCollector) this.f140v, (er.e) this.f141w, continuation, 1);
                kVar.f139i = obj;
                return kVar;
            case 2:
                return new k((er.k) this.f139i, (FlowCollector) this.f140v, this.f141w, continuation, 2);
            case 3:
                k kVar2 = new k((dr.k) this.f140v, (FlowCollector) this.f141w, continuation, 3);
                kVar2.f139i = obj;
                return kVar2;
            default:
                return new k((v3.k) this.f140v, (CoroutineWorker) this.f141w, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.f137d) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f14616a);
    }

    /* JADX WARN: Type inference failed for: r12v8, types: [java.io.Serializable, kotlinx.coroutines.flow.Flow[]] */
    @Override // xn.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f137d;
        Continuation continuation = null;
        Object obj2 = this.f141w;
        Object obj3 = this.f140v;
        switch (i7) {
            case 0:
                o spec = (o) obj3;
                wn.a aVar = wn.a.f22354d;
                int i10 = this.f138e;
                if (i10 == 0) {
                    ib.a.L(obj);
                    i iVar = (i) this.f139i;
                    iVar.getClass();
                    Intrinsics.checkNotNullParameter(spec, "spec");
                    List list = iVar.f133e;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (((b4.e) obj4).b(spec)) {
                            arrayList.add(obj4);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (true) {
                        int i11 = 0;
                        if (it.hasNext()) {
                            b4.e eVar = (b4.e) it.next();
                            eVar.getClass();
                            arrayList2.add(new dr.c(new b4.d(eVar, continuation, i11), kotlin.coroutines.g.f14681d, -2, cr.a.f7342d));
                        } else {
                            Flow flowH = z.h(new h(i11, (Flow[]) CollectionsKt.i0(arrayList2).toArray(new Flow[0])));
                            j jVar = new j(0, (e) obj2, spec);
                            this.f138e = 1;
                            if (flowH.collect(jVar, this) == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            case 1:
                Object obj5 = wn.a.f22354d;
                int i12 = this.f138e;
                if (i12 == 0) {
                    ib.a.L(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f139i;
                    FlowCollector flowCollector = (FlowCollector) obj3;
                    er.e eVar2 = (er.e) obj2;
                    CoroutineContext coroutineContext = eVar2.f8673d;
                    int i13 = eVar2.f8674e;
                    int i14 = i13 != -3 ? i13 : -2;
                    cr.a aVar2 = eVar2.f8675i;
                    ar.z zVar = ar.z.f2987i;
                    Function2 dVar = new b4.d(eVar2, continuation, 6);
                    t tVar = new t(ar.t.b(coroutineScope, coroutineContext), ls.l.a(i14, 4, aVar2));
                    tVar.n0(zVar, tVar, dVar);
                    this.f138e = 1;
                    Object objI = z.i(flowCollector, tVar, true, this);
                    if (objI != obj5) {
                        objI = Unit.f14616a;
                    }
                    if (objI == obj5) {
                        return obj5;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            case 2:
                wn.a aVar3 = wn.a.f22354d;
                int i15 = this.f138e;
                if (i15 == 0) {
                    ib.a.L(obj);
                    this.f138e = 1;
                    if (((er.k) this.f139i).f8691w.invoke((FlowCollector) obj3, obj2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            case 3:
                wn.a aVar4 = wn.a.f22354d;
                int i16 = this.f138e;
                if (i16 == 0) {
                    ib.a.L(obj);
                    dr.k kVar = (dr.k) obj3;
                    this.f138e = 1;
                    if (kVar.invoke((CoroutineScope) this.f139i, (FlowCollector) obj2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.a.L(obj);
                }
                return Unit.f14616a;
            default:
                wn.a aVar5 = wn.a.f22354d;
                int i17 = this.f138e;
                if (i17 == 0) {
                    ib.a.L(obj);
                    this.f139i = (v3.k) obj3;
                    this.f138e = 1;
                    throw new IllegalStateException("Not implemented");
                }
                if (i17 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v3.k kVar2 = (v3.k) this.f139i;
                ib.a.L(obj);
                kVar2.f21410d.j(obj);
                return Unit.f14616a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(Object obj, Object obj2, Continuation continuation, int i7) {
        super(2, continuation);
        this.f137d = i7;
        this.f140v = obj;
        this.f141w = obj2;
    }
}
