package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends z1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f6062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f6064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f6065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f6066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f6067g;

    static {
        Unsafe unsafeR;
        try {
            try {
                unsafeR = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                try {
                    unsafeR = (Unsafe) Class.forName("java.security.AccessController").getMethod("doPrivileged", PrivilegedExceptionAction.class).invoke(null, new s0());
                } catch (Exception unused2) {
                    unsafeR = R();
                    Unsafe unsafe = unsafeR;
                }
            }
            try {
                f6064d = unsafeR.objectFieldOffset(p0.class.getDeclaredField("i"));
                f6063c = unsafeR.objectFieldOffset(p0.class.getDeclaredField("e"));
                f6065e = unsafeR.objectFieldOffset(p0.class.getDeclaredField("d"));
                f6066f = unsafeR.objectFieldOffset(o0.class.getDeclaredField("a"));
                f6067g = unsafeR.objectFieldOffset(o0.class.getDeclaredField("b"));
                f6062b = unsafeR;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Could not initialize intrinsics", e11);
        }
    }

    public static /* synthetic */ Unsafe R() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean A(a1 a1Var, j0 j0Var, j0 j0Var2) {
        return r0.a(f6062b, a1Var, f6063c, j0Var, j0Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean E(p0 p0Var, Object obj, Object obj2) {
        return r0.a(f6062b, p0Var, f6065e, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final boolean G(p0 p0Var, o0 o0Var, o0 o0Var2) {
        return r0.a(f6062b, p0Var, f6064d, o0Var, o0Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final j0 e(a1 a1Var) {
        j0 j0Var;
        j0 j0Var2 = j0.f6023d;
        do {
            j0Var = a1Var.f6089e;
            if (j0Var2 == j0Var) {
                break;
            }
        } while (!A(a1Var, j0Var, j0Var2));
        return j0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final o0 o(a1 a1Var) {
        o0 o0Var;
        o0 o0Var2 = o0.f6078c;
        do {
            o0Var = a1Var.f6090i;
            if (o0Var2 == o0Var) {
                break;
            }
        } while (!G(a1Var, o0Var, o0Var2));
        return o0Var;
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void s(o0 o0Var, o0 o0Var2) {
        f6062b.putObject(o0Var, f6067g, o0Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.z1
    public final void v(o0 o0Var, Thread thread) {
        f6062b.putObject(o0Var, f6066f, thread);
    }
}
