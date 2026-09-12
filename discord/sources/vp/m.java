package vp;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f21910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f21912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f21913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f21914e;

    public m(a aVar, Object obj, a aVar2, l lVar, Class cls) {
        if (aVar == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (lVar.f21908e == i0.f21893x && aVar2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f21910a = aVar;
        this.f21911b = obj;
        this.f21912c = aVar2;
        this.f21913d = lVar;
        if (!o.class.isAssignableFrom(cls)) {
            this.f21914e = null;
            return;
        }
        try {
            this.f21914e = cls.getMethod("valueOf", Integer.TYPE);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            throw new RuntimeException(a3.e.o(new StringBuilder(name.length() + 52), "Generated message class \"", name, "\" missing method \"valueOf\"."), e10);
        }
    }

    public final Object a(Object obj) {
        if (this.f21913d.f21908e.f21895d != j0.F) {
            return obj;
        }
        try {
            return this.f21914e.invoke(null, (Integer) obj);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public final Object b(Object obj) {
        return this.f21913d.f21908e.f21895d == j0.F ? Integer.valueOf(((o) obj).a()) : obj;
    }
}
