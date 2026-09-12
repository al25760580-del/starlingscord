package ir;

import ar.b0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements Function3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f13403d = new a(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b bVar = (b) obj;
        f fVar = (f) obj2;
        long j = bVar.f13404a;
        if (j <= 0) {
            ((e) fVar).f13423w = Unit.f14616a;
        } else {
            io.sentry.react.d dVar = new io.sentry.react.d(1, fVar, bVar);
            Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            e eVar = (e) fVar;
            CoroutineContext coroutineContext = eVar.f13419d;
            eVar.f13421i = b0.n(coroutineContext).P(j, dVar, coroutineContext);
        }
        return Unit.f14616a;
    }
}
