package po;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f18172e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b0 f18173i;

    public /* synthetic */ w(x xVar, b0 b0Var, int i7) {
        this.f18171d = i7;
        this.f18172e = xVar;
        this.f18173i = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException {
        Field declaredField;
        int i7 = this.f18171d;
        b0 b0Var = this.f18173i;
        x xVar = this.f18172e;
        switch (i7) {
            case 0:
                Class cls = b0Var.f18067e;
                vo.f fVarA = xVar.a();
                if (fVarA.c() != vo.g.f21813x) {
                    return null;
                }
                if (fVarA.o()) {
                    so.d dVar = so.d.f20333a;
                    if (w3.q.r(fVarA)) {
                        declaredField = cls.getDeclaredField("INSTANCE");
                    } else {
                        declaredField = cls.getEnclosingClass().getDeclaredField(fVarA.getName().b());
                    }
                } else {
                    declaredField = cls.getDeclaredField("INSTANCE");
                }
                Object obj = declaredField.get(null);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj;
            case 1:
                List<vo.r0> listL = xVar.a().l();
                Intrinsics.checkNotNullExpressionValue(listL, "getDeclaredTypeParameters(...)");
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(listL, 10));
                for (vo.r0 r0Var : listL) {
                    Intrinsics.checkNotNull(r0Var);
                    arrayList.add(new r1(b0Var, r0Var));
                }
                return arrayList;
            default:
                Collection<lq.z> collectionH = xVar.a().n().h();
                Intrinsics.checkNotNullExpressionValue(collectionH, "getSupertypes(...)");
                ArrayList arrayList2 = new ArrayList(collectionH.size());
                for (lq.z zVar : collectionH) {
                    Intrinsics.checkNotNull(zVar);
                    arrayList2.add(new q1(zVar, new jq.p(zVar, xVar, b0Var, 1)));
                }
                vo.f fVarA2 = xVar.a();
                if (fVarA2 == null) {
                    so.i.a(107);
                    throw null;
                }
                up.e eVar = so.i.f20342e;
                if (!so.i.b(fVarA2, so.o.f20363a) && !so.i.b(fVarA2, so.o.f20364b)) {
                    if (arrayList2.isEmpty()) {
                        lq.d0 d0VarE = bq.e.e(xVar.a()).e();
                        Intrinsics.checkNotNullExpressionValue(d0VarE, "getAnyType(...)");
                        arrayList2.add(new q1(d0VarE, v.f18168d));
                    } else {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            vo.g gVarC = xp.e.c(((q1) it.next()).f18132d).c();
                            Intrinsics.checkNotNullExpressionValue(gVarC, "getKind(...)");
                            if (gVarC == vo.g.f21809e || gVarC == vo.g.f21812w) {
                            }
                        }
                        lq.d0 d0VarE2 = bq.e.e(xVar.a()).e();
                        Intrinsics.checkNotNullExpressionValue(d0VarE2, "getAnyType(...)");
                        arrayList2.add(new q1(d0VarE2, v.f18168d));
                    }
                }
                return vq.m.e(arrayList2);
        }
    }
}
