package sh;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static com.google.firebase.messaging.r f20102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i8.c f20103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final kh.f f20104c;

    static {
        int i7 = 16;
        f20103b = new i8.c(i7);
        f20104c = new kh.f(i7);
    }

    public static int a(byte[] bArr, int i7) {
        return ((bArr[i7 + 1] & 255) << 8) | (bArr[i7] & 255);
    }

    public static synchronized com.google.firebase.messaging.r b(Context context) {
        try {
            if (f20102a == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                u1 u1Var = new u1();
                u1Var.f20202a = context;
                f20102a = new com.google.firebase.messaging.r(u1Var);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f20102a;
    }

    public static boolean c(int i7) {
        return i7 == 2 || i7 == 7 || i7 == 3;
    }

    public static boolean d(int i7, int i10) {
        if (i7 == 5) {
            if (i10 != 5) {
                return true;
            }
            i7 = 5;
        }
        if (i7 == 6) {
            if (i10 != 6 && i10 != 5) {
                return true;
            }
            i7 = 6;
        }
        if (i7 == 4 && i10 != 4) {
            return true;
        }
        if (i7 == 3 && (i10 == 2 || i10 == 7 || i10 == 1 || i10 == 8)) {
            return true;
        }
        if (i7 == 2) {
            return i10 == 1 || i10 == 8;
        }
        return false;
    }
}
