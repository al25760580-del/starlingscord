package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d2 extends o1 {
    private static final Map zzb = new ConcurrentHashMap();
    protected f3 zzc;
    private int zzd;

    public d2() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = f3.f6006f;
    }

    public static void f(Class cls, d2 d2Var) {
        d2Var.e();
        zzb.put(cls, d2Var);
    }

    public static final boolean i(d2 d2Var, boolean z5) {
        byte bByteValue = ((Byte) d2Var.j(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = u2.f6145b.a(d2Var.getClass()).d(d2Var);
        if (z5) {
            d2Var.j(2);
        }
        return zD;
    }

    public static d2 m(Class cls) {
        Map map = zzb;
        d2 d2Var = (d2) map.get(cls);
        if (d2Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                d2Var = (d2) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (d2Var != null) {
            return d2Var;
        }
        d2 d2Var2 = (d2) ((d2) k3.c(cls)).j(6);
        if (d2Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, d2Var2);
        return d2Var2;
    }

    public static d2 o(d2 d2Var, byte[] bArr) throws m2 {
        int length = bArr.length;
        y1 y1Var = y1.f6190a;
        int i7 = q1.f6096a;
        y1 y1Var2 = y1.f6190a;
        if (length != 0) {
            d2 d2VarN = d2Var.n();
            try {
                x2 x2VarA = u2.f6145b.a(d2VarN.getClass());
                r1 r1Var = new r1();
                y1Var2.getClass();
                x2VarA.i(d2VarN, bArr, 0, length, r1Var);
                x2VarA.a(d2VarN);
                d2Var = d2VarN;
            } catch (e3 e10) {
                throw new m2(e10.getMessage());
            } catch (m2 e11) {
                throw e11;
            } catch (IOException e12) {
                if (e12.getCause() instanceof m2) {
                    throw ((m2) e12.getCause());
                }
                throw new m2(e12.getMessage(), e12);
            } catch (IndexOutOfBoundsException unused) {
                throw new m2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (d2Var == null || i(d2Var, true)) {
            return d2Var;
        }
        throw new m2(new e3().getMessage());
    }

    public static Object p(Method method, d2 d2Var, Object... objArr) {
        try {
            return method.invoke(d2Var, objArr);
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

    @Override // com.google.android.gms.internal.play_billing.o1
    public final void a(v1 v1Var) {
        x2 x2VarA = u2.f6145b.a(getClass());
        w1 w1Var = (w1) v1Var.f6156i;
        if (w1Var == null) {
            w1Var = new w1(v1Var);
        }
        x2VarA.e(this, w1Var);
    }

    @Override // com.google.android.gms.internal.play_billing.o1
    public final int c(x2 x2Var) {
        if (h()) {
            int iB = x2Var.b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(kk.b.h(iB, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int iB2 = x2Var.b(this);
        if (iB2 < 0) {
            throw new IllegalStateException(kk.b.h(iB2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
        return iB2;
    }

    @Override // com.google.android.gms.internal.play_billing.o1
    public final int d() {
        if (h()) {
            int iB = u2.f6145b.a(getClass()).b(this);
            if (iB >= 0) {
                return iB;
            }
            throw new IllegalStateException(kk.b.h(iB, "serialized size must be non-negative, was "));
        }
        int i7 = this.zzd & Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int iB2 = u2.f6145b.a(getClass()).b(this);
        if (iB2 < 0) {
            throw new IllegalStateException(kk.b.h(iB2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & Integer.MIN_VALUE) | iB2;
        return iB2;
    }

    public final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return u2.f6145b.a(getClass()).c(this, (d2) obj);
    }

    public final void g() {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return u2.f6145b.a(getClass()).h(this);
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int iH = u2.f6145b.a(getClass()).h(this);
        this.zza = iH;
        return iH;
    }

    public abstract Object j(int i7);

    public final c2 k() {
        return (c2) j(5);
    }

    public final c2 l() {
        c2 c2Var = (c2) j(5);
        d2 d2Var = c2Var.f5993d;
        if (!d2Var.getClass().isInstance(this)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        if (!d2Var.equals(this)) {
            if (!c2Var.f5994e.h()) {
                c2Var.d();
            }
            d2 d2Var2 = c2Var.f5994e;
            u2.f6145b.a(d2Var2.getClass()).f(d2Var2, this);
        }
        return c2Var;
    }

    public final d2 n() {
        return (d2) j(4);
    }

    public final void q() {
        u2.f6145b.a(getClass()).a(this);
        e();
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = r2.f6110a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        r2.c(this, sb2, 0);
        return sb2.toString();
    }
}
