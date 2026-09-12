package po;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes3.dex */
public final class v0 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x0 f18170e;

    public /* synthetic */ v0(x0 x0Var, int i7) {
        this.f18169d = i7;
        this.f18170e = x0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        w0 w0Var;
        List listC0;
        switch (this.f18169d) {
            case 0:
                return a2.d(this.f18170e.a());
            default:
                x0 x0Var = this.f18170e;
                vo.j0 j0VarA = x0Var.a();
                int i7 = x0Var.f18189e;
                s sVar = x0Var.f18188d;
                if ((j0VarA instanceof yo.t) && Intrinsics.areEqual(a2.g(sVar.e()), j0VarA) && sVar.e().c() == vo.c.f21793e) {
                    vo.l lVarG = sVar.e().g();
                    Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsK = a2.k((vo.f) lVarG);
                    if (clsK != null) {
                        return clsK;
                    }
                    throw new ar.a0("Cannot determine receiver Java type of inherited declaration: " + j0VarA);
                }
                qo.g gVarB = sVar.b();
                if (gVarB instanceof qo.c0) {
                    if (sVar.h()) {
                        qo.c0 c0Var = (qo.c0) gVarB;
                        IntRange intRangeD = c0Var.d(i7 + 1);
                        int i10 = c0Var.d(0).f14689e + 1;
                        listC0 = CollectionsKt.c0(c0Var.f18945b.a(), new IntRange(intRangeD.f14688d - i10, intRangeD.f14689e - i10, 1));
                    } else {
                        qo.c0 c0Var2 = (qo.c0) gVarB;
                        listC0 = CollectionsKt.c0(c0Var2.f18945b.a(), c0Var2.d(i7));
                    }
                    Type[] typeArr = (Type[]) listC0.toArray(new Type[0]);
                    Type[] typeArr2 = (Type[]) Arrays.copyOf(typeArr, typeArr.length);
                    int length = typeArr2.length;
                    if (length == 0) {
                        throw new fo.a("Expected at least 1 type for compound type");
                    }
                    if (length == 1) {
                        return (Type) kotlin.collections.y.D(typeArr2);
                    }
                    w0Var = new w0(typeArr2);
                } else {
                    if (!(gVarB instanceof qo.b0)) {
                        return (Type) gVarB.a().get(i7);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((qo.b0) gVarB).f18935d.get(i7)).toArray(new Class[0]);
                    Type[] typeArr3 = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length2 = typeArr3.length;
                    if (length2 == 0) {
                        throw new fo.a("Expected at least 1 type for compound type");
                    }
                    if (length2 == 1) {
                        return (Type) kotlin.collections.y.D(typeArr3);
                    }
                    w0Var = new w0(typeArr3);
                }
                return w0Var;
        }
    }
}
