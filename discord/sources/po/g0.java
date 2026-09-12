package po;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 implements ClassBasedDeclarationContainer {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Regex f18090d = new Regex("<v#(\\d+)>");

    public static void a(ArrayList arrayList, ArrayList arrayList2, boolean z5) {
        boolean zAreEqual = Intrinsics.areEqual(CollectionsKt.S(arrayList2), DefaultConstructorMarker.class);
        List listSubList = arrayList2;
        if (zAreEqual) {
            listSubList = arrayList2.subList(0, arrayList2.size() - 1);
        }
        arrayList.addAll(listSubList);
        int size = (listSubList.size() + 31) / 32;
        for (int i7 = 0; i7 < size; i7++) {
            Class TYPE = Integer.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            arrayList.add(TYPE);
        }
        Class cls = z5 ? DefaultConstructorMarker.class : Object.class;
        Intrinsics.checkNotNull(cls);
        arrayList.add(cls);
    }

    public static Method j(Class cls, String str, Class[] clsArr, Class cls2, boolean z5) {
        Class clsD;
        Method methodJ;
        if (z5) {
            clsArr[0] = cls;
        }
        Method methodM = m(cls, str, clsArr, cls2);
        if (methodM != null) {
            return methodM;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodJ = j(superclass, str, clsArr, cls2, z5)) != null) {
            return methodJ;
        }
        Iterator it = ArrayIteratorKt.iterator(cls.getInterfaces());
        while (it.hasNext()) {
            Class cls3 = (Class) it.next();
            Intrinsics.checkNotNull(cls3);
            Method methodJ2 = j(cls3, str, clsArr, cls2, z5);
            if (methodJ2 != null) {
                return methodJ2;
            }
            if (z5 && (clsD = a.a.D(bp.c.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodM2 = m(clsD, str, clsArr, cls2);
                if (methodM2 != null) {
                    return methodM2;
                }
            }
        }
        return null;
    }

    public static Method m(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (Intrinsics.areEqual(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            Method[] declaredMethods = cls.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (Intrinsics.areEqual(method.getName(), str) && Intrinsics.areEqual(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final Method b(String name, String desc, boolean z5) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z5) {
            arrayList.add(getJClass());
        }
        e4.c cVarK = k(desc, true);
        a(arrayList, (ArrayList) cVarK.f7966e, false);
        Class clsH = h();
        String strJ = kk.b.j(name, "$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class cls = (Class) cVarK.f7967i;
        Intrinsics.checkNotNull(cls);
        return j(clsH, strJ, clsArr, cls, z5);
    }

    public final Method c(String name, String desc) {
        Method methodJ;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        if (Intrinsics.areEqual(name, "<init>")) {
            return null;
        }
        e4.c cVarK = k(desc, true);
        Class[] clsArr = (Class[]) ((ArrayList) cVarK.f7966e).toArray(new Class[0]);
        Class cls = (Class) cVarK.f7967i;
        Intrinsics.checkNotNull(cls);
        Method methodJ2 = j(h(), name, clsArr, cls, false);
        if (methodJ2 != null) {
            return methodJ2;
        }
        if (!h().isInterface() || (methodJ = j(Object.class, name, clsArr, cls, false)) == null) {
            return null;
        }
        return methodJ;
    }

    public abstract Collection d();

    public abstract Collection e(up.e eVar);

    public abstract vo.l0 f(int i7);

    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    public final List g(eq.o scope, e0 belonginess) {
        s sVar;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(belonginess, "belonginess");
        f0 f0Var = new f0(this);
        Collection<vo.l> collectionM = sa.a.m(scope, null, 3);
        ArrayList arrayList = new ArrayList();
        for (vo.l lVar : collectionM) {
            if (lVar instanceof vo.d) {
                vo.d member = (vo.d) lVar;
                if (Intrinsics.areEqual(member.getVisibility(), vo.p.f21831h)) {
                    sVar = null;
                } else {
                    Intrinsics.checkNotNullParameter(member, "member");
                    vo.c cVarC = member.c();
                    cVarC.getClass();
                    if ((cVarC != vo.c.f21793e) == (belonginess == e0.f18083d)) {
                        sVar = (s) lVar.i0(f0Var, Unit.f14616a);
                    } else {
                        sVar = null;
                    }
                }
            } else {
                sVar = null;
            }
            if (sVar != null) {
                arrayList.add(sVar);
            }
        }
        return CollectionsKt.i0(arrayList);
    }

    public Class h() {
        Class<?> jClass = getJClass();
        List list = bp.c.f3339a;
        Intrinsics.checkNotNullParameter(jClass, "<this>");
        Class cls = (Class) bp.c.f3341c.get(jClass);
        return cls == null ? getJClass() : cls;
    }

    public abstract Collection i(up.e eVar);

    public final e4.c k(String str, boolean z5) {
        int I;
        ArrayList arrayList = new ArrayList();
        int i7 = 1;
        while (str.charAt(i7) != ')') {
            int i10 = i7;
            while (str.charAt(i10) == '[') {
                i10++;
            }
            char cCharAt = str.charAt(i10);
            if (StringsKt.E("VZCBSIFJD", cCharAt)) {
                I = i10 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new ar.a0("Unknown type prefix in the method signature: ".concat(str));
                }
                I = StringsKt.I(str, ';', i7, 4) + 1;
            }
            arrayList.add(l(i7, I, str));
            i7 = I;
        }
        return new e4.c(arrayList, z5 ? l(i7 + 1, str.length(), str) : null);
    }

    public final Class l(int i7, int i10, String str) throws ClassNotFoundException {
        char cCharAt = str.charAt(i7);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            ClassLoader classLoaderD = bp.c.d(getJClass());
            String strSubstring = str.substring(i7 + 1, i10 - 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Class<?> clsLoadClass = classLoaderD.loadClass(kotlin.text.x.m(strSubstring, '/', '.'));
            Intrinsics.checkNotNullExpressionValue(clsLoadClass, "loadClass(...)");
            return clsLoadClass;
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            Class TYPE = Void.TYPE;
            Intrinsics.checkNotNullExpressionValue(TYPE, "TYPE");
            return TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            Class clsL = l(i7 + 1, i10, str);
            up.c cVar = a2.f18058a;
            Intrinsics.checkNotNullParameter(clsL, "<this>");
            return Array.newInstance((Class<?>) clsL, 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new ar.a0("Unknown type prefix in the method signature: ".concat(str));
        }
    }
}
