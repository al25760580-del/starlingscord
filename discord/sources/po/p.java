package po;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f18121e;

    public /* synthetic */ p(s sVar, int i7) {
        this.f18120d = i7;
        this.f18121e = sVar;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i7;
        int iF;
        Type[] lowerBounds;
        int i10 = this.f18120d;
        int i11 = 0;
        z = false;
        boolean z5 = false;
        int i12 = 1;
        s sVar = this.f18121e;
        switch (i10) {
            case 0:
                return a2.d(sVar.e());
            case 1:
                vo.d dVarE = sVar.e();
                ArrayList arrayList = new ArrayList();
                if (sVar.h()) {
                    i7 = 0;
                } else {
                    yo.t tVarG = a2.g(dVarE);
                    if (tVarG != null) {
                        arrayList.add(new x0(sVar, 0, mo.l.f15949d, new q(tVarG, 0)));
                        i7 = 1;
                    } else {
                        i7 = 0;
                    }
                    yo.t tVarV = dVarE.V();
                    if (tVarV != null) {
                        arrayList.add(new x0(sVar, i7, mo.l.f15950e, new q(tVarV, 1)));
                        i7++;
                    }
                }
                int size = dVarE.L().size();
                while (i11 < size) {
                    arrayList.add(new x0(sVar, i7, mo.l.f15951i, new r(dVarE, i11)));
                    i11++;
                    i7++;
                }
                if (sVar.g() && (dVarE instanceof gp.a) && arrayList.size() > 1) {
                    kotlin.collections.h0.n(arrayList, new f(i12));
                }
                arrayList.trimToSize();
                return arrayList;
            case 2:
                lq.z returnType = sVar.e().getReturnType();
                Intrinsics.checkNotNull(returnType);
                return new q1(returnType, new p(sVar, 6));
            case 3:
                List<vo.r0> typeParameters = sVar.e().getTypeParameters();
                Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
                ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(typeParameters, 10));
                for (vo.r0 r0Var : typeParameters) {
                    Intrinsics.checkNotNull(r0Var);
                    arrayList2.add(new r1(sVar, r0Var));
                }
                return arrayList2;
            case 4:
                List<mo.m> parameters = sVar.getParameters();
                int size2 = (sVar.isSuspend() ? 1 : 0) + parameters.size();
                if (((Boolean) sVar.f18150x.getValue()).booleanValue()) {
                    iF = 0;
                    for (mo.m mVar : parameters) {
                        iF += ((x0) mVar).f18190i == mo.l.f15951i ? sVar.f(mVar) : 0;
                    }
                } else if (parameters.isEmpty()) {
                    iF = 0;
                } else {
                    Iterator it = parameters.iterator();
                    iF = 0;
                    while (it.hasNext()) {
                        if (((x0) ((mo.m) it.next())).f18190i == mo.l.f15951i && (iF = iF + 1) < 0) {
                            throw new ArithmeticException("Count overflow has happened.");
                        }
                    }
                }
                int i13 = (iF + 31) / 32;
                Object[] objArr = new Object[size2 + i13 + 1];
                Iterator it2 = parameters.iterator();
                while (it2.hasNext()) {
                    x0 x0Var = (x0) ((mo.m) it2.next());
                    boolean zC = x0Var.c();
                    int i14 = x0Var.f18189e;
                    if (zC) {
                        q1 q1VarB = x0Var.b();
                        up.c cVar = a2.f18058a;
                        Intrinsics.checkNotNullParameter(q1VarB, "<this>");
                        lq.z zVar = q1VarB.f18132d;
                        if (zVar == null || !xp.g.c(zVar)) {
                            q1 q1VarB2 = x0Var.b();
                            Intrinsics.checkNotNullParameter(q1VarB2, "<this>");
                            Type javaType = q1VarB2.getJavaType();
                            if (javaType == null) {
                                Intrinsics.checkNotNullParameter(q1VarB2, "<this>");
                                javaType = q1VarB2.getJavaType();
                                if (javaType == null) {
                                    javaType = mo.c0.g(q1VarB2, false);
                                }
                            }
                            objArr[i14] = a2.e(javaType);
                        }
                    }
                    if (x0Var.d()) {
                        objArr[i14] = s.a(x0Var.b());
                    }
                }
                for (int i15 = 0; i15 < i13; i15++) {
                    objArr[size2 + i15] = 0;
                }
                return objArr;
            case 5:
                List parameters2 = sVar.getParameters();
                if (parameters2 == null || !parameters2.isEmpty()) {
                    Iterator it3 = parameters2.iterator();
                    while (it3.hasNext()) {
                        if (a2.h(((x0) ((mo.m) it3.next())).b())) {
                            z5 = true;
                        }
                    }
                }
                return Boolean.valueOf(z5);
            default:
                Type type = null;
                if (sVar.isSuspend()) {
                    Object objS = CollectionsKt.S(sVar.b().a());
                    ParameterizedType parameterizedType = objS instanceof ParameterizedType ? (ParameterizedType) objS : null;
                    if (Intrinsics.areEqual(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
                        Object objD = kotlin.collections.y.D(actualTypeArguments);
                        WildcardType wildcardType = objD instanceof WildcardType ? (WildcardType) objD : null;
                        if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                            type = (Type) kotlin.collections.y.s(lowerBounds);
                        }
                    }
                }
                return type == null ? sVar.b().getReturnType() : type;
        }
    }
}
