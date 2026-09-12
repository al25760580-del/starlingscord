package ip;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import lq.b1;
import lq.z0;
import vo.l0;
import vo.o0;
import vo.u0;
import yo.h0;
import yo.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f13400e;

    public /* synthetic */ z(b0 b0Var, int i7) {
        this.f13399d = i7;
        this.f13400e = b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x018f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0277  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v29, types: [T, yo.h0] */
    /* JADX WARN: Type inference failed for: r9v4, types: [T, gp.f, java.lang.Object, yo.h0] */
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
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c8;
        boolean z5;
        lp.d hVar;
        lp.d zVar;
        int i7 = this.f13399d;
        b0 b0Var = this.f13400e;
        switch (i7) {
            case 0:
                up.e name = (up.e) obj;
                Intrinsics.checkNotNullParameter(name, "name");
                b0 b0Var2 = b0Var.f13321c;
                if (b0Var2 != null) {
                    return (Collection) b0Var2.f13324f.invoke(name);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((c) b0Var.f13323e.invoke()).d(name).iterator();
                while (it.hasNext()) {
                    gp.e eVarT = b0Var.t((bp.x) it.next());
                    if (b0Var.r(eVarT)) {
                        ((hp.a) b0Var.f13320b.f7980e).f10963g.getClass();
                        arrayList.add(eVarT);
                    }
                }
                b0Var.j(arrayList, name);
                return arrayList;
            case 1:
                up.e name2 = (up.e) obj;
                Intrinsics.checkNotNullParameter(name2, "name");
                b0 b0Var3 = b0Var.f13321c;
                if (b0Var3 != null) {
                    return (l0) b0Var3.f13325g.invoke(name2);
                }
                bp.u uVarB = ((c) b0Var.f13323e.invoke()).b(name2);
                if (uVarB != null) {
                    Field field = uVarB.f3370a;
                    if (!field.isEnumConstant()) {
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        boolean z6 = !Modifier.isFinal(((Field) uVarB.b()).getModifiers());
                        e4.i iVar = b0Var.f13320b;
                        hp.c cVarF = mf.f.F(iVar, uVarB);
                        hp.a aVar = (hp.a) iVar.f7980e;
                        vo.l lVarQ = b0Var.q();
                        o0 o0Var = vo.y.f21851d;
                        ep.p pVarB = ls.l.B(uVarB.e());
                        up.e eVarC = uVarB.c();
                        ap.f fVarC = aVar.j.c(uVarB);
                        int i10 = 0;
                        if (Modifier.isFinal(((Field) uVarB.b()).getModifiers()) && Modifier.isStatic(((Field) uVarB.b()).getModifiers())) {
                            c8 = 1;
                            z5 = true;
                        } else {
                            c8 = 1;
                            z5 = false;
                        }
                        ?? J0 = gp.f.J0(lVarQ, cVarF, pVarB, z6, eVarC, fVarC, z5);
                        Intrinsics.checkNotNullExpressionValue(J0, "create(...)");
                        objectRef.element = J0;
                        J0.F0(null, null, null, null);
                        e4.m mVar = (e4.m) iVar.f7983w;
                        Type type = field.getGenericType();
                        Intrinsics.checkNotNullExpressionValue(type, "getGenericType(...)");
                        Intrinsics.checkNotNullParameter(type, "type");
                        boolean z7 = type instanceof Class;
                        if (z7) {
                            Class cls = (Class) type;
                            if (cls.isPrimitive()) {
                                zVar = new bp.z(cls);
                            } else {
                                if (!(type instanceof GenericArrayType) || (z7 && ((Class) type).isArray())) {
                                    hVar = new bp.h(type);
                                } else {
                                    hVar = type instanceof WildcardType ? new bp.e0((WildcardType) type) : new bp.q(type);
                                }
                                zVar = hVar;
                            }
                        } else {
                            if (type instanceof GenericArrayType) {
                                hVar = new bp.h(type);
                            } else {
                                hVar = new bp.h(type);
                            }
                            zVar = hVar;
                        }
                        lq.z zVarM = mVar.M(zVar, xr.m.S(z0.f15271e, false, null, 7));
                        if ((so.i.G(zVarM) || so.i.H(zVarM)) && Modifier.isFinal(((Field) uVarB.b()).getModifiers())) {
                            Modifier.isStatic(((Field) uVarB.b()).getModifiers());
                        }
                        h0 h0Var = (h0) objectRef.element;
                        n0 n0Var = n0.f14659d;
                        h0Var.I0(zVarM, n0Var, b0Var.p(), null, n0Var);
                        vo.l lVarQ2 = b0Var.q();
                        vo.f fVar = lVarQ2 instanceof vo.f ? (vo.f) lVarQ2 : null;
                        if (fVar != null) {
                            objectRef.element = ((cq.a) aVar.f10978x).h(fVar, (h0) objectRef.element, iVar);
                        }
                        T t5 = objectRef.element;
                        u0 u0Var = (u0) t5;
                        lq.z type2 = ((h0) t5).getType();
                        if (u0Var == null) {
                            xp.e.a(65);
                            throw null;
                        }
                        if (type2 == null) {
                            xp.e.a(66);
                            throw null;
                        }
                        int i11 = xp.e.f22999a;
                        if (!u0Var.U() && !lq.c.j(type2)) {
                            if (b1.b(type2)) {
                                ((h0) objectRef.element).G0(null, new y(b0Var, uVarB, objectRef, i10));
                            } else {
                                so.i iVarE = bq.e.e(u0Var);
                                if (so.i.G(type2)) {
                                    ((h0) objectRef.element).G0(null, new y(b0Var, uVarB, objectRef, i10));
                                } else {
                                    mq.l lVar = mq.d.f16016a;
                                    if (lVar.a(iVarE.v(), type2) || lVar.a(iVarE.k("Number").j(), type2) || lVar.a(iVarE.e(), type2) || so.t.a(type2)) {
                                        ((h0) objectRef.element).G0(null, new y(b0Var, uVarB, objectRef, i10));
                                    }
                                }
                            }
                        }
                        fp.i iVar2 = aVar.f10963g;
                        l0 l0Var = (l0) objectRef.element;
                        iVar2.getClass();
                        if (l0Var != null) {
                            return (l0) objectRef.element;
                        }
                        Object[] objArr = new Object[3];
                        switch (6) {
                            case 1:
                                objArr[0] = "member";
                                break;
                            case 2:
                            case 4:
                            case 6:
                            case 8:
                                objArr[0] = "descriptor";
                                break;
                            case 3:
                                objArr[0] = "element";
                                break;
                            case 5:
                                objArr[0] = "field";
                                break;
                            case 7:
                                objArr[0] = "javaClass";
                                break;
                            default:
                                objArr[0] = "fqName";
                                break;
                        }
                        objArr[c8] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                        switch (6) {
                            case 1:
                            case 2:
                                objArr[2] = "recordMethod";
                                break;
                            case 3:
                            case 4:
                                objArr[2] = "recordConstructor";
                                break;
                            case 5:
                            case 6:
                                objArr[2] = "recordField";
                                break;
                            case 7:
                            case 8:
                                objArr[2] = "recordClass";
                                break;
                            default:
                                objArr[2] = "getClassResolvedFromSource";
                                break;
                        }
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
                }
                return null;
            case 2:
                up.e name3 = (up.e) obj;
                Intrinsics.checkNotNullParameter(name3, "name");
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) b0Var.f13324f.invoke(name3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : linkedHashSet) {
                    String strF = com.facebook.imagepipeline.nativecode.b.f((k0) obj2, 2);
                    Object arrayList2 = linkedHashMap.get(strF);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap.put(strF, arrayList2);
                    }
                    ((List) arrayList2).add(obj2);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        Collection collectionE = sa.a.E(list, n.f13366i);
                        linkedHashSet.removeAll(list);
                        linkedHashSet.addAll(collectionE);
                    }
                }
                b0Var.m(linkedHashSet, name3);
                e4.i iVar3 = b0Var.f13320b;
                return CollectionsKt.i0(((hp.a) iVar3.f7980e).f10972r.c(iVar3, linkedHashSet));
            default:
                up.e name4 = (up.e) obj;
                Intrinsics.checkNotNullParameter(name4, "name");
                ArrayList arrayList3 = new ArrayList();
                vq.m.b(arrayList3, b0Var.f13325g.invoke(name4));
                b0Var.n(arrayList3, name4);
                vo.l lVarQ3 = b0Var.q();
                int i12 = xp.e.f22999a;
                if (xp.e.n(lVarQ3, vo.g.f21812w)) {
                    return CollectionsKt.i0(arrayList3);
                }
                e4.i iVar4 = b0Var.f13320b;
                return CollectionsKt.i0(((hp.a) iVar4.f7980e).f10972r.c(iVar4, arrayList3));
        }
    }
}
