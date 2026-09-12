package qo;

import a5.l0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import lq.d0;
import lq.e1;
import lq.y0;
import po.a2;
import yo.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f18945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Member f18946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n8.f f18947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IntRange[] f18948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f18949f;

    /* JADX WARN: Code duplicated, block: B:140:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:179:0x00e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0079 A[LOOP:1: B:25:0x0073->B:27:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e  */
    /* JADX WARN: Code duplicated, block: B:98:0x01ed  */
    public c0(g oldCaller, vo.d descriptor, boolean z5) {
        Class clsQ;
        Method declaredMethod;
        boolean z6;
        boolean z7;
        n8.f fVar;
        List listA;
        Method methodZ;
        ArrayList arrayList;
        Iterator it;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(oldCaller, "oldCaller");
        this.f18944a = z5;
        boolean z10 = false;
        if (oldCaller instanceof t) {
            yo.t tVarV = descriptor.V();
            tVarV = tVarV == null ? descriptor.S() : tVarV;
            lq.z type = tVarV != null ? tVarV.getType() : null;
            if (type != null && xp.g.h(type)) {
                if (z5) {
                    List listL = descriptor.L();
                    Intrinsics.checkNotNullExpressionValue(listL, "getValueParameters(...)");
                    if (listL == null || !listL.isEmpty()) {
                        Iterator it2 = listL.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((q0) it2.next()).C0()) {
                                    ArrayList arrayListA = l0.A(lq.c.b(type));
                                    Intrinsics.checkNotNull(arrayListA);
                                    arrayList = new ArrayList(e0.l(arrayListA, 10));
                                    it = arrayListA.iterator();
                                    while (it.hasNext()) {
                                        arrayList.add(((Method) it.next()).invoke(((t) oldCaller).f18967h, null));
                                    }
                                    oldCaller = new u((Method) ((q) oldCaller).f18970a, arrayList.toArray(new Object[0]));
                                }
                            }
                        }
                    }
                } else {
                    ArrayList arrayListA2 = l0.A(lq.c.b(type));
                    Intrinsics.checkNotNull(arrayListA2);
                    arrayList = new ArrayList(e0.l(arrayListA2, 10));
                    it = arrayListA2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Method) it.next()).invoke(((t) oldCaller).f18967h, null));
                    }
                    oldCaller = new u((Method) ((q) oldCaller).f18970a, arrayList.toArray(new Object[0]));
                }
            }
        }
        this.f18945b = oldCaller;
        this.f18946c = oldCaller.b();
        lq.z returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        boolean z11 = descriptor instanceof vo.u;
        if (z11 && ((vo.u) descriptor).isSuspend()) {
            int i7 = xp.g.f23000a;
            Intrinsics.checkNotNullParameter(returnType, "<this>");
            d0 d0VarI = xp.g.i(returnType);
            lq.z zVarJ = d0VarI != null ? y0.d(returnType).j(d0VarI, e1.INVARIANT) : null;
            if (zVarJ == null || !so.i.G(zVarJ)) {
                clsQ = l0.Q(returnType);
                if (clsQ != null) {
                    declaredMethod = clsQ.getDeclaredMethod("box-impl", l0.z(clsQ, descriptor).getReturnType());
                    Intrinsics.checkNotNull(declaredMethod);
                } else {
                    declaredMethod = null;
                }
            } else {
                declaredMethod = null;
            }
        } else {
            clsQ = l0.Q(returnType);
            if (clsQ != null) {
                try {
                    declaredMethod = clsQ.getDeclaredMethod("box-impl", l0.z(clsQ, descriptor).getReturnType());
                    Intrinsics.checkNotNull(declaredMethod);
                } catch (NoSuchMethodException unused) {
                    throw new ar.a0("No box method found in inline class: " + clsQ + " (calling " + descriptor + ')');
                }
            } else {
                declaredMethod = null;
            }
        }
        if (xp.g.a(descriptor)) {
            IntRange.f14685w.getClass();
            fVar = new n8.f(IntRange.f14686x, new List[0], declaredMethod);
        } else {
            int i10 = -1;
            if ((!(oldCaller instanceof t) || ((t) oldCaller).f18966g) && !(oldCaller instanceof u)) {
                if (descriptor instanceof vo.k) {
                    if (!(oldCaller instanceof f)) {
                        i10 = 0;
                    }
                } else if (descriptor.S() == null || (oldCaller instanceof f)) {
                    i10 = 0;
                } else {
                    vo.l lVarG = descriptor.g();
                    Intrinsics.checkNotNullExpressionValue(lVarG, "getContainingDeclaration(...)");
                    if (xp.g.f(lVarG)) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                }
            }
            int i11 = oldCaller instanceof u ? -((u) oldCaller).f18968g.length : i10;
            Member memberB = oldCaller.b();
            ArrayList arrayList2 = new ArrayList();
            yo.t tVarV2 = descriptor.V();
            lq.z type2 = tVarV2 != null ? tVarV2.getType() : null;
            if (type2 != null) {
                arrayList2.add(type2);
            } else if (descriptor instanceof vo.k) {
                vo.f fVarR = ((vo.k) descriptor).r();
                Intrinsics.checkNotNullExpressionValue(fVarR, "getConstructedClass(...)");
                if (fVarR.z()) {
                    vo.l lVarG2 = fVarR.g();
                    Intrinsics.checkNotNull(lVarG2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    arrayList2.add(((vo.f) lVarG2).j());
                }
            } else {
                vo.l lVarG3 = descriptor.g();
                Intrinsics.checkNotNullExpressionValue(lVarG3, "getContainingDeclaration(...)");
                if (lVarG3 instanceof vo.f) {
                    vo.f makeKotlinParameterTypes = (vo.f) lVarG3;
                    Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
                    if (xp.g.f(makeKotlinParameterTypes)) {
                        if (memberB == null) {
                            z6 = false;
                        } else {
                            Class<?> declaringClass = memberB.getDeclaringClass();
                            if (declaringClass == null) {
                                z7 = false;
                            } else {
                                Intrinsics.checkNotNullParameter(declaringClass, "<this>");
                                z7 = !Reflection.getOrCreateKotlinClass(declaringClass).isValue();
                            }
                            if (z7) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                        }
                        if (z6) {
                            d0 d0VarJ = makeKotlinParameterTypes.j();
                            Intrinsics.checkNotNullExpressionValue(d0VarJ, "getDefaultType(...)");
                            arrayList2.add(c9.a.B(d0VarJ));
                        } else {
                            arrayList2.add(makeKotlinParameterTypes.j());
                        }
                    }
                }
            }
            List listL2 = descriptor.L();
            Intrinsics.checkNotNullExpressionValue(listL2, "getValueParameters(...)");
            Iterator it3 = listL2.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((q0) it3.next()).getType());
            }
            Iterator it4 = arrayList2.iterator();
            int size = 0;
            while (it4.hasNext()) {
                ArrayList arrayListA3 = l0.A(lq.c.b((lq.z) it4.next()));
                size += arrayListA3 != null ? arrayListA3.size() : 1;
            }
            int i12 = size + i11 + (this.f18944a ? ((size + 31) / 32) + 1 : 0) + ((z11 && ((vo.u) descriptor).isSuspend()) ? 1 : 0);
            boolean z12 = this.f18944a;
            if (a.a.j(this) != i12) {
                throw new ar.a0("Inconsistent number of parameters in the descriptor and Java reflection object: " + a.a.j(this) + " != " + i12 + "\nCalling: " + descriptor + "\nParameter types: " + this.f18945b.a() + ")\nDefault: " + z12);
            }
            IntRange intRangeI = lo.j.i(Math.max(i10, 0), arrayList2.size() + i10);
            List[] listArr = new List[i12];
            int i13 = 0;
            while (i13 < i12) {
                if (i13 <= intRangeI.f14689e && intRangeI.f14688d <= i13) {
                    d0 d0VarB = lq.c.b((lq.z) arrayList2.get(i13 - i10));
                    listA = l0.A(d0VarB);
                    if (listA == null) {
                        Class clsQ2 = l0.Q(d0VarB);
                        if (clsQ2 == null || (methodZ = l0.z(clsQ2, descriptor)) == null) {
                            listA = null;
                        } else {
                            listA = kotlin.collections.c0.c(methodZ);
                        }
                    }
                } else {
                    listA = null;
                }
                listArr[i13] = listA;
                i13++;
            }
            fVar = new n8.f(intRangeI, listArr, declaredMethod);
        }
        this.f18947d = fVar;
        sn.e eVarB = kotlin.collections.c0.b();
        g gVar = this.f18945b;
        int length = gVar instanceof u ? ((u) gVar).f18968g.length : gVar instanceof t ? 1 : 0;
        if (length > 0) {
            eVarB.add(lo.j.i(0, length));
        }
        List[] listArr2 = (List[]) fVar.f16512v;
        int length2 = listArr2.length;
        int i14 = 0;
        while (i14 < length2) {
            List list = listArr2[i14];
            int size2 = (list != null ? list.size() : 1) + length;
            eVarB.add(lo.j.i(length, size2));
            i14++;
            length = size2;
        }
        this.f18948e = (IntRange[]) kotlin.collections.c0.a(eVarB).toArray(new IntRange[0]);
        Iterable iterable = (IntRange) this.f18947d.f16510e;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it5 = iterable.iterator();
            while (((lo.b) it5).f15156i) {
                List list2 = ((List[]) this.f18947d.f16512v)[((s0) it5).nextInt()];
                if (list2 != null && list2.size() > 1) {
                    z10 = true;
                    break;
                }
            }
        }
        this.f18949f = z10;
    }

    @Override // qo.g
    public final List a() {
        return this.f18945b.a();
    }

    @Override // qo.g
    public final Member b() {
        return this.f18946c;
    }

    @Override // qo.g
    public final boolean c() {
        return this.f18945b instanceof r;
    }

    @Override // qo.g
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objE;
        Object objE2;
        Intrinsics.checkNotNullParameter(args, "args");
        n8.f fVar = this.f18947d;
        IntRange intRange = (IntRange) fVar.f16510e;
        List[] listArr = (List[]) fVar.f16512v;
        Method method = (Method) fVar.f16511i;
        boolean zIsEmpty = intRange.isEmpty();
        int i7 = intRange.f14689e;
        int i10 = intRange.f14688d;
        if (!zIsEmpty) {
            if (this.f18949f) {
                sn.e eVar = new sn.e(args.length);
                for (int i11 = 0; i11 < i10; i11++) {
                    eVar.add(args[i11]);
                }
                if (i10 <= i7) {
                    while (true) {
                        List<Method> list = listArr[i10];
                        Object obj = args[i10];
                        if (list != null) {
                            for (Method method2 : list) {
                                if (obj != null) {
                                    objE2 = method2.invoke(obj, null);
                                } else {
                                    Class<?> returnType = method2.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    objE2 = a2.e(returnType);
                                }
                                eVar.add(objE2);
                            }
                        } else {
                            eVar.add(obj);
                        }
                        if (i10 == i7) {
                            break;
                        }
                        i10++;
                    }
                }
                int i12 = i7 + 1;
                Intrinsics.checkNotNullParameter(args, "<this>");
                int length = args.length - 1;
                if (i12 <= length) {
                    while (true) {
                        eVar.add(args[i12]);
                        if (i12 == length) {
                            break;
                        }
                        i12++;
                    }
                }
                args = kotlin.collections.c0.a(eVar).toArray(new Object[0]);
            } else {
                int length2 = args.length;
                Object[] objArr = new Object[length2];
                for (int i13 = 0; i13 < length2; i13++) {
                    if (i13 > i7 || i10 > i13) {
                        objE = args[i13];
                    } else {
                        List list2 = listArr[i13];
                        Method method3 = list2 != null ? (Method) CollectionsKt.Z(list2) : null;
                        objE = args[i13];
                        if (method3 != null) {
                            if (objE != null) {
                                objE = method3.invoke(objE, null);
                            } else {
                                Class<?> returnType2 = method3.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                objE = a2.e(returnType2);
                            }
                        }
                    }
                    objArr[i13] = objE;
                }
                args = objArr;
            }
        }
        Object objCall = this.f18945b.call(args);
        return (objCall == wn.a.f22354d || method == null || (objInvoke = method.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    public final IntRange d(int i7) {
        IntRange[] intRangeArr = this.f18948e;
        if (i7 >= 0 && i7 < intRangeArr.length) {
            return intRangeArr[i7];
        }
        if (intRangeArr.length == 0) {
            return new IntRange(i7, i7, 1);
        }
        int length = ((IntRange) kotlin.collections.y.B(intRangeArr)).f14689e + 1 + (i7 - intRangeArr.length);
        return new IntRange(length, length, 1);
    }

    @Override // qo.g
    public final Type getReturnType() {
        return this.f18945b.getReturnType();
    }
}
