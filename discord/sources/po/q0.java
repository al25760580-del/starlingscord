package po;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18129d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0 f18130e;

    public /* synthetic */ q0(s0 s0Var, int i7) {
        this.f18129d = i7;
        this.f18130e = s0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Iterable] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws vp.q {
        ?? C;
        switch (this.f18129d) {
            case 0:
                s0 s0Var = this.f18130e;
                u1 u1Var = s0Var.f18152c;
                KProperty kProperty = s0.f18151h[0];
                ap.b fileClass = (ap.b) u1Var.invoke();
                if (fileClass == null) {
                    return eq.n.f8648b;
                }
                Class cls = fileClass.f2856a;
                u1 u1Var2 = s0Var.f18081a;
                KProperty kProperty2 = d0.f18080b[0];
                Object objInvoke = u1Var2.invoke();
                Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
                e4.m mVar = ((ap.e) objInvoke).f2862b;
                np.e eVar = (np.e) mVar.f7993e;
                Intrinsics.checkNotNullParameter(fileClass, "fileClass");
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) mVar.f7995v;
                up.b bVarA = bp.c.a(cls);
                Object obj = concurrentHashMap.get(bVarA);
                if (obj == null) {
                    up.c cVar = bp.c.a(cls).f21258a;
                    gs.o oVar = fileClass.f2857b;
                    op.a aVar = (op.a) oVar.f10247c;
                    op.a aVar2 = op.a.MULTIFILE_CLASS;
                    if (aVar == aVar2) {
                        String[] strArr = (String[]) oVar.f10249e;
                        if (aVar != aVar2) {
                            strArr = null;
                        }
                        List listB = strArr != null ? kotlin.collections.w.b(strArr) : null;
                        if (listB == null) {
                            listB = kotlin.collections.n0.f14659d;
                        }
                        C = new ArrayList();
                        Iterator it = listB.iterator();
                        while (it.hasNext()) {
                            up.c topLevelFqName = new up.c(cq.b.c((String) it.next()).f7331a.replace('/', '.'));
                            Intrinsics.checkNotNullExpressionValue(topLevelFqName, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                            Intrinsics.checkNotNullParameter(topLevelFqName, "topLevelFqName");
                            up.b bVar = new up.b(topLevelFqName.b(), topLevelFqName.f21262a.f());
                            ue.i iVar = (ue.i) mVar.f7994i;
                            eVar.c().f11021c.getClass();
                            ap.b bVarT = a5.l0.t(iVar, bVar, rp.e.f19536g);
                            if (bVarT != null) {
                                C.add(bVarT);
                            }
                        }
                    } else {
                        C = kotlin.collections.c0.c(fileClass);
                    }
                    uo.m mVar2 = new uo.m(eVar.c().f11020b, cVar, 1);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = C.iterator();
                    while (it2.hasNext()) {
                        jq.s sVarA = eVar.a(mVar2, (ap.b) it2.next());
                        if (sVarA != null) {
                            arrayList.add(sVarA);
                        }
                    }
                    eq.o oVarF = mf.f.f("package " + cVar + " (" + fileClass + ')', CollectionsKt.i0(arrayList));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, oVarF);
                    obj = objPutIfAbsent == null ? oVarF : objPutIfAbsent;
                }
                Intrinsics.checkNotNullExpressionValue(obj, "getOrPut(...)");
                return (eq.o) obj;
            default:
                u1 u1Var3 = this.f18130e.f18152c;
                KProperty kProperty3 = s0.f18151h[0];
                ap.b bVar2 = (ap.b) u1Var3.invoke();
                if (bVar2 != null) {
                    gs.o oVar2 = bVar2.f2857b;
                    String[] strArr2 = (String[]) oVar2.f10249e;
                    String[] strArr3 = (String[]) oVar2.f10251g;
                    if (strArr2 != null && strArr3 != null) {
                        Pair pairH = tp.g.h(strArr2, strArr3);
                        return new rn.v((tp.f) pairH.f14612d, (pp.e0) pairH.f14613e, (rp.e) oVar2.f10248d);
                    }
                }
                return null;
        }
    }
}
