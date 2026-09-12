package bp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3333a;

    public a0(Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.f3333a = recordComponent;
    }

    @Override // bp.w
    public final Member b() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f3333a;
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        io.sentry.internal.debugmeta.c cVar = mf.f.f15757c;
        Method method = null;
        if (cVar == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                cVar = new io.sentry.internal.debugmeta.c(cls.getMethod("getType", null), cls.getMethod("getAccessor", null), 3, false);
            } catch (NoSuchMethodException unused) {
                cVar = new io.sentry.internal.debugmeta.c(method, method, 3, false);
            }
            mf.f.f15757c = cVar;
        }
        Method method2 = (Method) cVar.f12760i;
        if (method2 != null) {
            Object objInvoke = method2.invoke(recordComponent, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public final lp.d f() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f3333a;
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        io.sentry.internal.debugmeta.c cVar = mf.f.f15757c;
        Class cls = null;
        if (cVar == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                cVar = new io.sentry.internal.debugmeta.c(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null), 3, false);
            } catch (NoSuchMethodException unused) {
                cVar = new io.sentry.internal.debugmeta.c(cls, cls, 3, false);
            }
            mf.f.f15757c = cVar;
        }
        Method method = (Method) cVar.f12759e;
        if (method != null) {
            Object objInvoke = method.invoke(recordComponent, null);
            Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new q(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
