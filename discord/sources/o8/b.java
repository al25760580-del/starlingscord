package o8;

import a3.e;
import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f17172b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17173a;

    static {
        b bVar = new b();
        bVar.f17173a = 5;
        f17172b = bVar;
    }

    public static void a(int i7, String str, String str2) {
        Log.println(i7, "unknown:" + str, str2);
    }

    public static void b(int i7, String str, String str2, Throwable th2) {
        String strL = e.l("unknown:", str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append('\n');
        sb2.append(th2 == null ? "" : Log.getStackTraceString(th2));
        Log.println(i7, strL, sb2.toString());
    }

    @Override // o8.c
    public final void d(String str, String str2) {
        a(3, str, str2);
    }

    @Override // o8.c
    public final void e(String str, String str2) {
        a(6, str, str2);
    }

    @Override // o8.c
    public final void i(String str, String str2) {
        a(4, str, str2);
    }

    @Override // o8.c
    public final boolean isLoggable(int i7) {
        return this.f17173a <= i7;
    }

    @Override // o8.c
    public final void v(String str, String str2) {
        a(2, str, str2);
    }

    @Override // o8.c
    public final void w(String str, String str2) {
        a(5, str, str2);
    }

    @Override // o8.c
    public final void wtf(String str, String str2) {
        a(6, str, str2);
    }

    @Override // o8.c
    public final void d(String str, String str2, Throwable th2) {
        b(3, str, str2, th2);
    }

    @Override // o8.c
    public final void e(String str, String str2, Throwable th2) {
        b(6, str, str2, th2);
    }

    @Override // o8.c
    public final void w(String str, String str2, Throwable th2) {
        b(5, str, str2, th2);
    }

    @Override // o8.c
    public final void wtf(String str, String str2, Throwable th2) {
        b(6, str, "unhandled exception", th2);
    }
}
