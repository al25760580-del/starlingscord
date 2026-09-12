package po;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class u implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f18162e;

    public /* synthetic */ u(x xVar, int i7) {
        this.f18161d = i7;
        this.f18162e = xVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18161d) {
            case 0:
                x xVar = this.f18162e;
                u1 u1Var = xVar.f18182h;
                KProperty[] kPropertyArr = x.f18176o;
                KProperty kProperty = kPropertyArr[9];
                Object objInvoke = u1Var.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                u1 u1Var2 = xVar.j;
                KProperty kProperty2 = kPropertyArr[11];
                Object objInvoke2 = u1Var2.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke2, "getValue(...)");
                return CollectionsKt.V((Collection) objInvoke, (Collection) objInvoke2);
            case 1:
                x xVar2 = this.f18162e;
                u1 u1Var3 = xVar2.f18183i;
                KProperty[] kPropertyArr2 = x.f18176o;
                KProperty kProperty3 = kPropertyArr2[10];
                Object objInvoke3 = u1Var3.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke3, "getValue(...)");
                u1 u1Var4 = xVar2.k;
                KProperty kProperty4 = kPropertyArr2[12];
                Object objInvoke4 = u1Var4.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke4, "getValue(...)");
                return CollectionsKt.V((Collection) objInvoke3, (Collection) objInvoke4);
            case 2:
                x xVar3 = this.f18162e;
                u1 u1Var5 = xVar3.f18182h;
                KProperty[] kPropertyArr3 = x.f18176o;
                KProperty kProperty5 = kPropertyArr3[9];
                Object objInvoke5 = u1Var5.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke5, "getValue(...)");
                u1 u1Var6 = xVar3.f18183i;
                KProperty kProperty6 = kPropertyArr3[10];
                Object objInvoke6 = u1Var6.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke6, "getValue(...)");
                return CollectionsKt.V((Collection) objInvoke5, (Collection) objInvoke6);
            case 3:
                x xVar4 = this.f18162e;
                u1 u1Var7 = xVar4.f18184l;
                KProperty[] kPropertyArr4 = x.f18176o;
                KProperty kProperty7 = kPropertyArr4[13];
                Object objInvoke7 = u1Var7.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke7, "getValue(...)");
                u1 u1Var8 = xVar4.f18185m;
                KProperty kProperty8 = kPropertyArr4[14];
                Object objInvoke8 = u1Var8.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke8, "getValue(...)");
                return CollectionsKt.V((Collection) objInvoke7, (Collection) objInvoke8);
            case 4:
                return a2.d(this.f18162e.a());
            case 5:
                Collection collectionM = sa.a.m(this.f18162e.a().h0(), null, 3);
                ArrayList<vo.l> arrayList = new ArrayList();
                for (Object obj : collectionM) {
                    if (!xp.e.m((vo.l) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (vo.l lVar : arrayList) {
                    vo.f fVar = lVar instanceof vo.f ? (vo.f) lVar : null;
                    Class clsK = fVar != null ? a2.k(fVar) : null;
                    b0 b0Var = clsK != null ? new b0(clsK) : null;
                    if (b0Var != null) {
                        arrayList2.add(b0Var);
                    }
                }
                return arrayList2;
            default:
                Collection<vo.f> collectionW = this.f18162e.a().w();
                Intrinsics.checkNotNullExpressionValue(collectionW, "getSealedSubclasses(...)");
                ArrayList arrayList3 = new ArrayList();
                for (vo.f fVar2 : collectionW) {
                    Intrinsics.checkNotNull(fVar2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    Class clsK2 = a2.k(fVar2);
                    b0 b0Var2 = clsK2 != null ? new b0(clsK2) : null;
                    if (b0Var2 != null) {
                        arrayList3.add(b0Var2);
                    }
                }
                return arrayList3;
        }
    }
}
