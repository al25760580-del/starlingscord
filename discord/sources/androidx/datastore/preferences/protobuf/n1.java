package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f1908a = Logger.getLogger(n1.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Unsafe f1909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f1910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final m1 f1911d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f1912e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f1913f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f1914g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f1915h;

    static {
        boolean z5;
        boolean z6;
        m1 m1Var;
        Unsafe unsafeI = i();
        f1909b = unsafeI;
        f1910c = c.f1827a;
        Class cls = Long.TYPE;
        boolean zE = e(cls);
        Class cls2 = Integer.TYPE;
        boolean zE2 = e(cls2);
        m1 l1Var = null;
        if (unsafeI != null) {
            if (!c.a()) {
                l1Var = new l1(unsafeI);
            } else if (zE) {
                l1Var = new k1(unsafeI, 1);
            } else if (zE2) {
                l1Var = new k1(unsafeI, 0);
            }
        }
        f1911d = l1Var;
        Class cls3 = Byte.TYPE;
        Class<Field> cls4 = Field.class;
        if (unsafeI == null) {
            z5 = false;
        } else {
            try {
                Class<?> cls5 = unsafeI.getClass();
                cls5.getMethod("objectFieldOffset", cls4);
                cls5.getMethod("getLong", Object.class, cls);
                if (d() == null) {
                    z5 = false;
                } else {
                    if (!c.a()) {
                        cls5.getMethod("getByte", cls);
                        cls5.getMethod("putByte", cls, cls3);
                        cls5.getMethod("getInt", cls);
                        cls5.getMethod("putInt", cls, cls2);
                        cls5.getMethod("getLong", cls);
                        cls5.getMethod("putLong", cls, cls);
                        cls5.getMethod("copyMemory", cls, cls, cls);
                        cls5.getMethod("copyMemory", Object.class, cls, Object.class, cls, cls);
                    }
                    cls4 = cls4;
                    z5 = true;
                }
            } catch (Throwable th2) {
                f1908a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
            }
        }
        f1912e = z5;
        Unsafe unsafe = f1909b;
        if (unsafe == null) {
            z6 = false;
        } else {
            try {
                Class<?> cls6 = unsafe.getClass();
                cls6.getMethod("objectFieldOffset", cls4);
                cls6.getMethod("arrayBaseOffset", Class.class);
                cls6.getMethod("arrayIndexScale", Class.class);
                cls6.getMethod("getInt", Object.class, cls);
                cls6.getMethod("putInt", Object.class, cls, cls2);
                cls6.getMethod("getLong", Object.class, cls);
                cls6.getMethod("putLong", Object.class, cls, cls);
                cls6.getMethod("getObject", Object.class, cls);
                cls6.getMethod("putObject", Object.class, cls, Object.class);
                if (!c.a()) {
                    cls6.getMethod("getByte", Object.class, cls);
                    cls6.getMethod("putByte", Object.class, cls, cls3);
                    cls6.getMethod("getBoolean", Object.class, cls);
                    cls6.getMethod("putBoolean", Object.class, cls, Boolean.TYPE);
                    cls6.getMethod("getFloat", Object.class, cls);
                    cls6.getMethod("putFloat", Object.class, cls, Float.TYPE);
                    cls6.getMethod("getDouble", Object.class, cls);
                    cls6.getMethod("putDouble", Object.class, cls, Double.TYPE);
                }
                z6 = true;
            } catch (Throwable th3) {
                f1908a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th3);
                z6 = false;
            }
        }
        f1913f = z6;
        f1914g = b(byte[].class);
        b(boolean[].class);
        c(boolean[].class);
        b(int[].class);
        c(int[].class);
        b(long[].class);
        c(long[].class);
        b(float[].class);
        c(float[].class);
        b(double[].class);
        c(double[].class);
        b(Object[].class);
        c(Object[].class);
        Field fieldD = d();
        if (fieldD != null && (m1Var = f1911d) != null) {
            m1Var.j(fieldD);
        }
        f1915h = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object a(Class cls) {
        try {
            return f1909b.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int b(Class cls) {
        if (f1913f) {
            return f1911d.a(cls);
        }
        return -1;
    }

    public static void c(Class cls) {
        if (f1913f) {
            f1911d.b(cls);
        }
    }

    public static Field d() {
        Field declaredField;
        Field declaredField2;
        if (c.a()) {
            try {
                declaredField2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                declaredField2 = null;
            }
            if (declaredField2 != null) {
                return declaredField2;
            }
        }
        try {
            declaredField = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            declaredField = null;
        }
        if (declaredField == null || declaredField.getType() != Long.TYPE) {
            return null;
        }
        return declaredField;
    }

    public static boolean e(Class cls) {
        if (!c.a()) {
            return false;
        }
        try {
            Class cls2 = f1910c;
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

    public static byte f(byte[] bArr, long j) {
        return f1911d.d(f1914g + j, bArr);
    }

    public static byte g(long j, Object obj) {
        return (byte) ((f1911d.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f1911d.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe i() {
        try {
            return (Unsafe) AccessController.doPrivileged(new j1());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void j(byte[] bArr, byte b10, long j) {
        f1911d.l(bArr, f1914g + j, b10);
    }

    public static void k(Object obj, long j, byte b10) {
        long j5 = (-4) & j;
        int iG = f1911d.g(j5, obj);
        int i7 = ((~((int) j)) & 3) << 3;
        m(((255 & b10) << i7) | (iG & (~(255 << i7))), j5, obj);
    }

    public static void l(Object obj, long j, byte b10) {
        long j5 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        m(((255 & b10) << i7) | (f1911d.g(j5, obj) & (~(255 << i7))), j5, obj);
    }

    public static void m(int i7, long j, Object obj) {
        f1911d.o(i7, j, obj);
    }

    public static void n(Object obj, long j, long j5) {
        f1911d.p(obj, j, j5);
    }

    public static void o(long j, Object obj, Object obj2) {
        f1911d.q(j, obj, obj2);
    }
}
