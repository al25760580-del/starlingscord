package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class z0 extends a1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static z0 f2413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vi.d f2414d = new vi.d(2, (byte) 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f2415b;

    public z0(Application application) {
        this.f2415b = application;
    }

    @Override // androidx.lifecycle.a1, androidx.lifecycle.ViewModelProvider$Factory
    public final y0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f2415b;
        if (application != null) {
            return d(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.a1, androidx.lifecycle.ViewModelProvider$Factory
    public final y0 b(Class modelClass, t2.c extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f2415b != null) {
            return a(modelClass);
        }
        Application application = (Application) extras.a(f2414d);
        if (application != null) {
            return d(modelClass, application);
        }
        if (a.class.isAssignableFrom(modelClass)) {
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(modelClass);
    }

    public final y0 d(Class cls, Application application) {
        if (!a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            y0 y0Var = (y0) cls.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNull(y0Var);
            return y0Var;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(a3.e.j(cls, "Cannot create an instance of "), e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(a3.e.j(cls, "Cannot create an instance of "), e11);
        } catch (NoSuchMethodException e12) {
            throw new RuntimeException(a3.e.j(cls, "Cannot create an instance of "), e12);
        } catch (InvocationTargetException e13) {
            throw new RuntimeException(a3.e.j(cls, "Cannot create an instance of "), e13);
        }
    }
}
