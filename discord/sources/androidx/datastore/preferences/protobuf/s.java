package androidx.datastore.preferences.protobuf;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class s extends a {
    private static Map<Object, s> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected e1 unknownFields;

    public s() {
        this.memoizedHashCode = 0;
        this.unknownFields = e1.f1841f;
        this.memoizedSerializedSize = -1;
    }

    public static s e(Class cls) {
        s sVar = defaultInstanceMap.get(cls);
        if (sVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = (s) ((s) n1.a(cls)).d(6);
        if (sVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, sVar2);
        return sVar2;
    }

    public static Object f(Method method, s sVar, Object... objArr) {
        try {
            return method.invoke(sVar, objArr);
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

    public static void h(Class cls, s sVar) {
        defaultInstanceMap.put(cls, sVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            s0 s0Var = s0.f1930c;
            s0Var.getClass();
            this.memoizedSerializedSize = s0Var.a(getClass()).e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void c(i iVar) {
        s0 s0Var = s0.f1930c;
        s0Var.getClass();
        v0 v0VarA = s0Var.a(getClass());
        e0 e0Var = iVar.f1871c;
        if (e0Var == null) {
            e0Var = new e0(iVar);
        }
        v0VarA.d(this, e0Var);
    }

    public abstract Object d(int i7);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((s) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        s0 s0Var = s0.f1930c;
        s0Var.getClass();
        return s0Var.a(getClass()).h(this, (s) obj);
    }

    public final boolean g() {
        byte bByteValue = ((Byte) d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        s0 s0Var = s0.f1930c;
        s0Var.getClass();
        boolean zB = s0Var.a(getClass()).b(this);
        d(2);
        return zB;
    }

    public final int hashCode() {
        int i7 = this.memoizedHashCode;
        if (i7 != 0) {
            return i7;
        }
        s0 s0Var = s0.f1930c;
        s0Var.getClass();
        int iG = s0Var.a(getClass()).g(this);
        this.memoizedHashCode = iG;
        return iG;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        l0.k(this, sb2, 0);
        return sb2.toString();
    }
}
