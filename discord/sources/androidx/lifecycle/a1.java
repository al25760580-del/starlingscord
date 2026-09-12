package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: classes.dex */
public class a1 implements ViewModelProvider$Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a1 f2330a;

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public y0 a(Class modelClass) throws InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Constructor declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new RuntimeException(a3.e.j(modelClass, "Cannot create an instance of "));
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                Intrinsics.checkNotNull(objNewInstance);
                return (y0) objNewInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(a3.e.j(modelClass, "Cannot create an instance of "), e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException(a3.e.j(modelClass, "Cannot create an instance of "), e11);
            }
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(a3.e.j(modelClass, "Cannot create an instance of "), e12);
        }
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public y0 b(Class modelClass, t2.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return a(modelClass);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final y0 c(KClass modelClass, t2.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return b(gn.h.B(modelClass), extras);
    }
}
