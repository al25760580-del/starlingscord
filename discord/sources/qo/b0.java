package qo;

import a5.l0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.e0;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lq.d0;
import po.a2;
import po.g0;
import vo.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f18932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f18933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f18935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f18936e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    public b0(vo.u descriptor, g0 container, String constructorDesc, List originalParameters) {
        ?? C;
        Method methodZ;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
        Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
        Method methodC = container.c("constructor-impl", constructorDesc);
        Intrinsics.checkNotNull(methodC);
        this.f18932a = methodC;
        Method methodC2 = container.c("box-impl", StringsKt.O(constructorDesc, "V") + bp.c.b(container.getJClass()));
        Intrinsics.checkNotNull(methodC2);
        this.f18933b = methodC2;
        ArrayList arrayList = new ArrayList(e0.l(originalParameters, 10));
        Iterator it = originalParameters.iterator();
        while (true) {
            List listC = null;
            if (!it.hasNext()) {
                break;
            }
            lq.z type = ((j0) it.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            d0 d0VarB = lq.c.b(type);
            ArrayList arrayListA = l0.A(d0VarB);
            if (arrayListA == null) {
                Class clsQ = l0.Q(d0VarB);
                if (clsQ != null && (methodZ = l0.z(clsQ, descriptor)) != null) {
                    listC = kotlin.collections.c0.c(methodZ);
                }
            } else {
                listC = arrayListA;
            }
            arrayList.add(listC);
        }
        this.f18934c = arrayList;
        ArrayList arrayList2 = new ArrayList(e0.l(originalParameters, 10));
        int i7 = 0;
        for (Object obj : originalParameters) {
            int i10 = i7 + 1;
            if (i7 < 0) {
                kotlin.collections.d0.k();
                throw null;
            }
            vo.i iVarG = ((j0) obj).getType().r0().g();
            Intrinsics.checkNotNull(iVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            vo.f fVar = (vo.f) iVarG;
            List list = (List) this.f18934c.get(i7);
            if (list != null) {
                C = new ArrayList(e0.l(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C.add(((Method) it2.next()).getReturnType());
                }
            } else {
                Class clsK = a2.k(fVar);
                Intrinsics.checkNotNull(clsK);
                C = kotlin.collections.c0.c(clsK);
            }
            arrayList2.add(C);
            i7 = i10;
        }
        this.f18935d = arrayList2;
        this.f18936e = e0.m(arrayList2);
    }

    @Override // qo.g
    public final List a() {
        return this.f18936e;
    }

    @Override // qo.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // qo.g
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    @Override // qo.g
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        ?? C;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(args, "<this>");
        ArrayList other = this.f18934c;
        Intrinsics.checkNotNullParameter(other, "other");
        int length = args.length;
        ArrayList<Pair> arrayList = new ArrayList(Math.min(e0.l(other, 10), length));
        int i7 = 0;
        for (Object obj : other) {
            if (i7 >= length) {
                break;
            }
            arrayList.add(new Pair(args[i7], obj));
            i7++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            Object obj2 = pair.f14612d;
            List list = (List) pair.f14613e;
            if (list != null) {
                C = new ArrayList(e0.l(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C.add(((Method) it.next()).invoke(obj2, null));
                }
            } else {
                C = kotlin.collections.c0.c(obj2);
            }
            i0.o(arrayList2, C);
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        this.f18932a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f18933b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // qo.g
    public final Type getReturnType() {
        Class<?> returnType = this.f18933b.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return returnType;
    }
}
