package po;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference;
import kotlin.jvm.internal.RepeatableContainer;
import kotlin.reflect.KCallable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final up.c f18058a = new up.c("kotlin.jvm.JvmStatic");

    public static final s a(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar;
        }
        i0 i0VarB = b(obj);
        return i0VarB != null ? i0VarB : c(obj);
    }

    public static final i0 b(Object obj) {
        i0 i0Var = obj instanceof i0 ? (i0) obj : null;
        if (i0Var != null) {
            return i0Var;
        }
        FunctionReference functionReference = obj instanceof FunctionReference ? (FunctionReference) obj : null;
        KCallable kCallableCompute = functionReference != null ? functionReference.compute() : null;
        if (kCallableCompute instanceof i0) {
            return (i0) kCallableCompute;
        }
        return null;
    }

    public static final n1 c(Object obj) {
        n1 n1Var = obj instanceof n1 ? (n1) obj : null;
        if (n1Var != null) {
            return n1Var;
        }
        PropertyReference propertyReference = obj instanceof PropertyReference ? (PropertyReference) obj : null;
        KCallable kCallableCompute = propertyReference != null ? propertyReference.compute() : null;
        if (kCallableCompute instanceof n1) {
            return (n1) kCallableCompute;
        }
        return null;
    }

    public static final ArrayList d(wo.a aVar) throws IllegalAccessException, InvocationTargetException {
        List listC;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        wo.h annotations = aVar.getAnnotations();
        ArrayList<Annotation> arrayList = new ArrayList();
        Iterator it = annotations.iterator();
        while (true) {
            Annotation annotationJ = null;
            if (!it.hasNext()) {
                break;
            }
            wo.b bVar = (wo.b) it.next();
            vo.n0 n0VarD = bVar.d();
            if (n0VarD instanceof ap.a) {
                annotationJ = ((ap.a) n0VarD).f2855d;
            } else if (n0VarD instanceof ap.f) {
                bp.s sVar = ((ap.f) n0VarD).f2863d;
                bp.d dVar = sVar instanceof bp.d ? (bp.d) sVar : null;
                if (dVar != null) {
                    annotationJ = dVar.f3344a;
                }
            } else {
                annotationJ = j(bVar);
            }
            if (annotationJ != null) {
                arrayList.add(annotationJ);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.areEqual(gn.h.B(gn.h.z((Annotation) it2.next())).getSimpleName(), "Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Annotation annotation : arrayList) {
                        Class clsB = gn.h.B(gn.h.z(annotation));
                        if (!Intrinsics.areEqual(clsB.getSimpleName(), "Container") || clsB.getAnnotation(RepeatableContainer.class) == null) {
                            listC = kotlin.collections.c0.c(annotation);
                        } else {
                            Object objInvoke = clsB.getDeclaredMethod("value", null).invoke(annotation, null);
                            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listC = kotlin.collections.w.b((Annotation[]) objInvoke);
                        }
                        kotlin.collections.i0.o(arrayList2, listC);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final Object e(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (Intrinsics.areEqual(cls, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (Intrinsics.areEqual(cls, Character.TYPE)) {
            return (char) 0;
        }
        if (Intrinsics.areEqual(cls, Byte.TYPE)) {
            return (byte) 0;
        }
        if (Intrinsics.areEqual(cls, Short.TYPE)) {
            return (short) 0;
        }
        if (Intrinsics.areEqual(cls, Integer.TYPE)) {
            return 0;
        }
        if (Intrinsics.areEqual(cls, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (Intrinsics.areEqual(cls, Long.TYPE)) {
            return 0L;
        }
        if (Intrinsics.areEqual(cls, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (Intrinsics.areEqual(cls, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final vo.b f(Class moduleAnchor, vp.k proto, rp.f nameResolver, pf.b typeTable, rp.a metadataVersion, Function2 createDescriptor) {
        List list;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        ap.e eVarA = t1.a(moduleAnchor);
        if (proto instanceof pp.a0) {
            list = ((pp.a0) proto).F;
        } else {
            if (!(proto instanceof pp.i0)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            list = ((pp.i0) proto).F;
        }
        List list2 = list;
        hq.j jVar = eVarA.f2861a;
        vo.z zVar = jVar.f11020b;
        rp.g gVar = rp.g.f19539b;
        Intrinsics.checkNotNull(list2);
        return (vo.b) createDescriptor.invoke(new hq.t(new bc.k(jVar, nameResolver, zVar, typeTable, gVar, metadataVersion, null, null, list2)), proto);
    }

    public static final yo.t g(vo.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar.S() == null) {
            return null;
        }
        vo.l lVarG = bVar.g();
        Intrinsics.checkNotNull(lVarG, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((vo.f) lVarG).u0();
    }

    public static final boolean h(q1 q1Var) {
        Intrinsics.checkNotNullParameter(q1Var, "<this>");
        lq.z zVar = q1Var.f18132d;
        return zVar != null && xp.g.h(zVar);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class i(ClassLoader classLoader, up.b bVar, int i7) {
        String str = uo.d.f21197a;
        up.b bVarF = uo.d.f(bVar.a().f21262a);
        if (bVarF != null) {
            bVar = bVarF;
        }
        String str2 = bVar.f21258a.f21262a.f21265a;
        String str3 = bVar.f21259b.f21262a.f21265a;
        if (Intrinsics.areEqual(str2, "kotlin")) {
            switch (str3.hashCode()) {
                case -901856463:
                    if (str3.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str3.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str3.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str3.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str3.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str3.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str3.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str3.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str3.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        if (i7 > 0) {
            for (int i10 = 0; i10 < i7; i10++) {
                sb2.append("[");
            }
            sb2.append("L");
        }
        if (str2.length() > 0) {
            sb2.append(str2.concat("."));
        }
        sb2.append(kotlin.text.x.m(str3, '.', '$'));
        if (i7 > 0) {
            sb2.append(";");
        }
        return a.a.D(classLoader, sb2.toString());
    }

    public static final Annotation j(wo.b bVar) {
        vo.f fVarD = bq.e.d(bVar);
        Class clsK = fVarD != null ? k(fVarD) : null;
        if (clsK == null) {
            clsK = null;
        }
        if (clsK == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = bVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            up.e eVar = (up.e) entry.getKey();
            zp.g gVar = (zp.g) entry.getValue();
            ClassLoader classLoader = clsK.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object objL = l(gVar, classLoader);
            Pair pair = objL != null ? new Pair(eVar.b(), objL) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        Map mapL = kotlin.collections.w0.l(arrayList);
        Set setKeySet = mapL.keySet();
        ArrayList arrayList2 = new ArrayList(kotlin.collections.e0.l(setKeySet, 10));
        Iterator it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList2.add(clsK.getDeclaredMethod((String) it.next(), null));
        }
        return (Annotation) yk.a.h(clsK, mapL, arrayList2);
    }

    public static final Class k(vo.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        vo.n0 n0VarD = fVar.d();
        Intrinsics.checkNotNullExpressionValue(n0VarD, "getSource(...)");
        if (n0VarD instanceof np.o) {
            ap.b bVar = ((np.o) n0VarD).f17016d;
            Intrinsics.checkNotNull(bVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return bVar.f2856a;
        }
        if (n0VarD instanceof ap.f) {
            bp.s sVar = ((ap.f) n0VarD).f2863d;
            Intrinsics.checkNotNull(sVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((bp.o) sVar).f3364a;
        }
        up.b bVarF = bq.e.f(fVar);
        if (bVarF == null) {
            return null;
        }
        return i(bp.c.d(fVar.getClass()), bVarF, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l(zp.g gVar, ClassLoader classLoader) {
        lq.z zVar;
        Class clsI;
        if (gVar instanceof zp.a) {
            return j((wo.b) ((zp.a) gVar).f24066a);
        }
        int i7 = 0;
        if (gVar instanceof zp.b) {
            zp.b bVar = (zp.b) gVar;
            zp.y yVar = bVar instanceof zp.y ? (zp.y) bVar : null;
            if (yVar != null && (zVar = yVar.f24076c) != null) {
                Object obj = bVar.f24066a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(kotlin.collections.e0.l(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(l((zp.g) it.next(), classLoader));
                }
                up.e eVar = so.i.f20342e;
                vo.i iVarG = zVar.r0().g();
                so.k kVarS = iVarG == null ? null : so.i.s(iVarG);
                switch (kVarS == null ? -1 : z1.f18197a[kVarS.ordinal()]) {
                    case -1:
                        if (!so.i.z(zVar)) {
                            throw new IllegalStateException(("Not an array type: " + zVar).toString());
                        }
                        lq.z zVarB = ((lq.t0) CollectionsKt.Z(zVar.l0())).b();
                        Intrinsics.checkNotNullExpressionValue(zVarB, "getType(...)");
                        vo.i iVarG2 = zVarB.r0().g();
                        vo.f fVar = iVarG2 instanceof vo.f ? (vo.f) iVarG2 : null;
                        if (fVar == null) {
                            throw new IllegalStateException(("Not a class type: " + zVarB).toString());
                        }
                        if (so.i.H(zVarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i7 < size) {
                                Object obj2 = arrayList.get(i7);
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i7] = obj2;
                                i7++;
                            }
                            return strArr;
                        }
                        if (so.i.b(fVar, so.o.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i7 < size2) {
                                Object obj3 = arrayList.get(i7);
                                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i7] = obj3;
                                i7++;
                            }
                            return clsArr;
                        }
                        up.b bVarF = bq.e.f(fVar);
                        if (bVarF != null && (clsI = i(classLoader, bVarF, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsI, ((List) obj).size());
                            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i7 < size3) {
                                objArr[i7] = arrayList.get(i7);
                                i7++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new rn.n();
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i7 < size4) {
                            Object obj4 = arrayList.get(i7);
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i7] = ((Boolean) obj4).booleanValue();
                            i7++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i7 < size5) {
                            Object obj5 = arrayList.get(i7);
                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i7] = ((Character) obj5).charValue();
                            i7++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i7 < size6) {
                            Object obj6 = arrayList.get(i7);
                            Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i7] = ((Byte) obj6).byteValue();
                            i7++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i7 < size7) {
                            Object obj7 = arrayList.get(i7);
                            Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i7] = ((Short) obj7).shortValue();
                            i7++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i7 < size8) {
                            Object obj8 = arrayList.get(i7);
                            Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i7] = ((Integer) obj8).intValue();
                            i7++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i7 < size9) {
                            Object obj9 = arrayList.get(i7);
                            Intrinsics.checkNotNull(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i7] = ((Float) obj9).floatValue();
                            i7++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i7 < size10) {
                            Object obj10 = arrayList.get(i7);
                            Intrinsics.checkNotNull(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i7] = ((Long) obj10).longValue();
                            i7++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i7 < size11) {
                            Object obj11 = arrayList.get(i7);
                            Intrinsics.checkNotNull(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i7] = ((Double) obj11).doubleValue();
                            i7++;
                        }
                        return dArr;
                }
            }
        } else if (gVar instanceof zp.i) {
            Pair pair = (Pair) ((zp.i) gVar).f24066a;
            up.b bVar2 = (up.b) pair.f14612d;
            up.e eVar2 = (up.e) pair.f14613e;
            Class clsI2 = i(classLoader, bVar2, 0);
            if (clsI2 != null) {
                return Enum.valueOf(clsI2, eVar2.b());
            }
        } else {
            if (!(gVar instanceof zp.t)) {
                if ((gVar instanceof zp.j) || (gVar instanceof zp.v)) {
                    return null;
                }
                return gVar.b();
            }
            zp.s sVar = (zp.s) ((zp.t) gVar).f24066a;
            if (sVar instanceof zp.r) {
                zp.f fVar2 = ((zp.r) sVar).f24075a;
                return i(classLoader, fVar2.f24064a, fVar2.f24065b);
            }
            if (!(sVar instanceof zp.q)) {
                throw new rn.n();
            }
            vo.i iVarG3 = ((zp.q) sVar).f24074a.r0().g();
            vo.f fVar3 = iVarG3 instanceof vo.f ? (vo.f) iVarG3 : null;
            if (fVar3 != null) {
                return k(fVar3);
            }
        }
        return null;
    }
}
