package qo;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.w0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f18937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f18939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f18940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f18941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f18942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f18943g;

    public c(Class jClass, ArrayList parameterNames, a callMode, b origin, List methods) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        Intrinsics.checkNotNullParameter(callMode, "callMode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f18937a = jClass;
        this.f18938b = parameterNames;
        this.f18939c = callMode;
        this.f18940d = methods;
        ArrayList arrayList = new ArrayList(e0.l(methods, 10));
        Iterator it = methods.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f18941e = arrayList;
        List list = this.f18940d;
        ArrayList arrayList2 = new ArrayList(e0.l(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            Intrinsics.checkNotNull(returnType);
            List list2 = bp.c.f3339a;
            Intrinsics.checkNotNullParameter(returnType, "<this>");
            Class<?> cls = (Class) bp.c.f3341c.get(returnType);
            if (cls != null) {
                returnType = cls;
            }
            arrayList2.add(returnType);
        }
        this.f18942f = arrayList2;
        List list3 = this.f18940d;
        ArrayList arrayList3 = new ArrayList(e0.l(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f18943g = arrayList3;
        if (this.f18939c == a.f18926e && origin == b.f18929d) {
            ArrayList arrayList4 = this.f18938b;
            Intrinsics.checkNotNullParameter(arrayList4, "<this>");
            ArrayList arrayList5 = new ArrayList(e0.l(arrayList4, 10));
            boolean z5 = false;
            for (Object obj : arrayList4) {
                boolean z6 = true;
                if (!z5 && Intrinsics.areEqual(obj, "value")) {
                    z5 = true;
                    z6 = false;
                }
                if (z6) {
                    arrayList5.add(obj);
                }
            }
            if (!arrayList5.isEmpty()) {
                throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
            }
        }
    }

    @Override // qo.g
    public final List a() {
        return this.f18941e;
    }

    @Override // qo.g
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // qo.g
    public final boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0039  */
    @Override // qo.g
    public final Object call(Object[] args) {
        KClass orCreateKotlinClass;
        String qualifiedName;
        Intrinsics.checkNotNullParameter(args, "args");
        zs.a.l(this, args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            ArrayList arrayList2 = this.f18938b;
            if (i7 >= length) {
                return yk.a.h(this.f18937a, w0.l(CollectionsKt.n0(arrayList2, arrayList)), this.f18940d);
            }
            Object array = args[i7];
            int i11 = i10 + 1;
            ArrayList arrayList3 = this.f18942f;
            if (array == null && this.f18939c == a.f18925d) {
                array = this.f18943g.get(i10);
            } else {
                Class cls = (Class) arrayList3.get(i10);
                if (array instanceof Class) {
                    array = null;
                } else {
                    if (array instanceof KClass) {
                        array = gn.h.B((KClass) array);
                    } else if (array instanceof Object[]) {
                        Object[] objArr = (Object[]) array;
                        if (objArr instanceof Class[]) {
                            array = null;
                        } else if (objArr instanceof KClass[]) {
                            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<kotlin.reflect.KClass<*>>");
                            KClass[] kClassArr = (KClass[]) array;
                            ArrayList arrayList4 = new ArrayList(kClassArr.length);
                            for (KClass kClass : kClassArr) {
                                arrayList4.add(gn.h.B(kClass));
                            }
                            array = arrayList4.toArray(new Class[0]);
                        } else {
                            array = objArr;
                        }
                    }
                    if (!cls.isInstance(array)) {
                        array = null;
                    }
                }
            }
            if (array == null) {
                String str = (String) arrayList2.get(i10);
                Class cls2 = (Class) arrayList3.get(i10);
                if (Intrinsics.areEqual(cls2, Class.class)) {
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KClass.class);
                } else if (cls2.isArray() && Intrinsics.areEqual(cls2.getComponentType(), Class.class)) {
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(KClass[].class);
                } else {
                    Intrinsics.checkNotNullParameter(cls2, "<this>");
                    orCreateKotlinClass = Reflection.getOrCreateKotlinClass(cls2);
                }
                if (Intrinsics.areEqual(orCreateKotlinClass.getQualifiedName(), Reflection.getOrCreateKotlinClass(Object[].class).getQualifiedName())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(orCreateKotlinClass.getQualifiedName());
                    sb2.append('<');
                    Class<?> componentType = gn.h.B(orCreateKotlinClass).getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
                    sb2.append(gn.h.E(componentType).getQualifiedName());
                    sb2.append('>');
                    qualifiedName = sb2.toString();
                } else {
                    qualifiedName = orCreateKotlinClass.getQualifiedName();
                }
                throw new IllegalArgumentException("Argument #" + i10 + ' ' + str + " is not of the required type " + qualifiedName);
            }
            arrayList.add(array);
            i7++;
            i10 = i11;
        }
    }

    @Override // qo.g
    public final Type getReturnType() {
        return this.f18937a;
    }

    public /* synthetic */ c(Class cls, ArrayList arrayList, a aVar) {
        b bVar = b.f18930e;
        ArrayList arrayList2 = new ArrayList(e0.l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it.next(), null));
        }
        this(cls, arrayList, aVar, bVar, arrayList2);
    }
}
