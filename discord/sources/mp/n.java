package mp;

import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lq.d1;
import lq.z;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements Function1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f15997e = new n(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f15998i = new n(1);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final n f15999v = new n(2);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final n f16000w = new n(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16001d;

    public /* synthetic */ n(int i7) {
        this.f16001d = i7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f16001d) {
            case 0:
                vo.d it = (vo.d) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                yo.t tVarV = it.V();
                Intrinsics.checkNotNull(tVarV);
                z type = tVarV.getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                return type;
            case 1:
                vo.d it2 = (vo.d) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                z returnType = it2.getReturnType();
                Intrinsics.checkNotNull(returnType);
                return returnType;
            case 2:
                d1 it3 = (d1) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return Boolean.valueOf(it3 instanceof jp.i);
            case 3:
                vo.i iVarG = ((d1) obj).r0().g();
                if (iVarG == null) {
                    return Boolean.FALSE;
                }
                up.e name = iVarG.getName();
                up.c cVar = uo.d.f21202f;
                return Boolean.valueOf(Intrinsics.areEqual(name, cVar.f21262a.f()) && Intrinsics.areEqual(bq.e.c(iVarG), cVar));
            default:
                p function = (p) obj;
                Intrinsics.checkNotNullParameter(function, "$this$function");
                Intrinsics.checkNotNullParameter("Spliterator", StackTraceHelper.NAME_KEY);
                d dVar = l.f15990b;
                function.c("java/util/Spliterator", dVar, dVar);
                return Unit.f14616a;
        }
    }
}
