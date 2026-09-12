package v3;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f21417b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile q f21418c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21419a;

    public q(int i7) {
        this.f21419a = i7;
    }

    public static q d() {
        q qVar;
        synchronized (f21417b) {
            try {
                if (f21418c == null) {
                    f21418c = new q(3);
                }
                qVar = f21418c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f21419a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f21419a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th2) {
        if (this.f21419a <= 6) {
            Log.e(str, str2, th2);
        }
    }

    public final void e(String str, String str2) {
        if (this.f21419a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f21419a <= 5) {
            Log.w(str, str2);
        }
    }
}
