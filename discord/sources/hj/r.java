package hj;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f10900d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t0 f10902c;

    public r() {
        this.f10803a = 0;
        this.f10901b = -1;
        this.f10902c = t0.f10908e;
    }

    public static r b(Class cls) {
        ConcurrentHashMap concurrentHashMap = f10900d;
        r rVar = (r) concurrentHashMap.get(cls);
        if (rVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                rVar = (r) concurrentHashMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = (r) ((r) c1.b(cls)).a(6);
        if (rVar2 == null) {
            throw new IllegalStateException();
        }
        concurrentHashMap.put(cls, rVar2);
        return rVar2;
    }

    public static Object c(Method method, r rVar, Object... objArr) {
        try {
            return method.invoke(rVar, objArr);
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

    public static final boolean d(r rVar, boolean z5) {
        byte bByteValue = ((Byte) rVar.a(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        n0 n0Var = n0.f10886c;
        n0Var.getClass();
        boolean zB = n0Var.a(rVar.getClass()).b(rVar);
        if (z5) {
            rVar.a(2);
        }
        return zB;
    }

    public static r g(r rVar, j jVar, l lVar) throws v {
        r rVarF = rVar.f();
        try {
            n0 n0Var = n0.f10886c;
            n0Var.getClass();
            q0 q0VarA = n0Var.a(rVarF.getClass());
            androidx.datastore.preferences.protobuf.g gVar = (androidx.datastore.preferences.protobuf.g) jVar.f10850b;
            if (gVar == null) {
                gVar = new androidx.datastore.preferences.protobuf.g(jVar);
            }
            q0VarA.g(rVarF, gVar, lVar);
            q0VarA.a(rVarF);
            return rVarF;
        } catch (s0 e10) {
            throw new v(e10.getMessage());
        } catch (v e11) {
            if (e11.f10913d) {
                throw new v(e11.getMessage(), e11);
            }
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof v) {
                throw ((v) e12.getCause());
            }
            throw new v(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof v) {
                throw ((v) e13.getCause());
            }
            throw e13;
        }
    }

    public static void h(Class cls, r rVar) {
        rVar.f10901b &= Integer.MAX_VALUE;
        f10900d.put(cls, rVar);
    }

    public abstract Object a(int i7);

    public final boolean e() {
        return (this.f10901b & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        n0 n0Var = n0.f10886c;
        n0Var.getClass();
        return n0Var.a(getClass()).f(this, (r) obj);
    }

    public final r f() {
        return (r) a(4);
    }

    public final int hashCode() {
        if (e()) {
            n0 n0Var = n0.f10886c;
            n0Var.getClass();
            return n0Var.a(getClass()).e(this);
        }
        if (this.f10803a == 0) {
            n0 n0Var2 = n0.f10886c;
            n0Var2.getClass();
            this.f10803a = n0Var2.a(getClass()).e(this);
        }
        return this.f10803a;
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = i0.f10848a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        i0.c(this, sb2, 0);
        return sb2.toString();
    }
}
