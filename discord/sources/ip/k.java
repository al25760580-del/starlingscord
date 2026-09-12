package ip;

import a5.i0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lq.z0;
import vo.r0;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements Function0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13357d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e4.i f13358e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p f13359i;

    public k(e4.i iVar, p pVar) {
        this.f13358e = iVar;
        this.f13359i = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v10, types: [ip.p] */
    /* JADX WARN: Type inference failed for: r2v14, types: [ip.p] */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [gp.b, java.lang.Object, yo.h, yo.s] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        p pVar;
        wo.f fVar;
        ?? arrayList;
        ?? r15;
        ?? r5;
        Pair pair;
        List listD;
        switch (this.f13357d) {
            case 0:
                p pVar2 = this.f13359i;
                bp.o oVar = pVar2.f13375o;
                e4.i iVar = pVar2.f13320b;
                vo.f fVar2 = pVar2.f13374n;
                Constructor<?>[] declaredConstructors = oVar.f3364a.getDeclaredConstructors();
                Intrinsics.checkNotNullExpressionValue(declaredConstructors, "getDeclaredConstructors(...)");
                List<bp.r> listQ = xq.r.q(xq.r.n(xq.r.i(kotlin.collections.y.o(declaredConstructors), bp.j.f3359d), bp.k.f3360d));
                ArrayList arrayList2 = new ArrayList(listQ.size());
                for (bp.r typeParameterOwner : listQ) {
                    hp.c cVarF = mf.f.F(iVar, typeParameterOwner);
                    hp.a aVar = (hp.a) iVar.f7980e;
                    gp.b containingDeclaration = gp.b.S0(fVar2, cVarF, false, aVar.j.c(typeParameterOwner));
                    Intrinsics.checkNotNullExpressionValue(containingDeclaration, "createJavaConstructor(...)");
                    int size = fVar2.l().size();
                    Intrinsics.checkNotNullParameter(iVar, "<this>");
                    Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
                    Intrinsics.checkNotNullParameter(typeParameterOwner, "typeParameterOwner");
                    e4.i iVar2 = new e4.i(aVar, new hp.e(iVar, containingDeclaration, typeParameterOwner, size), (Lazy) iVar.f7982v);
                    Constructor constructor = typeParameterOwner.f3368a;
                    Type[] genericParameterTypes = constructor.getGenericParameterTypes();
                    Intrinsics.checkNotNull(genericParameterTypes);
                    if (genericParameterTypes.length == 0) {
                        listD = n0.f14659d;
                    } else {
                        Class declaringClass = constructor.getDeclaringClass();
                        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
                            genericParameterTypes = (Type[]) kotlin.collections.w.j(genericParameterTypes, 1, genericParameterTypes.length);
                        }
                        Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
                        if (parameterAnnotations.length < genericParameterTypes.length) {
                            throw new IllegalStateException("Illegal generic signature: " + constructor);
                        }
                        if (parameterAnnotations.length > genericParameterTypes.length) {
                            Intrinsics.checkNotNull(parameterAnnotations);
                            parameterAnnotations = (Annotation[][]) kotlin.collections.w.j(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
                        }
                        Intrinsics.checkNotNull(genericParameterTypes);
                        Intrinsics.checkNotNull(parameterAnnotations);
                        listD = typeParameterOwner.d(genericParameterTypes, parameterAnnotations, constructor.isVarArgs());
                    }
                    i0 i0VarU = b0.u(iVar2, containingDeclaration, listD);
                    List listL = fVar2.l();
                    Intrinsics.checkNotNullExpressionValue(listL, "getDeclaredTypeParameters(...)");
                    ArrayList typeParameters = typeParameterOwner.getTypeParameters();
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.e0.l(typeParameters, 10));
                    Iterator it = typeParameters.iterator();
                    while (it.hasNext()) {
                        r0 r0VarA = ((hp.f) iVar2.f7981i).a((bp.c0) it.next());
                        Intrinsics.checkNotNull(r0VarA);
                        arrayList3.add(r0VarA);
                    }
                    containingDeclaration.Q0((List) i0VarU.f215i, ls.l.B(typeParameterOwner.e()), CollectionsKt.V(listL, arrayList3));
                    containingDeclaration.J0(false);
                    containingDeclaration.K0(i0VarU.f214e);
                    containingDeclaration.L0(fVar2.j());
                    ((hp.a) iVar2.f7980e).f10963g.getClass();
                    arrayList2.add(containingDeclaration);
                }
                boolean zG = oVar.g();
                Class cls = oVar.f3364a;
                e4.i iVar3 = this.f13358e;
                wo.f fVar3 = wo.g.f22379a;
                if (zG) {
                    gp.b bVarS0 = gp.b.S0(fVar2, fVar3, true, ((hp.a) iVar.f7980e).j.c(oVar));
                    Intrinsics.checkNotNullExpressionValue(bVarS0, "createJavaConstructor(...)");
                    ArrayList arrayListF = oVar.f();
                    ArrayList arrayList4 = new ArrayList(arrayListF.size());
                    pVar = pVar2;
                    jp.a aVarS = xr.m.S(z0.f15271e, false, null, 6);
                    int i7 = 0;
                    for (Iterator it2 = arrayListF.iterator(); it2.hasNext(); it2 = it2) {
                        bp.a0 a0Var = (bp.a0) it2.next();
                        gp.b bVar = bVarS0;
                        wo.f fVar4 = fVar3;
                        arrayList4.add(new q0(bVar, null, i7, fVar4, a0Var.c(), ((e4.m) iVar.f7983w).M(a0Var.f(), aVarS), false, false, false, null, ((hp.a) iVar.f7980e).j.c(a0Var)));
                        fVar3 = fVar4;
                        i7++;
                        bVarS0 = bVar;
                    }
                    yo.h hVar = bVarS0;
                    fVar = fVar3;
                    hVar.K0(false);
                    ep.p PROTECTED_AND_PACKAGE = fVar2.getVisibility();
                    Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "getVisibility(...)");
                    if (Intrinsics.areEqual(PROTECTED_AND_PACKAGE, ep.q.f8583b)) {
                        PROTECTED_AND_PACKAGE = ep.q.f8584c;
                        Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
                    }
                    hVar.P0(arrayList4, PROTECTED_AND_PACKAGE);
                    hVar.J0(false);
                    hVar.L0(fVar2.j());
                    String strF = com.facebook.imagepipeline.nativecode.b.f(hVar, 2);
                    if (arrayList2.isEmpty()) {
                        arrayList2.add(hVar);
                        ((hp.a) iVar3.f7980e).f10963g.getClass();
                    } else {
                        Iterator it3 = arrayList2.iterator();
                        do {
                            if (!it3.hasNext()) {
                                arrayList2.add(hVar);
                                ((hp.a) iVar3.f7980e).f10963g.getClass();
                            }
                        } while (!Intrinsics.areEqual(com.facebook.imagepipeline.nativecode.b.f((yo.h) it3.next(), 2), strF));
                    }
                } else {
                    pVar = pVar2;
                    fVar = fVar3;
                }
                ((cq.a) ((hp.a) iVar3.f7980e).f10978x).a(fVar2, arrayList2, iVar3);
                mp.o oVar2 = ((hp.a) iVar3.f7980e).f10972r;
                boolean zIsEmpty = arrayList2.isEmpty();
                List listH = arrayList2;
                if (zIsEmpty) {
                    boolean zIsAnnotation = cls.isAnnotation();
                    cls.isInterface();
                    if (zIsAnnotation) {
                        hp.a aVar2 = (hp.a) iVar.f7980e;
                        e4.m mVar = (e4.m) iVar.f7983w;
                        ?? S0 = gp.b.S0(fVar2, fVar, true, aVar2.j.c(oVar));
                        Intrinsics.checkNotNullExpressionValue(S0, "createJavaConstructor(...)");
                        if (zIsAnnotation) {
                            List listD2 = oVar.d();
                            arrayList = new ArrayList(listD2.size());
                            jp.a aVarS2 = xr.m.S(z0.f15271e, true, null, 6);
                            ArrayList arrayList5 = new ArrayList();
                            ArrayList<bp.x> arrayList6 = new ArrayList();
                            for (Object obj : listD2) {
                                if (Intrinsics.areEqual(((bp.x) obj).c(), ep.a0.f8489b)) {
                                    arrayList5.add(obj);
                                } else {
                                    arrayList6.add(obj);
                                }
                            }
                            arrayList5.size();
                            bp.x xVar = (bp.x) CollectionsKt.firstOrNull(arrayList5);
                            if (xVar != null) {
                                bp.b0 b0VarF = xVar.f();
                                if (b0VarF instanceof bp.h) {
                                    bp.h hVar2 = (bp.h) b0VarF;
                                    pair = new Pair(mVar.L(hVar2, aVarS2, true), mVar.M(hVar2.f3355b, aVarS2));
                                } else {
                                    pair = new Pair(mVar.M(b0VarF, aVarS2), null);
                                }
                                lq.z zVar = (lq.z) pair.f14612d;
                                lq.z zVar2 = (lq.z) pair.f14613e;
                                ?? r6 = pVar;
                                r6.v(arrayList, S0, 0, xVar, zVar, zVar2);
                                r5 = r6;
                            } else {
                                r5 = pVar;
                            }
                            int i10 = xVar != null ? 1 : 0;
                            int i11 = 0;
                            for (bp.x xVar2 : arrayList6) {
                                r5.v(arrayList, S0, i11 + i10, xVar2, mVar.M(xVar2.f(), aVarS2), null);
                                i11++;
                            }
                        } else {
                            arrayList = Collections.EMPTY_LIST;
                        }
                        S0.K0(false);
                        ep.p PROTECTED_AND_PACKAGE2 = fVar2.getVisibility();
                        Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE2, "getVisibility(...)");
                        if (Intrinsics.areEqual(PROTECTED_AND_PACKAGE2, ep.q.f8583b)) {
                            PROTECTED_AND_PACKAGE2 = ep.q.f8584c;
                            Intrinsics.checkNotNullExpressionValue(PROTECTED_AND_PACKAGE2, "PROTECTED_AND_PACKAGE");
                        }
                        S0.P0(arrayList, PROTECTED_AND_PACKAGE2);
                        S0.J0(true);
                        S0.L0(fVar2.j());
                        ((hp.a) iVar.f7980e).f10963g.getClass();
                        r15 = S0;
                    } else {
                        r15 = 0;
                    }
                    listH = kotlin.collections.d0.h(r15);
                }
                return CollectionsKt.i0(oVar2.c(iVar3, listH));
            default:
                e4.i iVar4 = this.f13358e;
                return CollectionsKt.l0(((cq.a) ((hp.a) iVar4.f7980e).f10978x).f(this.f13359i.f13374n, iVar4));
        }
    }

    public k(p pVar, e4.i iVar) {
        this.f13359i = pVar;
        this.f13358e = iVar;
    }
}
