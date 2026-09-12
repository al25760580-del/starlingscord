package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f2408a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f2409b = new HashMap();

    public static void a(Constructor constructor, u uVar) {
        try {
            Object objNewInstance = constructor.newInstance(uVar);
            Intrinsics.checkNotNull(objNewInstance);
            if (objNewInstance == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static final String b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return com.discord.chat.presentation.list.a.k(new StringBuilder(), kotlin.text.x.l(className, ".", "_", false), "_LifecycleAdapter");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0129 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x012b  */
    /* JADX WARN: Code duplicated, block: B:76:0x013f  */
    /* JADX WARN: Code duplicated, block: B:86:0x011f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0105 A[SYNTHETIC] */
    public static int c(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Iterator it;
        Class cls2;
        boolean z5;
        HashMap map = f2408a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i7 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r5 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r5 != null ? r5.getName() : "";
                Intrinsics.checkNotNull(name);
                if (name.length() != 0) {
                    Intrinsics.checkNotNull(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    Intrinsics.checkNotNullExpressionValue(canonicalName, "substring(...)");
                }
                Intrinsics.checkNotNull(canonicalName);
                String strB = b(canonicalName);
                if (name.length() != 0) {
                    strB = name + '.' + strB;
                }
                Class<?> cls3 = Class.forName(strB);
                Intrinsics.checkNotNull(cls3, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
                declaredConstructor = cls3.getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            HashMap map2 = f2409b;
            if (declaredConstructor != null) {
                map2.put(cls, kotlin.collections.c0.c(declaredConstructor));
            } else {
                d dVar = d.f2336c;
                HashMap map3 = dVar.f2338b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((b0) declaredMethods[i10].getAnnotation(b0.class)) != null) {
                                dVar.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i10++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && u.class.isAssignableFrom(superclass)) {
                        Intrinsics.checkNotNull(superclass);
                        if (c(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            Intrinsics.checkNotNull(obj);
                            arrayList = new ArrayList((Collection) obj);
                            it = ArrayIteratorKt.iterator(cls.getInterfaces());
                            while (it.hasNext()) {
                                cls2 = (Class) it.next();
                                if (cls2 == null && u.class.isAssignableFrom(cls2)) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (!z5) {
                                    Intrinsics.checkNotNull(cls2);
                                    if (c(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        Intrinsics.checkNotNull(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        it = ArrayIteratorKt.iterator(cls.getInterfaces());
                        while (it.hasNext()) {
                            cls2 = (Class) it.next();
                            if (cls2 == null) {
                                z5 = false;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                Intrinsics.checkNotNull(cls2);
                                if (c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    Intrinsics.checkNotNull(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i7 = 2;
        }
        map.put(cls, Integer.valueOf(i7));
        return i7;
    }
}
