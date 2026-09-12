package hj;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Unsafe f10809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class f10810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b1 f10811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f10812d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f10813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f10814f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f10815g;

    static {
        Unsafe unsafeJ = j();
        f10809a = unsafeJ;
        f10810b = d.f10816a;
        boolean zF = f(Long.TYPE);
        boolean zF2 = f(Integer.TYPE);
        b1 a1Var = null;
        if (unsafeJ != null) {
            if (!d.a()) {
                a1Var = new a1(unsafeJ);
            } else if (zF) {
                a1Var = new z0(unsafeJ, 1);
            } else if (zF2) {
                a1Var = new z0(unsafeJ, 0);
            }
        }
        f10811c = a1Var;
        f10812d = a1Var == null ? false : a1Var.r();
        f10813e = a1Var == null ? false : a1Var.q();
        f10814f = c(byte[].class);
        c(boolean[].class);
        d(boolean[].class);
        c(int[].class);
        d(int[].class);
        c(long[].class);
        d(long[].class);
        c(float[].class);
        d(float[].class);
        c(double[].class);
        d(double[].class);
        c(Object[].class);
        d(Object[].class);
        Field fieldE = e();
        if (fieldE != null && a1Var != null) {
            a1Var.j(fieldE);
        }
        f10815g = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static void a(Throwable th2) {
        Logger.getLogger(c1.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static Object b(Class cls) {
        try {
            return f10809a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class cls) {
        if (f10813e) {
            return f10811c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f10813e) {
            f10811c.b(cls);
        }
    }

    public static Field e() {
        Field declaredField;
        Field declaredField2;
        if (d.a()) {
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

    public static boolean f(Class cls) {
        if (!d.a()) {
            return false;
        }
        try {
            Class cls2 = f10810b;
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

    public static byte g(byte[] bArr, long j) {
        return f10811c.d(f10814f + j, bArr);
    }

    public static byte h(long j, Object obj) {
        return (byte) ((f10811c.g((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static byte i(long j, Object obj) {
        return (byte) ((f10811c.g((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new y0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void k(Object obj, long j, byte b10) {
        long j5 = (-4) & j;
        int iG = f10811c.g(j5, obj);
        int i7 = ((~((int) j)) & 3) << 3;
        m(((255 & b10) << i7) | (iG & (~(255 << i7))), j5, obj);
    }

    public static void l(Object obj, long j, byte b10) {
        long j5 = (-4) & j;
        int i7 = (((int) j) & 3) << 3;
        m(((255 & b10) << i7) | (f10811c.g(j5, obj) & (~(255 << i7))), j5, obj);
    }

    public static void m(int i7, long j, Object obj) {
        f10811c.n(i7, j, obj);
    }

    public static void n(Object obj, long j, long j5) {
        f10811c.o(obj, j, j5);
    }

    public static void o(long j, Object obj, Object obj2) {
        f10811c.p(j, obj, obj2);
    }
}
