package or;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Function;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements o1, d1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f17591d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function f17592e;

    public q(Function1 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f17592e = compute;
        this.f17591d = new s();
    }

    @Override // or.o1
    public KSerializer d(KClass key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = this.f17591d.get(gn.h.B(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        w0 w0Var = (w0) obj;
        Object objA = w0Var.f17623a.get();
        if (objA == null) {
            objA = w0Var.a(new fp.b(10, this, key));
        }
        return ((k) objA).f17565a;
    }

    @Override // or.d1
    public Object i(KClass key, ArrayList types) {
        Object objO;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(types, "types");
        Object obj = this.f17591d.get(gn.h.B(key));
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        w0 w0Var = (w0) obj;
        Object objA = w0Var.f17623a.get();
        if (objA == null) {
            objA = w0Var.a(new r());
        }
        c1 c1Var = (c1) objA;
        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(types, 10));
        Iterator it = types.iterator();
        while (it.hasNext()) {
            arrayList.add(new n0((KType) it.next()));
        }
        ConcurrentHashMap concurrentHashMap = c1Var.f17516a;
        Object obj2 = concurrentHashMap.get(arrayList);
        if (obj2 == null) {
            try {
                rn.q qVar = Result.f14614e;
                objO = (KSerializer) ((Function2) this.f17592e).invoke(key, types);
            } catch (Throwable th2) {
                rn.q qVar2 = Result.f14614e;
                objO = ib.a.o(th2);
            }
            Result result = new Result(objO);
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(arrayList, result);
            obj2 = objPutIfAbsent == null ? result : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        return ((Result) obj2).f14615d;
    }

    public q(Function2 compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.f17592e = compute;
        this.f17591d = new s();
    }
}
