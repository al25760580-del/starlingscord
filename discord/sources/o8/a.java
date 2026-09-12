package o8;

import com.facebook.react.common.ReactConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f17171a = b.f17172b;

    public static void a(Object obj, String str, String str2) {
        if (f17171a.isLoggable(3)) {
            f17171a.d(str, String.format(null, str2, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f17171a.isLoggable(3)) {
            f17171a.d(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj, Object obj2) {
        if (f17171a.isLoggable(3)) {
            f17171a.d(str, String.format(null, str2, obj, obj2));
        }
    }

    public static void d(Class cls, String str) {
        if (f17171a.isLoggable(6)) {
            f17171a.e(cls.getSimpleName(), str);
        }
    }

    public static void e(Class cls, String str, Throwable th2) {
        if (f17171a.isLoggable(6)) {
            f17171a.e(cls.getSimpleName(), str, th2);
        }
    }

    public static void f(Class cls, String str, Object... objArr) {
        if (f17171a.isLoggable(6)) {
            f17171a.e(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void g(String str, String str2) {
        if (f17171a.isLoggable(6)) {
            f17171a.e(str, str2);
        }
    }

    public static void h(String str, String str2, Throwable th2) {
        if (f17171a.isLoggable(6)) {
            f17171a.e(str, str2, th2);
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        if (f17171a.isLoggable(6)) {
            f17171a.e(str, String.format(null, str2, objArr));
        }
    }

    public static void j(String str, Throwable th2, String str2, Object... objArr) {
        if (f17171a.isLoggable(6)) {
            f17171a.e(str, String.format(null, str2, objArr), th2);
        }
    }

    public static void k(String str, String str2) {
        if (f17171a.isLoggable(4)) {
            f17171a.i(str, str2);
        }
    }

    public static void l(String str, String str2, Integer num, Integer num2) {
        if (f17171a.isLoggable(4)) {
            f17171a.i(str, String.format(null, str2, num, num2));
        }
    }

    public static void m(String str, String str2, Integer num, Integer num2, Integer num3) {
        if (f17171a.isLoggable(4)) {
            f17171a.i(str, String.format(null, str2, num, num2, num3));
        }
    }

    public static void n(String str, String str2, Object... objArr) {
        if (f17171a.isLoggable(4)) {
            f17171a.i(str, String.format(null, str2, objArr));
        }
    }

    public static void o(Class cls, String str, Object obj, Object obj2) {
        if (f17171a.isLoggable(2)) {
            f17171a.v(cls.getSimpleName(), String.format(null, str, obj, obj2));
        }
    }

    public static void p(Class cls, String str, Object obj, Object obj2, Object obj3) {
        if (f17171a.isLoggable(2)) {
            String str2 = String.format(null, str, obj, obj2, obj3);
            if (f17171a.isLoggable(2)) {
                f17171a.v(cls.getSimpleName(), str2);
            }
        }
    }

    public static void q(String str, Object obj, Class cls) {
        if (f17171a.isLoggable(2)) {
            f17171a.v(cls.getSimpleName(), String.format(null, str, obj));
        }
    }

    public static void r(Class cls, String str) {
        if (f17171a.isLoggable(5)) {
            f17171a.w(cls.getSimpleName(), str);
        }
    }

    public static void s(Class cls, String str, Exception exc) {
        if (f17171a.isLoggable(5)) {
            f17171a.w(cls.getSimpleName(), str, exc);
        }
    }

    public static void t(Class cls, String str, Object... objArr) {
        if (f17171a.isLoggable(5)) {
            f17171a.w(cls.getSimpleName(), String.format(null, str, objArr));
        }
    }

    public static void u(Exception exc, String str, Object... objArr) {
        if (f17171a.isLoggable(5)) {
            s(ga.b.class, String.format(null, str, objArr), exc);
        }
    }

    public static void v(String str, String str2) {
        if (f17171a.isLoggable(5)) {
            f17171a.w(str, str2);
        }
    }

    public static void w(String str, String str2, Exception exc) {
        if (f17171a.isLoggable(5)) {
            f17171a.w(str, str2, exc);
        }
    }

    public static void x(String str, String str2, Object... objArr) {
        if (f17171a.isLoggable(5)) {
            f17171a.w(str, String.format(null, str2, objArr));
        }
    }

    public static void y(Throwable th2, String str, Object... objArr) {
        if (f17171a.isLoggable(5)) {
            f17171a.w(ReactConstants.TAG, String.format(null, str, objArr), th2);
        }
    }

    public static void z(String str, String str2, Object... objArr) {
        if (f17171a.isLoggable(6)) {
            f17171a.wtf(str, String.format(null, str2, objArr));
        }
    }
}
