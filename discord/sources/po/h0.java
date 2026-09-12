package po;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f18092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f18093e;

    public /* synthetic */ h0(i0 i0Var, int i7) {
        this.f18092d = i7;
        this.f18093e = i0Var;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[LOOP:1: B:39:0x00d8->B:163:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0233  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00f3, please report this as an issue */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        qo.w wVarJ;
        GenericDeclaration declaredConstructor;
        qo.w wVarJ2;
        vo.u uVar;
        vo.l lVarG;
        Member memberB;
        xq.d dVar;
        Object next;
        List listL;
        Iterator it;
        int i7 = this.f18092d;
        Object objC = null;
        i0 i0Var = this.f18093e;
        switch (i7) {
            case 0:
                up.b bVar = y1.f18196a;
                vo.u uVarE = i0Var.e();
                g0 g0Var = i0Var.f18097y;
                c9.a aVarC = y1.c(uVarE);
                if (aVarC instanceof j) {
                    if (i0Var.g()) {
                        Class<?> jClass = g0Var.getJClass();
                        List parameters = i0Var.getParameters();
                        ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(parameters, 10));
                        Iterator it2 = parameters.iterator();
                        while (it2.hasNext()) {
                            String name = ((x0) ((mo.m) it2.next())).getName();
                            Intrinsics.checkNotNull(name);
                            arrayList.add(name);
                        }
                        qo.a aVar = qo.a.f18926e;
                        qo.b bVar2 = qo.b.f18929d;
                        return new qo.c(jClass, arrayList, aVar);
                    }
                    String desc = ((j) aVarC).f18098h.f20875l;
                    g0Var.getClass();
                    Intrinsics.checkNotNullParameter(desc, "desc");
                    Class<?> jClass2 = g0Var.getJClass();
                    try {
                        Class[] clsArr = (Class[]) ((ArrayList) g0Var.k(desc, false).f7966e).toArray(new Class[0]);
                        objC = jClass2.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
                        break;
                    } catch (NoSuchMethodException unused) {
                    }
                } else if (aVarC instanceof k) {
                    vo.u uVarE2 = i0Var.e();
                    vo.l lVarG2 = uVarE2.g();
                    Intrinsics.checkNotNullExpressionValue(lVarG2, "getContainingDeclaration(...)");
                    if (xp.g.d(lVarG2) && (uVarE2 instanceof vo.k) && ((vo.k) uVarE2).q()) {
                        vo.u uVarE3 = i0Var.e();
                        String str = ((k) aVarC).f18102h.f20875l;
                        List listL2 = i0Var.e().L();
                        Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
                        return new qo.b0(uVarE3, g0Var, str, listL2);
                    }
                    tp.e eVar = ((k) aVarC).f18102h;
                    objC = g0Var.c(eVar.k, eVar.f20875l);
                } else if (aVarC instanceof i) {
                    objC = ((i) aVarC).f18096h;
                    Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type java.lang.reflect.Member");
                } else {
                    if (!(aVarC instanceof h)) {
                        if (!(aVarC instanceof g)) {
                            throw new rn.n();
                        }
                        List list = ((g) aVarC).f18089h;
                        Class<?> jClass3 = g0Var.getJClass();
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(((Method) it3.next()).getName());
                        }
                        return new qo.c(jClass3, arrayList2, qo.a.f18926e, qo.b.f18929d, list);
                    }
                    objC = ((h) aVarC).f18091h;
                    Intrinsics.checkNotNull(objC, "null cannot be cast to non-null type java.lang.reflect.Member");
                }
                if (objC instanceof Constructor) {
                    wVarJ = i0Var.i((Constructor) objC, i0Var.e(), false);
                } else {
                    if (!(objC instanceof Method)) {
                        throw new ar.a0("Could not compute caller for function: " + i0Var.e() + " (member = " + objC + ')');
                    }
                    Method method = (Method) objC;
                    if (!Modifier.isStatic(method.getModifiers())) {
                        wVarJ = i0Var.h() ? new qo.r(method, a5.l0.m(i0Var.F, i0Var.e())) : new qo.v(0, method);
                    } else if (((fq.a) i0Var.e()).getAnnotations().z(a2.f18058a) != null) {
                        wVarJ = i0Var.h() ? new qo.s(method) : new qo.v(1, method);
                    } else {
                        wVarJ = i0Var.j(method, false);
                    }
                }
                return a5.l0.o(wVarJ, i0Var.e(), false);
            default:
                up.b bVar3 = y1.f18196a;
                vo.u uVarE4 = i0Var.e();
                g0 g0Var2 = i0Var.f18097y;
                c9.a aVarC2 = y1.c(uVarE4);
                if (!(aVarC2 instanceof k)) {
                    if (aVarC2 instanceof j) {
                        if (i0Var.g()) {
                            Class<?> jClass4 = g0Var2.getJClass();
                            List parameters2 = i0Var.getParameters();
                            ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.l(parameters2, 10));
                            Iterator it4 = parameters2.iterator();
                            while (it4.hasNext()) {
                                String name2 = ((x0) ((mo.m) it4.next())).getName();
                                Intrinsics.checkNotNull(name2);
                                arrayList3.add(name2);
                            }
                            qo.a aVar2 = qo.a.f18925d;
                            qo.b bVar4 = qo.b.f18929d;
                            return new qo.c(jClass4, arrayList3, aVar2);
                        }
                        String desc2 = ((j) aVarC2).f18098h.f20875l;
                        g0Var2.getClass();
                        Intrinsics.checkNotNullParameter(desc2, "desc");
                        Class<?> jClass5 = g0Var2.getJClass();
                        ArrayList arrayList4 = new ArrayList();
                        g0.a(arrayList4, (ArrayList) g0Var2.k(desc2, false).f7966e, true);
                        Unit unit = Unit.f14616a;
                        try {
                            Class[] clsArr2 = (Class[]) arrayList4.toArray(new Class[0]);
                            declaredConstructor = jClass5.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr2, clsArr2.length));
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor = null;
                        }
                    } else if (aVarC2 instanceof g) {
                        List list2 = ((g) aVarC2).f18089h;
                        Class<?> jClass6 = g0Var2.getJClass();
                        ArrayList arrayList5 = new ArrayList(kotlin.collections.e0.l(list2, 10));
                        Iterator it5 = list2.iterator();
                        while (it5.hasNext()) {
                            arrayList5.add(((Method) it5.next()).getName());
                        }
                        return new qo.c(jClass6, arrayList5, qo.a.f18925d, qo.b.f18929d, list2);
                    }
                    declaredConstructor = null;
                    break;
                } else {
                    vo.u uVarE5 = i0Var.e();
                    vo.l lVarG3 = uVarE5.g();
                    Intrinsics.checkNotNullExpressionValue(lVarG3, "getContainingDeclaration(...)");
                    if (xp.g.d(lVarG3) && (uVarE5 instanceof vo.k) && ((vo.k) uVarE5).q()) {
                        throw new ar.a0(i0Var.e().g() + " cannot have default arguments");
                    }
                    vo.u uVarE6 = i0Var.e();
                    List listL3 = uVarE6.L();
                    Intrinsics.checkNotNullExpressionValue(listL3, "getValueParameters(...)");
                    if (listL3 == null || !listL3.isEmpty()) {
                        Iterator it6 = listL3.iterator();
                        while (true) {
                            if (!it6.hasNext()) {
                                lVarG = uVarE6.g();
                                Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
                                if (xp.g.f(lVarG)) {
                                    memberB = i0Var.b().b();
                                    Intrinsics.checkNotNull(memberB);
                                    if (Modifier.isStatic(memberB.getModifiers())) {
                                        dVar = new xq.d(bq.e.l(uVarE6));
                                        while (true) {
                                            if (dVar.hasNext()) {
                                                next = dVar.next();
                                                listL = ((vo.d) next).L();
                                                Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                                                if (listL != null || !listL.isEmpty()) {
                                                    it = listL.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            continue;
                                                        } else if (((yo.q0) it.next()).C0()) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        uVar = next instanceof vo.u ? (vo.u) next : null;
                                    }
                                }
                            } else if (((yo.q0) it6.next()).C0()) {
                            }
                        }
                    } else {
                        lVarG = uVarE6.g();
                        Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
                        if (xp.g.f(lVarG)) {
                            memberB = i0Var.b().b();
                            Intrinsics.checkNotNull(memberB);
                            if (Modifier.isStatic(memberB.getModifiers())) {
                                dVar = new xq.d(bq.e.l(uVarE6));
                                while (true) {
                                    if (dVar.hasNext()) {
                                        next = dVar.next();
                                        listL = ((vo.d) next).L();
                                        Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                                        if (listL != null) {
                                        }
                                        it = listL.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                continue;
                                            } else if (((yo.q0) it.next()).C0()) {
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                if (next instanceof vo.u) {
                                }
                            }
                        }
                    }
                    if (uVar != null) {
                        c9.a aVarC3 = y1.c(uVar);
                        Intrinsics.checkNotNull(aVarC3, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.JvmFunctionSignature.KotlinFunction");
                        tp.e eVar2 = ((k) aVarC3).f18102h;
                        declaredConstructor = g0Var2.b(eVar2.k, eVar2.f20875l, true);
                    } else {
                        tp.e eVar3 = ((k) aVarC2).f18102h;
                        String str2 = eVar3.k;
                        String str3 = eVar3.f20875l;
                        Member memberB2 = i0Var.b().b();
                        Intrinsics.checkNotNull(memberB2);
                        declaredConstructor = g0Var2.b(str2, str3, !Modifier.isStatic(memberB2.getModifiers()));
                    }
                }
                if (declaredConstructor instanceof Constructor) {
                    wVarJ2 = i0Var.i((Constructor) declaredConstructor, i0Var.e(), true);
                } else if (!(declaredConstructor instanceof Method)) {
                    wVarJ2 = null;
                } else if (((fq.a) i0Var.e()).getAnnotations().z(a2.f18058a) != null) {
                    vo.l lVarG4 = i0Var.e().g();
                    Intrinsics.checkNotNull(lVarG4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (((vo.f) lVarG4).o()) {
                        wVarJ2 = i0Var.j((Method) declaredConstructor, i0Var.b().c());
                    } else {
                        Method method2 = (Method) declaredConstructor;
                        wVarJ2 = i0Var.h() ? new qo.s(method2) : new qo.v(1, method2);
                    }
                } else {
                    wVarJ2 = i0Var.j((Method) declaredConstructor, i0Var.b().c());
                }
                if (wVarJ2 != null) {
                    return a5.l0.o(wVarJ2, i0Var.e(), true);
                }
                return null;
        }
    }
}
