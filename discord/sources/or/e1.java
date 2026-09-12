package or;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SerialDescriptor[] f17527a = new SerialDescriptor[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KSerializer[] f17528b = new KSerializer[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f17529c = new Object();

    public static final i0 a(String name, KSerializer primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new i0(name, new j0(primitiveSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof l) {
            return ((l) serialDescriptor).a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.g());
        int iG = serialDescriptor.g();
        for (int i7 = 0; i7 < iG; i7++) {
            hashSet.add(serialDescriptor.h(i7));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f17527a : serialDescriptorArr;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    public static final KSerializer d(Class cls, KSerializer... args) {
        Object obj;
        KSerializer kSerializer;
        Class<?> cls2;
        boolean z5;
        Object obj2;
        KSerializer kSerializerG;
        Field field;
        kr.f fVar;
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && cls.getAnnotation(kr.f.class) == null && cls.getAnnotation(kr.c.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
            Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new b0(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr = (KSerializer[]) Arrays.copyOf(args, args.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer kSerializerG2 = obj == null ? null : g(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (kSerializerG2 != null) {
            return kSerializerG2;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 == null || kotlin.text.x.o(canonicalName2, "java.", false) || kotlin.text.x.o(canonicalName2, "kotlin.", false)) {
            kSerializer = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            Intrinsics.checkNotNullExpressionValue(declaredFields, "getDeclaredFields(...)");
            int length = declaredFields.length;
            Field field2 = null;
            int i7 = 0;
            boolean z6 = false;
            while (true) {
                if (i7 >= length) {
                    if (!z6) {
                        break;
                    }
                    break;
                }
                Field field3 = declaredFields[i7];
                if (Intrinsics.areEqual(field3.getName(), "INSTANCE") && Intrinsics.areEqual(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                    if (!z6) {
                        z6 = true;
                        field2 = field3;
                    }
                }
                i7++;
                field2 = null;
                break;
            }
            if (field2 == null) {
                kSerializer = null;
            } else {
                Object obj3 = field2.get(null);
                Method[] methods = cls.getMethods();
                Intrinsics.checkNotNullExpressionValue(methods, "getMethods(...)");
                int length2 = methods.length;
                Method method = null;
                int i10 = 0;
                boolean z7 = false;
                while (true) {
                    if (i10 >= length2) {
                        if (!z7) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i10];
                    if (Intrinsics.areEqual(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && Intrinsics.areEqual(method2.getReturnType(), KSerializer.class)) {
                            if (!z7) {
                                method = method2;
                                z7 = true;
                            }
                        }
                    }
                    i10++;
                    method = null;
                    break;
                }
                if (method == null) {
                    kSerializer = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof KSerializer) {
                        kSerializer = (KSerializer) objInvoke;
                    } else {
                        kSerializer = null;
                    }
                }
            }
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(args, args.length);
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length3 = declaredClasses.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length3) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i11];
            if (cls2.getAnnotation(x0.class) != null) {
                break;
            }
            i11++;
        }
        if (cls2 == null) {
            obj2 = null;
            z5 = true;
        } else {
            String simpleName = cls2.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
            try {
                Field declaredField2 = cls.getDeclaredField(simpleName);
                z5 = true;
                try {
                    declaredField2.setAccessible(true);
                    obj2 = declaredField2.get(null);
                } catch (Throwable unused2) {
                    obj2 = null;
                }
            } catch (Throwable unused3) {
                z5 = true;
            }
        }
        if (obj2 == null || (kSerializerG = g(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length))) == null) {
            try {
                Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                Intrinsics.checkNotNullExpressionValue(declaredClasses2, "getDeclaredClasses(...)");
                int length4 = declaredClasses2.length;
                Class<?> cls3 = null;
                int i12 = 0;
                boolean z10 = false;
                while (true) {
                    if (i12 < length4) {
                        Class<?> cls4 = declaredClasses2[i12];
                        if (Intrinsics.areEqual(cls4.getSimpleName(), "$serializer")) {
                            if (!z10) {
                                z10 = z5;
                                cls3 = cls4;
                            }
                        }
                        i12++;
                    } else if (!z10) {
                    }
                    cls3 = null;
                    break;
                }
                Object obj4 = (cls3 == null || (field = cls3.getField("INSTANCE")) == null) ? null : field.get(null);
                kSerializerG = obj4 instanceof KSerializer ? (KSerializer) obj4 : null;
            } catch (NoSuchFieldException unused4) {
            }
        }
        if (kSerializerG != null) {
            return kSerializerG;
        }
        if (cls.getAnnotation(kr.c.class) == null && ((fVar = (kr.f) cls.getAnnotation(kr.f.class)) == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(fVar.with()), Reflection.getOrCreateKotlinClass(kr.d.class)))) {
            return null;
        }
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return new kr.d(Reflection.getOrCreateKotlinClass(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [int] */
    /* JADX WARN: Type inference failed for: r13v7 */
    public static final b0 e(String serialName, Enum[] values, String[] strArr, Annotation[][] entryAnnotations) {
        String[] names = strArr;
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entryAnnotations, "entryAnnotations");
        a0 descriptor = new a0(serialName, values.length);
        int length = values.length;
        boolean z5 = false;
        int i7 = 0;
        int i10 = 0;
        while (i7 < length) {
            Enum r11 = values[i7];
            int i11 = i10 + 1;
            String strName = (String) kotlin.collections.y.v(i10, names);
            if (strName == null) {
                strName = r11.name();
            }
            descriptor.b(strName, z5);
            Annotation[] annotationArr = (Annotation[]) kotlin.collections.y.v(i10, entryAnnotations);
            if (annotationArr != null) {
                int length2 = annotationArr.length;
                for (?? r13 = z5; r13 < length2; r13++) {
                    Annotation annotation = annotationArr[r13];
                    Intrinsics.checkNotNullParameter(annotation, "annotation");
                    int i12 = descriptor.f17545d;
                    List[] listArr = descriptor.f17547f;
                    List arrayList = listArr[i12];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        listArr[descriptor.f17545d] = arrayList;
                    }
                    arrayList.add(annotation);
                }
            }
            i7++;
            names = strArr;
            i10 = i11;
            z5 = false;
        }
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        b0 b0Var = new b0(serialName, values);
        b0Var.f17507c = descriptor;
        return b0Var;
    }

    public static final int f(SerialDescriptor serialDescriptor, SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int iHashCode = (serialDescriptor.d().hashCode() * 31) + Arrays.hashCode(typeParams);
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        int iG = serialDescriptor.g();
        int i7 = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iG > 0)) {
                break;
            }
            int i10 = iG - 1;
            int i11 = i7 * 31;
            String strD = serialDescriptor.j(serialDescriptor.g() - iG).d();
            if (strD != null) {
                iHashCode2 = strD.hashCode();
            }
            i7 = i11 + iHashCode2;
            iG = i10;
        }
        int iG2 = serialDescriptor.g();
        int iHashCode3 = 1;
        while (true) {
            if (!(iG2 > 0)) {
                return (((iHashCode * 31) + i7) * 31) + iHashCode3;
            }
            int i12 = iG2 - 1;
            int i13 = iHashCode3 * 31;
            ls.d dVarC = serialDescriptor.j(serialDescriptor.g() - iG2).c();
            iHashCode3 = i13 + (dVarC != null ? dVarC.hashCode() : 0);
            iG2 = i12;
        }
    }

    public static final KSerializer g(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i7 = 0; i7 < length; i7++) {
                    clsArr2[i7] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean h(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return gn.h.B(kClass).isInterface();
    }

    public static final KClass i(KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        mo.c classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (!(classifier instanceof mo.t)) {
            throw new IllegalArgumentException("Only KClass supported as classifier, got " + classifier);
        }
        throw new IllegalArgumentException("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported because " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier + '.');
    }

    public static final String j(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String className = kClass.getSimpleName();
        if (className == null) {
            className = "<local class name not available>";
        }
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    public static final void k(int[] seenArray, int[] goldenMaskArray, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(seenArray, "seenArray");
        Intrinsics.checkNotNullParameter(goldenMaskArray, "goldenMaskArray");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int length = goldenMaskArray.length;
        for (int i7 = 0; i7 < length; i7++) {
            int i10 = goldenMaskArray[i7] & (~seenArray[i7]);
            if (i10 != 0) {
                for (int i11 = 0; i11 < 32; i11++) {
                    if ((i10 & 1) != 0) {
                        arrayList.add(descriptor.h((i7 * 32) + i11));
                    }
                    i10 >>>= 1;
                }
            }
        }
        throw new kr.b(descriptor.d(), arrayList);
    }

    public static final void l(int i7, int i10, SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i11 = (~i7) & i10;
        for (int i12 = 0; i12 < 32; i12++) {
            if ((i11 & 1) != 0) {
                arrayList.add(descriptor.h(i12));
            }
            i11 >>>= 1;
        }
        throw new kr.b(descriptor.d(), arrayList);
    }

    public static final void m(String str, KClass baseClass) {
        String string;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            string = kk.b.g('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbU = a3.e.u("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            a3.e.A(sbU, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbU.append(baseClass.getSimpleName());
            sbU.append("' has to be sealed and '@Serializable'.");
            string = sbU.toString();
        }
        throw new kr.g(string);
    }
}
