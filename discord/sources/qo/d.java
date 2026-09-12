package qo;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f18951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rn.u f18952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rn.u f18953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f18954e;

    public d(Class cls, Map map, rn.u uVar, rn.u uVar2, List list) {
        this.f18950a = cls;
        this.f18951b = map;
        this.f18952c = uVar;
        this.f18953d = uVar2;
        this.f18954e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zAreEqual;
        boolean z5;
        KClass kClassZ;
        String name = method.getName();
        Class cls = this.f18950a;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.f18953d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.f18952c.getValue();
            }
        }
        boolean zAreEqual2 = Intrinsics.areEqual(name, "equals");
        Map map = this.f18951b;
        boolean z6 = false;
        if (!zAreEqual2 || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(kotlin.collections.y.H(objArr));
            sb2.append(')');
            throw new ar.a0(sb2.toString());
        }
        Object objD = kotlin.collections.y.D(objArr);
        Annotation annotation = objD instanceof Annotation ? (Annotation) objD : null;
        if (Intrinsics.areEqual((annotation == null || (kClassZ = gn.h.z(annotation)) == null) ? null : gn.h.B(kClassZ), cls)) {
            List list = this.f18954e;
            if (list != null && list.isEmpty()) {
                z5 = true;
                break;
            }
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = true;
                    break;
                }
                Method method2 = (Method) it.next();
                Object obj2 = map.get(method2.getName());
                Object objInvoke = method2.invoke(objD, null);
                if (obj2 instanceof boolean[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                    zAreEqual = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                } else if (obj2 instanceof char[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                    zAreEqual = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                } else if (obj2 instanceof byte[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                    zAreEqual = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                } else if (obj2 instanceof short[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                    zAreEqual = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                } else if (obj2 instanceof int[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                    zAreEqual = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                } else if (obj2 instanceof float[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                    zAreEqual = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                } else if (obj2 instanceof long[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                    zAreEqual = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                } else if (obj2 instanceof double[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                    zAreEqual = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                } else if (obj2 instanceof Object[]) {
                    Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                    zAreEqual = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                } else {
                    zAreEqual = Intrinsics.areEqual(obj2, objInvoke);
                }
                if (!zAreEqual) {
                    z5 = false;
                    break;
                }
            }
            if (z5) {
                z6 = true;
            }
        }
        return Boolean.valueOf(z6);
    }
}
