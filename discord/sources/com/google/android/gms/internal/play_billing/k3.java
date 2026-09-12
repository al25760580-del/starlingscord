package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f6033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f6034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j3 f6035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f6036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f6037e;

    static {
        boolean z5;
        j3 j3Var;
        Unsafe unsafeE = e();
        f6033a = unsafeE;
        int i7 = q1.f6096a;
        f6034b = Memory.class;
        Class cls = Long.TYPE;
        boolean zM = m(cls);
        Class cls2 = Integer.TYPE;
        boolean zM2 = m(cls2);
        j3 h3Var = null;
        if (unsafeE != null) {
            if (zM) {
                h3Var = new i3(unsafeE);
            } else if (zM2) {
                h3Var = new h3(unsafeE);
            }
        }
        f6035c = h3Var;
        if (h3Var != null) {
            try {
                Class<?> cls3 = h3Var.f6027a.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("getLong", Object.class, cls);
                p();
            } catch (Throwable th2) {
                Logger.getLogger(k3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th2.toString()));
            }
        }
        j3 j3Var2 = f6035c;
        if (j3Var2 == null) {
            z5 = false;
        } else {
            try {
                Class<?> cls4 = j3Var2.f6027a.getClass();
                cls4.getMethod("objectFieldOffset", Field.class);
                cls4.getMethod("arrayBaseOffset", Class.class);
                cls4.getMethod("arrayIndexScale", Class.class);
                cls4.getMethod("getInt", Object.class, cls);
                cls4.getMethod("putInt", Object.class, cls, cls2);
                cls4.getMethod("getLong", Object.class, cls);
                cls4.getMethod("putLong", Object.class, cls, cls);
                cls4.getMethod("getObject", Object.class, cls);
                cls4.getMethod("putObject", Object.class, cls, Object.class);
                z5 = true;
            } catch (Throwable th3) {
                Logger.getLogger(k3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th3.toString()));
                z5 = false;
            }
        }
        f6036d = z5;
        n(byte[].class);
        n(boolean[].class);
        o(boolean[].class);
        n(int[].class);
        o(int[].class);
        n(long[].class);
        o(long[].class);
        n(float[].class);
        o(float[].class);
        n(double[].class);
        o(double[].class);
        n(Object[].class);
        o(Object[].class);
        Field fieldP = p();
        if (fieldP != null && (j3Var = f6035c) != null) {
            j3Var.f6027a.objectFieldOffset(fieldP);
        }
        f6037e = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static int a(long j, Object obj) {
        return f6035c.f6027a.getInt(obj, j);
    }

    public static long b(long j, Object obj) {
        return f6035c.f6027a.getLong(obj, j);
    }

    public static Object c(Class cls) {
        try {
            return f6033a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static Object d(long j, Object obj) {
        return f6035c.f6027a.getObject(obj, j);
    }

    public static Unsafe e() {
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new g3());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(k3.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "getUnsafe", "As part of the planned removal, sun.misc.Unsafe is available in the current environment but configured to throw on use. Protobuf will continue without using it, but with slightly reduced performance. --sun-misc-unsafe-memory-access=allow is likely available to opt back in if desired. A later Protobuf version release will stop using sun.misc.Unsafe entirely.");
            return null;
        }
    }

    public static /* synthetic */ void f(Object obj, long j, boolean z5) {
        Unsafe unsafe = f6035c.f6027a;
        long j5 = (-4) & j;
        int i7 = unsafe.getInt(obj, j5);
        int i10 = ((~((int) j)) & 3) << 3;
        unsafe.putInt(obj, j5, ((z5 ? 1 : 0) << i10) | ((~(255 << i10)) & i7));
    }

    public static /* synthetic */ void g(Object obj, long j, boolean z5) {
        Unsafe unsafe = f6035c.f6027a;
        long j5 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        unsafe.putInt(obj, j5, ((z5 ? 1 : 0) << i7) | ((~(255 << i7)) & unsafe.getInt(obj, j5)));
    }

    public static void h(int i7, long j, Object obj) {
        f6035c.f6027a.putInt(obj, j, i7);
    }

    public static void i(Object obj, long j, long j5) {
        f6035c.f6027a.putLong(obj, j, j5);
    }

    public static void j(long j, Object obj, Object obj2) {
        f6035c.f6027a.putObject(obj, j, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean k(long j, Object obj) {
        return ((byte) ((f6035c.f6027a.getInt(obj, (-4) & j) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean l(long j, Object obj) {
        return ((byte) ((f6035c.f6027a.getInt(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0;
    }

    public static boolean m(Class cls) {
        int i7 = q1.f6096a;
        try {
            Class cls2 = f6034b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void n(Class cls) {
        if (f6036d) {
            f6035c.f6027a.arrayBaseOffset(cls);
        }
    }

    public static void o(Class cls) {
        if (f6036d) {
            f6035c.f6027a.arrayIndexScale(cls);
        }
    }

    public static Field p() {
        Field declaredField;
        Field declaredField2;
        int i7 = q1.f6096a;
        try {
            declaredField = Buffer.class.getDeclaredField("effectiveDirectAddress");
        } catch (Throwable unused) {
            declaredField = null;
        }
        if (declaredField != null) {
            return declaredField;
        }
        try {
            declaredField2 = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField2 = null;
        }
        if (declaredField2 == null || declaredField2.getType() != Long.TYPE) {
            return null;
        }
        return declaredField2;
    }
}
